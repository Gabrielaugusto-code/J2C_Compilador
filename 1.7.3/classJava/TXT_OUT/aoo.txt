/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aoo {
    private static final Logger t = LogManager.getLogger();
    public static boolean a;
    private aoq[] u = new aoq[16];
    private byte[] v = new byte[256];
    public int[] b = new int[256];
    public boolean[] c = new boolean[256];
    public boolean d;
    public afs e;
    public int[] f;
    public final int g;
    public final int h;
    private boolean w;
    public Map i = new HashMap();
    public List[] j = new List[16];
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public long p;
    public boolean q;
    public int r;
    public long s;
    private int x = 4096;

    public aoo(afs afs2, int n2, int n3) {
        this.e = afs2;
        this.g = n2;
        this.h = n3;
        this.f = new int[256];
        for (int i2 = 0; i2 < this.j.length; ++i2) {
            this.j[i2] = new ArrayList();
        }
        Arrays.fill(this.b, -999);
        Arrays.fill(this.v, (byte)-1);
    }

    public aoo(afs afs2, ahz[] ahzArray, int n2, int n3) {
        this(afs2, n2, n3);
        int n4 = ahzArray.length / 256;
        boolean bl2 = !afs2.t.g;
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                for (int i4 = 0; i4 < n4; ++i4) {
                    ahz ahz2 = ahzArray[i2 << 11 | i3 << 7 | i4];
                    if (ahz2 == null || ahz2.o() == avk.a) continue;
                    int n5 = i4 >> 4;
                    if (this.u[n5] == null) {
                        this.u[n5] = new aoq(n5 << 4, bl2);
                    }
                    this.u[n5].a(i2, i4 & 0xF, i3, ahz2);
                }
            }
        }
    }

    public aoo(afs afs2, ahz[] ahzArray, byte[] byArray, int n2, int n3) {
        this(afs2, n2, n3);
        int n4 = ahzArray.length / 256;
        boolean bl2 = !afs2.t.g;
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                for (int i4 = 0; i4 < n4; ++i4) {
                    int n5 = i2 * n4 * 16 | i3 * n4 | i4;
                    ahz ahz2 = ahzArray[n5];
                    if (ahz2 == null || ahz2 == aie.a) continue;
                    int n6 = i4 >> 4;
                    if (this.u[n6] == null) {
                        this.u[n6] = new aoq(n6 << 4, bl2);
                    }
                    this.u[n6].a(i2, i4 & 0xF, i3, ahz2);
                    this.u[n6].a(i2, i4 & 0xF, i3, byArray[n5]);
                }
            }
        }
    }

    public boolean a(int n2, int n3) {
        return n2 == this.g && n3 == this.h;
    }

    public int b(int n2, int n3) {
        return this.f[n3 << 4 | n2];
    }

    public int h() {
        for (int i2 = this.u.length - 1; i2 >= 0; --i2) {
            if (this.u[i2] == null) continue;
            return this.u[i2].d();
        }
        return 0;
    }

    public aoq[] i() {
        return this.u;
    }

    public void a() {
        int n2 = this.h();
        this.r = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < 16; ++i2) {
            block1: for (int i3 = 0; i3 < 16; ++i3) {
                this.b[i2 + (i3 << 4)] = -999;
                for (int i4 = n2 + 16 - 1; i4 > 0; --i4) {
                    ahz ahz2 = this.a(i2, i4 - 1, i3);
                    if (ahz2.k() == 0) continue;
                    this.f[i3 << 4 | i2] = i4;
                    if (i4 >= this.r) continue block1;
                    this.r = i4;
                    continue block1;
                }
            }
        }
        this.n = true;
    }

    public void b() {
        int n2 = this.h();
        this.r = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                int n3;
                this.b[i2 + (i3 << 4)] = -999;
                for (n3 = n2 + 16 - 1; n3 > 0; --n3) {
                    if (this.b(i2, n3 - 1, i3) == 0) continue;
                    this.f[i3 << 4 | i2] = n3;
                    if (n3 >= this.r) break;
                    this.r = n3;
                    break;
                }
                if (this.e.t.g) continue;
                n3 = 15;
                int n4 = n2 + 16 - 1;
                do {
                    aoq aoq2;
                    int n5;
                    if ((n5 = this.b(i2, n4, i3)) == 0 && n3 != 15) {
                        n5 = 1;
                    }
                    if ((n3 -= n5) <= 0 || (aoq2 = this.u[n4 >> 4]) == null) continue;
                    aoq2.b(i2, n4 & 0xF, i3, n3);
                    this.e.m((this.g << 4) + i2, n4, (this.h << 4) + i3);
                } while (--n4 > 0 && n3 > 0);
            }
        }
        this.n = true;
    }

    private void e(int n2, int n3) {
        this.c[n2 + n3 * 16] = true;
        this.w = true;
    }

    private void c(boolean bl2) {
        this.e.C.a("recheckGaps");
        if (this.e.a(this.g * 16 + 8, 0, this.h * 16 + 8, 16)) {
            for (int i2 = 0; i2 < 16; ++i2) {
                for (int i3 = 0; i3 < 16; ++i3) {
                    if (!this.c[i2 + i3 * 16]) continue;
                    this.c[i2 + i3 * 16] = false;
                    int n2 = this.b(i2, i3);
                    int n3 = this.g * 16 + i2;
                    int n4 = this.h * 16 + i3;
                    int n5 = this.e.g(n3 - 1, n4);
                    int n6 = this.e.g(n3 + 1, n4);
                    int n7 = this.e.g(n3, n4 - 1);
                    int n8 = this.e.g(n3, n4 + 1);
                    if (n6 < n5) {
                        n5 = n6;
                    }
                    if (n7 < n5) {
                        n5 = n7;
                    }
                    if (n8 < n5) {
                        n5 = n8;
                    }
                    this.g(n3, n4, n5);
                    this.g(n3 - 1, n4, n2);
                    this.g(n3 + 1, n4, n2);
                    this.g(n3, n4 - 1, n2);
                    this.g(n3, n4 + 1, n2);
                    if (!bl2) continue;
                    this.e.C.b();
                    return;
                }
            }
            this.w = false;
        }
        this.e.C.b();
    }

    private void g(int n2, int n3, int n4) {
        int n5 = this.e.f(n2, n3);
        if (n5 > n4) {
            this.c(n2, n3, n4, n5 + 1);
        } else if (n5 < n4) {
            this.c(n2, n3, n5, n4 + 1);
        }
    }

    private void c(int n2, int n3, int n4, int n5) {
        if (n5 > n4 && this.e.a(n2, 0, n3, 16)) {
            for (int i2 = n4; i2 < n5; ++i2) {
                this.e.c(age.a, n2, i2, n3);
            }
            this.n = true;
        }
    }

    private void h(int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = n8 = this.f[n4 << 4 | n2] & 0xFF;
        if (n3 > n8) {
            n9 = n3;
        }
        while (n9 > 0 && this.b(n2, n9 - 1, n4) == 0) {
            --n9;
        }
        if (n9 == n8) {
            return;
        }
        this.e.b(n2 + this.g * 16, n4 + this.h * 16, n9, n8);
        this.f[n4 << 4 | n2] = n9;
        int n10 = this.g * 16 + n2;
        int n11 = this.h * 16 + n4;
        if (!this.e.t.g) {
            aoq aoq2;
            if (n9 < n8) {
                for (n7 = n9; n7 < n8; ++n7) {
                    aoq2 = this.u[n7 >> 4];
                    if (aoq2 == null) continue;
                    aoq2.b(n2, n7 & 0xF, n4, 15);
                    this.e.m((this.g << 4) + n2, n7, (this.h << 4) + n4);
                }
            } else {
                for (n7 = n8; n7 < n9; ++n7) {
                    aoq2 = this.u[n7 >> 4];
                    if (aoq2 == null) continue;
                    aoq2.b(n2, n7 & 0xF, n4, 0);
                    this.e.m((this.g << 4) + n2, n7, (this.h << 4) + n4);
                }
            }
            n7 = 15;
            while (n9 > 0 && n7 > 0) {
                aoq aoq3;
                int n12;
                if ((n12 = this.b(n2, --n9, n4)) == 0) {
                    n12 = 1;
                }
                if ((n7 -= n12) < 0) {
                    n7 = 0;
                }
                if ((aoq3 = this.u[n9 >> 4]) == null) continue;
                aoq3.b(n2, n9 & 0xF, n4, n7);
            }
        }
        if ((n6 = (n7 = this.f[n4 << 4 | n2])) < (n5 = n8)) {
            int n13 = n5;
            n5 = n6;
            n6 = n13;
        }
        if (n7 < this.r) {
            this.r = n7;
        }
        if (!this.e.t.g) {
            this.c(n10 - 1, n11, n5, n6);
            this.c(n10 + 1, n11, n5, n6);
            this.c(n10, n11 - 1, n5, n6);
            this.c(n10, n11 + 1, n5, n6);
            this.c(n10, n11, n5, n6);
        }
        this.n = true;
    }

    public int b(int n2, int n3, int n4) {
        return this.a(n2, n3, n4).k();
    }

    public ahz a(int n2, int n3, int n4) {
        aoq aoq2;
        ahz ahz2 = aie.a;
        if (n3 >> 4 < this.u.length && (aoq2 = this.u[n3 >> 4]) != null) {
            try {
                ahz2 = aoq2.a(n2, n3 & 0xF, n4);
            }
            catch (Throwable throwable) {
                b b2 = b.a(throwable, "Getting block");
                k k2 = b2.a("Block being got");
                k2.a("Location", new aop(this, n2, n3, n4));
                throw new s(b2);
            }
        }
        return ahz2;
    }

    public int c(int n2, int n3, int n4) {
        if (n3 >> 4 >= this.u.length) {
            return 0;
        }
        aoq aoq2 = this.u[n3 >> 4];
        if (aoq2 != null) {
            return aoq2.b(n2, n3 & 0xF, n4);
        }
        return 0;
    }

    public boolean a(int n2, int n3, int n4, ahz ahz2, int n5) {
        ani ani2;
        int n6 = n4 << 4 | n2;
        if (n3 >= this.b[n6] - 1) {
            this.b[n6] = -999;
        }
        int n7 = this.f[n6];
        ahz ahz3 = this.a(n2, n3, n4);
        int n8 = this.c(n2, n3, n4);
        if (ahz3 == ahz2 && n8 == n5) {
            return false;
        }
        aoq aoq2 = this.u[n3 >> 4];
        boolean bl2 = false;
        if (aoq2 == null) {
            if (ahz2 == aie.a) {
                return false;
            }
            aoq aoq3 = new aoq(n3 >> 4 << 4, !this.e.t.g);
            this.u[n3 >> 4] = aoq3;
            aoq2 = aoq3;
            bl2 = n3 >= n7;
        }
        int n9 = this.g * 16 + n2;
        int n10 = this.h * 16 + n4;
        if (!this.e.E) {
            ahz3.f(this.e, n9, n3, n10, n8);
        }
        aoq2.a(n2, n3 & 0xF, n4, ahz2);
        if (!this.e.E) {
            ahz3.a(this.e, n9, n3, n10, ahz3, n8);
        } else if (ahz3 instanceof ajn && ahz3 != ahz2) {
            this.e.p(n9, n3, n10);
        }
        if (aoq2.a(n2, n3 & 0xF, n4) != ahz2) {
            return false;
        }
        aoq2.a(n2, n3 & 0xF, n4, n5);
        if (bl2) {
            this.b();
        } else {
            int n11 = ahz2.k();
            int n12 = ahz3.k();
            if (n11 > 0) {
                if (n3 >= n7) {
                    this.h(n2, n3 + 1, n4);
                }
            } else if (n3 == n7 - 1) {
                this.h(n2, n3, n4);
            }
            if (n11 != n12 && (n11 < n12 || this.a(age.a, n2, n3, n4) > 0 || this.a(age.b, n2, n3, n4) > 0)) {
                this.e(n2, n4);
            }
        }
        if (ahz3 instanceof ajn && (ani2 = this.e(n2, n3, n4)) != null) {
            ani2.u();
        }
        if (!this.e.E) {
            ahz2.b(this.e, n9, n3, n10);
        }
        if (ahz2 instanceof ajn) {
            ani ani3 = this.e(n2, n3, n4);
            if (ani3 == null) {
                ani3 = ((ajn)((Object)ahz2)).a(this.e, n5);
                this.e.a(n9, n3, n10, ani3);
            }
            if (ani3 != null) {
                ani3.u();
            }
        }
        this.n = true;
        return true;
    }

    public boolean a(int n2, int n3, int n4, int n5) {
        ani ani2;
        aoq aoq2 = this.u[n3 >> 4];
        if (aoq2 == null) {
            return false;
        }
        int n6 = aoq2.b(n2, n3 & 0xF, n4);
        if (n6 == n5) {
            return false;
        }
        this.n = true;
        aoq2.a(n2, n3 & 0xF, n4, n5);
        if (aoq2.a(n2, n3 & 0xF, n4) instanceof ajn && (ani2 = this.e(n2, n3, n4)) != null) {
            ani2.u();
            ani2.g = n5;
        }
        return true;
    }

    public int a(age age2, int n2, int n3, int n4) {
        aoq aoq2 = this.u[n3 >> 4];
        if (aoq2 == null) {
            if (this.d(n2, n3, n4)) {
                return age2.c;
            }
            return 0;
        }
        if (age2 == age.a) {
            if (this.e.t.g) {
                return 0;
            }
            return aoq2.c(n2, n3 & 0xF, n4);
        }
        if (age2 == age.b) {
            return aoq2.d(n2, n3 & 0xF, n4);
        }
        return age2.c;
    }

    public void a(age age2, int n2, int n3, int n4, int n5) {
        aoq aoq2 = this.u[n3 >> 4];
        if (aoq2 == null) {
            aoq aoq3 = new aoq(n3 >> 4 << 4, !this.e.t.g);
            this.u[n3 >> 4] = aoq3;
            aoq2 = aoq3;
            this.b();
        }
        this.n = true;
        if (age2 == age.a) {
            if (!this.e.t.g) {
                aoq2.b(n2, n3 & 0xF, n4, n5);
            }
        } else if (age2 == age.b) {
            aoq2.c(n2, n3 & 0xF, n4, n5);
        }
    }

    public int b(int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        aoq aoq2 = this.u[n3 >> 4];
        if (aoq2 == null) {
            if (!this.e.t.g && n5 < age.a.c) {
                return age.a.c - n5;
            }
            return 0;
        }
        int n8 = n7 = this.e.t.g ? 0 : aoq2.c(n2, n3 & 0xF, n4);
        if (n7 > 0) {
            a = true;
        }
        if ((n6 = aoq2.d(n2, n3 & 0xF, n4)) > (n7 -= n5)) {
            n7 = n6;
        }
        return n7;
    }

    public void a(qr qr2) {
        int n2;
        this.o = true;
        int n3 = oy.c(qr2.s / 16.0);
        int n4 = oy.c(qr2.u / 16.0);
        if (n3 != this.g || n4 != this.h) {
            t.error("Wrong location! " + qr2);
            Thread.dumpStack();
        }
        if ((n2 = oy.c(qr2.t / 16.0)) < 0) {
            n2 = 0;
        }
        if (n2 >= this.j.length) {
            n2 = this.j.length - 1;
        }
        qr2.ag = true;
        qr2.ah = this.g;
        qr2.ai = n2;
        qr2.aj = this.h;
        this.j[n2].add(qr2);
    }

    public void b(qr qr2) {
        this.a(qr2, qr2.ai);
    }

    public void a(qr qr2, int n2) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 >= this.j.length) {
            n2 = this.j.length - 1;
        }
        this.j[n2].remove(qr2);
    }

    public boolean d(int n2, int n3, int n4) {
        return n3 >= this.f[n4 << 4 | n2];
    }

    public ani e(int n2, int n3, int n4) {
        afk afk2 = new afk(n2, n3, n4);
        ani ani2 = (ani)this.i.get(afk2);
        if (ani2 == null) {
            ahz ahz2 = this.a(n2, n3, n4);
            if (!ahz2.u()) {
                return null;
            }
            ani2 = ((ajn)((Object)ahz2)).a(this.e, this.c(n2, n3, n4));
            this.e.a(this.g * 16 + n2, n3, this.h * 16 + n4, ani2);
        }
        if (ani2 != null && ani2.r()) {
            this.i.remove(afk2);
            return null;
        }
        return ani2;
    }

    public void a(ani ani2) {
        int n2 = ani2.c - this.g * 16;
        int n3 = ani2.d;
        int n4 = ani2.e - this.h * 16;
        this.a(n2, n3, n4, ani2);
        if (this.d) {
            this.e.g.add(ani2);
        }
    }

    public void a(int n2, int n3, int n4, ani ani2) {
        afk afk2 = new afk(n2, n3, n4);
        ani2.a(this.e);
        ani2.c = this.g * 16 + n2;
        ani2.d = n3;
        ani2.e = this.h * 16 + n4;
        if (!(this.a(n2, n3, n4) instanceof ajn)) {
            return;
        }
        if (this.i.containsKey(afk2)) {
            ((ani)this.i.get(afk2)).s();
        }
        ani2.t();
        this.i.put(afk2, ani2);
    }

    public void f(int n2, int n3, int n4) {
        ani ani2;
        afk afk2 = new afk(n2, n3, n4);
        if (this.d && (ani2 = (ani)this.i.remove(afk2)) != null) {
            ani2.s();
        }
    }

    public void c() {
        this.d = true;
        this.e.a(this.i.values());
        for (int i2 = 0; i2 < this.j.length; ++i2) {
            for (qr qr2 : this.j[i2]) {
                qr2.W();
            }
            this.e.a(this.j[i2]);
        }
    }

    public void d() {
        this.d = false;
        for (ani ani2 : this.i.values()) {
            this.e.a(ani2);
        }
        for (int i2 = 0; i2 < this.j.length; ++i2) {
            this.e.b(this.j[i2]);
        }
    }

    public void e() {
        this.n = true;
    }

    public void a(qr qr2, ayk ayk2, List list, ra ra2) {
        int n2 = oy.c((ayk2.b - 2.0) / 16.0);
        int n3 = oy.c((ayk2.e + 2.0) / 16.0);
        n2 = oy.a(n2, 0, this.j.length - 1);
        n3 = oy.a(n3, 0, this.j.length - 1);
        for (int i2 = n2; i2 <= n3; ++i2) {
            List list2 = this.j[i2];
            for (int i3 = 0; i3 < list2.size(); ++i3) {
                qr qr3 = (qr)list2.get(i3);
                if (qr3 == qr2 || !qr3.C.b(ayk2) || ra2 != null && !ra2.a(qr3)) continue;
                list.add(qr3);
                qr[] qrArray = qr3.as();
                if (qrArray == null) continue;
                for (int i4 = 0; i4 < qrArray.length; ++i4) {
                    qr3 = qrArray[i4];
                    if (qr3 == qr2 || !qr3.C.b(ayk2) || ra2 != null && !ra2.a(qr3)) continue;
                    list.add(qr3);
                }
            }
        }
    }

    public void a(Class clazz, ayk ayk2, List list, ra ra2) {
        int n2 = oy.c((ayk2.b - 2.0) / 16.0);
        int n3 = oy.c((ayk2.e + 2.0) / 16.0);
        n2 = oy.a(n2, 0, this.j.length - 1);
        n3 = oy.a(n3, 0, this.j.length - 1);
        for (int i2 = n2; i2 <= n3; ++i2) {
            List list2 = this.j[i2];
            for (int i3 = 0; i3 < list2.size(); ++i3) {
                qr qr2 = (qr)list2.get(i3);
                if (!clazz.isAssignableFrom(qr2.getClass()) || !qr2.C.b(ayk2) || ra2 != null && !ra2.a(qr2)) continue;
                list.add(qr2);
            }
        }
    }

    public boolean a(boolean bl2) {
        if (bl2 ? this.o && this.e.I() != this.p || this.n : this.o && this.e.I() >= this.p + 600L) {
            return true;
        }
        return this.n;
    }

    public Random a(long l2) {
        return new Random(this.e.H() + (long)(this.g * this.g * 4987142) + (long)(this.g * 5947611) + (long)(this.h * this.h) * 4392871L + (long)(this.h * 389711) ^ l2);
    }

    public boolean g() {
        return false;
    }

    public void a(aol aol2, aol aol3, int n2, int n3) {
        if (!this.k && aol2.a(n2 + 1, n3 + 1) && aol2.a(n2, n3 + 1) && aol2.a(n2 + 1, n3)) {
            aol2.a(aol3, n2, n3);
        }
        if (aol2.a(n2 - 1, n3) && !aol2.d((int)(n2 - 1), (int)n3).k && aol2.a(n2 - 1, n3 + 1) && aol2.a(n2, n3 + 1) && aol2.a(n2 - 1, n3 + 1)) {
            aol2.a(aol3, n2 - 1, n3);
        }
        if (aol2.a(n2, n3 - 1) && !aol2.d((int)n2, (int)(n3 - 1)).k && aol2.a(n2 + 1, n3 - 1) && aol2.a(n2 + 1, n3 - 1) && aol2.a(n2 + 1, n3)) {
            aol2.a(aol3, n2, n3 - 1);
        }
        if (aol2.a(n2 - 1, n3 - 1) && !aol2.d((int)(n2 - 1), (int)(n3 - 1)).k && aol2.a(n2, n3 - 1) && aol2.a(n2 - 1, n3)) {
            aol2.a(aol3, n2 - 1, n3 - 1);
        }
    }

    public int d(int n2, int n3) {
        int n4 = n2 | n3 << 4;
        int n5 = this.b[n4];
        if (n5 == -999) {
            int n6 = this.h() + 15;
            n5 = -1;
            while (n6 > 0 && n5 == -1) {
                ahz ahz2 = this.a(n2, n6, n3);
                avk avk2 = ahz2.o();
                if (!avk2.c() && !avk2.d()) {
                    --n6;
                    continue;
                }
                n5 = n6 + 1;
            }
            this.b[n4] = n5;
        }
        return n5;
    }

    public void b(boolean bl2) {
        if (this.w && !this.e.t.g && !bl2) {
            this.c(this.e.E);
        }
        this.m = true;
        if (!this.l && this.k) {
            this.p();
        }
    }

    public boolean k() {
        return this.m && this.k && this.l;
    }

    public afl l() {
        return new afl(this.g, this.h);
    }

    public boolean c(int n2, int n3) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 >= 256) {
            n3 = 255;
        }
        for (int i2 = n2; i2 <= n3; i2 += 16) {
            aoq aoq2 = this.u[i2 >> 4];
            if (aoq2 == null || aoq2.a()) continue;
            return false;
        }
        return true;
    }

    public void a(aoq[] aoqArray) {
        this.u = aoqArray;
    }

    public void a(byte[] byArray, int n2, int n3, boolean bl2) {
        Object object;
        int n4;
        int n5 = 0;
        boolean bl3 = !this.e.t.g;
        for (n4 = 0; n4 < this.u.length; ++n4) {
            if ((n2 & 1 << n4) != 0) {
                if (this.u[n4] == null) {
                    this.u[n4] = new aoq(n4 << 4, bl3);
                }
                object = this.u[n4].g();
                System.arraycopy(byArray, n5, object, 0, ((byte[])object).length);
                n5 += ((byte[])object).length;
                continue;
            }
            if (!bl2 || this.u[n4] == null) continue;
            this.u[n4] = null;
        }
        for (n4 = 0; n4 < this.u.length; ++n4) {
            if ((n2 & 1 << n4) == 0 || this.u[n4] == null) continue;
            object = this.u[n4].j();
            System.arraycopy(byArray, n5, ((aom)object).a, 0, ((aom)object).a.length);
            n5 += ((aom)object).a.length;
        }
        for (n4 = 0; n4 < this.u.length; ++n4) {
            if ((n2 & 1 << n4) == 0 || this.u[n4] == null) continue;
            object = this.u[n4].k();
            System.arraycopy(byArray, n5, ((aom)object).a, 0, ((aom)object).a.length);
            n5 += ((aom)object).a.length;
        }
        if (bl3) {
            for (n4 = 0; n4 < this.u.length; ++n4) {
                if ((n2 & 1 << n4) == 0 || this.u[n4] == null) continue;
                object = this.u[n4].l();
                System.arraycopy(byArray, n5, ((aom)object).a, 0, ((aom)object).a.length);
                n5 += ((aom)object).a.length;
            }
        }
        for (n4 = 0; n4 < this.u.length; ++n4) {
            if ((n3 & 1 << n4) != 0) {
                if (this.u[n4] == null) {
                    n5 += 2048;
                    continue;
                }
                object = this.u[n4].i();
                if (object == null) {
                    object = this.u[n4].m();
                }
                System.arraycopy(byArray, n5, ((aom)object).a, 0, ((aom)object).a.length);
                n5 += ((aom)object).a.length;
                continue;
            }
            if (!bl2 || this.u[n4] == null || this.u[n4].i() == null) continue;
            this.u[n4].h();
        }
        if (bl2) {
            System.arraycopy(byArray, n5, this.v, 0, this.v.length);
            n5 += this.v.length;
        }
        for (n4 = 0; n4 < this.u.length; ++n4) {
            if (this.u[n4] == null || (n2 & 1 << n4) == 0) continue;
            this.u[n4].e();
        }
        this.l = true;
        this.k = true;
        this.a();
        Iterator iterator = this.i.values().iterator();
        while (iterator.hasNext()) {
            object = (ani)iterator.next();
            ((ani)object).u();
        }
    }

    public agl a(int n2, int n3, ags ags2) {
        int n4 = this.v[n3 << 4 | n2] & 0xFF;
        if (n4 == 255) {
            agl agl2 = ags2.a((this.g << 4) + n2, (this.h << 4) + n3);
            n4 = agl2.ay;
            this.v[n3 << 4 | n2] = (byte)(n4 & 0xFF);
        }
        if (agl.d(n4) == null) {
            return agl.p;
        }
        return agl.d(n4);
    }

    public byte[] m() {
        return this.v;
    }

    public void a(byte[] byArray) {
        this.v = byArray;
    }

    public void n() {
        this.x = 0;
    }

    public void o() {
        for (int i2 = 0; i2 < 8; ++i2) {
            if (this.x >= 4096) {
                return;
            }
            int n2 = this.x % 16;
            int n3 = this.x / 16 % 16;
            int n4 = this.x / 256;
            ++this.x;
            int n5 = (this.g << 4) + n3;
            int n6 = (this.h << 4) + n4;
            for (int i3 = 0; i3 < 16; ++i3) {
                int n7 = (n2 << 4) + i3;
                if ((this.u[n2] != null || i3 != 0 && i3 != 15 && n3 != 0 && n3 != 15 && n4 != 0 && n4 != 15) && (this.u[n2] == null || this.u[n2].a(n3, i3, n4).o() != avk.a)) continue;
                if (this.e.a(n5, n7 - 1, n6).m() > 0) {
                    this.e.t(n5, n7 - 1, n6);
                }
                if (this.e.a(n5, n7 + 1, n6).m() > 0) {
                    this.e.t(n5, n7 + 1, n6);
                }
                if (this.e.a(n5 - 1, n7, n6).m() > 0) {
                    this.e.t(n5 - 1, n7, n6);
                }
                if (this.e.a(n5 + 1, n7, n6).m() > 0) {
                    this.e.t(n5 + 1, n7, n6);
                }
                if (this.e.a(n5, n7, n6 - 1).m() > 0) {
                    this.e.t(n5, n7, n6 - 1);
                }
                if (this.e.a(n5, n7, n6 + 1).m() > 0) {
                    this.e.t(n5, n7, n6 + 1);
                }
                this.e.t(n5, n7, n6);
            }
        }
    }

    public void p() {
        this.k = true;
        this.l = true;
        if (!this.e.t.g) {
            if (this.e.b(this.g * 16 - 1, 0, this.h * 16 - 1, this.g * 16 + 1, 63, this.h * 16 + 1)) {
                block0: for (int i2 = 0; i2 < 16; ++i2) {
                    for (int i3 = 0; i3 < 16; ++i3) {
                        if (this.f(i2, i3)) continue;
                        this.l = false;
                        continue block0;
                    }
                }
                if (this.l) {
                    aoo aoo2 = this.e.d(this.g * 16 - 1, this.h * 16);
                    aoo2.a(3);
                    aoo2 = this.e.d(this.g * 16 + 16, this.h * 16);
                    aoo2.a(1);
                    aoo2 = this.e.d(this.g * 16, this.h * 16 - 1);
                    aoo2.a(0);
                    aoo2 = this.e.d(this.g * 16, this.h * 16 + 16);
                    aoo2.a(2);
                }
            } else {
                this.l = false;
            }
        }
    }

    private void a(int n2) {
        block6: {
            block8: {
                block7: {
                    block5: {
                        if (!this.k) {
                            return;
                        }
                        if (n2 != 3) break block5;
                        for (int i2 = 0; i2 < 16; ++i2) {
                            this.f(15, i2);
                        }
                        break block6;
                    }
                    if (n2 != 1) break block7;
                    for (int i3 = 0; i3 < 16; ++i3) {
                        this.f(0, i3);
                    }
                    break block6;
                }
                if (n2 != 0) break block8;
                for (int i4 = 0; i4 < 16; ++i4) {
                    this.f(i4, 15);
                }
                break block6;
            }
            if (n2 != 2) break block6;
            for (int i5 = 0; i5 < 16; ++i5) {
                this.f(i5, 0);
            }
        }
    }

    private boolean f(int n2, int n3) {
        int n4;
        int n5 = this.h();
        boolean bl2 = false;
        boolean bl3 = false;
        for (n4 = n5 + 16 - 1; n4 > 63 || n4 > 0 && !bl3; --n4) {
            int n6 = this.b(n2, n4, n3);
            if (n6 == 255 && n4 < 63) {
                bl3 = true;
            }
            if (!bl2 && n6 > 0) {
                bl2 = true;
                continue;
            }
            if (!bl2 || n6 != 0 || this.e.t(this.g * 16 + n2, n4, this.h * 16 + n3)) continue;
            return false;
        }
        while (n4 > 0) {
            if (this.a(n2, n4, n3).m() > 0) {
                this.e.t(this.g * 16 + n2, n4, this.h * 16 + n3);
            }
            --n4;
        }
        return true;
    }
}

