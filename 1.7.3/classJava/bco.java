/*
 * Decompiled with CFR 0.152.
 */
public class bco
extends bcl {
    private final bcl a;
    private bau f;
    private bau g;
    private String h = "survival";
    private boolean i;

    public bco(bcl bcl2) {
        this.a = bcl2;
    }

    @Override
    public void r_() {
        this.n.clear();
        this.n.add(new bau(101, this.l / 2 - 155, this.m - 28, 150, 20, bsc.a("lanServer.start", new Object[0])));
        this.n.add(new bau(102, this.l / 2 + 5, this.m - 28, 150, 20, bsc.a("gui.cancel", new Object[0])));
        this.g = new bau(104, this.l / 2 - 155, 100, 150, 20, bsc.a("selectWorld.gameMode", new Object[0]));
        this.n.add(this.g);
        this.f = new bau(103, this.l / 2 + 5, 100, 150, 20, bsc.a("selectWorld.allowCommands", new Object[0]));
        this.n.add(this.f);
        this.g();
    }

    private void g() {
        this.g.j = bsc.a("selectWorld.gameMode", new Object[0]) + " " + bsc.a("selectWorld.gameMode." + this.h, new Object[0]);
        this.f.j = bsc.a("selectWorld.allowCommands", new Object[0]) + " ";
        this.f.j = this.i ? this.f.j + bsc.a("options.on", new Object[0]) : this.f.j + bsc.a("options.off", new Object[0]);
    }

    @Override
    protected void a(bau bau2) {
        if (bau2.k == 102) {
            this.k.a(this.a);
        } else if (bau2.k == 104) {
            this.h = this.h.equals("survival") ? "creative" : (this.h.equals("creative") ? "adventure" : "survival");
            this.g();
        } else if (bau2.k == 103) {
            this.i = !this.i;
            this.g();
        } else if (bau2.k == 101) {
            this.k.a((bcl)null);
            String string = this.k.H().a(agb.a(this.h), this.i);
            ev ev2 = string != null ? new fi("commands.publish.started", string) : new fh("commands.publish.failed");
            this.k.r.b().a(ev2);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, bsc.a("lanServer.title", new Object[0]), this.l / 2, 50, 0xFFFFFF);
        this.a(this.q, bsc.a("lanServer.otherPlayers", new Object[0]), this.l / 2, 82, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

