/*
 * Decompiled with CFR 0.152.
 */
public class bbo
extends bcl {
    private static bor a = new bor();
    private final bbq f;
    private arj g = arj.e();
    private String h;
    private String i;
    private String r;
    private bbp s;
    private bau t;
    private bau u;
    private bau v;

    public bbo(bbq bbq2, String string) {
        this.f = bbq2;
        this.a(string);
    }

    public String e() {
        return this.g.toString();
    }

    public void a(String string) {
        this.g = arj.a(string);
    }

    @Override
    public void r_() {
        this.n.clear();
        this.h = bsc.a("createWorld.customize.flat.title", new Object[0]);
        this.i = bsc.a("createWorld.customize.flat.tile", new Object[0]);
        this.r = bsc.a("createWorld.customize.flat.height", new Object[0]);
        this.s = new bbp(this);
        this.t = new bau(2, this.l / 2 - 154, this.m - 52, 100, 20, bsc.a("createWorld.customize.flat.addLayer", new Object[0]) + " (NYI)");
        this.n.add(this.t);
        this.u = new bau(3, this.l / 2 - 50, this.m - 52, 100, 20, bsc.a("createWorld.customize.flat.editLayer", new Object[0]) + " (NYI)");
        this.n.add(this.u);
        this.v = new bau(4, this.l / 2 - 155, this.m - 52, 150, 20, bsc.a("createWorld.customize.flat.removeLayer", new Object[0]));
        this.n.add(this.v);
        this.n.add(new bau(0, this.l / 2 - 155, this.m - 28, 150, 20, bsc.a("gui.done", new Object[0])));
        this.n.add(new bau(5, this.l / 2 + 5, this.m - 52, 150, 20, bsc.a("createWorld.customize.presets", new Object[0])));
        this.n.add(new bau(1, this.l / 2 + 5, this.m - 28, 150, 20, bsc.a("gui.cancel", new Object[0])));
        this.u.m = false;
        this.t.m = false;
        this.g.d();
        this.g();
    }

    @Override
    protected void a(bau bau2) {
        int n2 = this.g.c().size() - this.s.k - 1;
        if (bau2.k == 1) {
            this.k.a(this.f);
        } else if (bau2.k == 0) {
            this.f.a = this.e();
            this.k.a(this.f);
        } else if (bau2.k == 5) {
            this.k.a(new bcf(this));
        } else if (bau2.k == 4 && this.i()) {
            this.g.c().remove(n2);
            this.s.k = Math.min(this.s.k, this.g.c().size() - 1);
        }
        this.g.d();
        this.g();
    }

    public void g() {
        boolean bl2;
        this.v.l = bl2 = this.i();
        this.u.l = bl2;
        this.u.l = false;
        this.t.l = false;
    }

    private boolean i() {
        return this.s.k > -1 && this.s.k < this.g.c().size();
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.s.a(n2, n3, f2);
        this.a(this.q, this.h, this.l / 2, 8, 0xFFFFFF);
        int n4 = this.l / 2 - 92 - 16;
        this.b(this.q, this.i, n4, 32, 0xFFFFFF);
        this.b(this.q, this.r, n4 + 2 + 213 - this.q.a(this.r), 32, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    static /* synthetic */ bor h() {
        return a;
    }

    static /* synthetic */ float a(bbo bbo2) {
        return bbo2.e;
    }

    static /* synthetic */ float b(bbo bbo2) {
        return bbo2.e;
    }

    static /* synthetic */ float c(bbo bbo2) {
        return bbo2.e;
    }

    static /* synthetic */ float d(bbo bbo2) {
        return bbo2.e;
    }

    static /* synthetic */ arj e(bbo bbo2) {
        return bbo2.g;
    }
}

