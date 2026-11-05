/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ajk
extends aht {
    public static boolean a;

    protected ajk(avk avk2) {
        super(avk2);
        this.a(1.0f);
    }

    @Override
    public ani a(afs afs2, int n2) {
        return new aof();
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        float f2 = 0.0625f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, f2, 1.0f);
    }

    @Override
    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        if (n5 != 0) {
            return false;
        }
        return super.a(agc2, n2, n3, n4, n5);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ayk ayk2, List list, qr qr2) {
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
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, qr qr2) {
        if (qr2.m == null && qr2.l == null && !afs2.E) {
            qr2.b(1);
        }
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, Random random) {
        double d2 = (float)n2 + random.nextFloat();
        double d3 = (float)n3 + 0.8f;
        double d4 = (float)n4 + random.nextFloat();
        double d5 = 0.0;
        double d6 = 0.0;
        double d7 = 0.0;
        afs2.a("smoke", d2, d3, d4, d5, d6, d7);
    }

    @Override
    public int b() {
        return -1;
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        if (a) {
            return;
        }
        if (afs2.t.i != 0) {
            afs2.f(n2, n3, n4);
        }
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abs.d(0);
    }

    @Override
    public void a(px px2) {
        this.L = px2.a("portal");
    }

    @Override
    public avm f(int n2) {
        return avm.J;
    }
}

