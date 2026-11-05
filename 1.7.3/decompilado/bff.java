/*
 * Decompiled with CFR 0.152.
 */
public class bff
extends bcl {
    private final bfg i;
    private final String r;
    private final String s;
    protected final bcl a;
    protected final String f;
    protected final String g;
    protected final int h;

    public bff(bcl bcl2, bfg bfg2, String string, String string2, int n2) {
        this.a = bcl2;
        this.h = n2;
        this.i = bfg2;
        this.r = string;
        this.s = string2;
        this.f = bsc.a("gui.yes", new Object[0]);
        this.g = bsc.a("gui.no", new Object[0]);
    }

    @Override
    public void r_() {
        this.n.add(new bbc(0, this.l / 2 - 155, this.m / 6 + 112, this.f));
        this.n.add(new bbc(1, this.l / 2 - 155 + 160, this.m / 6 + 112, this.g));
    }

    @Override
    protected void a(bau bau2) {
        this.a.a(bau2.k == 0, this.h);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, this.i.d, this.l / 2, 70, this.i.c);
        this.a(this.q, this.r, this.l / 2, 90, 0xFFFFFF);
        this.a(this.q, this.s, this.l / 2, 110, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

