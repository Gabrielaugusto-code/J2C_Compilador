/*
 * Decompiled with CFR 0.152.
 */
public class jg
extends fk {
    private int a;
    private String b;
    private int c;
    private ek d;

    public jg() {
    }

    public jg(int n2, String string, int n3, ek ek2) {
        this.a = n2;
        this.b = string;
        this.c = n3;
        this.d = ek2;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.a();
        this.b = ep2.c(255);
        this.c = ep2.readUnsignedShort();
        this.d = ek.a(ep2.a());
    }

    @Override
    public void b(ep ep2) {
        ep2.b(this.a);
        ep2.a(this.b);
        ep2.writeShort(this.c);
        ep2.b(this.d.c());
    }

    public void a(jh jh2) {
        jh2.a(this);
    }

    @Override
    public boolean a() {
        return true;
    }

    public ek c() {
        return this.d;
    }

    public int d() {
        return this.a;
    }
}

