/*
 * Decompiled with CFR 0.152.
 */
public class tq
extends sz {
    private ru a;
    private double b;
    private double c;
    private double d;
    private double e;

    public tq(ru ru2, double d2) {
        this.a = ru2;
        this.b = d2;
        this.a(1);
    }

    @Override
    public boolean a() {
        if (this.a.aI() == null && !this.a.ak()) {
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
        return !this.a.m().g();
    }
}

