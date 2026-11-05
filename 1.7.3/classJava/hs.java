/*
 * Decompiled with CFR 0.152.
 */
public class hs
extends fk {
    private float a;
    private int b;
    private float c;

    public hs() {
    }

    public hs(float f2, int n2, float f3) {
        this.a = f2;
        this.b = n2;
        this.c = f3;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readFloat();
        this.b = ep2.readShort();
        this.c = ep2.readFloat();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeFloat(this.a);
        ep2.writeShort(this.b);
        ep2.writeFloat(this.c);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public float c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public float e() {
        return this.c;
    }
}

