/*
 * Decompiled with CFR 0.152.
 */
public class ge
extends fk {
    private int a;
    private int b;
    private String c;
    private int d;
    private boolean e;
    private int f;

    public ge() {
    }

    public ge(int n2, int n3, String string, int n4, boolean bl2) {
        this.a = n2;
        this.b = n3;
        this.c = string;
        this.d = n4;
        this.e = bl2;
    }

    public ge(int n2, int n3, String string, int n4, boolean bl2, int n5) {
        this(n2, n3, string, n4, bl2);
        this.f = n5;
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readUnsignedByte();
        this.b = ep2.readUnsignedByte();
        this.c = ep2.c(32);
        this.d = ep2.readUnsignedByte();
        this.e = ep2.readBoolean();
        if (this.b == 11) {
            this.f = ep2.readInt();
        }
    }

    @Override
    public void b(ep ep2) {
        ep2.writeByte(this.a);
        ep2.writeByte(this.b);
        ep2.a(this.c);
        ep2.writeByte(this.d);
        ep2.writeBoolean(this.e);
        if (this.b == 11) {
            ep2.writeInt(this.f);
        }
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public boolean g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }
}

