/*
 * Decompiled with CFR 0.152.
 */
public class afe {
    private abu a;
    private abu b;
    private abu c;
    private int d;
    private int e;

    public afe(dg dg2) {
        this.a(dg2);
    }

    public afe(abu abu2, abu abu3, abu abu4) {
        this.a = abu2;
        this.b = abu3;
        this.c = abu4;
        this.e = 7;
    }

    public afe(abu abu2, abu abu3) {
        this(abu2, null, abu3);
    }

    public afe(abu abu2, abs abs2) {
        this(abu2, new abu(abs2));
    }

    public abu a() {
        return this.a;
    }

    public abu b() {
        return this.b;
    }

    public boolean c() {
        return this.b != null;
    }

    public abu d() {
        return this.c;
    }

    public boolean a(afe afe2) {
        if (this.a.b() != afe2.a.b() || this.c.b() != afe2.c.b()) {
            return false;
        }
        return this.b == null && afe2.b == null || this.b != null && afe2.b != null && this.b.b() == afe2.b.b();
    }

    public boolean b(afe afe2) {
        return this.a(afe2) && (this.a.b < afe2.a.b || this.b != null && this.b.b < afe2.b.b);
    }

    public void f() {
        ++this.d;
    }

    public void a(int n2) {
        this.e += n2;
    }

    public boolean g() {
        return this.d >= this.e;
    }

    public void h() {
        this.d = this.e;
    }

    public void a(dg dg2) {
        dg dg3 = dg2.m("buy");
        this.a = abu.a(dg3);
        dg dg4 = dg2.m("sell");
        this.c = abu.a(dg4);
        if (dg2.b("buyB", 10)) {
            this.b = abu.a(dg2.m("buyB"));
        }
        if (dg2.b("uses", 99)) {
            this.d = dg2.f("uses");
        }
        this.e = dg2.b("maxUses", 99) ? dg2.f("maxUses") : 7;
    }

    public dg i() {
        dg dg2 = new dg();
        dg2.a("buy", this.a.b(new dg()));
        dg2.a("sell", this.c.b(new dg()));
        if (this.b != null) {
            dg2.a("buyB", this.b.b(new dg()));
        }
        dg2.a("uses", this.d);
        dg2.a("maxUses", this.e);
        return dg2;
    }
}

