/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class aur
extends auu {
    private int a;

    public aur() {
    }

    public aur(auq auq2, int n2, Random random, arm arm2, int n3) {
        super(auq2, n2);
        this.g = n3;
        this.f = arm2;
        this.a = Math.max(arm2.b(), arm2.d());
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dg2.a("Length", this.a);
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.a = dg2.f("Length");
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        aua aua3;
        int n2;
        boolean bl2 = false;
        for (n2 = random.nextInt(5); n2 < this.a - 8; n2 += 2 + random.nextInt(5)) {
            aua3 = this.a((auq)aua2, list, random, 0, n2);
            if (aua3 == null) continue;
            n2 += Math.max(aua3.f.b(), aua3.f.d());
            bl2 = true;
        }
        for (n2 = random.nextInt(5); n2 < this.a - 8; n2 += 2 + random.nextInt(5)) {
            aua3 = this.b((auq)aua2, list, random, 0, n2);
            if (aua3 == null) continue;
            n2 += Math.max(aua3.f.b(), aua3.f.d());
            bl2 = true;
        }
        if (bl2 && random.nextInt(3) > 0) {
            switch (this.g) {
                case 2: {
                    auf.b((auq)aua2, list, random, this.f.a - 1, this.f.b, this.f.c, 1, this.d());
                    break;
                }
                case 0: {
                    auf.b((auq)aua2, list, random, this.f.a - 1, this.f.b, this.f.f - 2, 1, this.d());
                    break;
                }
                case 3: {
                    auf.b((auq)aua2, list, random, this.f.d - 2, this.f.b, this.f.c - 1, 2, this.d());
                    break;
                }
                case 1: {
                    auf.b((auq)aua2, list, random, this.f.a, this.f.b, this.f.c - 1, 2, this.d());
                }
            }
        }
        if (bl2 && random.nextInt(3) > 0) {
            switch (this.g) {
                case 2: {
                    auf.b((auq)aua2, list, random, this.f.d + 1, this.f.b, this.f.c, 3, this.d());
                    break;
                }
                case 0: {
                    auf.b((auq)aua2, list, random, this.f.d + 1, this.f.b, this.f.f - 2, 3, this.d());
                    break;
                }
                case 3: {
                    auf.b((auq)aua2, list, random, this.f.d - 2, this.f.b, this.f.f + 1, 0, this.d());
                    break;
                }
                case 1: {
                    auf.b((auq)aua2, list, random, this.f.a, this.f.b, this.f.f + 1, 0, this.d());
                }
            }
        }
    }

    public static arm a(auq auq2, List list, Random random, int n2, int n3, int n4, int n5) {
        for (int i2 = 7 * oy.a(random, 3, 5); i2 >= 7; i2 -= 7) {
            arm arm2 = arm.a(n2, n3, n4, 0, 0, 0, 3, 3, i2, n5);
            if (aua.a(list, arm2) != null) continue;
            return arm2;
        }
        return null;
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        ahz ahz2 = this.b(aie.n, 0);
        for (int i2 = this.f.a; i2 <= this.f.d; ++i2) {
            for (int i3 = this.f.c; i3 <= this.f.f; ++i3) {
                if (!arm2.b(i2, 64, i3)) continue;
                int n2 = afs2.i(i2, i3) - 1;
                afs2.d(i2, n2, i3, ahz2, 0, 2);
            }
        }
        return true;
    }
}

