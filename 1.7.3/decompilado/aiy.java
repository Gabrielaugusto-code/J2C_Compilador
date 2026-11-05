/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aiy
extends aii {
    protected aiy() {
        super(avk.l);
        float f2 = 0.4f;
        this.a(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, 0.8f, 0.5f + f2);
    }

    @Override
    protected boolean a(ahz ahz2) {
        return ahz2 == aie.m || ahz2 == aie.ch || ahz2 == aie.ce || ahz2 == aie.d;
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return null;
    }

    @Override
    public void a(afs afs2, xq xq2, int n2, int n3, int n4, int n5) {
        if (!afs2.E && xq2.bE() != null && xq2.bE().b() == abv.aZ) {
            xq2.a(og.C[ahz.b(this)], 1);
            this.a(afs2, n2, n3, n4, new abu(aie.I, 1, n5));
        } else {
            super.a(afs2, xq2, n2, n3, n4, n5);
        }
    }
}

