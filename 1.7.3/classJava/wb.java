/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class wb
extends qr {
    private static final Logger d = LogManager.getLogger();
    public int a;
    public int b;
    private int e = 5;
    private String f;
    private String g;
    public float c = (float)(Math.random() * Math.PI * 2.0);

    public wb(afs afs2, double d2, double d3, double d4) {
        super(afs2);
        this.a(0.25f, 0.25f);
        this.L = this.N / 2.0f;
        this.b(d2, d3, d4);
        this.y = (float)(Math.random() * 360.0);
        this.v = (float)(Math.random() * (double)0.2f - (double)0.1f);
        this.w = 0.2f;
        this.x = (float)(Math.random() * (double)0.2f - (double)0.1f);
    }

    public wb(afs afs2, double d2, double d3, double d4, abu abu2) {
        this(afs2, d2, d3, d4);
        this.a(abu2);
    }

    @Override
    protected boolean g_() {
        return false;
    }

    public wb(afs afs2) {
        super(afs2);
        this.a(0.25f, 0.25f);
        this.L = this.N / 2.0f;
    }

    @Override
    protected void c() {
        this.y().a(10, 5);
    }

    @Override
    public void h() {
        boolean bl2;
        if (this.f() == null) {
            this.A();
            return;
        }
        super.h();
        if (this.b > 0) {
            --this.b;
        }
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.w -= (double)0.04f;
        this.X = this.j(this.s, (this.C.b + this.C.e) / 2.0, this.u);
        this.d(this.v, this.w, this.x);
        boolean bl3 = bl2 = (int)this.p != (int)this.s || (int)this.q != (int)this.t || (int)this.r != (int)this.u;
        if (bl2 || this.aa % 25 == 0) {
            if (this.o.a(oy.c(this.s), oy.c(this.t), oy.c(this.u)).o() == avk.i) {
                this.w = 0.2f;
                this.v = (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2f;
                this.x = (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2f;
                this.a("random.fizz", 0.4f, 2.0f + this.Z.nextFloat() * 0.4f);
            }
            if (!this.o.E) {
                this.k();
            }
        }
        float f2 = 0.98f;
        if (this.D) {
            f2 = this.o.a((int)oy.c((double)this.s), (int)(oy.c((double)this.C.b) - 1), (int)oy.c((double)this.u)).K * 0.98f;
        }
        this.v *= (double)f2;
        this.w *= (double)0.98f;
        this.x *= (double)f2;
        if (this.D) {
            this.w *= -0.5;
        }
        ++this.a;
        if (!this.o.E && this.a >= 6000) {
            this.A();
        }
    }

    private void k() {
        for (wb wb2 : this.o.a(wb.class, this.C.b(0.5, 0.0, 0.5))) {
            this.a(wb2);
        }
    }

    public boolean a(wb wb2) {
        if (wb2 == this) {
            return false;
        }
        if (!wb2.Y() || !this.Y()) {
            return false;
        }
        abu abu2 = this.f();
        abu abu3 = wb2.f();
        if (abu3.b() != abu2.b()) {
            return false;
        }
        if (abu3.p() ^ abu2.p()) {
            return false;
        }
        if (abu3.p() && !abu3.q().equals(abu2.q())) {
            return false;
        }
        if (abu3.b() == null) {
            return false;
        }
        if (abu3.b().n() && abu3.k() != abu2.k()) {
            return false;
        }
        if (abu3.b < abu2.b) {
            return wb2.a(this);
        }
        if (abu3.b + abu2.b > abu3.e()) {
            return false;
        }
        abu3.b += abu2.b;
        wb2.b = Math.max(wb2.b, this.b);
        wb2.a = Math.min(wb2.a, this.a);
        wb2.a(abu3);
        this.A();
        return true;
    }

    public void e() {
        this.a = 4800;
    }

    @Override
    public boolean M() {
        return this.o.a(this.C, avk.h, (qr)this);
    }

    @Override
    protected void f(int n2) {
        this.a(qf.a, (float)n2);
    }

    @Override
    public boolean a(qf qf2, float f2) {
        if (this.av()) {
            return false;
        }
        if (this.f() != null && this.f().b() == abv.bN && qf2.c()) {
            return false;
        }
        this.P();
        this.e = (int)((float)this.e - f2);
        if (this.e <= 0) {
            this.A();
        }
        return false;
    }

    @Override
    public void b(dg dg2) {
        dg2.a("Health", (short)((byte)this.e));
        dg2.a("Age", (short)this.a);
        if (this.j() != null) {
            dg2.a("Thrower", this.f);
        }
        if (this.i() != null) {
            dg2.a("Owner", this.g);
        }
        if (this.f() != null) {
            dg2.a("Item", this.f().b(new dg()));
        }
    }

    @Override
    public void a(dg dg2) {
        this.e = dg2.e("Health") & 0xFF;
        this.a = dg2.e("Age");
        if (dg2.c("Owner")) {
            this.g = dg2.j("Owner");
        }
        if (dg2.c("Thrower")) {
            this.f = dg2.j("Thrower");
        }
        dg dg3 = dg2.m("Item");
        this.a(abu.a(dg3));
        if (this.f() == null) {
            this.A();
        }
    }

    @Override
    public void b_(xq xq2) {
        if (this.o.E) {
            return;
        }
        abu abu2 = this.f();
        int n2 = abu2.b;
        if (this.b == 0 && (this.g == null || 6000 - this.a <= 200 || this.g.equals(xq2.b_())) && xq2.bm.a(abu2)) {
            xq xq3;
            if (abu2.b() == abs.a(aie.r)) {
                xq2.a(nt.g);
            }
            if (abu2.b() == abs.a(aie.s)) {
                xq2.a(nt.g);
            }
            if (abu2.b() == abv.aA) {
                xq2.a(nt.t);
            }
            if (abu2.b() == abv.i) {
                xq2.a(nt.w);
            }
            if (abu2.b() == abv.bj) {
                xq2.a(nt.A);
            }
            if (abu2.b() == abv.i && this.j() != null && (xq3 = this.o.a(this.j())) != null && xq3 != xq2) {
                xq3.a(nt.x);
            }
            this.o.a((qr)xq2, "random.pop", 0.2f, ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            xq2.a((qr)this, n2);
            if (abu2.b <= 0) {
                this.A();
            }
        }
    }

    @Override
    public String b_() {
        return dc.a("item." + this.f().a());
    }

    @Override
    public boolean au() {
        return false;
    }

    @Override
    public void b(int n2) {
        super.b(n2);
        if (!this.o.E) {
            this.k();
        }
    }

    public abu f() {
        abu abu2 = this.y().f(10);
        if (abu2 == null) {
            if (this.o != null) {
                d.error("Item entity " + this.x() + " has no item?!");
            }
            return new abu(aie.b);
        }
        return abu2;
    }

    public void a(abu abu2) {
        this.y().b(10, abu2);
        this.y().h(10);
    }

    public String i() {
        return this.g;
    }

    public void a(String string) {
        this.g = string;
    }

    public String j() {
        return this.f;
    }

    public void b(String string) {
        this.f = string;
    }
}

