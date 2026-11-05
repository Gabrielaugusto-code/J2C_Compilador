/*
 * Decompiled with CFR 0.152.
 */
public class acm
extends abo {
    private ahz b;
    private ahz c;

    public acm(int n2, float f2, ahz ahz2, ahz ahz3) {
        super(n2, f2, false);
        this.b = ahz2;
        this.c = ahz3;
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        if (n5 != 1) {
            return false;
        }
        if (!xq2.a(n2, n3, n4, n5, abu2) || !xq2.a(n2, n3 + 1, n4, n5, abu2)) {
            return false;
        }
        if (afs2.a(n2, n3, n4) == this.c && afs2.c(n2, n3 + 1, n4)) {
            afs2.b(n2, n3 + 1, n4, this.b);
            --abu2.b;
            return true;
        }
        return false;
    }
}

