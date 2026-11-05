/*
 * Decompiled with CFR 0.152.
 */
public class tx
extends sz {
    private uz a;
    private double b;
    private double c;
    private double d;
    private double e;

    public tx(uz uz2, double d2) {
        this.a = uz2;
        this.b = d2;
        this.a(1);
    }

    @Override
    public boolean a() {
        if (this.a.cc() || this.a.l == null) {
            return false;
        }
        ayp ayp2 = uo.a(this.a, 5, 4);
        if (ayp2 == null) {
            return false;
        }
        this.c = ayp2.c;
        this.d = ayp2.d;
        this.e = ayp2.e;
        return true;
    }

    @Override
    public void c() {
        this.a.m().a(this.c, this.d, this.e, this.b);
    }

    @Override
    public boolean b() {
        return !this.a.m().g() && this.a.l != null;
    }

    @Override
    public void e() {
        if (this.a.aH().nextInt(50) == 0) {
            if (this.a.l instanceof xq) {
                int n2 = this.a.cq();
                int n3 = this.a.cw();
                if (n3 > 0 && this.a.aH().nextInt(n3) < n2) {
                    this.a.h((xq)this.a.l);
                    this.a.o.a((qr)this.a, (byte)7);
                    return;
                }
                this.a.v(5);
            }
            this.a.l.a((qr)null);
            this.a.l = null;
            this.a.cJ();
            this.a.o.a((qr)this.a, (byte)6);
        }
    }
}

