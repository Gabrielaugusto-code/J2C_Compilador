/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Sets;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class agl {
    private static final Logger aC = LogManager.getLogger();
    protected static final agm a = new agm(0.1f, 0.2f);
    protected static final agm b = new agm(-0.5f, 0.0f);
    protected static final agm c = new agm(-1.0f, 0.1f);
    protected static final agm d = new agm(-1.8f, 0.1f);
    protected static final agm e = new agm(0.125f, 0.05f);
    protected static final agm f = new agm(0.2f, 0.2f);
    protected static final agm g = new agm(0.45f, 0.3f);
    protected static final agm h = new agm(1.5f, 0.025f);
    protected static final agm i = new agm(1.0f, 0.5f);
    protected static final agm j = new agm(0.0f, 0.025f);
    protected static final agm k = new agm(0.1f, 0.8f);
    protected static final agm l = new agm(0.2f, 0.3f);
    protected static final agm m = new agm(-0.2f, 0.1f);
    private static final agl[] aD = new agl[256];
    public static final Set n = Sets.newHashSet();
    public static final agl o = new ahf(0).b(112).a("Ocean").a(c);
    public static final agl p = new ahg(1).b(9286496).a("Plains");
    public static final agl q = new agt(2).b(16421912).a("Desert").b().a(2.0f, 0.0f).a(e);
    public static final agl r = new agu(3, false).b(0x606060).a("Extreme Hills").a(i).a(0.2f, 0.3f);
    public static final agl s = new agw(4, 0).b(353825).a("Forest");
    public static final agl t = new ahn(5, 0).b(747097).a("Taiga").a(5159473).a(0.25f, 0.8f).a(f);
    public static final agl u = new ahm(6).b(522674).a("Swampland").a(9154376).a(m).a(0.8f, 0.9f);
    public static final agl v = new ahi(7).b(255).a("River").a(b);
    public static final agl w = new agz(8).b(0xFF0000).a("Hell").b().a(2.0f, 0.0f);
    public static final agl x = new aho(9).b(0x8080FF).a("Sky").b();
    public static final agl y = new ahf(10).b(0x9090A0).a("FrozenOcean").c().a(c).a(0.0f, 0.5f);
    public static final agl z = new ahi(11).b(0xA0A0FF).a("FrozenRiver").c().a(b).a(0.0f, 0.5f);
    public static final agl A = new aha(12, false).b(0xFFFFFF).a("Ice Plains").c().a(0.0f, 0.5f).a(e);
    public static final agl B = new aha(13, false).b(0xA0A0A0).a("Ice Mountains").c().a(g).a(0.0f, 0.5f);
    public static final agl C = new ahd(14).b(0xFF00FF).a("MushroomIsland").a(0.9f, 1.0f).a(l);
    public static final agl D = new ahd(15).b(0xA000FF).a("MushroomIslandShore").a(0.9f, 1.0f).a(j);
    public static final agl E = new agk(16).b(16440917).a("Beach").a(0.8f, 0.4f).a(j);
    public static final agl F = new agt(17).b(13786898).a("DesertHills").b().a(2.0f, 0.0f).a(g);
    public static final agl G = new agw(18, 0).b(2250012).a("ForestHills").a(g);
    public static final agl H = new ahn(19, 0).b(1456435).a("TaigaHills").a(5159473).a(0.25f, 0.8f).a(g);
    public static final agl I = new agu(20, true).b(7501978).a("Extreme Hills Edge").a(i.a()).a(0.2f, 0.3f);
    public static final agl J = new ahb(21, false).b(5470985).a("Jungle").a(5470985).a(0.95f, 0.9f);
    public static final agl K = new ahb(22, false).b(2900485).a("JungleHills").a(5470985).a(0.95f, 0.9f).a(g);
    public static final agl L = new ahb(23, true).b(6458135).a("JungleEdge").a(5470985).a(0.95f, 0.8f);
    public static final agl M = new ahf(24).b(48).a("Deep Ocean").a(d);
    public static final agl N = new ahl(25).b(10658436).a("Stone Beach").a(0.2f, 0.3f).a(k);
    public static final agl O = new agk(26).b(16445632).a("Cold Beach").a(0.05f, 0.3f).a(j).c();
    public static final agl P = new agw(27, 2).a("Birch Forest").b(3175492);
    public static final agl Q = new agw(28, 2).a("Birch Forest Hills").b(2055986).a(g);
    public static final agl R = new agw(29, 3).b(4215066).a("Roofed Forest");
    public static final agl S = new ahn(30, 0).b(3233098).a("Cold Taiga").a(5159473).c().a(-0.5f, 0.4f).a(f).c(0xFFFFFF);
    public static final agl T = new ahn(31, 0).b(2375478).a("Cold Taiga Hills").a(5159473).c().a(-0.5f, 0.4f).a(g).c(0xFFFFFF);
    public static final agl U = new ahn(32, 1).b(5858897).a("Mega Taiga").a(5159473).a(0.3f, 0.8f).a(f);
    public static final agl V = new ahn(33, 1).b(4542270).a("Mega Taiga Hills").a(5159473).a(0.3f, 0.8f).a(g);
    public static final agl W = new agu(34, true).b(0x507050).a("Extreme Hills+").a(i).a(0.2f, 0.3f);
    public static final agl X = new ahj(35).b(12431967).a("Savanna").a(1.2f, 0.0f).b().a(e);
    public static final agl Y = new ahj(36).b(10984804).a("Savanna Plateau").a(1.0f, 0.0f).b().a(h);
    public static final agl Z = new ahc(37, false, false).b(14238997).a("Mesa");
    public static final agl aa = new ahc(38, false, true).b(11573093).a("Mesa Plateau F").a(h);
    public static final agl ab = new ahc(39, false, false).b(13274213).a("Mesa Plateau").a(h);
    protected static final avc ac;
    protected static final avc ad;
    protected static final aqd ae;
    public String af;
    public int ag;
    public int ah;
    public ahz ai = aie.c;
    public int aj = 0;
    public ahz ak = aie.d;
    public int al = 5169201;
    public float am;
    public float an;
    public float ao;
    public float ap;
    public int aq;
    public agr ar;
    protected List as;
    protected List at;
    protected List au;
    protected List av;
    protected boolean aw;
    protected boolean ax;
    public final int ay;
    protected arh az;
    protected apu aA;
    protected arf aB;

    protected agl(int n2) {
        this.am = agl.a.a;
        this.an = agl.a.b;
        this.ao = 0.5f;
        this.ap = 0.5f;
        this.aq = 0xFFFFFF;
        this.as = new ArrayList();
        this.at = new ArrayList();
        this.au = new ArrayList();
        this.av = new ArrayList();
        this.ax = true;
        this.az = new arh(false);
        this.aA = new apu(false);
        this.aB = new arf();
        this.ay = n2;
        agl.aD[n2] = this;
        this.ar = this.a();
        this.at.add(new ago(vg.class, 12, 4, 4));
        this.at.add(new ago(vf.class, 10, 4, 4));
        this.at.add(new ago(ux.class, 10, 4, 4));
        this.at.add(new ago(uy.class, 8, 4, 4));
        this.as.add(new ago(xe.class, 100, 4, 4));
        this.as.add(new ago(xh.class, 100, 4, 4));
        this.as.add(new ago(xc.class, 100, 4, 4));
        this.as.add(new ago(wq.class, 100, 4, 4));
        this.as.add(new ago(xd.class, 100, 4, 4));
        this.as.add(new ago(wr.class, 10, 1, 4));
        this.as.add(new ago(xg.class, 5, 1, 1));
        this.au.add(new ago(vj.class, 10, 4, 4));
        this.av.add(new ago(uv.class, 10, 8, 8));
    }

    protected agr a() {
        return new agr();
    }

    protected agl a(float f2, float f3) {
        if (f2 > 0.1f && f2 < 0.2f) {
            throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
        }
        this.ao = f2;
        this.ap = f3;
        return this;
    }

    protected final agl a(agm agm2) {
        this.am = agm2.a;
        this.an = agm2.b;
        return this;
    }

    protected agl b() {
        this.ax = false;
        return this;
    }

    public apt a(Random random) {
        if (random.nextInt(10) == 0) {
            return this.aA;
        }
        return this.az;
    }

    public aqe b(Random random) {
        return new arg(aie.H, 1);
    }

    public String a(Random random, int n2, int n3, int n4) {
        if (random.nextInt(3) > 0) {
            return ajt.b[0];
        }
        return ajt.a[0];
    }

    protected agl c() {
        this.aw = true;
        return this;
    }

    protected agl a(String string) {
        this.af = string;
        return this;
    }

    protected agl a(int n2) {
        this.al = n2;
        return this;
    }

    protected agl b(int n2) {
        this.a(n2, false);
        return this;
    }

    protected agl c(int n2) {
        this.ah = n2;
        return this;
    }

    protected agl a(int n2, boolean bl2) {
        this.ag = n2;
        this.ah = bl2 ? (n2 & 0xFEFEFE) >> 1 : n2;
        return this;
    }

    public int a(float f2) {
        if ((f2 /= 3.0f) < -1.0f) {
            f2 = -1.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return Color.getHSBColor(0.62222224f - f2 * 0.05f, 0.5f + f2 * 0.1f, 1.0f).getRGB();
    }

    public List a(ro ro2) {
        if (ro2 == ro.a) {
            return this.as;
        }
        if (ro2 == ro.b) {
            return this.at;
        }
        if (ro2 == ro.d) {
            return this.au;
        }
        if (ro2 == ro.c) {
            return this.av;
        }
        return null;
    }

    public boolean d() {
        return this.j();
    }

    public boolean e() {
        if (this.j()) {
            return false;
        }
        return this.ax;
    }

    public boolean f() {
        return this.ap > 0.85f;
    }

    public float g() {
        return 0.1f;
    }

    public final int h() {
        return (int)(this.ap * 65536.0f);
    }

    public final float i() {
        return this.ap;
    }

    public final float a(int n2, int n3, int n4) {
        if (n3 > 64) {
            float f2 = (float)ac.a((double)n2 * 1.0 / 8.0, (double)n4 * 1.0 / 8.0) * 4.0f;
            return this.ao - (f2 + (float)n3 - 64.0f) * 0.05f / 30.0f;
        }
        return this.ao;
    }

    public void a(afs afs2, Random random, int n2, int n3) {
        this.ar.a(afs2, random, this, n2, n3);
    }

    public int b(int n2, int n3, int n4) {
        double d2 = oy.a(this.a(n2, n3, n4), 0.0f, 1.0f);
        double d3 = oy.a(this.i(), 0.0f, 1.0f);
        return afr.a(d2, d3);
    }

    public int c(int n2, int n3, int n4) {
        double d2 = oy.a(this.a(n2, n3, n4), 0.0f, 1.0f);
        double d3 = oy.a(this.i(), 0.0f, 1.0f);
        return afo.a(d2, d3);
    }

    public boolean j() {
        return this.aw;
    }

    public void a(afs afs2, Random random, ahz[] ahzArray, byte[] byArray, int n2, int n3, double d2) {
        this.b(afs2, random, ahzArray, byArray, n2, n3, d2);
    }

    public final void b(afs afs2, Random random, ahz[] ahzArray, byte[] byArray, int n2, int n3, double d2) {
        int n4 = 63;
        ahz ahz2 = this.ai;
        byte by2 = (byte)(this.aj & 0xFF);
        ahz ahz3 = this.ak;
        int n5 = -1;
        int n6 = (int)(d2 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        int n7 = n2 & 0xF;
        int n8 = n3 & 0xF;
        int n9 = ahzArray.length / 256;
        for (int i2 = 255; i2 >= 0; --i2) {
            int n10 = (n8 * 16 + n7) * n9 + i2;
            if (i2 <= 0 + random.nextInt(5)) {
                ahzArray[n10] = aie.h;
                continue;
            }
            ahz ahz4 = ahzArray[n10];
            if (ahz4 == null || ahz4.o() == avk.a) {
                n5 = -1;
                continue;
            }
            if (ahz4 != aie.b) continue;
            if (n5 == -1) {
                if (n6 <= 0) {
                    ahz2 = null;
                    by2 = 0;
                    ahz3 = aie.b;
                } else if (i2 >= 59 && i2 <= 64) {
                    ahz2 = this.ai;
                    by2 = (byte)(this.aj & 0xFF);
                    ahz3 = this.ak;
                }
                if (i2 < 63 && (ahz2 == null || ahz2.o() == avk.a)) {
                    if (this.a(n2, i2, n3) < 0.15f) {
                        ahz2 = aie.aD;
                        by2 = 0;
                    } else {
                        ahz2 = aie.j;
                        by2 = 0;
                    }
                }
                n5 = n6;
                if (i2 >= 62) {
                    ahzArray[n10] = ahz2;
                    byArray[n10] = by2;
                    continue;
                }
                if (i2 < 56 - n6) {
                    ahz2 = null;
                    ahz3 = aie.b;
                    ahzArray[n10] = aie.n;
                    continue;
                }
                ahzArray[n10] = ahz3;
                continue;
            }
            if (n5 <= 0) continue;
            ahzArray[n10] = ahz3;
            if (--n5 != 0 || ahz3 != aie.m) continue;
            n5 = random.nextInt(4) + Math.max(0, i2 - 63);
            ahz3 = aie.A;
        }
    }

    protected agl k() {
        return new ahe(this.ay + 128, this);
    }

    public Class l() {
        return this.getClass();
    }

    public boolean a(agl agl2) {
        if (agl2 == this) {
            return true;
        }
        if (agl2 == null) {
            return false;
        }
        return this.l() == agl2.l();
    }

    public agn m() {
        if ((double)this.ao < 0.2) {
            return agn.b;
        }
        if ((double)this.ao < 1.0) {
            return agn.c;
        }
        return agn.d;
    }

    public static agl[] n() {
        return aD;
    }

    public static agl d(int n2) {
        if (n2 < 0 || n2 > aD.length) {
            aC.warn("Biome ID is out of bounds: " + n2 + ", defaulting to 0 (Ocean)");
            return o;
        }
        return aD[n2];
    }

    static {
        p.k();
        q.k();
        s.k();
        t.k();
        u.k();
        A.k();
        J.k();
        L.k();
        S.k();
        X.k();
        Y.k();
        Z.k();
        aa.k();
        ab.k();
        P.k();
        Q.k();
        R.k();
        U.k();
        r.k();
        W.k();
        agl.aD[agl.V.ay + 128] = aD[agl.U.ay + 128];
        for (agl agl2 : aD) {
            if (agl2 == null || agl2.ay >= 128) continue;
            n.add(agl2);
        }
        n.remove(w);
        n.remove(x);
        n.remove(y);
        n.remove(I);
        ac = new avc(new Random(1234L), 1);
        ad = new avc(new Random(2345L), 1);
        ae = new aqd();
    }
}

