/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class amr
extends ahz {
    private final String a;
    private final boolean b;
    private final String M;
    private pw N;

    protected amr(String string, String string2, avk avk2, boolean bl2) {
        super(avk2);
        this.a = string2;
        this.b = bl2;
        this.M = string;
        this.a(aak.c);
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        if (!this.b) {
            return null;
        }
        return super.a(n2, random, n3);
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
    public int b() {
        return this.J == avk.s ? 41 : 18;
    }

    @Override
    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        if (agc2.a(n2, n3, n4) == this) {
            return false;
        }
        return super.a(agc2, n2, n3, n4, n5);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ayk ayk2, List list, qr qr2) {
        boolean bl2 = this.a(afs2.a(n2, n3, n4 - 1));
        boolean bl3 = this.a(afs2.a(n2, n3, n4 + 1));
        boolean bl4 = this.a(afs2.a(n2 - 1, n3, n4));
        boolean bl5 = this.a(afs2.a(n2 + 1, n3, n4));
        if (bl4 && bl5 || !bl4 && !bl5 && !bl2 && !bl3) {
            this.a(0.0f, 0.0f, 0.4375f, 1.0f, 1.0f, 0.5625f);
            super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        } else if (bl4 && !bl5) {
            this.a(0.0f, 0.0f, 0.4375f, 0.5f, 1.0f, 0.5625f);
            super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        } else if (!bl4 && bl5) {
            this.a(0.5f, 0.0f, 0.4375f, 1.0f, 1.0f, 0.5625f);
            super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        }
        if (bl2 && bl3 || !bl4 && !bl5 && !bl2 && !bl3) {
            this.a(0.4375f, 0.0f, 0.0f, 0.5625f, 1.0f, 1.0f);
            super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        } else if (bl2 && !bl3) {
            this.a(0.4375f, 0.0f, 0.0f, 0.5625f, 1.0f, 0.5f);
            super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        } else if (!bl2 && bl3) {
            this.a(0.4375f, 0.0f, 0.5f, 0.5625f, 1.0f, 1.0f);
            super.a(afs2, n2, n3, n4, ayk2, list, qr2);
        }
    }

    @Override
    public void g() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        float f2 = 0.4375f;
        float f3 = 0.5625f;
        float f4 = 0.4375f;
        float f5 = 0.5625f;
        boolean bl2 = this.a(agc2.a(n2, n3, n4 - 1));
        boolean bl3 = this.a(agc2.a(n2, n3, n4 + 1));
        boolean bl4 = this.a(agc2.a(n2 - 1, n3, n4));
        boolean bl5 = this.a(agc2.a(n2 + 1, n3, n4));
        if (bl4 && bl5 || !bl4 && !bl5 && !bl2 && !bl3) {
            f2 = 0.0f;
            f3 = 1.0f;
        } else if (bl4 && !bl5) {
            f2 = 0.0f;
        } else if (!bl4 && bl5) {
            f3 = 1.0f;
        }
        if (bl2 && bl3 || !bl4 && !bl5 && !bl2 && !bl3) {
            f4 = 0.0f;
            f5 = 1.0f;
        } else if (bl2 && !bl3) {
            f4 = 0.0f;
        } else if (!bl2 && bl3) {
            f5 = 1.0f;
        }
        this.a(f2, 0.0f, f4, f3, 1.0f, f5);
    }

    public pw e() {
        return this.N;
    }

    public final boolean a(ahz ahz2) {
        return ahz2.j() || ahz2 == this || ahz2 == aie.w || ahz2 == aie.cn || ahz2 == aie.co || ahz2 instanceof amr;
    }

    @Override
    protected boolean E() {
        return true;
    }

    @Override
    protected abu j(int n2) {
        return new abu(abs.a(this), 1, n2);
    }

    @Override
    public void a(px px2) {
        this.L = px2.a(this.M);
        this.N = px2.a(this.a);
    }
}

