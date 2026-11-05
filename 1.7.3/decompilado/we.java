/*
 * Decompiled with CFR 0.152.
 */
public class we
extends wc {
    private final afg a = new wf(this);
    private int b = 0;

    public we(afs afs2) {
        super(afs2);
    }

    public we(afs afs2, double d2, double d3, double d4) {
        super(afs2, d2, d3, d4);
    }

    @Override
    protected void c() {
        super.c();
        this.y().a(23, "");
        this.y().a(24, "");
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        this.a.b(dg2);
        this.y().b(23, this.e().i());
        this.y().b(24, fb.a(this.e().h()));
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.a.a(dg2);
    }

    @Override
    public int m() {
        return 6;
    }

    @Override
    public ahz o() {
        return aie.bI;
    }

    public afg e() {
        return this.a;
    }

    @Override
    public void a(int n2, int n3, int n4, boolean bl2) {
        if (bl2 && this.aa - this.b >= 4) {
            this.e().a(this.o);
            this.b = this.aa;
        }
    }

    @Override
    public boolean c(xq xq2) {
        if (this.o.E) {
            xq2.a(this.e());
        }
        return super.c(xq2);
    }

    @Override
    public void i(int n2) {
        super.i(n2);
        if (n2 == 24) {
            try {
                this.a.b(fb.a(this.y().e(24)));
            }
            catch (Throwable throwable) {}
        } else if (n2 == 23) {
            this.a.a(this.y().e(23));
        }
    }
}

