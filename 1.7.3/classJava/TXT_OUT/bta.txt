/*
 * Decompiled with CFR 0.152.
 */
public class bta
extends bsy {
    private final xq k;
    private final wc l;

    public bta(xq xq2, wc wc2) {
        super(new brq("minecraft:minecart.inside"));
        this.k = xq2;
        this.l = wc2;
        this.i = bth.a;
        this.g = true;
        this.h = 0;
    }

    @Override
    public void a() {
        if (this.l.K || !this.k.al() || this.k.m != this.l) {
            this.j = true;
            return;
        }
        float f2 = oy.a(this.l.v * this.l.v + this.l.x * this.l.x);
        this.b = (double)f2 >= 0.01 ? 0.0f + oy.a(f2, 0.0f, 1.0f) * 0.75f : 0.0f;
    }
}

