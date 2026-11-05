/*
 * Decompiled with CFR 0.152.
 */
public class hz
extends fk {
    private int a;
    private int b;

    public hz() {
    }

    public hz(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = ep2.readInt();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeInt(this.b);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }
}

