/*
 * Decompiled with CFR 0.152.
 */
public class xz
extends xv {
    public xz(afs afs2) {
        super(afs2);
        this.a(0.3125f, 0.3125f);
    }

    public xz(afs afs2, rm rm2, double d2, double d3, double d4) {
        super(afs2, rm2, d2, d3, d4);
        this.a(0.3125f, 0.3125f);
    }

    public xz(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(afs2, d2, d3, d4, d5, d6, d7);
        this.a(0.3125f, 0.3125f);
    }

    @Override
    protected void a(ayn ayn2) {
        if (!this.o.E) {
            if (ayn2.g != null) {
                if (!ayn2.g.J() && ayn2.g.a(qf.a(this, (qr)this.a), 5.0f)) {
                    ayn2.g.e(5);
                }
            } else {
                int n2 = ayn2.b;
                int n3 = ayn2.c;
                int n4 = ayn2.d;
                switch (ayn2.e) {
                    case 1: {
                        ++n3;
                        break;
                    }
                    case 0: {
                        --n3;
                        break;
                    }
                    case 2: {
                        --n4;
                        break;
                    }
                    case 3: {
                        ++n4;
                        break;
                    }
                    case 5: {
                        ++n2;
                        break;
                    }
                    case 4: {
                        --n2;
                    }
                }
                if (this.o.c(n2, n3, n4)) {
                    this.o.b(n2, n3, n4, aie.ab);
                }
            }
            this.A();
        }
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean a(qf qf2, float f2) {
        return false;
    }
}

