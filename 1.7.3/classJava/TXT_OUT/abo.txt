/*
 * Decompiled with CFR 0.152.
 */
public class abo
extends abs {
    public final int a = 32;
    private final int b;
    private final float c;
    private final boolean d;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private float q;

    public abo(int n2, float f2, boolean bl2) {
        this.b = n2;
        this.d = bl2;
        this.c = f2;
        this.a(aak.h);
    }

    public abo(int n2, boolean bl2) {
        this(n2, 0.6f, bl2);
    }

    @Override
    public abu b(abu abu2, afs afs2, xq xq2) {
        --abu2.b;
        xq2.bP().a(this, abu2);
        afs2.a((qr)xq2, "random.burp", 0.5f, afs2.s.nextFloat() * 0.1f + 0.9f);
        this.c(abu2, afs2, xq2);
        return abu2;
    }

    protected void c(abu abu2, afs afs2, xq xq2) {
        if (!afs2.E && this.n > 0 && afs2.s.nextFloat() < this.q) {
            xq2.c(new qn(this.n, this.o * 20, this.p));
        }
    }

    @Override
    public int d_(abu abu2) {
        return 32;
    }

    @Override
    public acz d(abu abu2) {
        return acz.b;
    }

    @Override
    public abu a(abu abu2, afs afs2, xq xq2) {
        if (xq2.g(this.m)) {
            xq2.a(abu2, this.d_(abu2));
        }
        return abu2;
    }

    public int g(abu abu2) {
        return this.b;
    }

    public float h(abu abu2) {
        return this.c;
    }

    public boolean i() {
        return this.d;
    }

    public abo a(int n2, int n3, int n4, float f2) {
        this.n = n2;
        this.o = n3;
        this.p = n4;
        this.q = f2;
        return this;
    }

    public abo j() {
        this.m = true;
        return this;
    }
}

