/*
 * Decompiled with CFR 0.152.
 */
public class gu
extends fk {
    private int a;
    private boolean b;
    private agb c;
    private int d;
    private pu e;
    private int f;
    private agd g;

    public gu() {
    }

    public gu(int n2, agb agb2, boolean bl2, int n3, pu pu2, int n4, agd agd2) {
        this.a = n2;
        this.d = n3;
        this.e = pu2;
        this.c = agb2;
        this.f = n4;
        this.b = bl2;
        this.g = agd2;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        int n2 = ep2.readUnsignedByte();
        this.b = (n2 & 8) == 8;
        this.c = agb.a(n2 &= 0xFFFFFFF7);
        this.d = ep2.readByte();
        this.e = pu.a(ep2.readUnsignedByte());
        this.f = ep2.readUnsignedByte();
        this.g = agd.a(ep2.c(16));
        if (this.g == null) {
            this.g = agd.b;
        }
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        int n2 = this.c.a();
        if (this.b) {
            n2 |= 8;
        }
        ep2.writeByte(n2);
        ep2.writeByte(this.d);
        ep2.writeByte(this.e.a());
        ep2.writeByte(this.f);
        ep2.a(this.g.a());
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public String b() {
        return String.format("eid=%d, gameType=%d, hardcore=%b, dimension=%d, difficulty=%s, maxplayers=%d", new Object[]{this.a, this.c.a(), this.b, this.d, this.e, this.f});
    }

    public int c() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }

    public agb e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public pu g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }

    public agd i() {
        return this.g;
    }
}

