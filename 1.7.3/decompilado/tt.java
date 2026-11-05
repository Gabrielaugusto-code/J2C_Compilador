/*
 * Decompiled with CFR 0.152.
 */
public class tt
extends sz {
    private ru a;
    private double b;
    private double c;
    private double d;
    private double e;

    public tt(ru ru2, double d2) {
        this.a = ru2;
        this.e = d2;
        this.a(1);
    }

    @Override
    public boolean a() {
        if (this.a.aM() >= 100) {
            return false;
        }
        if (this.a.aH().nextInt(120) != 0) {
            return false;
        }
        ayp ayp2 = uo.a(this.a, 10, 7);
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

