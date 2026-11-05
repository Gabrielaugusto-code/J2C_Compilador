/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ajj
extends aht {
    private pw a;
    private pw b;

    protected ajj() {
        super(avk.e);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f);
        this.g(0);
        this.a(aak.c);
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void b(afs afs2, int n2, int n3, int n4, Random random) {
        super.b(afs2, n2, n3, n4, random);
        for (int i2 = n2 - 2; i2 <= n2 + 2; ++i2) {
            block1: for (int i3 = n4 - 2; i3 <= n4 + 2; ++i3) {
                if (i2 > n2 - 2 && i2 < n2 + 2 && i3 == n4 - 1) {
                    i3 = n4 + 2;
                }
                if (random.nextInt(16) != 0) continue;
                for (int i4 = n3; i4 <= n3 + 1; ++i4) {
                    if (afs2.a(i2, i4, i3) != aie.X) continue;
                    if (!afs2.c((i2 - n2) / 2 + n2, i4, (i3 - n4) / 2 + n4)) continue block1;
                    afs2.a("enchantmenttable", (double)n2 + 0.5, (double)n3 + 2.0, (double)n4 + 0.5, (double)((float)(i2 - n2) + random.nextFloat()) - 0.5, (double)((float)(i4 - n3) - random.nextFloat() - 1.0f), (double)((float)(i3 - n4) + random.nextFloat()) - 0.5);
                }
            }
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 0) {
            return this.b;
        }
        if (n2 == 1) {
            return this.a;
        }
        return this.L;
    }

    @Override
    public ani a(afs afs2, int n2) {
        return new anu();
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        if (afs2.E) {
            return true;
        }
        anu anu2 = (anu)afs2.o(n2, n3, n4);
        xq2.a(n2, n3, n4, anu2.b() ? anu2.a() : null);
        return true;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        super.a(afs2, n2, n3, n4, rm2, abu2);
        if (abu2.u()) {
            ((anu)afs2.o(n2, n3, n4)).a(abu2.s());
        }
    }

    @Override
    public void a(px px2) {
        this.L = px2.a(this.N() + "_" + "side");
        this.a = px2.a(this.N() + "_" + "top");
        this.b = px2.a(this.N() + "_" + "bottom");
    }
}

