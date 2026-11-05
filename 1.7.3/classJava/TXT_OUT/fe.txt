/*
 * Decompiled with CFR 0.152.
 */
public class fe {
    private fe a;
    private a b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private ey h;
    private fc i;
    private static final fe j = new ff();

    public a a() {
        return this.b == null ? this.n().a() : this.b;
    }

    public boolean b() {
        return this.c == null ? this.n().b() : this.c.booleanValue();
    }

    public boolean c() {
        return this.d == null ? this.n().c() : this.d.booleanValue();
    }

    public boolean d() {
        return this.f == null ? this.n().d() : this.f.booleanValue();
    }

    public boolean e() {
        return this.e == null ? this.n().e() : this.e.booleanValue();
    }

    public boolean f() {
        return this.g == null ? this.n().f() : this.g.booleanValue();
    }

    public boolean g() {
        return this.c == null && this.d == null && this.f == null && this.e == null && this.g == null && this.b == null && this.h == null && this.i == null;
    }

    public ey h() {
        return this.h == null ? this.n().h() : this.h;
    }

    public fc i() {
        return this.i == null ? this.n().i() : this.i;
    }

    public fe a(a a2) {
        this.b = a2;
        return this;
    }

    public fe a(Boolean bl2) {
        this.c = bl2;
        return this;
    }

    public fe b(Boolean bl2) {
        this.d = bl2;
        return this;
    }

    public fe c(Boolean bl2) {
        this.f = bl2;
        return this;
    }

    public fe d(Boolean bl2) {
        this.e = bl2;
        return this;
    }

    public fe e(Boolean bl2) {
        this.g = bl2;
        return this;
    }

    public fe a(ey ey2) {
        this.h = ey2;
        return this;
    }

    public fe a(fc fc2) {
        this.i = fc2;
        return this;
    }

    public fe a(fe fe2) {
        this.a = fe2;
        return this;
    }

    public String j() {
        if (this.g()) {
            if (this.a != null) {
                return this.a.j();
            }
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a() != null) {
            stringBuilder.append((Object)this.a());
        }
        if (this.b()) {
            stringBuilder.append((Object)a.r);
        }
        if (this.c()) {
            stringBuilder.append((Object)a.u);
        }
        if (this.e()) {
            stringBuilder.append((Object)a.t);
        }
        if (this.f()) {
            stringBuilder.append((Object)a.q);
        }
        if (this.d()) {
            stringBuilder.append((Object)a.s);
        }
        return stringBuilder.toString();
    }

    private fe n() {
        return this.a == null ? j : this.a;
    }

    public String toString() {
        return "Style{hasParent=" + (this.a != null) + ", color=" + (Object)((Object)this.b) + ", bold=" + this.c + ", italic=" + this.d + ", underlined=" + this.e + ", obfuscated=" + this.g + ", clickEvent=" + this.h() + ", hoverEvent=" + this.i() + '}';
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof fe) {
            fe fe2 = (fe)object;
            return this.b() == fe2.b() && this.a() == fe2.a() && this.c() == fe2.c() && this.f() == fe2.f() && this.d() == fe2.d() && this.e() == fe2.e() && (this.h() != null ? this.h().equals(fe2.h()) : fe2.h() == null) && (this.i() != null ? this.i().equals(fe2.i()) : fe2.i() == null);
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.b.hashCode();
        n2 = 31 * n2 + this.c.hashCode();
        n2 = 31 * n2 + this.d.hashCode();
        n2 = 31 * n2 + this.e.hashCode();
        n2 = 31 * n2 + this.f.hashCode();
        n2 = 31 * n2 + this.g.hashCode();
        n2 = 31 * n2 + this.h.hashCode();
        n2 = 31 * n2 + this.i.hashCode();
        return n2;
    }

    public fe l() {
        fe fe2 = new fe();
        fe2.c = this.c;
        fe2.d = this.d;
        fe2.f = this.f;
        fe2.e = this.e;
        fe2.g = this.g;
        fe2.b = this.b;
        fe2.h = this.h;
        fe2.i = this.i;
        fe2.a = this.a;
        return fe2;
    }

    public fe m() {
        fe fe2 = new fe();
        fe2.a(this.b());
        fe2.b(this.c());
        fe2.c(this.d());
        fe2.d(this.e());
        fe2.e(this.f());
        fe2.a(this.a());
        fe2.a(this.h());
        fe2.a(this.i());
        return fe2;
    }

    static /* synthetic */ Boolean a(fe fe2, Boolean bl2) {
        fe2.c = bl2;
        return fe2.c;
    }

    static /* synthetic */ Boolean b(fe fe2, Boolean bl2) {
        fe2.d = bl2;
        return fe2.d;
    }

    static /* synthetic */ Boolean c(fe fe2, Boolean bl2) {
        fe2.e = bl2;
        return fe2.e;
    }

    static /* synthetic */ Boolean d(fe fe2, Boolean bl2) {
        fe2.f = bl2;
        return fe2.f;
    }

    static /* synthetic */ Boolean e(fe fe2, Boolean bl2) {
        fe2.g = bl2;
        return fe2.g;
    }

    static /* synthetic */ a a(fe fe2, a a2) {
        fe2.b = a2;
        return fe2.b;
    }

    static /* synthetic */ ey a(fe fe2, ey ey2) {
        fe2.h = ey2;
        return fe2.h;
    }

    static /* synthetic */ fc a(fe fe2, fc fc2) {
        fe2.i = fc2;
        return fe2.i;
    }

    static /* synthetic */ Boolean b(fe fe2) {
        return fe2.c;
    }

    static /* synthetic */ Boolean c(fe fe2) {
        return fe2.d;
    }

    static /* synthetic */ Boolean d(fe fe2) {
        return fe2.e;
    }

    static /* synthetic */ Boolean e(fe fe2) {
        return fe2.f;
    }

    static /* synthetic */ Boolean f(fe fe2) {
        return fe2.g;
    }

    static /* synthetic */ a g(fe fe2) {
        return fe2.b;
    }

    static /* synthetic */ ey h(fe fe2) {
        return fe2.h;
    }

    static /* synthetic */ fc i(fe fe2) {
        return fe2.i;
    }
}

