/*
 * Decompiled with CFR 0.152.
 */
public class bbl
extends bcl {
    protected bcl a;
    protected String f;
    private String r;
    protected String g;
    protected String h;
    protected int i;
    private int s;

    public bbl(bcl bcl2, String string, String string2, int n2) {
        this.a = bcl2;
        this.f = string;
        this.r = string2;
        this.i = n2;
        this.g = bsc.a("gui.yes", new Object[0]);
        this.h = bsc.a("gui.no", new Object[0]);
    }

    public bbl(bcl bcl2, String string, String string2, String string3, String string4, int n2) {
        this.a = bcl2;
        this.f = string;
        this.r = string2;
        this.g = string3;
        this.h = string4;
        this.i = n2;
    }

    @Override
    public void r_() {
        this.n.add(new bbc(0, this.l / 2 - 155, this.m / 6 + 96, this.g));
        this.n.add(new bbc(1, this.l / 2 - 155 + 160, this.m / 6 + 96, this.h));
    }

    @Override
    protected void a(bau bau2) {
        this.a.a(bau2.k == 0, this.i);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, this.f, this.l / 2, 70, 0xFFFFFF);
        this.a(this.q, this.r, this.l / 2, 90, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    public void a(int n2) {
        this.s = n2;
        for (bau bau2 : this.n) {
            bau2.l = false;
        }
    }

    @Override
    public void c() {
        super.c();
        if (--this.s == 0) {
            for (bau bau2 : this.n) {
                bau2.l = true;
            }
        }
    }
}

