/*
 * Decompiled with CFR 0.152.
 */
public class hg
extends fk {
    private int a;
    private int b;
    private int c;
    private int d;

    public hg() {
    }

    public hg(xq xq2, int n2, int n3, int n4) {
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.a = xq2.x();
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = ep2.readInt();
        this.c = ep2.readByte();
        this.d = ep2.readInt();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeInt(this.b);
        ep2.writeByte(this.c);
        ep2.writeInt(this.d);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public xq a(afs afs2) {
        return (xq)afs2.a(this.a);
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }
}

