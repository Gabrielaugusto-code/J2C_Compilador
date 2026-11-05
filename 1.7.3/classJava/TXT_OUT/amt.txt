/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class amt
extends ahz {
    protected amt() {
        super(avk.q);
        this.a(true);
        this.a(aak.c);
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
    public int b() {
        return 2;
    }

    private boolean m(afs afs2, int n2, int n3, int n4) {
        if (afs.a(afs2, n2, n3, n4)) {
            return true;
        }
        ahz ahz2 = afs2.a(n2, n3, n4);
        return ahz2 == aie.aJ || ahz2 == aie.bk || ahz2 == aie.w || ahz2 == aie.bK;
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        if (afs2.c(n2 - 1, n3, n4, true)) {
            return true;
        }
        if (afs2.c(n2 + 1, n3, n4, true)) {
            return true;
        }
        if (afs2.c(n2, n3, n4 - 1, true)) {
            return true;
        }
        if (afs2.c(n2, n3, n4 + 1, true)) {
            return true;
        }
        return this.m(afs2, n2, n3 - 1, n4);
    }

    @Override
    public int a(afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4, int n6) {
        int n7 = n6;
        if (n5 == 1 && this.m(afs2, n2, n3 - 1, n4)) {
            n7 = 5;
        }
        if (n5 == 2 && afs2.c(n2, n3, n4 + 1, true)) {
            n7 = 4;
        }
        if (n5 == 3 && afs2.c(n2, n3, n4 - 1, true)) {
            n7 = 3;
        }
        if (n5 == 4 && afs2.c(n2 + 1, n3, n4, true)) {
            n7 = 2;
        }
        if (n5 == 5 && afs2.c(n2 - 1, n3, n4, true)) {
            n7 = 1;
        }
        return n7;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        super.a(afs2, n2, n3, n4, random);
        if (afs2.e(n2, n3, n4) == 0) {
            this.b(afs2, n2, n3, n4);
        }
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        if (afs2.e(n2, n3, n4) == 0) {
            if (afs2.c(n2 - 1, n3, n4, true)) {
                afs2.a(n2, n3, n4, 1, 2);
            } else if (afs2.c(n2 + 1, n3, n4, true)) {
                afs2.a(n2, n3, n4, 2, 2);
            } else if (afs2.c(n2, n3, n4 - 1, true)) {
                afs2.a(n2, n3, n4, 3, 2);
            } else if (afs2.c(n2, n3, n4 + 1, true)) {
                afs2.a(n2, n3, n4, 4, 2);
            } else if (this.m(afs2, n2, n3 - 1, n4)) {
                afs2.a(n2, n3, n4, 5, 2);
            }
        }
        this.e(afs2, n2, n3, n4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        this.b(afs2, n2, n3, n4, ahz2);
    }

    protected boolean b(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        if (this.e(afs2, n2, n3, n4)) {
            int n5 = afs2.e(n2, n3, n4);
            boolean bl2 = false;
            if (!afs2.c(n2 - 1, n3, n4, true) && n5 == 1) {
                bl2 = true;
            }
            if (!afs2.c(n2 + 1, n3, n4, true) && n5 == 2) {
                bl2 = true;
            }
            if (!afs2.c(n2, n3, n4 - 1, true) && n5 == 3) {
                bl2 = true;
            }
            if (!afs2.c(n2, n3, n4 + 1, true) && n5 == 4) {
                bl2 = true;
            }
            if (!this.m(afs2, n2, n3 - 1, n4) && n5 == 5) {
                bl2 = true;
            }
            if (bl2) {
                this.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
                afs2.f(n2, n3, n4);
                return true;
            }
        } else {
            return true;
        }
        return false;
    }

    protected boolean e(afs afs2, int n2, int n3, int n4) {
        if (!this.c(afs2, n2, n3, n4)) {
            if (afs2.a(n2, n3, n4) == this) {
                this.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
                afs2.f(n2, n3, n4);
            }
            return false;
        }
        return true;
    }

    @Override
    public ayn a(afs afs2, int n2, int n3, int n4, ayp ayp2, ayp ayp3) {
        int n5 = afs2.e(n2, n3, n4) & 7;
        float f2 = 0.15f;
        if (n5 == 1) {
            this.a(0.0f, 0.2f, 0.5f - f2, f2 * 2.0f, 0.8f, 0.5f + f2);
        } else if (n5 == 2) {
            this.a(1.0f - f2 * 2.0f, 0.2f, 0.5f - f2, 1.0f, 0.8f, 0.5f + f2);
        } else if (n5 == 3) {
            this.a(0.5f - f2, 0.2f, 0.0f, 0.5f + f2, 0.8f, f2 * 2.0f);
        } else if (n5 == 4) {
            this.a(0.5f - f2, 0.2f, 1.0f - f2 * 2.0f, 0.5f + f2, 0.8f, 1.0f);
        } else {
            f2 = 0.1f;
            this.a(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, 0.6f, 0.5f + f2);
        }
        return super.a(afs2, n2, n3, n4, ayp2, ayp3);
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, Random random) {
        int n5 = afs2.e(n2, n3, n4);
        double d2 = (float)n2 + 0.5f;
        double d3 = (float)n3 + 0.7f;
        double d4 = (float)n4 + 0.5f;
        double d5 = 0.22f;
        double d6 = 0.27f;
        if (n5 == 1) {
            afs2.a("smoke", d2 - d6, d3 + d5, d4, 0.0, 0.0, 0.0);
            afs2.a("flame", d2 - d6, d3 + d5, d4, 0.0, 0.0, 0.0);
        } else if (n5 == 2) {
            afs2.a("smoke", d2 + d6, d3 + d5, d4, 0.0, 0.0, 0.0);
            afs2.a("flame", d2 + d6, d3 + d5, d4, 0.0, 0.0, 0.0);
        } else if (n5 == 3) {
            afs2.a("smoke", d2, d3 + d5, d4 - d6, 0.0, 0.0, 0.0);
            afs2.a("flame", d2, d3 + d5, d4 - d6, 0.0, 0.0, 0.0);
        } else if (n5 == 4) {
            afs2.a("smoke", d2, d3 + d5, d4 + d6, 0.0, 0.0, 0.0);
            afs2.a("flame", d2, d3 + d5, d4 + d6, 0.0, 0.0, 0.0);
        } else {
            afs2.a("smoke", d2, d3, d4, 0.0, 0.0, 0.0);
            afs2.a("flame", d2, d3, d4, 0.0, 0.0, 0.0);
        }
    }
}

