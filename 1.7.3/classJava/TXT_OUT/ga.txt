/*
 * Decompiled with CFR 0.152.
 */
public class ga
extends fk {
    private fa a;
    private boolean b = true;

    public ga() {
    }

    public ga(fa fa2) {
        this(fa2, true);
    }

    public ga(fa fa2, boolean bl2) {
        this.a = fa2;
        this.b = bl2;
    }

    @Override
    public void a(ep ep2) {
        this.a = fb.a(ep2.c(Short.MAX_VALUE));
    }

    @Override
    public void b(ep ep2) {
        ep2.a(fb.a(this.a));
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public String b() {
        return String.format("message='%s'", this.a);
    }

    public fa c() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }
}

