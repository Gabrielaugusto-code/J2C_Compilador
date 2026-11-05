/*
 * Decompiled with CFR 0.152.
 */
public class ajh
extends ajd {
    private final co P = new cl();

    @Override
    public void a(px px2) {
        this.L = px2.a("furnace_side");
        this.M = px2.a("furnace_top");
        this.N = px2.a(this.N() + "_front_horizontal");
        this.O = px2.a(this.N() + "_front_vertical");
    }

    @Override
    protected co a(abu abu2) {
        return this.P;
    }

    @Override
    public ani a(afs afs2, int n2) {
        return new ant();
    }

    @Override
    protected void e(afs afs2, int n2, int n3, int n4) {
        ck ck2 = new ck(afs2, n2, n3, n4);
        ans ans2 = (ans)ck2.j();
        if (ans2 == null) {
            return;
        }
        int n5 = ans2.i();
        if (n5 < 0) {
            afs2.c(1001, n2, n3, n4, 0);
        } else {
            abu abu2;
            abu abu3 = ans2.a(n5);
            int n6 = afs2.e(n2, n3, n4) & 7;
            ps ps2 = anz.b(afs2, n2 + q.b[n6], (double)(n3 + q.c[n6]), (double)(n4 + q.d[n6]));
            if (ps2 != null) {
                abu2 = anz.a(ps2, abu3.m().a(1), q.a[n6]);
                if (abu2 == null) {
                    abu2 = abu3.m();
                    if (--abu2.b == 0) {
                        abu2 = null;
                    }
                } else {
                    abu2 = abu3.m();
                }
            } else {
                abu2 = this.P.a(ck2, abu3);
                if (abu2 != null && abu2.b == 0) {
                    abu2 = null;
                }
            }
            ans2.a(n5, abu2);
        }
    }
}

