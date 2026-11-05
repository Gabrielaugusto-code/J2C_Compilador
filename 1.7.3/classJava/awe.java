/*
 * Decompiled with CFR 0.152.
 */
public abstract class awe {
    private long c;
    protected awe a;
    private long d;
    protected long b;

    public static awe[] a(long l2, agd agd2) {
        boolean bl2 = false;
        awe awe2 = new awd(1L);
        awe2 = new awa(2000L, awe2);
        awe2 = new avs(1L, awe2);
        awe2 = new awt(2001L, awe2);
        awe2 = new avs(2L, awe2);
        awe2 = new avs(50L, awe2);
        awe2 = new avs(70L, awe2);
        awe2 = new awj(2L, awe2);
        awe2 = new avu(2L, awe2);
        awe2 = new avs(3L, awe2);
        awe2 = new avp(2L, awe2, avr.a);
        awe2 = new avp(2L, awe2, avr.b);
        awe2 = new avp(3L, awe2, avr.c);
        awe2 = new awt(2002L, awe2);
        awe2 = new awt(2003L, awe2);
        awe2 = new avs(4L, awe2);
        awe2 = new avt(5L, awe2);
        awe2 = new avo(4L, awe2);
        awe2 = awt.b(1000L, awe2, 0);
        int n2 = 4;
        if (agd2 == agd.d) {
            n2 = 6;
        }
        if (bl2) {
            n2 = 4;
        }
        awe awe3 = awe2;
        awe3 = awt.b(1000L, awe3, 0);
        awe3 = new awk(100L, awe3);
        awe awe4 = awe2;
        awe4 = new avw(200L, awe4, agd2);
        if (!bl2) {
            awe4 = awt.b(1000L, awe4, 2);
            awe4 = new avv(1000L, awe4);
        }
        awe awe5 = awe3;
        awe5 = awt.b(1000L, awe5, 2);
        awe4 = new awi(1000L, awe4, awe5);
        awe3 = awt.b(1000L, awe3, 2);
        awe3 = awt.b(1000L, awe3, n2);
        awe3 = new awl(1L, awe3);
        awe3 = new awo(1000L, awe3);
        awe4 = new awh(1001L, awe4);
        for (int i2 = 0; i2 < n2; ++i2) {
            awe4 = new awt(1000 + i2, awe4);
            if (i2 == 0) {
                awe4 = new avs(3L, awe4);
            }
            if (i2 != 1) continue;
            awe4 = new awn(1000L, awe4);
        }
        awe4 = new awo(1000L, awe4);
        awe4 = new awm(100L, awe4, awe3);
        awe awe6 = awe4;
        aws aws2 = new aws(10L, awe4);
        awe4.a(l2);
        aws2.a(l2);
        return new awe[]{awe4, aws2, awe6};
    }

    public awe(long l2) {
        this.b = l2;
        this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
        this.b += l2;
        this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
        this.b += l2;
        this.b *= this.b * 6364136223846793005L + 1442695040888963407L;
        this.b += l2;
    }

    public void a(long l2) {
        this.c = l2;
        if (this.a != null) {
            this.a.a(l2);
        }
        this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
        this.c += this.b;
        this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
        this.c += this.b;
        this.c *= this.c * 6364136223846793005L + 1442695040888963407L;
        this.c += this.b;
    }

    public void a(long l2, long l3) {
        this.d = this.c;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += l2;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += l3;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += l2;
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += l3;
    }

    protected int a(int n2) {
        int n3 = (int)((this.d >> 24) % (long)n2);
        if (n3 < 0) {
            n3 += n2;
        }
        this.d *= this.d * 6364136223846793005L + 1442695040888963407L;
        this.d += this.c;
        return n3;
    }

    public abstract int[] a(int var1, int var2, int var3, int var4);

    protected static boolean a(int n2, int n3) {
        if (n2 == n3) {
            return true;
        }
        if (n2 == agl.aa.ay || n2 == agl.ab.ay) {
            return n3 == agl.aa.ay || n3 == agl.ab.ay;
        }
        try {
            if (agl.d(n2) != null && agl.d(n3) != null) {
                return agl.d(n2).a(agl.d(n3));
            }
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Comparing biomes");
            k k2 = b2.a("Biomes being compared");
            k2.a("Biome A ID", n2);
            k2.a("Biome B ID", n3);
            k2.a("Biome A", new awf(n2));
            k2.a("Biome B", new awg(n3));
            throw new s(b2);
        }
        return false;
    }

    protected static boolean b(int n2) {
        return n2 == agl.o.ay || n2 == agl.M.ay || n2 == agl.y.ay;
    }

    protected int a(int ... nArray) {
        return nArray[this.a(nArray.length)];
    }

    protected int b(int n2, int n3, int n4, int n5) {
        if (n3 == n4 && n4 == n5) {
            return n3;
        }
        if (n2 == n3 && n2 == n4) {
            return n2;
        }
        if (n2 == n3 && n2 == n5) {
            return n2;
        }
        if (n2 == n4 && n2 == n5) {
            return n2;
        }
        if (n2 == n3 && n4 != n5) {
            return n2;
        }
        if (n2 == n4 && n3 != n5) {
            return n2;
        }
        if (n2 == n5 && n3 != n4) {
            return n2;
        }
        if (n3 == n4 && n2 != n5) {
            return n3;
        }
        if (n3 == n5 && n2 != n4) {
            return n3;
        }
        if (n4 == n5 && n2 != n3) {
            return n4;
        }
        return this.a(new int[]{n2, n3, n4, n5});
    }
}

