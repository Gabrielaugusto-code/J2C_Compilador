/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public class axj {
    private long a;
    private agd b = agd.b;
    private String c = "";
    private int d;
    private int e;
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private dg k;
    private int l;
    private String m;
    private int n;
    private boolean o;
    private int p;
    private boolean q;
    private int r;
    private agb s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private afp x = new afp();

    protected axj() {
    }

    public axj(dg dg2) {
        this.a = dg2.g("RandomSeed");
        if (dg2.b("generatorName", 8)) {
            String string = dg2.j("generatorName");
            this.b = agd.a(string);
            if (this.b == null) {
                this.b = agd.b;
            } else if (this.b.f()) {
                int n2 = 0;
                if (dg2.b("generatorVersion", 99)) {
                    n2 = dg2.f("generatorVersion");
                }
                this.b = this.b.a(n2);
            }
            if (dg2.b("generatorOptions", 8)) {
                this.c = dg2.j("generatorOptions");
            }
        }
        this.s = agb.a(dg2.f("GameType"));
        this.t = dg2.b("MapFeatures", 99) ? dg2.n("MapFeatures") : true;
        this.d = dg2.f("SpawnX");
        this.e = dg2.f("SpawnY");
        this.f = dg2.f("SpawnZ");
        this.g = dg2.g("Time");
        this.h = dg2.b("DayTime", 99) ? dg2.g("DayTime") : this.g;
        this.i = dg2.g("LastPlayed");
        this.j = dg2.g("SizeOnDisk");
        this.m = dg2.j("LevelName");
        this.n = dg2.f("version");
        this.p = dg2.f("rainTime");
        this.o = dg2.n("raining");
        this.r = dg2.f("thunderTime");
        this.q = dg2.n("thundering");
        this.u = dg2.n("hardcore");
        this.w = dg2.b("initialized", 99) ? dg2.n("initialized") : true;
        if (dg2.b("allowCommands", 99)) {
            this.v = dg2.n("allowCommands");
        } else {
            boolean bl2 = this.v = this.s == agb.c;
        }
        if (dg2.b("Player", 10)) {
            this.k = dg2.m("Player");
            this.l = this.k.f("Dimension");
        }
        if (dg2.b("GameRules", 10)) {
            this.x.a(dg2.m("GameRules"));
        }
    }

    public axj(aga aga2, String string) {
        this.a = aga2.d();
        this.s = aga2.e();
        this.t = aga2.g();
        this.m = string;
        this.u = aga2.f();
        this.b = aga2.h();
        this.c = aga2.j();
        this.v = aga2.i();
        this.w = false;
    }

    public axj(axj axj2) {
        this.a = axj2.a;
        this.b = axj2.b;
        this.c = axj2.c;
        this.s = axj2.s;
        this.t = axj2.t;
        this.d = axj2.d;
        this.e = axj2.e;
        this.f = axj2.f;
        this.g = axj2.g;
        this.h = axj2.h;
        this.i = axj2.i;
        this.j = axj2.j;
        this.k = axj2.k;
        this.l = axj2.l;
        this.m = axj2.m;
        this.n = axj2.n;
        this.p = axj2.p;
        this.o = axj2.o;
        this.r = axj2.r;
        this.q = axj2.q;
        this.u = axj2.u;
        this.v = axj2.v;
        this.w = axj2.w;
        this.x = axj2.x;
    }

    public dg a() {
        dg dg2 = new dg();
        this.a(dg2, this.k);
        return dg2;
    }

    public dg a(dg dg2) {
        dg dg3 = new dg();
        this.a(dg3, dg2);
        return dg3;
    }

    private void a(dg dg2, dg dg3) {
        dg2.a("RandomSeed", this.a);
        dg2.a("generatorName", this.b.a());
        dg2.a("generatorVersion", this.b.d());
        dg2.a("generatorOptions", this.c);
        dg2.a("GameType", this.s.a());
        dg2.a("MapFeatures", this.t);
        dg2.a("SpawnX", this.d);
        dg2.a("SpawnY", this.e);
        dg2.a("SpawnZ", this.f);
        dg2.a("Time", this.g);
        dg2.a("DayTime", this.h);
        dg2.a("SizeOnDisk", this.j);
        dg2.a("LastPlayed", MinecraftServer.ap());
        dg2.a("LevelName", this.m);
        dg2.a("version", this.n);
        dg2.a("rainTime", this.p);
        dg2.a("raining", this.o);
        dg2.a("thunderTime", this.r);
        dg2.a("thundering", this.q);
        dg2.a("hardcore", this.u);
        dg2.a("allowCommands", this.v);
        dg2.a("initialized", this.w);
        dg2.a("GameRules", this.x.a());
        if (dg3 != null) {
            dg2.a("Player", dg3);
        }
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public long f() {
        return this.g;
    }

    public long g() {
        return this.h;
    }

    public long h() {
        return this.j;
    }

    public dg i() {
        return this.k;
    }

    public int j() {
        return this.l;
    }

    public void a(int n2) {
        this.d = n2;
    }

    public void b(int n2) {
        this.e = n2;
    }

    public void c(int n2) {
        this.f = n2;
    }

    public void b(long l2) {
        this.g = l2;
    }

    public void c(long l2) {
        this.h = l2;
    }

    public void a(int n2, int n3, int n4) {
        this.d = n2;
        this.e = n3;
        this.f = n4;
    }

    public String k() {
        return this.m;
    }

    public void a(String string) {
        this.m = string;
    }

    public int l() {
        return this.n;
    }

    public void e(int n2) {
        this.n = n2;
    }

    public long m() {
        return this.i;
    }

    public boolean n() {
        return this.q;
    }

    public void a(boolean bl2) {
        this.q = bl2;
    }

    public int o() {
        return this.r;
    }

    public void f(int n2) {
        this.r = n2;
    }

    public boolean p() {
        return this.o;
    }

    public void b(boolean bl2) {
        this.o = bl2;
    }

    public int q() {
        return this.p;
    }

    public void g(int n2) {
        this.p = n2;
    }

    public agb r() {
        return this.s;
    }

    public boolean s() {
        return this.t;
    }

    public void a(agb agb2) {
        this.s = agb2;
    }

    public boolean t() {
        return this.u;
    }

    public agd u() {
        return this.b;
    }

    public void a(agd agd2) {
        this.b = agd2;
    }

    public String y() {
        return this.c;
    }

    public boolean v() {
        return this.v;
    }

    public boolean w() {
        return this.w;
    }

    public void d(boolean bl2) {
        this.w = bl2;
    }

    public afp x() {
        return this.x;
    }

    public void a(k k2) {
        k2.a("Level seed", new axk(this));
        k2.a("Level generator", new axl(this));
        k2.a("Level generator options", new axm(this));
        k2.a("Level spawn location", new axn(this));
        k2.a("Level time", new axo(this));
        k2.a("Level dimension", new axp(this));
        k2.a("Level storage version", new axq(this));
        k2.a("Level weather", new axr(this));
        k2.a("Level game mode", new axs(this));
    }

    static /* synthetic */ agd a(axj axj2) {
        return axj2.b;
    }

    static /* synthetic */ boolean b(axj axj2) {
        return axj2.t;
    }

    static /* synthetic */ String c(axj axj2) {
        return axj2.c;
    }

    static /* synthetic */ int d(axj axj2) {
        return axj2.d;
    }

    static /* synthetic */ int e(axj axj2) {
        return axj2.e;
    }

    static /* synthetic */ int f(axj axj2) {
        return axj2.f;
    }

    static /* synthetic */ long g(axj axj2) {
        return axj2.g;
    }

    static /* synthetic */ long h(axj axj2) {
        return axj2.h;
    }

    static /* synthetic */ int i(axj axj2) {
        return axj2.l;
    }

    static /* synthetic */ int j(axj axj2) {
        return axj2.n;
    }

    static /* synthetic */ int k(axj axj2) {
        return axj2.p;
    }

    static /* synthetic */ boolean l(axj axj2) {
        return axj2.o;
    }

    static /* synthetic */ int m(axj axj2) {
        return axj2.r;
    }

    static /* synthetic */ boolean n(axj axj2) {
        return axj2.q;
    }

    static /* synthetic */ agb o(axj axj2) {
        return axj2.s;
    }

    static /* synthetic */ boolean p(axj axj2) {
        return axj2.u;
    }

    static /* synthetic */ boolean q(axj axj2) {
        return axj2.v;
    }
}

