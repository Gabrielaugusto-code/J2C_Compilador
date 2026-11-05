/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

abstract class asv
extends aua {
    protected int a;
    protected int b;
    protected int c;
    protected int d = -1;

    public asv() {
    }

    protected asv(Random random, int n2, int n3, int n4, int n5, int n6, int n7) {
        super(0);
        this.a = n5;
        this.b = n6;
        this.c = n7;
        this.g = random.nextInt(4);
        switch (this.g) {
            case 0: 
            case 2: {
                this.f = new arm(n2, n3, n4, n2 + n5 - 1, n3 + n6 - 1, n4 + n7 - 1);
                break;
            }
            default: {
                this.f = new arm(n2, n3, n4, n2 + n7 - 1, n3 + n6 - 1, n4 + n5 - 1);
            }
        }
    }

    @Override
    protected void a(dg dg2) {
        dg2.a("Width", this.a);
        dg2.a("Height", this.b);
        dg2.a("Depth", this.c);
        dg2.a("HPos", this.d);
    }

    @Override
    protected void b(dg dg2) {
        this.a = dg2.f("Width");
        this.b = dg2.f("Height");
        this.c = dg2.f("Depth");
        this.d = dg2.f("HPos");
    }

    protected boolean a(afs afs2, arm arm2, int n2) {
        if (this.d >= 0) {
            return true;
        }
        int n3 = 0;
        int n4 = 0;
        for (int i2 = this.f.c; i2 <= this.f.f; ++i2) {
            for (int i3 = this.f.a; i3 <= this.f.d; ++i3) {
                if (!arm2.b(i3, 64, i2)) continue;
                n3 += Math.max(afs2.i(i3, i2), afs2.t.i());
                ++n4;
            }
        }
        if (n4 == 0) {
            return false;
        }
        this.d = n3 / n4;
        this.f.a(0, this.d - this.f.b + n2, 0);
        return true;
    }
}

