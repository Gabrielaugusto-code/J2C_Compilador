/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class akg
extends akb {
    public akg() {
        super("ice", avk.w, false);
        this.K = 0.98f;
        this.a(true);
        this.a(aak.b);
    }

    @Override
    public int w() {
        return 1;
    }

    @Override
    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        return super.a(agc2, n2, n3, n4, 1 - n5);
    }

    @Override
    public void a(afs afs2, xq xq2, int n2, int n3, int n4, int n5) {
        xq2.a(og.C[ahz.b(this)], 1);
        xq2.a(0.025f);
        if (this.E() && aem.e(xq2)) {
            abu abu2 = this.j(n5);
            if (abu2 != null) {
                this.a(afs2, n2, n3, n4, abu2);
            }
        } else {
            if (afs2.t.f) {
                afs2.f(n2, n3, n4);
                return;
            }
            int n6 = aem.f(xq2);
            this.b(afs2, n2, n3, n4, n5, n6);
            avk avk2 = afs2.a(n2, n3 - 1, n4).o();
            if (avk2.c() || avk2.d()) {
                afs2.b(n2, n3, n4, aie.i);
            }
        }
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (afs2.b(age.b, n2, n3, n4) > 11 - this.k()) {
            if (afs2.t.f) {
                afs2.f(n2, n3, n4);
                return;
            }
            this.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
            afs2.b(n2, n3, n4, aie.j);
        }
    }

    @Override
    public int h() {
        return 0;
    }
}

