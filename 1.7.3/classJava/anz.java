/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class anz
extends ani
implements any {
    private abu[] a = new abu[5];
    private String i;
    private int j = -1;

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        dp dp2 = dg2.c("Items", 10);
        this.a = new abu[this.a()];
        if (dg2.b("CustomName", 8)) {
            this.i = dg2.j("CustomName");
        }
        this.j = dg2.f("TransferCooldown");
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            dg dg3 = dp2.b(i2);
            byte by2 = dg3.d("Slot");
            if (by2 < 0 || by2 >= this.a.length) continue;
            this.a[by2] = abu.a(dg3);
        }
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dp dp2 = new dp();
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            if (this.a[i2] == null) continue;
            dg dg3 = new dg();
            dg3.a("Slot", (byte)i2);
            this.a[i2].b(dg3);
            dp2.a(dg3);
        }
        dg2.a("Items", dp2);
        dg2.a("TransferCooldown", this.j);
        if (this.k_()) {
            dg2.a("CustomName", this.i);
        }
    }

    @Override
    public void e() {
        super.e();
    }

    @Override
    public int a() {
        return this.a.length;
    }

    @Override
    public abu a(int n2) {
        return this.a[n2];
    }

    @Override
    public abu a(int n2, int n3) {
        if (this.a[n2] != null) {
            if (this.a[n2].b <= n3) {
                abu abu2 = this.a[n2];
                this.a[n2] = null;
                return abu2;
            }
            abu abu3 = this.a[n2].a(n3);
            if (this.a[n2].b == 0) {
                this.a[n2] = null;
            }
            return abu3;
        }
        return null;
    }

    @Override
    public abu a_(int n2) {
        if (this.a[n2] != null) {
            abu abu2 = this.a[n2];
            this.a[n2] = null;
            return abu2;
        }
        return null;
    }

    @Override
    public void a(int n2, abu abu2) {
        this.a[n2] = abu2;
        if (abu2 != null && abu2.b > this.d()) {
            abu2.b = this.d();
        }
    }

    @Override
    public String b() {
        return this.k_() ? this.i : "container.hopper";
    }

    @Override
    public boolean k_() {
        return this.i != null && this.i.length() > 0;
    }

    public void a(String string) {
        this.i = string;
    }

    @Override
    public int d() {
        return 64;
    }

    @Override
    public boolean a(xq xq2) {
        if (this.b.o(this.c, this.d, this.e) != this) {
            return false;
        }
        return !(xq2.e((double)this.c + 0.5, (double)this.d + 0.5, (double)this.e + 0.5) > 64.0);
    }

    @Override
    public void f() {
    }

    @Override
    public void l_() {
    }

    @Override
    public boolean b(int n2, abu abu2) {
        return true;
    }

    @Override
    public void h() {
        if (this.b == null || this.b.E) {
            return;
        }
        --this.j;
        if (!this.j()) {
            this.c(0);
            this.i();
        }
    }

    public boolean i() {
        if (this.b == null || this.b.E) {
            return false;
        }
        if (!this.j() && ake.c(this.p())) {
            boolean bl2 = false;
            if (!this.k()) {
                bl2 = this.x();
            }
            if (!this.l()) {
                boolean bl3 = bl2 = anz.a(this) || bl2;
            }
            if (bl2) {
                this.c(8);
                this.e();
                return true;
            }
        }
        return false;
    }

    private boolean k() {
        for (abu abu2 : this.a) {
            if (abu2 == null) continue;
            return false;
        }
        return true;
    }

    private boolean l() {
        for (abu abu2 : this.a) {
            if (abu2 != null && abu2.b == abu2.e()) continue;
            return false;
        }
        return true;
    }

    private boolean x() {
        ps ps2 = this.y();
        if (ps2 == null) {
            return false;
        }
        int n2 = q.a[ake.b(this.p())];
        if (this.a(ps2, n2)) {
            return false;
        }
        for (int i2 = 0; i2 < this.a(); ++i2) {
            if (this.a(i2) == null) continue;
            abu abu2 = this.a(i2).m();
            abu abu3 = anz.a(ps2, this.a(i2, 1), n2);
            if (abu3 == null || abu3.b == 0) {
                ps2.e();
                return true;
            }
            this.a(i2, abu2);
        }
        return false;
    }

    private boolean a(ps ps2, int n2) {
        if (ps2 instanceof qc && n2 > -1) {
            qc qc2 = (qc)ps2;
            int[] nArray = qc2.c(n2);
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                abu abu2 = qc2.a(nArray[i2]);
                if (abu2 != null && abu2.b == abu2.e()) continue;
                return false;
            }
        } else {
            int n3 = ps2.a();
            for (int i3 = 0; i3 < n3; ++i3) {
                abu abu3 = ps2.a(i3);
                if (abu3 != null && abu3.b == abu3.e()) continue;
                return false;
            }
        }
        return true;
    }

    private static boolean b(ps ps2, int n2) {
        if (ps2 instanceof qc && n2 > -1) {
            qc qc2 = (qc)ps2;
            int[] nArray = qc2.c(n2);
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                if (qc2.a(nArray[i2]) == null) continue;
                return false;
            }
        } else {
            int n3 = ps2.a();
            for (int i3 = 0; i3 < n3; ++i3) {
                if (ps2.a(i3) == null) continue;
                return false;
            }
        }
        return true;
    }

    public static boolean a(any any2) {
        ps ps2 = anz.b(any2);
        if (ps2 != null) {
            int n2 = 0;
            if (anz.b(ps2, n2)) {
                return false;
            }
            if (ps2 instanceof qc && n2 > -1) {
                qc qc2 = (qc)ps2;
                int[] nArray = qc2.c(n2);
                for (int i2 = 0; i2 < nArray.length; ++i2) {
                    if (!anz.a(any2, ps2, nArray[i2], n2)) continue;
                    return true;
                }
            } else {
                int n3 = ps2.a();
                for (int i3 = 0; i3 < n3; ++i3) {
                    if (!anz.a(any2, ps2, i3, n2)) continue;
                    return true;
                }
            }
        } else {
            wb wb2 = anz.a(any2.w(), any2.aC(), any2.aD() + 1.0, any2.aE());
            if (wb2 != null) {
                return anz.a(any2, wb2);
            }
        }
        return false;
    }

    private static boolean a(any any2, ps ps2, int n2, int n3) {
        abu abu2 = ps2.a(n2);
        if (abu2 != null && anz.b(ps2, abu2, n2, n3)) {
            abu abu3 = abu2.m();
            abu abu4 = anz.a(any2, ps2.a(n2, 1), -1);
            if (abu4 == null || abu4.b == 0) {
                ps2.e();
                return true;
            }
            ps2.a(n2, abu3);
        }
        return false;
    }

    public static boolean a(ps ps2, wb wb2) {
        boolean bl2 = false;
        if (wb2 == null) {
            return false;
        }
        abu abu2 = wb2.f().m();
        abu abu3 = anz.a(ps2, abu2, -1);
        if (abu3 == null || abu3.b == 0) {
            bl2 = true;
            wb2.A();
        } else {
            wb2.a(abu3);
        }
        return bl2;
    }

    public static abu a(ps ps2, abu abu2, int n2) {
        if (ps2 instanceof qc && n2 > -1) {
            qc qc2 = (qc)ps2;
            int[] nArray = qc2.c(n2);
            for (int i2 = 0; i2 < nArray.length && abu2 != null && abu2.b > 0; ++i2) {
                abu2 = anz.c(ps2, abu2, nArray[i2], n2);
            }
        } else {
            int n3 = ps2.a();
            for (int i3 = 0; i3 < n3 && abu2 != null && abu2.b > 0; ++i3) {
                abu2 = anz.c(ps2, abu2, i3, n2);
            }
        }
        if (abu2 != null && abu2.b == 0) {
            abu2 = null;
        }
        return abu2;
    }

    private static boolean a(ps ps2, abu abu2, int n2, int n3) {
        if (!ps2.b(n2, abu2)) {
            return false;
        }
        return !(ps2 instanceof qc) || ((qc)ps2).a(n2, abu2, n3);
    }

    private static boolean b(ps ps2, abu abu2, int n2, int n3) {
        return !(ps2 instanceof qc) || ((qc)ps2).b(n2, abu2, n3);
    }

    private static abu c(ps ps2, abu abu2, int n2, int n3) {
        abu abu3 = ps2.a(n2);
        if (anz.a(ps2, abu2, n2, n3)) {
            boolean bl2 = false;
            if (abu3 == null) {
                ps2.a(n2, abu2);
                abu2 = null;
                bl2 = true;
            } else if (anz.a(abu3, abu2)) {
                int n4 = abu2.e() - abu3.b;
                int n5 = Math.min(abu2.b, n4);
                abu2.b -= n5;
                abu3.b += n5;
                boolean bl3 = bl2 = n5 > 0;
            }
            if (bl2) {
                if (ps2 instanceof anz) {
                    ((anz)ps2).c(8);
                    ps2.e();
                }
                ps2.e();
            }
        }
        return abu2;
    }

    private ps y() {
        int n2 = ake.b(this.p());
        return anz.b(this.w(), this.c + q.b[n2], (double)(this.d + q.c[n2]), (double)(this.e + q.d[n2]));
    }

    public static ps b(any any2) {
        return anz.b(any2.w(), any2.aC(), any2.aD() + 1.0, any2.aE());
    }

    public static wb a(afs afs2, double d2, double d3, double d4) {
        List list = afs2.a(wb.class, ayk.a().a(d2, d3, d4, d2 + 1.0, d3 + 1.0, d4 + 1.0), ra.a);
        if (list.size() > 0) {
            return (wb)list.get(0);
        }
        return null;
    }

    public static ps b(afs afs2, double d2, double d3, double d4) {
        Object object;
        int n2;
        int n3;
        ps ps2 = null;
        int n4 = oy.c(d2);
        ani ani2 = afs2.o(n4, n3 = oy.c(d3), n2 = oy.c(d4));
        if (ani2 != null && ani2 instanceof ps && (ps2 = (ps)((Object)ani2)) instanceof ann && (object = afs2.a(n4, n3, n2)) instanceof aio) {
            ps2 = ((aio)object).m(afs2, n4, n3, n2);
        }
        if (ps2 == null && (object = afs2.a((qr)null, ayk.a().a(d2, d3, d4, d2 + 1.0, d3 + 1.0, d4 + 1.0), ra.c)) != null && object.size() > 0) {
            ps2 = (ps)object.get(afs2.s.nextInt(object.size()));
        }
        return ps2;
    }

    private static boolean a(abu abu2, abu abu3) {
        if (abu2.b() != abu3.b()) {
            return false;
        }
        if (abu2.k() != abu3.k()) {
            return false;
        }
        if (abu2.b > abu2.e()) {
            return false;
        }
        return abu.a(abu2, abu3);
    }

    @Override
    public double aC() {
        return this.c;
    }

    @Override
    public double aD() {
        return this.d;
    }

    @Override
    public double aE() {
        return this.e;
    }

    public void c(int n2) {
        this.j = n2;
    }

    public boolean j() {
        return this.j > 0;
    }
}

