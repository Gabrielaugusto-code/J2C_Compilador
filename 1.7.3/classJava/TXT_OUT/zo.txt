/*
 * Decompiled with CFR 0.152.
 */
public class zo
extends zp {
    private final ps a;
    private xq b;
    private int c;

    public zo(xq xq2, ps ps2, ps ps3, int n2, int n3, int n4) {
        super(ps3, n2, n3, n4);
        this.b = xq2;
        this.a = ps2;
    }

    @Override
    public boolean a(abu abu2) {
        return false;
    }

    @Override
    public abu a(int n2) {
        if (this.e()) {
            this.c += Math.min(n2, this.d().b);
        }
        return super.a(n2);
    }

    @Override
    protected void a(abu abu2, int n2) {
        this.c += n2;
        this.b(abu2);
    }

    @Override
    protected void b(abu abu2) {
        abu2.a(this.b.o, this.b, this.c);
        this.c = 0;
        if (abu2.b() == abs.a(aie.ai)) {
            this.b.a(nt.h, 1);
        }
        if (abu2.b() instanceof ace) {
            this.b.a(nt.i, 1);
        }
        if (abu2.b() == abs.a(aie.al)) {
            this.b.a(nt.j, 1);
        }
        if (abu2.b() instanceof abr) {
            this.b.a(nt.l, 1);
        }
        if (abu2.b() == abv.P) {
            this.b.a(nt.m, 1);
        }
        if (abu2.b() == abv.aU) {
            this.b.a(nt.n, 1);
        }
        if (abu2.b() instanceof ace && ((ace)abu2.b()).i() != abt.a) {
            this.b.a(nt.o, 1);
        }
        if (abu2.b() instanceof acy) {
            this.b.a(nt.r, 1);
        }
        if (abu2.b() == abs.a(aie.bn)) {
            this.b.a(nt.E, 1);
        }
        if (abu2.b() == abs.a(aie.X)) {
            this.b.a(nt.G, 1);
        }
    }

    @Override
    public void a(xq xq2, abu abu2) {
        this.b(abu2);
        for (int i2 = 0; i2 < this.a.a(); ++i2) {
            abu abu3 = this.a.a(i2);
            if (abu3 == null) continue;
            this.a.a(i2, 1);
            if (!abu3.b().u()) continue;
            abu abu4 = new abu(abu3.b().t());
            if (abu3.b().l(abu3) && this.b.bm.a(abu4)) continue;
            if (this.a.a(i2) == null) {
                this.a.a(i2, abu4);
                continue;
            }
            this.b.a(abu4, false);
        }
    }
}

