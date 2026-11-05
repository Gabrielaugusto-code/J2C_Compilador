/*
 * Decompiled with CFR 0.152.
 */
public class acn
extends abs {
    private ahz a;
    private ahz b;

    public acn(ahz ahz2, ahz ahz3) {
        this.a = ahz2;
        this.b = ahz3;
        this.a(aak.l);
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        if (n5 != 1) {
            return false;
        }
        if (!xq2.a(n2, n3, n4, n5, abu2) || !xq2.a(n2, n3 + 1, n4, n5, abu2)) {
            return false;
        }
        if (afs2.a(n2, n3, n4) == this.b && afs2.c(n2, n3 + 1, n4)) {
            afs2.b(n2, n3 + 1, n4, this.a);
            --abu2.b;
            return true;
        }
        return false;
    }
}

