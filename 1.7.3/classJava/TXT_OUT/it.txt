/*
 * Decompiled with CFR 0.152.
 */
public class it
extends fk {
    private int a;

    public it() {
    }

    public it(int n2) {
        this.a = n2;
    }

    public void a(ie ie2) {
        ie2.a(this);
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
    }

    @Override
    public boolean a() {
        return true;
    }

    public int c() {
        return this.a;
    }
}

