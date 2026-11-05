/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class yx
extends yj {
    public ps a = new yy(this, "Enchant", true, 1);
    private afs h;
    private int i;
    private int j;
    private int k;
    private Random l = new Random();
    public long f;
    public int[] g = new int[3];

    public yx(xo xo2, afs afs2, int n2, int n3, int n4) {
        int n5;
        this.h = afs2;
        this.i = n2;
        this.j = n3;
        this.k = n4;
        this.a(new yz(this, this.a, 0, 25, 47));
        for (n5 = 0; n5 < 3; ++n5) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.a(new zp(xo2, i2 + n5 * 9 + 9, 8 + i2 * 18, 84 + n5 * 18));
            }
        }
        for (n5 = 0; n5 < 9; ++n5) {
            this.a(new zp(xo2, n5, 8 + n5 * 18, 142));
        }
    }

    @Override
    public void a(yt yt2) {
        super.a(yt2);
        yt2.a((yj)this, 0, this.g[0]);
        yt2.a((yj)this, 1, this.g[1]);
        yt2.a((yj)this, 2, this.g[2]);
    }

    @Override
    public void b() {
        super.b();
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            yt yt2 = (yt)this.e.get(i2);
            yt2.a((yj)this, 0, this.g[0]);
            yt2.a((yj)this, 1, this.g[1]);
            yt2.a((yj)this, 2, this.g[2]);
        }
    }

    @Override
    public void b(int n2, int n3) {
        if (n2 >= 0 && n2 <= 2) {
            this.g[n2] = n3;
        } else {
            super.b(n2, n3);
        }
    }

    @Override
    public void a(ps ps2) {
        if (ps2 == this.a) {
            abu abu2 = ps2.a(0);
            if (abu2 == null || !abu2.x()) {
                for (int i2 = 0; i2 < 3; ++i2) {
                    this.g[i2] = 0;
                }
            } else {
                this.f = this.l.nextLong();
                if (!this.h.E) {
                    int n2;
                    int n3 = 0;
                    for (n2 = -1; n2 <= 1; ++n2) {
                        for (int i3 = -1; i3 <= 1; ++i3) {
                            if (n2 == 0 && i3 == 0 || !this.h.c(this.i + i3, this.j, this.k + n2) || !this.h.c(this.i + i3, this.j + 1, this.k + n2)) continue;
                            if (this.h.a(this.i + i3 * 2, this.j, this.k + n2 * 2) == aie.X) {
                                ++n3;
                            }
                            if (this.h.a(this.i + i3 * 2, this.j + 1, this.k + n2 * 2) == aie.X) {
                                ++n3;
                            }
                            if (i3 == 0 || n2 == 0) continue;
                            if (this.h.a(this.i + i3 * 2, this.j, this.k + n2) == aie.X) {
                                ++n3;
                            }
                            if (this.h.a(this.i + i3 * 2, this.j + 1, this.k + n2) == aie.X) {
                                ++n3;
                            }
                            if (this.h.a(this.i + i3, this.j, this.k + n2 * 2) == aie.X) {
                                ++n3;
                            }
                            if (this.h.a(this.i + i3, this.j + 1, this.k + n2 * 2) != aie.X) continue;
                            ++n3;
                        }
                    }
                    for (n2 = 0; n2 < 3; ++n2) {
                        this.g[n2] = aem.a(this.l, n2, n3, abu2);
                    }
                    this.b();
                }
            }
        }
    }

    @Override
    public boolean a(xq xq2, int n2) {
        abu abu2 = this.a.a(0);
        if (this.g[n2] > 0 && abu2 != null && (xq2.bF >= this.g[n2] || xq2.bE.d)) {
            if (!this.h.E) {
                boolean bl2;
                List list = aem.b(this.l, abu2, this.g[n2]);
                boolean bl3 = bl2 = abu2.b() == abv.aG;
                if (list != null) {
                    xq2.a(-this.g[n2]);
                    if (bl2) {
                        abu2.a(abv.bR);
                    }
                    int n3 = bl2 && list.size() > 1 ? this.l.nextInt(list.size()) : -1;
                    for (int i2 = 0; i2 < list.size(); ++i2) {
                        aet aet2 = (aet)list.get(i2);
                        if (bl2 && i2 == n3) continue;
                        if (bl2) {
                            abv.bR.a(abu2, aet2);
                            continue;
                        }
                        abu2.a(aet2.b, aet2.c);
                    }
                    this.a(this.a);
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void b(xq xq2) {
        super.b(xq2);
        if (this.h.E) {
            return;
        }
        abu abu2 = this.a.a_(0);
        if (abu2 != null) {
            xq2.a(abu2, false);
        }
    }

    @Override
    public boolean a(xq xq2) {
        if (this.h.a(this.i, this.j, this.k) != aie.bn) {
            return false;
        }
        return !(xq2.e((double)this.i + 0.5, (double)this.j + 0.5, (double)this.k + 0.5) > 64.0);
    }

    @Override
    public abu b(xq xq2, int n2) {
        abu abu2 = null;
        zp zp2 = (zp)this.c.get(n2);
        if (zp2 != null && zp2.e()) {
            abu abu3 = zp2.d();
            abu2 = abu3.m();
            if (n2 == 0) {
                if (!this.a(abu3, 1, 37, true)) {
                    return null;
                }
            } else if (!((zp)this.c.get(0)).e() && ((zp)this.c.get(0)).a(abu3)) {
                if (abu3.p() && abu3.b == 1) {
                    ((zp)this.c.get(0)).c(abu3.m());
                    abu3.b = 0;
                } else if (abu3.b >= 1) {
                    ((zp)this.c.get(0)).c(new abu(abu3.b(), 1, abu3.k()));
                    --abu3.b;
                }
            } else {
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
}

