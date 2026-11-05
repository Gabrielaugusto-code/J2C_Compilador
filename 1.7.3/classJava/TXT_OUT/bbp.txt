/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

class bbp
extends bbf {
    public int k;
    final /* synthetic */ bbo l;

    public bbp(bbo bbo2) {
        this.l = bbo2;
        super(bbo2.k, bbo2.l, bbo2.m, 43, bbo2.m - 60, 24);
        this.k = -1;
    }

    private void a(int n2, int n3, abu abu2) {
        this.e(n2 + 1, n3 + 1);
        GL11.glEnable((int)32826);
        if (abu2 != null) {
            azg.c();
            bbo.h().a(this.l.q, this.l.k.P(), abu2, n2 + 2, n3 + 2);
            azg.a();
        }
        GL11.glDisable((int)32826);
    }

    private void e(int n2, int n3) {
        this.c(n2, n3, 0, 0);
    }

    private void c(int n2, int n3, int n4, int n5) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.l.k.P().a(bap.c);
        float f2 = 0.0078125f;
        float f3 = 0.0078125f;
        int n6 = 18;
        int n7 = 18;
        bna bna2 = bna.a;
        bna2.b();
        bna2.a(n2 + 0, n3 + 18, bbo.a(this.l), (float)(n4 + 0) * 0.0078125f, (float)(n5 + 18) * 0.0078125f);
        bna2.a(n2 + 18, n3 + 18, bbo.b(this.l), (float)(n4 + 18) * 0.0078125f, (float)(n5 + 18) * 0.0078125f);
        bna2.a(n2 + 18, n3 + 0, bbo.c(this.l), (float)(n4 + 18) * 0.0078125f, (float)(n5 + 0) * 0.0078125f);
        bna2.a(n2 + 0, n3 + 0, bbo.d(this.l), (float)(n4 + 0) * 0.0078125f, (float)(n5 + 0) * 0.0078125f);
        bna2.a();
    }

    @Override
    protected int b() {
        return bbo.e(this.l).c().size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.k = n2;
        this.l.g();
    }

    @Override
    protected boolean a(int n2) {
        return n2 == this.k;
    }

    @Override
    protected void a() {
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, bna bna2, int n6, int n7) {
        ark ark2 = (ark)bbo.e(this.l).c().get(bbo.e(this.l).c().size() - n2 - 1);
        abs abs2 = abs.a(ark2.b());
        abu abu2 = ark2.b() == aie.a ? null : new abu(abs2, 1, ark2.c());
        String string = abu2 == null || abs2 == null ? "Air" : abs2.n(abu2);
        this.a(n3, n4, abu2);
        this.l.q.b(string, n3 + 18 + 5, n4 + 3, 0xFFFFFF);
        String string2 = n2 == 0 ? bsc.a("createWorld.customize.flat.layer.top", ark2.a()) : (n2 == bbo.e(this.l).c().size() - 1 ? bsc.a("createWorld.customize.flat.layer.bottom", ark2.a()) : bsc.a("createWorld.customize.flat.layer", ark2.a()));
        this.l.q.b(string2, n3 + 2 + 213 - this.l.q.a(string2), n4 + 3, 0xFFFFFF);
    }

    @Override
    protected int d() {
        return this.a - 70;
    }
}

