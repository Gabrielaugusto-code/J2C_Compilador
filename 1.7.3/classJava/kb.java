/*
 * Decompiled with CFR 0.152.
 */
public abstract class kb
extends cl {
    @Override
    public abu b(cj cj2, abu abu2) {
        afs afs2 = cj2.k();
        cw cw2 = ajd.a(cj2);
        cq cq2 = ajd.b(cj2.h());
        xy xy2 = this.a(afs2, cw2);
        xy2.c(cq2.c(), (float)cq2.d() + 0.1f, cq2.e(), this.b(), this.a());
        afs2.d((qr)((Object)xy2));
        abu2.a(1);
        return abu2;
    }

    @Override
    protected void a(cj cj2) {
        cj2.k().c(1002, cj2.d(), cj2.e(), cj2.f(), 0);
    }

    protected abstract xy a(afs var1, cw var2);

    protected float a() {
        return 6.0f;
    }

    protected float b() {
        return 1.1f;
    }
}

