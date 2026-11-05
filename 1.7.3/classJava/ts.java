/*
 * Decompiled with CFR 0.152.
 */
public class ts
extends sz {
    private rn a;
    private double b;
    private double c;
    private int d;

    public ts(rn rn2) {
        this.a = rn2;
        this.a(3);
    }

    @Override
    public boolean a() {
        return this.a.aH().nextFloat() < 0.02f;
    }

    @Override
    public boolean b() {
        return this.d >= 0;
    }

    @Override
    public void c() {
        double d2 = Math.PI * 2 * this.a.aH().nextDouble();
        this.b = Math.cos(d2);
        this.c = Math.sin(d2);
        this.d = 20 + this.a.aH().nextInt(20);
    }

    @Override
    public void e() {
        --this.d;
        this.a.j().a(this.a.s + this.b, this.a.t + (double)this.a.g(), this.a.u + this.c, 10.0f, this.a.bv());
    }
}

