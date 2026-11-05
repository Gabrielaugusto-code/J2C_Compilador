/*
 * Decompiled with CFR 0.152.
 */
public class bki {
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public int f = 4;
    public String g = "1.7.3";
    public boolean h;
    public String i;
    private boolean j = true;
    private boolean k;
    private boolean l;
    private String m;

    public bki(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public dg a() {
        dg dg2 = new dg();
        dg2.a("name", this.a);
        dg2.a("ip", this.b);
        dg2.a("hideAddress", this.l);
        if (this.m != null) {
            dg2.a("icon", this.m);
        }
        if (!this.j) {
            dg2.a("acceptTextures", this.k);
        }
        return dg2;
    }

    public boolean b() {
        return this.k;
    }

    public boolean c() {
        return this.j;
    }

    public void a(boolean bl2) {
        this.k = bl2;
        this.j = false;
    }

    public boolean d() {
        return this.l;
    }

    public void b(boolean bl2) {
        this.l = bl2;
    }

    public static bki a(dg dg2) {
        bki bki2 = new bki(dg2.j("name"), dg2.j("ip"));
        bki2.l = dg2.n("hideAddress");
        if (dg2.b("icon", 8)) {
            bki2.a(dg2.j("icon"));
        }
        if (dg2.b("acceptTextures", 99)) {
            bki2.a(dg2.n("acceptTextures"));
        }
        return bki2;
    }

    public String e() {
        return this.m;
    }

    public void a(String string) {
        this.m = string;
    }
}

