/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.Collection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ayx
extends axc {
    private static final Logger a = LogManager.getLogger();
    private ayw b;
    private dg c;

    public ayx() {
        this("scoreboard");
    }

    public ayx(String string) {
        super(string);
    }

    public void a(ayw ayw2) {
        this.b = ayw2;
        if (this.c != null) {
            this.a(this.c);
        }
    }

    @Override
    public void a(dg dg2) {
        if (this.b == null) {
            this.c = dg2;
            return;
        }
        this.b(dg2.c("Objectives", 10));
        this.c(dg2.c("PlayerScores", 10));
        if (dg2.b("DisplaySlots", 10)) {
            this.c(dg2.m("DisplaySlots"));
        }
        if (dg2.b("Teams", 9)) {
            this.a(dg2.c("Teams", 10));
        }
    }

    protected void a(dp dp2) {
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            dg dg2 = dp2.b(i2);
            ays ays2 = this.b.f(dg2.j("Name"));
            ays2.a(dg2.j("DisplayName"));
            ays2.b(dg2.j("Prefix"));
            ays2.c(dg2.j("Suffix"));
            if (dg2.b("AllowFriendlyFire", 99)) {
                ays2.a(dg2.n("AllowFriendlyFire"));
            }
            if (dg2.b("SeeFriendlyInvisibles", 99)) {
                ays2.b(dg2.n("SeeFriendlyInvisibles"));
            }
            this.a(ays2, dg2.c("Players", 8));
        }
    }

    protected void a(ays ays2, dp dp2) {
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            this.b.a(dp2.f(i2), ays2.b());
        }
    }

    protected void c(dg dg2) {
        for (int i2 = 0; i2 < 3; ++i2) {
            if (!dg2.b("slot_" + i2, 8)) continue;
            String string = dg2.j("slot_" + i2);
            ayr ayr2 = this.b.b(string);
            this.b.a(i2, ayr2);
        }
    }

    protected void b(dp dp2) {
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            dg dg2 = dp2.b(i2);
            azb azb2 = (azb)azb.a.get(dg2.j("CriteriaName"));
            ayr ayr2 = this.b.a(dg2.j("Name"), azb2);
            ayr2.a(dg2.j("DisplayName"));
        }
    }

    protected void c(dp dp2) {
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            dg dg2 = dp2.b(i2);
            ayr ayr2 = this.b.b(dg2.j("Objective"));
            ayt ayt2 = this.b.a(dg2.j("Name"), ayr2);
            ayt2.c(dg2.f("Score"));
        }
    }

    @Override
    public void b(dg dg2) {
        if (this.b == null) {
            a.warn("Tried to save scoreboard without having a scoreboard...");
            return;
        }
        dg2.a("Objectives", this.b());
        dg2.a("PlayerScores", this.e());
        dg2.a("Teams", this.a());
        this.d(dg2);
    }

    protected dp a() {
        dp dp2 = new dp();
        Collection collection = this.b.g();
        for (ays ays2 : collection) {
            dg dg2 = new dg();
            dg2.a("Name", ays2.b());
            dg2.a("DisplayName", ays2.c());
            dg2.a("Prefix", ays2.e());
            dg2.a("Suffix", ays2.f());
            dg2.a("AllowFriendlyFire", ays2.g());
            dg2.a("SeeFriendlyInvisibles", ays2.h());
            dp dp3 = new dp();
            for (String string : ays2.d()) {
                dp3.a(new dt(string));
            }
            dg2.a("Players", dp3);
            dp2.a(dg2);
        }
        return dp2;
    }

    protected void d(dg dg2) {
        dg dg3 = new dg();
        boolean bl2 = false;
        for (int i2 = 0; i2 < 3; ++i2) {
            ayr ayr2 = this.b.a(i2);
            if (ayr2 == null) continue;
            dg3.a("slot_" + i2, ayr2.b());
            bl2 = true;
        }
        if (bl2) {
            dg2.a("DisplaySlots", dg3);
        }
    }

    protected dp b() {
        dp dp2 = new dp();
        Collection collection = this.b.c();
        for (ayr ayr2 : collection) {
            dg dg2 = new dg();
            dg2.a("Name", ayr2.b());
            dg2.a("CriteriaName", ayr2.c().a());
            dg2.a("DisplayName", ayr2.d());
            dp2.a(dg2);
        }
        return dp2;
    }

    protected dp e() {
        dp dp2 = new dp();
        Collection collection = this.b.e();
        for (ayt ayt2 : collection) {
            dg dg2 = new dg();
            dg2.a("Name", ayt2.e());
            dg2.a("Objective", ayt2.d().b());
            dg2.a("Score", ayt2.c());
            dp2.a(dg2);
        }
        return dp2;
    }
}

