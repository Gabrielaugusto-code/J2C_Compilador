/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class apl
implements aol {
    private afs a;
    private Random b;
    private final ahz[] c = new ahz[256];
    private final byte[] d = new byte[256];
    private final arj e;
    private final List f = new ArrayList();
    private final boolean g;
    private final boolean h;
    private aqo i;
    private aqo j;

    public apl(afs afs2, long l2, boolean bl2, String string) {
        this.a = afs2;
        this.b = new Random(l2);
        this.e = arj.a(string);
        if (bl2) {
            Map map = this.e.b();
            if (map.containsKey("village")) {
                Object object = (Map)map.get("village");
                if (!object.containsKey("size")) {
                    object.put("size", "1");
                }
                this.f.add(new aud((Map)object));
            }
            if (map.containsKey("biome_1")) {
                this.f.add(new aso((Map)map.get("biome_1")));
            }
            if (map.containsKey("mineshaft")) {
                this.f.add(new arn((Map)map.get("mineshaft")));
            }
            if (map.containsKey("stronghold")) {
                this.f.add(new asx((Map)map.get("stronghold")));
            }
        }
        this.g = this.e.b().containsKey("decoration");
        if (this.e.b().containsKey("lake")) {
            this.i = new aqo(aie.j);
        }
        if (this.e.b().containsKey("lava_lake")) {
            this.j = new aqo(aie.l);
        }
        this.h = this.e.b().containsKey("dungeon");
        for (Object object : this.e.c()) {
            for (int i2 = ((ark)object).d(); i2 < ((ark)object).d() + ((ark)object).a(); ++i2) {
                this.c[i2] = ((ark)object).b();
                this.d[i2] = (byte)((ark)object).c();
            }
        }
    }

    @Override
    public aoo c(int n2, int n3) {
        return this.d(n2, n3);
    }

    @Override
    public aoo d(int n2, int n3) {
        int n4;
        Object object;
        aoo aoo2 = new aoo(this.a, n2, n3);
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            object = this.c[i2];
            if (object == null) continue;
            n4 = i2 >> 4;
            Object object2 = aoo2.i()[n4];
            if (object2 == null) {
                object2 = new aoq(i2, !this.a.t.g);
                aoo2.i()[n4] = object2;
            }
            for (int i3 = 0; i3 < 16; ++i3) {
                for (int i4 = 0; i4 < 16; ++i4) {
                    ((aoq)object2).a(i3, i2 & 0xF, i4, (ahz)object);
                    ((aoq)object2).a(i3, i2 & 0xF, i4, this.d[i2]);
                }
            }
        }
        aoo2.b();
        agl[] aglArray = this.a.v().b(null, n2 * 16, n3 * 16, 16, 16);
        object = aoo2.m();
        for (n4 = 0; n4 < ((Object)object).length; ++n4) {
            object[n4] = (byte)aglArray[n4].ay;
        }
        for (Object object2 : this.f) {
            ((apo)object2).a(this, this.a, n2, n3, null);
        }
        aoo2.b();
        return aoo2;
    }

    @Override
    public boolean a(int n2, int n3) {
        return true;
    }

    @Override
    public void a(aol aol2, int n2, int n3) {
        int n4;
        int n5 = n2 * 16;
        int n6 = n3 * 16;
        agl agl2 = this.a.a(n5 + 16, n6 + 16);
        boolean bl2 = false;
        this.b.setSeed(this.a.H());
        long l2 = this.b.nextLong() / 2L * 2L + 1L;
        long l3 = this.b.nextLong() / 2L * 2L + 1L;
        this.b.setSeed((long)n2 * l2 + (long)n3 * l3 ^ this.a.H());
        for (atu atu2 : this.f) {
            n4 = atu2.a(this.a, this.b, n2, n3);
            if (!(atu2 instanceof aud)) continue;
            bl2 |= n4;
        }
        if (this.i != null && !bl2 && this.b.nextInt(4) == 0) {
            int n7 = n5 + this.b.nextInt(16) + 8;
            int n8 = this.b.nextInt(256);
            n4 = n6 + this.b.nextInt(16) + 8;
            this.i.a(this.a, this.b, n7, n8, n4);
        }
        if (this.j != null && !bl2 && this.b.nextInt(8) == 0) {
            int n9 = n5 + this.b.nextInt(16) + 8;
            int n10 = this.b.nextInt(this.b.nextInt(248) + 8);
            n4 = n6 + this.b.nextInt(16) + 8;
            if (n10 < 63 || this.b.nextInt(10) == 0) {
                this.j.a(this.a, this.b, n9, n10, n4);
            }
        }
        if (this.h) {
            for (int i2 = 0; i2 < 8; ++i2) {
                int n11 = n5 + this.b.nextInt(16) + 8;
                n4 = this.b.nextInt(256);
                int n12 = n6 + this.b.nextInt(16) + 8;
                new aqu().a(this.a, this.b, n11, n4, n12);
            }
        }
        if (this.g) {
            agl2.a(this.a, this.b, n5, n6);
        }
    }

    @Override
    public boolean a(boolean bl2, pb pb2) {
        return true;
    }

    @Override
    public void b() {
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public String e() {
        return "FlatLevelSource";
    }

    @Override
    public List a(ro ro2, int n2, int n3, int n4) {
        agl agl2 = this.a.a(n2, n4);
        return agl2.a(ro2);
    }

    @Override
    public afk a(afs afs2, String string, int n2, int n3, int n4) {
        if ("Stronghold".equals(string)) {
            for (atu atu2 : this.f) {
                if (!(atu2 instanceof asx)) continue;
                return atu2.a(afs2, n2, n3, n4);
            }
        }
        return null;
    }

    @Override
    public int f() {
        return 0;
    }

    @Override
    public void e(int n2, int n3) {
        for (atu atu2 : this.f) {
            atu2.a(this, this.a, n2, n3, null);
        }
    }
}

