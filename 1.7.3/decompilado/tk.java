/*
 * Decompiled with CFR 0.152.
 */
public class tk
extends sz {
    private ru a;
    private double b;
    private double c;
    private double d;
    private double e;

    public tk(ru ru2, double d2) {
        this.a = ru2;
        this.e = d2;
        this.a(1);
    }

    @Override
    public boolean a() {
        if (this.a.bU()) {
            return false;
        }
        r r2 = this.a.bV();
        ayp ayp2 = uo.a(this.a, 16, 7, this.a.o.V().a(r2.a, r2.b, r2.c));
        if (ayp2 == null) {
            return false;
        }
        this.b = ayp2.c;
        this.c = ayp2.d;
        this.d = ayp2.e;
        return true;
    }

    @Override
    public boolean b() {
        return !this.a.m().g();
    }

    @Override
    public void c() {
        this.a.m().a(this.b, this.c, this.d, this.e);
    }
}

