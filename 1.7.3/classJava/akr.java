/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class akr
extends aht {
    protected akr() {
        super(avk.e);
    }

    @Override
    public ani a(afs afs2, int n2) {
        return new aoa();
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, int n5, float f2, int n6) {
        super.a(afs2, n2, n3, n4, n5, f2, n6);
        int n7 = 15 + afs2.s.nextInt(15) + afs2.s.nextInt(15);
        this.c(afs2, n2, n3, n4, n7);
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public abs d(afs afs2, int n2, int n3, int n4) {
        return abs.d(0);
    }
}

