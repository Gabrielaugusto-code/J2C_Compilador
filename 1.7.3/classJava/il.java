/*
 * Decompiled with CFR 0.152.
 */
public class il
extends fk {
    private String a;
    private int b;
    private xs c;
    private boolean d;
    private pu e;
    private boolean f;

    public il() {
    }

    public il(String string, int n2, xs xs2, boolean bl2, pu pu2, boolean bl3) {
        this.a = string;
        this.b = n2;
        this.c = xs2;
        this.d = bl2;
        this.e = pu2;
        this.f = bl3;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.c(7);
        this.b = ep2.readByte();
        this.c = xs.a(ep2.readByte());
        this.d = ep2.readBoolean();
        this.e = pu.a(ep2.readByte());
        this.f = ep2.readBoolean();
    }

    @Override
    public void b(ep ep2) {
        ep2.a(this.a);
        ep2.writeByte(this.b);
        ep2.writeByte(this.c.a());
        ep2.writeBoolean(this.d);
        ep2.writeByte(this.e.a());
        ep2.writeBoolean(this.f);
    }

    public void a(ie ie2) {
        ie2.a(this);
    }

    public String c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public xs e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }

    public pu g() {
        return this.e;
    }

    public boolean h() {
        return this.f;
    }

    @Override
    public String b() {
        return String.format("lang='%s', view=%d, chat=%s, col=%b, difficulty=%s, cape=%b", new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }
}

