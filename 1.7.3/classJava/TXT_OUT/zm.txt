/*
 * Decompiled with CFR 0.152.
 */
public class zm
extends py {
    private anv a;

    public zm() {
        super("container.enderchest", false, 27);
    }

    public void a(anv anv2) {
        this.a = anv2;
    }

    public void a(dp dp2) {
        int n2;
        for (n2 = 0; n2 < this.a(); ++n2) {
            this.a(n2, null);
        }
        for (n2 = 0; n2 < dp2.c(); ++n2) {
            dg dg2 = dp2.b(n2);
            int n3 = dg2.d("Slot") & 0xFF;
            if (n3 < 0 || n3 >= this.a()) continue;
            this.a(n3, abu.a(dg2));
        }
    }

    public dp h() {
        dp dp2 = new dp();
        for (int i2 = 0; i2 < this.a(); ++i2) {
            abu abu2 = this.a(i2);
            if (abu2 == null) continue;
            dg dg2 = new dg();
            dg2.a("Slot", (byte)i2);
            abu2.b(dg2);
            dp2.a(dg2);
        }
        return dp2;
    }

    @Override
    public boolean a(xq xq2) {
        if (this.a != null && !this.a.a(xq2)) {
            return false;
        }
        return super.a(xq2);
    }

    @Override
    public void f() {
        if (this.a != null) {
            this.a.a();
        }
        super.f();
    }

    @Override
    public void l_() {
        if (this.a != null) {
            this.a.b();
        }
        super.l_();
        this.a = null;
    }
}

