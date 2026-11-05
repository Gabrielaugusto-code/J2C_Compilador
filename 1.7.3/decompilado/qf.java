/*
 * Decompiled with CFR 0.152.
 */
public class qf {
    public static qf a = new qf("inFire").n();
    public static qf b = new qf("onFire").k().n();
    public static qf c = new qf("lava").n();
    public static qf d = new qf("inWall").k();
    public static qf e = new qf("drown").k();
    public static qf f = new qf("starve").k().m();
    public static qf g = new qf("cactus");
    public static qf h = new qf("fall").k();
    public static qf i = new qf("outOfWorld").k().l();
    public static qf j = new qf("generic").k();
    public static qf k = new qf("magic").k().t();
    public static qf l = new qf("wither").k();
    public static qf m = new qf("anvil");
    public static qf n = new qf("fallingBlock");
    private boolean p;
    private boolean q;
    private boolean r;
    private float s = 0.3f;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    public String o;

    public static qf a(rm rm2) {
        return new qg("mob", rm2);
    }

    public static qf a(xq xq2) {
        return new qg("player", xq2);
    }

    public static qf a(xt xt2, qr qr2) {
        return new qh("arrow", xt2, qr2).b();
    }

    public static qf a(xv xv2, qr qr2) {
        if (qr2 == null) {
            return new qh("onFire", xv2, xv2).n().b();
        }
        return new qh("fireball", xv2, qr2).n().b();
    }

    public static qf a(qr qr2, qr qr3) {
        return new qh("thrown", qr2, qr3).b();
    }

    public static qf b(qr qr2, qr qr3) {
        return new qh("indirectMagic", qr2, qr3).k().t();
    }

    public static qf a(qr qr2) {
        return new qg("thorns", qr2).t();
    }

    public static qf a(afn afn2) {
        if (afn2 != null && afn2.c() != null) {
            return new qg("explosion.player", afn2.c()).q().d();
        }
        return new qf("explosion").q().d();
    }

    public boolean a() {
        return this.u;
    }

    public qf b() {
        this.u = true;
        return this;
    }

    public boolean c() {
        return this.x;
    }

    public qf d() {
        this.x = true;
        return this;
    }

    public boolean e() {
        return this.p;
    }

    public float f() {
        return this.s;
    }

    public boolean g() {
        return this.q;
    }

    public boolean h() {
        return this.r;
    }

    protected qf(String string) {
        this.o = string;
    }

    public qr i() {
        return this.j();
    }

    public qr j() {
        return null;
    }

    protected qf k() {
        this.p = true;
        this.s = 0.0f;
        return this;
    }

    protected qf l() {
        this.q = true;
        return this;
    }

    protected qf m() {
        this.r = true;
        this.s = 0.0f;
        return this;
    }

    protected qf n() {
        this.t = true;
        return this;
    }

    public fa b(rm rm2) {
        rm rm3 = rm2.aW();
        String string = "death.attack." + this.o;
        String string2 = string + ".player";
        if (rm3 != null && dc.c(string2)) {
            return new fi(string2, rm2.c_(), rm3.c_());
        }
        return new fi(string, rm2.c_());
    }

    public boolean o() {
        return this.t;
    }

    public String p() {
        return this.o;
    }

    public qf q() {
        this.v = true;
        return this;
    }

    public boolean r() {
        return this.v;
    }

    public boolean s() {
        return this.w;
    }

    public qf t() {
        this.w = true;
        return this;
    }
}

