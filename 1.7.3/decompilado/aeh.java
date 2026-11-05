/*
 * Decompiled with CFR 0.152.
 */
public class aeh
extends aek {
    private static final String[] E = new String[]{"all", "undead", "arthropods"};
    private static final int[] F = new int[]{1, 5, 5};
    private static final int[] G = new int[]{11, 8, 8};
    private static final int[] H = new int[]{20, 20, 20};
    public final int a;

    public aeh(int n2, int n3, int n4) {
        super(n2, n3, ael.g);
        this.a = n4;
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
        return 5;
    }

    @Override
    public float a(int n2, rq rq2) {
        if (this.a == 0) {
            return (float)n2 * 1.25f;
        }
        if (this.a == 1 && rq2 == rq.b) {
            return (float)n2 * 2.5f;
        }
        if (this.a == 2 && rq2 == rq.c) {
            return (float)n2 * 2.5f;
        }
        return 0.0f;
    }

    @Override
    public String a() {
        return "enchantment.damage." + E[this.a];
    }

    @Override
    public boolean a(aek aek2) {
        return !(aek2 instanceof aeh);
    }

    @Override
    public boolean a(abu abu2) {
        if (abu2.b() instanceof zw) {
            return true;
        }
        return super.a(abu2);
    }

    @Override
    public void a(rm rm2, qr qr2, int n2) {
        if (qr2 instanceof rm) {
            rm rm3 = (rm)qr2;
            if (this.a == 2 && rm3.bc() == rq.c) {
                int n3 = 20 + rm2.aH().nextInt(10 * n2);
                rm3.c(new qn(qm.d.H, n3, 3));
            }
        }
    }
}

