/*
 * Decompiled with CFR 0.152.
 */
class bue
implements buh {
    final brq a;
    final /* synthetic */ String b;
    final /* synthetic */ btd c;
    final /* synthetic */ buc d;

    bue(buc buc2, String string, btd btd2) {
        this.d = buc2;
        this.b = string;
        this.c = btd2;
        this.a = new brq(this.b, this.c.a());
    }

    @Override
    public int a() {
        bub bub2 = (bub)buc.a(this.d).a(this.a);
        return bub2 == null ? 0 : bub2.a();
    }

    public btv b() {
        bub bub2 = (bub)buc.a(this.d).a(this.a);
        return bub2 == null ? buc.a : bub2.b();
    }

    @Override
    public /* synthetic */ Object g() {
        return this.b();
    }
}

