/*
 * Decompiled with CFR 0.152.
 */
public class abn
extends abs {
    public abn() {
        this.h = 1;
        this.f(64);
        this.a(aak.i);
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        if (n5 == 0) {
            --n3;
        }
        if (n5 == 1) {
            ++n3;
        }
        if (n5 == 2) {
            --n4;
        }
        if (n5 == 3) {
            ++n4;
        }
        if (n5 == 4) {
            --n2;
        }
        if (n5 == 5) {
            ++n2;
        }
        if (!xq2.a(n2, n3, n4, n5, abu2)) {
            return false;
        }
        if (afs2.a(n2, n3, n4).o() == avk.a) {
            afs2.a((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "fire.ignite", 1.0f, g.nextFloat() * 0.4f + 0.8f);
            afs2.b(n2, n3, n4, aie.ab);
        }
        abu2.a(1, (rm)xq2);
        return true;
    }
}

