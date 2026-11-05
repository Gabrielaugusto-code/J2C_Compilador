/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aii
extends ahz {
    protected aii(avk avk2) {
        super(avk2);
        this.a(true);
        float f2 = 0.2f;
        this.a(0.5f - f2, 0.0f, 0.5f - f2, 0.5f + f2, f2 * 3.0f, 0.5f + f2);
        this.a(aak.c);
    }

    protected aii() {
        this(avk.k);
    }

    @Override
    public boolean c(afs afs2, int n2, int n3, int n4) {
        return super.c(afs2, n2, n3, n4) && this.a(afs2.a(n2, n3 - 1, n4));
    }

    protected boolean a(ahz ahz2) {
        return ahz2 == aie.c || ahz2 == aie.d || ahz2 == aie.ak;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        super.a(afs2, n2, n3, n4, ahz2);
        this.e(afs2, n2, n3, n4);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        this.e(afs2, n2, n3, n4);
    }

    protected void e(afs afs2, int n2, int n3, int n4) {
        if (!this.j(afs2, n2, n3, n4)) {
            this.b(afs2, n2, n3, n4, afs2.e(n2, n3, n4), 0);
            afs2.d(n2, n3, n4, aii.e(0), 0, 2);
        }
    }

    @Override
    public boolean j(afs afs2, int n2, int n3, int n4) {
        return this.a(afs2.a(n2, n3 - 1, n4));
    }

    @Override
    public ayk a(afs afs2, int n2, int n3, int n4) {
        return null;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public int b() {
        return 1;
    }
}

