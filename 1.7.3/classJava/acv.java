/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class acv
extends abs {
    private pw a;

    public acv() {
        this.a(true);
        this.a(aak.f);
    }

    @Override
    public String n(abu abu2) {
        String string = ("" + dc.a(this.a() + ".name")).trim();
        String string2 = qx.b(abu2.k());
        if (string2 != null) {
            string = string + " " + dc.a("entity." + string2 + ".name");
        }
        return string;
    }

    @Override
    public int a(abu abu2, int n2) {
        qy qy2 = (qy)qx.a.get(abu2.k());
        if (qy2 != null) {
            if (n2 == 0) {
                return qy2.b;
            }
            return qy2.c;
        }
        return 0xFFFFFF;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public pw a(int n2, int n3) {
        if (n3 > 0) {
            return this.a;
        }
        return super.a(n2, n3);
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        qr qr2;
        if (afs2.E) {
            return true;
        }
        ahz ahz2 = afs2.a(n2, n3, n4);
        n2 += q.b[n5];
        n3 += q.c[n5];
        n4 += q.d[n5];
        double d2 = 0.0;
        if (n5 == 1 && ahz2.b() == 11) {
            d2 = 0.5;
        }
        if ((qr2 = acv.a(afs2, abu2.k(), (double)n2 + 0.5, (double)n3 + d2, (double)n4 + 0.5)) != null) {
            if (qr2 instanceof rm && abu2.u()) {
                ((rn)qr2).a(abu2.s());
            }
            if (!xq2.bE.d) {
                --abu2.b;
            }
        }
        return true;
    }

    @Override
    public abu a(abu abu2, afs afs2, xq xq2) {
        if (afs2.E) {
            return abu2;
        }
        ayn ayn2 = this.a(afs2, xq2, true);
        if (ayn2 == null) {
            return abu2;
        }
        if (ayn2.a == ayo.b) {
            qr qr2;
            int n2 = ayn2.b;
            int n3 = ayn2.c;
            int n4 = ayn2.d;
            if (!afs2.a(xq2, n2, n3, n4)) {
                return abu2;
            }
            if (!xq2.a(n2, n3, n4, ayn2.e, abu2)) {
                return abu2;
            }
            if (afs2.a(n2, n3, n4) instanceof akn && (qr2 = acv.a(afs2, abu2.k(), n2, n3, n4)) != null) {
                if (qr2 instanceof rm && abu2.u()) {
                    ((rn)qr2).a(abu2.s());
                }
                if (!xq2.bE.d) {
                    --abu2.b;
                }
            }
        }
        return abu2;
    }

    public static qr a(afs afs2, int n2, double d2, double d3, double d4) {
        if (!qx.a.containsKey(n2)) {
            return null;
        }
        qr qr2 = null;
        for (int i2 = 0; i2 < 1; ++i2) {
            qr2 = qx.a(n2, afs2);
            if (qr2 == null || !(qr2 instanceof rm)) continue;
            rn rn2 = (rn)qr2;
            qr2.b(d2, d3, d4, oy.g(afs2.s.nextFloat() * 360.0f), 0.0f);
            rn2.aO = rn2.y;
            rn2.aM = rn2.y;
            rn2.a((rp)null);
            afs2.d(qr2);
            rn2.r();
        }
        return qr2;
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        for (qy qy2 : qx.a.values()) {
            list.add(new abu(abs2, 1, qy2.a));
        }
    }

    @Override
    public void a(px px2) {
        super.a(px2);
        this.a = px2.a(this.w() + "_overlay");
    }
}

