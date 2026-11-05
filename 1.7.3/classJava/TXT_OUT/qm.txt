/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class qm {
    public static final qm[] a = new qm[32];
    public static final qm b = null;
    public static final qm c = new qm(1, false, 8171462).b("potion.moveSpeed").b(0, 0).a(xa.d, "91AEAA56-376B-4498-935B-2F7F68070635", 0.2f, 2);
    public static final qm d = new qm(2, true, 5926017).b("potion.moveSlowdown").b(1, 0).a(xa.d, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15f, 2);
    public static final qm e = new qm(3, false, 14270531).b("potion.digSpeed").b(2, 0).a(1.5);
    public static final qm f = new qm(4, true, 4866583).b("potion.digSlowDown").b(3, 0);
    public static final qm g = new qj(5, false, 9643043).b("potion.damageBoost").b(4, 0).a(xa.e, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 3.0, 2);
    public static final qm h = new ql(6, false, 16262179).b("potion.heal");
    public static final qm i = new ql(7, true, 4393481).b("potion.harm");
    public static final qm j = new qm(8, false, 7889559).b("potion.jump").b(2, 1);
    public static final qm k = new qm(9, true, 5578058).b("potion.confusion").b(3, 1).a(0.25);
    public static final qm l = new qm(10, false, 13458603).b("potion.regeneration").b(7, 0).a(0.25);
    public static final qm m = new qm(11, false, 10044730).b("potion.resistance").b(6, 1);
    public static final qm n = new qm(12, false, 14981690).b("potion.fireResistance").b(7, 1);
    public static final qm o = new qm(13, false, 3035801).b("potion.waterBreathing").b(0, 2);
    public static final qm p = new qm(14, false, 8356754).b("potion.invisibility").b(0, 1);
    public static final qm q = new qm(15, true, 2039587).b("potion.blindness").b(5, 1).a(0.25);
    public static final qm r = new qm(16, false, 0x1F1FA1).b("potion.nightVision").b(4, 1);
    public static final qm s = new qm(17, true, 5797459).b("potion.hunger").b(1, 1);
    public static final qm t = new qj(18, true, 0x484D48).b("potion.weakness").b(5, 0).a(xa.e, "22653B89-116E-49DC-9B6B-9971489B5BE5", 2.0, 0);
    public static final qm u = new qm(19, true, 5149489).b("potion.poison").b(6, 0).a(0.25);
    public static final qm v = new qm(20, true, 3484199).b("potion.wither").b(1, 2).a(0.25);
    public static final qm w = new qk(21, false, 16284963).b("potion.healthBoost").b(2, 2).a(xa.a, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 4.0, 0);
    public static final qm x = new qi(22, false, 0x2552A5).b("potion.absorption").b(2, 2);
    public static final qm y = new ql(23, false, 16262179).b("potion.saturation");
    public static final qm z = null;
    public static final qm A = null;
    public static final qm B = null;
    public static final qm C = null;
    public static final qm D = null;
    public static final qm E = null;
    public static final qm F = null;
    public static final qm G = null;
    public final int H;
    private final Map I = Maps.newHashMap();
    private final boolean J;
    private final int K;
    private String L = "";
    private int M = -1;
    private double N;
    private boolean O;

    protected qm(int n2, boolean bl2, int n3) {
        this.H = n2;
        qm.a[n2] = this;
        this.J = bl2;
        this.N = bl2 ? 0.5 : 1.0;
        this.K = n3;
    }

    protected qm b(int n2, int n3) {
        this.M = n2 + n3 * 8;
        return this;
    }

    public int c() {
        return this.H;
    }

    public void a(rm rm2, int n2) {
        if (this.H == qm.l.H) {
            if (rm2.aR() < rm2.aX()) {
                rm2.f(1.0f);
            }
        } else if (this.H == qm.u.H) {
            if (rm2.aR() > 1.0f) {
                rm2.a(qf.k, 1.0f);
            }
        } else if (this.H == qm.v.H) {
            rm2.a(qf.l, 1.0f);
        } else if (this.H == qm.s.H && rm2 instanceof xq) {
            ((xq)rm2).a(0.025f * (float)(n2 + 1));
        } else if (this.H == qm.y.H && rm2 instanceof xq) {
            if (!rm2.o.E) {
                ((xq)rm2).bP().a(n2 + 1, 1.0f);
            }
        } else if (this.H == qm.h.H && !rm2.aQ() || this.H == qm.i.H && rm2.aQ()) {
            rm2.f((float)Math.max(4 << n2, 0));
        } else if (this.H == qm.i.H && !rm2.aQ() || this.H == qm.h.H && rm2.aQ()) {
            rm2.a(qf.k, (float)(6 << n2));
        }
    }

    public void a(rm rm2, rm rm3, int n2, double d2) {
        if (this.H == qm.h.H && !rm3.aQ() || this.H == qm.i.H && rm3.aQ()) {
            int n3 = (int)(d2 * (double)(4 << n2) + 0.5);
            rm3.f((float)n3);
        } else if (this.H == qm.i.H && !rm3.aQ() || this.H == qm.h.H && rm3.aQ()) {
            int n4 = (int)(d2 * (double)(6 << n2) + 0.5);
            if (rm2 == null) {
                rm3.a(qf.k, (float)n4);
            } else {
                rm3.a(qf.b(rm3, rm2), (float)n4);
            }
        }
    }

    public boolean b() {
        return false;
    }

    public boolean a(int n2, int n3) {
        if (this.H == qm.l.H) {
            int n4 = 50 >> n3;
            if (n4 > 0) {
                return n2 % n4 == 0;
            }
            return true;
        }
        if (this.H == qm.u.H) {
            int n5 = 25 >> n3;
            if (n5 > 0) {
                return n2 % n5 == 0;
            }
            return true;
        }
        if (this.H == qm.v.H) {
            int n6 = 40 >> n3;
            if (n6 > 0) {
                return n2 % n6 == 0;
            }
            return true;
        }
        return this.H == qm.s.H;
    }

    public qm b(String string) {
        this.L = string;
        return this;
    }

    public String a() {
        return this.L;
    }

    public boolean d() {
        return this.M >= 0;
    }

    public int e() {
        return this.M;
    }

    public boolean f() {
        return this.J;
    }

    public static String a(qn qn2) {
        if (qn2.g()) {
            return "**:**";
        }
        int n2 = qn2.b();
        return pe.a(n2);
    }

    protected qm a(double d2) {
        this.N = d2;
        return this;
    }

    public double g() {
        return this.N;
    }

    public boolean i() {
        return this.O;
    }

    public int j() {
        return this.K;
    }

    public qm a(ry ry2, String string, double d2, int n2) {
        sa sa2 = new sa(UUID.fromString(string), this.a(), d2, n2);
        this.I.put(ry2, sa2);
        return this;
    }

    public Map k() {
        return this.I;
    }

    public void a(rm rm2, sc sc2, int n2) {
        for (Map.Entry entry : this.I.entrySet()) {
            rz rz2 = sc2.a((ry)entry.getKey());
            if (rz2 == null) continue;
            rz2.b((sa)entry.getValue());
        }
    }

    public void b(rm rm2, sc sc2, int n2) {
        for (Map.Entry entry : this.I.entrySet()) {
            rz rz2 = sc2.a((ry)entry.getKey());
            if (rz2 == null) continue;
            sa sa2 = (sa)entry.getValue();
            rz2.b(sa2);
            rz2.a(new sa(sa2.a(), this.a() + " " + n2, this.a(n2, sa2), sa2.c()));
        }
    }

    public double a(int n2, sa sa2) {
        return sa2.d() * (double)(n2 + 1);
    }
}

