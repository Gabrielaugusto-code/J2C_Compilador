/*
 * Decompiled with CFR 0.152.
 */
public class ou {
    private transient ov[] a = new ov[16];
    private transient int b;
    private int c = 12;
    private final float d;
    private volatile transient int e;

    public ou() {
        this.d = 0.75f;
    }

    private static int g(long l2) {
        return ou.a((int)(l2 ^ l2 >>> 32));
    }

    private static int a(int n2) {
        n2 ^= n2 >>> 20 ^ n2 >>> 12;
        return n2 ^ n2 >>> 7 ^ n2 >>> 4;
    }

    private static int a(int n2, int n3) {
        return n2 & n3 - 1;
    }

    public int a() {
        return this.b;
    }

    public Object a(long l2) {
        int n2 = ou.g(l2);
        ov ov2 = this.a[ou.a(n2, this.a.length)];
        while (ov2 != null) {
            if (ov2.a == l2) {
                return ov2.b;
            }
            ov2 = ov2.c;
        }
        return null;
    }

    public boolean b(long l2) {
        return this.c(l2) != null;
    }

    final ov c(long l2) {
        int n2 = ou.g(l2);
        ov ov2 = this.a[ou.a(n2, this.a.length)];
        while (ov2 != null) {
            if (ov2.a == l2) {
                return ov2;
            }
            ov2 = ov2.c;
        }
        return null;
    }

    public void a(long l2, Object object) {
        int n2 = ou.g(l2);
        int n3 = ou.a(n2, this.a.length);
        ov ov2 = this.a[n3];
        while (ov2 != null) {
            if (ov2.a == l2) {
                ov2.b = object;
                return;
            }
            ov2 = ov2.c;
        }
        ++this.e;
        this.a(n2, l2, object, n3);
    }

    private void b(int n2) {
        ov[] ovArray = this.a;
        int n3 = ovArray.length;
        if (n3 == 0x40000000) {
            this.c = Integer.MAX_VALUE;
            return;
        }
        ov[] ovArray2 = new ov[n2];
        this.a(ovArray2);
        this.a = ovArray2;
        this.c = (int)((float)n2 * this.d);
    }

    private void a(ov[] ovArray) {
        ov[] ovArray2 = this.a;
        int n2 = ovArray.length;
        for (int i2 = 0; i2 < ovArray2.length; ++i2) {
            ov ov2;
            ov ov3 = ovArray2[i2];
            if (ov3 == null) continue;
            ovArray2[i2] = null;
            do {
                ov2 = ov3.c;
                int n3 = ou.a(ov3.d, n2);
                ov3.c = ovArray[n3];
                ovArray[n3] = ov3;
            } while ((ov3 = ov2) != null);
        }
    }

    public Object d(long l2) {
        ov ov2 = this.e(l2);
        return ov2 == null ? null : ov2.b;
    }

    final ov e(long l2) {
        ov ov2;
        int n2 = ou.g(l2);
        int n3 = ou.a(n2, this.a.length);
        ov ov3 = ov2 = this.a[n3];
        while (ov3 != null) {
            ov ov4 = ov3.c;
            if (ov3.a == l2) {
                ++this.e;
                --this.b;
                if (ov2 == ov3) {
                    this.a[n3] = ov4;
                } else {
                    ov2.c = ov4;
                }
                return ov3;
            }
            ov2 = ov3;
            ov3 = ov4;
        }
        return ov3;
    }

    private void a(int n2, long l2, Object object, int n3) {
        ov ov2 = this.a[n3];
        this.a[n3] = new ov(n2, l2, object, ov2);
        if (this.b++ >= this.c) {
            this.b(2 * this.a.length);
        }
    }

    static /* synthetic */ int f(long l2) {
        return ou.g(l2);
    }
}

