/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aix
extends aht {
    private pw[] a = new pw[2];

    public aix() {
        super(avk.d);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.375f, 1.0f);
        this.a(aak.d);
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.375f, 1.0f);
    }

    @Override
    public int b(agc agc2, int n2, int n3, int n4, int n5) {
        return agc2.e(n2, n3, n4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
    }

    public void e(afs afs2, int n2, int n3, int n4) {
        if (afs2.t.g) {
            return;
        }
        int n5 = afs2.e(n2, n3, n4);
        int n6 = afs2.b(age.a, n2, n3, n4) - afs2.j;
        float f2 = afs2.d(1.0f);
        f2 = f2 < (float)Math.PI ? (f2 += (0.0f - f2) * 0.2f) : (f2 += ((float)Math.PI * 2 - f2) * 0.2f);
        n6 = Math.round((float)n6 * oy.b(f2));
        if (n6 < 0) {
            n6 = 0;
        }
        if (n6 > 15) {
            n6 = 15;
        }
        if (n5 != n6) {
            afs2.a(n2, n3, n4, n6, 3);
        }
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
    public boolean f() {
        return true;
    }

    @Override
    public ani a(afs afs2, int n2) {
        return new anr();
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 1) {
            return this.a[0];
        }
        return this.a[1];
    }

    @Override
    public void a(px px2) {
        this.a[0] = px2.a(this.N() + "_top");
        this.a[1] = px2.a(this.N() + "_side");
    }
}

