/*
 * Decompiled with CFR 0.152.
 */
public class aoe
extends ani {
    private int a;
    private int i;
    private String j = "";

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("SkullType", (byte)(this.a & 0xFF));
        dg2.a("Rot", (byte)(this.i & 0xFF));
        dg2.a("ExtraType", this.j);
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.a = dg2.d("SkullType");
        this.i = dg2.d("Rot");
        if (dg2.b("ExtraType", 8)) {
            this.j = dg2.j("ExtraType");
        }
    }

    @Override
    public fk m() {
        dg dg2 = new dg();
        this.b(dg2);
        return new fw(this.c, this.d, this.e, 4, dg2);
    }

    public void a(int n2, String string) {
        this.a = n2;
        this.j = string;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.i;
    }

    public void a(int n2) {
        this.i = n2;
    }

    public String c() {
        return this.j;
    }
}

