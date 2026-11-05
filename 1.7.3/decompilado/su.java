/*
 * Decompiled with CFR 0.152.
 */
public class su
extends sz {
    private rn b;
    private afs c;
    int a;

    public su(rn rn2) {
        this.b = rn2;
        this.c = rn2.o;
        this.a(7);
    }

    @Override
    public boolean a() {
        int n2;
        int n3;
        if (this.b.aH().nextInt(this.b.f() ? 50 : 1000) != 0) {
            return false;
        }
        int n4 = oy.c(this.b.s);
        if (this.c.a(n4, n3 = oy.c(this.b.t), n2 = oy.c(this.b.u)) == aie.H && this.c.e(n4, n3, n2) == 1) {
            return true;
        }
        return this.c.a(n4, n3 - 1, n2) == aie.c;
    }

    @Override
    public void c() {
        this.a = 40;
        this.c.a((qr)this.b, (byte)10);
        this.b.m().h();
    }

    @Override
    public void d() {
        this.a = 0;
    }

    @Override
    public boolean b() {
        return this.a > 0;
    }

    public int f() {
        return this.a;
    }

    @Override
    public void e() {
        int n2;
        int n3;
        this.a = Math.max(0, this.a - 1);
        if (this.a != 4) {
            return;
        }
        int n4 = oy.c(this.b.s);
        if (this.c.a(n4, n3 = oy.c(this.b.t), n2 = oy.c(this.b.u)) == aie.H) {
            if (this.c.O().b("mobGriefing")) {
                this.c.a(n4, n3, n2, false);
            }
            this.b.p();
        } else if (this.c.a(n4, n3 - 1, n2) == aie.c) {
            if (this.c.O().b("mobGriefing")) {
                this.c.c(2001, n4, n3 - 1, n2, ahz.b(aie.c));
                this.c.d(n4, n3 - 1, n2, aie.d, 0, 2);
            }
            this.b.p();
        }
    }
}

