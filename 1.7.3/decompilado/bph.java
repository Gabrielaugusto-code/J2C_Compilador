/*
 * Decompiled with CFR 0.152.
 */
public class bph
extends bpd {
    private static final brq a = new brq("textures/entity/pig/pig_saddle.png");
    private static final brq f = new brq("textures/entity/pig/pig.png");

    public bph(bim bim2, bim bim3, float f2) {
        super(bim2, f2);
        this.a(bim3);
    }

    protected int a(vf vf2, int n2, float f2) {
        if (n2 == 0 && vf2.bZ()) {
            this.a(a);
            return 1;
        }
        return -1;
    }

    protected brq a(vf vf2) {
        return f;
    }
}

