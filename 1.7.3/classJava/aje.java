/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aje
extends ahz {
    private pw[] a;
    private pw[] b;

    protected aje(avk avk2) {
        super(avk2);
        float f2 = 0.5f;
        float f3 = 1.0f;
        this.a(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, f3, 0.5f + f2);
    }

    @Override
    public pw a(int n2, int n3) {
        return this.b[0];
    }

    @Override
    public pw e(agc agc2, int n2, int n3, int n4, int n5) {
        boolean bl2;
        if (n5 == 1 || n5 == 0) {
            return this.b[0];
        }
        int n6 = this.g(agc2, n2, n3, n4);
        int n7 = n6 & 3;
        boolean bl3 = (n6 & 4) != 0;
        boolean bl4 = false;
        boolean bl5 = bl2 = (n6 & 8) != 0;
        if (bl3) {
            if (n7 == 0 && n5 == 2) {
                bl4 = !bl4;
            } else if (n7 == 1 && n5 == 5) {
                bl4 = !bl4;
            } else if (n7 == 2 && n5 == 3) {
                bl4 = !bl4;
            } else if (n7 == 3 && n5 == 4) {
                bl4 = !bl4;
            }
        } else {
            if (n7 == 0 && n5 == 5) {
                bl4 = !bl4;
            } else if (n7 == 1 && n5 == 3) {
                bl4 = !bl4;
            } else if (n7 == 2 && n5 == 4) {
                bl4 = !bl4;
            } else if (n7 == 3 && n5 == 2) {
                boolean bl6 = bl4 = !bl4;
            }
            if ((n6 & 0x10) != 0) {
                boolean bl7 = bl4 = !bl4;
            }
        }
        if (bl2) {
            return this.a[bl4 ? 1 : 0];
        }
        return this.b[bl4 ? 1 : 0];
    }

    @Override
    public void a(px px2) {
        this.a = new pw[2];
        this.b = new pw[2];
        this.a[0] = px2.a(this.N() + "_upper");
        this.b[0] = px2.a(this.N() + "_lower");
        this.a[1] = new pv(this.a[0], true, false);
        this.b[1] = new pv(this.b[0], true, false);
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean b(agc agc2, int n2, int n3, int n4) {
        int n5 = this.g(agc2, n2, n3, n4);
        return (n5 & 4) != 0;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public int b() {
        return 7;
    }

    @Override
    public ayk g(afs afs2, int n2, int n3, int n4) {
        this.a((agc)afs2, n2, n3, n4);
        return super.g(afs2, n2, n3, n4);
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        this.a((agc)afs2, n2, n3, n4);
        return super.a(afs2, n2, n3, n4);
    }

    @Override
    public void a(agc agc2, int n2, int n3, int n4) {
        this.b(this.g(agc2, n2, n3, n4));
    }

    public int e(agc agc2, int n2, int n3, int n4) {
        return this.g(agc2, n2, n3, n4) & 3;
    }

    public boolean f(agc agc2, int n2, int n3, int n4) {
        return (this.g(agc2, n2, n3, n4) & 4) != 0;
    }

    private void b(int n2) {
        boolean bl2;
        float f2 = 0.1875f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 1.0f);
        int n3 = n2 & 3;
        boolean bl3 = (n2 & 4) != 0;
        boolean bl4 = bl2 = (n2 & 0x10) != 0;
        if (n3 == 0) {
            if (bl3) {
                if (!bl2) {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f2);
                } else {
                    this.a(0.0f, 0.0f, 1.0f - f2, 1.0f, 1.0f, 1.0f);
                }
            } else {
                this.a(0.0f, 0.0f, 0.0f, f2, 1.0f, 1.0f);
            }
        } else if (n3 == 1) {
            if (bl3) {
                if (!bl2) {
                    this.a(1.0f - f2, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                } else {
                    this.a(0.0f, 0.0f, 0.0f, f2, 1.0f, 1.0f);
                }
            } else {
                this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f2);
            }
        } else if (n3 == 2) {
            if (bl3) {
                if (!bl2) {
                    this.a(0.0f, 0.0f, 1.0f - f2, 1.0f, 1.0f, 1.0f);
                } else {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f2);
                }
            } else {
                this.a(1.0f - f2, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            }
        } else if (n3 == 3) {
            if (bl3) {
                if (!bl2) {
                    this.a(0.0f, 0.0f, 0.0f, f2, 1.0f, 1.0f);
                } else {
                    this.a(1.0f - f2, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
            } else {
                this.a(0.0f, 0.0f, 1.0f - f2, 1.0f, 1.0f, 1.0f);
            }
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, xq xq2) {
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        if (this.J == avk.f) {
            return true;
        }
        int n6 = this.g((agc)afs2, n2, n3, n4);
        int n7 = n6 & 7;
        n7 ^= 4;
        if ((n6 & 8) == 0) {
            afs2.a(n2, n3, n4, n7, 2);
            afs2.c(n2, n3, n4, n2, n3, n4);
        } else {
            afs2.a(n2, n3 - 1, n4, n7, 2);
            afs2.c(n2, n3 - 1, n4, n2, n3, n4);
        }
        afs2.a(xq2, 1003, n2, n3, n4, 0);
        return true;
    }

    public void a(afs afs2, int n2, int n3, int n4, boolean bl2) {
        boolean bl3;
        int n5 = this.g((agc)afs2, n2, n3, n4);
        boolean bl4 = bl3 = (n5 & 4) != 0;
        if (bl3 == bl2) {
            return;
        }
        int n6 = n5 & 7;
        n6 ^= 4;
        if ((n5 & 8) == 0) {
            afs2.a(n2, n3, n4, n6, 2);
            afs2.c(n2, n3, n4, n2, n3, n4);
        } else {
            afs2.a(n2, n3 - 1, n4, n6, 2);
            afs2.c(n2, n3 - 1, n4, n2, n3, n4);
        }
        afs2.a(null, 1003, n2, n3, n4, 0);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        int n5 = afs2.e(n2, n3, n4);
        if ((n5 & 8) == 0) {
            boolean bl2 = false;
            if (afs2.a(n2, n3 + 1, n4) != this) {
                afs2.f(n2, n3, n4);
                bl2 = true;
            }
            if (!afs.a(afs2, n2, n3 - 1, n4)) {
                afs2.f(n2, n3, n4);
                bl2 = true;
                if (afs2.a(n2, n3 + 1, n4) == this) {
                    afs2.f(n2, n3 + 1, n4);
                }
            }
            if (bl2) {
                if (!afs2.E) {
                    this.b(afs2, n2, n3, n4, n5, 0);
                }
            } else {
                boolean bl3;
                boolean bl4 = bl3 = afs2.v(n2, n3, n4) || afs2.v(n2, n3 + 1, n4);
                if ((bl3 || ahz2.f()) && ahz2 != this) {
                    this.a(afs2, n2, n3, n4, bl3);
                }
            }
        } else {
            if (afs2.a(n2, n3 - 1, n4) != this) {
                afs2.f(n2, n3, n4);
            }
            if (ahz2 != this) {
                this.a(afs2, n2, n3 - 1, n4, ahz2);
            }
        }
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        if ((n2 & 8) != 0) {
            return null;
        }
        if (this.J == avk.f) {
            return abv.aw;
        }
        return abv.aq;
    }

    @Override
    public ayn a(afs afs2, int n2, int n3, int n4, ayp ayp2, ayp ayp3) {
        this.a((agc)afs2, n2, n3, n4);
        return super.a(afs2, n2, n3, n4, ayp2, ayp3);
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        if (n3 >= 255) {
            return false;
        }
        return afs.a(afs2, n2, n3 - 1, n4) && super.c(afs2, n2, n3, n4) && super.c(afs2, n2, n3 + 1, n4);
    }

    @Override
    public int h() {
        return 1;
    }

    public int g(agc agc2, int n2, int n3, int n4) {
        int n5;
        int n6;
        boolean bl2;
        int n7 = agc2.e(n2, n3, n4);
        boolean bl3 = bl2 = (n7 & 8) != 0;
        if (bl2) {
            n6 = agc2.e(n2, n3 - 1, n4);
            n5 = n7;
        } else {
            n6 = n7;
            n5 = agc2.e(n2, n3 + 1, n4);
        }
        boolean bl4 = (n5 & 1) != 0;
        return n6 & 7 | (bl2 ? 8 : 0) | (bl4 ? 16 : 0);
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return this.J == avk.f ? abv.aw : abv.aq;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, xq xq2) {
        if (xq2.bE.d && (n5 & 8) != 0 && afs2.a(n2, n3 - 1, n4) == this) {
            afs2.f(n2, n3 - 1, n4);
        }
    }
}

