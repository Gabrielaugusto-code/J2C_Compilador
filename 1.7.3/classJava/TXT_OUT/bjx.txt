/*
 * Decompiled with CFR 0.152.
 */
class bjx
extends bcl {
    final /* synthetic */ String a;
    final /* synthetic */ bjw f;

    bjx(bjw bjw2, String string) {
        this.f = bjw2;
        this.a = string;
    }

    @Override
    public void a(boolean bl2, int n2) {
        this.k = azi.B();
        if (this.k.E() != null) {
            this.k.E().a(bl2);
            bkj.b(this.k.E());
        }
        if (bl2) {
            this.k.R().a(this.a);
        }
        this.k.a((bcl)null);
    }
}

