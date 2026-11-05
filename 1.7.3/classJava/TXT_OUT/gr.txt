/*
 * Decompiled with CFR 0.152.
 */
public class gr
extends fk {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;

    public gr() {
    }

    public gr(int n2, int n3, int n4, int n5, int n6, boolean bl2) {
        this.a = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
        this.b = n6;
        this.f = bl2;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.c = ep2.readInt();
        this.d = ep2.readByte() & 0xFF;
        this.e = ep2.readInt();
        this.b = ep2.readInt();
        this.f = ep2.readBoolean();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeInt(this.c);
        ep2.writeByte(this.d & 0xFF);
        ep2.writeInt(this.e);
        ep2.writeInt(this.b);
        ep2.writeBoolean(this.f);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public boolean c() {
        return this.f;
    }

    public int d() {
        return this.a;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.c;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }
}

