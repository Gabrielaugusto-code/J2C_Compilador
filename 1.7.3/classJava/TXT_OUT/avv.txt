/*
 * Decompiled with CFR 0.152.
 */
public class avv
extends awe {
    public avv(long l2, awe awe2) {
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
                if (this.a(nArray, nArray2, i3, i2, n4, n10, agl.r.ay, agl.I.ay) || this.b(nArray, nArray2, i3, i2, n4, n10, agl.aa.ay, agl.Z.ay) || this.b(nArray, nArray2, i3, i2, n4, n10, agl.ab.ay, agl.Z.ay) || this.b(nArray, nArray2, i3, i2, n4, n10, agl.U.ay, agl.t.ay)) continue;
                if (n10 == agl.q.ay) {
                    n9 = nArray[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = nArray[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = nArray[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = nArray[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (n9 == agl.A.ay || n8 == agl.A.ay || n7 == agl.A.ay || n6 == agl.A.ay) {
                        nArray2[i3 + i2 * n4] = agl.W.ay;
                        continue;
                    }
                    nArray2[i3 + i2 * n4] = n10;
                    continue;
                }
                if (n10 == agl.u.ay) {
                    n9 = nArray[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    n8 = nArray[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    n7 = nArray[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    n6 = nArray[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    if (n9 == agl.q.ay || n8 == agl.q.ay || n7 == agl.q.ay || n6 == agl.q.ay || n9 == agl.S.ay || n8 == agl.S.ay || n7 == agl.S.ay || n6 == agl.S.ay || n9 == agl.A.ay || n8 == agl.A.ay || n7 == agl.A.ay || n6 == agl.A.ay) {
                        nArray2[i3 + i2 * n4] = agl.p.ay;
                        continue;
                    }
                    if (n9 == agl.J.ay || n6 == agl.J.ay || n8 == agl.J.ay || n7 == agl.J.ay) {
                        nArray2[i3 + i2 * n4] = agl.L.ay;
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

    private boolean a(int[] nArray, int[] nArray2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (avv.a(n5, n6)) {
            int n8 = nArray[n2 + 1 + (n3 + 1 - 1) * (n4 + 2)];
            int n9 = nArray[n2 + 1 + 1 + (n3 + 1) * (n4 + 2)];
            int n10 = nArray[n2 + 1 - 1 + (n3 + 1) * (n4 + 2)];
            int n11 = nArray[n2 + 1 + (n3 + 1 + 1) * (n4 + 2)];
            nArray2[n2 + n3 * n4] = !this.b(n8, n6) || !this.b(n9, n6) || !this.b(n10, n6) || !this.b(n11, n6) ? n7 : n5;
            return true;
        }
        return false;
    }

    private boolean b(int[] nArray, int[] nArray2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n5 == n6) {
            int n8 = nArray[n2 + 1 + (n3 + 1 - 1) * (n4 + 2)];
            int n9 = nArray[n2 + 1 + 1 + (n3 + 1) * (n4 + 2)];
            int n10 = nArray[n2 + 1 - 1 + (n3 + 1) * (n4 + 2)];
            int n11 = nArray[n2 + 1 + (n3 + 1 + 1) * (n4 + 2)];
            nArray2[n2 + n3 * n4] = !avv.a(n8, n6) || !avv.a(n9, n6) || !avv.a(n10, n6) || !avv.a(n11, n6) ? n7 : n5;
            return true;
        }
        return false;
    }

    private boolean b(int n2, int n3) {
        if (avv.a(n2, n3)) {
            return true;
        }
        if (agl.d(n2) != null && agl.d(n3) != null) {
            agn agn2;
            agn agn3 = agl.d(n2).m();
            return agn3 == (agn2 = agl.d(n3).m()) || agn3 == agn.c || agn2 == agn.c;
        }
        return false;
    }
}

