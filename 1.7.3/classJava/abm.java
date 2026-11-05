/*
 * Decompiled with CFR 0.152.
 */
public class abm
extends abs {
    private pw a;

    public abm() {
        this.f(64);
        this.e(1);
        this.a(aak.i);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public abu a(abu abu2, afs afs2, xq xq2) {
        if (xq2.bK != null) {
            int n2 = xq2.bK.e();
            abu2.a(n2, (rm)xq2);
            xq2.aZ();
        } else {
            afs2.a((qr)xq2, "random.bow", 0.5f, 0.4f / (g.nextFloat() * 0.4f + 0.8f));
            if (!afs2.E) {
                afs2.d(new vv(afs2, xq2));
            }
            xq2.aZ();
        }
        return abu2;
    }

    @Override
    public void a(px px2) {
        this.k = px2.a(this.w() + "_uncast");
        this.a = px2.a(this.w() + "_cast");
    }

    public pw i() {
        return this.a;
    }

    @Override
    public boolean e_(abu abu2) {
        return super.e_(abu2);
    }

    @Override
    public int c() {
        return 1;
    }
}

