/*
 * Decompiled with CFR 0.152.
 */
public class aca
extends abs {
    private static final co b = new acb();
    public int a;

    public aca(int n2) {
        this.h = 1;
        this.a = n2;
        this.a(aak.e);
        ajd.a.a(this, b);
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        if (ahv.a(afs2.a(n2, n3, n4))) {
            if (!afs2.E) {
                wc wc2 = wc.a(afs2, (float)n2 + 0.5f, (float)n3 + 0.5f, (float)n4 + 0.5f, this.a);
                if (abu2.u()) {
                    wc2.a(abu2.s());
                }
                afs2.d(wc2);
            }
            --abu2.b;
            return true;
        }
        return false;
    }
}

