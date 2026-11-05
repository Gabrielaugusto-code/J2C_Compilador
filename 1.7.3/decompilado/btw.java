/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.SoundSystemException
 *  paulscode.sound.codecs.CodecJOrbis
 *  paulscode.sound.libraries.LibraryLWJGLOpenAL
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemException;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class btw {
    private static final Marker a = MarkerManager.getMarker((String)"SOUNDS");
    private static final Logger b = LogManager.getLogger();
    private final buc c;
    private final bac d;
    private bua e;
    private boolean f;
    private int g = 0;
    private final Map h = HashBiMap.create();
    private final Map i = ((BiMap)this.h).inverse();
    private Map j = Maps.newHashMap();
    private final Multimap k = HashMultimap.create();
    private final List l = Lists.newArrayList();
    private final Map m = Maps.newHashMap();
    private final Map n = Maps.newHashMap();

    public btw(buc buc2, bac bac2) {
        this.c = buc2;
        this.d = bac2;
        try {
            SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
            SoundSystemConfig.setCodec((String)"ogg", CodecJOrbis.class);
        }
        catch (SoundSystemException soundSystemException) {
            b.error(a, "Error linking with the LibraryJavaSound plug-in", (Throwable)soundSystemException);
        }
    }

    public void a() {
        this.b();
        this.i();
    }

    private synchronized void i() {
        if (this.f) {
            return;
        }
        try {
            new Thread((Runnable)new btx(this), "Sound Library Loader").start();
        }
        catch (RuntimeException runtimeException) {
            b.error(a, "Error starting SoundSystem. Turning off sounds & music", (Throwable)runtimeException);
            this.d.a(w.a, 0.0f);
            this.d.b();
        }
    }

    private float a(w w2) {
        if (w2 == null || w2 == w.a) {
            return 1.0f;
        }
        return this.d.a(w2);
    }

    public void a(w w2, float f2) {
        if (!this.f) {
            return;
        }
        if (w2 == w.a) {
            this.e.setMasterVolume(f2);
            return;
        }
        for (String string : this.k.get((Object)w2)) {
            btg btg2 = (btg)this.h.get(string);
            float f3 = this.a(btg2, (btv)this.j.get(btg2), w2);
            if (f3 <= 0.0f) {
                this.b(btg2);
                continue;
            }
            this.e.setVolume(string, f3);
        }
    }

    public void b() {
        if (this.f) {
            this.c();
            this.e.cleanup();
            this.f = false;
        }
    }

    public void c() {
        if (this.f) {
            for (String string : this.h.keySet()) {
                this.e.stop(string);
            }
            this.h.clear();
            this.m.clear();
            this.l.clear();
            this.k.clear();
            this.j.clear();
            this.n.clear();
        }
    }

    public void d() {
        btg btg2;
        Map.Entry entry;
        Iterator iterator2;
        ++this.g;
        for (Iterator iterator2 : this.l) {
            iterator2.a();
            if (iterator2.k()) {
                this.b((btg)((Object)iterator2));
                continue;
            }
            entry = (String)this.i.get(iterator2);
            this.e.setVolume((String)((Object)entry), this.a((btg)((Object)iterator2), (btv)this.j.get(iterator2), this.c.a(iterator2.b()).d()));
            this.e.setPitch((String)((Object)entry), this.a((btg)((Object)iterator2), (btv)this.j.get(iterator2)));
            this.e.setPosition((String)((Object)entry), iterator2.g(), iterator2.h(), iterator2.i());
        }
        Iterator<Object> iterator3 = this.h.entrySet().iterator();
        while (iterator3.hasNext()) {
            int n2;
            iterator2 = (Map.Entry)iterator3.next();
            entry = (String)iterator2.getKey();
            btg2 = (btg)iterator2.getValue();
            if (this.e.playing((String)((Object)entry)) || (n2 = ((Integer)this.n.get(entry)).intValue()) > this.g) continue;
            int n3 = btg2.d();
            if (btg2.c() && n3 > 0) {
                this.m.put(btg2, this.g + n3);
            }
            iterator3.remove();
            b.debug(a, "Removed channel {} because it's not playing anymore", new Object[]{entry});
            this.e.removeSource((String)((Object)entry));
            this.n.remove(entry);
            this.j.remove(btg2);
            try {
                this.k.remove((Object)this.c.a(btg2.b()).d(), (Object)entry);
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            if (!(btg2 instanceof bti)) continue;
            this.l.remove(btg2);
        }
        iterator2 = this.m.entrySet().iterator();
        while (iterator2.hasNext()) {
            entry = iterator2.next();
            if (this.g < (Integer)entry.getValue()) continue;
            btg2 = (btg)entry.getKey();
            if (btg2 instanceof bti) {
                ((bti)btg2).a();
            }
            this.c(btg2);
            iterator2.remove();
        }
    }

    public boolean a(btg btg2) {
        if (!this.f) {
            return false;
        }
        String string = (String)this.i.get(btg2);
        if (string == null) {
            return false;
        }
        return this.e.playing(string) || this.n.containsKey(string) && (Integer)this.n.get(string) <= this.g;
    }

    public void b(btg btg2) {
        if (!this.f) {
            return;
        }
        String string = (String)this.i.get(btg2);
        if (string != null) {
            this.e.stop(string);
        }
    }

    public void c(btg btg2) {
        if (!this.f) {
            return;
        }
        if (this.e.getMasterVolume() <= 0.0f) {
            b.debug(a, "Skipped playing soundEvent: {}, master volume was zero", new Object[]{btg2.b()});
            return;
        }
        bub bub2 = this.c.a(btg2.b());
        if (bub2 == null) {
            b.warn(a, "Unable to play unknown soundEvent: {}", new Object[]{btg2.b()});
            return;
        }
        btv btv2 = bub2.b();
        if (btv2 == buc.a) {
            b.warn(a, "Unable to play empty soundEvent: {}", new Object[]{bub2.c()});
            return;
        }
        float f2 = btg2.e();
        float f3 = 16.0f;
        if (f2 > 1.0f) {
            f3 *= f2;
        }
        w w2 = bub2.d();
        float f4 = this.a(btg2, btv2, w2);
        double d2 = this.a(btg2, btv2);
        brq brq2 = btv2.a();
        if (f4 == 0.0f) {
            b.debug(a, "Skipped playing sound {}, volume was zero.", new Object[]{brq2});
            return;
        }
        boolean bl2 = btg2.c() && btg2.d() == 0;
        String string = UUID.randomUUID().toString();
        if (btv2.d()) {
            this.e.newStreamingSource(false, string, btw.a(brq2), brq2.toString(), bl2, btg2.g(), btg2.h(), btg2.i(), btg2.j().a(), f3);
        } else {
            this.e.newSource(false, string, btw.a(brq2), brq2.toString(), bl2, btg2.g(), btg2.h(), btg2.i(), btg2.j().a(), f3);
        }
        b.debug(a, "Playing sound {} for event {} as channel {}", new Object[]{btv2.a(), bub2.c(), string});
        this.e.setPitch(string, (float)d2);
        this.e.setVolume(string, f4);
        this.e.play(string);
        this.n.put(string, this.g + 20);
        this.h.put(string, btg2);
        this.j.put(btg2, btv2);
        if (w2 != w.a) {
            this.k.put((Object)w2, (Object)string);
        }
        if (btg2 instanceof bti) {
            this.l.add((bti)btg2);
        }
    }

    private float a(btg btg2, btv btv2) {
        return (float)oy.a((double)btg2.f() * btv2.b(), 0.5, 2.0);
    }

    private float a(btg btg2, btv btv2, w w2) {
        return (float)oy.a((double)btg2.e() * btv2.c() * (double)this.a(w2), 0.0, 1.0);
    }

    public void e() {
        for (String string : this.h.keySet()) {
            b.debug(a, "Pausing channel {}", new Object[]{string});
            this.e.pause(string);
        }
    }

    public void f() {
        for (String string : this.h.keySet()) {
            b.debug(a, "Resuming channel {}", new Object[]{string});
            this.e.play(string);
        }
    }

    public void a(btg btg2, int n2) {
        this.m.put(btg2, this.g + n2);
    }

    private static URL a(brq brq2) {
        String string = String.format("%s:%s:%s", "mcsounddomain", brq2.b(), brq2.a());
        bty bty2 = new bty(brq2);
        try {
            return new URL(null, string, bty2);
        }
        catch (MalformedURLException malformedURLException) {
            throw new Error("TODO: Sanely handle url exception! :D");
        }
    }

    public void a(xq xq2, float f2) {
        if (!this.f || xq2 == null) {
            return;
        }
        float f3 = xq2.B + (xq2.z - xq2.B) * f2;
        float f4 = xq2.A + (xq2.y - xq2.A) * f2;
        double d2 = xq2.p + (xq2.s - xq2.p) * (double)f2;
        double d3 = xq2.q + (xq2.t - xq2.q) * (double)f2;
        double d4 = xq2.r + (xq2.u - xq2.r) * (double)f2;
        float f5 = oy.b((f4 + 90.0f) * ((float)Math.PI / 180));
        float f6 = oy.a((f4 + 90.0f) * ((float)Math.PI / 180));
        float f7 = oy.b(-f3 * ((float)Math.PI / 180));
        float f8 = oy.a(-f3 * ((float)Math.PI / 180));
        float f9 = oy.b((-f3 + 90.0f) * ((float)Math.PI / 180));
        float f10 = oy.a((-f3 + 90.0f) * ((float)Math.PI / 180));
        float f11 = f5 * f7;
        float f12 = f8;
        float f13 = f6 * f7;
        float f14 = f5 * f9;
        float f15 = f10;
        float f16 = f6 * f9;
        this.e.setListenerPosition((float)d2, (float)d3, (float)d4);
        this.e.setListenerOrientation(f11, f12, f13, f14, f15, f16);
    }

    static /* synthetic */ bua a(btw btw2, bua bua2) {
        btw2.e = bua2;
        return btw2.e;
    }

    static /* synthetic */ boolean a(btw btw2, boolean bl2) {
        btw2.f = bl2;
        return btw2.f;
    }

    static /* synthetic */ bac a(btw btw2) {
        return btw2.d;
    }

    static /* synthetic */ bua b(btw btw2) {
        return btw2.e;
    }

    static /* synthetic */ Marker g() {
        return a;
    }

    static /* synthetic */ Logger h() {
        return b;
    }
}

