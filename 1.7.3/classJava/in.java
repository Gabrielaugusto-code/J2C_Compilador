/*
 * Decompiled with CFR 0.152.
 */
public class in
extends fk {
    private int a;
    private int b;

    public in() {
    }

    public in(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public void a(ie ie2) {
        ie2.a(this);
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readByte();
        this.b = ep2.readByte();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeByte(this.a);
        ep2.writeByte(this.b);
    }

    @Override
    public String b() {
        return String.format("id=%d, button=%d", this.a, this.b);
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }
}

