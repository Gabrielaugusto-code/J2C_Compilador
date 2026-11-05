/*
 * Decompiled with CFR 0.152.
 */
public class ns
extends ny {
    public final int a;
    public final int b;
    public final ns c;
    private final String k;
    private nu l;
    public final abu d;
    private boolean m;

    public ns(String string, String string2, int n2, int n3, abs abs2, ns ns2) {
        this(string, string2, n2, n3, new abu(abs2), ns2);
    }

    public ns(String string, String string2, int n2, int n3, ahz ahz2, ns ns2) {
        this(string, string2, n2, n3, new abu(ahz2), ns2);
    }

    public ns(String string, String string2, int n2, int n3, abu abu2, ns ns2) {
        super(string, new fi("achievement." + string2, new Object[0]));
        this.d = abu2;
        this.k = "achievement." + string2 + ".desc";
        this.a = n2;
        this.b = n3;
        if (n2 < nt.a) {
            nt.a = n2;
        }
        if (n3 < nt.b) {
            nt.b = n3;
        }
        if (n2 > nt.c) {
            nt.c = n2;
        }
        if (n3 > nt.d) {
            nt.d = n3;
        }
        this.c = ns2;
    }

    public ns a() {
        this.f = true;
        return this;
    }

    public ns b() {
        this.m = true;
        return this;
    }

    public ns c() {
        super.h();
        nt.e.add(this);
        return this;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public fa e() {
        fa fa2 = super.e();
        fa2.b().a(this.g() ? a.f : a.k);
        return fa2;
    }

    public ns a(Class clazz) {
        return (ns)super.b(clazz);
    }

    public String f() {
        if (this.l != null) {
            return this.l.a(dc.a(this.k));
        }
        return dc.a(this.k);
    }

    public ns a(nu nu2) {
        this.l = nu2;
        return this;
    }

    public boolean g() {
        return this.m;
    }

    @Override
    public /* synthetic */ ny b(Class clazz) {
        return this.a(clazz);
    }

    @Override
    public /* synthetic */ ny h() {
        return this.c();
    }

    @Override
    public /* synthetic */ ny i() {
        return this.a();
    }
}

