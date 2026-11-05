/*
 * Decompiled with CFR 0.152.
 */
public class bmc
extends bmb {
    private bac e;

    public bmc(bac bac2) {
        this.e = bac2;
    }

    @Override
    public void a() {
        this.a = 0.0f;
        this.b = 0.0f;
        if (this.e.V.d()) {
            this.b += 1.0f;
        }
        if (this.e.X.d()) {
            this.b -= 1.0f;
        }
        if (this.e.W.d()) {
            this.a += 1.0f;
        }
        if (this.e.Y.d()) {
            this.a -= 1.0f;
        }
        this.c = this.e.Z.d();
        this.d = this.e.aa.d();
        if (this.d) {
            this.a = (float)((double)this.a * 0.3);
            this.b = (float)((double)this.b * 0.3);
        }
    }
}

