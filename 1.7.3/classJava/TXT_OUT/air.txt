/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class air
extends ahz {
    private pw[] a;

    public air(avk avk2) {
        super(avk2);
        this.a(aak.b);
    }

    @Override
    public pw a(int n2, int n3) {
        return this.a[n3 % this.a.length];
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    public static int b(int n2) {
        return air.c(n2);
    }

    public static int c(int n2) {
        return ~n2 & 0xF;
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        for (int i2 = 0; i2 < 16; ++i2) {
            list.add(new abu(abs2, 1, i2));
        }
    }

    @Override
    public void a(px px2) {
        this.a = new pw[16];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = px2.a(this.N() + "_" + aba.b[air.c(i2)]);
        }
    }

    @Override
    public avm f(int n2) {
        return avm.a(n2);
    }
}

