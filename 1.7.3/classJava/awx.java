/*
 * Decompiled with CFR 0.152.
 */
public class awx {
    private agc a;
    private awu b = new awu();
    private oq c = new oq();
    private awv[] d = new awv[32];
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;

    public awx(agc agc2, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.a = agc2;
        this.e = bl2;
        this.f = bl3;
        this.g = bl4;
        this.h = bl5;
    }

    public aww a(qr qr2, qr qr3, float f2) {
        return this.a(qr2, qr3.s, qr3.C.b, qr3.u, f2);
    }

    public aww a(qr qr2, int n2, int n3, int n4, float f2) {
        return this.a(qr2, (float)n2 + 0.5f, (float)n3 + 0.5f, (float)n4 + 0.5f, f2);
    }

    private aww a(qr qr2, double d2, double d3, double d4, float f2) {
        Object object;
        this.b.a();
        this.c.c();
        boolean bl2 = this.g;
        int n2 = oy.c(qr2.C.b + 0.5);
        if (this.h && qr2.L()) {
            n2 = (int)qr2.C.b;
            object = this.a.a(oy.c(qr2.s), n2, oy.c(qr2.u));
            while (object == aie.i || object == aie.j) {
                object = this.a.a(oy.c(qr2.s), ++n2, oy.c(qr2.u));
            }
            bl2 = this.g;
            this.g = false;
        } else {
            n2 = oy.c(qr2.C.b + 0.5);
        }
        object = this.a(oy.c(qr2.C.a), n2, oy.c(qr2.C.c));
        awv awv2 = this.a(oy.c(d2 - (double)(qr2.M / 2.0f)), oy.c(d3), oy.c(d4 - (double)(qr2.M / 2.0f)));
        awv awv3 = new awv(oy.d(qr2.M + 1.0f), oy.d(qr2.N + 1.0f), oy.d(qr2.M + 1.0f));
        aww aww2 = this.a(qr2, (awv)object, awv2, awv3, f2);
        this.g = bl2;
        return aww2;
    }

    private aww a(qr qr2, awv awv2, awv awv3, awv awv4, float f2) {
        awv2.e = 0.0f;
        awv2.g = awv2.f = awv2.b(awv3);
        this.b.a();
        this.b.a(awv2);
        awv awv5 = awv2;
        while (!this.b.e()) {
            awv awv6 = this.b.c();
            if (awv6.equals(awv3)) {
                return this.a(awv2, awv3);
            }
            if (awv6.b(awv3) < awv5.b(awv3)) {
                awv5 = awv6;
            }
            awv6.i = true;
            int n2 = this.b(qr2, awv6, awv4, awv3, f2);
            for (int i2 = 0; i2 < n2; ++i2) {
                awv awv7 = this.d[i2];
                float f3 = awv6.e + awv6.b(awv7);
                if (awv7.a() && !(f3 < awv7.e)) continue;
                awv7.h = awv6;
                awv7.e = f3;
                awv7.f = awv7.b(awv3);
                if (awv7.a()) {
                    this.b.a(awv7, awv7.e + awv7.f);
                    continue;
                }
                awv7.g = awv7.e + awv7.f;
                this.b.a(awv7);
            }
        }
        if (awv5 == awv2) {
            return null;
        }
        return this.a(awv2, awv5);
    }

    private int b(qr qr2, awv awv2, awv awv3, awv awv4, float f2) {
        int n2 = 0;
        int n3 = 0;
        if (this.a(qr2, awv2.a, awv2.b + 1, awv2.c, awv3) == 1) {
            n3 = 1;
        }
        awv awv5 = this.a(qr2, awv2.a, awv2.b, awv2.c + 1, awv3, n3);
        awv awv6 = this.a(qr2, awv2.a - 1, awv2.b, awv2.c, awv3, n3);
        awv awv7 = this.a(qr2, awv2.a + 1, awv2.b, awv2.c, awv3, n3);
        awv awv8 = this.a(qr2, awv2.a, awv2.b, awv2.c - 1, awv3, n3);
        if (awv5 != null && !awv5.i && awv5.a(awv4) < f2) {
            this.d[n2++] = awv5;
        }
        if (awv6 != null && !awv6.i && awv6.a(awv4) < f2) {
            this.d[n2++] = awv6;
        }
        if (awv7 != null && !awv7.i && awv7.a(awv4) < f2) {
            this.d[n2++] = awv7;
        }
        if (awv8 != null && !awv8.i && awv8.a(awv4) < f2) {
            this.d[n2++] = awv8;
        }
        return n2;
    }

