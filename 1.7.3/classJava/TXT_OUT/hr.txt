/*
 * Decompiled with CFR 0.152.
 */
public class hr
extends fk {
    private float a;
    private int b;
    private int c;

    public hr() {
    }

    public hr(float f2, int n2, int n3) {
        this.a = f2;
        this.b = n2;
        this.c = n3;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readFloat();
        this.c = ep2.readShort();
        this.b = ep2.readShort();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeFloat(this.a);
        ep2.writeShort(this.c);
        ep2.writeShort(this.b);
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

    public int e() {
        return this.c;
    }
}

