/*
 * Decompiled with CFR 0.152.
 */
public class amu
extends ahz {
    protected boolean P;

    protected amu(avk avk2, boolean bl2) {
        super(avk2);
        this.P = bl2;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        ahz ahz2 = agc2.a(n2, n3, n4);
        if (!this.P && ahz2 == this) {
            return false;
        }
        return super.a(agc2, n2, n3, n4, n5);
    }
}

