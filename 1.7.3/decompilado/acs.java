/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class acs
extends abs {
    private static final String[] b = new String[]{"skeleton", "wither", "zombie", "char", "creeper"};
    public static final String[] a = new String[]{"skeleton", "wither", "zombie", "steve", "creeper"};
    private pw[] c;

    public acs() {
        this.a(aak.c);
        this.f(0);
        this.a(true);
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        ani ani2;
        if (n5 == 0) {
            return false;
        }
        if (!afs2.a(n2, n3, n4).o().a()) {
            return false;
        }
        if (n5 == 1) {
            ++n3;
        }
        if (n5 == 2) {
            --n4;
        }
        if (n5 == 3) {
            ++n4;
        }
        if (n5 == 4) {
            --n2;
        }
        if (n5 == 5) {
            ++n2;
        }
        if (!xq2.a(n2, n3, n4, n5, abu2)) {
            return false;
        }
        if (!aie.bP.c(afs2, n2, n3, n4)) {
            return false;
        }
        afs2.d(n2, n3, n4, aie.bP, n5, 2);
        int n6 = 0;
        if (n5 == 1) {
            n6 = oy.c((double)(xq2.y * 16.0f / 360.0f) + 0.5) & 0xF;
        }
        if ((ani2 = afs2.o(n2, n3, n4)) != null && ani2 instanceof aoe) {
            String string = "";
            if (abu2.p() && abu2.q().b("SkullOwner", 8)) {
                string = abu2.q().j("SkullOwner");
            }
            ((aoe)ani2).a(abu2.k(), string);
            ((aoe)ani2).a(n6);
            ((amc)aie.bP).a(afs2, n2, n3, n4, (aoe)ani2);
        }
        --abu2.b;
        return true;
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        for (int i2 = 0; i2 < b.length; ++i2) {
            list.add(new abu(abs2, 1, i2));
        }
    }

    @Override
    public pw b_(int n2) {
        if (n2 < 0 || n2 >= b.length) {
            n2 = 0;
        }
        return this.c[n2];
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    @Override
    public String a(abu abu2) {
        int n2 = abu2.k();
        if (n2 < 0 || n2 >= b.length) {
            n2 = 0;
        }
        return super.a() + "." + b[n2];
    }

    @Override
    public String n(abu abu2) {
        if (abu2.k() == 3 && abu2.p() && abu2.q().b("SkullOwner", 8)) {
            return dc.a("item.skull.player.name", abu2.q().j("SkullOwner"));
        }
        return super.n(abu2);
    }

    @Override
    public void a(px px2) {
        this.c = new pw[a.length];
        for (int i2 = 0; i2 < a.length; ++i2) {
            this.c[i2] = px2.a(this.w() + "_" + a[i2]);
        }
    }
}

