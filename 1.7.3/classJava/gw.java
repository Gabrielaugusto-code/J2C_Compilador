/*
 * Decompiled with CFR 0.152.
 */
public class gw
extends fk {
    protected int a;
    protected byte b;
    protected byte c;
    protected byte d;
    protected byte e;
    protected byte f;
    protected boolean g;

    public gw() {
    }

    public gw(int n2) {
        this.a = n2;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public String b() {
        return String.format("id=%d", this.a);
    }

    @Override
    public String toString() {
        return "Entity_" + super.toString();
    }

    public qr a(afs afs2) {
        return afs2.a(this.a);
    }

    public byte c() {
        return this.b;
    }

    public byte d() {
        return this.c;
    }

    public byte e() {
        return this.d;
    }

    public byte f() {
        return this.e;
    }

    public byte g() {
        return this.f;
    }

    public boolean h() {
        return this.g;
    }
}

