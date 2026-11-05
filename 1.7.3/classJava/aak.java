/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public abstract class aak {
    public static final aak[] a = new aak[12];
    public static final aak b = new aal(0, "buildingBlocks");
    public static final aak c = new aap(1, "decorations");
    public static final aak d = new aaq(2, "redstone");
    public static final aak e = new aar(3, "transportation");
    public static final aak f = new aas(4, "misc").a(new ael[]{ael.a});
    public static final aak g = new aat(5, "search").a("item_search.png");
    public static final aak h = new aau(6, "food");
    public static final aak i = new aav(7, "tools").a(ael.h, ael.i, ael.j);
    public static final aak j = new aaw(8, "combat").a(ael.b, ael.c, ael.f, ael.d, ael.e, ael.k, ael.g);
    public static final aak k = new aam(9, "brewing");
    public static final aak l = new aan(10, "materials");
    public static final aak m = new aao(11, "inventory").a("inventory.png").k().i();
    private final int n;
    private final String o;
    private String p = "items.png";
    private boolean q = true;
    private boolean r = true;
    private ael[] s;
    private abu t;

    public aak(int n2, String string) {
        this.n = n2;
        this.o = string;
        aak.a[n2] = this;
    }

    public int a() {
        return this.n;
    }

    public String b() {
        return this.o;
    }

    public String c() {
        return "itemGroup." + this.b();
    }

    public abu d() {
        if (this.t == null) {
            this.t = new abu(this.e(), 1, this.f());
        }
        return this.t;
    }

    public abstract abs e();

    public int f() {
        return 0;
    }

    public String g() {
        return this.p;
    }

    public aak a(String string) {
        this.p = string;
        return this;
    }

    public boolean h() {
        return this.r;
    }

    public aak i() {
        this.r = false;
        return this;
    }

    public boolean j() {
        return this.q;
    }

    public aak k() {
        this.q = false;
        return this;
    }

    public int l() {
        return this.n % 6;
    }

    public boolean m() {
        return this.n < 6;
    }

    public ael[] n() {
        return this.s;
    }

    public aak a(ael ... aelArray) {
        this.s = aelArray;
        return this;
    }

    public boolean a(ael ael2) {
        if (this.s == null) {
            return false;
        }
        for (ael ael3 : this.s) {
            if (ael3 != ael2) continue;
            return true;
        }
        return false;
    }

    public void a(List list) {
        for (abs abs2 : abs.e) {
            if (abs2 == null || abs2.n_() != this) continue;
            abs2.a(abs2, this, list);
        }
        if (this.n() != null) {
            this.a(list, this.n());
        }
    }

    public void a(List list, ael ... aelArray) {
        for (aek aek2 : aek.b) {
            if (aek2 == null || aek2.C == null) continue;
            boolean bl2 = false;
            for (int i2 = 0; i2 < aelArray.length && !bl2; ++i2) {
                if (aek2.C != aelArray[i2]) continue;
                bl2 = true;
            }
            if (!bl2) continue;
            list.add(abv.bR.a(new aet(aek2, aek2.b())));
        }
    }
}

