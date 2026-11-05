/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ars
extends aua {
    public ars() {
    }

    public ars(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.f = arm2;
    }

    @Override
    protected void a(dg dg2) {
    }

    @Override
    protected void b(dg dg2) {
    }

    public static arm a(List list, Random random, int n2, int n3, int n4, int n5) {
        arm arm2 = new arm(n2, n3 - 5, n4, n2, n3 + 2, n4);
        switch (n5) {
            case 2: {
                arm2.d = n2 + 2;
                arm2.c = n4 - 8;
                break;
            }
            case 0: {
                arm2.d = n2 + 2;
                arm2.f = n4 + 8;
                break;
            }
            case 1: {
                arm2.a = n2 - 8;
                arm2.f = n4 + 2;
                break;
            }
            case 3: {
                arm2.d = n2 + 8;
                arm2.f = n4 + 2;
            }
        }
        if (aua.a(list, arm2) != null) {
            return null;
        }
        return arm2;
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        int n2 = this.d();
        switch (this.g) {
            case 2: {
                aro.a(aua2, list, random, this.f.a, this.f.b, this.f.c - 1, 2, n2);
                break;
            }
            case 0: {
                aro.a(aua2, list, random, this.f.a, this.f.b, this.f.f + 1, 0, n2);
                break;
            }
            case 1: {
                aro.a(aua2, list, random, this.f.a - 1, this.f.b, this.f.c, 1, n2);
                break;
            }
            case 3: {
                aro.a(aua2, list, random, this.f.d + 1, this.f.b, this.f.c, 3, n2);
            }
        }
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        if (this.a(afs2, arm2)) {
            return false;
        }
        this.a(afs2, arm2, 0, 5, 0, 2, 7, 1, aie.a, aie.a, false);
        this.a(afs2, arm2, 0, 0, 7, 2, 2, 8, aie.a, aie.a, false);
        for (int i2 = 0; i2 < 5; ++i2) {
            this.a(afs2, arm2, 0, 5 - i2 - (i2 < 4 ? 1 : 0), 2 + i2, 2, 7 - i2, 2 + i2, aie.a, aie.a, false);
        }
        return true;
    }
}

