/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ate
extends ats {
    private int a;

    public ate() {
    }

    public ate(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.f = arm2;
        this.a = n3 == 2 || n3 == 0 ? arm2.d() : arm2.b();
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dg2.a("Steps", this.a);
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.a = dg2.f("Steps");
    }

    public static arm a(List list, Random random, int n2, int n3, int n4, int n5) {
        int n6 = 3;
        arm arm2 = arm.a(n2, n3, n4, -1, -1, 0, 5, 5, 4, n5);
        aua aua2 = aua.a(list, arm2);
        if (aua2 == null) {
            return null;
        }
        if (aua2.c().b == arm2.b) {
            for (int i2 = 3; i2 >= 1; --i2) {
                arm2 = arm.a(n2, n3, n4, -1, -1, 0, 5, 5, i2 - 1, n5);
                if (aua2.c().a(arm2)) continue;
                return arm.a(n2, n3, n4, -1, -1, 0, 5, 5, i2, n5);
            }
        }
        return null;
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        if (this.a(afs2, arm2)) {
            return false;
        }
        for (int i2 = 0; i2 < this.a; ++i2) {
            this.a(afs2, aie.aV, 0, 0, 0, i2, arm2);
            this.a(afs2, aie.aV, 0, 1, 0, i2, arm2);
            this.a(afs2, aie.aV, 0, 2, 0, i2, arm2);
            this.a(afs2, aie.aV, 0, 3, 0, i2, arm2);
            this.a(afs2, aie.aV, 0, 4, 0, i2, arm2);
            for (int i3 = 1; i3 <= 3; ++i3) {
                this.a(afs2, aie.aV, 0, 0, i3, i2, arm2);
                this.a(afs2, aie.a, 0, 1, i3, i2, arm2);
                this.a(afs2, aie.a, 0, 2, i3, i2, arm2);
                this.a(afs2, aie.a, 0, 3, i3, i2, arm2);
                this.a(afs2, aie.aV, 0, 4, i3, i2, arm2);
            }
            this.a(afs2, aie.aV, 0, 0, 4, i2, arm2);
            this.a(afs2, aie.aV, 0, 1, 4, i2, arm2);
            this.a(afs2, aie.aV, 0, 2, 4, i2, arm2);
            this.a(afs2, aie.aV, 0, 3, 4, i2, arm2);
            this.a(afs2, aie.aV, 0, 4, 4, i2, arm2);
        }
        return true;
    }
}

