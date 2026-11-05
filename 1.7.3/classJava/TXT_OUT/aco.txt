/*
 * Decompiled with CFR 0.152.
 */
public class aco
extends abs {
    public aco() {
        this.e(1);
        this.f(238);
        this.a(aak.i);
    }

    @Override
    public boolean a(abu abu2, afs afs2, ahz ahz2, int n2, int n3, int n4, rm rm2) {
        if (ahz2.o() == avk.j || ahz2 == aie.G || ahz2 == aie.H || ahz2 == aie.bd || ahz2 == aie.bD) {
            abu2.a(1, rm2);
            return true;
        }
        return super.a(abu2, afs2, ahz2, n2, n3, n4, rm2);
    }

    @Override
    public boolean b(ahz ahz2) {
        return ahz2 == aie.G || ahz2 == aie.af || ahz2 == aie.bD;
    }

    @Override
    public float a(abu abu2, ahz ahz2) {
        if (ahz2 == aie.G || ahz2.o() == avk.j) {
            return 15.0f;
        }
        if (ahz2 == aie.L) {
            return 5.0f;
        }
        return super.a(abu2, ahz2);
    }
}

