/*
 * Decompiled with CFR 0.152.
 */
class zf
extends zp {
    final /* synthetic */ uz a;
    final /* synthetic */ zd b;

    zf(zd zd2, ps ps2, int n2, int n3, int n4, uz uz2) {
        this.b = zd2;
        this.a = uz2;
        super(ps2, n2, n3, n4);
    }

    @Override
    public boolean a(abu abu2) {
        return super.a(abu2) && this.a.cB() && uz.a(abu2.b());
    }

    @Override
    public boolean b() {
        return this.a.cB();
    }
}

