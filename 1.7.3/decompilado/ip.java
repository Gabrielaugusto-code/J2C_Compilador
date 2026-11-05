/*
 * Decompiled with CFR 0.152.
 */
public class ip
extends fk {
    private int a;

    public ip() {
    }

    public ip(int n2) {
        this.a = n2;
    }

    public void a(ie ie2) {
        ie2.a(this);
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readByte();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeByte(this.a);
    }
}

