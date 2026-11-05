/*
 * Decompiled with CFR 0.152.
 */
public class akb
extends ahz {
    private boolean a;
    private String b;

    protected akb(String string, avk avk2, boolean bl2) {
        super(avk2);
        this.a = bl2;
        this.b = string;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean a(agc agc2, int n2, int n3, int n4, int n5) {
        ahz ahz2 = agc2.a(n2, n3, n4);
        if (this == aie.w || this == aie.cn) {
            if (agc2.e(n2, n3, n4) != agc2.e(n2 - q.b[n5], n3 - q.c[n5], n4 - q.d[n5])) {
                return true;
            }
            if (ahz2 == this) {
                return false;
            }
        }
        if (!this.a && ahz2 == this) {
            return false;
        }
        return super.a(agc2, n2, n3, n4, n5);
    }

    @Override
    public void a(px px2) {
        this.L = px2.a(this.b);
    }
}

