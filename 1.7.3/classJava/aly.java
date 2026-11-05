/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class aly
extends ajo {
    public static final String[] a = new String[]{"default", "red"};
    private static pw b;
    private static pw N;

    @Override
    public pw a(int n2, int n3) {
        return n3 == 1 ? N : b;
    }

    @Override
    public void a(px px2) {
        b = px2.a("sand");
        N = px2.a("red_sand");
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        list.add(new abu(abs2, 1, 0));
        list.add(new abu(abs2, 1, 1));
    }

    @Override
    public avm f(int n2) {
        if (n2 == 1) {
            return avm.l;
        }
        return avm.d;
    }
}

