/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ut
extends axc {
    private afs a;
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private final List d = new ArrayList();
    private int e;

    public ut(String string) {
        super(string);
    }

    public ut(afs afs2) {
        super("villages");
        this.a = afs2;
        this.c();
    }

    public void a(afs afs2) {
        this.a = afs2;
        for (uq uq2 : this.d) {
            uq2.a(afs2);
        }
    }

    public void a(int n2, int n3, int n4) {
        if (this.b.size() > 64) {
            return;
        }
        if (!this.d(n2, n3, n4)) {
            this.b.add(new r(n2, n3, n4));
        }
    }

    public void a() {
        ++this.e;
        for (uq uq2 : this.d) {
            uq2.a(this.e);
        }
        this.e();
        this.f();
        this.g();
        if (this.e % 400 == 0) {
            this.c();
        }
    }

    private void e() {
        Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            uq uq2 = (uq)iterator.next();
            if (!uq2.g()) continue;
            iterator.remove();
            this.c();
        }
    }

    public List b() {
        return this.d;
    }

    public uq a(int n2, int n3, int n4, int n5) {
        uq uq2 = null;
        float f2 = Float.MAX_VALUE;
        for (uq uq3 : this.d) {
            float f3;
            float f4 = uq3.a().e(n2, n3, n4);
            if (f4 >= f2 || f4 > (f3 = (float)(n5 + uq3.b())) * f3) continue;
            uq2 = uq3;
            f2 = f4;
        }
        return uq2;
    }

    private void f() {
        if (this.b.isEmpty()) {
            return;
        }
        this.a((r)this.b.remove(0));
    }

    private void g() {
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            up up2 = (up)this.c.get(i2);
            boolean bl2 = false;
            for (uq uq2 : this.d) {
                int n2;
                int n3 = (int)uq2.a().e(up2.a, up2.b, up2.c);
                if (n3 > (n2 = 32 + uq2.b()) * n2) continue;
                uq2.a(up2);
                bl2 = true;
                break;
            }
            if (bl2) continue;
            uq uq3 = new uq(this.a);
            uq3.a(up2);
            this.d.add(uq3);
            this.c();
        }
        this.c.clear();
    }

    private void a(r r2) {
        int n2 = 16;
        int n3 = 4;
        int n4 = 16;
        for (int i2 = r2.a - n2; i2 < r2.a + n2; ++i2) {
            for (int i3 = r2.b - n3; i3 < r2.b + n3; ++i3) {
                for (int i4 = r2.c - n4; i4 < r2.c + n4; ++i4) {
                    if (!this.e(i2, i3, i4)) continue;
                    up up2 = this.b(i2, i3, i4);
                    if (up2 == null) {
                        this.c(i2, i3, i4);
                        continue;
                    }
                    up2.f = this.e;
                }
            }
        }
    }

    private up b(int n2, int n3, int n4) {
        for (Object object : this.c) {
            if (((up)object).a != n2 || ((up)object).c != n4 || Math.abs(((up)object).b - n3) > 1) continue;
            return object;
        }
        for (Object object : this.d) {
            up up2 = ((uq)object).e(n2, n3, n4);
            if (up2 == null) continue;
            return up2;
        }
        return null;
    }

    private void c(int n2, int n3, int n4) {
        int n5 = ((aje)aie.ao).e(this.a, n2, n3, n4);
        if (n5 == 0 || n5 == 2) {
            int n6;
            int n7 = 0;
            for (n6 = -5; n6 < 0; ++n6) {
                if (!this.a.i(n2 + n6, n3, n4)) continue;
                --n7;
            }
            for (n6 = 1; n6 <= 5; ++n6) {
                if (!this.a.i(n2 + n6, n3, n4)) continue;
                ++n7;
            }
            if (n7 != 0) {
                this.c.add(new up(n2, n3, n4, n7 > 0 ? -2 : 2, 0, this.e));
            }
        } else {
            int n8;
            int n9 = 0;
            for (n8 = -5; n8 < 0; ++n8) {
                if (!this.a.i(n2, n3, n4 + n8)) continue;
                --n9;
            }
            for (n8 = 1; n8 <= 5; ++n8) {
                if (!this.a.i(n2, n3, n4 + n8)) continue;
                ++n9;
            }
            if (n9 != 0) {
                this.c.add(new up(n2, n3, n4, 0, n9 > 0 ? -2 : 2, this.e));
            }
        }
    }

    private boolean d(int n2, int n3, int n4) {
        for (r r2 : this.b) {
            if (r2.a != n2 || r2.b != n3 || r2.c != n4) continue;
            return true;
        }
        return false;
    }

    private boolean e(int n2, int n3, int n4) {
        return this.a.a(n2, n3, n4) == aie.ao;
    }

    @Override
    public void a(dg dg2) {
        this.e = dg2.f("Tick");
        dp dp2 = dg2.c("Villages", 10);
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            dg dg3 = dp2.b(i2);
            uq uq2 = new uq();
            uq2.a(dg3);
            this.d.add(uq2);
        }
    }

    @Override
    public void b(dg dg2) {
        dg2.a("Tick", this.e);
        dp dp2 = new dp();
        for (uq uq2 : this.d) {
            dg dg3 = new dg();
            uq2.b(dg3);
            dp2.a(dg3);
        }
        dg2.a("Villages", dp2);
    }
}

