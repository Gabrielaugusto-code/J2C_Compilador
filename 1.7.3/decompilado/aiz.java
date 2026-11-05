/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class aiz
extends ahv {
    private pw[] b;

    public aiz() {
        super(true);
        this.a(true);
    }

    @Override
    public int a(afs afs2) {
        return 20;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, qr qr2) {
        if (afs2.E) {
            return;
        }
        int n5 = afs2.e(n2, n3, n4);
        if ((n5 & 8) != 0) {
            return;
        }
        this.a(afs2, n2, n3, n4, n5);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (afs2.E) {
            return;
        }
        int n5 = afs2.e(n2, n3, n4);
        if ((n5 & 8) == 0) {
            return;
        }
        this.a(afs2, n2, n3, n4, n5);
    }

    @Override
    public int b(agc agc2, int n2, int n3, int n4, int n5) {
        return (agc2.e(n2, n3, n4) & 8) != 0 ? 15 : 0;
    }

    @Override
    public int c(agc agc2, int n2, int n3, int n4, int n5) {
        if ((agc2.e(n2, n3, n4) & 8) == 0) {
            return 0;
        }
        return n5 == 1 ? 15 : 0;
    }

    private void a(afs afs2, int n2, int n3, int n4, int n5) {
        boolean bl2 = (n5 & 8) != 0;
        boolean bl3 = false;
        float f2 = 0.125f;
        List list = afs2.a(wc.class, ayk.a().a((float)n2 + f2, n3, (float)n4 + f2, (float)(n2 + 1) - f2, (float)(n3 + 1) - f2, (float)(n4 + 1) - f2));
        if (!list.isEmpty()) {
            bl3 = true;
        }
        if (bl3 && !bl2) {
            afs2.a(n2, n3, n4, n5 | 8, 3);
            afs2.d(n2, n3, n4, this);
            afs2.d(n2, n3 - 1, n4, this);
            afs2.c(n2, n3, n4, n2, n3, n4);
        }
        if (!bl3 && bl2) {
            afs2.a(n2, n3, n4, n5 & 7, 3);
            afs2.d(n2, n3, n4, this);
            afs2.d(n2, n3 - 1, n4, this);
            afs2.c(n2, n3, n4, n2, n3, n4);
        }
        if (bl3) {
            afs2.a(n2, n3, n4, this, this.a(afs2));
        }
        afs2.f(n2, n3, n4, this);
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        super.b(afs2, n2, n3, n4);
        this.a(afs2, n2, n3, n4, afs2.e(n2, n3, n4));
    }

    @Override
    public boolean M() {
        return true;
    }

    @Override
    public int g(afs afs2, int n2, int n3, int n4, int n5) {
        if ((afs2.e(n2, n3, n4) & 8) > 0) {
            float f2 = 0.125f;
            List list = afs2.a(we.class, ayk.a().a((float)n2 + f2, n3, (float)n4 + f2, (float)(n2 + 1) - f2, (float)(n3 + 1) - f2, (float)(n4 + 1) - f2));
            if (list.size() > 0) {
                return ((we)list.get(0)).e().g();
            }
            List list2 = afs2.a(wc.class, ayk.a().a((float)n2 + f2, n3, (float)n4 + f2, (float)(n2 + 1) - f2, (float)(n3 + 1) - f2, (float)(n4 + 1) - f2), ra.c);
            if (list2.size() > 0) {
                return yj.b((ps)list2.get(0));
            }
        }
        return 0;
    }

    @Override
    public void a(px px2) {
        this.b = new pw[2];
        this.b[0] = px2.a(this.N());
        this.b[1] = px2.a(this.N() + "_powered");
    }

    @Override
    public pw a(int n2, int n3) {
        if ((n3 & 8) != 0) {
            return this.b[1];
        }
        return this.b[0];
    }
}

