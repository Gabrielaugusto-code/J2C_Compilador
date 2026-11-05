/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class aei
extends aek {
    protected aei(int n2, int n3) {
        super(n2, n3, ael.j);
        this.b("durability");
    }

    @Override
    public int a(int n2) {
        return 5 + (n2 - 1) * 8;
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int b() {
        return 3;
    }

    @Override
    public boolean a(abu abu2) {
        if (abu2.g()) {
            return true;
        }
        return super.a(abu2);
    }

    public static boolean a(abu abu2, int n2, Random random) {
        if (abu2.b() instanceof zs && random.nextFloat() < 0.6f) {
            return false;
        }
        return random.nextInt(n2 + 1) > 0;
    }
}

