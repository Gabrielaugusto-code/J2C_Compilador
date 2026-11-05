/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aik
extends ahz {
    private pw a;
    private pw b;

    protected aik() {
        super(avk.A);
        this.a(true);
        this.a(aak.c);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (afs2.c(n2, n3 + 1, n4)) {
            int n5 = 1;
            while (afs2.a(n2, n3 - n5, n4) == this) {
                ++n5;
            }
            if (n5 < 3) {
                int n6 = afs2.e(n2, n3, n4);
                if (n6 == 15) {
                    afs2.b(n2, n3 + 1, n4, this);
                    afs2.a(n2, n3, n4, 0, 4);
                    this.a(afs2, n2, n3 + 1, n4, this);
                } else {
                    afs2.a(n2, n3, n4, n6 + 1, 4);
                }
            }
        }
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        float f2 = 0.0625f;
        return ayk.a().a((float)n2 + f2, n3, (float)n4 + f2, (float)(n2 + 1) - f2, (float)(n3 + 1) - f2, (float)(n4 + 1) - f2);
    }

    @Override
    public ayk g(afs afs2, int n2, int n3, int n4) {
        float f2 = 0.0625f;
        return ayk.a().a((float)n2 + f2, n3, (float)n4 + f2, (float)(n2 + 1) - f2, n3 + 1, (float)(n4 + 1) - f2);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 1) {
            return this.a;
        }
        if (n2 == 0) {
            return this.b;
        }
        return this.L;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public int b() {
        return 13;
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        if (!super.c(afs2, n2, n3, n4)) {
            return false;
        }
        return this.j(afs2, n2, n3, n4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        if (!this.j(afs2, n2, n3, n4)) {
            afs2.a(n2, n3, n4, true);
        }
    }

    @Override
    public boolean j(afs afs2, int n2, int n3, int n4) {
        if (afs2.a(n2 - 1, n3, n4).o().a()) {
            return false;
        }
        if (afs2.a(n2 + 1, n3, n4).o().a()) {
            return false;
        }
        if (afs2.a(n2, n3, n4 - 1).o().a()) {
            return false;
        }
        if (afs2.a(n2, n3, n4 + 1).o().a()) {
            return false;
        }
        ahz ahz2 = afs2.a(n2, n3 - 1, n4);
        return ahz2 == aie.aF || ahz2 == aie.m;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, qr qr2) {
        qr2.a(qf.g, 1.0f);
    }

    @Override
    public void a(px px2) {
        this.L = px2.a(this.N() + "_side");
        this.a = px2.a(this.N() + "_top");
        this.b = px2.a(this.N() + "_bottom");
    }
}

