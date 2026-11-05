/*
 * Decompiled with CFR 0.152.
 */
public class anc
extends ahu {
    private final int a;

    protected anc(String string, avk avk2, int n2) {
        super(string, avk2);
        this.a = n2;
    }

    @Override
    protected int e(afs afs2, int n2, int n3, int n4) {
        int n5 = Math.min(afs2.a(qr.class, this.a(n2, n3, n4)).size(), this.a);
        if (n5 <= 0) {
            return 0;
        }
        float f2 = (float)Math.min(this.a, n5) / (float)this.a;
        return oy.f(f2 * 15.0f);
    }

    @Override
    protected int c(int n2) {
        return n2;
    }

    @Override
    protected int d(int n2) {
        return n2;
    }

    @Override
    public int a(afs afs2) {
        return 10;
    }
}

