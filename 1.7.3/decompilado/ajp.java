/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ajp
extends ahz {
    private pw a;
    private pw b;

    protected ajp() {
        super(avk.c);
        this.a(true);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.9375f, 1.0f);
        this.g(255);
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        return ayk.a().a(n2 + 0, n3 + 0, n4 + 0, n2 + 1, n3 + 1, n4 + 1);
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
    public pw a(int n2, int n3) {
        if (n2 == 1) {
            if (n3 > 0) {
                return this.a;
            }
            return this.b;
        }
        return aie.d.h(n2);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (this.m(afs2, n2, n3, n4) || afs2.y(n2, n3 + 1, n4)) {
            afs2.a(n2, n3, n4, 7, 2);
        } else {
            int n5 = afs2.e(n2, n3, n4);
            if (n5 > 0) {
                afs2.a(n2, n3, n4, n5 - 1, 2);
            } else if (!this.e(afs2, n2, n3, n4)) {
                afs2.b(n2, n3, n4, aie.d);
            }
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, qr qr2, float f2) {
        if (!afs2.E && afs2.s.nextFloat() < f2 - 0.5f) {
            if (!(qr2 instanceof xq) && !afs2.O().b("mobGriefing")) {
                return;
            }
            afs2.b(n2, n3, n4, aie.d);
        }
    }

    private boolean e(afs afs2, int n2, int n3, int n4) {
        int n5 = 0;
        for (int i2 = n2 - n5; i2 <= n2 + n5; ++i2) {
            for (int i3 = n4 - n5; i3 <= n4 + n5; ++i3) {
                ahz ahz2 = afs2.a(i2, n3 + 1, i3);
                if (ahz2 != aie.aj && ahz2 != aie.bc && ahz2 != aie.bb && ahz2 != aie.bN && ahz2 != aie.bM) continue;
                return true;
            }
        }
        return false;
    }

    private boolean m(afs afs2, int n2, int n3, int n4) {
        for (int i2 = n2 - 4; i2 <= n2 + 4; ++i2) {
            for (int i3 = n3; i3 <= n3 + 1; ++i3) {
                for (int i4 = n4 - 4; i4 <= n4 + 4; ++i4) {
                    if (afs2.a(i2, i3, i4).o() != avk.h) continue;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        super.a(afs2, n2, n3, n4, ahz2);
        avk avk2 = afs2.a(n2, n3 + 1, n4).o();
        if (avk2.a()) {
            afs2.b(n2, n3, n4, aie.d);
        }
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return aie.d.a(0, random, n3);
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abs.a(aie.d);
    }

    @Override
    public void a(px px2) {
        this.a = px2.a(this.N() + "_wet");
        this.b = px2.a(this.N() + "_dry");
    }
}

