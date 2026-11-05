/*
 * Decompiled with CFR 0.152.
 */
public class fy
extends fk {
    private int a;
    private int b;
    private int c;
    private ahz d;
    private int e;

    public fy() {
    }

    public fy(int n2, int n3, int n4, afs afs2) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = afs2.a(n2, n3, n4);
        this.e = afs2.e(n2, n3, n4);
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = ep2.readUnsignedByte();
        this.c = ep2.readInt();
        this.d = ahz.e(ep2.a());
        this.e = ep2.readUnsignedByte();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeByte(this.b);
        ep2.writeInt(this.c);
        ep2.b(ahz.b(this.d));
        ep2.writeByte(this.e);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public String b() {
        return String.format("type=%d, data=%d, x=%d, y=%d, z=%d", ahz.b(this.d), this.e, this.a, this.b, this.c);
    }

    public ahz c() {
        return this.d;
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
        return this.e;
    }
}

