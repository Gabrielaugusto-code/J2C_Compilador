/*
 * Decompiled with CFR 0.152.
 */
public class aez
extends aek {
    private static final String[] E = new String[]{"all", "fire", "fall", "explosion", "projectile"};
    private static final int[] F = new int[]{1, 10, 5, 5, 3};
    private static final int[] G = new int[]{11, 8, 6, 8, 6};
    private static final int[] H = new int[]{20, 12, 10, 12, 15};
    public final int a;

    public aez(int n2, int n3, int n4) {
        super(n2, n3, ael.b);
        this.a = n4;
        if (n4 == 2) {
            this.C = ael.c;
        }
    }

    @Override
    public int a(int n2) {
        return F[this.a] + (n2 - 1) * G[this.a];
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + H[this.a];
    }

    @Override
    public int b() {
        return 4;
    }

    @Override
    public int a(int n2, qf qf2) {
        if (qf2.g()) {
            return 0;
        }
        float f2 = (float)(6 + n2 * n2) / 3.0f;
        if (this.a == 0) {
            return oy.d(f2 * 0.75f);
        }
        if (this.a == 1 && qf2.o()) {
            return oy.d(f2 * 1.25f);
        }
        if (this.a == 2 && qf2 == qf.h) {
            return oy.d(f2 * 2.5f);
        }
        if (this.a == 3 && qf2.c()) {
            return oy.d(f2 * 1.5f);
        }
        if (this.a == 4 && qf2.a()) {
            return oy.d(f2 * 1.5f);
        }
        return 0;
    }

    @Override
    public String a() {
        return "enchantment.protect." + E[this.a];
    }

    @Override
    public boolean a(aek aek2) {
        if (aek2 instanceof aez) {
            aez aez2 = (aez)aek2;
            if (aez2.a == this.a) {
                return false;
            }
            return this.a == 2 || aez2.a == 2;
        }
        return super.a(aek2);
    }

    public static int a(qr qr2, int n2) {
        int n3 = aem.a(aek.e.B, qr2.aj());
        if (n3 > 0) {
            n2 -= oy.d((float)n2 * ((float)n3 * 0.15f));
        }
        return n2;
    }

    public static double a(qr qr2, double d2) {
        int n2 = aem.a(aek.g.B, qr2.aj());
        if (n2 > 0) {
            d2 -= (double)oy.c(d2 * (double)((float)n2 * 0.15f));
        }
        return d2;
    }
}

