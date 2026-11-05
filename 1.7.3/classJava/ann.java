/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ann
extends ani
implements ps {
    private abu[] p = new abu[36];
    public boolean a;
    public ann i;
    public ann j;
    public ann k;
    public ann l;
    public float m;
    public float n;
    public int o;
    private int q;
    private int r;
    private String s;

    public ann() {
        this.r = -1;
    }

    public ann(int n2) {
        this.r = n2;
    }

    @Override
    public int a() {
        return 27;
    }

    @Override
    public abu a(int n2) {
        return this.p[n2];
    }

    @Override
    public abu a(int n2, int n3) {
        if (this.p[n2] != null) {
            if (this.p[n2].b <= n3) {
                abu abu2 = this.p[n2];
                this.p[n2] = null;
                this.e();
                return abu2;
            }
            abu abu3 = this.p[n2].a(n3);
            if (this.p[n2].b == 0) {
                this.p[n2] = null;
            }
            this.e();
            return abu3;
        }
        return null;
    }

    @Override
    public abu a_(int n2) {
        if (this.p[n2] != null) {
            abu abu2 = this.p[n2];
            this.p[n2] = null;
            return abu2;
        }
        return null;
    }

    @Override
    public void a(int n2, abu abu2) {
        this.p[n2] = abu2;
        if (abu2 != null && abu2.b > this.d()) {
            abu2.b = this.d();
        }
        this.e();
    }

    @Override
    public String b() {
        return this.k_() ? this.s : "container.chest";
    }

    @Override
    public boolean k_() {
        return this.s != null && this.s.length() > 0;
    }

    public void a(String string) {
        this.s = string;
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        dp dp2 = dg2.c("Items", 10);
        this.p = new abu[this.a()];
        if (dg2.b("CustomName", 8)) {
            this.s = dg2.j("CustomName");
        }
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            dg dg3 = dp2.b(i2);
            int n2 = dg3.d("Slot") & 0xFF;
            if (n2 < 0 || n2 >= this.p.length) continue;
            this.p[n2] = abu.a(dg3);
        }
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dp dp2 = new dp();
        for (int i2 = 0; i2 < this.p.length; ++i2) {
            if (this.p[i2] == null) continue;
            dg dg3 = new dg();
            dg3.a("Slot", (byte)i2);
            this.p[i2].b(dg3);
            dp2.a(dg3);
        }
        dg2.a("Items", dp2);
        if (this.k_()) {
            dg2.a("CustomName", this.s);
        }
    }

    @Override
    public int d() {
        return 64;
    }

    @Override
    public boolean a(xq xq2) {
        if (this.b.o(this.c, this.d, this.e) != this) {
            return false;
        }
        return !(xq2.e((double)this.c + 0.5, (double)this.d + 0.5, (double)this.e + 0.5) > 64.0);
    }

    @Override
    public void u() {
        super.u();
        this.a = false;
    }

    private void a(ann ann2, int n2) {
        if (ann2.r()) {
            this.a = false;
        } else if (this.a) {
            switch (n2) {
                case 2: {
                    if (this.i == ann2) break;
                    this.a = false;
                    break;
                }
                case 0: {
                    if (this.l == ann2) break;
                    this.a = false;
                    break;
                }
                case 3: {
                    if (this.j == ann2) break;
                    this.a = false;
                    break;
                }
                case 1: {
                    if (this.k == ann2) break;
                    this.a = false;
                }
            }
        }
    }

    public void i() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        if (this.a(this.c - 1, this.d, this.e)) {
            this.k = (ann)this.b.o(this.c - 1, this.d, this.e);
        }
        if (this.a(this.c + 1, this.d, this.e)) {
            this.j = (ann)this.b.o(this.c + 1, this.d, this.e);
        }
        if (this.a(this.c, this.d, this.e - 1)) {
            this.i = (ann)this.b.o(this.c, this.d, this.e - 1);
        }
        if (this.a(this.c, this.d, this.e + 1)) {
            this.l = (ann)this.b.o(this.c, this.d, this.e + 1);
        }
        if (this.i != null) {
            this.i.a(this, 0);
        }
        if (this.l != null) {
            this.l.a(this, 2);
        }
        if (this.j != null) {
            this.j.a(this, 1);
        }
        if (this.k != null) {
            this.k.a(this, 3);
        }
    }

    private boolean a(int n2, int n3, int n4) {
        ahz ahz2 = this.b.a(n2, n3, n4);
        return ahz2 instanceof aio && ((aio)ahz2).a == this.j();
    }

    @Override
    public void h() {
        float f2;
        super.h();
        this.i();
        ++this.q;
        if (!this.b.E && this.o != 0 && (this.q + this.c + this.d + this.e) % 200 == 0) {
            this.o = 0;
            f2 = 5.0f;
            List list = this.b.a(xq.class, ayk.a().a((float)this.c - f2, (float)this.d - f2, (float)this.e - f2, (float)(this.c + 1) + f2, (float)(this.d + 1) + f2, (float)(this.e + 1) + f2));
            for (xq xq2 : list) {
                ps ps2;
                if (!(xq2.bo instanceof yu) || (ps2 = ((yu)xq2.bo).e()) != this && (!(ps2 instanceof pr) || !((pr)ps2).a(this))) continue;
                ++this.o;
            }
        }
        this.n = this.m;
        f2 = 0.1f;
        if (this.o > 0 && this.m == 0.0f && this.i == null && this.k == null) {
            double d2 = (double)this.c + 0.5;
            double d3 = (double)this.e + 0.5;
            if (this.l != null) {
                d3 += 0.5;
            }
            if (this.j != null) {
                d2 += 0.5;
            }
            this.b.a(d2, (double)this.d + 0.5, d3, "random.chestopen", 0.5f, this.b.s.nextFloat() * 0.1f + 0.9f);
        }
        if (this.o == 0 && this.m > 0.0f || this.o > 0 && this.m < 1.0f) {
            float f3;
            float f4 = this.m;
            this.m = this.o > 0 ? (this.m += f2) : (this.m -= f2);
            if (this.m > 1.0f) {
                this.m = 1.0f;
            }
            if (this.m < (f3 = 0.5f) && f4 >= f3 && this.i == null && this.k == null) {
                double d4 = (double)this.c + 0.5;
                double d5 = (double)this.e + 0.5;
                if (this.l != null) {
                    d5 += 0.5;
                }
                if (this.j != null) {
                    d4 += 0.5;
                }
                this.b.a(d4, (double)this.d + 0.5, d5, "random.chestclosed", 0.5f, this.b.s.nextFloat() * 0.1f + 0.9f);
            }
            if (this.m < 0.0f) {
                this.m = 0.0f;
            }
        }
    }

    @Override
    public boolean c(int n2, int n3) {
        if (n2 == 1) {
            this.o = n3;
            return true;
        }
        return super.c(n2, n3);
    }

    @Override
    public void f() {
        if (this.o < 0) {
            this.o = 0;
        }
        ++this.o;
        this.b.c(this.c, this.d, this.e, this.q(), 1, this.o);
        this.b.d(this.c, this.d, this.e, this.q());
        this.b.d(this.c, this.d - 1, this.e, this.q());
    }

    @Override
    public void l_() {
        if (this.q() instanceof aio) {
            --this.o;
            this.b.c(this.c, this.d, this.e, this.q(), 1, this.o);
            this.b.d(this.c, this.d, this.e, this.q());
            this.b.d(this.c, this.d - 1, this.e, this.q());
        }
    }

    @Override
    public boolean b(int n2, abu abu2) {
        return true;
    }

    @Override
    public void s() {
        super.s();
        this.u();
        this.i();
    }

    public int j() {
        if (this.r == -1) {
            if (this.b != null && this.q() instanceof aio) {
                this.r = ((aio)this.q()).a;
            } else {
                return 0;
            }
        }
        return this.r;
    }
}

