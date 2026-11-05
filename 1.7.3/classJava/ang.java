/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ang
extends ahz {
    protected ang() {
        super(avk.r);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
        this.a(true);
        this.a(aak.c);
        this.b(0);
    }

    @Override
    public pw a(int n2, int n3) {
        return aie.L.a(n2, n3);
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        boolean bl2 = false;
        float f2 = 0.0625f;
        return ayk.a().a((double)n2 + this.B, (double)n3 + this.C, (double)n4 + this.D, (double)n2 + this.E, (float)n3 + (float)bl2 * f2, (double)n4 + this.G);
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void g() {
        this.b(0);
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        this.b(agc2.e(n2, n3, n4));
    }

    protected void b(int n2) {
        int n3 = 0;
        float f2 = (float)(1 * (1 + n3)) / 16.0f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, f2, 1.0f);
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        return super.c(afs2, n2, n3, n4) && this.j(afs2, n2, n3, n4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        this.e(afs2, n2, n3, n4);
    }

    private boolean e(afs afs2, int n2, int n3, int n4) {
        if (!this.j(afs2, n2, n3, n4)) {
            this.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
            afs2.f(n2, n3, n4);
            return false;
        }
        return true;
    }

    @Override
    public boolean j(afs afs2, int n2, int n3, int n4) {
        return !afs2.c(n2, n3 - 1, n4);
    }

    @Override
    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        if (n5 == 1) {
            return true;
        }
        return super.a(agc2, n2, n3, n4, n5);
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        for (int i2 = 0; i2 < 16; ++i2) {
            list.add(new abu(abs2, 1, i2));
        }
    }

    @Override
    public void a(px px2) {
    }
}

