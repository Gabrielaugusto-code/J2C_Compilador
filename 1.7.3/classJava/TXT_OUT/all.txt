/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class all
extends ahu {
    private alm a;

    protected all(String string, avk avk2, alm alm2) {
        super(string, avk2);
        this.a = alm2;
    }

    @Override
    protected int d(int n2) {
        return n2 > 0 ? 1 : 0;
    }

    @Override
    protected int c(int n2) {
        return n2 == 1 ? 15 : 0;
    }

    @Override
    protected int e(afs afs2, int n2, int n3, int n4) {
        List list = null;
        if (this.a == alm.a) {
            list = afs2.b(null, this.a(n2, n3, n4));
        }
        if (this.a == alm.b) {
            list = afs2.a(rm.class, this.a(n2, n3, n4));
        }
        if (this.a == alm.c) {
            list = afs2.a(xq.class, this.a(n2, n3, n4));
        }
        if (list != null && !list.isEmpty()) {
            for (qr qr2 : list) {
                if (qr2.ay()) continue;
                return 15;
            }
        }
        return 0;
    }
}

