/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ale
extends ahz {
    public ale() {
        super(avk.e);
        this.a(aak.b);
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        if (this == aie.q) {
            return abv.h;
        }
        if (this == aie.ag) {
            return abv.i;
        }
        if (this == aie.x) {
            return abv.aR;
        }
        if (this == aie.bA) {
            return abv.bC;
        }
        if (this == aie.bY) {
            return abv.bU;
        }
        return abs.a(this);
    }

    @Override
    public int a(Random random) {
        if (this == aie.x) {
            return 4 + random.nextInt(5);
        }
        return 1;
    }

    @Override
    public int a(int n2, Random random) {
        if (n2 > 0 && abs.a(this) != this.a(0, random, n2)) {
            int n3 = random.nextInt(n2 + 2) - 1;
            if (n3 < 0) {
                n3 = 0;
            }
            return this.a(random) * (n3 + 1);
        }
        return this.a(random);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, float f2, int n6) {
        super.a(afs2, n2, n3, n4, n5, f2, n6);
        if (this.a(n5, afs2.s, n6) != abs.a(this)) {
            int n7 = 0;
            if (this == aie.q) {
                n7 = oy.a(afs2.s, 0, 2);
            } else if (this == aie.ag) {
                n7 = oy.a(afs2.s, 3, 7);
            } else if (this == aie.bA) {
                n7 = oy.a(afs2.s, 3, 7);
            } else if (this == aie.x) {
                n7 = oy.a(afs2.s, 2, 5);
            } else if (this == aie.bY) {
                n7 = oy.a(afs2.s, 2, 5);
            }
            this.c(afs2, n2, n3, n4, n7);
        }
    }

    @Override
    public int a(int n2) {
        if (this == aie.x) {
            return 4;
        }
        return 0;
    }
}

