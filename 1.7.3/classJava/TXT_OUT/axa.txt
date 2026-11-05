/*
 * Decompiled with CFR 0.152.
 */
public class axa {
    public final xq a;
    public int[] b = new int[128];
    public int[] c = new int[128];
    private int f;
    private int g;
    private byte[] h;
    public int d;
    private boolean i;
    final /* synthetic */ awz e;

    public axa(awz awz2, xq xq2) {
        this.e = awz2;
        this.a = xq2;
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = 0;
            this.c[i2] = 127;
        }
    }

    public byte[] a(abu abu2) {
        int n2;
        int n3;
        if (!this.i) {
            byte[] byArray = new byte[]{2, this.e.d};
            this.i = true;
            return byArray;
        }
        if (--this.g < 0) {
            this.g = 4;
            byte[] byArray = new byte[this.e.g.size() * 3 + 1];
            byArray[0] = 1;
            n3 = 0;
            for (axb axb2 : this.e.g.values()) {
                byArray[n3 * 3 + 1] = (byte)(axb2.a << 4 | axb2.d & 0xF);
                byArray[n3 * 3 + 2] = axb2.b;
                byArray[n3 * 3 + 3] = axb2.c;
                ++n3;
            }
            int n4 = n2 = !abu2.A() ? 1 : 0;
            if (this.h == null || this.h.length != byArray.length) {
                n2 = 0;
            } else {
                for (int i2 = 0; i2 < byArray.length; ++i2) {
                    if (byArray[i2] == this.h[i2]) continue;
                    n2 = 0;
                    break;
                }
            }
            if (n2 == 0) {
                this.h = byArray;
                return byArray;
            }
        }
        for (int i3 = 0; i3 < 1; ++i3) {
            if (this.b[n3 = this.f++ * 11 % 128] < 0) continue;
            n2 = this.c[n3] - this.b[n3] + 1;
            int n5 = this.b[n3];
            byte[] byArray = new byte[n2 + 3];
            byArray[0] = 0;
            byArray[1] = (byte)n3;
            byArray[2] = (byte)n5;
            for (int i4 = 0; i4 < byArray.length - 3; ++i4) {
                byArray[i4 + 3] = this.e.e[(i4 + n5) * 128 + n3];
            }
            this.c[n3] = -1;
            this.b[n3] = -1;
            return byArray;
        }
        return null;
    }
}

