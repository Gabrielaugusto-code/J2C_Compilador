/*
 * Decompiled with CFR 0.152.
 */
public abstract class aht
extends ahz
implements ajn {
    protected aht(avk avk2) {
        super(avk2);
        this.A = true;
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4) {
        super.b(afs2, n2, n3, n4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        super.a(afs2, n2, n3, n4, ahz2, n5);
        afs2.p(n2, n3, n4);
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, int n5, int n6) {
        super.a(afs2, n2, n3, n4, n5, n6);
        ani ani2 = afs2.o(n2, n3, n4);
        if (ani2 != null) {
            return ani2.c(n5, n6);
        }
        return false;
    }
}

