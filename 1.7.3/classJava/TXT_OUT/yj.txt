/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class yj {
    public List b = new ArrayList();
    public List c = new ArrayList();
    public int d;
    private short a;
    private int f = -1;
    private int g;
    private final Set h = new HashSet();
    protected List e = new ArrayList();
    private Set i = new HashSet();

    protected zp a(zp zp2) {
        zp2.g = this.c.size();
        this.c.add(zp2);
        this.b.add(null);
        return zp2;
    }

    public void a(yt yt2) {
        if (this.e.contains(yt2)) {
            throw new IllegalArgumentException("Listener already listening");
        }
        this.e.add(yt2);
        yt2.a(this, this.a());
        this.b();
    }

    public void b(yt yt2) {
        this.e.remove(yt2);
    }

    public List a() {
        ArrayList<abu> arrayList = new ArrayList<abu>();
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            arrayList.add(((zp)this.c.get(i2)).d());
        }
        return arrayList;
    }

    public void b() {
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            abu abu2 = ((zp)this.c.get(i2)).d();
            abu abu3 = (abu)this.b.get(i2);
            if (abu.b(abu3, abu2)) continue;
            abu3 = abu2 == null ? null : abu2.m();
            this.b.set(i2, abu3);
            for (int i3 = 0; i3 < this.e.size(); ++i3) {
                ((yt)this.e.get(i3)).a(this, i2, abu3);
            }
        }
    }

    public boolean a(xq xq2, int n2) {
        return false;
    }

    public zp a(ps ps2, int n2) {
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            zp zp2 = (zp)this.c.get(i2);
            if (!zp2.a(ps2, n2)) continue;
            return zp2;
        }
        return null;
    }

    public zp a(int n2) {
        return (zp)this.c.get(n2);
    }

    public abu b(xq xq2, int n2) {
        zp zp2 = (zp)this.c.get(n2);
        if (zp2 != null) {
            return zp2.d();
        }
        return null;
    }

    public abu a(int n2, int n3, int n4, xq xq2) {
        abu abu2 = null;
        xo xo2 = xq2.bm;
        if (n4 == 5) {
            int n5 = this.g;
            this.g = yj.c(n3);
            if ((n5 != 1 || this.g != 2) && n5 != this.g) {
                this.d();
            } else if (xo2.o() == null) {
                this.d();
            } else if (this.g == 0) {
                this.f = yj.b(n3);
                if (yj.d(this.f)) {
                    this.g = 1;
                    this.h.clear();
                } else {
                    this.d();
                }
            } else if (this.g == 1) {
                zp zp2 = (zp)this.c.get(n2);
                if (zp2 != null && yj.a(zp2, xo2.o(), true) && zp2.a(xo2.o()) && xo2.o().b > this.h.size() && this.b(zp2)) {
                    this.h.add(zp2);
                }
            } else if (this.g == 2) {
                if (!this.h.isEmpty()) {
                    abu abu3 = xo2.o().m();
                    int n6 = xo2.o().b;
                    for (zp zp3 : this.h) {
                        if (zp3 == null || !yj.a(zp3, xo2.o(), true) || !zp3.a(xo2.o()) || xo2.o().b < this.h.size() || !this.b(zp3)) continue;
                        abu abu4 = abu3.m();
                        int n7 = zp3.e() ? zp3.d().b : 0;
                        yj.a(this.h, this.f, abu4, n7);
                        if (abu4.b > abu4.e()) {
                            abu4.b = abu4.e();
                        }
                        if (abu4.b > zp3.a()) {
                            abu4.b = zp3.a();
                        }
                        n6 -= abu4.b - n7;
                        zp3.c(abu4);
                    }
                    abu3.b = n6;
                    if (abu3.b <= 0) {
                        abu3 = null;
                    }
                    xo2.b(abu3);
                }
                this.d();
            } else {
                this.d();
            }
        } else if (this.g != 0) {
            this.d();
        } else if (!(n4 != 0 && n4 != 1 || n3 != 0 && n3 != 1)) {
            if (n2 == -999) {
                if (xo2.o() != null && n2 == -999) {
                    if (n3 == 0) {
                        xq2.a(xo2.o(), true);
                        xo2.b((abu)null);
                    }
                    if (n3 == 1) {
                        xq2.a(xo2.o().a(1), true);
                        if (xo2.o().b == 0) {
                            xo2.b((abu)null);
                        }
                    }
                }
            } else if (n4 == 1) {
                abu abu5;
                if (n2 < 0) {
                    return null;
                }
                zp zp4 = (zp)this.c.get(n2);
                if (zp4 != null && zp4.a(xq2) && (abu5 = this.b(xq2, n2)) != null) {
                    abs abs2 = abu5.b();
                    abu2 = abu5.m();
                    if (zp4.d() != null && zp4.d().b() == abs2) {
                        this.a(n2, n3, true, xq2);
                    }
                }
            } else {
                if (n2 < 0) {
                    return null;
                }
                zp zp5 = (zp)this.c.get(n2);
                if (zp5 != null) {
                    abu abu6 = zp5.d();
                    abu abu7 = xo2.o();
                    if (abu6 != null) {
                        abu2 = abu6.m();
                    }
                    if (abu6 == null) {
                        if (abu7 != null && zp5.a(abu7)) {
                            int n8;
                            int n9 = n8 = n3 == 0 ? abu7.b : 1;
                            if (n8 > zp5.a()) {
                                n8 = zp5.a();
                            }
                            if (abu7.b >= n8) {
                                zp5.c(abu7.a(n8));
                            }
                            if (abu7.b == 0) {
                                xo2.b((abu)null);
                            }
                        }
                    } else if (zp5.a(xq2)) {
                        int n10;
                        if (abu7 == null) {
                            int n11 = n3 == 0 ? abu6.b : (abu6.b + 1) / 2;
                            abu abu8 = zp5.a(n11);
                            xo2.b(abu8);
                            if (abu6.b == 0) {
                                zp5.c(null);
                            }
                            zp5.a(xq2, xo2.o());
                        } else if (zp5.a(abu7)) {
                            if (abu6.b() != abu7.b() || abu6.k() != abu7.k() || !abu.a(abu6, abu7)) {
                                if (abu7.b <= zp5.a()) {
                                    zp5.c(abu7);
                                    xo2.b(abu6);
                                }
                            } else {
                                int n12;
                                int n13 = n12 = n3 == 0 ? abu7.b : 1;
                                if (n12 > zp5.a() - abu6.b) {
                                    n12 = zp5.a() - abu6.b;
                                }
                                if (n12 > abu7.e() - abu6.b) {
                                    n12 = abu7.e() - abu6.b;
                                }
                                abu7.a(n12);
                                if (abu7.b == 0) {
                                    xo2.b((abu)null);
                                }
                                abu6.b += n12;
                            }
                        } else if (abu6.b() == abu7.b() && abu7.e() > 1 && (!abu6.h() || abu6.k() == abu7.k()) && abu.a(abu6, abu7) && (n10 = abu6.b) > 0 && n10 + abu7.b <= abu7.e()) {
                            abu7.b += n10;
                            abu6 = zp5.a(n10);
                            if (abu6.b == 0) {
                                zp5.c(null);
                            }
                            zp5.a(xq2, xo2.o());
                        }
                    }
                    zp5.f();
                }
            }
        } else if (n4 == 2 && n3 >= 0 && n3 < 9) {
            zp zp6 = (zp)this.c.get(n2);
            if (zp6.a(xq2)) {
                abu abu9 = xo2.a(n3);
                boolean bl2 = abu9 == null || zp6.f == xo2 && zp6.a(abu9);
                int n14 = -1;
                if (!bl2) {
                    n14 = xo2.j();
                    bl2 |= n14 > -1;
                }
                if (zp6.e() && bl2) {
                    abu abu10 = zp6.d();
                    xo2.a(n3, abu10.m());
                    if (zp6.f == xo2 && zp6.a(abu9) || abu9 == null) {
                        zp6.a(abu10.b);
                        zp6.c(abu9);
                        zp6.a(xq2, abu10);
                    } else if (n14 > -1) {
                        xo2.a(abu9);
                        zp6.a(abu10.b);
                        zp6.c(null);
                        zp6.a(xq2, abu10);
                    }
                } else if (!zp6.e() && abu9 != null && zp6.a(abu9)) {
                    xo2.a(n3, null);
                    zp6.c(abu9);
                }
            }
        } else if (n4 == 3 && xq2.bE.d && xo2.o() == null && n2 >= 0) {
            zp zp7 = (zp)this.c.get(n2);
            if (zp7 != null && zp7.e()) {
                abu abu11 = zp7.d().m();
                abu11.b = abu11.e();
                xo2.b(abu11);
            }
        } else if (n4 == 4 && xo2.o() == null && n2 >= 0) {
            zp zp8 = (zp)this.c.get(n2);
            if (zp8 != null && zp8.e() && zp8.a(xq2)) {
                abu abu12 = zp8.a(n3 == 0 ? 1 : zp8.d().b);
                zp8.a(xq2, abu12);
                xq2.a(abu12, true);
            }
        } else if (n4 == 6 && n2 >= 0) {
            zp zp9 = (zp)this.c.get(n2);
            abu abu13 = xo2.o();
            if (!(abu13 == null || zp9 != null && zp9.e() && zp9.a(xq2))) {
                int n15 = n3 == 0 ? 0 : this.c.size() - 1;
                int n16 = n3 == 0 ? 1 : -1;
                for (int i2 = 0; i2 < 2; ++i2) {
                    for (int i3 = n15; i3 >= 0 && i3 < this.c.size() && abu13.b < abu13.e(); i3 += n16) {
                        zp zp10 = (zp)this.c.get(i3);
                        if (!zp10.e() || !yj.a(zp10, abu13, true) || !zp10.a(xq2) || !this.a(abu13, zp10) || i2 == 0 && zp10.d().b == zp10.d().e()) continue;
                        int n17 = Math.min(abu13.e() - abu13.b, zp10.d().b);
                        abu abu14 = zp10.a(n17);
                        abu13.b += n17;
                        if (abu14.b <= 0) {
                            zp10.c(null);
                        }
                        zp10.a(xq2, abu14);
                    }
                }
            }
            this.b();
        }
        return abu2;
    }

    public boolean a(abu abu2, zp zp2) {
        return true;
    }

    protected void a(int n2, int n3, boolean bl2, xq xq2) {
        this.a(n2, n3, 1, xq2);
    }

    public void b(xq xq2) {
        xo xo2 = xq2.bm;
        if (xo2.o() != null) {
            xq2.a(xo2.o(), false);
            xo2.b((abu)null);
        }
    }

    public void a(ps ps2) {
        this.b();
    }

    public void a(int n2, abu abu2) {
        this.a(n2).c(abu2);
    }

    public void a(abu[] abuArray) {
        for (int i2 = 0; i2 < abuArray.length; ++i2) {
            this.a(i2).c(abuArray[i2]);
        }
    }

    public void b(int n2, int n3) {
    }

    public short a(xo xo2) {
        this.a = (short)(this.a + 1);
        return this.a;
    }

    public boolean c(xq xq2) {
        return !this.i.contains(xq2);
    }

    public void a(xq xq2, boolean bl2) {
        if (bl2) {
            this.i.remove(xq2);
        } else {
            this.i.add(xq2);
        }
    }

    public abstract boolean a(xq var1);

    protected boolean a(abu abu2, int n2, int n3, boolean bl2) {
        abu abu3;
        zp zp2;
        boolean bl3 = false;
        int n4 = n2;
        if (bl2) {
            n4 = n3 - 1;
        }
        if (abu2.f()) {
            while (abu2.b > 0 && (!bl2 && n4 < n3 || bl2 && n4 >= n2)) {
                zp2 = (zp)this.c.get(n4);
                abu3 = zp2.d();
                if (abu3 != null && abu3.b() == abu2.b() && (!abu2.h() || abu2.k() == abu3.k()) && abu.a(abu2, abu3)) {
                    int n5 = abu3.b + abu2.b;
                    if (n5 <= abu2.e()) {
                        abu2.b = 0;
                        abu3.b = n5;
                        zp2.f();
                        bl3 = true;
                    } else if (abu3.b < abu2.e()) {
                        abu2.b -= abu2.e() - abu3.b;
                        abu3.b = abu2.e();
                        zp2.f();
                        bl3 = true;
                    }
                }
                if (bl2) {
                    --n4;
                    continue;
                }
                ++n4;
            }
        }
        if (abu2.b > 0) {
            n4 = bl2 ? n3 - 1 : n2;
            while (!bl2 && n4 < n3 || bl2 && n4 >= n2) {
                zp2 = (zp)this.c.get(n4);
                abu3 = zp2.d();
                if (abu3 == null) {
                    zp2.c(abu2.m());
                    zp2.f();
                    abu2.b = 0;
                    bl3 = true;
                    break;
                }
                if (bl2) {
                    --n4;
                    continue;
                }
                ++n4;
            }
        }
        return bl3;
    }

    public static int b(int n2) {
        return n2 >> 2 & 3;
    }

    public static int c(int n2) {
        return n2 & 3;
    }

    public static int d(int n2, int n3) {
        return n2 & 3 | (n3 & 3) << 2;
    }

    public static boolean d(int n2) {
        return n2 == 0 || n2 == 1;
    }

    protected void d() {
        this.g = 0;
        this.h.clear();
    }

    public static boolean a(zp zp2, abu abu2, boolean bl2) {
        boolean bl3;
        boolean bl4 = bl3 = zp2 == null || !zp2.e();
        if (zp2 != null && zp2.e() && abu2 != null && abu2.a(zp2.d()) && abu.a(zp2.d(), abu2)) {
            bl3 |= zp2.d().b + (bl2 ? 0 : abu2.b) <= abu2.e();
        }
        return bl3;
    }

    public static void a(Set set, int n2, abu abu2, int n3) {
        switch (n2) {
            case 0: {
                abu2.b = oy.d((float)abu2.b / (float)set.size());
                break;
            }
            case 1: {
                abu2.b = 1;
            }
        }
        abu2.b += n3;
    }

    public boolean b(zp zp2) {
        return true;
    }

    public static int b(ps ps2) {
        if (ps2 == null) {
            return 0;
        }
        int n2 = 0;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < ps2.a(); ++i2) {
            abu abu2 = ps2.a(i2);
            if (abu2 == null) continue;
            f2 += (float)abu2.b / (float)Math.min(ps2.d(), abu2.e());
            ++n2;
        }
        return oy.d((f2 /= (float)ps2.a()) * 14.0f) + (n2 > 0 ? 1 : 0);
    }
}

