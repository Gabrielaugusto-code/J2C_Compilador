/*
 * Decompiled with CFR 0.152.
 */
public class awn
extends awe {
    public awn(long l2, awe awe2) {
        super(l2);
        this.a = awe2;
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] nArray = this.a.a(n2 - 1, n3 - 1, n4 + 2, n5 + 2);
        int[] nArray2 = awc.a(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                int n6;
                int n7;
                int n8;
                int n9;
                this.a((long)(i3 + n2), (long)(i2 + n3));
                int n10 = nArray[i3 + 1 + (i2 + 1) * (n4 + 2)];
                agl agl2 = agl.d(n10);
                if (n10 == agl.C.ay) {
                    n9 = nArray[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = nArray[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = nArray[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = nArray[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (n9 == agl.o.ay || n8 == agl.o.ay || n7 == agl.o.ay || n6 == agl.o.ay) {
                        nArray2[i3 + i2 * n4] = agl.D.ay;
                        continue;
                    }
                    nArray2[i3 + i2 * n4] = n10;
                    continue;
                }
                if (agl2 != null && agl2.l() == ahb.class) {
                    n9 = nArray[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = nArray[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = nArray[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = nArray[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (!(this.c(n9) && this.c(n8) && this.c(n7) && this.c(n6))) {
                        nArray2[i3 + i2 * n4] = agl.L.ay;
                        continue;
                    }
                    if (awn.b(n9) || awn.b(n8) || awn.b(n7) || awn.b(n6)) {
                        nArray2[i3 + i2 * n4] = agl.E.ay;
                        continue;
                    }
                    nArray2[i3 + i2 * n4] = n10;
                    continue;
                }
                if (n10 == agl.r.ay || n10 == agl.W.ay || n10 == agl.I.ay) {
                    this.a(nArray, nArray2, i3, i2, n4, n10, agl.N.ay);
                    continue;
                }
                if (agl2 != null && agl2.j()) {
                    this.a(nArray, nArray2, i3, i2, n4, n10, agl.O.ay);
                    continue;
                }
                if (n10 == agl.Z.ay || n10 == agl.aa.ay) {
                    n9 = nArray[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = nArray[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = nArray[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = nArray[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (awn.b(n9) || awn.b(n8) || awn.b(n7) || awn.b(n6)) {
                        nArray2[i3 + i2 * n4] = n10;
                        continue;
                    }
                    if (!(this.d(n9) && this.d(n8) && this.d(n7) && this.d(n6))) {
                        nArray2[i3 + i2 * n4] = agl.q.ay;
                        continue;
                    }
                    nArray2[i3 + i2 * n4] = n10;
                    continue;
                }
                if (n10 != agl.o.ay && n10 != agl.M.ay && n10 != agl.v.ay && n10 != agl.u.ay) {
                    n9 = nArray[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = nArray[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = nArray[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = nArray[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (awn.b(n9) || awn.b(n8) || awn.b(n7) || awn.b(n6)) {
                        nArray2[i3 + i2 * n4] = agl.E.ay;
                        continue;
                    }
                    nArray2[i3 + i2 * n4] = n10;
                    continue;
                }
                nArray2[i3 + i2 * n4] = n10;
            }
        }
        return nArray2;
    }

    private void a(int[] nArray, int[] nArray2, int n2, int n3, int n4, int n5, int n6) {
        if (awn.b(n5)) {
            nArray2[n2 + n3 * n4] = n5;
            return;
        }
        int n7 = nArray[n2 + 1 + (n3 + 1 - 1) * (n4 + 2)];
        int n8 = nArray[n2 + 1 + 1 + (n3 + 1) * (n4 + 2)];
        int n9 = nArray[n2 + 1 - 1 + (n3 + 1) * (n4 + 2)];
        int n10 = nArray[n2 + 1 + (n3 + 1 + 1) * (n4 + 2)];
        nArray2[n2 + n3 * n4] = awn.b(n7) || awn.b(n8) || awn.b(n9) || awn.b(n10) ? n6 : n5;
    }

    private boolean c(int n2) {
        if (agl.d(n2) != null && agl.d(n2).l() == ahb.class) {
            return true;
        }
        return n2 == agl.L.ay || n2 == agl.J.ay || n2 == agl.K.ay || n2 == agl.s.ay || n2 == agl.t.ay || awn.b(n2);
    }

    private boolean d(int n2) {
        return agl.d(n2) != null && agl.d(n2) instanceof ahc;
    }
}

