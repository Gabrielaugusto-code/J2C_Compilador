/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class wa
extends qr {
    private ahz e;
    public int a;
    public int b;
    public boolean c = true;
    private boolean f;
    private boolean g;
    private int h = 40;
    private float i = 2.0f;
    public dg d;

    public wa(afs afs2) {
        super(afs2);
    }

    public wa(afs afs2, double d2, double d3, double d4, ahz ahz2) {
        this(afs2, d2, d3, d4, ahz2, 0);
    }

    public wa(afs afs2, double d2, double d3, double d4, ahz ahz2, int n2) {
        super(afs2);
        this.e = ahz2;
        this.a = n2;
        this.k = true;
        this.a(0.98f, 0.98f);
        this.L = this.N / 2.0f;
        this.b(d2, d3, d4);
        this.v = 0.0;
        this.w = 0.0;
        this.x = 0.0;
        this.p = d2;
        this.q = d3;
        this.r = d4;
    }

    @Override
    protected boolean g_() {
        return false;
    }

    @Override
    protected void c() {
    }

    @Override
    public boolean Q() {
        return !this.K;
    }

    @Override
    public void h() {
        if (this.e.o() == avk.a) {
            this.A();
            return;
        }
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        ++this.b;
        this.w -= (double)0.04f;
        this.d(this.v, this.w, this.x);
        this.v *= (double)0.98f;
        this.w *= (double)0.98f;
        this.x *= (double)0.98f;
        if (!this.o.E) {
            int n2 = oy.c(this.s);
            int n3 = oy.c(this.t);
            int n4 = oy.c(this.u);
            if (this.b == 1) {
                if (this.o.a(n2, n3, n4) == this.e) {
                    this.o.f(n2, n3, n4);
                } else {
                    this.A();
                    return;
                }
            }
            if (this.D) {
                this.v *= (double)0.7f;
                this.x *= (double)0.7f;
                this.w *= -0.5;
                if (this.o.a(n2, n3, n4) != aie.M) {
                    this.A();
                    if (!this.f && this.o.a(this.e, n2, n3, n4, true, 1, null, null) && !ajo.e(this.o, n2, n3 - 1, n4) && this.o.d(n2, n3, n4, this.e, this.a, 3)) {
                        ani ani2;
                        if (this.e instanceof ajo) {
                            ((ajo)this.e).a(this.o, n2, n3, n4, this.a);
                        }
                        if (this.d != null && this.e instanceof ajn && (ani2 = this.o.o(n2, n3, n4)) != null) {
                            dg dg2 = new dg();
                            ani2.b(dg2);
                            for (String string : this.d.c()) {
                                du du2 = this.d.a(string);
                                if (string.equals("x") || string.equals("y") || string.equals("z")) continue;
                                dg2.a(string, du2.b());
                            }
                            ani2.a(dg2);
                            ani2.e();
                        }
                    } else if (this.c && !this.f) {
                        this.a(new abu(this.e, 1, this.e.a(this.a)), 0.0f);
                    }
                }
            } else if (this.b > 100 && !this.o.E && (n3 < 1 || n3 > 256) || this.b > 600) {
                if (this.c) {
                    this.a(new abu(this.e, 1, this.e.a(this.a)), 0.0f);
                }
                this.A();
            }
        }
    }

    @Override
    protected void b(float f2) {
        int n2;
        if (this.g && (n2 = oy.f(f2 - 1.0f)) > 0) {
            ArrayList arrayList = new ArrayList(this.o.b((qr)this, this.C));
            boolean bl2 = this.e == aie.bQ;
            qf qf2 = bl2 ? qf.m : qf.n;
            for (qr qr2 : arrayList) {
                qr2.a(qf2, (float)Math.min(oy.d((float)n2 * this.i), this.h));
            }
            if (bl2 && (double)this.Z.nextFloat() < (double)0.05f + (double)n2 * 0.05) {
                int n3 = this.a >> 2;
                int n4 = this.a & 3;
                if (++n3 > 2) {
                    this.f = true;
                } else {
                    this.a = n4 | n3 << 2;
                }
            }
        }
    }

    @Override
    protected void b(dg dg2) {
        dg2.a("Tile", (byte)ahz.b(this.e));
        dg2.a("TileID", ahz.b(this.e));
        dg2.a("Data", (byte)this.a);
        dg2.a("Time", (byte)this.b);
        dg2.a("DropItem", this.c);
        dg2.a("HurtEntities", this.g);
        dg2.a("FallHurtAmount", this.i);
        dg2.a("FallHurtMax", this.h);
        if (this.d != null) {
            dg2.a("TileEntityData", this.d);
        }
    }

    @Override
    protected void a(dg dg2) {
        this.e = dg2.b("TileID", 99) ? ahz.e(dg2.f("TileID")) : ahz.e(dg2.d("Tile") & 0xFF);
        this.a = dg2.d("Data") & 0xFF;
        this.b = dg2.d("Time") & 0xFF;
        if (dg2.b("HurtEntities", 99)) {
            this.g = dg2.n("HurtEntities");
            this.i = dg2.h("FallHurtAmount");
            this.h = dg2.f("FallHurtMax");
        } else if (this.e == aie.bQ) {
            this.g = true;
        }
        if (dg2.b("DropItem", 99)) {
            this.c = dg2.n("DropItem");
        }
        if (dg2.b("TileEntityData", 10)) {
            this.d = dg2.m("TileEntityData");
        }
        if (this.e.o() == avk.a) {
            this.e = aie.m;
        }
    }

    @Override
    public float X() {
        return 0.0f;
    }

    public afs e() {
        return this.o;
    }

    public void a(boolean bl2) {
        this.g = bl2;
    }

    @Override
    public boolean az() {
        return false;
    }

    @Override
    public void a(k k2) {
        super.a(k2);
        k2.a("Immitating block ID", ahz.b(this.e));
        k2.a("Immitating block data", this.a);
    }

    public ahz f() {
        return this.e;
    }
}

