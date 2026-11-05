/*
 * Decompiled with CFR 0.152.
 */
public class bnz
extends bpd {
    private static final brq a = new brq("textures/entity/chicken.png");

    public bnz(bim bim2, float f2) {
        super(bim2, f2);
    }

    public void a(ux ux2, double d2, double d3, double d4, float f2, float f3) {
        super.a(ux2, d2, d3, d4, f2, f3);
    }

    protected brq a(ux ux2) {
        return a;
    }

    protected float a(ux ux2, float f2) {
        float f3 = ux2.bs + (ux2.bp - ux2.bs) * f2;
        float f4 = ux2.br + (ux2.bq - ux2.br) * f2;
        return (oy.a(f3) + 1.0f) * f4;
    }

    @Override
    protected /* synthetic */ float b(rm rm2, float f2) {
        return this.a((ux)rm2, f2);
    }
}

