/*
 * Decompiled with CFR 0.152.
 */
public class bev
extends bcl {
    private final bcl a;

    public bev(bcl bcl2) {
        this.a = bcl2;
    }

    @Override
    public void r_() {
        this.n.clear();
        this.n.add(new bau(0, this.l / 2 - 100, this.m / 4 + 120 + 12, "Back"));
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        String string = bsc.a("mco.client.outdated.title", new Object[0]);
        String string2 = bsc.a("mco.client.outdated.msg", new Object[0]);
        this.a(this.q, string, this.l / 2, this.m / 2 - 50, 0xFF0000);
        this.a(this.q, string2, this.l / 2, this.m / 2 - 30, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    @Override
    protected void a(bau bau2) {
        if (bau2.k == 0) {
            this.k.a(this.a);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        if (n2 == 28 || n2 == 156) {
            this.k.a(this.a);
        }
    }
}