    private awv a(qr qr2, int n2, int n3, int n4, awv awv2, int n5) {
        awv awv3 = null;
        int n6 = this.a(qr2, n2, n3, n4, awv2);
        if (n6 == 2) {
            return this.a(n2, n3, n4);
        }
        if (n6 == 1) {
            awv3 = this.a(n2, n3, n4);
        }
        if (awv3 == null && n5 > 0 && n6 != -3 && n6 != -4 && this.a(qr2, n2, n3 + n5, n4, awv2) == 1) {
            awv3 = this.a(n2, n3 + n5, n4);
            n3 += n5;
        }
        if (awv3 != null) {
            int n7 = 0;
            int n8 = 0;
            while (n3 > 0) {
                n8 = this.a(qr2, n2, n3 - 1, n4, awv2);
                if (this.g && n8 == -1) {
                    return null;
                }
                if (n8 != 1) break;
                if (n7++ >= qr2.aw()) {
                    return null;
                }
                if (--n3 <= 0) continue;
                awv3 = this.a(n2, n3, n4);
            }
            if (n8 == -2) {
                return null;
            }
        }
        return awv3;
    }

    private final awv a(int n2, int n3, int n4) {
        int n5 = awv.a(n2, n3, n4);
        awv awv2 = (awv)this.c.a(n5);
        if (awv2 == null) {
            awv2 = new awv(n2, n3, n4);
            this.c.a(n5, awv2);
        }
        return awv2;
    }

    public int a(qr qr2, int n2, int n3, int n4, awv awv2) {
        return awx.a(qr2, n2, n3, n4, awv2, this.g, this.f, this.e);
    }

    public static int a(qr qr2, int n2, int n3, int n4, awv awv2, boolean bl2, boolean bl3, boolean bl4) {
        boolean bl5 = false;
        for (int i2 = n2; i2 < n2 + awv2.a; ++i2) {
            for (int i3 = n3; i3 < n3 + awv2.b; ++i3) {
                for (int i4 = n4; i4 < n4 + awv2.c; ++i4) {
                    ahz ahz2 = qr2.o.a(i2, i3, i4);
                    if (ahz2.o() == avk.a) continue;
                    if (ahz2 == aie.aT) {
                        bl5 = true;
                    } else if (ahz2 == aie.i || ahz2 == aie.j) {
                        if (bl2) {
                            return -1;
                        }
                        bl5 = true;
                    } else if (!bl4 && ahz2 == aie.ao) {
                        return 0;
                    }
                    int n5 = ahz2.b();
                    if (qr2.o.a(i2, i3, i4).b() == 9) {
                        int n6;
                        int n7;
                        int n8 = oy.c(qr2.s);
                        if (qr2.o.a(n8, n7 = oy.c(qr2.t), n6 = oy.c(qr2.u)).b() == 9 || qr2.o.a(n8, n7 - 1, n6).b() == 9) continue;
                        return -3;
                    }
                    if (ahz2.b((agc)qr2.o, i2, i3, i4) || bl3 && ahz2 == aie.ao) continue;
                    if (n5 == 11 || ahz2 == aie.be || n5 == 32) {
                        return -3;
                    }
                    if (ahz2 == aie.aT) {
                        return -4;
                    }
                    avk avk2 = ahz2.o();
                    if (avk2 == avk.i) {
                        if (qr2.O()) continue;
                        return -2;
                    }
                    return 0;
                }
            }
        }
        return bl5 ? 2 : 1;
    }

    private aww a(awv awv2, awv awv3) {
        int n2 = 1;
        awv awv4 = awv3;
        while (awv4.h != null) {
            ++n2;
            awv4 = awv4.h;
        }
        awv[] awvArray = new awv[n2];
        awv4 = awv3;
        awvArray[--n2] = awv4;
        while (awv4.h != null) {
            awv4 = awv4.h;
            awvArray[--n2] = awv4;
        }
        return new aww(awvArray);
    }
}

