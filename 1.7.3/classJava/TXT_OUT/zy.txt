/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class zy
extends abs {
    protected final ahz a;
    private pw b;

    public zy(ahz ahz2) {
        this.a = ahz2;
    }

    public zy b(String string) {
        super.c(string);
        return this;
    }

    @Override
    public int d() {
        if (this.a.O() != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public pw b_(int n2) {
        if (this.b != null) {
            return this.b;
        }
        return this.a.h(1);
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        ahz ahz2 = afs2.a(n2, n3, n4);
        if (ahz2 == aie.aC && (afs2.e(n2, n3, n4) & 7) < 1) {
            n5 = 1;
        } else if (ahz2 != aie.bd && ahz2 != aie.H && ahz2 != aie.I) {
            if (n5 == 0) {
                --n3;
            }
            if (n5 == 1) {
                ++n3;
            }
            if (n5 == 2) {
                --n4;
            }
            if (n5 == 3) {
                ++n4;
            }
            if (n5 == 4) {
                --n2;
            }
            if (n5 == 5) {
                ++n2;
            }
        }
        if (abu2.b == 0) {
            return false;
        }
        if (!xq2.a(n2, n3, n4, n5, abu2)) {
            return false;
        }
        if (n3 == 255 && this.a.o().a()) {
            return false;
        }
        if (afs2.a(this.a, n2, n3, n4, false, n5, xq2, abu2)) {
            int n6 = this.a(abu2.k());
            int n7 = this.a.a(afs2, n2, n3, n4, n5, f2, f3, f4, n6);
            if (afs2.d(n2, n3, n4, this.a, n7, 3)) {
                if (afs2.a(n2, n3, n4) == this.a) {
                    this.a.a(afs2, n2, n3, n4, xq2, abu2);
                    this.a.e(afs2, n2, n3, n4, n7);
                }
                afs2.a((float)n2 + 0.5f, (double)((float)n3 + 0.5f), (double)((float)n4 + 0.5f), this.a.H.b(), (this.a.H.c() + 1.0f) / 2.0f, this.a.H.d() * 0.8f);
                --abu2.b;
            }
            return true;
        }
        return false;
    }

    public boolean a(afs afs2, int n2, int n3, int n4, int n5, xq xq2, abu abu2) {
        ahz ahz2 = afs2.a(n2, n3, n4);
        if (ahz2 == aie.aC) {
            n5 = 1;
        } else if (ahz2 != aie.bd && ahz2 != aie.H && ahz2 != aie.I) {
            if (n5 == 0) {
                --n3;
            }
            if (n5 == 1) {
                ++n3;
            }
            if (n5 == 2) {
                --n4;
            }
            if (n5 == 3) {
                ++n4;
            }
            if (n5 == 4) {
                --n2;
            }
            if (n5 == 5) {
                ++n2;
            }
        }
        return afs2.a(this.a, n2, n3, n4, false, n5, null, abu2);
    }

    @Override
    public String a(abu abu2) {
        return this.a.a();
    }

    @Override
    public String a() {
        return this.a.a();
    }

    @Override
    public aak n_() {
        return this.a.J();
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        this.a.a(abs2, aak2, list);
    }

    @Override
    public void a(px px2) {
        String string = this.a.O();
        if (string != null) {
            this.b = px2.a(string);
        }
    }

    @Override
    public /* synthetic */ abs c(String string) {
        return this.b(string);
    }
}

