/*
 * Decompiled with CFR 0.152.
 */
public class hx
extends fk {
    private long a;
    private long b;

    public hx() {
    }

    public hx(long l2, long l3, boolean bl2) {
        this.a = l2;
        this.b = l3;
        if (!bl2) {
            this.b = -this.b;
            if (this.b == 0L) {
                this.b = -1L;
            }
        }
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readLong();
        this.b = ep2.readLong();
    }

    @Override
    public void b(ep ep2) {
        ep2.writeLong(this.a);
        ep2.writeLong(this.b);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public String b() {
        return String.format("time=%d,dtime=%d", this.a, this.b);
    }

    public long c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }
}

