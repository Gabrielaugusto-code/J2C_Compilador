/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class atr
extends ats {
    public atr() {
    }

    public atr(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.g = n3;
        this.d = this.a(random);
        this.f = arm2;
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        this.a((atp)aua2, list, random, 1, 1);
    }

    public static atr a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -1, -7, 0, 5, 11, 8, n5);
        if (!atr.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new atr(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        if (this.a(afs2, arm2)) {
            return false;
        }
        this.a(afs2, arm2, 0, 0, 0, 4, 10, 7, true, random, asz.c());
        this.a(afs2, random, arm2, this.d, 1, 7, 0);
        this.a(afs2, random, arm2, att.a, 1, 1, 7);
        int n2 = this.a(aie.ar, 2);
        for (int i2 = 0; i2 < 6; ++i2) {
            this.a(afs2, aie.ar, n2, 1, 6 - i2, 1 + i2, arm2);
            this.a(afs2, aie.ar, n2, 2, 6 - i2, 1 + i2, arm2);
            this.a(afs2, aie.ar, n2, 3, 6 - i2, 1 + i2, arm2);
            if (i2 >= 5) continue;
            this.a(afs2, aie.aV, 0, 1, 5 - i2, 1 + i2, arm2);
            this.a(afs2, aie.aV, 0, 2, 5 - i2, 1 + i2, arm2);
            this.a(afs2, aie.aV, 0, 3, 5 - i2, 1 + i2, arm2);
        }
        return true;
    }
}

