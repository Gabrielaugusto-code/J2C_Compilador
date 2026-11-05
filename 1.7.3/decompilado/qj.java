/*
 * Decompiled with CFR 0.152.
 */
public class qj
extends qm {
    protected qj(int n2, boolean bl2, int n3) {
        super(n2, bl2, n3);
    }

    @Override
    public double a(int n2, sa sa2) {
        if (this.H == qm.t.H) {
            return -0.5f * (float)(n2 + 1);
        }
        return 1.3 * (double)(n2 + 1);
    }
}

