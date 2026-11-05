/*
 * Decompiled with CFR 0.152.
 */
public class bgv
implements bbb {
    private final bgt c;
    protected final azi a;
    protected final bto b;
    private long d = 0L;

    protected bgv(bgt bgt2, bto bto2) {
        this.c = bgt2;
        this.b = bto2;
        this.a = azi.B();
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, bna bna2, int n7, int n8, boolean bl2) {
        this.a.l.b(bsc.a("lanServer.title", new Object[0]), n3 + 32 + 3, n4 + 1, 0xFFFFFF);
        this.a.l.b(this.b.a(), n3 + 32 + 3, n4 + 12, 0x808080);
        if (this.a.u.v) {
            this.a.l.b(bsc.a("selectServer.hiddenAddress", new Object[0]), n3 + 32 + 3, n4 + 12 + 11, 0x303030);
        } else {
            this.a.l.b(this.b.b(), n3 + 32 + 3, n4 + 12 + 11, 0x303030);
        }
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.c.a(n2);
        if (azi.K() - this.d < 250L) {
            this.c.h();
        }
        this.d = azi.K();
        return false;
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    public bto a() {
        return this.b;
    }
}

