/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class ahv
extends ahz {
    protected final boolean a;

    public static final boolean b_(afs afs2, int n2, int n3, int n4) {
        return ahv.a(afs2.a(n2, n3, n4));
    }

    public static final boolean a(ahz ahz2) {
        return ahz2 == aie.aq || ahz2 == aie.D || ahz2 == aie.E || ahz2 == aie.cc;
    }

    protected ahv(boolean bl2) {
        super(avk.q);
        this.a = bl2;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        this.a(aak.e);
    }

    public boolean e() {
        return this.a;
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
    public ayn a(afs afs2, int n2, int n3, int n4, ayp ayp2, ayp ayp3) {
        this.a((agc)afs2, n2, n3, n4);
        return super.a(afs2, n2, n3, n4, ayp2, ayp3);
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        int n5 = agc2.e(n2, n3, n4);
        if (n5 >= 2 && n5 <= 5) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.625f, 1.0f);
        } else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        }
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public int b() {
        return 9;
    }

    @Override
    public int a(Random random) {
        return 1;
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        return afs.a(afs2, n2, n3 - 1, n4);
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        if (!afs2.E) {
            this.a(afs2, n2, n3, n4, true);
            if (this.a) {
                this.a(afs2, n2, n3, n4, this);
            }
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        int n5;
        if (afs2.E) {
            return;
        }
        int n6 = n5 = afs2.e(n2, n3, n4);
        if (this.a) {
            n6 &= 7;
        }
        boolean bl2 = false;
        if (!afs.a(afs2, n2, n3 - 1, n4)) {
            bl2 = true;
        }
        if (n6 == 2 && !afs.a(afs2, n2 + 1, n3, n4)) {
            bl2 = true;
        }
        if (n6 == 3 && !afs.a(afs2, n2 - 1, n3, n4)) {
            bl2 = true;
        }
        if (n6 == 4 && !afs.a(afs2, n2, n3, n4 - 1)) {
            bl2 = true;
        }
        if (n6 == 5 && !afs.a(afs2, n2, n3, n4 + 1)) {
            bl2 = true;
        }
        if (bl2) {
            this.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
            afs2.f(n2, n3, n4);
        } else {
            this.a(afs2, n2, n3, n4, n5, n6, ahz2);
        }
    }

    protected void a(afs afs2, int n2, int n3, int n4, int n5, int n6, ahz ahz2) {
    }

    protected void a(afs afs2, int n2, int n3, int n4, boolean bl2) {
        if (afs2.E) {
            return;
        }
        new ahw(this, afs2, n2, n3, n4).a(afs2.v(n2, n3, n4), bl2);
    }

    @Override
    public int h() {
        return 0;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        int n6 = n5;
        if (this.a) {
            n6 &= 7;
        }
        super.a(afs2, n2, n3, n4, ahz2, n5);
        if (n6 == 2 || n6 == 3 || n6 == 4 || n6 == 5) {
            afs2.d(n2, n3 + 1, n4, ahz2);
        }
        if (this.a) {
            afs2.d(n2, n3, n4, ahz2);
            afs2.d(n2, n3 - 1, n4, ahz2);
        }
    }
}

