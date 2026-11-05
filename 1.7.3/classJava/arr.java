/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class arr
extends aua {
    private List a = new LinkedList();

    public arr() {
    }

    public arr(int n2, Random random, int n3, int n4) {
        super(n2);
        this.f = new arm(n3, 50, n4, n3 + 7 + random.nextInt(6), 54 + random.nextInt(6), n4 + 7 + random.nextInt(6));
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        arm arm2;
        aua aua3;
        int n2;
        int n3 = this.d();
        int n4 = this.f.c() - 3 - 1;
        if (n4 <= 0) {
            n4 = 1;
        }
        for (n2 = 0; n2 < this.f.b() && (n2 += random.nextInt(this.f.b())) + 3 <= this.f.b(); n2 += 4) {
            aua3 = aro.a(aua2, list, random, this.f.a + n2, this.f.b + random.nextInt(n4) + 1, this.f.c - 1, 2, n3);
            if (aua3 == null) continue;
            arm2 = aua3.c();
            this.a.add(new arm(arm2.a, arm2.b, this.f.c, arm2.d, arm2.e, this.f.c + 1));
        }
        for (n2 = 0; n2 < this.f.b() && (n2 += random.nextInt(this.f.b())) + 3 <= this.f.b(); n2 += 4) {
            aua3 = aro.a(aua2, list, random, this.f.a + n2, this.f.b + random.nextInt(n4) + 1, this.f.f + 1, 0, n3);
            if (aua3 == null) continue;
            arm2 = aua3.c();
            this.a.add(new arm(arm2.a, arm2.b, this.f.f - 1, arm2.d, arm2.e, this.f.f));
        }
        for (n2 = 0; n2 < this.f.d() && (n2 += random.nextInt(this.f.d())) + 3 <= this.f.d(); n2 += 4) {
            aua3 = aro.a(aua2, list, random, this.f.a - 1, this.f.b + random.nextInt(n4) + 1, this.f.c + n2, 1, n3);
            if (aua3 == null) continue;
            arm2 = aua3.c();
            this.a.add(new arm(this.f.a, arm2.b, arm2.c, this.f.a + 1, arm2.e, arm2.f));
        }
        for (n2 = 0; n2 < this.f.d() && (n2 += random.nextInt(this.f.d())) + 3 <= this.f.d(); n2 += 4) {
            aua3 = aro.a(aua2, list, random, this.f.d + 1, this.f.b + random.nextInt(n4) + 1, this.f.c + n2, 3, n3);
            if (aua3 == null) continue;
            arm2 = aua3.c();
            this.a.add(new arm(this.f.d - 1, arm2.b, arm2.c, this.f.d, arm2.e, arm2.f));
        }
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        if (this.a(afs2, arm2)) {
            return false;
        }
        this.a(afs2, arm2, this.f.a, this.f.b, this.f.c, this.f.d, this.f.b, this.f.f, aie.d, aie.a, true);
        this.a(afs2, arm2, this.f.a, this.f.b + 1, this.f.c, this.f.d, Math.min(this.f.b + 3, this.f.e), this.f.f, aie.a, aie.a, false);
        for (arm arm3 : this.a) {
            this.a(afs2, arm2, arm3.a, arm3.e - 2, arm3.c, arm3.d, arm3.e, arm3.f, aie.a, aie.a, false);
        }
        this.a(afs2, arm2, this.f.a, this.f.b + 4, this.f.c, this.f.d, this.f.e, this.f.f, aie.a, false);
        return true;
    }

    @Override
    protected void a(dg dg2) {
        dp dp2 = new dp();
        for (arm arm2 : this.a) {
            dp2.a(arm2.h());
        }
        dg2.a("Entrances", dp2);
    }

    @Override
    protected void b(dg dg2) {
        dp dp2 = dg2.c("Entrances", 11);
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            this.a.add(new arm(dp2.c(i2)));
        }
    }
}

