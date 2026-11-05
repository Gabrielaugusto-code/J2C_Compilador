/*
 * Decompiled with CFR 0.152.
 */
public class jl
extends fk {
    private fa a;

    public jl() {
    }

    public jl(fa fa2) {
        this.a = fa2;
    }

    @Override
    public void a(ep ep2) {
        this.a = fb.a(ep2.c(Short.MAX_VALUE));
    }

    @Override
    public void b(ep ep2) {
        ep2.a(fb.a(this.a));
    }

    public void a(ji ji2) {
        ji2.a(this);
    }

    @Override
    public boolean a() {
        return true;
    }

    public fa c() {
        return this.a;
    }
}

