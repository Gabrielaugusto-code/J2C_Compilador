/*
 * Decompiled with CFR 0.152.
 */
public class ix
extends iu {
    public ix() {
        this.i = true;
    }

    public ix(float f2, float f3, boolean bl2) {
        this.e = f2;
        this.f = f3;
        this.g = bl2;
        this.i = true;
    }

    @Override
    public void a(ep ep2) {
        this.e = ep2.readFloat();
        this.f = ep2.readFloat();
        super.a(ep2);
    }

    @Override
    public void b(ep ep2) {
        ep2.writeFloat(this.e);
        ep2.writeFloat(this.f);
        super.b(ep2);
    }
}

