/*
 * Decompiled with CFR 0.152.
 */
public class zk
extends yj {
    private afd a;
    private zj f;
    private final afs g;

    public zk(xo xo2, afd afd2, afs afs2) {
        int n2;
        this.a = afd2;
        this.g = afs2;
        this.f = new zj(xo2.d, afd2);
        this.a(new zp(this.f, 0, 36, 53));
        this.a(new zp(this.f, 1, 62, 53));
        this.a(new zl(xo2.d, afd2, this.f, 2, 120, 53));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.a(new zp(xo2, i2 + n2 * 9 + 9, 8 + i2 * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.a(new zp(xo2, n2, 8 + n2 * 18, 142));
        }
    }

    public zj e() {
        return this.f;
    }

    @Override
    public void a(yt yt2) {
        super.a(yt2);
    }

    @Override
    public void b() {
        super.b();
    }

    @Override
    public void a(ps ps2) {
        this.f.h();
        super.a(ps2);
    }

    public void e(int n2) {
        this.f.c(n2);
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public boolean a(xq xq2) {
        return this.a.b() == xq2;
    }

    @Override
    public abu b(xq xq2, int n2) {
        abu abu2 = null;
        zp zp2 = (zp)this.c.get(n2);
        if (zp2 != null && zp2.e()) {
            abu abu3 = zp2.d();
            abu2 = abu3.m();
            if (n2 == 2) {
                if (!this.a(abu3, 3, 39, true)) {
                    return null;
                }
                zp2.a(abu3, abu2);
            } else if (n2 == 0 || n2 == 1 ? !this.a(abu3, 3, 39, false) : (n2 >= 3 && n2 < 30 ? !this.a(abu3, 30, 39, false) : n2 >= 30 && n2 < 39 && !this.a(abu3, 3, 30, false))) {
                return null;
            }
            if (abu3.b == 0) {
                zp2.c(null);
            } else {
                zp2.f();
            }
            if (abu3.b == abu2.b) {
                return null;
            }
            zp2.a(xq2, abu3);
        }
        return abu2;
    }

    @Override
    public void b(xq xq2) {
        super.b(xq2);
        this.a.a_((xq)null);
        super.b(xq2);
        if (this.g.E) {
            return;
        }
        abu abu2 = this.f.a_(0);
        if (abu2 != null) {
            xq2.a(abu2, false);
        }
        if ((abu2 = this.f.a_(1)) != null) {
            xq2.a(abu2, false);
        }
    }
}

