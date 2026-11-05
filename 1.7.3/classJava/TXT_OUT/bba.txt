/*
 * Decompiled with CFR 0.152.
 */
public abstract class bba
extends bbf {
    public bba(azi azi2, int n2, int n3, int n4, int n5, int n6) {
        super(azi2, n2, n3, n4, n5, n6);
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected boolean a(int n2) {
        return false;
    }

    @Override
    protected void a() {
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, bna bna2, int n6, int n7) {
        this.b(n2).a(n2, n3, n4, this.c(), n5, bna2, n6, n7, this.c(n6, n7) == n2);
    }

    public boolean a(int n2, int n3, int n4) {
        int n5;
        if (this.e(n3) && (n5 = this.c(n2, n3)) >= 0) {
            int n6 = this.e + (this.a / 2 - this.c() / 2 + 2);
            int n7 = this.b + 4 - this.g() + (n5 * this.f + this.j);
            int n8 = n2 - n6;
            int n9 = n3 - n7;
            if (this.b(n5).a(n5, n2, n3, n4, n8, n9)) {
                this.b(false);
                return true;
            }
        }
        return false;
    }

    public boolean b(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < this.b(); ++i2) {
            int n5 = this.e + (this.a / 2 - this.c() / 2 + 2);
            int n6 = this.b + 4 - this.g() + (i2 * this.f + this.j);
            int n7 = n2 - n5;
            int n8 = n3 - n6;
            this.b(i2).b(i2, n2, n3, n4, n7, n8);
        }
        this.b(true);
        return false;
    }

    public abstract bbb b(int var1);
}

