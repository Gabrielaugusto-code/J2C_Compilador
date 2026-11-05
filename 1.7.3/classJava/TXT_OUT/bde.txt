/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bde
implements Comparator {
    final /* synthetic */ bcz a;
    final /* synthetic */ bdd b;

    bde(bdd bdd2, bcz bcz2) {
        this.b = bdd2;
        this.a = bcz2;
    }

    public int a(nw nw2, nw nw3) {
        int n2 = abs.b(nw2.a());
        int n3 = abs.b(nw3.a());
        ny ny2 = null;
        ny ny3 = null;
        if (this.b.o == 0) {
            ny2 = og.F[n2];
            ny3 = og.F[n3];
        } else if (this.b.o == 1) {
            ny2 = og.D[n2];
            ny3 = og.D[n3];
        } else if (this.b.o == 2) {
            ny2 = og.E[n2];
            ny3 = og.E[n3];
        }
        if (ny2 != null || ny3 != null) {
            int n4;
            if (ny2 == null) {
                return 1;
            }
            if (ny3 == null) {
                return -1;
            }
            int n5 = bcz.c(this.b.k).a(ny2);
            if (n5 != (n4 = bcz.c(this.b.k).a(ny3))) {
                return (n5 - n4) * this.b.p;
            }
        }
        return n2 - n3;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((nw)object, (nw)object2);
    }
}

