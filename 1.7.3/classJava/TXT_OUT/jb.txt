/*
 * Decompiled with CFR 0.152.
 */
public class jb
extends fk {
    private float a;
    private float b;
    private boolean c;
    private boolean d;

    public jb() {
    }

    public jb(float f2, float f3, boolean bl2, boolean bl3) {
        this.a = f2;
        this.b = f3;
        this.c = bl2;
        this.d = bl3;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readFloat();
        this.b = ep2.readFloat();
        this.c = ep2.readBoolean();
        this.d = ep2.readBoolean();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeFloat(this.a);
        ep2.writeFloat(this.b);
        ep2.writeBoolean(this.c);
        ep2.writeBoolean(this.d);
    }

    public void a(ie ie2) {
        ie2.a(this);
    }

    public float c() {
        return this.a;
    }

    public float d() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }
}

