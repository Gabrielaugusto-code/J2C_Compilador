/*
 * Decompiled with CFR 0.152.
 */
public class awm
extends awe {
    private awe c;
    private awe d;

    public awm(long l2, awe awe2, awe awe3) {
        super(l2);
        this.c = awe2;
        this.d = awe3;
    }

    @Override
    public void a(long l2) {
        this.c.a(l2);
        this.d.a(l2);
        super.a(l2);
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] nArray = this.c.a(n2, n3, n4, n5);
        int[] nArray2 = this.d.a(n2, n3, n4, n5);
        int[] nArray3 = awc.a(n4 * n5);
        for (int i2 = 0; i2 < n4 * n5; ++i2) {
            if (nArray[i2] == agl.o.ay || nArray[i2] == agl.M.ay) {
                nArray3[i2] = nArray[i2];
                continue;
            }
            if (nArray2[i2] == agl.v.ay) {
                if (nArray[i2] == agl.A.ay) {
                    nArray3[i2] = agl.z.ay;
                    continue;
                }
                if (nArray[i2] == agl.C.ay || nArray[i2] == agl.D.ay) {
                    nArray3[i2] = agl.D.ay;
                    continue;
                }
                nArray3[i2] = nArray2[i2] & 0xFF;
                continue;
            }
            nArray3[i2] = nArray[i2];
        }
        return nArray3;
    }
}

