/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

class bdd
extends bdg {
    final /* synthetic */ bcz k;

    public bdd(bcz bcz2) {
        this.k = bcz2;
        super(bcz2);
        this.m = new ArrayList();
        for (nw nw2 : og.d) {
            boolean bl2 = false;
            int n2 = abs.b(nw2.a());
            if (bcz.c(bcz2).a(nw2) > 0) {
                bl2 = true;
            } else if (og.F[n2] != null && bcz.c(bcz2).a(og.F[n2]) > 0) {
                bl2 = true;
            } else if (og.D[n2] != null && bcz.c(bcz2).a(og.D[n2]) > 0) {
                bl2 = true;
            }
            if (!bl2) continue;
            this.m.add(nw2);
        }
        this.n = new bde(this, bcz2);
    }

    @Override
    protected void a(int n2, int n3, bna bna2) {
        super.a(n2, n3, bna2);
        if (this.l == 0) {
            bcz.a(this.k, n2 + 115 - 18 + 1, n3 + 1 + 1, 72, 18);
        } else {
            bcz.a(this.k, n2 + 115 - 18, n3 + 1, 72, 18);
        }
        if (this.l == 1) {
            bcz.a(this.k, n2 + 165 - 18 + 1, n3 + 1 + 1, 18, 18);
        } else {
            bcz.a(this.k, n2 + 165 - 18, n3 + 1, 18, 18);
        }
        if (this.l == 2) {
            bcz.a(this.k, n2 + 215 - 18 + 1, n3 + 1 + 1, 36, 18);
        } else {
            bcz.a(this.k, n2 + 215 - 18, n3 + 1, 36, 18);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, bna bna2, int n6, int n7) {
        nw nw2 = this.c(n2);
        abs abs2 = nw2.a();
        bcz.a(this.k, n3 + 40, n4, abs2);
        int n8 = abs.b(abs2);
        this.a(og.F[n8], n3 + 115, n4, n2 % 2 == 0);
        this.a(og.D[n8], n3 + 165, n4, n2 % 2 == 0);
        this.a(nw2, n3 + 215, n4, n2 % 2 == 0);
    }

    @Override
    protected String b(int n2) {
        if (n2 == 1) {
            return "stat.crafted";
        }
        if (n2 == 2) {
            return "stat.used";
        }
        return "stat.depleted";
    }
}

