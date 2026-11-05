/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class amb
extends aht {
    private Class a;
    private boolean b;

    protected amb(Class clazz, boolean bl2) {
        super(avk.d);
        this.b = bl2;
        this.a = clazz;
        float f2 = 0.25f;
        float f3 = 1.0f;
        this.a(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, f3, 0.5f + f2);
    }

    @Override
    public pw a(int n2, int n3) {
        return aie.f.h(n2);
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        return null;
    }

    @Override
    public ayk g(afs afs2, int n2, int n3, int n4) {
        this.a((agc)afs2, n2, n3, n4);
        return super.g(afs2, n2, n3, n4);
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        if (this.b) {
            return;
        }
        int n5 = agc2.e(n2, n3, n4);
        float f2 = 0.28125f;
        float f3 = 0.78125f;
        float f4 = 0.0f;
        float f5 = 1.0f;
        float f6 = 0.125f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        if (n5 == 2) {
            this.a(f4, f2, 1.0f - f6, f5, f3, 1.0f);
        }
        if (n5 == 3) {
            this.a(f4, f2, 0.0f, f5, f3, f6);
        }
        if (n5 == 4) {
            this.a(1.0f - f6, f2, f4, 1.0f, f3, f5);
        }
        if (n5 == 5) {
            this.a(0.0f, f2, f4, f6, f3, f5);
        }
    }

    @Override
    public int b() {
        return -1;
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
    public boolean c() {
        return false;
    }

    @Override
    public ani a(afs afs2, int n2) {
        try {
            return (ani)this.a.newInstance();
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abv.ap;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        boolean bl2 = false;
        if (this.b) {
            if (!afs2.a(n2, n3 - 1, n4).o().a()) {
                bl2 = true;
            }
        } else {
            int n5 = afs2.e(n2, n3, n4);
            bl2 = true;
            if (n5 == 2 && afs2.a(n2, n3, n4 + 1).o().a()) {
                bl2 = false;
            }
            if (n5 == 3 && afs2.a(n2, n3, n4 - 1).o().a()) {
                bl2 = false;
            }
            if (n5 == 4 && afs2.a(n2 + 1, n3, n4).o().a()) {
                bl2 = false;
            }
            if (n5 == 5 && afs2.a(n2 - 1, n3, n4).o().a()) {
                bl2 = false;
            }
        }
        if (bl2) {
            this.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
            afs2.f(n2, n3, n4);
        }
        super.a(afs2, n2, n3, n4, ahz2);
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abv.ap;
    }

    @Override
    public void a(px px2) {
    }
}

