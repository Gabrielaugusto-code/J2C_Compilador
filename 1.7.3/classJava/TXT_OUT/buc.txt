/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class buc
implements brs,
lk {
    private static final Logger b = LogManager.getLogger();
    private static final Gson c = new GsonBuilder().registerTypeAdapter(btc.class, (Object)new btf()).create();
    private static final ParameterizedType d = new bud();
    public static final btv a = new btv(new brq("meta:missing_sound"), 0.0, 0.0, false);
    private final bug e = new bug();
    private final btw f;
    private final brr g;

    public buc(brr brr2, bac bac2) {
        this.g = brr2;
        this.f = new btw(this, bac2);
    }

    @Override
    public void a(brr brr2) {
        this.f.a();
        this.e.c();
        for (String string : brr2.a()) {
            try {
                List list = brr2.b(new brq(string, "sounds.json"));
                for (int i2 = list.size() - 1; i2 >= 0; --i2) {
                    brp brp2 = (brp)list.get(i2);
                    try {
                        Map map = (Map)c.fromJson((Reader)new InputStreamReader(brp2.b()), (Type)d);
                        for (Map.Entry entry : map.entrySet()) {
                            this.a(new brq(string, (String)entry.getKey()), (btc)entry.getValue());
                        }
                        continue;
                    }
                    catch (RuntimeException runtimeException) {
                        b.warn("Invalid sounds.json", (Throwable)runtimeException);
                    }
                }
            }
            catch (IOException iOException) {
            }
        }
    }

    private void a(brq brq2, btc btc2) {
        bub bub2;
        if (!this.e.d(brq2) || btc2.b()) {
            bub2 = new bub(brq2, 1.0, 1.0, btc2.c());
            this.e.a(bub2);
        } else {
            bub2 = (bub)this.e.a(brq2);
        }
        block7: for (btd btd2 : btc2.a()) {
            buh buh2;
            String string = btd2.a();
            brq brq3 = new brq(string);
            String string2 = string.contains(":") ? brq3.b() : brq2.b();
            switch (btd2.e()) {
                case a: {
                    brq brq4 = new brq(string2, "sounds/" + brq3.a() + ".ogg");
                    try {
                        this.g.a(brq4);
                    }
                    catch (FileNotFoundException fileNotFoundException) {
                        b.warn("File {} does not exist, cannot add it to event {}", new Object[]{brq4, brq2});
                        continue block7;
                    }
                    catch (IOException iOException) {
                        b.warn("Could not load sound file " + brq4 + ", cannot add it to event " + brq2, (Throwable)iOException);
                        continue block7;
                    }
                    buh2 = new bui(new btv(brq4, btd2.c(), btd2.b(), btd2.f()), btd2.d());
                    break;
                }
                case b: {
                    buh2 = new bue(this, string2, btd2);
                    break;
                }
                default: {
                    throw new IllegalStateException("IN YOU FACE");
                }
            }
            bub2.a(buh2);
        }
    }

    public bub a(brq brq2) {
        return (bub)this.e.a(brq2);
    }

    public void a(btg btg2) {
        this.f.c(btg2);
    }

    public void a(btg btg2, int n2) {
        this.f.a(btg2, n2);
    }

    public void a(xq xq2, float f2) {
        this.f.a(xq2, f2);
    }

    public void b() {
        this.f.e();
    }

    public void c() {
        this.f.c();
    }

    public void d() {
        this.f.b();
    }

    @Override
    public void a() {
        this.f.d();
    }

    public void e() {
        this.f.f();
    }

    public void a(w w2, float f2) {
        if (w2 == w.a && f2 <= 0.0f) {
            this.c();
        }
        this.f.a(w2, f2);
    }

    public void b(btg btg2) {
        this.f.b(btg2);
    }

    public bub a(w ... wArray) {
        ArrayList arrayList = Lists.newArrayList();
        for (brq brq2 : this.e.b()) {
            bub bub2 = (bub)this.e.a(brq2);
            if (!ArrayUtils.contains((Object[])wArray, (Object)((Object)bub2.d()))) continue;
            arrayList.add(bub2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (bub)arrayList.get(new Random().nextInt(arrayList.size()));
    }

    public boolean c(btg btg2) {
        return this.f.a(btg2);
    }

    static /* synthetic */ bug a(buc buc2) {
        return buc2.e;
    }
}

