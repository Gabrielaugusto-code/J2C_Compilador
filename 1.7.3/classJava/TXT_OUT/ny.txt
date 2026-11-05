/*
 * Decompiled with CFR 0.152.
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class ny {
    public final String e;
    private final fa a;
    public boolean f;
    private final od b;
    private final azb c;
    private Class d;
    private static NumberFormat k = NumberFormat.getIntegerInstance(Locale.US);
    public static od g = new nz();
    private static DecimalFormat l = new DecimalFormat("########0.00");
    public static od h = new oa();
    public static od i = new ob();
    public static od j = new oc();

    public ny(String string, fa fa2, od od2) {
        this.e = string;
        this.a = fa2;
        this.b = od2;
        this.c = new azc(this);
        azb.a.put(this.c.a(), this.c);
    }

    public ny(String string, fa fa2) {
        this(string, fa2, g);
    }

    public ny i() {
        this.f = true;
        return this;
    }

    public ny h() {
        if (og.a.containsKey(this.e)) {
            throw new RuntimeException("Duplicate stat id: \"" + ((ny)og.a.get((Object)this.e)).a + "\" and \"" + this.a + "\" at id " + this.e);
        }
        og.b.add(this);
        og.a.put(this.e, this);
        return this;
    }

    public boolean d() {
        return false;
    }

    public String a(int n2) {
        return this.b.a(n2);
    }

    public fa e() {
        fa fa2 = this.a.f();
        fa2.b().a(a.h);
        fa2.b().a(new fc(fd.b, new fh(this.e)));
        return fa2;
    }

    public fa j() {
        fa fa2 = this.e();
        fa fa3 = new fh("[").a(fa2).a("]");
        fa3.a(fa2.b());
        return fa3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ny ny2 = (ny)object;
        return this.e.equals(ny2.e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        return "Stat{id=" + this.e + ", nameId=" + this.a + ", awardLocallyOnly=" + this.f + ", formatter=" + this.b + ", objectiveCriteria=" + this.c + '}';
    }

    public azb k() {
        return this.c;
    }

    public Class l() {
        return this.d;
    }

    public ny b(Class clazz) {
        this.d = clazz;
        return this;
    }

    static /* synthetic */ NumberFormat m() {
        return k;
    }

    static /* synthetic */ DecimalFormat n() {
        return l;
    }
}

