/*
 * Decompiled with CFR 0.152.
 */
public class abf
extends abs {
    public abf() {
        this.h = 16;
        this.a(aak.f);
    }

    @Override
    public abu a(abu abu2, afs afs2, xq xq2) {
        if (xq2.bE.d) {
            return abu2;
        }
        --abu2.b;
        afs2.a((qr)xq2, "random.bow", 0.5f, 0.4f / (g.nextFloat() * 0.4f + 0.8f));
        if (!afs2.E) {
            afs2.d(new yd(afs2, xq2));
        }
        return abu2;
    }
}

