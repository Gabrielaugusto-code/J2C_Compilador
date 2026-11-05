/*
 * Decompiled with CFR 0.152.
 */
public class bnw
extends bpd {
    private static final brq a = new brq("textures/entity/blaze.png");
    private int f;

    public bnw() {
        super(new bhy(), 0.5f);
        this.f = ((bhy)this.i).a();
    }

    public void a(wo wo2, double d2, double d3, double d4, float f2, float f3) {
        int n2 = ((bhy)this.i).a();
        if (n2 != this.f) {
            this.f = n2;
            this.i = new bhy();
        }
        super.a(wo2, d2, d3, d4, f2, f3);
    }

    protected brq a(wo wo2) {
        return a;
    }
}

