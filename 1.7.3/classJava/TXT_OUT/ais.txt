/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ais
extends aht {
    public ais() {
        super(avk.f);
    }

    @Override
    public ani a(afs afs2, int n2) {
        return new ano();
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        if (!afs2.E) {
            boolean bl2;
            boolean bl3 = afs2.v(n2, n3, n4);
            int n5 = afs2.e(n2, n3, n4);
            boolean bl4 = bl2 = (n5 & 1) != 0;
            if (bl3 && !bl2) {
                afs2.a(n2, n3, n4, n5 | 1, 4);
                afs2.a(n2, n3, n4, this, this.a(afs2));
            } else if (!bl3 && bl2) {
                afs2.a(n2, n3, n4, n5 & 0xFFFFFFFE, 4);
            }
        }
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, Random random) {
        ani ani2 = afs2.o(n2, n3, n4);
        if (ani2 != null && ani2 instanceof ano) {
            afg afg2 = ((ano)ani2).a();
            afg2.a(afs2);
            afs2.f(n2, n3, n4, this);
        }
    }

    @Override
    public int a(afs afs2) {
        return 1;
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        ano ano2 = (ano)afs2.o(n2, n3, n4);
        if (ano2 != null) {
            xq2.a(ano2);
        }
        return true;
    }

    @Override
    public boolean M() {
        return true;
    }

    @Override
    public int g(afs afs2, int n2, int n3, int n4, int n5) {
        ani ani2 = afs2.o(n2, n3, n4);
        if (ani2 != null && ani2 instanceof ano) {
            return ((ano)ani2).a().g();
        }
        return 0;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        ano ano2 = (ano)afs2.o(n2, n3, n4);
        if (abu2.u()) {
            ano2.a().b(abu2.s());
        }
    }

    @Override
    public int a(Random random) {
        return 0;
    }
}

