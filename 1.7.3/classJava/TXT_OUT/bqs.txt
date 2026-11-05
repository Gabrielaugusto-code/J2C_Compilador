/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bqs
extends bqi
implements brd,
px {
    private static final Logger d = LogManager.getLogger();
    public static final brq b = new brq("textures/atlas/blocks.png");
    public static final brq c = new brq("textures/atlas/items.png");
    private final List e = Lists.newArrayList();
    private final Map f = Maps.newHashMap();
    private final Map g = Maps.newHashMap();
    private final int h;
    private final String i;
    private int j;
    private int k = 1;
    private final bqw l = new bqw("missingno");

    public bqs(int n2, String string) {
        this.h = n2;
        this.i = string;
        this.g();
    }

    private void f() {
        int[] nArray;
        if ((float)this.k > 1.0f) {
            int n2 = 16;
            int n3 = 32;
            int n4 = 32;
            this.l.b(32);
            this.l.c(32);
            nArray = new int[1024];
            System.arraycopy(brb.b, 0, nArray, 0, brb.b.length);
            brb.a(nArray, 16, 16, 8);
        } else {
            nArray = brb.b;
            this.l.b(16);
            this.l.c(16);
        }
        int[][] nArrayArray = new int[this.j + 1][];
        nArrayArray[0] = nArray;
        this.l.a(Lists.newArrayList((Object[])new int[][][]{nArrayArray}));
    }

    @Override
    public void a(brr brr2) {
        this.f();
        this.c();
        this.b(brr2);
    }

    public void b(brr brr2) {
        Object object;
        Object object2;
        Object iOException;
        Object object3;
        int n2 = azi.D();
        bqo bqo2 = new bqo(n2, n2, true, 0, this.j);
        this.g.clear();
        this.e.clear();
        int n3 = Integer.MAX_VALUE;
        for (Map.Entry object52 : this.f.entrySet()) {
            Iterator<Object> iterator = new brq((String)object52.getKey());
            bqw bqw2 = (bqw)object52.getValue();
            object3 = this.a((brq)((Object)iterator), 0);
            try {
                Object object4;
                iOException = brr2.a((brq)object3);
                object2 = new BufferedImage[1 + this.j];
                object2[0] = ImageIO.read(iOException.b());
                object = (bsv)iOException.a("texture");
                if (object != null) {
                    int n4;
                    object4 = ((bsv)object).c();
                    if (!object4.isEmpty()) {
                        int n5 = object2[0].getWidth();
                        n4 = object2[0].getHeight();
                        if (oy.b(n5) != n5 || oy.b(n4) != n4) {
                            throw new RuntimeException("Unable to load extra miplevels, source-texture is not power of two");
                        }
                    }
                    Iterator iterator2 = object4.iterator();
                    while (iterator2.hasNext()) {
                        n4 = (Integer)iterator2.next();
                        if (n4 <= 0 || n4 >= ((BufferedImage[])object2).length - 1 || object2[n4] != null) continue;
                        brq brq2 = this.a((brq)((Object)iterator), n4);
                        try {
                            object2[n4] = ImageIO.read(brr2.a(brq2).b());
                        }
                        catch (IOException iOException2) {
                            d.error("Unable to load miplevel {} from: {}", new Object[]{n4, brq2, iOException2});
                        }
                    }
                }
                object4 = (bsn)iOException.a("animation");
                bqw2.a((BufferedImage[])object2, (bsn)object4, (float)this.k > 1.0f);
            }
            catch (RuntimeException throwable) {
                d.error("Unable to parse metadata from " + object3, (Throwable)throwable);
                continue;
            }
            catch (IOException iOException3) {
                d.error("Using missing texture, unable to load " + object3, (Throwable)iOException3);
                continue;
            }
            n3 = Math.min(n3, Math.min(bqw2.a(), bqw2.b()));
            bqo2.a(bqw2);
        }
        int n6 = oy.c(n3);
        if (n6 < this.j) {
            d.debug("{}: dropping miplevel from {} to {}, because of minTexel: {}", new Object[]{this.i, this.j, n6, n3});
            this.j = n6;
        }
        for (Iterator<Object> iterator : this.f.values()) {
            try {
                ((bqw)((Object)iterator)).d(this.j);
            }
            catch (Throwable throwable) {
                object3 = b.a(throwable, "Applying mipmap");
                iOException = ((b)object3).a("Sprite being mipmapped");
                ((k)iOException).a("Sprite name", new bqt(this, (bqw)((Object)iterator)));
                ((k)iOException).a("Sprite size", new bqu(this, (bqw)((Object)iterator)));
                ((k)iOException).a("Sprite frames", new bqv(this, (bqw)((Object)iterator)));
                ((k)iOException).a("Mipmap levels", this.j);
                throw new s((b)object3);
            }
        }
        this.l.d(this.j);
        bqo2.a(this.l);
        bqo2.c();
        d.info("Created: {}x{} {}-atlas", new Object[]{bqo2.a(), bqo2.b(), this.i});
        brb.a(this.b(), this.j, bqo2.a(), bqo2.b(), (float)this.k);
        HashMap hashMap = Maps.newHashMap((Map)this.f);
        for (bqw bqw2 : bqo2.d()) {
            object3 = bqw2.g();
            hashMap.remove(object3);
            this.g.put(object3, bqw2);
            try {
                brb.a(bqw2.a(0), bqw2.a(), bqw2.b(), bqw2.h(), bqw2.i(), false, false);
            }
            catch (Throwable throwable) {
                object2 = b.a(throwable, "Stitching texture atlas");
                object = ((b)object2).a("Texture being stitched together");
                ((k)object).a("Atlas path", this.i);
                ((k)object).a("Sprite", bqw2);
                throw new s((b)object2);
            }
            if (bqw2.m()) {
                this.e.add(bqw2);
                continue;
            }
            bqw2.l();
        }
        for (bqw bqw2 : hashMap.values()) {
            bqw2.a(this.l);
        }
    }

    private brq a(brq brq2, int n2) {
        if (n2 == 0) {
            return new brq(brq2.b(), String.format("%s/%s%s", this.i, brq2.a(), ".png"));
        }
        return new brq(brq2.b(), String.format("%s/mipmaps/%s.%d%s", this.i, brq2.a(), n2, ".png"));
    }

    private void g() {
        this.f.clear();
        if (this.h == 0) {
            for (Object object : ahz.c) {
                if (((ahz)object).o() == avk.a) continue;
                ((ahz)object).a(this);
            }
            azi.B().g.a(this);
            bog.a.a(this);
        }
        for (Object object : abs.e) {
            if (object == null || ((abs)object).d() != this.h) continue;
            ((abs)object).a(this);
        }
    }

    public bqw b(String string) {
        bqw bqw2 = (bqw)this.g.get(string);
        if (bqw2 == null) {
            bqw2 = this.l;
        }
        return bqw2;
    }

    public void d() {
        brb.b(this.b());
        for (bqw bqw2 : this.e) {
            bqw2.j();
        }
    }

    @Override
    public pw a(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        }
        if (string.indexOf(47) != -1 || string.indexOf(92) != -1) {
            throw new IllegalArgumentException("Name cannot contain slashes!");
        }
        bqw bqw2 = (bqw)this.f.get(string);
        if (bqw2 == null) {
            bqw2 = this.h == 1 ? ("clock".equals(string) ? new bre(string) : ("compass".equals(string) ? new brf(string) : new bqw(string))) : new bqw(string);
            this.f.put(string, bqw2);
        }
        return bqw2;
    }

    public int a() {
        return this.h;
    }

    @Override
    public void e() {
        this.d();
    }

    public void a(int n2) {
        this.j = n2;
    }

    public void b(int n2) {
        this.k = n2;
    }
}

