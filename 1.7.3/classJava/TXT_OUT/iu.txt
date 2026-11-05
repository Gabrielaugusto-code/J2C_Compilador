/*
 * Decompiled with CFR 0.152.
 */
public class iu
extends fk {
    protected double a;
    protected double b;
    protected double c;
    protected double d;
    protected float e;
    protected float f;
    protected boolean g;
    protected boolean h;
    protected boolean i;

    public iu() {
    }

    public iu(boolean bl2) {
        this.g = bl2;
    }

    public void a(ie ie2) {
        ie2.a(this);
    }

    @Override
    public void a(ep ep2) {
        this.g = ep2.readUnsignedByte() != 0;
    }

    @Override
    public void b(ep ep2) {
        ep2.writeByte(this.g ? 1 : 0);
    }

    public double c() {
        return this.a;
    }

    public double d() {
        return this.b;
    }

    public double e() {
        return this.c;
    }

    public double f() {
        return this.d;
    }

    public float g() {
        return this.e;
    }

    public float h() {
        return this.f;
    }

    public boolean i() {
        return this.g;
    }

    public boolean j() {
        return this.h;
    }

    public boolean k() {
        return this.i;
    }

    public void a(boolean bl2) {
        this.h = bl2;
    }
}

