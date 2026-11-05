/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public abstract class afs
implements agc {
    public boolean d;
    public List e = new ArrayList();
    protected List f = new ArrayList();
    public List g = new ArrayList();
    private List a = new ArrayList();
    private List b = new ArrayList();
    public List h = new ArrayList();
    public List i = new ArrayList();
    private long c = 0xFFFFFFL;
    public int j;
    protected int k = new Random().nextInt();
    protected final int l = 1013904223;
    protected float m;
    protected float n;
    protected float o;
    protected float p;
    public int q;
    public pu r;
    public Random s = new Random();
    public final apf t;
    protected List u = new ArrayList();
    protected aol v;
    protected final axt w;
    protected axj x;
    public boolean y;
    public ayh z;
    public final ut A;
    protected final us B = new us(this);
    public final oz C;
    private final ayq J = new ayq(300, 2000);
    private final Calendar K = Calendar.getInstance();
    protected ayw D = new ayw();
    public boolean E;
    protected Set F = new HashSet();
    private int L = this.s.nextInt(12000);
    protected boolean G = true;
    protected boolean H = true;
    private ArrayList M = new ArrayList();
    private boolean N;
    int[] I = new int[32768];

    @Override
    public agl a(int n2, int n3) {
        if (this.d(n2, 0, n3)) {
            aoo aoo2 = this.d(n2, n3);
            try {
                return aoo2.a(n2 & 0xF, n3 & 0xF, this.t.e);
            }
            catch (Throwable throwable) {
                b b2 = b.a(throwable, "Getting biome");
                k k2 = b2.a("Coordinates of biome request");
                k2.a("Location", new aft(this, n2, n3));
                throw new s(b2);
            }
        }
        return this.t.e.a(n2, n3);
    }

    public ags v() {
        return this.t.e;
    }

    public afs(axt axt2, String string, apf apf2, aga aga2, oz oz2) {
        this.w = axt2;
        this.C = oz2;
        this.x = new axj(aga2, string);
        this.t = apf2;
        this.z = new ayh(axt2);
        ut ut2 = (ut)this.z.a(ut.class, "villages");
        if (ut2 == null) {
            this.A = new ut(this);
            this.z.a("villages", this.A);
        } else {
            this.A = ut2;
            this.A.a(this);
        }
        apf2.a(this);
        this.v = this.j();
        this.B();
        this.a();
    }

    public afs(axt axt2, String string, aga aga2, apf apf2, oz oz2) {
        ut ut2;
        this.w = axt2;
        this.C = oz2;
        this.z = new ayh(axt2);
        this.x = axt2.d();
        this.t = apf2 != null ? apf2 : (this.x != null && this.x.j() != 0 ? apf.a(this.x.j()) : apf.a(0));
        if (this.x == null) {
            this.x = new axj(aga2, string);
        } else {
            this.x.a(string);
        }
        this.t.a(this);
        this.v = this.j();
        if (!this.x.w()) {
            try {
                this.a(aga2);
            }
            catch (Throwable throwable) {
                b b2 = b.a(throwable, "Exception initializing level");
                try {
                    this.a(b2);
                }
                catch (Throwable throwable2) {
                    // empty catch block
                }
                throw new s(b2);
            }
            this.x.d(true);
        }
        if ((ut2 = (ut)this.z.a(ut.class, "villages")) == null) {
            this.A = new ut(this);
            this.z.a("villages", this.A);
        } else {
            this.A = ut2;
            this.A.a(this);
        }
        this.B();
        this.a();
    }

    protected abstract aol j();

    protected void a(aga aga2) {
        this.x.d(true);
    }

    public void f() {
        this.x(8, 64, 8);
    }

    public ahz b(int n2, int n3) {
        int n4 = 63;
        while (!this.c(n2, n4 + 1, n3)) {
            ++n4;
        }
        return this.a(n2, n4, n3);
    }

    @Override
    public ahz a(int n2, int n3, int n4) {
        if (n2 < -30000000 || n4 < -30000000 || n2 >= 30000000 || n4 >= 30000000 || n3 < 0 || n3 >= 256) {
            return aie.a;
        }
        aoo aoo2 = null;
        try {
            aoo2 = this.e(n2 >> 4, n4 >> 4);
            return aoo2.a(n2 & 0xF, n3, n4 & 0xF);
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Exception getting block type in world");
            k k2 = b2.a("Requested block coordinates");
            k2.a("Found chunk", aoo2 == null);
            k2.a("Location", k.a(n2, n3, n4));
            throw new s(b2);
        }
    }

    @Override
    public boolean c(int n2, int n3, int n4) {
        return this.a(n2, n3, n4).o() == avk.a;
    }

    public boolean d(int n2, int n3, int n4) {
        if (n3 < 0 || n3 >= 256) {
            return false;
        }
        return this.c(n2 >> 4, n4 >> 4);
    }

    public boolean a(int n2, int n3, int n4, int n5) {
        return this.b(n2 - n5, n3 - n5, n4 - n5, n2 + n5, n3 + n5, n4 + n5);
    }

    public boolean b(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n6 < 0 || n3 >= 256) {
            return false;
        }
        n4 >>= 4;
        n5 >>= 4;
        n7 >>= 4;
        for (int i2 = n2 >>= 4; i2 <= n5; ++i2) {
            for (int i3 = n4; i3 <= n7; ++i3) {
                if (this.c(i2, i3)) continue;
                return false;
            }
        }
        return true;
    }

    protected boolean c(int n2, int n3) {
        return this.v.a(n2, n3);
    }

    public aoo d(int n2, int n3) {
        return this.e(n2 >> 4, n3 >> 4);
    }

    public aoo e(int n2, int n3) {
        return this.v.d(n2, n3);
    }

    public boolean d(int n2, int n3, int n4, ahz ahz2, int n5, int n6) {
        if (n2 < -30000000 || n4 < -30000000 || n2 >= 30000000 || n4 >= 30000000) {
            return false;
        }
        if (n3 < 0) {
            return false;
        }
        if (n3 >= 256) {
            return false;
        }
        aoo aoo2 = this.e(n2 >> 4, n4 >> 4);
        ahz ahz3 = null;
        if ((n6 & 1) != 0) {
            ahz3 = aoo2.a(n2 & 0xF, n3, n4 & 0xF);
        }
        boolean bl2 = aoo2.a(n2 & 0xF, n3, n4 & 0xF, ahz2, n5);
        this.C.a("checkLight");
        this.t(n2, n3, n4);
        this.C.b();
        if (bl2) {
            if ((n6 & 2) != 0 && (!this.E || (n6 & 4) == 0) && aoo2.k()) {
                this.g(n2, n3, n4);
            }
            if (!this.E && (n6 & 1) != 0) {
                this.c(n2, n3, n4, ahz3);
                if (ahz2.M()) {
                    this.f(n2, n3, n4, ahz2);
                }
            }
        }
        return bl2;
    }

    @Override
    public int e(int n2, int n3, int n4) {
        if (n2 < -30000000 || n4 < -30000000 || n2 >= 30000000 || n4 >= 30000000) {
            return 0;
        }
        if (n3 < 0) {
            return 0;
        }
        if (n3 >= 256) {
            return 0;
        }
        aoo aoo2 = this.e(n2 >> 4, n4 >> 4);
        return aoo2.c(n2 &= 0xF, n3, n4 &= 0xF);
    }

    public boolean a(int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8;
        if (n2 < -30000000 || n4 < -30000000 || n2 >= 30000000 || n4 >= 30000000) {
            return false;
        }
        if (n3 < 0) {
            return false;
        }
        if (n3 >= 256) {
            return false;
        }
        aoo aoo2 = this.e(n2 >> 4, n4 >> 4);
        boolean bl2 = aoo2.a(n8 = n2 & 0xF, n3, n7 = n4 & 0xF, n5);
        if (bl2) {
            ahz ahz2 = aoo2.a(n8, n3, n7);
            if ((n6 & 2) != 0 && (!this.E || (n6 & 4) == 0) && aoo2.k()) {
                this.g(n2, n3, n4);
            }
            if (!this.E && (n6 & 1) != 0) {
                this.c(n2, n3, n4, ahz2);
                if (ahz2.M()) {
                    this.f(n2, n3, n4, ahz2);
                }
            }
        }
        return bl2;
    }

    public boolean f(int n2, int n3, int n4) {
        return this.d(n2, n3, n4, aie.a, 0, 3);
    }

    public boolean a(int n2, int n3, int n4, boolean bl2) {
        ahz ahz2 = this.a(n2, n3, n4);
        if (ahz2.o() == avk.a) {
            return false;
        }
        int n5 = this.e(n2, n3, n4);
        this.c(2001, n2, n3, n4, ahz.b(ahz2) + (n5 << 12));
        if (bl2) {
            ahz2.b(this, n2, n3, n4, n5, 0);
        }
        return this.d(n2, n3, n4, aie.a, 0, 3);
    }

    public boolean b(int n2, int n3, int n4, ahz ahz2) {
        return this.d(n2, n3, n4, ahz2, 0, 3);
    }

    public void g(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            ((afy)this.u.get(i2)).a(n2, n3, n4);
        }
    }

    public void c(int n2, int n3, int n4, ahz ahz2) {
        this.d(n2, n3, n4, ahz2);
    }

    public void b(int n2, int n3, int n4, int n5) {
        int n6;
        if (n4 > n5) {
            n6 = n5;
            n5 = n4;
            n4 = n6;
        }
        if (!this.t.g) {
            for (n6 = n4; n6 <= n5; ++n6) {
                this.c(age.a, n2, n6, n3);
            }
        }
        this.c(n2, n4, n3, n2, n5, n3);
    }

    public void c(int n2, int n3, int n4, int n5, int n6, int n7) {
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            ((afy)this.u.get(i2)).a(n2, n3, n4, n5, n6, n7);
        }
    }

    public void d(int n2, int n3, int n4, ahz ahz2) {
        this.e(n2 - 1, n3, n4, ahz2);
        this.e(n2 + 1, n3, n4, ahz2);
        this.e(n2, n3 - 1, n4, ahz2);
        this.e(n2, n3 + 1, n4, ahz2);
        this.e(n2, n3, n4 - 1, ahz2);
        this.e(n2, n3, n4 + 1, ahz2);
    }

    public void b(int n2, int n3, int n4, ahz ahz2, int n5) {
        if (n5 != 4) {
            this.e(n2 - 1, n3, n4, ahz2);
        }
        if (n5 != 5) {
            this.e(n2 + 1, n3, n4, ahz2);
        }
        if (n5 != 0) {
            this.e(n2, n3 - 1, n4, ahz2);
        }
        if (n5 != 1) {
            this.e(n2, n3 + 1, n4, ahz2);
        }
        if (n5 != 2) {
            this.e(n2, n3, n4 - 1, ahz2);
        }
        if (n5 != 3) {
            this.e(n2, n3, n4 + 1, ahz2);
        }
    }

    public void e(int n2, int n3, int n4, ahz ahz2) {
        if (this.E) {
            return;
        }
        ahz ahz3 = this.a(n2, n3, n4);
        try {
            ahz3.a(this, n2, n3, n4, ahz2);
        }
        catch (Throwable throwable) {
            int n5;
            b b2 = b.a(throwable, "Exception while updating neighbours");
            k k2 = b2.a("Block being updated");
            try {
                n5 = this.e(n2, n3, n4);
            }
            catch (Throwable throwable2) {
                n5 = -1;
            }
            k2.a("Source block type", new afu(this, ahz2));
            k.a(k2, n2, n3, n4, ahz3, n5);
            throw new s(b2);
        }
    }

    public boolean a(int n2, int n3, int n4, ahz ahz2) {
        return false;
    }

    public boolean i(int n2, int n3, int n4) {
        return this.e(n2 >> 4, n4 >> 4).d(n2 & 0xF, n3, n4 & 0xF);
    }

    public int j(int n2, int n3, int n4) {
        if (n3 < 0) {
            return 0;
        }
        if (n3 >= 256) {
            n3 = 255;
        }
        return this.e(n2 >> 4, n4 >> 4).b(n2 & 0xF, n3, n4 & 0xF, 0);
    }

    public int k(int n2, int n3, int n4) {
        return this.b(n2, n3, n4, true);
    }

    public int b(int n2, int n3, int n4, boolean bl2) {
        if (n2 < -30000000 || n4 < -30000000 || n2 >= 30000000 || n4 >= 30000000) {
            return 15;
        }
        if (bl2 && this.a(n2, n3, n4).n()) {
            int n5 = this.b(n2, n3 + 1, n4, false);
            int n6 = this.b(n2 + 1, n3, n4, false);
            int n7 = this.b(n2 - 1, n3, n4, false);
            int n8 = this.b(n2, n3, n4 + 1, false);
            int n9 = this.b(n2, n3, n4 - 1, false);
            if (n6 > n5) {
                n5 = n6;
            }
            if (n7 > n5) {
                n5 = n7;
            }
            if (n8 > n5) {
                n5 = n8;
            }
            if (n9 > n5) {
                n5 = n9;
            }
            return n5;
        }
        if (n3 < 0) {
            return 0;
        }
        if (n3 >= 256) {
            n3 = 255;
        }
        aoo aoo2 = this.e(n2 >> 4, n4 >> 4);
        return aoo2.b(n2 &= 0xF, n3, n4 &= 0xF, this.j);
    }

    public int f(int n2, int n3) {
        if (n2 < -30000000 || n3 < -30000000 || n2 >= 30000000 || n3 >= 30000000) {
            return 64;
        }
        if (!this.c(n2 >> 4, n3 >> 4)) {
            return 0;
        }
        aoo aoo2 = this.e(n2 >> 4, n3 >> 4);
        return aoo2.b(n2 & 0xF, n3 & 0xF);
    }

    public int g(int n2, int n3) {
        if (n2 < -30000000 || n3 < -30000000 || n2 >= 30000000 || n3 >= 30000000) {
            return 64;
        }
        if (!this.c(n2 >> 4, n3 >> 4)) {
            return 0;
        }
        aoo aoo2 = this.e(n2 >> 4, n3 >> 4);
        return aoo2.r;
    }

    public int a(age age2, int n2, int n3, int n4) {
        if (this.t.g && age2 == age.a) {
            return 0;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        if (n3 >= 256) {
            return age2.c;
        }
        if (n2 < -30000000 || n4 < -30000000 || n2 >= 30000000 || n4 >= 30000000) {
            return age2.c;
        }
        int n5 = n2 >> 4;
        int n6 = n4 >> 4;
        if (!this.c(n5, n6)) {
            return age2.c;
        }
        if (this.a(n2, n3, n4).n()) {
            int n7 = this.b(age2, n2, n3 + 1, n4);
            int n8 = this.b(age2, n2 + 1, n3, n4);
            int n9 = this.b(age2, n2 - 1, n3, n4);
            int n10 = this.b(age2, n2, n3, n4 + 1);
            int n11 = this.b(age2, n2, n3, n4 - 1);
            if (n8 > n7) {
                n7 = n8;
            }
            if (n9 > n7) {
                n7 = n9;
            }
            if (n10 > n7) {
                n7 = n10;
            }
            if (n11 > n7) {
                n7 = n11;
            }
            return n7;
        }
        aoo aoo2 = this.e(n5, n6);
        return aoo2.a(age2, n2 & 0xF, n3, n4 & 0xF);
    }

    public int b(age age2, int n2, int n3, int n4) {
        if (n3 < 0) {
            n3 = 0;
        }
        if (n3 >= 256) {
            n3 = 255;
        }
        if (n2 < -30000000 || n4 < -30000000 || n2 >= 30000000 || n4 >= 30000000) {
            return age2.c;
        }
        int n5 = n2 >> 4;
        int n6 = n4 >> 4;
        if (!this.c(n5, n6)) {
            return age2.c;
        }
        aoo aoo2 = this.e(n5, n6);
        return aoo2.a(age2, n2 & 0xF, n3, n4 & 0xF);
    }

    public void b(age age2, int n2, int n3, int n4, int n5) {
        if (n2 < -30000000 || n4 < -30000000 || n2 >= 30000000 || n4 >= 30000000) {
            return;
        }
        if (n3 < 0) {
            return;
        }
        if (n3 >= 256) {
            return;
        }
        if (!this.c(n2 >> 4, n4 >> 4)) {
            return;
        }
        aoo aoo2 = this.e(n2 >> 4, n4 >> 4);
        aoo2.a(age2, n2 & 0xF, n3, n4 & 0xF, n5);
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            ((afy)this.u.get(i2)).b(n2, n3, n4);
        }
    }

    public void m(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            ((afy)this.u.get(i2)).b(n2, n3, n4);
        }
    }

    @Override
    public int c(int n2, int n3, int n4, int n5) {
        int n6 = this.a(age.a, n2, n3, n4);
        int n7 = this.a(age.b, n2, n3, n4);
        if (n7 < n5) {
            n7 = n5;
        }
        return n6 << 20 | n7 << 4;
    }

    public float n(int n2, int n3, int n4) {
        return this.t.h[this.k(n2, n3, n4)];
    }

    public boolean w() {
        return this.j < 4;
    }

    public ayn a(ayp ayp2, ayp ayp3) {
        return this.a(ayp2, ayp3, false, false, false);
    }

    public ayn a(ayp ayp2, ayp ayp3, boolean bl2) {
        return this.a(ayp2, ayp3, bl2, false, false);
    }

    public ayn a(ayp ayp2, ayp ayp3, boolean bl2, boolean bl3, boolean bl4) {
        ayn ayn2;
        if (Double.isNaN(ayp2.c) || Double.isNaN(ayp2.d) || Double.isNaN(ayp2.e)) {
            return null;
        }
        if (Double.isNaN(ayp3.c) || Double.isNaN(ayp3.d) || Double.isNaN(ayp3.e)) {
            return null;
        }
        int n2 = oy.c(ayp3.c);
        int n3 = oy.c(ayp3.d);
        int n4 = oy.c(ayp3.e);
        int n5 = oy.c(ayp2.c);
        int n6 = oy.c(ayp2.d);
        int n7 = oy.c(ayp2.e);
        Object object = this.a(n5, n6, n7);
        int n8 = this.e(n5, n6, n7);
        if ((!bl3 || ((ahz)object).a(this, n5, n6, n7) != null) && ((ahz)object).a(n8, bl2) && (ayn2 = ((ahz)object).a(this, n5, n6, n7, ayp2, ayp3)) != null) {
            return ayn2;
        }
        object = null;
        n8 = 200;
        while (n8-- >= 0) {
            if (Double.isNaN(ayp2.c) || Double.isNaN(ayp2.d) || Double.isNaN(ayp2.e)) {
                return null;
            }
            if (n5 == n2 && n6 == n3 && n7 == n4) {
                return bl4 ? object : null;
            }
            boolean bl5 = true;
            boolean bl6 = true;
            boolean bl7 = true;
            double d2 = 999.0;
            double d3 = 999.0;
            double d4 = 999.0;
            if (n2 > n5) {
                d2 = (double)n5 + 1.0;
            } else if (n2 < n5) {
                d2 = (double)n5 + 0.0;
            } else {
                bl5 = false;
            }
            if (n3 > n6) {
                d3 = (double)n6 + 1.0;
            } else if (n3 < n6) {
                d3 = (double)n6 + 0.0;
            } else {
                bl6 = false;
            }
            if (n4 > n7) {
                d4 = (double)n7 + 1.0;
            } else if (n4 < n7) {
                d4 = (double)n7 + 0.0;
            } else {
                bl7 = false;
            }
            double d5 = 999.0;
            double d6 = 999.0;
            double d7 = 999.0;
            double d8 = ayp3.c - ayp2.c;
            double d9 = ayp3.d - ayp2.d;
            double d10 = ayp3.e - ayp2.e;
            if (bl5) {
                d5 = (d2 - ayp2.c) / d8;
            }
            if (bl6) {
                d6 = (d3 - ayp2.d) / d9;
            }
            if (bl7) {
                d7 = (d4 - ayp2.e) / d10;
            }
            int n9 = 0;
            if (d5 < d6 && d5 < d7) {
                n9 = n2 > n5 ? 4 : 5;
                ayp2.c = d2;
                ayp2.d += d9 * d5;
                ayp2.e += d10 * d5;
            } else if (d6 < d7) {
                n9 = n3 > n6 ? 0 : 1;
                ayp2.c += d8 * d6;
                ayp2.d = d3;
                ayp2.e += d10 * d6;
            } else {
                n9 = n4 > n7 ? 2 : 3;
                ayp2.c += d8 * d7;
                ayp2.d += d9 * d7;
                ayp2.e = d4;
            }
            ayp ayp4 = this.V().a(ayp2.c, ayp2.d, ayp2.e);
            ayp4.c = oy.c(ayp2.c);
            n5 = (int)ayp4.c;
            if (n9 == 5) {
                --n5;
                ayp4.c += 1.0;
            }
            ayp4.d = oy.c(ayp2.d);
            n6 = (int)ayp4.d;
            if (n9 == 1) {
                --n6;
                ayp4.d += 1.0;
            }
            ayp4.e = oy.c(ayp2.e);
            n7 = (int)ayp4.e;
            if (n9 == 3) {
                --n7;
                ayp4.e += 1.0;
            }
            ahz ahz2 = this.a(n5, n6, n7);
            int n10 = this.e(n5, n6, n7);
            if (bl3 && ahz2.a(this, n5, n6, n7) == null) continue;
            if (ahz2.a(n10, bl2)) {
                ayn ayn3 = ahz2.a(this, n5, n6, n7, ayp2, ayp3);
                if (ayn3 == null) continue;
                return ayn3;
            }
            object = new ayn(n5, n6, n7, n9, ayp2, false);
        }
        return bl4 ? object : null;
    }

    public void a(qr qr2, String string, float f2, float f3) {
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            ((afy)this.u.get(i2)).a(string, qr2.s, qr2.t - (double)qr2.L, qr2.u, f2, f3);
        }
    }

    public void a(xq xq2, String string, float f2, float f3) {
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            ((afy)this.u.get(i2)).a(xq2, string, xq2.s, xq2.t - (double)xq2.L, xq2.u, f2, f3);
        }
    }

    public void a(double d2, double d3, double d4, String string, float f2, float f3) {
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            ((afy)this.u.get(i2)).a(string, d2, d3, d4, f2, f3);
        }
    }

    public void a(double d2, double d3, double d4, String string, float f2, float f3, boolean bl2) {
    }

    public void a(String string, int n2, int n3, int n4) {
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            ((afy)this.u.get(i2)).a(string, n2, n3, n4);
        }
    }

    public void a(String string, double d2, double d3, double d4, double d5, double d6, double d7) {
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            ((afy)this.u.get(i2)).a(string, d2, d3, d4, d5, d6, d7);
        }
    }

    public boolean c(qr qr2) {
        this.i.add(qr2);
        return true;
    }

    public boolean d(qr qr2) {
        int n2 = oy.c(qr2.s / 16.0);
        int n3 = oy.c(qr2.u / 16.0);
        boolean bl2 = qr2.n;
        if (qr2 instanceof xq) {
            bl2 = true;
        }
        if (bl2 || this.c(n2, n3)) {
            if (qr2 instanceof xq) {
                xq xq2 = (xq)qr2;
                this.h.add(xq2);
                this.c();
            }
            this.e(n2, n3).a(qr2);
            this.e.add(qr2);
            this.a(qr2);
            return true;
        }
        return false;
    }

    protected void a(qr qr2) {
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            ((afy)this.u.get(i2)).a(qr2);
        }
    }

    protected void b(qr qr2) {
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            ((afy)this.u.get(i2)).b(qr2);
        }
    }

    public void e(qr qr2) {
        if (qr2.l != null) {
            qr2.l.a((qr)null);
        }
        if (qr2.m != null) {
            qr2.a((qr)null);
        }
        qr2.A();
        if (qr2 instanceof xq) {
            this.h.remove(qr2);
            this.c();
        }
    }

    public void f(qr qr2) {
        qr2.A();
        if (qr2 instanceof xq) {
            this.h.remove(qr2);
            this.c();
        }
        int n2 = qr2.ah;
        int n3 = qr2.aj;
        if (qr2.ag && this.c(n2, n3)) {
            this.e(n2, n3).b(qr2);
        }
        this.e.remove(qr2);
        this.b(qr2);
    }

    public void a(afy afy2) {
        this.u.add(afy2);
    }

    public void b(afy afy2) {
        this.u.remove(afy2);
    }

    public List a(qr qr2, ayk ayk2) {
        this.M.clear();
        int n2 = oy.c(ayk2.a);
        int n3 = oy.c(ayk2.d + 1.0);
        int n4 = oy.c(ayk2.b);
        int n5 = oy.c(ayk2.e + 1.0);
        int n6 = oy.c(ayk2.c);
        int n7 = oy.c(ayk2.f + 1.0);
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n6; i3 < n7; ++i3) {
                if (!this.d(i2, 64, i3)) continue;
                for (int i4 = n4 - 1; i4 < n5; ++i4) {
                    ahz ahz2 = i2 < -30000000 || i2 >= 30000000 || i3 < -30000000 || i3 >= 30000000 ? aie.b : this.a(i2, i4, i3);
                    ahz2.a(this, i2, i4, i3, ayk2, this.M, qr2);
                }
            }
        }
        double d2 = 0.25;
        List list = this.b(qr2, ayk2.b(d2, d2, d2));
        for (int i5 = 0; i5 < list.size(); ++i5) {
            ayk ayk3 = ((qr)list.get(i5)).I();
            if (ayk3 != null && ayk3.b(ayk2)) {
                this.M.add(ayk3);
            }
            if ((ayk3 = qr2.h((qr)list.get(i5))) == null || !ayk3.b(ayk2)) continue;
            this.M.add(ayk3);
        }
        return this.M;
    }

    public List a(ayk ayk2) {
        this.M.clear();
        int n2 = oy.c(ayk2.a);
        int n3 = oy.c(ayk2.d + 1.0);
        int n4 = oy.c(ayk2.b);
        int n5 = oy.c(ayk2.e + 1.0);
        int n6 = oy.c(ayk2.c);
        int n7 = oy.c(ayk2.f + 1.0);
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n6; i3 < n7; ++i3) {
                if (!this.d(i2, 64, i3)) continue;
                for (int i4 = n4 - 1; i4 < n5; ++i4) {
                    ahz ahz2 = i2 < -30000000 || i2 >= 30000000 || i3 < -30000000 || i3 >= 30000000 ? aie.h : this.a(i2, i4, i3);
                    ahz2.a(this, i2, i4, i3, ayk2, this.M, null);
                }
            }
        }
        return this.M;
    }

    public int a(float f2) {
        float f3 = this.c(f2);
        float f4 = 1.0f - (oy.b(f3 * (float)Math.PI * 2.0f) * 2.0f + 0.5f);
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        f4 = 1.0f - f4;
        f4 = (float)((double)f4 * (1.0 - (double)(this.j(f2) * 5.0f) / 16.0));
        f4 = (float)((double)f4 * (1.0 - (double)(this.h(f2) * 5.0f) / 16.0));
        f4 = 1.0f - f4;
        return (int)(f4 * 11.0f);
    }

    public float b(float f2) {
        float f3 = this.c(f2);
        float f4 = 1.0f - (oy.b(f3 * (float)Math.PI * 2.0f) * 2.0f + 0.2f);
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        f4 = 1.0f - f4;
        f4 = (float)((double)f4 * (1.0 - (double)(this.j(f2) * 5.0f) / 16.0));
        f4 = (float)((double)f4 * (1.0 - (double)(this.h(f2) * 5.0f) / 16.0));
        return f4 * 0.8f + 0.2f;
    }

    public ayp a(qr qr2, float f2) {
        float f3;
        float f4;
        float f5 = this.c(f2);
        float f6 = oy.b(f5 * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        int n2 = oy.c(qr2.s);
        int n3 = oy.c(qr2.t);
        int n4 = oy.c(qr2.u);
        agl agl2 = this.a(n2, n4);
        float f7 = agl2.a(n2, n3, n4);
        int n5 = agl2.a(f7);
        float f8 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f9 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f10 = (float)(n5 & 0xFF) / 255.0f;
        f8 *= f6;
        f9 *= f6;
        f10 *= f6;
        float f11 = this.j(f2);
        if (f11 > 0.0f) {
            f4 = (f8 * 0.3f + f9 * 0.59f + f10 * 0.11f) * 0.6f;
            f3 = 1.0f - f11 * 0.75f;
            f8 = f8 * f3 + f4 * (1.0f - f3);
            f9 = f9 * f3 + f4 * (1.0f - f3);
            f10 = f10 * f3 + f4 * (1.0f - f3);
        }
        if ((f4 = this.h(f2)) > 0.0f) {
            f3 = (f8 * 0.3f + f9 * 0.59f + f10 * 0.11f) * 0.2f;
            float f12 = 1.0f - f4 * 0.75f;
            f8 = f8 * f12 + f3 * (1.0f - f12);
            f9 = f9 * f12 + f3 * (1.0f - f12);
            f10 = f10 * f12 + f3 * (1.0f - f12);
        }
        if (this.q > 0) {
            f3 = (float)this.q - f2;
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            f8 = f8 * (1.0f - (f3 *= 0.45f)) + 0.8f * f3;
            f9 = f9 * (1.0f - f3) + 0.8f * f3;
            f10 = f10 * (1.0f - f3) + 1.0f * f3;
        }
        return this.V().a(f8, f9, f10);
    }

    public float c(float f2) {
        return this.t.a(this.x.g(), f2);
    }

    public int x() {
        return this.t.a(this.x.g());
    }

    public float y() {
        return apf.a[this.t.a(this.x.g())];
    }

    public float d(float f2) {
        float f3 = this.c(f2);
        return f3 * (float)Math.PI * 2.0f;
    }

    public ayp e(float f2) {
        float f3;
        float f4;
        float f5 = this.c(f2);
        float f6 = oy.b(f5 * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        float f7 = (float)(this.c >> 16 & 0xFFL) / 255.0f;
        float f8 = (float)(this.c >> 8 & 0xFFL) / 255.0f;
        float f9 = (float)(this.c & 0xFFL) / 255.0f;
        float f10 = this.j(f2);
        if (f10 > 0.0f) {
            f4 = (f7 * 0.3f + f8 * 0.59f + f9 * 0.11f) * 0.6f;
            f3 = 1.0f - f10 * 0.95f;
            f7 = f7 * f3 + f4 * (1.0f - f3);
            f8 = f8 * f3 + f4 * (1.0f - f3);
            f9 = f9 * f3 + f4 * (1.0f - f3);
        }
        f7 *= f6 * 0.9f + 0.1f;
        f8 *= f6 * 0.9f + 0.1f;
        f9 *= f6 * 0.85f + 0.15f;
        f4 = this.h(f2);
        if (f4 > 0.0f) {
            f3 = (f7 * 0.3f + f8 * 0.59f + f9 * 0.11f) * 0.2f;
            float f11 = 1.0f - f4 * 0.95f;
            f7 = f7 * f11 + f3 * (1.0f - f11);
            f8 = f8 * f11 + f3 * (1.0f - f11);
            f9 = f9 * f11 + f3 * (1.0f - f11);
        }
        return this.V().a(f7, f8, f9);
    }

    public ayp f(float f2) {
        float f3 = this.c(f2);
        return this.t.b(f3, f2);
    }

    public int h(int n2, int n3) {
        return this.d(n2, n3).d(n2 & 0xF, n3 & 0xF);
    }

    public int i(int n2, int n3) {
        aoo aoo2 = this.d(n2, n3);
        n2 &= 0xF;
        n3 &= 0xF;
        for (int i2 = aoo2.h() + 15; i2 > 0; --i2) {
            ahz ahz2 = aoo2.a(n2, i2, n3);
            if (!ahz2.o().c() || ahz2.o() == avk.j) {
                continue;
            }
            return i2 + 1;
        }
        return -1;
    }

    public float g(float f2) {
        float f3 = this.c(f2);
        float f4 = 1.0f - (oy.b(f3 * (float)Math.PI * 2.0f) * 2.0f + 0.25f);
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        return f4 * f4 * 0.5f;
    }

    public void a(int n2, int n3, int n4, ahz ahz2, int n5) {
    }

    public void a(int n2, int n3, int n4, ahz ahz2, int n5, int n6) {
    }

    public void b(int n2, int n3, int n4, ahz ahz2, int n5, int n6) {
    }

    public void h() {
        int n2;
        int n3;
        Object object;
        int n4;
        this.C.a("entities");
        this.C.a("global");
        for (n4 = 0; n4 < this.i.size(); ++n4) {
            object = (qr)this.i.get(n4);
            try {
                ++((qr)object).aa;
                ((qr)object).h();
            }
            catch (Throwable throwable) {
                b b2 = b.a(throwable, "Ticking entity");
                k k2 = b2.a("Entity being ticked");
                if (object == null) {
                    k2.a("Entity", "~~NULL~~");
                } else {
                    ((qr)object).a(k2);
                }
                throw new s(b2);
            }
            if (!((qr)object).K) continue;
            this.i.remove(n4--);
        }
        this.C.c("remove");
        this.e.removeAll(this.f);
        for (n4 = 0; n4 < this.f.size(); ++n4) {
            object = (qr)this.f.get(n4);
            n3 = ((qr)object).ah;
            n2 = ((qr)object).aj;
            if (!((qr)object).ag || !this.c(n3, n2)) continue;
            this.e(n3, n2).b((qr)object);
        }
        for (n4 = 0; n4 < this.f.size(); ++n4) {
            this.b((qr)this.f.get(n4));
        }
        this.f.clear();
        this.C.c("regular");
        for (n4 = 0; n4 < this.e.size(); ++n4) {
            object = (qr)this.e.get(n4);
            if (((qr)object).m != null) {
                if (!((qr)object).m.K && ((qr)object).m.l == object) continue;
                ((qr)object).m.l = null;
                ((qr)object).m = null;
            }
            this.C.a("tick");
            if (!((qr)object).K) {
                try {
                    this.g((qr)object);
                }
                catch (Throwable throwable) {
                    b b3 = b.a(throwable, "Ticking entity");
                    k k3 = b3.a("Entity being ticked");
                    ((qr)object).a(k3);
                    throw new s(b3);
                }
            }
            this.C.b();
            this.C.a("remove");
            if (((qr)object).K) {
                n3 = ((qr)object).ah;
                n2 = ((qr)object).aj;
                if (((qr)object).ag && this.c(n3, n2)) {
                    this.e(n3, n2).b((qr)object);
                }
                this.e.remove(n4--);
                this.b((qr)object);
            }
            this.C.b();
        }
        this.C.c("blockEntities");
        this.N = true;
        Iterator iterator = this.g.iterator();
        while (iterator.hasNext()) {
            aoo aoo2;
            object = (ani)iterator.next();
            if (!((ani)object).r() && ((ani)object).o() && this.d(((ani)object).c, ((ani)object).d, ((ani)object).e)) {
                try {
                    ((ani)object).h();
                }
                catch (Throwable throwable) {
                    b b4 = b.a(throwable, "Ticking block entity");
                    k k4 = b4.a("Block entity being ticked");
                    ((ani)object).a(k4);
                    throw new s(b4);
                }
            }
            if (!((ani)object).r()) continue;
            iterator.remove();
            if (!this.c(((ani)object).c >> 4, ((ani)object).e >> 4) || (aoo2 = this.e(((ani)object).c >> 4, ((ani)object).e >> 4)) == null) continue;
            aoo2.f(((ani)object).c & 0xF, ((ani)object).d, ((ani)object).e & 0xF);
        }
        this.N = false;
        if (!this.b.isEmpty()) {
            this.g.removeAll(this.b);
            this.b.clear();
        }
        this.C.c("pendingBlockEntities");
        if (!this.a.isEmpty()) {
            for (int i2 = 0; i2 < this.a.size(); ++i2) {
                aoo aoo3;
                ani ani2 = (ani)this.a.get(i2);
                if (ani2.r()) continue;
                if (!this.g.contains(ani2)) {
                    this.g.add(ani2);
                }
                if (this.c(ani2.c >> 4, ani2.e >> 4) && (aoo3 = this.e(ani2.c >> 4, ani2.e >> 4)) != null) {
                    aoo3.a(ani2.c & 0xF, ani2.d, ani2.e & 0xF, ani2);
                }
                this.g(ani2.c, ani2.d, ani2.e);
            }
            this.a.clear();
        }
        this.C.b();
        this.C.b();
    }

    public void a(Collection collection) {
        if (this.N) {
            this.a.addAll(collection);
        } else {
            this.g.addAll(collection);
        }
    }

    public void g(qr qr2) {
        this.a(qr2, true);
    }

    public void a(qr qr2, boolean bl2) {
        int n2 = oy.c(qr2.s);
        int n3 = oy.c(qr2.u);
        int n4 = 32;
        if (bl2 && !this.b(n2 - n4, 0, n3 - n4, n2 + n4, 0, n3 + n4)) {
            return;
        }
        qr2.S = qr2.s;
        qr2.T = qr2.t;
        qr2.U = qr2.u;
        qr2.A = qr2.y;
        qr2.B = qr2.z;
        if (bl2 && qr2.ag) {
            ++qr2.aa;
            if (qr2.m != null) {
                qr2.aa();
            } else {
                qr2.h();
            }
        }
        this.C.a("chunkCheck");
        if (Double.isNaN(qr2.s) || Double.isInfinite(qr2.s)) {
            qr2.s = qr2.S;
        }
        if (Double.isNaN(qr2.t) || Double.isInfinite(qr2.t)) {
            qr2.t = qr2.T;
        }
        if (Double.isNaN(qr2.u) || Double.isInfinite(qr2.u)) {
            qr2.u = qr2.U;
        }
        if (Double.isNaN(qr2.z) || Double.isInfinite(qr2.z)) {
            qr2.z = qr2.B;
        }
        if (Double.isNaN(qr2.y) || Double.isInfinite(qr2.y)) {
            qr2.y = qr2.A;
        }
        int n5 = oy.c(qr2.s / 16.0);
        int n6 = oy.c(qr2.t / 16.0);
        int n7 = oy.c(qr2.u / 16.0);
        if (!qr2.ag || qr2.ah != n5 || qr2.ai != n6 || qr2.aj != n7) {
            if (qr2.ag && this.c(qr2.ah, qr2.aj)) {
                this.e(qr2.ah, qr2.aj).a(qr2, qr2.ai);
            }
            if (this.c(n5, n7)) {
                qr2.ag = true;
                this.e(n5, n7).a(qr2);
            } else {
                qr2.ag = false;
            }
        }
        this.C.b();
        if (bl2 && qr2.ag && qr2.l != null) {
            if (qr2.l.K || qr2.l.m != qr2) {
                qr2.l.m = null;
                qr2.l = null;
            } else {
                this.g(qr2.l);
            }
        }
    }

    public boolean b(ayk ayk2) {
        return this.a(ayk2, (qr)null);
    }

    public boolean a(ayk ayk2, qr qr2) {
        List list = this.b(null, ayk2);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            qr qr3 = (qr)list.get(i2);
            if (qr3.K || !qr3.k || qr3 == qr2) continue;
            return false;
        }
        return true;
    }

    public boolean c(ayk ayk2) {
        int n2 = oy.c(ayk2.a);
        int n3 = oy.c(ayk2.d + 1.0);
        int n4 = oy.c(ayk2.b);
        int n5 = oy.c(ayk2.e + 1.0);
        int n6 = oy.c(ayk2.c);
        int n7 = oy.c(ayk2.f + 1.0);
        if (ayk2.a < 0.0) {
            --n2;
        }
        if (ayk2.b < 0.0) {
            --n4;
        }
        if (ayk2.c < 0.0) {
            --n6;
        }
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n4; i3 < n5; ++i3) {
                for (int i4 = n6; i4 < n7; ++i4) {
                    ahz ahz2 = this.a(i2, i3, i4);
                    if (ahz2.o() == avk.a) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean d(ayk ayk2) {
        int n2 = oy.c(ayk2.a);
        int n3 = oy.c(ayk2.d + 1.0);
        int n4 = oy.c(ayk2.b);
        int n5 = oy.c(ayk2.e + 1.0);
        int n6 = oy.c(ayk2.c);
        int n7 = oy.c(ayk2.f + 1.0);
        if (ayk2.a < 0.0) {
            --n2;
        }
        if (ayk2.b < 0.0) {
            --n4;
        }
        if (ayk2.c < 0.0) {
            --n6;
        }
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n4; i3 < n5; ++i3) {
                for (int i4 = n6; i4 < n7; ++i4) {
                    ahz ahz2 = this.a(i2, i3, i4);
                    if (!ahz2.o().d()) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean e(ayk ayk2) {
        int n2;
        int n3 = oy.c(ayk2.a);
        int n4 = oy.c(ayk2.d + 1.0);
        int n5 = oy.c(ayk2.b);
        int n6 = oy.c(ayk2.e + 1.0);
        int n7 = oy.c(ayk2.c);
        if (this.b(n3, n5, n7, n4, n6, n2 = oy.c(ayk2.f + 1.0))) {
            for (int i2 = n3; i2 < n4; ++i2) {
                for (int i3 = n5; i3 < n6; ++i3) {
                    for (int i4 = n7; i4 < n2; ++i4) {
                        ahz ahz2 = this.a(i2, i3, i4);
                        if (ahz2 != aie.ab && ahz2 != aie.k && ahz2 != aie.l) continue;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean a(ayk ayk2, avk avk2, qr qr2) {
        int n2;
        int n3 = oy.c(ayk2.a);
        int n4 = oy.c(ayk2.d + 1.0);
        int n5 = oy.c(ayk2.b);
        int n6 = oy.c(ayk2.e + 1.0);
        int n7 = oy.c(ayk2.c);
        if (!this.b(n3, n5, n7, n4, n6, n2 = oy.c(ayk2.f + 1.0))) {
            return false;
        }
        boolean bl2 = false;
        ayp ayp2 = this.V().a(0.0, 0.0, 0.0);
        for (int i2 = n3; i2 < n4; ++i2) {
            for (int i3 = n5; i3 < n6; ++i3) {
                for (int i4 = n7; i4 < n2; ++i4) {
                    double d2;
                    ahz ahz2 = this.a(i2, i3, i4);
                    if (ahz2.o() != avk2 || !((double)n6 >= (d2 = (double)((float)(i3 + 1) - akn.b(this.e(i2, i3, i4)))))) continue;
                    bl2 = true;
                    ahz2.a(this, i2, i3, i4, qr2, ayp2);
                }
            }
        }
        if (ayp2.b() > 0.0 && qr2.aB()) {
            ayp2 = ayp2.a();
            double d3 = 0.014;
            qr2.v += ayp2.c * d3;
            qr2.w += ayp2.d * d3;
            qr2.x += ayp2.e * d3;
        }
        return bl2;
    }

    public boolean a(ayk ayk2, avk avk2) {
        int n2 = oy.c(ayk2.a);
        int n3 = oy.c(ayk2.d + 1.0);
        int n4 = oy.c(ayk2.b);
        int n5 = oy.c(ayk2.e + 1.0);
        int n6 = oy.c(ayk2.c);
        int n7 = oy.c(ayk2.f + 1.0);
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n4; i3 < n5; ++i3) {
                for (int i4 = n6; i4 < n7; ++i4) {
                    if (this.a(i2, i3, i4).o() != avk2) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b(ayk ayk2, avk avk2) {
        int n2 = oy.c(ayk2.a);
        int n3 = oy.c(ayk2.d + 1.0);
        int n4 = oy.c(ayk2.b);
        int n5 = oy.c(ayk2.e + 1.0);
        int n6 = oy.c(ayk2.c);
        int n7 = oy.c(ayk2.f + 1.0);
        for (int i2 = n2; i2 < n3; ++i2) {
            for (int i3 = n4; i3 < n5; ++i3) {
                for (int i4 = n6; i4 < n7; ++i4) {
                    ahz ahz2 = this.a(i2, i3, i4);
                    if (ahz2.o() != avk2) continue;
                    int n8 = this.e(i2, i3, i4);
                    double d2 = i3 + 1;
                    if (n8 < 8) {
                        d2 = (double)(i3 + 1) - (double)n8 / 8.0;
                    }
                    if (!(d2 >= ayk2.b)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public afn a(qr qr2, double d2, double d3, double d4, float f2, boolean bl2) {
        return this.a(qr2, d2, d3, d4, f2, false, bl2);
    }

    public afn a(qr qr2, double d2, double d3, double d4, float f2, boolean bl2, boolean bl3) {
        afn afn2 = new afn(this, qr2, d2, d3, d4, f2);
        afn2.a = bl2;
        afn2.b = bl3;
        afn2.a();
        afn2.a(true);
        return afn2;
    }

    public float a(ayp ayp2, ayk ayk2) {
        double d2 = 1.0 / ((ayk2.d - ayk2.a) * 2.0 + 1.0);
        double d3 = 1.0 / ((ayk2.e - ayk2.b) * 2.0 + 1.0);
        double d4 = 1.0 / ((ayk2.f - ayk2.c) * 2.0 + 1.0);
        int n2 = 0;
        int n3 = 0;
        float f2 = 0.0f;
        while (f2 <= 1.0f) {
            float f3 = 0.0f;
            while (f3 <= 1.0f) {
                float f4 = 0.0f;
                while (f4 <= 1.0f) {
                    double d5 = ayk2.a + (ayk2.d - ayk2.a) * (double)f2;
                    double d6 = ayk2.b + (ayk2.e - ayk2.b) * (double)f3;
                    double d7 = ayk2.c + (ayk2.f - ayk2.c) * (double)f4;
                    if (this.a(this.V().a(d5, d6, d7), ayp2) == null) {
                        ++n2;
                    }
                    ++n3;
                    f4 = (float)((double)f4 + d4);
                }
                f3 = (float)((double)f3 + d3);
            }
            f2 = (float)((double)f2 + d2);
        }
        return (float)n2 / (float)n3;
    }

    public boolean a(xq xq2, int n2, int n3, int n4, int n5) {
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
        if (this.a(n2, n3, n4) == aie.ab) {
            this.a(xq2, 1004, n2, n3, n4, 0);
            this.f(n2, n3, n4);
            return true;
        }
        return false;
    }

    public String z() {
        return "All: " + this.e.size();
    }

    public String A() {
        return this.v.e();
    }

    @Override
    public ani o(int n2, int n3, int n4) {
        aoo aoo2;
        ani ani2;
        int n5;
        if (n3 < 0 || n3 >= 256) {
            return null;
        }
        ani ani3 = null;
        if (this.N) {
            for (n5 = 0; n5 < this.a.size(); ++n5) {
                ani2 = (ani)this.a.get(n5);
                if (ani2.r() || ani2.c != n2 || ani2.d != n3 || ani2.e != n4) continue;
                ani3 = ani2;
                break;
            }
        }
        if (ani3 == null && (aoo2 = this.e(n2 >> 4, n4 >> 4)) != null) {
            ani3 = aoo2.e(n2 & 0xF, n3, n4 & 0xF);
        }
        if (ani3 == null) {
            for (n5 = 0; n5 < this.a.size(); ++n5) {
                ani2 = (ani)this.a.get(n5);
                if (ani2.r() || ani2.c != n2 || ani2.d != n3 || ani2.e != n4) continue;
                ani3 = ani2;
                break;
            }
        }
        return ani3;
    }

    public void a(int n2, int n3, int n4, ani ani2) {
        if (ani2 != null && !ani2.r()) {
            if (this.N) {
                ani2.c = n2;
                ani2.d = n3;
                ani2.e = n4;
                Iterator iterator = this.a.iterator();
                while (iterator.hasNext()) {
                    ani ani3 = (ani)iterator.next();
                    if (ani3.c != n2 || ani3.d != n3 || ani3.e != n4) continue;
                    ani3.s();
                    iterator.remove();
                }
                this.a.add(ani2);
            } else {
                this.g.add(ani2);
                aoo aoo2 = this.e(n2 >> 4, n4 >> 4);
                if (aoo2 != null) {
                    aoo2.a(n2 & 0xF, n3, n4 & 0xF, ani2);
                }
            }
        }
    }

    public void p(int n2, int n3, int n4) {
        ani ani2 = this.o(n2, n3, n4);
        if (ani2 != null && this.N) {
            ani2.s();
            this.a.remove(ani2);
        } else {
            aoo aoo2;
            if (ani2 != null) {
                this.a.remove(ani2);
                this.g.remove(ani2);
            }
            if ((aoo2 = this.e(n2 >> 4, n4 >> 4)) != null) {
                aoo2.f(n2 & 0xF, n3, n4 & 0xF);
            }
        }
    }

    public void a(ani ani2) {
        this.b.add(ani2);
    }

    public boolean q(int n2, int n3, int n4) {
        ayk ayk2 = this.a(n2, n3, n4).a(this, n2, n3, n4);
        return ayk2 != null && ayk2.b() >= 1.0;
    }

    public static boolean a(agc agc2, int n2, int n3, int n4) {
        ahz ahz2 = agc2.a(n2, n3, n4);
        int n5 = agc2.e(n2, n3, n4);
        if (ahz2.o().k() && ahz2.d()) {
            return true;
        }
        if (ahz2 instanceof amj) {
            return (n5 & 4) == 4;
        }
        if (ahz2 instanceof aka) {
            return (n5 & 8) == 8;
        }
        if (ahz2 instanceof ake) {
            return true;
        }
        if (ahz2 instanceof ame) {
            return (n5 & 7) == 7;
        }
        return false;
    }

    public boolean c(int n2, int n3, int n4, boolean bl2) {
        if (n2 < -30000000 || n4 < -30000000 || n2 >= 30000000 || n4 >= 30000000) {
            return bl2;
        }
        aoo aoo2 = this.v.d(n2 >> 4, n4 >> 4);
        if (aoo2 == null || aoo2.g()) {
            return bl2;
        }
        ahz ahz2 = this.a(n2, n3, n4);
        return ahz2.o().k() && ahz2.d();
    }

    public void B() {
        int n2 = this.a(1.0f);
        if (n2 != this.j) {
            this.j = n2;
        }
    }

    public void a(boolean bl2, boolean bl3) {
        this.G = bl2;
        this.H = bl3;
    }

    public void b() {
        this.o();
    }

    private void a() {
        if (this.x.p()) {
            this.n = 1.0f;
            if (this.x.n()) {
                this.p = 1.0f;
            }
        }
    }

    protected void o() {
        if (this.t.g) {
            return;
        }
        if (this.E) {
            return;
        }
        int n2 = this.x.o();
        if (n2 <= 0) {
            if (this.x.n()) {
                this.x.f(this.s.nextInt(12000) + 3600);
            } else {
                this.x.f(this.s.nextInt(168000) + 12000);
            }
        } else {
            this.x.f(--n2);
            if (n2 <= 0) {
                this.x.a(!this.x.n());
            }
        }
        this.o = this.p;
        this.p = this.x.n() ? (float)((double)this.p + 0.01) : (float)((double)this.p - 0.01);
        this.p = oy.a(this.p, 0.0f, 1.0f);
        int n3 = this.x.q();
        if (n3 <= 0) {
            if (this.x.p()) {
                this.x.g(this.s.nextInt(12000) + 12000);
            } else {
                this.x.g(this.s.nextInt(168000) + 12000);
            }
        } else {
            this.x.g(--n3);
            if (n3 <= 0) {
                this.x.b(!this.x.p());
            }
        }
        this.m = this.n;
        this.n = this.x.p() ? (float)((double)this.n + 0.01) : (float)((double)this.n - 0.01);
        this.n = oy.a(this.n, 0.0f, 1.0f);
    }

    protected void C() {
        int n2;
        int n3;
        int n4;
        xq xq2;
        int n5;
        this.F.clear();
        this.C.a("buildList");
        for (n5 = 0; n5 < this.h.size(); ++n5) {
            xq2 = (xq)this.h.get(n5);
            n4 = oy.c(xq2.s / 16.0);
            n3 = oy.c(xq2.u / 16.0);
            n2 = this.p();
            for (int i2 = -n2; i2 <= n2; ++i2) {
                for (int i3 = -n2; i3 <= n2; ++i3) {
                    this.F.add(new afl(i2 + n4, i3 + n3));
                }
            }
        }
        this.C.b();
        if (this.L > 0) {
            --this.L;
        }
        this.C.a("playerCheckLight");
        if (!this.h.isEmpty()) {
            n5 = this.s.nextInt(this.h.size());
            xq2 = (xq)this.h.get(n5);
            n4 = oy.c(xq2.s) + this.s.nextInt(11) - 5;
            n3 = oy.c(xq2.t) + this.s.nextInt(11) - 5;
            n2 = oy.c(xq2.u) + this.s.nextInt(11) - 5;
            this.t(n4, n3, n2);
        }
        this.C.b();
    }

    protected abstract int p();

    protected void a(int n2, int n3, aoo aoo2) {
        this.C.c("moodSound");
        if (this.L == 0 && !this.E) {
            xq xq2;
            this.k = this.k * 3 + 1013904223;
            int n4 = this.k >> 2;
            int n5 = n4 & 0xF;
            int n6 = n4 >> 8 & 0xF;
            int n7 = n4 >> 16 & 0xFF;
            ahz ahz2 = aoo2.a(n5, n7, n6);
            if (ahz2.o() == avk.a && this.j(n5 += n2, n7, n6 += n3) <= this.s.nextInt(8) && this.b(age.a, n5, n7, n6) <= 0 && (xq2 = this.a((double)n5 + 0.5, (double)n7 + 0.5, (double)n6 + 0.5, 8.0)) != null && xq2.e((double)n5 + 0.5, (double)n7 + 0.5, (double)n6 + 0.5) > 4.0) {
                this.a((double)n5 + 0.5, (double)n7 + 0.5, (double)n6 + 0.5, "ambient.cave.cave", 0.7f, 0.8f + this.s.nextFloat() * 0.2f);
                this.L = this.s.nextInt(12000) + 6000;
            }
        }
        this.C.c("checkLight");
        aoo2.o();
    }

    protected void g() {
        this.C();
    }

    public boolean r(int n2, int n3, int n4) {
        return this.d(n2, n3, n4, false);
    }

    public boolean s(int n2, int n3, int n4) {
        return this.d(n2, n3, n4, true);
    }

    public boolean d(int n2, int n3, int n4, boolean bl2) {
        ahz ahz2;
        agl agl2 = this.a(n2, n4);
        float f2 = agl2.a(n2, n3, n4);
        if (f2 > 0.15f) {
            return false;
        }
        if (n3 >= 0 && n3 < 256 && this.b(age.b, n2, n3, n4) < 10 && ((ahz2 = this.a(n2, n3, n4)) == aie.j || ahz2 == aie.i) && this.e(n2, n3, n4) == 0) {
            if (!bl2) {
                return true;
            }
            boolean bl3 = true;
            if (bl3 && this.a(n2 - 1, n3, n4).o() != avk.h) {
                bl3 = false;
            }
            if (bl3 && this.a(n2 + 1, n3, n4).o() != avk.h) {
                bl3 = false;
            }
            if (bl3 && this.a(n2, n3, n4 - 1).o() != avk.h) {
                bl3 = false;
            }
            if (bl3 && this.a(n2, n3, n4 + 1).o() != avk.h) {
                bl3 = false;
            }
            if (!bl3) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int n2, int n3, int n4, boolean bl2) {
        ahz ahz2;
        agl agl2 = this.a(n2, n4);
        float f2 = agl2.a(n2, n3, n4);
        if (f2 > 0.15f) {
            return false;
        }
        if (!bl2) {
            return true;
        }
        return n3 >= 0 && n3 < 256 && this.b(age.b, n2, n3, n4) < 10 && (ahz2 = this.a(n2, n3, n4)).o() == avk.a && aie.aC.c(this, n2, n3, n4);
    }

    public boolean t(int n2, int n3, int n4) {
        boolean bl2 = false;
        if (!this.t.g) {
            bl2 |= this.c(age.a, n2, n3, n4);
        }
        return bl2 |= this.c(age.b, n2, n3, n4);
    }

    private int a(int n2, int n3, int n4, age age2) {
        if (age2 == age.a && this.i(n2, n3, n4)) {
            return 15;
        }
        ahz ahz2 = this.a(n2, n3, n4);
        int n5 = age2 == age.a ? 0 : ahz2.m();
        int n6 = ahz2.k();
        if (n6 >= 15 && ahz2.m() > 0) {
            n6 = 1;
        }
        if (n6 < 1) {
            n6 = 1;
        }
        if (n6 >= 15) {
            return 0;
        }
        if (n5 >= 14) {
            return n5;
        }
        for (int i2 = 0; i2 < 6; ++i2) {
            int n7 = n2 + q.b[i2];
            int n8 = n3 + q.c[i2];
            int n9 = n4 + q.d[i2];
            int n10 = this.b(age2, n7, n8, n9) - n6;
            if (n10 > n5) {
                n5 = n10;
            }
            if (n5 < 14) continue;
            return n5;
        }
        return n5;
    }

    public boolean c(age age2, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        if (!this.a(n2, n3, n4, 17)) {
            return false;
        }
        int n15 = 0;
        int n16 = 0;
        this.C.a("getBrightness");
        int n17 = this.b(age2, n2, n3, n4);
        int n18 = this.a(n2, n3, n4, age2);
        if (n18 > n17) {
            this.I[n16++] = 133152;
        } else if (n18 < n17) {
            this.I[n16++] = 0x20820 | n17 << 18;
            while (n15 < n16) {
                n14 = this.I[n15++];
                n13 = (n14 & 0x3F) - 32 + n2;
                n12 = (n14 >> 6 & 0x3F) - 32 + n3;
                n11 = (n14 >> 12 & 0x3F) - 32 + n4;
                n10 = n14 >> 18 & 0xF;
                n9 = this.b(age2, n13, n12, n11);
                if (n9 != n10) continue;
                this.b(age2, n13, n12, n11, 0);
                if (n10 <= 0 || (n8 = oy.a(n13 - n2)) + (n7 = oy.a(n12 - n3)) + (n6 = oy.a(n11 - n4)) >= 17) continue;
                for (n5 = 0; n5 < 6; ++n5) {
                    int n19 = n13 + q.b[n5];
                    int n20 = n12 + q.c[n5];
                    int n21 = n11 + q.d[n5];
                    int n22 = Math.max(1, this.a(n19, n20, n21).k());
                    n9 = this.b(age2, n19, n20, n21);
                    if (n9 != n10 - n22 || n16 >= this.I.length) continue;
                    this.I[n16++] = n19 - n2 + 32 | n20 - n3 + 32 << 6 | n21 - n4 + 32 << 12 | n10 - n22 << 18;
                }
            }
            n15 = 0;
        }
        this.C.b();
        this.C.a("checkedPosition < toCheckCount");
        while (n15 < n16) {
            n14 = this.I[n15++];
            n13 = (n14 & 0x3F) - 32 + n2;
            n12 = (n14 >> 6 & 0x3F) - 32 + n3;
            n11 = (n14 >> 12 & 0x3F) - 32 + n4;
            n10 = this.b(age2, n13, n12, n11);
            n9 = this.a(n13, n12, n11, age2);
            if (n9 == n10) continue;
            this.b(age2, n13, n12, n11, n9);
            if (n9 <= n10) continue;
            n8 = Math.abs(n13 - n2);
            n7 = Math.abs(n12 - n3);
            n6 = Math.abs(n11 - n4);
            int n23 = n5 = n16 < this.I.length - 6 ? 1 : 0;
            if (n8 + n7 + n6 >= 17 || n5 == 0) continue;
            if (this.b(age2, n13 - 1, n12, n11) < n9) {
                this.I[n16++] = n13 - 1 - n2 + 32 + (n12 - n3 + 32 << 6) + (n11 - n4 + 32 << 12);
            }
            if (this.b(age2, n13 + 1, n12, n11) < n9) {
                this.I[n16++] = n13 + 1 - n2 + 32 + (n12 - n3 + 32 << 6) + (n11 - n4 + 32 << 12);
            }
            if (this.b(age2, n13, n12 - 1, n11) < n9) {
                this.I[n16++] = n13 - n2 + 32 + (n12 - 1 - n3 + 32 << 6) + (n11 - n4 + 32 << 12);
            }
            if (this.b(age2, n13, n12 + 1, n11) < n9) {
                this.I[n16++] = n13 - n2 + 32 + (n12 + 1 - n3 + 32 << 6) + (n11 - n4 + 32 << 12);
            }
            if (this.b(age2, n13, n12, n11 - 1) < n9) {
                this.I[n16++] = n13 - n2 + 32 + (n12 - n3 + 32 << 6) + (n11 - 1 - n4 + 32 << 12);
            }
            if (this.b(age2, n13, n12, n11 + 1) >= n9) continue;
            this.I[n16++] = n13 - n2 + 32 + (n12 - n3 + 32 << 6) + (n11 + 1 - n4 + 32 << 12);
        }
        this.C.b();
        return true;
    }

    public boolean a(boolean bl2) {
        return false;
    }

    public List a(aoo aoo2, boolean bl2) {
        return null;
    }

    public List b(qr qr2, ayk ayk2) {
        return this.a(qr2, ayk2, null);
    }

    public List a(qr qr2, ayk ayk2, ra ra2) {
        ArrayList arrayList = new ArrayList();
        int n2 = oy.c((ayk2.a - 2.0) / 16.0);
        int n3 = oy.c((ayk2.d + 2.0) / 16.0);
        int n4 = oy.c((ayk2.c - 2.0) / 16.0);
        int n5 = oy.c((ayk2.f + 2.0) / 16.0);
        for (int i2 = n2; i2 <= n3; ++i2) {
            for (int i3 = n4; i3 <= n5; ++i3) {
                if (!this.c(i2, i3)) continue;
                this.e(i2, i3).a(qr2, ayk2, arrayList, ra2);
            }
        }
        return arrayList;
    }

    public List a(Class clazz, ayk ayk2) {
        return this.a(clazz, ayk2, (ra)null);
    }

    public List a(Class clazz, ayk ayk2, ra ra2) {
        int n2 = oy.c((ayk2.a - 2.0) / 16.0);
        int n3 = oy.c((ayk2.d + 2.0) / 16.0);
        int n4 = oy.c((ayk2.c - 2.0) / 16.0);
        int n5 = oy.c((ayk2.f + 2.0) / 16.0);
        ArrayList arrayList = new ArrayList();
        for (int i2 = n2; i2 <= n3; ++i2) {
            for (int i3 = n4; i3 <= n5; ++i3) {
                if (!this.c(i2, i3)) continue;
                this.e(i2, i3).a(clazz, ayk2, arrayList, ra2);
            }
        }
        return arrayList;
    }

    public qr a(Class clazz, ayk ayk2, qr qr2) {
        List list = this.a(clazz, ayk2);
        qr qr3 = null;
        double d2 = Double.MAX_VALUE;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            double d3;
            qr qr4 = (qr)list.get(i2);
            if (qr4 == qr2 || (d3 = qr2.f(qr4)) > d2) continue;
            qr3 = qr4;
            d2 = d3;
        }
        return qr3;
    }

    public abstract qr a(int var1);

    public List D() {
        return this.e;
    }

    public void b(int n2, int n3, int n4, ani ani2) {
        if (this.d(n2, n3, n4)) {
            this.d(n2, n4).e();
        }
    }

    public int a(Class clazz) {
        int n2 = 0;
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            qr qr2 = (qr)this.e.get(i2);
            if (qr2 instanceof rn && ((rn)qr2).bK() || !clazz.isAssignableFrom(qr2.getClass())) continue;
            ++n2;
        }
        return n2;
    }

    public void a(List list) {
        this.e.addAll(list);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            this.a((qr)list.get(i2));
        }
    }

    public void b(List list) {
        this.f.addAll(list);
    }

    public boolean a(ahz ahz2, int n2, int n3, int n4, boolean bl2, int n5, qr qr2, abu abu2) {
        ayk ayk2;
        ahz ahz3 = this.a(n2, n3, n4);
        ayk ayk3 = ayk2 = bl2 ? null : ahz2.a(this, n2, n3, n4);
        if (ayk2 != null && !this.a(ayk2, qr2)) {
            return false;
        }
        if (ahz3.o() == avk.q && ahz2 == aie.bQ) {
            return true;
        }
        return ahz3.o().j() && ahz2.a(this, n2, n3, n4, n5, abu2);
    }

    public aww a(qr qr2, qr qr3, float f2, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.C.a("pathfind");
        int n2 = oy.c(qr2.s);
        int n3 = oy.c(qr2.t + 1.0);
        int n4 = oy.c(qr2.u);
        int n5 = (int)(f2 + 16.0f);
        int n6 = n2 - n5;
        int n7 = n3 - n5;
        int n8 = n4 - n5;
        int n9 = n2 + n5;
        int n10 = n3 + n5;
        int n11 = n4 + n5;
        agi agi2 = new agi(this, n6, n7, n8, n9, n10, n11, 0);
        aww aww2 = new awx(agi2, bl2, bl3, bl4, bl5).a(qr2, qr3, f2);
        this.C.b();
        return aww2;
    }

    public aww a(qr qr2, int n2, int n3, int n4, float f2, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.C.a("pathfind");
        int n5 = oy.c(qr2.s);
        int n6 = oy.c(qr2.t);
        int n7 = oy.c(qr2.u);
        int n8 = (int)(f2 + 8.0f);
        int n9 = n5 - n8;
        int n10 = n6 - n8;
        int n11 = n7 - n8;
        int n12 = n5 + n8;
        int n13 = n6 + n8;
        int n14 = n7 + n8;
        agi agi2 = new agi(this, n9, n10, n11, n12, n13, n14, 0);
        aww aww2 = new awx(agi2, bl2, bl3, bl4, bl5).a(qr2, n2, n3, n4, f2);
        this.C.b();
        return aww2;
    }

    @Override
    public int e(int n2, int n3, int n4, int n5) {
        return this.a(n2, n3, n4).c((agc)this, n2, n3, n4, n5);
    }

    public int u(int n2, int n3, int n4) {
        int n5 = 0;
        if ((n5 = Math.max(n5, this.e(n2, n3 - 1, n4, 0))) >= 15) {
            return n5;
        }
        if ((n5 = Math.max(n5, this.e(n2, n3 + 1, n4, 1))) >= 15) {
            return n5;
        }
        if ((n5 = Math.max(n5, this.e(n2, n3, n4 - 1, 2))) >= 15) {
            return n5;
        }
        if ((n5 = Math.max(n5, this.e(n2, n3, n4 + 1, 3))) >= 15) {
            return n5;
        }
        if ((n5 = Math.max(n5, this.e(n2 - 1, n3, n4, 4))) >= 15) {
            return n5;
        }
        if ((n5 = Math.max(n5, this.e(n2 + 1, n3, n4, 5))) >= 15) {
            return n5;
        }
        return n5;
    }

    public boolean f(int n2, int n3, int n4, int n5) {
        return this.g(n2, n3, n4, n5) > 0;
    }

    public int g(int n2, int n3, int n4, int n5) {
        if (this.a(n2, n3, n4).r()) {
            return this.u(n2, n3, n4);
        }
        return this.a(n2, n3, n4).b((agc)this, n2, n3, n4, n5);
    }

    public boolean v(int n2, int n3, int n4) {
        if (this.g(n2, n3 - 1, n4, 0) > 0) {
            return true;
        }
        if (this.g(n2, n3 + 1, n4, 1) > 0) {
            return true;
        }
        if (this.g(n2, n3, n4 - 1, 2) > 0) {
            return true;
        }
        if (this.g(n2, n3, n4 + 1, 3) > 0) {
            return true;
        }
        if (this.g(n2 - 1, n3, n4, 4) > 0) {
            return true;
        }
        return this.g(n2 + 1, n3, n4, 5) > 0;
    }

    public int w(int n2, int n3, int n4) {
        int n5 = 0;
        for (int i2 = 0; i2 < 6; ++i2) {
            int n6 = this.g(n2 + q.b[i2], n3 + q.c[i2], n4 + q.d[i2], i2);
            if (n6 >= 15) {
                return 15;
            }
            if (n6 <= n5) continue;
            n5 = n6;
        }
        return n5;
    }

    public xq a(qr qr2, double d2) {
        return this.a(qr2.s, qr2.t, qr2.u, d2);
    }

    public xq a(double d2, double d3, double d4, double d5) {
        double d6 = -1.0;
        xq xq2 = null;
        for (int i2 = 0; i2 < this.h.size(); ++i2) {
            xq xq3 = (xq)this.h.get(i2);
            double d7 = xq3.e(d2, d3, d4);
            if (!(d5 < 0.0) && !(d7 < d5 * d5) || d6 != -1.0 && !(d7 < d6)) continue;
            d6 = d7;
            xq2 = xq3;
        }
        return xq2;
    }

    public xq b(qr qr2, double d2) {
        return this.b(qr2.s, qr2.t, qr2.u, d2);
    }

    public xq b(double d2, double d3, double d4, double d5) {
        double d6 = -1.0;
        xq xq2 = null;
        for (int i2 = 0; i2 < this.h.size(); ++i2) {
            xq xq3 = (xq)this.h.get(i2);
            if (xq3.bE.a || !xq3.Y()) continue;
            double d7 = xq3.e(d2, d3, d4);
            double d8 = d5;
            if (xq3.am()) {
                d8 *= (double)0.8f;
            }
            if (xq3.ao()) {
                float f2 = xq3.bD();
                if (f2 < 0.1f) {
                    f2 = 0.1f;
                }
                d8 *= (double)(0.7f * f2);
            }
            if (!(d5 < 0.0) && !(d7 < d8 * d8) || d6 != -1.0 && !(d7 < d6)) continue;
            d6 = d7;
            xq2 = xq3;
        }
        return xq2;
    }

    public xq a(String string) {
        for (int i2 = 0; i2 < this.h.size(); ++i2) {
            if (!string.equals(((xq)this.h.get(i2)).b_())) continue;
            return (xq)this.h.get(i2);
        }
        return null;
    }

    public void F() {
    }

    public void G() {
        this.w.c();
    }

    public void a(long l2) {
        this.x.b(l2);
    }

    public long H() {
        return this.x.b();
    }

    public long I() {
        return this.x.f();
    }

    public long J() {
        return this.x.g();
    }

    public void b(long l2) {
        this.x.c(l2);
    }

    public r K() {
        return new r(this.x.c(), this.x.d(), this.x.e());
    }

    public void x(int n2, int n3, int n4) {
        this.x.a(n2, n3, n4);
    }

    public void h(qr qr2) {
        int n2 = oy.c(qr2.s / 16.0);
        int n3 = oy.c(qr2.u / 16.0);
        int n4 = 2;
        for (int i2 = n2 - n4; i2 <= n2 + n4; ++i2) {
            for (int i3 = n3 - n4; i3 <= n3 + n4; ++i3) {
                this.e(i2, i3);
            }
        }
        if (!this.e.contains(qr2)) {
            this.e.add(qr2);
        }
    }

    public boolean a(xq xq2, int n2, int n3, int n4) {
        return true;
    }

    public void a(qr qr2, byte by2) {
    }

    public aol L() {
        return this.v;
    }

    public void c(int n2, int n3, int n4, ahz ahz2, int n5, int n6) {
        ahz2.a(this, n2, n3, n4, n5, n6);
    }

    public axt M() {
        return this.w;
    }

    public axj N() {
        return this.x;
    }

    public afp O() {
        return this.x.x();
    }

    public void c() {
    }

    public float h(float f2) {
        return (this.o + (this.p - this.o) * f2) * this.j(f2);
    }

    public void i(float f2) {
        this.o = f2;
        this.p = f2;
    }

    public float j(float f2) {
        return this.m + (this.n - this.m) * f2;
    }

    public void k(float f2) {
        this.m = f2;
        this.n = f2;
    }

    public boolean P() {
        return (double)this.h(1.0f) > 0.9;
    }

    public boolean Q() {
        return (double)this.j(1.0f) > 0.2;
    }

    public boolean y(int n2, int n3, int n4) {
        if (!this.Q()) {
            return false;
        }
        if (!this.i(n2, n3, n4)) {
            return false;
        }
        if (this.h(n2, n4) > n3) {
            return false;
        }
        agl agl2 = this.a(n2, n4);
        if (agl2.d()) {
            return false;
        }
        if (this.e(n2, n3, n4, false)) {
            return false;
        }
        return agl2.e();
    }

    public boolean z(int n2, int n3, int n4) {
        agl agl2 = this.a(n2, n4);
        return agl2.f();
    }

    public void a(String string, axc axc2) {
        this.z.a(string, axc2);
    }

    public axc a(Class clazz, String string) {
        return this.z.a(clazz, string);
    }

    public int b(String string) {
        return this.z.a(string);
    }

    public void b(int n2, int n3, int n4, int n5, int n6) {
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            ((afy)this.u.get(i2)).a(n2, n3, n4, n5, n6);
        }
    }

    public void c(int n2, int n3, int n4, int n5, int n6) {
        this.a(null, n2, n3, n4, n5, n6);
    }

    public void a(xq xq2, int n2, int n3, int n4, int n5, int n6) {
        try {
            for (int i2 = 0; i2 < this.u.size(); ++i2) {
                ((afy)this.u.get(i2)).a(xq2, n2, n3, n4, n5, n6);
            }
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Playing level event");
            k k2 = b2.a("Level event being played");
            k2.a("Block coordinates", k.a(n3, n4, n5));
            k2.a("Event source", xq2);
            k2.a("Event type", n2);
            k2.a("Event data", n6);
            throw new s(b2);
        }
    }

    @Override
    public int R() {
        return 256;
    }

    public int S() {
        return this.t.g ? 128 : 256;
    }

    public Random A(int n2, int n3, int n4) {
        long l2 = (long)n2 * 341873128712L + (long)n3 * 132897987541L + this.N().b() + (long)n4;
        this.s.setSeed(l2);
        return this.s;
    }

    public afk b(String string, int n2, int n3, int n4) {
        return this.L().a(this, string, n2, n3, n4);
    }

    @Override
    public boolean T() {
        return false;
    }

    public double U() {
        if (this.x.u() == agd.c) {
            return 0.0;
        }
        return 63.0;
    }

    public k a(b b2) {
        k k2 = b2.a("Affected level", 1);
        k2.a("Level name", this.x == null ? "????" : this.x.k());
        k2.a("All players", new afv(this));
        k2.a("Chunk stats", new afw(this));
        try {
            this.x.a(k2);
        }
        catch (Throwable throwable) {
            k2.a("Level Data Unobtainable", throwable);
        }
        return k2;
    }

    public void d(int n2, int n3, int n4, int n5, int n6) {
        for (int i2 = 0; i2 < this.u.size(); ++i2) {
            afy afy2 = (afy)this.u.get(i2);
            afy2.b(n2, n3, n4, n5, n6);
        }
    }

    @Override
    public ayq V() {
        return this.J;
    }

    public Calendar W() {
        if (this.I() % 600L == 0L) {
            this.K.setTimeInMillis(MinecraftServer.ap());
        }
        return this.K;
    }

    public void a(double d2, double d3, double d4, double d5, double d6, double d7, dg dg2) {
    }

    public ayw X() {
        return this.D;
    }

    public void f(int n2, int n3, int n4, ahz ahz2) {
        for (int i2 = 0; i2 < 4; ++i2) {
            ahz ahz3;
            int n5 = n2 + p.a[i2];
            int n6 = n4 + p.b[i2];
            ahz ahz4 = this.a(n5, n3, n6);
            if (aie.bU.e(ahz4)) {
                ahz4.a(this, n5, n3, n6, ahz2);
                continue;
            }
            if (!ahz4.r() || !aie.bU.e(ahz3 = this.a(n5 += p.a[i2], n3, n6 += p.b[i2]))) continue;
            ahz3.a(this, n5, n3, n6, ahz2);
        }
    }

    public float b(double d2, double d3, double d4) {
        return this.B(oy.c(d2), oy.c(d3), oy.c(d4));
    }

    public float B(int n2, int n3, int n4) {
        boolean bl2;
        float f2 = 0.0f;
        boolean bl3 = bl2 = this.r == pu.d;
        if (this.d(n2, n3, n4)) {
            float f3 = this.y();
            f2 += oy.a((float)this.d((int)n2, (int)n4).s / 3600000.0f, 0.0f, 1.0f) * (bl2 ? 1.0f : 0.75f);
            f2 += f3 * 0.25f;
        }
        if (this.r == pu.b || this.r == pu.a) {
            f2 *= (float)this.r.a() / 2.0f;
        }
        return oy.a(f2, 0.0f, bl2 ? 1.5f : 1.0f);
    }

    public void Y() {
        for (afy afy2 : this.u) {
            afy2.b();
        }
    }
}

