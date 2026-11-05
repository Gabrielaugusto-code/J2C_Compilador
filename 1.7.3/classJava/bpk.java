/*
 * Decompiled with CFR 0.152.
 */
public class bpk
extends bpd {
    private static final brq a = new brq("textures/entity/silverfish.png");

    public bpk() {
        super(new biv(), 0.3f);
    }

    protected float a(xb xb2) {
        return 180.0f;
    }

    public void a(xb xb2, double d2, double d3, double d4, float f2, float f3) {
        super.a(xb2, d2, d3, d4, f2, f3);
    }

    protected brq b(xb xb2) {
        return a;
    }

    protected int a(xb xb2, int n2, float f2) {
        return -1;
    }

    @Override
    protected /* synthetic */ brq a(qr qr2) {
        return this.b((xb)qr2);
    }
}

