/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.Collection;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class xa {
    private static final Logger f = LogManager.getLogger();
    public static final ry a = new sf("generic.maxHealth", 20.0, 0.0, Double.MAX_VALUE).a("Max Health").a(true);
    public static final ry b = new sf("generic.followRange", 32.0, 0.0, 2048.0).a("Follow Range");
    public static final ry c = new sf("generic.knockbackResistance", 0.0, 0.0, 1.0).a("Knockback Resistance");
    public static final ry d = new sf("generic.movementSpeed", 0.7f, 0.0, Double.MAX_VALUE).a("Movement Speed").a(true);
    public static final ry e = new sf("generic.attackDamage", 2.0, 0.0, Double.MAX_VALUE);

    public static dp a(sc sc2) {
        dp dp2 = new dp();
        for (rz rz2 : sc2.a()) {
            dp2.a(xa.a(rz2));
        }
        return dp2;
    }

    private static dg a(rz rz2) {
        dg dg2 = new dg();
        ry ry2 = rz2.a();
        dg2.a("Name", ry2.a());
        dg2.a("Base", rz2.b());
        Collection collection = rz2.c();
        if (collection != null && !collection.isEmpty()) {
            dp dp2 = new dp();
            for (sa sa2 : collection) {
                if (!sa2.e()) continue;
                dp2.a(xa.a(sa2));
            }
            dg2.a("Modifiers", dp2);
        }
        return dg2;
    }

    private static dg a(sa sa2) {
        dg dg2 = new dg();
        dg2.a("Name", sa2.b());
        dg2.a("Amount", sa2.d());
        dg2.a("Operation", sa2.c());
        dg2.a("UUIDMost", sa2.a().getMostSignificantBits());
        dg2.a("UUIDLeast", sa2.a().getLeastSignificantBits());
        return dg2;
    }

    public static void a(sc sc2, dp dp2) {
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            dg dg2 = dp2.b(i2);
            rz rz2 = sc2.a(dg2.j("Name"));
            if (rz2 != null) {
                xa.a(rz2, dg2);
                continue;
            }
            f.warn("Ignoring unknown attribute '" + dg2.j("Name") + "'");
        }
    }

    private static void a(rz rz2, dg dg2) {
        rz2.a(dg2.i("Base"));
        if (dg2.b("Modifiers", 9)) {
            dp dp2 = dg2.c("Modifiers", 10);
            for (int i2 = 0; i2 < dp2.c(); ++i2) {
                sa sa2 = xa.a(dp2.b(i2));
                sa sa3 = rz2.a(sa2.a());
                if (sa3 != null) {
                    rz2.b(sa3);
                }
                rz2.a(sa2);
            }
        }
    }

    public static sa a(dg dg2) {
        UUID uUID = new UUID(dg2.g("UUIDMost"), dg2.g("UUIDLeast"));
        return new sa(uUID, dg2.j("Name"), dg2.i("Amount"), dg2.f("Operation"));
    }
}

