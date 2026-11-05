/*
 * Decompiled with CFR 0.152.
 */
public class bsz
extends bsy {
    private final wc k;
    private float l = 0.0f;

    public bsz(wc wc2) {
        super(new brq("minecraft:minecart.base"));
        this.k = wc2;
        this.g = true;
        this.h = 0;
    }

    @Override
    public void a() {
        if (this.k.K) {
            this.j = true;
            return;
        }
        this.d = (float)this.k.s;
        this.e = (float)this.k.t;
        this.f = (float)this.k.u;
        float f2 = oy.a(this.k.v * this.k.v + this.k.x * this.k.x);
        if ((double)f2 >= 0.01) {
            this.l = oy.a(this.l + 0.0025f, 0.0f, 1.0f);
            this.b = 0.0f + oy.a(f2, 0.0f, 0.5f) * 0.7f;
        } else {
            this.l = 0.0f;
            this.b = 0.0f;
        }
    }
}

