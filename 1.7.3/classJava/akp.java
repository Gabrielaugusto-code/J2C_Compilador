/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class akp
extends ahz {
    private pw a;

    protected akp() {
        super(avk.C);
        this.a(aak.b);
    }

    @Override
    public pw a(int n2, int n3) {
        if (n2 == 1 || n2 == 0) {
            return this.a;
        }
        return this.L;
    }

    @Override
    public abs a(int n2, Random random, int n3) {
        return abv.ba;
    }

    @Override
    public int a(Random random) {
        return 3 + random.nextInt(5);
    }

    @Override
    public int a(int n2, Random random) {
        int n3 = this.a(random) + random.nextInt(1 + n2);
        if (n3 > 9) {
            n3 = 9;
        }
        return n3;
    }

    @Override
    public void a(px px2) {
        this.L = px2.a(this.N() + "_side");
        this.a = px2.a(this.N() + "_top");
    }
}

