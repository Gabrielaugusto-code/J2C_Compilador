/*
 * Decompiled with CFR 0.152.
 */
class bed
extends zp {
    private final zp b;
    final /* synthetic */ beb a;

    public bed(beb beb2, zp zp2, int n2) {
        this.a = beb2;
        super(zp2.f, n2, 0, 0);
        this.b = zp2;
    }

    @Override
    public void a(xq xq2, abu abu2) {
        this.b.a(xq2, abu2);
    }

    @Override
    public boolean a(abu abu2) {
        return this.b.a(abu2);
    }

    @Override
    public abu d() {
        return this.b.d();
    }

    @Override
    public boolean e() {
        return this.b.e();
    }

    @Override
    public void c(abu abu2) {
        this.b.c(abu2);
    }

    @Override
    public void f() {
        this.b.f();
    }

    @Override
    public int a() {
        return this.b.a();
    }

    @Override
    public pw c() {
        return this.b.c();
    }

    @Override
    public abu a(int n2) {
        return this.b.a(n2);
    }

    @Override
    public boolean a(ps ps2, int n2) {
        return this.b.a(ps2, n2);
    }

    static /* synthetic */ zp a(bed bed2) {
        return bed2.b;
    }
}

