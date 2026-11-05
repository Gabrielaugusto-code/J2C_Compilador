/*
 * Decompiled with CFR 0.152.
 */
public class jq
extends fk {
    private long a;

    public jq() {
    }

    public jq(long l2) {
        this.a = l2;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readLong();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeLong(this.a);
    }

    public void a(jp jp2) {
        jp2.a(this);
    }

    @Override
    public boolean a() {
        return true;
    }

    public long c() {
        return this.a;
    }
}

