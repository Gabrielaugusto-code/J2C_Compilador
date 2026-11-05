/*
 * Decompiled with CFR 0.152.
 */
public class abg
extends abs {
    public abg() {
        this.a(aak.f);
    }

    @Override
    public boolean e(abu abu2) {
        return true;
    }

    @Override
    public abu a(abu abu2, afs afs2, xq xq2) {
        if (!xq2.bE.d) {
            --abu2.b;
        }
        afs2.a((qr)xq2, "random.bow", 0.5f, 0.4f / (g.nextFloat() * 0.4f + 0.8f));
        if (!afs2.E) {
            afs2.d(new ye(afs2, xq2));
        }
        return abu2;
    }
}

