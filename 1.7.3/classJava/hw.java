/*
 * Decompiled with CFR 0.152.
 */
public class hw
extends fk {
    private int a;
    private int b;
    private int c;

    public hw() {
    }

    public hw(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = ep2.readInt();
        this.c = ep2.readInt();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeInt(this.b);
        ep2.writeInt(this.c);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public String b() {
        return String.format("x=%d, y=%d, z=%d", this.a, this.b, this.c);
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }
}

