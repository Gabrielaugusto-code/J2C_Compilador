/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class anm
extends ani
implements qc {
    private static final int[] a = new int[]{3};
    private static final int[] i = new int[]{0, 1, 2};
    private abu[] j = new abu[4];
    private int k;
    private int l;
    private abs m;
    private String n;

    @Override
    public String b() {
        return this.k_() ? this.n : "container.brewing";
    }

    @Override
    public boolean k_() {
        return this.n != null && this.n.length() > 0;
    }

    public void a(String string) {
        this.n = string;
    }

    @Override
    public int a() {
        return this.j.length;
    }

    @Override
    public void h() {
        if (this.k > 0) {
            --this.k;
            if (this.k == 0) {
                this.l();
                this.e();
            } else if (!this.k()) {
                this.k = 0;
                this.e();
            } else if (this.m != this.j[3].b()) {
                this.k = 0;
                this.e();
            }
        } else if (this.k()) {
            this.k = 400;
            this.m = this.j[3].b();
        }
        int n2 = this.j();
        if (n2 != this.l) {
            this.l = n2;
            this.b.a(this.c, this.d, this.e, n2, 2);
        }
        super.h();
    }

    public int i() {
        return this.k;
    }

    private boolean k() {
        if (this.j[3] == null || this.j[3].b <= 0) {
            return false;
        }
        abu abu2 = this.j[3];
        if (!abu2.b().m(abu2)) {
            return false;
        }
        boolean bl2 = false;
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.j[i2] == null || this.j[i2].b() != abv.bn) continue;
            int n2 = this.j[i2].k();
            int n3 = this.c(n2, abu2);
            if (!acg.g(n2) && acg.g(n3)) {
                bl2 = true;
                break;
            }
            List list = abv.bn.c(n2);
            List list2 = abv.bn.c(n3);
            if (n2 > 0 && list == list2 || list != null && (((Object)list).equals(list2) || list2 == null) || n2 == n3) continue;
            bl2 = true;
            break;
        }
        return bl2;
    }

    private void l() {
        if (!this.k()) {
            return;
        }
        abu abu2 = this.j[3];
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.j[i2] == null || this.j[i2].b() != abv.bn) continue;
            int n2 = this.j[i2].k();
            int n3 = this.c(n2, abu2);
            List list = abv.bn.c(n2);
            List list2 = abv.bn.c(n3);
            if (n2 > 0 && list == list2 || list != null && (((Object)list).equals(list2) || list2 == null)) {
                if (acg.g(n2) || !acg.g(n3)) continue;
                this.j[i2].b(n3);
                continue;
            }
            if (n2 == n3) continue;
            this.j[i2].b(n3);
        }
        if (abu2.b().u()) {
            this.j[3] = new abu(abu2.b().t());
        } else {
            --this.j[3].b;
            if (this.j[3].b <= 0) {
                this.j[3] = null;
            }
        }
    }

    private int c(int n2, abu abu2) {
        if (abu2 == null) {
            return n2;
        }
        if (abu2.b().m(abu2)) {
            return ade.a(n2, abu2.b().i(abu2));
        }
        return n2;
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        dp dp2 = dg2.c("Items", 10);
        this.j = new abu[this.a()];
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            dg dg3 = dp2.b(i2);
            byte by2 = dg3.d("Slot");
            if (by2 < 0 || by2 >= this.j.length) continue;
            this.j[by2] = abu.a(dg3);
        }
        this.k = dg2.e("BrewTime");
        if (dg2.b("CustomName", 8)) {
            this.n = dg2.j("CustomName");
        }
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("BrewTime", (short)this.k);
        dp dp2 = new dp();
        for (int i2 = 0; i2 < this.j.length; ++i2) {
            if (this.j[i2] == null) continue;
            dg dg3 = new dg();
            dg3.a("Slot", (byte)i2);
            this.j[i2].b(dg3);
            dp2.a(dg3);
        }
        dg2.a("Items", dp2);
        if (this.k_()) {
            dg2.a("CustomName", this.n);
        }
    }

    @Override
    public abu a(int n2) {
        if (n2 >= 0 && n2 < this.j.length) {
            return this.j[n2];
        }
        return null;
    }

    @Override
    public abu a(int n2, int n3) {
        if (n2 >= 0 && n2 < this.j.length) {
            abu abu2 = this.j[n2];
            this.j[n2] = null;
            return abu2;
        }
        return null;
    }

    @Override
    public abu a_(int n2) {
        if (n2 >= 0 && n2 < this.j.length) {
            abu abu2 = this.j[n2];
            this.j[n2] = null;
            return abu2;
        }
        return null;
    }

    @Override
    public void a(int n2, abu abu2) {
        if (n2 >= 0 && n2 < this.j.length) {
            this.j[n2] = abu2;
        }
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
        if (n2 == 3) {
            return abu2.b().m(abu2);
        }
        return abu2.b() == abv.bn || abu2.b() == abv.bo;
    }

    public void d(int n2) {
        this.k = n2;
    }

    public int j() {
        int n2 = 0;
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.j[i2] == null) continue;
            n2 |= 1 << i2;
        }
        return n2;
    }

    @Override
    public int[] c(int n2) {
        if (n2 == 1) {
            return a;
        }
        return i;
    }

    @Override
    public boolean a(int n2, abu abu2, int n3) {
        return this.b(n2, abu2);
    }

    @Override
    public boolean b(int n2, abu abu2, int n3) {
        return true;
    }
}

