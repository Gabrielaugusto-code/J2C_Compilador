/*
 * Decompiled with CFR 0.152.
 */
public class pv
implements pw {
    private final pw a;
    private final boolean b;
    private final boolean c;

    public pv(pw pw2, boolean bl2, boolean bl3) {
        this.a = pw2;
        this.b = bl2;
        this.c = bl3;
    }

    @Override
    public int a() {
        return this.a.a();
    }

    @Override
    public int b() {
        return this.a.b();
    }

    @Override
    public float c() {
        if (this.b) {
            return this.a.d();
        }
        return this.a.c();
    }

    @Override
    public float d() {
        if (this.b) {
            return this.a.c();
        }
        return this.a.d();
    }

    @Override
    public float a(double d2) {
        float f2 = this.d() - this.c();
        return this.c() + f2 * ((float)d2 / 16.0f);
    }

    @Override
    public float e() {
        if (this.c) {
            return this.a.e();
        }
        return this.a.e();
    }

    @Override
    public float f() {
        if (this.c) {
            return this.a.e();
        }
        return this.a.f();
    }

    @Override
    public float b(double d2) {
        float f2 = this.f() - this.e();
        return this.e() + f2 * ((float)d2 / 16.0f);
    }

    @Override
    public String g() {
        return this.a.g();
    }
}

