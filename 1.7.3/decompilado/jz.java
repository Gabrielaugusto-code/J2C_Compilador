/*
 * Decompiled with CFR 0.152.
 */
public class jz
extends fk {
    private long a;

    public jz() {
    }

    public jz(long l2) {
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

    public void a(jy jy2) {
        jy2.a(this);
    }

    @Override
    public boolean a() {
        return true;
    }

    public long c() {
        return this.a;
    }
}

