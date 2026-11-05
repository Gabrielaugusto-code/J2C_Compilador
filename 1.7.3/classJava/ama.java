/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ama
extends aii
implements aif {
    public static final String[] a = new String[]{"oak", "spruce", "birch", "jungle", "acacia", "roofed_oak"};
    private static final pw[] b = new pw[a.length];

    protected ama() {
        float f2 = 0.4f;
        this.a(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, f2 * 2.0f, 0.5f + f2);
        this.a(aak.c);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        if (afs2.E) {
            return;
        }
        super.a(afs2, n2, n3, n4, random);
        if (afs2.k(n2, n3 + 1, n4) >= 9 && random.nextInt(7) == 0) {
            this.c(afs2, n2, n3, n4, random);
        }
    }

    @Override
    public pw a(int n2, int n3) {
        return b[oy.a(n3 &= 7, 0, 5)];
    }

    public void c(afs afs2, int n2, int n3, int n4, Random random) {
        int n5 = afs2.e(n2, n3, n4);
        if ((n5 & 8) == 0) {
            afs2.a(n2, n3, n4, n5 | 8, 4);
        } else {
            this.d(afs2, n2, n3, n4, random);
        }
    }

    public void d(afs afs2, int n2, int n3, int n4, Random random) {
        int n5 = afs2.e(n2, n3, n4) & 7;
        apt apt2 = random.nextInt(10) == 0 ? new apu(true) : new arh(true);
        int n6 = 0;
        int n7 = 0;
        boolean bl2 = false;
        switch (n5) {
            case 1: {
                block7: for (n6 = 0; n6 >= -1; --n6) {
                    for (n7 = 0; n7 >= -1; --n7) {
                        if (!this.a(afs2, n2 + n6, n3, n4 + n7, 1) || !this.a(afs2, n2 + n6 + 1, n3, n4 + n7, 1) || !this.a(afs2, n2 + n6, n3, n4 + n7 + 1, 1) || !this.a(afs2, n2 + n6 + 1, n3, n4 + n7 + 1, 1)) continue;
                        apt2 = new aqr(false, random.nextBoolean());
                        bl2 = true;
                        break block7;
                    }
                }
                if (bl2) break;
                n7 = 0;
                n6 = 0;
                apt2 = new are(true);
                break;
            }
            case 2: {
                apt2 = new apv(true, false);
                break;
            }
            case 3: {
                block9: for (n6 = 0; n6 >= -1; --n6) {
                    for (n7 = 0; n7 >= -1; --n7) {
                        if (!this.a(afs2, n2 + n6, n3, n4 + n7, 3) || !this.a(afs2, n2 + n6 + 1, n3, n4 + n7, 3) || !this.a(afs2, n2 + n6, n3, n4 + n7 + 1, 3) || !this.a(afs2, n2 + n6 + 1, n3, n4 + n7 + 1, 3)) continue;
                        apt2 = new aqq(true, 10, 20, 3, 3);
                        bl2 = true;
                        break block9;
                    }
                }
                if (bl2) break;
                n7 = 0;
                n6 = 0;
                apt2 = new arh(true, 4 + random.nextInt(7), 3, 3, false);
                break;
            }
            case 4: {
                apt2 = new arb(true);
                break;
            }
            case 5: {
                block11: for (n6 = 0; n6 >= -1; --n6) {
                    for (n7 = 0; n7 >= -1; --n7) {
                        if (!this.a(afs2, n2 + n6, n3, n4 + n7, 5) || !this.a(afs2, n2 + n6 + 1, n3, n4 + n7, 5) || !this.a(afs2, n2 + n6, n3, n4 + n7 + 1, 5) || !this.a(afs2, n2 + n6 + 1, n3, n4 + n7 + 1, 5)) continue;
                        apt2 = new aqz(true);
                        bl2 = true;
                        break block11;
                    }
                }
                if (bl2) break;
                return;
            }
        }
        ahz ahz2 = aie.a;
        if (bl2) {
            afs2.d(n2 + n6, n3, n4 + n7, ahz2, 0, 4);
            afs2.d(n2 + n6 + 1, n3, n4 + n7, ahz2, 0, 4);
            afs2.d(n2 + n6, n3, n4 + n7 + 1, ahz2, 0, 4);
            afs2.d(n2 + n6 + 1, n3, n4 + n7 + 1, ahz2, 0, 4);
        } else {
            afs2.d(n2, n3, n4, ahz2, 0, 4);
        }
        if (!((aqe)apt2).a(afs2, random, n2 + n6, n3, n4 + n7)) {
            if (bl2) {
                afs2.d(n2 + n6, n3, n4 + n7, this, n5, 4);
                afs2.d(n2 + n6 + 1, n3, n4 + n7, this, n5, 4);
                afs2.d(n2 + n6, n3, n4 + n7 + 1, this, n5, 4);
                afs2.d(n2 + n6 + 1, n3, n4 + n7 + 1, this, n5, 4);
            } else {
                afs2.d(n2, n3, n4, this, n5, 4);
            }
        }
    }

    public boolean a(afs afs2, int n2, int n3, int n4, int n5) {
        return afs2.a(n2, n3, n4) == this && (afs2.e(n2, n3, n4) & 7) == n5;
    }

    @Override
    public int a(int n2) {
        return oy.a(n2 & 7, 0, 5);
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        list.add(new abu(abs2, 1, 0));
        list.add(new abu(abs2, 1, 1));
        list.add(new abu(abs2, 1, 2));
        list.add(new abu(abs2, 1, 3));
        list.add(new abu(abs2, 1, 4));
        list.add(new abu(abs2, 1, 5));
    }

    @Override
    public void a(px px2) {
        for (int i2 = 0; i2 < b.length; ++i2) {
            ama.b[i2] = px2.a(this.N() + "_" + a[i2]);
        }
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, boolean bl2) {
        return true;
    }

    @Override
    public boolean a(afs afs2, Random random, int n2, int n3, int n4) {
        return (double)afs2.s.nextFloat() < 0.45;
    }

    @Override
    public void b(afs afs2, Random random, int n2, int n3, int n4) {
        this.c(afs2, n2, n3, n4, random);
    }
}

