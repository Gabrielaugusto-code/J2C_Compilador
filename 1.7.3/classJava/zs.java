/*
 * Decompiled with CFR 0.152.
 */
public class zs
extends abs {
    private static final int[] m = new int[]{11, 16, 15, 13};
    private static final String[] n = new String[]{"leather_helmet_overlay", "leather_chestplate_overlay", "leather_leggings_overlay", "leather_boots_overlay"};
    public static final String[] a = new String[]{"empty_armor_slot_helmet", "empty_armor_slot_chestplate", "empty_armor_slot_leggings", "empty_armor_slot_boots"};
    private static final co o = new zt();
    public final int b;
    public final int c;
    public final int d;
    private final zu p;
    private pw q;
    private pw r;

    public zs(zu zu2, int n2, int n3) {
        this.p = zu2;
        this.b = n3;
        this.d = n2;
        this.c = zu2.b(n3);
        this.f(zu2.a(n3));
        this.h = 1;
        this.a(aak.j);
        ajd.a.a(this, o);
    }

    @Override
    public int a(abu abu2, int n2) {
        if (n2 > 0) {
            return 0xFFFFFF;
        }
        int n3 = this.b(abu2);
        if (n3 < 0) {
            n3 = 0xFFFFFF;
        }
        return n3;
    }

    @Override
    public boolean b() {
        return this.p == zu.a;
    }

    @Override
    public int c() {
        return this.p.a();
    }

    public zu m_() {
        return this.p;
    }

    public boolean c_(abu abu2) {
        if (this.p != zu.a) {
            return false;
        }
        if (!abu2.p()) {
            return false;
        }
        if (!abu2.q().b("display", 10)) {
            return false;
        }
        return abu2.q().m("display").b("color", 3);
    }

    public int b(abu abu2) {
        if (this.p != zu.a) {
            return -1;
        }
        dg dg2 = abu2.q();
        if (dg2 == null) {
            return 10511680;
        }
        dg dg3 = dg2.m("display");
        if (dg3 == null) {
            return 10511680;
        }
        if (dg3.b("color", 3)) {
            return dg3.f("color");
        }
        return 10511680;
    }

    @Override
    public pw a(int n2, int n3) {
        if (n3 == 1) {
            return this.q;
        }
        return super.a(n2, n3);
    }

    public void c(abu abu2) {
        if (this.p != zu.a) {
            return;
        }
        dg dg2 = abu2.q();
        if (dg2 == null) {
            return;
        }
        dg dg3 = dg2.m("display");
        if (dg3.c("color")) {
            dg3.o("color");
        }
    }

    public void b(abu abu2, int n2) {
        if (this.p != zu.a) {
            throw new UnsupportedOperationException("Can't dye non-leather!");
        }
        dg dg2 = abu2.q();
        if (dg2 == null) {
            dg2 = new dg();
            abu2.d(dg2);
        }
        dg dg3 = dg2.m("display");
        if (!dg2.b("display", 10)) {
            dg2.a("display", dg3);
        }
        dg3.a("color", n2);
    }

    @Override
    public boolean a(abu abu2, abu abu3) {
        if (this.p.b() == abu3.b()) {
            return true;
        }
        return super.a(abu2, abu3);
    }

    @Override
    public void a(px px2) {
        super.a(px2);
        if (this.p == zu.a) {
            this.q = px2.a(n[this.b]);
        }
        this.r = px2.a(a[this.b]);
    }

    @Override
    public abu a(abu abu2, afs afs2, xq xq2) {
        int n2 = rn.b(abu2) - 1;
        abu abu3 = xq2.r(n2);
        if (abu3 == null) {
            xq2.c(n2, abu2.m());
            abu2.b = 0;
        }
        return abu2;
    }

    public static pw b(int n2) {
        switch (n2) {
            case 0: {
                return abv.ac.r;
            }
            case 1: {
                return abv.ad.r;
            }
            case 2: {
                return abv.ae.r;
            }
            case 3: {
                return abv.af.r;
            }
        }
        return null;
    }

    static /* synthetic */ int[] e() {
        return m;
    }
}

