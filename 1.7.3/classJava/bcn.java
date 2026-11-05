/*
 * Decompiled with CFR 0.152.
 */
import java.util.Date;

class bcn
extends bbf {
    final /* synthetic */ bcm k;

    public bcn(bcm bcm2) {
        this.k = bcm2;
        super(bcm2.k, bcm2.l, bcm2.m, 32, bcm2.m - 64, 36);
    }

    @Override
    protected int b() {
        return bcm.a(this.k).size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        boolean bl3;
        bcm.a(this.k, n2);
        bcm.c((bcm)this.k).l = bl3 = bcm.b(this.k) >= 0 && bcm.b(this.k) < this.b();
        bcm.d((bcm)this.k).l = bl3;
        bcm.e((bcm)this.k).l = bl3;
        bcm.f((bcm)this.k).l = bl3;
        if (bl2 && bl3) {
            this.k.e(n2);
        }
    }

    @Override
    protected boolean a(int n2) {
        return n2 == bcm.b(this.k);
    }

    @Override
    protected int e() {
        return bcm.a(this.k).size() * 36;
    }

    @Override
    protected void a() {
        this.k.q_();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, bna bna2, int n6, int n7) {
        axw axw2 = (axw)bcm.a(this.k).get(n2);
        String string = axw2.b();
        if (string == null || oy.a(string)) {
            string = bcm.g(this.k) + " " + (n2 + 1);
        }
        String string2 = axw2.a();
        string2 = string2 + " (" + bcm.h(this.k).format(new Date(axw2.e()));
        string2 = string2 + ")";
        String string3 = "";
        if (axw2.d()) {
            string3 = bcm.i(this.k) + " " + string3;
        } else {
            string3 = bcm.j(this.k)[axw2.f().a()];
            if (axw2.g()) {
                string3 = (Object)((Object)a.e) + bsc.a("gameMode.hardcore", new Object[0]) + (Object)((Object)a.v);
            }
            if (axw2.h()) {
                string3 = string3 + ", " + bsc.a("selectWorld.cheats", new Object[0]);
            }
        }
        this.k.b(this.k.q, string, n3 + 2, n4 + 1, 0xFFFFFF);
        this.k.b(this.k.q, string2, n3 + 2, n4 + 12, 0x808080);
        this.k.b(this.k.q, string3, n3 + 2, n4 + 12 + 10, 0x808080);
    }
}

