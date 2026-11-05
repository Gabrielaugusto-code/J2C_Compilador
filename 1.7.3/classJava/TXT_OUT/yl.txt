/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class yl
extends yj {
    private static final Logger f = LogManager.getLogger();
    private ps g = new zn();
    private ps h = new ym(this, "Repair", true, 2);
    private afs i;
    private int j;
    private int k;
    private int l;
    public int a;
    private int m;
    private String n;
    private final xq o;

    public yl(xo xo2, afs afs2, int n2, int n3, int n4, xq xq2) {
        int n5;
        this.i = afs2;
        this.j = n2;
        this.k = n3;
        this.l = n4;
        this.o = xq2;
        this.a(new zp(this.h, 0, 27, 47));
        this.a(new zp(this.h, 1, 76, 47));
        this.a(new yn(this, this.g, 2, 134, 47, afs2, n2, n3, n4));
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
    public void a(ps ps2) {
        super.a(ps2);
        if (ps2 == this.h) {
            this.e();
        }
    }

    public void e() {
        int n2;
        int n3;
        int n4;
        int n5;
        abu abu2 = this.h.a(0);
        this.a = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        if (abu2 == null) {
            this.g.a(0, null);
            this.a = 0;
            return;
        }
        abu abu3 = abu2.m();
        abu abu4 = this.h.a(1);
        Map map = aem.a(abu3);
        boolean bl2 = false;
        n7 += abu2.C() + (abu4 == null ? 0 : abu4.C());
        this.m = 0;
        if (abu4 != null) {
            boolean bl3 = bl2 = abu4.b() == abv.bR && abv.bR.g(abu4).c() > 0;
            if (abu3.g() && abu3.b().a(abu2, abu4)) {
                int n9;
                n5 = Math.min(abu3.j(), abu3.l() / 4);
                if (n5 <= 0) {
                    this.g.a(0, null);
                    this.a = 0;
                    return;
                }
                for (n9 = 0; n5 > 0 && n9 < abu4.b; ++n9) {
                    n4 = abu3.j() - n5;
                    abu3.b(n4);
                    n6 += Math.max(1, n5 / 100) + map.size();
                    n5 = Math.min(abu3.j(), abu3.l() / 4);
                }
                this.m = n9;
            } else {
                if (!(bl2 || abu3.b() == abu4.b() && abu3.g())) {
                    this.g.a(0, null);
                    this.a = 0;
                    return;
                }
                if (abu3.g() && !bl2) {
                    int n10 = abu2.l() - abu2.j();
                    int n11 = abu4.l() - abu4.j();
                    n4 = n11 + abu3.l() * 12 / 100;
                    int n12 = n10 + n4;
                    n3 = abu3.l() - n12;
                    if (n3 < 0) {
                        n3 = 0;
                    }
                    if (n3 < abu3.k()) {
                        abu3.b(n3);
                        n6 += Math.max(1, n4 / 100);
                    }
                }
                Map map2 = aem.a(abu4);
                Iterator iterator = map2.keySet().iterator();
                while (iterator.hasNext()) {
                    n4 = (Integer)iterator.next();
                    aek aek2 = aek.b[n4];
                    n3 = map.containsKey(n4) ? (Integer)map.get(n4) : 0;
                    n2 = (Integer)map2.get(n4);
                    n2 = n3 == n2 ? ++n2 : Math.max(n2, n3);
                    int n13 = n2 - n3;
                    boolean bl4 = aek2.a(abu2);
                    if (this.o.bE.d || abu2.b() == abv.bR) {
                        bl4 = true;
                    }
                    Iterator iterator2 = map.keySet().iterator();
                    while (iterator2.hasNext()) {
                        int n14 = (Integer)iterator2.next();
                        if (n14 == n4 || aek2.a(aek.b[n14])) continue;
                        bl4 = false;
                        n6 += n13;
                    }
                    if (!bl4) continue;
                    if (n2 > aek2.b()) {
                        n2 = aek2.b();
                    }
                    map.put(n4, n2);
                    int n15 = 0;
                    switch (aek2.c()) {
                        case 10: {
                            n15 = 1;
                            break;
                        }
                        case 5: {
                            n15 = 2;
                            break;
                        }
                        case 2: {
                            n15 = 4;
                            break;
                        }
                        case 1: {
                            n15 = 8;
                        }
                    }
                    if (bl2) {
                        n15 = Math.max(1, n15 / 2);
                    }
                    n6 += n15 * n13;
                }
            }
        }
        if (StringUtils.isBlank((CharSequence)this.n)) {
            if (abu2.u()) {
                n8 = abu2.g() ? 7 : abu2.b * 5;
                n6 += n8;
                abu3.t();
            }
        } else if (!this.n.equals(abu2.s())) {
            n8 = abu2.g() ? 7 : abu2.b * 5;
            n6 += n8;
            if (abu2.u()) {
                n7 += n8 / 2;
            }
            abu3.c(this.n);
        }
        n5 = 0;
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            n4 = (Integer)iterator.next();
            aek aek3 = aek.b[n4];
            n3 = (Integer)map.get(n4);
            n2 = 0;
            ++n5;
            switch (aek3.c()) {
                case 10: {
                    n2 = 1;
                    break;
                }
                case 5: {
                    n2 = 2;
                    break;
                }
                case 2: {
                    n2 = 4;
                    break;
                }
                case 1: {
                    n2 = 8;
                }
            }
            if (bl2) {
                n2 = Math.max(1, n2 / 2);
            }
            n7 += n5 + n3 * n2;
        }
        if (bl2) {
            n7 = Math.max(1, n7 / 2);
        }
        this.a = n7 + n6;
        if (n6 <= 0) {
            abu3 = null;
        }
        if (n8 == n6 && n8 > 0 && this.a >= 40) {
            this.a = 39;
        }
        if (this.a >= 40 && !this.o.bE.d) {
            abu3 = null;
        }
        if (abu3 != null) {
            int n16 = abu3.C();
            if (abu4 != null && n16 < abu4.C()) {
                n16 = abu4.C();
            }
            if (abu3.u()) {
                n16 -= 9;
            }
            if (n16 < 0) {
                n16 = 0;
            }
            abu3.c(n16 += 2);
            aem.a(map, abu3);
        }
        this.g.a(0, abu3);
        this.b();
    }

    @Override
    public void a(yt yt2) {
        super.a(yt2);
        yt2.a((yj)this, 0, this.a);
    }

    @Override
    public void b(int n2, int n3) {
        if (n2 == 0) {
            this.a = n3;
        }
    }

    @Override
    public void b(xq xq2) {
        super.b(xq2);
        if (this.i.E) {
            return;
        }
        for (int i2 = 0; i2 < this.h.a(); ++i2) {
            abu abu2 = this.h.a_(i2);
            if (abu2 == null) continue;
            xq2.a(abu2, false);
        }
    }

    @Override
    public boolean a(xq xq2) {
        if (this.i.a(this.j, this.k, this.l) != aie.bQ) {
            return false;
        }
        return !(xq2.e((double)this.j + 0.5, (double)this.k + 0.5, (double)this.l + 0.5) > 64.0);
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
            } else if (n2 == 0 || n2 == 1 ? !this.a(abu3, 3, 39, false) : n2 >= 3 && n2 < 39 && !this.a(abu3, 0, 2, false)) {
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

    public void a(String string) {
        this.n = string;
        if (this.a(2).e()) {
            abu abu2 = this.a(2).d();
            if (StringUtils.isBlank((CharSequence)string)) {
                abu2.t();
            } else {
                abu2.c(this.n);
            }
        }
        this.e();
    }

    static /* synthetic */ ps a(yl yl2) {
        return yl2.h;
    }

    static /* synthetic */ int b(yl yl2) {
        return yl2.m;
    }
}

