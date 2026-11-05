/*
 * Decompiled with CFR 0.152.
 */
public class avw
extends awe {
    private agl[] c = new agl[]{agl.q, agl.q, agl.q, agl.X, agl.X, agl.p};
    private agl[] d = new agl[]{agl.s, agl.R, agl.r, agl.p, agl.P, agl.u};
    private agl[] e = new agl[]{agl.s, agl.r, agl.t, agl.p};
    private agl[] f = new agl[]{agl.A, agl.A, agl.A, agl.S};

    public avw(long l2, awe awe2, agd agd2) {
        super(l2);
        this.a = awe2;
        if (agd2 == agd.f) {
            this.c = new agl[]{agl.q, agl.s, agl.r, agl.u, agl.p, agl.t};
        }
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] nArray = this.a.a(n2, n3, n4, n5);
        int[] nArray2 = awc.a(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                this.a((long)(i3 + n2), (long)(i2 + n3));
                int n6 = nArray[i3 + i2 * n4];
                int n7 = (n6 & 0xF00) >> 8;
                if (avw.b(n6 &= 0xFFFFF0FF)) {
                    nArray2[i3 + i2 * n4] = n6;
                    continue;
                }
                if (n6 == agl.C.ay) {
                    nArray2[i3 + i2 * n4] = n6;
                    continue;
                }
                if (n6 == 1) {
                    if (n7 > 0) {
                        if (this.a(3) == 0) {
                            nArray2[i3 + i2 * n4] = agl.ab.ay;
                            continue;
                        }
                        nArray2[i3 + i2 * n4] = agl.aa.ay;
                        continue;
                    }
                    nArray2[i3 + i2 * n4] = this.c[this.a((int)this.c.length)].ay;
                    continue;
                }
                if (n6 == 2) {
                    if (n7 > 0) {
                        nArray2[i3 + i2 * n4] = agl.J.ay;
                        continue;
                    }
                    nArray2[i3 + i2 * n4] = this.d[this.a((int)this.d.length)].ay;
                    continue;
                }
                if (n6 == 3) {
                    if (n7 > 0) {
                        nArray2[i3 + i2 * n4] = agl.U.ay;
                        continue;
                    }
                    nArray2[i3 + i2 * n4] = this.e[this.a((int)this.e.length)].ay;
                    continue;
                }
                nArray2[i3 + i2 * n4] = n6 == 4 ? this.f[this.a((int)this.f.length)].ay : agl.C.ay;
            }
        }
        return nArray2;
    }
}

