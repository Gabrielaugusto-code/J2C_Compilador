/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class aff
extends ArrayList {
    public aff() {
    }

    public aff(dg dg2) {
        this.a(dg2);
    }

    public afe a(abu abu2, abu abu3, int n2) {
        if (n2 > 0 && n2 < this.size()) {
            afe afe2 = (afe)this.get(n2);
            if (abu2.b() == afe2.a().b() && (abu3 == null && !afe2.c() || afe2.c() && abu3 != null && afe2.b().b() == abu3.b()) && abu2.b >= afe2.a().b && (!afe2.c() || abu3.b >= afe2.b().b)) {
                return afe2;
            }
            return null;
        }
        for (int i2 = 0; i2 < this.size(); ++i2) {
            afe afe3 = (afe)this.get(i2);
            if (abu2.b() != afe3.a().b() || abu2.b < afe3.a().b || (afe3.c() || abu3 != null) && (!afe3.c() || abu3 == null || afe3.b().b() != abu3.b() || abu3.b < afe3.b().b)) continue;
            return afe3;
        }
        return null;
    }

    public void a(afe afe2) {
        for (int i2 = 0; i2 < this.size(); ++i2) {
            afe afe3 = (afe)this.get(i2);
            if (!afe2.a(afe3)) continue;
            if (afe2.b(afe3)) {
                this.set(i2, afe2);
            }
            return;
        }
        this.add(afe2);
    }

    public void a(ep ep2) {
        ep2.writeByte((byte)(this.size() & 0xFF));
        for (int i2 = 0; i2 < this.size(); ++i2) {
            afe afe2 = (afe)this.get(i2);
            ep2.a(afe2.a());
            ep2.a(afe2.d());
            abu abu2 = afe2.b();
            ep2.writeBoolean(abu2 != null);
            if (abu2 != null) {
                ep2.a(abu2);
            }
            ep2.writeBoolean(afe2.g());
        }
    }

    public static aff b(ep ep2) {
        aff aff2 = new aff();
        int n2 = ep2.readByte() & 0xFF;
        for (int i2 = 0; i2 < n2; ++i2) {
            abu abu2 = ep2.c();
            abu abu3 = ep2.c();
            abu abu4 = null;
            if (ep2.readBoolean()) {
                abu4 = ep2.c();
            }
            boolean bl2 = ep2.readBoolean();
            afe afe2 = new afe(abu2, abu4, abu3);
            if (bl2) {
                afe2.h();
            }
            aff2.add(afe2);
        }
        return aff2;
    }

    public void a(dg dg2) {
        dp dp2 = dg2.c("Recipes", 10);
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            dg dg3 = dp2.b(i2);
            this.add(new afe(dg3));
        }
    }

    public dg a() {
        dg dg2 = new dg();
        dp dp2 = new dp();
        for (int i2 = 0; i2 < this.size(); ++i2) {
            afe afe2 = (afe)this.get(i2);
            dp2.a(afe2.i());
        }
        dg2.a("Recipes", dp2);
        return dg2;
    }
}

