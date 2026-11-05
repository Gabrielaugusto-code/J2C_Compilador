/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.ImmutablePair
 */
import org.apache.commons.lang3.tuple.ImmutablePair;

public class xb
extends wx {
    private int bp;

    public xb(afs afs2) {
        super(afs2);
        this.a(0.3f, 0.7f);
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.a).a(8.0);
        this.a(xa.d).a(0.6f);
        this.a(xa.e).a(1.0);
    }

    @Override
    protected boolean g_() {
        return false;
    }

    @Override
    protected qr bR() {
        double d2 = 8.0;
        return this.o.b((qr)this, d2);
    }

    @Override
    protected String t() {
        return "mob.silverfish.say";
    }

    @Override
    protected String aS() {
        return "mob.silverfish.hit";
    }

    @Override
    protected String aT() {
        return "mob.silverfish.kill";
    }

    @Override
    public boolean a(qf qf2, float f2) {
        if (this.av()) {
            return false;
        }
        if (this.bp <= 0 && (qf2 instanceof qg || qf2 == qf.k)) {
            this.bp = 20;
        }
        return super.a(qf2, f2);
    }

    @Override
    protected void a(qr qr2, float f2) {
        if (this.aB <= 0 && f2 < 1.2f && qr2.C.e > this.C.b && qr2.C.b < this.C.e) {
            this.aB = 20;
            this.n(qr2);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4, ahz ahz2) {
        this.a("mob.silverfish.step", 0.15f, 1.0f);
    }

    @Override
    protected abs u() {
        return abs.d(0);
    }

    @Override
    public void h() {
        this.aM = this.y;
        super.h();
    }

    @Override
    protected void bp() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        super.bp();
        if (this.o.E) {
            return;
        }
        if (this.bp > 0) {
            --this.bp;
            if (this.bp == 0) {
                n6 = oy.c(this.s);
                n5 = oy.c(this.t);
                n4 = oy.c(this.u);
                n3 = 0;
                int n7 = 0;
                while (n3 == 0 && n7 <= 5 && n7 >= -5) {
                    n2 = 0;
                    while (n3 == 0 && n2 <= 10 && n2 >= -10) {
                        int n8 = 0;
                        while (n3 == 0 && n8 <= 10 && n8 >= -10) {
                            if (this.o.a(n6 + n2, n5 + n7, n4 + n8) == aie.aU) {
                                if (!this.o.O().b("mobGriefing")) {
                                    int n9 = this.o.e(n6 + n2, n5 + n7, n4 + n8);
                                    ImmutablePair immutablePair = aks.b(n9);
                                    this.o.d(n6 + n2, n5 + n7, n4 + n8, (ahz)immutablePair.getLeft(), (Integer)immutablePair.getRight(), 3);
                                } else {
                                    this.o.a(n6 + n2, n5 + n7, n4 + n8, false);
                                }
                                aie.aU.b(this.o, n6 + n2, n5 + n7, n4 + n8, 0);
                                if (this.Z.nextBoolean()) {
                                    n3 = 1;
                                    break;
                                }
                            }
                            n8 = n8 <= 0 ? 1 - n8 : 0 - n8;
                        }
                        n2 = n2 <= 0 ? 1 - n2 : 0 - n2;
                    }
                    n7 = n7 <= 0 ? 1 - n7 : 0 - n7;
                }
            }
        }
        if (this.bm == null && !this.bS()) {
            n6 = oy.c(this.s);
            n5 = oy.c(this.t + 0.5);
            n4 = oy.c(this.u);
            n3 = this.Z.nextInt(6);
            ahz ahz2 = this.o.a(n6 + q.b[n3], n5 + q.c[n3], n4 + q.d[n3]);
            n2 = this.o.e(n6 + q.b[n3], n5 + q.c[n3], n4 + q.d[n3]);
            if (aks.a(ahz2)) {
                this.o.d(n6 + q.b[n3], n5 + q.c[n3], n4 + q.d[n3], aie.aU, aks.a(ahz2, n2), 3);
                this.s();
                this.A();
            } else {
                this.bQ();
            }
        } else if (this.bm != null && !this.bS()) {
            this.bm = null;
        }
    }

    @Override
    public float a(int n2, int n3, int n4) {
        if (this.o.a(n2, n3 - 1, n4) == aie.b) {
            return 10.0f;
        }
        return super.a(n2, n3, n4);
    }

    @Override
    protected boolean j_() {
        return true;
    }

    @Override
    public boolean by() {
        if (super.by()) {
            xq xq2 = this.o.a((qr)this, 5.0);
            return xq2 == null;
        }
        return false;
    }

    @Override
    public rq bc() {
        return rq.c;
    }
}

