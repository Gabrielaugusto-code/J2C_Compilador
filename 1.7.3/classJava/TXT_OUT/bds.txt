/*
 * Decompiled with CFR 0.152.
 */
class bds
extends bdt {
    private final int p;
    private final int q;
    final /* synthetic */ bdp o;

    public bds(bdp bdp2, int n2, int n3, int n4, int n5, int n6) {
        this.o = bdp2;
        super(n2, n3, n4, bdn.a, 0 + qm.a[n5].e() % 8 * 18, 198 + qm.a[n5].e() / 8 * 18);
        this.p = n5;
        this.q = n6;
    }

    @Override
    public void b(int n2, int n3) {
        String string = bsc.a(qm.a[this.p].a(), new Object[0]);
        if (this.q >= 3 && this.p != qm.l.H) {
            string = string + " II";
        }
        bdp.a(this.o, string, n2, n3);
    }
}

