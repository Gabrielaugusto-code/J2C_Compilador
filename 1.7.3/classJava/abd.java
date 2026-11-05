/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class abd
extends abs {
    @Override
    public boolean e(abu abu2) {
        return true;
    }

    @Override
    public boolean e_(abu abu2) {
        return false;
    }

    @Override
    public ach f(abu abu2) {
        if (this.g(abu2).c() > 0) {
            return ach.b;
        }
        return super.f(abu2);
    }

    public dp g(abu abu2) {
        if (abu2.d == null || !abu2.d.b("StoredEnchantments", 9)) {
            return new dp();
        }
        return (dp)abu2.d.a("StoredEnchantments");
    }

    @Override
    public void a(abu abu2, xq xq2, List list, boolean bl2) {
        super.a(abu2, xq2, list, bl2);
        dp dp2 = this.g(abu2);
        if (dp2 != null) {
            for (int i2 = 0; i2 < dp2.c(); ++i2) {
                short s2 = dp2.b(i2).e("id");
                short s3 = dp2.b(i2).e("lvl");
                if (aek.b[s2] == null) continue;
                list.add(aek.b[s2].c(s3));
            }
        }
    }

    public void a(abu abu2, aet aet2) {
        dp dp2 = this.g(abu2);
        boolean bl2 = true;
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            dg dg2 = dp2.b(i2);
            if (dg2.e("id") != aet2.b.B) continue;
            if (dg2.e("lvl") < aet2.c) {
                dg2.a("lvl", (short)aet2.c);
            }
            bl2 = false;
            break;
        }
        if (bl2) {
            dg dg3 = new dg();
            dg3.a("id", (short)aet2.b.B);
            dg3.a("lvl", (short)aet2.c);
            dp2.a(dg3);
        }
        if (!abu2.p()) {
            abu2.d(new dg());
        }
        abu2.q().a("StoredEnchantments", dp2);
    }

    public abu a(aet aet2) {
        abu abu2 = new abu(this);
        this.a(abu2, aet2);
        return abu2;
    }

    public void a(aek aek2, List list) {
        for (int i2 = aek2.d(); i2 <= aek2.b(); ++i2) {
            list.add(this.a(new aet(aek2, i2)));
        }
    }

    public po b(Random random) {
        return this.a(random, 1, 1, 1);
    }

    public po a(Random random, int n2, int n3, int n4) {
        abu abu2 = new abu(abv.aG, 1, 0);
        aem.a(random, abu2, 30);
        return new po(abu2, n2, n3, n4);
    }
}

