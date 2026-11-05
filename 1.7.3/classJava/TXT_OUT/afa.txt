/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class afa
extends aek {
    public afa(int n2, int n3) {
        super(n2, n3, ael.e);
        this.b("thorns");
    }

    @Override
    public int a(int n2) {
        return 10 + 20 * (n2 - 1);
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
        if (abu2.b() instanceof zs) {
            return true;
        }
        return super.a(abu2);
    }

    @Override
    public void b(rm rm2, qr qr2, int n2) {
        Random random = rm2.aH();
        abu abu2 = aem.a(aek.k, rm2);
        if (afa.a(n2, random)) {
            qr2.a(qf.a((qr)rm2), (float)afa.b(n2, random));
            qr2.a("damage.thorns", 0.5f, 1.0f);
            if (abu2 != null) {
                abu2.a(3, rm2);
            }
        } else if (abu2 != null) {
            abu2.a(1, rm2);
        }
    }

    public static boolean a(int n2, Random random) {
        if (n2 <= 0) {
            return false;
        }
        return random.nextFloat() < 0.15f * (float)n2;
    }

    public static int b(int n2, Random random) {
        if (n2 > 10) {
            return n2 - 10;
        }
        return 1 + random.nextInt(4);
    }
}

