/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class mj {
    private final mm a;
    private final List b = new ArrayList();
    private final ou c = new ou();
    private final List d = new ArrayList();
    private final List e = new ArrayList();
    private int f;
    private long g;
    private final int[][] h = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public mj(mm mm2) {
        this.a = mm2;
        this.a(mm2.q().af().o());
    }

    public mm a() {
        return this.a;
    }

    public void b() {
        apf apf2;
        int n2;
        long l2 = this.a.I();
        if (l2 - this.g > 8000L) {
            this.g = l2;
            for (n2 = 0; n2 < this.e.size(); ++n2) {
                mk mk2 = (mk)this.e.get(n2);
                mk2.b();
                mk2.a();
            }
        } else {
            for (n2 = 0; n2 < this.d.size(); ++n2) {
                mk mk3 = (mk)this.d.get(n2);
                mk3.b();
            }
        }
        this.d.clear();
        if (this.b.isEmpty() && !(apf2 = this.a.t).e()) {
            this.a.b.a();
        }
    }

    private mk a(int n2, int n3, boolean bl2) {
        long l2 = (long)n2 + Integer.MAX_VALUE | (long)n3 + Integer.MAX_VALUE << 32;
        mk mk2 = (mk)this.c.a(l2);
        if (mk2 == null && bl2) {
            mk2 = new mk(this, n2, n3);
            this.c.a(l2, mk2);
            this.e.add(mk2);
        }
        return mk2;
    }

    public void a(int n2, int n3, int n4) {
        int n5 = n2 >> 4;
        int n6 = n4 >> 4;
        mk mk2 = this.a(n5, n6, false);
        if (mk2 != null) {
            mk2.a(n2 & 0xF, n3, n4 & 0xF);
        }
    }

    public void a(mp mp2) {
        int n2 = (int)mp2.s >> 4;
        int n3 = (int)mp2.u >> 4;
        mp2.d = mp2.s;
        mp2.e = mp2.u;
        for (int i2 = n2 - this.f; i2 <= n2 + this.f; ++i2) {
            for (int i3 = n3 - this.f; i3 <= n3 + this.f; ++i3) {
                this.a(i2, i3, true).a(mp2);
            }
        }
        this.b.add(mp2);
        this.b(mp2);
    }

    public void b(mp mp2) {
        int n2;
        ArrayList arrayList = new ArrayList(mp2.f);
        int n3 = 0;
        int n4 = this.f;
        int n5 = (int)mp2.s >> 4;
        int n6 = (int)mp2.u >> 4;
        int n7 = 0;
        int n8 = 0;
        afl afl2 = mk.a(this.a(n5, n6, true));
        mp2.f.clear();
        if (arrayList.contains(afl2)) {
            mp2.f.add(afl2);
        }
        for (n2 = 1; n2 <= n4 * 2; ++n2) {
            for (int i2 = 0; i2 < 2; ++i2) {
                int[] nArray = this.h[n3++ % 4];
                for (int i3 = 0; i3 < n2; ++i3) {
                    afl2 = mk.a(this.a(n5 + (n7 += nArray[0]), n6 + (n8 += nArray[1]), true));
                    if (!arrayList.contains(afl2)) continue;
                    mp2.f.add(afl2);
                }
            }
        }
        n3 %= 4;
        for (n2 = 0; n2 < n4 * 2; ++n2) {
            afl2 = mk.a(this.a(n5 + (n7 += this.h[n3][0]), n6 + (n8 += this.h[n3][1]), true));
            if (!arrayList.contains(afl2)) continue;
            mp2.f.add(afl2);
        }
    }

    public void c(mp mp2) {
        int n2 = (int)mp2.d >> 4;
        int n3 = (int)mp2.e >> 4;
        for (int i2 = n2 - this.f; i2 <= n2 + this.f; ++i2) {
            for (int i3 = n3 - this.f; i3 <= n3 + this.f; ++i3) {
                mk mk2 = this.a(i2, i3, false);
                if (mk2 == null) continue;
                mk2.b(mp2);
            }
        }
        this.b.remove(mp2);
    }

    private boolean a(int n2, int n3, int n4, int n5, int n6) {
        int n7 = n2 - n4;
        int n8 = n3 - n5;
        if (n7 < -n6 || n7 > n6) {
            return false;
        }
        return n8 >= -n6 && n8 <= n6;
    }

    public void d(mp mp2) {
        int n2 = (int)mp2.s >> 4;
        int n3 = (int)mp2.u >> 4;
        double d2 = mp2.d - mp2.s;
        double d3 = mp2.e - mp2.u;
        double d4 = d2 * d2 + d3 * d3;
        if (d4 < 64.0) {
            return;
        }
        int n4 = (int)mp2.d >> 4;
        int n5 = (int)mp2.e >> 4;
        int n6 = this.f;
        int n7 = n2 - n4;
        int n8 = n3 - n5;
        if (n7 == 0 && n8 == 0) {
            return;
        }
        for (int i2 = n2 - n6; i2 <= n2 + n6; ++i2) {
            for (int i3 = n3 - n6; i3 <= n3 + n6; ++i3) {
                mk mk2;
                if (!this.a(i2, i3, n4, n5, n6)) {
                    this.a(i2, i3, true).a(mp2);
                }
                if (this.a(i2 - n7, i3 - n8, n2, n3, n6) || (mk2 = this.a(i2 - n7, i3 - n8, false)) == null) continue;
                mk2.b(mp2);
            }
        }
        this.b(mp2);
        mp2.d = mp2.s;
        mp2.e = mp2.u;
    }

    public boolean a(mp mp2, int n2, int n3) {
        mk mk2 = this.a(n2, n3, false);
        return mk2 != null && mk.b(mk2).contains(mp2) && !mp2.f.contains(mk.a(mk2));
    }

    public void a(int n2) {
        if ((n2 = oy.a(n2, 3, 20)) == this.f) {
            return;
        }
        int n3 = n2 - this.f;
        for (mp mp2 : this.b) {
            int n4;
            int n5;
            int n6 = (int)mp2.s >> 4;
            int n7 = (int)mp2.u >> 4;
            if (n3 > 0) {
                for (n5 = n6 - n2; n5 <= n6 + n2; ++n5) {
                    for (n4 = n7 - n2; n4 <= n7 + n2; ++n4) {
                        mk mk2 = this.a(n5, n4, true);
                        if (mk.b(mk2).contains(mp2)) continue;
                        mk2.a(mp2);
                    }
                }
                continue;
            }
            for (n5 = n6 - this.f; n5 <= n6 + this.f; ++n5) {
                for (n4 = n7 - this.f; n4 <= n7 + this.f; ++n4) {
                    if (this.a(n5, n4, n6, n7, n2)) continue;
                    this.a(n5, n4, true).b(mp2);
                }
            }
        }
        this.f = n2;
    }

    public static int b(int n2) {
        return n2 * 16 - 16;
    }

    static /* synthetic */ mm a(mj mj2) {
        return mj2.a;
    }

    static /* synthetic */ ou b(mj mj2) {
        return mj2.c;
    }

    static /* synthetic */ List c(mj mj2) {
        return mj2.e;
    }

    static /* synthetic */ List d(mj mj2) {
        return mj2.d;
    }
}

