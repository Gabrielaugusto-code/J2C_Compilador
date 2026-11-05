/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class auv
extends aut {
    public auv() {
    }

    public auv(auq auq2, int n2, Random random, int n3, int n4) {
        super(auq2, n2);
        this.g = random.nextInt(4);
        switch (this.g) {
            case 0: 
            case 2: {
                this.f = new arm(n3, 64, n4, n3 + 6 - 1, 78, n4 + 6 - 1);
                break;
            }
            default: {
                this.f = new arm(n3, 64, n4, n3 + 6 - 1, 78, n4 + 6 - 1);
            }
        }
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        auf.b((auq)aua2, list, random, this.f.a - 1, this.f.e - 4, this.f.c + 1, 1, this.d());
        auf.b((auq)aua2, list, random, this.f.d + 1, this.f.e - 4, this.f.c + 1, 3, this.d());
        auf.b((auq)aua2, list, random, this.f.a + 1, this.f.e - 4, this.f.c - 1, 2, this.d());
        auf.b((auq)aua2, list, random, this.f.a + 1, this.f.e - 4, this.f.f + 1, 0, this.d());
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        if (this.k < 0) {
            this.k = this.b(afs2, arm2);
            if (this.k < 0) {
                return true;
            }
            this.f.a(0, this.k - this.f.e + 3, 0);
        }
        this.a(afs2, arm2, 1, 0, 1, 4, 12, 4, aie.e, aie.i, false);
        this.a(afs2, aie.a, 0, 2, 12, 2, arm2);
        this.a(afs2, aie.a, 0, 3, 12, 2, arm2);
        this.a(afs2, aie.a, 0, 2, 12, 3, arm2);
        this.a(afs2, aie.a, 0, 3, 12, 3, arm2);
        this.a(afs2, aie.aJ, 0, 1, 13, 1, arm2);
        this.a(afs2, aie.aJ, 0, 1, 14, 1, arm2);
        this.a(afs2, aie.aJ, 0, 4, 13, 1, arm2);
        this.a(afs2, aie.aJ, 0, 4, 14, 1, arm2);
        this.a(afs2, aie.aJ, 0, 1, 13, 4, arm2);
        this.a(afs2, aie.aJ, 0, 1, 14, 4, arm2);
        this.a(afs2, aie.aJ, 0, 4, 13, 4, arm2);
        this.a(afs2, aie.aJ, 0, 4, 14, 4, arm2);
        this.a(afs2, arm2, 1, 15, 1, 4, 15, 4, aie.e, aie.e, false);
        for (int i2 = 0; i2 <= 5; ++i2) {
            for (int i3 = 0; i3 <= 5; ++i3) {
                if (i3 != 0 && i3 != 5 && i2 != 0 && i2 != 5) continue;
                this.a(afs2, aie.n, 0, i3, 11, i2, arm2);
                this.b(afs2, i3, 12, i2, arm2);
            }
        }
        return true;
    }
}

