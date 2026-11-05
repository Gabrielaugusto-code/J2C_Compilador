/*
 * Decompiled with CFR 0.152.
 */
public class yg
extends xv {
    public yg(afs afs2) {
        super(afs2);
        this.a(0.3125f, 0.3125f);
    }

    public yg(afs afs2, rm rm2, double d2, double d3, double d4) {
        super(afs2, rm2, d2, d3, d4);
        this.a(0.3125f, 0.3125f);
    }

    @Override
    protected float e() {
        return this.f() ? 0.73f : super.e();
    }

    public yg(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(afs2, d2, d3, d4, d5, d6, d7);
        this.a(0.3125f, 0.3125f);
    }

    @Override
    public boolean ak() {
        return false;
    }

    @Override
    public float a(afn afn2, afs afs2, int n2, int n3, int n4, ahz ahz2) {
        float f2 = super.a(afn2, afs2, n2, n3, n4, ahz2);
        if (this.f() && ahz2 != aie.h && ahz2 != aie.bq && ahz2 != aie.br && ahz2 != aie.bI) {
            f2 = Math.min(0.8f, f2);
        }
        return f2;
    }

    @Override
    protected void a(ayn ayn2) {
        if (!this.o.E) {
            if (ayn2.g != null) {
                if (this.a != null) {
                    if (ayn2.g.a(qf.a(this.a), 8.0f) && !ayn2.g.Y()) {
                        this.a.f(5.0f);
                    }
                } else {
                    ayn2.g.a(qf.k, 5.0f);
                }
                if (ayn2.g instanceof rm) {
                    int n2 = 0;
                    if (this.o.r == pu.c) {
                        n2 = 10;
                    } else if (this.o.r == pu.d) {
                        n2 = 40;
                    }
                    if (n2 > 0) {
                        ((rm)ayn2.g).c(new qn(qm.v.H, 20 * n2, 1));
                    }
                }
            }
            this.o.a((qr)this, this.s, this.t, this.u, 1.0f, false, this.o.O().b("mobGriefing"));
            this.A();
        }
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean a(qf qf2, float f2) {
        return false;
    }

    @Override
    protected void c() {
        this.af.a(10, (Object)0);
    }

    public boolean f() {
        return this.af.a(10) == 1;
    }

    public void a(boolean bl2) {
        this.af.b(10, bl2 ? (byte)1 : 0);
    }
}

