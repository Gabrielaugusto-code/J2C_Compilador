/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public abstract class aua {
    protected arm f;
    protected int g;
    protected int h;

    public aua() {
    }

    protected aua(int n2) {
        this.h = n2;
        this.g = -1;
    }

    public dg b() {
        dg dg2 = new dg();
        dg2.a("id", aty.a(this));
        dg2.a("BB", this.f.h());
        dg2.a("O", this.g);
        dg2.a("GD", this.h);
        this.a(dg2);
        return dg2;
    }

    protected abstract void a(dg var1);

    public void a(afs afs2, dg dg2) {
        if (dg2.c("BB")) {
            this.f = new arm(dg2.l("BB"));
        }
        this.g = dg2.f("O");
        this.h = dg2.f("GD");
        this.b(dg2);
    }

    protected abstract void b(dg var1);

    public void a(aua aua2, List list, Random random) {
    }

    public abstract boolean a(afs var1, Random var2, arm var3);

    public arm c() {
        return this.f;
    }

    public int d() {
        return this.h;
    }

    public static aua a(List list, arm arm2) {
        for (aua aua2 : list) {
            if (aua2.c() == null || !aua2.c().a(arm2)) continue;
            return aua2;
        }
        return null;
    }

    public afk a() {
        return new afk(this.f.e(), this.f.f(), this.f.g());
    }

    protected boolean a(afs afs2, arm arm2) {
        int n2;
        int n3;
        int n4 = Math.max(this.f.a - 1, arm2.a);
        int n5 = Math.max(this.f.b - 1, arm2.b);
        int n6 = Math.max(this.f.c - 1, arm2.c);
        int n7 = Math.min(this.f.d + 1, arm2.d);
        int n8 = Math.min(this.f.e + 1, arm2.e);
        int n9 = Math.min(this.f.f + 1, arm2.f);
        for (n3 = n4; n3 <= n7; ++n3) {
            for (n2 = n6; n2 <= n9; ++n2) {
                if (afs2.a(n3, n5, n2).o().d()) {
                    return true;
                }
                if (!afs2.a(n3, n8, n2).o().d()) continue;
                return true;
            }
        }
        for (n3 = n4; n3 <= n7; ++n3) {
            for (n2 = n5; n2 <= n8; ++n2) {
                if (afs2.a(n3, n2, n6).o().d()) {
                    return true;
                }
                if (!afs2.a(n3, n2, n9).o().d()) continue;
                return true;
            }
        }
        for (n3 = n6; n3 <= n9; ++n3) {
            for (n2 = n5; n2 <= n8; ++n2) {
                if (afs2.a(n4, n2, n3).o().d()) {
                    return true;
                }
                if (!afs2.a(n7, n2, n3).o().d()) continue;
                return true;
            }
        }
        return false;
    }

    protected int a(int n2, int n3) {
        switch (this.g) {
            case 0: 
            case 2: {
                return this.f.a + n2;
            }
            case 1: {
                return this.f.d - n3;
            }
            case 3: {
                return this.f.a + n3;
            }
        }
        return n2;
    }

    protected int a(int n2) {
        if (this.g == -1) {
            return n2;
        }
        return n2 + this.f.b;
    }

    protected int b(int n2, int n3) {
        switch (this.g) {
            case 2: {
                return this.f.f - n3;
            }
            case 0: {
                return this.f.c + n3;
            }
            case 1: 
            case 3: {
                return this.f.c + n2;
            }
        }
        return n3;
    }

    protected int a(ahz ahz2, int n2) {
        if (ahz2 == aie.aq) {
            if (this.g == 1 || this.g == 3) {
                if (n2 == 1) {
                    return 0;
                }
                return 1;
            }
        } else if (ahz2 == aie.ao || ahz2 == aie.av) {
            if (this.g == 0) {
                if (n2 == 0) {
                    return 2;
                }
                if (n2 == 2) {
                    return 0;
                }
            } else {
                if (this.g == 1) {
                    return n2 + 1 & 3;
                }
                if (this.g == 3) {
                    return n2 + 3 & 3;
                }
            }
        } else if (ahz2 == aie.ar || ahz2 == aie.ad || ahz2 == aie.bl || ahz2 == aie.bg || ahz2 == aie.bz) {
            if (this.g == 0) {
                if (n2 == 2) {
                    return 3;
                }
                if (n2 == 3) {
                    return 2;
                }
            } else if (this.g == 1) {
                if (n2 == 0) {
                    return 2;
                }
                if (n2 == 1) {
                    return 3;
                }
                if (n2 == 2) {
                    return 0;
                }
                if (n2 == 3) {
                    return 1;
                }
            } else if (this.g == 3) {
                if (n2 == 0) {
                    return 2;
                }
                if (n2 == 1) {
                    return 3;
                }
                if (n2 == 2) {
                    return 1;
                }
                if (n2 == 3) {
                    return 0;
                }
            }
        } else if (ahz2 == aie.ap) {
            if (this.g == 0) {
                if (n2 == 2) {
                    return 3;
                }
                if (n2 == 3) {
                    return 2;
                }
            } else if (this.g == 1) {
                if (n2 == 2) {
                    return 4;
                }
                if (n2 == 3) {
                    return 5;
                }
                if (n2 == 4) {
                    return 2;
                }
                if (n2 == 5) {
                    return 3;
                }
            } else if (this.g == 3) {
                if (n2 == 2) {
                    return 5;
                }
                if (n2 == 3) {
                    return 4;
                }
                if (n2 == 4) {
                    return 2;
                }
                if (n2 == 5) {
                    return 3;
                }
            }
        } else if (ahz2 == aie.aB) {
            if (this.g == 0) {
                if (n2 == 3) {
                    return 4;
                }
                if (n2 == 4) {
                    return 3;
                }
            } else if (this.g == 1) {
                if (n2 == 3) {
                    return 1;
                }
                if (n2 == 4) {
                    return 2;
                }
                if (n2 == 2) {
                    return 3;
                }
                if (n2 == 1) {
                    return 4;
                }
            } else if (this.g == 3) {
                if (n2 == 3) {
                    return 2;
                }
                if (n2 == 4) {
                    return 1;
                }
                if (n2 == 2) {
                    return 3;
                }
                if (n2 == 1) {
                    return 4;
                }
            }
        } else if (ahz2 == aie.bC || ahz2 instanceof ajb) {
            if (this.g == 0) {
                if (n2 == 0 || n2 == 2) {
                    return p.f[n2];
                }
            } else if (this.g == 1) {
                if (n2 == 2) {
                    return 1;
                }
                if (n2 == 0) {
                    return 3;
                }
                if (n2 == 1) {
                    return 2;
                }
                if (n2 == 3) {
                    return 0;
                }
            } else if (this.g == 3) {
                if (n2 == 2) {
                    return 3;
                }
                if (n2 == 0) {
                    return 1;
                }
                if (n2 == 1) {
                    return 2;
                }
                if (n2 == 3) {
                    return 0;
                }
            }
        } else if (ahz2 == aie.J || ahz2 == aie.F || ahz2 == aie.at || ahz2 == aie.z) {
            if (this.g == 0) {
                if (n2 == 2 || n2 == 3) {
                    return q.a[n2];
                }
            } else if (this.g == 1) {
                if (n2 == 2) {
                    return 4;
                }
                if (n2 == 3) {
                    return 5;
                }
                if (n2 == 4) {
                    return 2;
                }
                if (n2 == 5) {
                    return 3;
                }
            } else if (this.g == 3) {
                if (n2 == 2) {
                    return 5;
                }
                if (n2 == 3) {
                    return 4;
                }
                if (n2 == 4) {
                    return 2;
                }
                if (n2 == 5) {
                    return 3;
                }
            }
        }
        return n2;
    }

    protected void a(afs afs2, ahz ahz2, int n2, int n3, int n4, int n5, arm arm2) {
        int n6;
        int n7;
        int n8 = this.a(n3, n5);
        if (!arm2.b(n8, n7 = this.a(n4), n6 = this.b(n3, n5))) {
            return;
        }
        afs2.d(n8, n7, n6, ahz2, n2, 2);
    }

    protected ahz a(afs afs2, int n2, int n3, int n4, arm arm2) {
        int n5;
        int n6;
        int n7 = this.a(n2, n4);
        if (!arm2.b(n7, n6 = this.a(n3), n5 = this.b(n2, n4))) {
            return aie.a;
        }
        return afs2.a(n7, n6, n5);
    }

    protected void a(afs afs2, arm arm2, int n2, int n3, int n4, int n5, int n6, int n7) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    this.a(afs2, aie.a, 0, i3, i2, i4, arm2);
                }
            }
        }
    }

    protected void a(afs afs2, arm arm2, int n2, int n3, int n4, int n5, int n6, int n7, ahz ahz2, ahz ahz3, boolean bl2) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (bl2 && this.a(afs2, i3, i2, i4, arm2).o() == avk.a) continue;
                    if (i2 == n3 || i2 == n6 || i3 == n2 || i3 == n5 || i4 == n4 || i4 == n7) {
                        this.a(afs2, ahz2, 0, i3, i2, i4, arm2);
                        continue;
                    }
                    this.a(afs2, ahz3, 0, i3, i2, i4, arm2);
                }
            }
        }
    }

    protected void a(afs afs2, arm arm2, int n2, int n3, int n4, int n5, int n6, int n7, ahz ahz2, int n8, ahz ahz3, int n9, boolean bl2) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (bl2 && this.a(afs2, i3, i2, i4, arm2).o() == avk.a) continue;
                    if (i2 == n3 || i2 == n6 || i3 == n2 || i3 == n5 || i4 == n4 || i4 == n7) {
                        this.a(afs2, ahz2, n8, i3, i2, i4, arm2);
                        continue;
                    }
                    this.a(afs2, ahz3, n9, i3, i2, i4, arm2);
                }
            }
        }
    }

    protected void a(afs afs2, arm arm2, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2, Random random, aub aub2) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (bl2 && this.a(afs2, i3, i2, i4, arm2).o() == avk.a) continue;
                    aub2.a(random, i3, i2, i4, i2 == n3 || i2 == n6 || i3 == n2 || i3 == n5 || i4 == n4 || i4 == n7);
                    this.a(afs2, aub2.a(), aub2.b(), i3, i2, i4, arm2);
                }
            }
        }
    }

    protected void a(afs afs2, arm arm2, Random random, float f2, int n2, int n3, int n4, int n5, int n6, int n7, ahz ahz2, ahz ahz3, boolean bl2) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (random.nextFloat() > f2 || bl2 && this.a(afs2, i3, i2, i4, arm2).o() == avk.a) continue;
                    if (i2 == n3 || i2 == n6 || i3 == n2 || i3 == n5 || i4 == n4 || i4 == n7) {
                        this.a(afs2, ahz2, 0, i3, i2, i4, arm2);
                        continue;
                    }
                    this.a(afs2, ahz3, 0, i3, i2, i4, arm2);
                }
            }
        }
    }

    protected void a(afs afs2, arm arm2, Random random, float f2, int n2, int n3, int n4, ahz ahz2, int n5) {
        if (random.nextFloat() < f2) {
            this.a(afs2, ahz2, n5, n2, n3, n4, arm2);
        }
    }

    protected void a(afs afs2, arm arm2, int n2, int n3, int n4, int n5, int n6, int n7, ahz ahz2, boolean bl2) {
        float f2 = n5 - n2 + 1;
        float f3 = n6 - n3 + 1;
        float f4 = n7 - n4 + 1;
        float f5 = (float)n2 + f2 / 2.0f;
        float f6 = (float)n4 + f4 / 2.0f;
        for (int i2 = n3; i2 <= n6; ++i2) {
            float f7 = (float)(i2 - n3) / f3;
            for (int i3 = n2; i3 <= n5; ++i3) {
                float f8 = ((float)i3 - f5) / (f2 * 0.5f);
                for (int i4 = n4; i4 <= n7; ++i4) {
                    float f9;
                    float f10 = ((float)i4 - f6) / (f4 * 0.5f);
                    if (bl2 && this.a(afs2, i3, i2, i4, arm2).o() == avk.a || !((f9 = f8 * f8 + f7 * f7 + f10 * f10) <= 1.05f)) continue;
                    this.a(afs2, ahz2, 0, i3, i2, i4, arm2);
                }
            }
        }
    }

    protected void b(afs afs2, int n2, int n3, int n4, arm arm2) {
        int n5;
        int n6;
        int n7 = this.a(n2, n4);
        if (!arm2.b(n7, n6 = this.a(n3), n5 = this.b(n2, n4))) {
            return;
        }
        while (!afs2.c(n7, n6, n5) && n6 < 255) {
            afs2.d(n7, n6, n5, aie.a, 0, 2);
            ++n6;
        }
    }

    protected void b(afs afs2, ahz ahz2, int n2, int n3, int n4, int n5, arm arm2) {
        int n6;
        int n7;
        int n8 = this.a(n3, n5);
        if (!arm2.b(n8, n7 = this.a(n4), n6 = this.b(n3, n5))) {
            return;
        }
        while ((afs2.c(n8, n7, n6) || afs2.a(n8, n7, n6).o().d()) && n7 > 1) {
            afs2.d(n8, n7, n6, ahz2, n2, 2);
            --n7;
        }
    }

    protected boolean a(afs afs2, arm arm2, Random random, int n2, int n3, int n4, po[] poArray, int n5) {
        int n6;
        int n7;
        int n8 = this.a(n2, n4);
        if (arm2.b(n8, n7 = this.a(n3), n6 = this.b(n2, n4)) && afs2.a(n8, n7, n6) != aie.ae) {
            afs2.d(n8, n7, n6, aie.ae, 0, 2);
            ann ann2 = (ann)afs2.o(n8, n7, n6);
            if (ann2 != null) {
                po.a(random, poArray, ann2, n5);
            }
            return true;
        }
        return false;
    }

    protected boolean a(afs afs2, arm arm2, Random random, int n2, int n3, int n4, int n5, po[] poArray, int n6) {
        int n7;
        int n8;
        int n9 = this.a(n2, n4);
        if (arm2.b(n9, n8 = this.a(n3), n7 = this.b(n2, n4)) && afs2.a(n9, n8, n7) != aie.z) {
            afs2.d(n9, n8, n7, aie.z, this.a(aie.z, n5), 2);
            ans ans2 = (ans)afs2.o(n9, n8, n7);
            if (ans2 != null) {
                po.a(random, poArray, ans2, n6);
            }
            return true;
        }
        return false;
    }

    protected void a(afs afs2, arm arm2, Random random, int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8 = this.a(n2, n4);
        if (arm2.b(n8, n7 = this.a(n3), n6 = this.b(n2, n4))) {
            aay.a(afs2, n8, n7, n6, n5, aie.ao);
        }
    }
}

