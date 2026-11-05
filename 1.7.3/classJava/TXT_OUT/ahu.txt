/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class ahu
extends ahz {
    private String a;

    protected ahu(String string, avk avk2) {
        super(avk2);
        this.a = string;
        this.a(aak.d);
        this.a(true);
        this.b(this.d(15));
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        this.b(agc2.e(n2, n3, n4));
    }

    protected void b(int n2) {
        boolean bl2 = this.c(n2) > 0;
        float f2 = 0.0625f;
        if (bl2) {
            this.a(f2, 0.0f, f2, 1.0f - f2, 0.03125f, 1.0f - f2);
        } else {
            this.a(f2, 0.0f, f2, 1.0f - f2, 0.0625f, 1.0f - f2);
        }
    }

    @Override
    public int a(afs afs2) {
        return 20;
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        return null;
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
    public boolean b(agc agc2, int n2, int n3, int n4) {
        return true;
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        return afs.a(afs2, n2, n3 - 1, n4) || ajq.a(afs2.a(n2, n3 - 1, n4));
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        boolean bl2 = false;
        if (!afs.a(afs2, n2, n3 - 1, n4) && !ajq.a(afs2.a(n2, n3 - 1, n4))) {
            bl2 = true;
        }
        if (bl2) {
            this.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
            afs2.f(n2, n3, n4);
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (afs2.E) {
            return;
        }
        int n5 = this.c(afs2.e(n2, n3, n4));
        if (n5 > 0) {
            this.a(afs2, n2, n3, n4, n5);
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, qr qr2) {
        if (afs2.E) {
            return;
        }
        int n5 = this.c(afs2.e(n2, n3, n4));
        if (n5 == 0) {
            this.a(afs2, n2, n3, n4, n5);
        }
    }

    protected void a(afs afs2, int n2, int n3, int n4, int n5) {
        boolean bl2;
        int n6 = this.e(afs2, n2, n3, n4);
        boolean bl3 = n5 > 0;
        boolean bl4 = bl2 = n6 > 0;
        if (n5 != n6) {
            afs2.a(n2, n3, n4, this.d(n6), 2);
            this.a_(afs2, n2, n3, n4);
            afs2.c(n2, n3, n4, n2, n3, n4);
        }
        if (!bl2 && bl3) {
            afs2.a((double)n2 + 0.5, (double)n3 + 0.1, (double)n4 + 0.5, "random.click", 0.3f, 0.5f);
        } else if (bl2 && !bl3) {
            afs2.a((double)n2 + 0.5, (double)n3 + 0.1, (double)n4 + 0.5, "random.click", 0.3f, 0.6f);
        }
        if (bl2) {
            afs2.a(n2, n3, n4, this, this.a(afs2));
        }
    }

    protected ayk a(int n2, int n3, int n4) {
        float f2 = 0.125f;
        return ayk.a().a((float)n2 + f2, n3, (float)n4 + f2, (float)(n2 + 1) - f2, (double)n3 + 0.25, (float)(n4 + 1) - f2);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        if (this.c(n5) > 0) {
            this.a_(afs2, n2, n3, n4);
        }
        super.a(afs2, n2, n3, n4, ahz2, n5);
    }

    protected void a_(afs afs2, int n2, int n3, int n4) {
        afs2.d(n2, n3, n4, this);
        afs2.d(n2, n3 - 1, n4, this);
    }

    @Override
    public int b(agc agc2, int n2, int n3, int n4, int n5) {
        return this.c(agc2.e(n2, n3, n4));
    }

    @Override
    public int c(agc agc2, int n2, int n3, int n4, int n5) {
        if (n5 == 1) {
            return this.c(agc2.e(n2, n3, n4));
        }
        return 0;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void g() {
        float f2 = 0.5f;
        float f3 = 0.125f;
        float f4 = 0.5f;
        this.a(0.5f - f2, 0.5f - f3, 0.5f - f4, 0.5f + f2, 0.5f + f3, 0.5f + f4);
    }

    @Override
    public int h() {
        return 1;
    }

    protected abstract int e(afs var1, int var2, int var3, int var4);

    protected abstract int c(int var1);

    protected abstract int d(int var1);

    @Override
    public void a(px px2) {
        this.L = px2.a(this.a);
    }
}

