/*
 * Decompiled with CFR 0.152.
 */
public class bbk
extends bbl {
    private String r;
    private String s;
    private String t;
    private boolean u = true;

    public bbk(bcl bcl2, String string, int n2, boolean bl2) {
        super(bcl2, bsc.a(bl2 ? "chat.link.confirmTrusted" : "chat.link.confirm", new Object[0]), string, n2);
        this.g = bsc.a(bl2 ? "chat.link.open" : "gui.yes", new Object[0]);
        this.h = bsc.a(bl2 ? "gui.cancel" : "gui.no", new Object[0]);
        this.s = bsc.a("chat.copy", new Object[0]);
        this.r = bsc.a("chat.link.warning", new Object[0]);
        this.t = string;
    }

    @Override
    public void r_() {
        this.n.add(new bau(0, this.l / 3 - 83 + 0, this.m / 6 + 96, 100, 20, this.g));
        this.n.add(new bau(2, this.l / 3 - 83 + 105, this.m / 6 + 96, 100, 20, this.s));
        this.n.add(new bau(1, this.l / 3 - 83 + 210, this.m / 6 + 96, 100, 20, this.h));
    }

    @Override
    protected void a(bau bau2) {
        if (bau2.k == 2) {
            this.e();
        }
        this.a.a(bau2.k == 0, this.i);
    }

    public void e() {
        bbk.d(this.t);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        super.a(n2, n3, f2);
        if (this.u) {
            this.a(this.q, this.r, this.l / 2, 110, 0xFFCCCC);
        }
    }

    public void g() {
        this.u = false;
    }
}

