/*
 * Decompiled with CFR 0.152.
 */
public class vq
extends qr {
    public int a;
    public int b;

    public vq(afs afs2) {
        super(afs2);
        this.k = true;
        this.a(2.0f, 2.0f);
        this.L = this.N / 2.0f;
        this.b = 5;
        this.a = this.Z.nextInt(100000);
    }

    public vq(afs afs2, double d2, double d3, double d4) {
        this(afs2);
        this.b(d2, d3, d4);
    }

    @Override
    protected boolean g_() {
        return false;
    }

    @Override
    protected void c() {
        this.af.a(8, (Object)this.b);
    }

    @Override
    public void h() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        ++this.a;
        this.af.b(8, this.b);
        int n2 = oy.c(this.s);
        int n3 = oy.c(this.t);
        int n4 = oy.c(this.u);
        if (this.o.t instanceof api && this.o.a(n2, n3, n4) != aie.ab) {
            this.o.b(n2, n3, n4, aie.ab);
        }
    }

    @Override
    protected void b(dg dg2) {
    }

    @Override
    protected void a(dg dg2) {
    }

    @Override
    public float X() {
        return 0.0f;
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean a(qf qf2, float f2) {
        if (this.av()) {
            return false;
        }
        if (!this.K && !this.o.E) {
            this.b = 0;
            if (this.b <= 0) {
                this.A();
                if (!this.o.E) {
                    this.o.a(null, this.s, this.t, this.u, 6.0f, true);
                }
            }
        }
        return true;
    }
}

