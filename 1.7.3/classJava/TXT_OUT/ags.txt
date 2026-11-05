/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ags {
    private awe c;
    private awe d;
    private agp e = new agp(this);
    private List f = new ArrayList();

    protected ags() {
        this.f.add(agl.s);
        this.f.add(agl.p);
        this.f.add(agl.t);
        this.f.add(agl.H);
        this.f.add(agl.G);
        this.f.add(agl.J);
        this.f.add(agl.K);
    }

    public ags(long l2, agd agd2) {
        this();
        awe[] aweArray = awe.a(l2, agd2);
        this.c = aweArray[0];
        this.d = aweArray[1];
    }

    public ags(afs afs2) {
        this(afs2.H(), afs2.N().u());
    }

    public List a() {
        return this.f;
    }

    public agl a(int n2, int n3) {
        return this.e.b(n2, n3);
    }

    public float[] a(float[] fArray, int n2, int n3, int n4, int n5) {
        awc.a();
        if (fArray == null || fArray.length < n4 * n5) {
            fArray = new float[n4 * n5];
        }
        int[] nArray = this.d.a(n2, n3, n4, n5);
        for (int i2 = 0; i2 < n4 * n5; ++i2) {
            try {
                float f2 = (float)agl.d(nArray[i2]).h() / 65536.0f;
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                fArray[i2] = f2;
                continue;
            }
            catch (Throwable throwable) {
                b b2 = b.a(throwable, "Invalid Biome id");
                k k2 = b2.a("DownfallBlock");
                k2.a("biome id", i2);
                k2.a("downfalls[] size", fArray.length);
                k2.a("x", n2);
                k2.a("z", n3);
                k2.a("w", n4);
                k2.a("h", n5);
                throw new s(b2);
            }
        }
        return fArray;
    }

    public float a(float f2, int n2) {
        return f2;
    }

    public agl[] a(agl[] aglArray, int n2, int n3, int n4, int n5) {
        awc.a();
        if (aglArray == null || aglArray.length < n4 * n5) {
            aglArray = new agl[n4 * n5];
        }
        int[] nArray = this.c.a(n2, n3, n4, n5);
        try {
            for (int i2 = 0; i2 < n4 * n5; ++i2) {
                aglArray[i2] = agl.d(nArray[i2]);
            }
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Invalid Biome id");
            k k2 = b2.a("RawBiomeBlock");
            k2.a("biomes[] size", aglArray.length);
            k2.a("x", n2);
            k2.a("z", n3);
            k2.a("w", n4);
            k2.a("h", n5);
            throw new s(b2);
        }
        return aglArray;
    }

    public agl[] b(agl[] aglArray, int n2, int n3, int n4, int n5) {
        return this.a(aglArray, n2, n3, n4, n5, true);
    }

    public agl[] a(agl[] aglArray, int n2, int n3, int n4, int n5, boolean bl2) {
        awc.a();
        if (aglArray == null || aglArray.length < n4 * n5) {
            aglArray = new agl[n4 * n5];
        }
        if (bl2 && n4 == 16 && n5 == 16 && (n2 & 0xF) == 0 && (n3 & 0xF) == 0) {
            agl[] aglArray2 = this.e.d(n2, n3);
            System.arraycopy(aglArray2, 0, aglArray, 0, n4 * n5);
            return aglArray;
        }
        int[] nArray = this.d.a(n2, n3, n4, n5);
        for (int i2 = 0; i2 < n4 * n5; ++i2) {
            aglArray[i2] = agl.d(nArray[i2]);
        }
        return aglArray;
    }

    public boolean a(int n2, int n3, int n4, List list) {
        awc.a();
        int n5 = n2 - n4 >> 2;
        int n6 = n3 - n4 >> 2;
        int n7 = n2 + n4 >> 2;
        int n8 = n3 + n4 >> 2;
        int n9 = n7 - n5 + 1;
        int n10 = n8 - n6 + 1;
        int[] nArray = this.c.a(n5, n6, n9, n10);
        try {
            for (int i2 = 0; i2 < n9 * n10; ++i2) {
                agl agl2 = agl.d(nArray[i2]);
                if (list.contains(agl2)) continue;
                return false;
            }
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Invalid Biome id");
            k k2 = b2.a("Layer");
            k2.a("Layer", this.c.toString());
            k2.a("x", n2);
            k2.a("z", n3);
            k2.a("radius", n4);
            k2.a("allowed", list);
            throw new s(b2);
        }
        return true;
    }

    public afk a(int n2, int n3, int n4, List list, Random random) {
        awc.a();
        int n5 = n2 - n4 >> 2;
        int n6 = n3 - n4 >> 2;
        int n7 = n2 + n4 >> 2;
        int n8 = n3 + n4 >> 2;
        int n9 = n7 - n5 + 1;
        int n10 = n8 - n6 + 1;
        int[] nArray = this.c.a(n5, n6, n9, n10);
        afk afk2 = null;
        int n11 = 0;
        for (int i2 = 0; i2 < n9 * n10; ++i2) {
            int n12 = n5 + i2 % n9 << 2;
            int n13 = n6 + i2 / n9 << 2;
            agl agl2 = agl.d(nArray[i2]);
            if (!list.contains(agl2) || afk2 != null && random.nextInt(n11 + 1) != 0) continue;
            afk2 = new afk(n12, 0, n13);
            ++n11;
        }
        return afk2;
    }

    public void b() {
        this.e.a();
    }
}

