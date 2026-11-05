/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aio
extends aht {
    private final Random b = new Random();
    public final int a;

    protected aio(int n2) {
        super(avk.d);
        this.a = n2;
        this.a(aak.c);
        this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
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
        return 22;
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        if (agc2.a(n2, n3, n4 - 1) == this) {
            this.a(0.0625f, 0.0f, 0.0f, 0.9375f, 0.875f, 0.9375f);
        } else if (agc2.a(n2, n3, n4 + 1) == this) {
            this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 1.0f);
        } else if (agc2.a(n2 - 1, n3, n4) == this) {
            this.a(0.0f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
        } else if (agc2.a(n2 + 1, n3, n4) == this) {
            this.a(0.0625f, 0.0f, 0.0625f, 1.0f, 0.875f, 0.9375f);
        } else {
            this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
        }
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        super.b(afs2, n2, n3, n4);
        this.e(afs2, n2, n3, n4);
        ahz ahz2 = afs2.a(n2, n3, n4 - 1);
        ahz ahz3 = afs2.a(n2, n3, n4 + 1);
        ahz ahz4 = afs2.a(n2 - 1, n3, n4);
        ahz ahz5 = afs2.a(n2 + 1, n3, n4);
        if (ahz2 == this) {
            this.e(afs2, n2, n3, n4 - 1);
        }
        if (ahz3 == this) {
            this.e(afs2, n2, n3, n4 + 1);
        }
        if (ahz4 == this) {
            this.e(afs2, n2 - 1, n3, n4);
        }
        if (ahz5 == this) {
            this.e(afs2, n2 + 1, n3, n4);
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        ahz ahz2 = afs2.a(n2, n3, n4 - 1);
        ahz ahz3 = afs2.a(n2, n3, n4 + 1);
        ahz ahz4 = afs2.a(n2 - 1, n3, n4);
        ahz ahz5 = afs2.a(n2 + 1, n3, n4);
        int n5 = 0;
        int n6 = oy.c((double)(rm2.y * 4.0f / 360.0f) + 0.5) & 3;
        if (n6 == 0) {
            n5 = 2;
        }
        if (n6 == 1) {
            n5 = 5;
        }
        if (n6 == 2) {
            n5 = 3;
        }
        if (n6 == 3) {
            n5 = 4;
        }
        if (ahz2 != this && ahz3 != this && ahz4 != this && ahz5 != this) {
            afs2.a(n2, n3, n4, n5, 3);
        } else {
            if (!(ahz2 != this && ahz3 != this || n5 != 4 && n5 != 5)) {
                if (ahz2 == this) {
                    afs2.a(n2, n3, n4 - 1, n5, 3);
                } else {
                    afs2.a(n2, n3, n4 + 1, n5, 3);
                }
                afs2.a(n2, n3, n4, n5, 3);
            }
            if (!(ahz4 != this && ahz5 != this || n5 != 2 && n5 != 3)) {
                if (ahz4 == this) {
                    afs2.a(n2 - 1, n3, n4, n5, 3);
                } else {
                    afs2.a(n2 + 1, n3, n4, n5, 3);
                }
                afs2.a(n2, n3, n4, n5, 3);
            }
        }
        if (abu2.u()) {
            ((ann)afs2.o(n2, n3, n4)).a(abu2.s());
        }
    }

    public void e(afs afs2, int n2, int n3, int n4) {
        if (afs2.E) {
            return;
        }
        ahz ahz2 = afs2.a(n2, n3, n4 - 1);
        ahz ahz3 = afs2.a(n2, n3, n4 + 1);
        ahz ahz4 = afs2.a(n2 - 1, n3, n4);
        ahz ahz5 = afs2.a(n2 + 1, n3, n4);
        int n5 = 4;
        if (ahz2 == this || ahz3 == this) {
            int n6 = ahz2 == this ? n4 - 1 : n4 + 1;
            ahz ahz6 = afs2.a(n2 - 1, n3, n6);
            int n7 = ahz2 == this ? n4 - 1 : n4 + 1;
            ahz ahz7 = afs2.a(n2 + 1, n3, n7);
            n5 = 5;
            int n8 = -1;
            n8 = ahz2 == this ? afs2.e(n2, n3, n4 - 1) : afs2.e(n2, n3, n4 + 1);
            if (n8 == 4) {
                n5 = 4;
            }
            if ((ahz4.j() || ahz6.j()) && !ahz5.j() && !ahz7.j()) {
                n5 = 5;
            }
            if ((ahz5.j() || ahz7.j()) && !ahz4.j() && !ahz6.j()) {
                n5 = 4;
            }
        } else if (ahz4 == this || ahz5 == this) {
            int n9 = ahz4 == this ? n2 - 1 : n2 + 1;
            ahz ahz8 = afs2.a(n9, n3, n4 - 1);
            int n10 = ahz4 == this ? n2 - 1 : n2 + 1;
            ahz ahz9 = afs2.a(n10, n3, n4 + 1);
            n5 = 3;
            int n11 = -1;
            n11 = ahz4 == this ? afs2.e(n2 - 1, n3, n4) : afs2.e(n2 + 1, n3, n4);
            if (n11 == 2) {
                n5 = 2;
            }
            if ((ahz2.j() || ahz8.j()) && !ahz3.j() && !ahz9.j()) {
                n5 = 3;
            }
            if ((ahz3.j() || ahz9.j()) && !ahz2.j() && !ahz8.j()) {
                n5 = 2;
            }
        } else {
            n5 = 3;
            if (ahz2.j() && !ahz3.j()) {
                n5 = 3;
            }
            if (ahz3.j() && !ahz2.j()) {
                n5 = 2;
            }
            if (ahz4.j() && !ahz5.j()) {
                n5 = 5;
            }
            if (ahz5.j() && !ahz4.j()) {
                n5 = 4;
            }
        }
        afs2.a(n2, n3, n4, n5, 3);
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        int n5 = 0;
        if (afs2.a(n2 - 1, n3, n4) == this) {
            ++n5;
        }
        if (afs2.a(n2 + 1, n3, n4) == this) {
            ++n5;
        }
        if (afs2.a(n2, n3, n4 - 1) == this) {
            ++n5;
        }
        if (afs2.a(n2, n3, n4 + 1) == this) {
            ++n5;
        }
        if (n5 > 1) {
            return false;
        }
        if (this.n(afs2, n2 - 1, n3, n4)) {
            return false;
        }
        if (this.n(afs2, n2 + 1, n3, n4)) {
            return false;
        }
        if (this.n(afs2, n2, n3, n4 - 1)) {
            return false;
        }
        return !this.n(afs2, n2, n3, n4 + 1);
    }

    private boolean n(afs afs2, int n2, int n3, int n4) {
        if (afs2.a(n2, n3, n4) != this) {
            return false;
        }
        if (afs2.a(n2 - 1, n3, n4) == this) {
            return true;
        }
        if (afs2.a(n2 + 1, n3, n4) == this) {
            return true;
        }
        if (afs2.a(n2, n3, n4 - 1) == this) {
            return true;
        }
        return afs2.a(n2, n3, n4 + 1) == this;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        super.a(afs2, n2, n3, n4, ahz2);
        ann ann2 = (ann)afs2.o(n2, n3, n4);
        if (ann2 != null) {
            ann2.u();
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        ann ann2 = (ann)afs2.o(n2, n3, n4);
        if (ann2 != null) {
            for (int i2 = 0; i2 < ann2.a(); ++i2) {
                abu abu2 = ann2.a(i2);
                if (abu2 == null) continue;
                float f2 = this.b.nextFloat() * 0.8f + 0.1f;
                float f3 = this.b.nextFloat() * 0.8f + 0.1f;
                float f4 = this.b.nextFloat() * 0.8f + 0.1f;
                while (abu2.b > 0) {
                    int n6 = this.b.nextInt(21) + 10;
                    if (n6 > abu2.b) {
                        n6 = abu2.b;
                    }
                    abu2.b -= n6;
                    wb wb2 = new wb(afs2, (float)n2 + f2, (float)n3 + f3, (float)n4 + f4, new abu(abu2.b(), n6, abu2.k()));
                    float f5 = 0.05f;
                    wb2.v = (float)this.b.nextGaussian() * f5;
                    wb2.w = (float)this.b.nextGaussian() * f5 + 0.2f;
                    wb2.x = (float)this.b.nextGaussian() * f5;
                    if (abu2.p()) {
                        wb2.f().d((dg)abu2.q().b());
                    }
                    afs2.d(wb2);
                }
            }
            afs2.f(n2, n3, n4, ahz2);
        }
        super.a(afs2, n2, n3, n4, ahz2, n5);
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        if (afs2.E) {
            return true;
        }
        ps ps2 = this.m(afs2, n2, n3, n4);
        if (ps2 != null) {
            xq2.a(ps2);
        }
        return true;
    }

    public ps m(afs afs2, int n2, int n3, int n4) {
        ps ps2 = (ann)afs2.o(n2, n3, n4);
        if (ps2 == null) {
            return null;
        }
        if (afs2.a(n2, n3 + 1, n4).r()) {
            return null;
        }
        if (aio.o(afs2, n2, n3, n4)) {
            return null;
        }
        if (afs2.a(n2 - 1, n3, n4) == this && (afs2.a(n2 - 1, n3 + 1, n4).r() || aio.o(afs2, n2 - 1, n3, n4))) {
            return null;
        }
        if (afs2.a(n2 + 1, n3, n4) == this && (afs2.a(n2 + 1, n3 + 1, n4).r() || aio.o(afs2, n2 + 1, n3, n4))) {
            return null;
        }
        if (afs2.a(n2, n3, n4 - 1) == this && (afs2.a(n2, n3 + 1, n4 - 1).r() || aio.o(afs2, n2, n3, n4 - 1))) {
            return null;
        }
        if (afs2.a(n2, n3, n4 + 1) == this && (afs2.a(n2, n3 + 1, n4 + 1).r() || aio.o(afs2, n2, n3, n4 + 1))) {
            return null;
        }
        if (afs2.a(n2 - 1, n3, n4) == this) {
            ps2 = new pr("container.chestDouble", (ann)afs2.o(n2 - 1, n3, n4), ps2);
        }
        if (afs2.a(n2 + 1, n3, n4) == this) {
            ps2 = new pr("container.chestDouble", ps2, (ann)afs2.o(n2 + 1, n3, n4));
        }
        if (afs2.a(n2, n3, n4 - 1) == this) {
            ps2 = new pr("container.chestDouble", (ann)afs2.o(n2, n3, n4 - 1), ps2);
        }
        if (afs2.a(n2, n3, n4 + 1) == this) {
            ps2 = new pr("container.chestDouble", ps2, (ann)afs2.o(n2, n3, n4 + 1));
        }
        return ps2;
    }

    @Override
    public ani a(afs afs2, int n2) {
        ann ann2 = new ann();
        return ann2;
    }

    @Override
    public boolean f() {
        return this.a == 1;
    }

    @Override
    public int b(agc agc2, int n2, int n3, int n4, int n5) {
        if (!this.f()) {
            return 0;
        }
        int n6 = ((ann)agc2.o((int)n2, (int)n3, (int)n4)).o;
        return oy.a(n6, 0, 15);
    }

    @Override
    public int c(agc agc2, int n2, int n3, int n4, int n5) {
        if (n5 == 1) {
            return this.b(agc2, n2, n3, n4, n5);
        }
        return 0;
    }

    private static boolean o(afs afs2, int n2, int n3, int n4) {
        for (ve ve2 : afs2.a(ve.class, ayk.a().a(n2, n3 + 1, n4, n2 + 1, n3 + 2, n4 + 1))) {
            ve ve3 = ve2;
            if (!ve3.ca()) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean M() {
        return true;
    }

    @Override
    public int g(afs afs2, int n2, int n3, int n4, int n5) {
        return yj.b(this.m(afs2, n2, n3, n4));
    }

    @Override
    public void a(px px2) {
        this.L = px2.a("planks_oak");
    }
}

