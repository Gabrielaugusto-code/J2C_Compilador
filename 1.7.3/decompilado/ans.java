/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ans
extends ani
implements ps {
    private abu[] i = new abu[9];
    private Random j = new Random();
    protected String a;

    @Override
    public int a() {
        return 9;
    }

    @Override
    public abu a(int n2) {
        return this.i[n2];
    }

    @Override
    public abu a(int n2, int n3) {
        if (this.i[n2] != null) {
            if (this.i[n2].b <= n3) {
                abu abu2 = this.i[n2];
                this.i[n2] = null;
                this.e();
                return abu2;
            }
            abu abu3 = this.i[n2].a(n3);
            if (this.i[n2].b == 0) {
                this.i[n2] = null;
            }
            this.e();
            return abu3;
        }
        return null;
    }

    @Override
    public abu a_(int n2) {
        if (this.i[n2] != null) {
            abu abu2 = this.i[n2];
            this.i[n2] = null;
            return abu2;
        }
        return null;
    }

    public int i() {
        int n2 = -1;
        int n3 = 1;
        for (int i2 = 0; i2 < this.i.length; ++i2) {
            if (this.i[i2] == null || this.j.nextInt(n3++) != 0) continue;
            n2 = i2;
        }
        return n2;
    }

    @Override
    public void a(int n2, abu abu2) {
        this.i[n2] = abu2;
        if (abu2 != null && abu2.b > this.d()) {
            abu2.b = this.d();
        }
        this.e();
    }

    public int a(abu abu2) {
        for (int i2 = 0; i2 < this.i.length; ++i2) {
            if (this.i[i2] != null && this.i[i2].b() != null) continue;
            this.a(i2, abu2);
            return i2;
        }
        return -1;
    }

    @Override
    public String b() {
        return this.k_() ? this.a : "container.dispenser";
    }

    public void a(String string) {
        this.a = string;
    }

    @Override
    public boolean k_() {
        return this.a != null;
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        dp dp2 = dg2.c("Items", 10);
        this.i = new abu[this.a()];
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            dg dg3 = dp2.b(i2);
            int n2 = dg3.d("Slot") & 0xFF;
            if (n2 < 0 || n2 >= this.i.length) continue;
            this.i[n2] = abu.a(dg3);
        }
        if (dg2.b("CustomName", 8)) {
            this.a = dg2.j("CustomName");
        }
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dp dp2 = new dp();
        for (int i2 = 0; i2 < this.i.length; ++i2) {
            if (this.i[i2] == null) continue;
            dg dg3 = new dg();
            dg3.a("Slot", (byte)i2);
            this.i[i2].b(dg3);
            dp2.a(dg3);
        }
        dg2.a("Items", dp2);
        if (this.k_()) {
            dg2.a("CustomName", this.a);
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
        return true;
    }
}

