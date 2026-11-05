/*
 * Decompiled with CFR 0.152.
 */
class kp
extends kb {
    final /* synthetic */ abu b;
    final /* synthetic */ ko c;

    kp(ko ko2, abu abu2) {
        this.c = ko2;
        this.b = abu2;
    }

    @Override
    protected xy a(afs afs2, cw cw2) {
        return new yf(afs2, cw2.a(), cw2.b(), cw2.c(), this.b.m());
    }

    @Override
    protected float a() {
        return super.a() * 0.5f;
    }

    @Override
    protected float b() {
        return super.b() * 1.25f;
    }
}

