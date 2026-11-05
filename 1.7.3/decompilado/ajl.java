/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ajl
extends ahz {
    private pw a;
    private pw b;

    public ajl() {
        super(avk.e);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 1) {
            return this.a;
        }
        if (n2 == 0) {
            return aie.bs.h(n2);
        }
        return this.L;
    }

    @Override
    public void a(px px2) {
        this.L = px2.a(this.N() + "_side");
        this.a = px2.a(this.N() + "_top");
        this.b = px2.a(this.N() + "_eye");
    }

    public pw e() {
        return this.b;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public int b() {
        return 26;
    }

    @Override
    public void g() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.8125f, 1.0f);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ayk ayk2, List list, qr qr2) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.8125f, 1.0f);
        super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        int n5 = afs2.e(n2, n3, n4);
        if (ajl.b(n5)) {
            this.a(0.3125f, 0.8125f, 0.3125f, 0.6875f, 1.0f, 0.6875f);
            super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        }
        this.g();
    }

    public static boolean b(int n2) {
        return (n2 & 4) != 0;
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return null;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        int n5 = ((oy.c((double)(rm2.y * 4.0f / 360.0f) + 0.5) & 3) + 2) % 4;
        afs2.a(n2, n3, n4, n5, 2);
    }

    @Override
    public boolean M() {
        return true;
    }

    @Override
    public int g(afs afs2, int n2, int n3, int n4, int n5) {
        int n6 = afs2.e(n2, n3, n4);
        if (ajl.b(n6)) {
            return 15;
        }
        return 0;
    }
}

