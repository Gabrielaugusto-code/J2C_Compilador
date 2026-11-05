/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class awi
extends awe {
    private static final Logger c = LogManager.getLogger();
    private awe d;

    public awi(long l2, awe awe2, awe awe3) {
        super(l2);
        this.a = awe2;
        this.d = awe3;
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] nArray = this.a.a(n2 - 1, n3 - 1, n4 + 2, n5 + 2);
        int[] nArray2 = this.d.a(n2 - 1, n3 - 1, n4 + 2, n5 + 2);
        int[] nArray3 = awc.a(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                boolean bl2;
                this.a((long)(i3 + n2), (long)(i2 + n3));
                int n6 = nArray[i3 + 1 + (i2 + 1) * (n4 + 2)];
                int n7 = nArray2[i3 + 1 + (i2 + 1) * (n4 + 2)];
                boolean bl3 = bl2 = (n7 - 2) % 29 == 0;
                if (n6 > 255) {
                    c.debug("old! " + n6);
                }
                if (n6 != 0 && n7 >= 2 && (n7 - 2) % 29 == 1 && n6 < 128) {
                    if (agl.d(n6 + 128) != null) {
                        nArray3[i3 + i2 * n4] = n6 + 128;
                        continue;
                    }
                    nArray3[i3 + i2 * n4] = n6;
                    continue;
                }
                if (this.a(3) == 0 || bl2) {
                    int n8;
                    int n9 = n6;
                    if (n6 == agl.q.ay) {
                        n9 = agl.F.ay;
                    } else if (n6 == agl.s.ay) {
                        n9 = agl.G.ay;
                    } else if (n6 == agl.P.ay) {
                        n9 = agl.Q.ay;
                    } else if (n6 == agl.R.ay) {
                        n9 = agl.p.ay;
                    } else if (n6 == agl.t.ay) {
                        n9 = agl.H.ay;
                    } else if (n6 == agl.U.ay) {
                        n9 = agl.V.ay;
                    } else if (n6 == agl.S.ay) {
                        n9 = agl.T.ay;
                    } else if (n6 == agl.p.ay) {
                        n9 = this.a(3) == 0 ? agl.G.ay : agl.s.ay;
                    } else if (n6 == agl.A.ay) {
                        n9 = agl.B.ay;
                    } else if (n6 == agl.J.ay) {
                        n9 = agl.K.ay;
                    } else if (n6 == agl.o.ay) {
                        n9 = agl.M.ay;
                    } else if (n6 == agl.r.ay) {
                        n9 = agl.W.ay;
                    } else if (n6 == agl.X.ay) {
                        n9 = agl.Y.ay;
                    } else if (awi.a(n6, agl.aa.ay)) {
                        n9 = agl.Z.ay;
                    } else if (n6 == agl.M.ay && this.a(3) == 0) {
                        n8 = this.a(2);
                        n9 = n8 == 0 ? agl.p.ay : agl.s.ay;
                    }
                    if (bl2 && n9 != n6) {
                        n9 = agl.d(n9 + 128) != null ? (n9 += 128) : n6;
                    }
                    if (n9 == n6) {
                        nArray3[i3 + i2 * n4] = n6;
                        continue;
                    }
                    n8 = nArray[i3 + 1 + (i2 + 1 - 1) * (n4 + 2)];
                    int n10 = nArray[i3 + 1 + 1 + (i2 + 1) * (n4 + 2)];
                    int n11 = nArray[i3 + 1 - 1 + (i2 + 1) * (n4 + 2)];
                    int n12 = nArray[i3 + 1 + (i2 + 1 + 1) * (n4 + 2)];
                    int n13 = 0;
                    if (awi.a(n8, n6)) {
                        ++n13;
                    }
                    if (awi.a(n10, n6)) {
                        ++n13;
                    }
                    if (awi.a(n11, n6)) {
                        ++n13;
                    }
                    if (awi.a(n12, n6)) {
                        ++n13;
                    }
                    if (n13 >= 3) {
                        nArray3[i3 + i2 * n4] = n9;
                        continue;
                    }
                    nArray3[i3 + i2 * n4] = n6;
                    continue;
                }
                nArray3[i3 + i2 * n4] = n6;
            }
        }
        return nArray3;
    }
}

