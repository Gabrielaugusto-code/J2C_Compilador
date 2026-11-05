/*
 * Decompiled with CFR 0.152.
 */
public class hj
extends fk {
    private int a;
    private pu b;
    private agb c;
    private agd d;

    public hj() {
    }

    public hj(int n2, pu pu2, agd agd2, agb agb2) {
        this.a = n2;
        this.b = pu2;
        this.c = agb2;
        this.d = agd2;
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = pu.a(ep2.readUnsignedByte());
        this.c = agb.a(ep2.readUnsignedByte());
        this.d = agd.a(ep2.c(16));
        if (this.d == null) {
            this.d = agd.b;
        }
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeByte(this.b.a());
        ep2.writeByte(this.c.a());
        ep2.a(this.d.a());
    }

    public int c() {
        return this.a;
    }

    public pu d() {
        return this.b;
    }

    public agb e() {
        return this.c;
    }

    public agd f() {
        return this.d;
    }
}

