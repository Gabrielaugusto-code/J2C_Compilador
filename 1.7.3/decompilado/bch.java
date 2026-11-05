/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

class bch
extends bbf {
    public int k;
    final /* synthetic */ bcf l;

    public bch(bcf bcf2) {
        this.l = bcf2;
        super(bcf2.k, bcf2.l, bcf2.m, 80, bcf2.m - 37, 24);
        this.k = -1;
    }

    private void a(int n2, int n3, abs abs2) {
        this.e(n2 + 1, n3 + 1);
        GL11.glEnable((int)32826);
        azg.c();
        bcf.h().a(this.l.q, this.l.k.P(), new abu(abs2, 1, 0), n2 + 2, n3 + 2);
        azg.a();
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
        bna2.a(n2 + 0, n3 + 18, bcf.a(this.l), (float)(n4 + 0) * 0.0078125f, (float)(n5 + 18) * 0.0078125f);
        bna2.a(n2 + 18, n3 + 18, bcf.b(this.l), (float)(n4 + 18) * 0.0078125f, (float)(n5 + 18) * 0.0078125f);
        bna2.a(n2 + 18, n3 + 0, bcf.c(this.l), (float)(n4 + 18) * 0.0078125f, (float)(n5 + 0) * 0.0078125f);
        bna2.a(n2 + 0, n3 + 0, bcf.d(this.l), (float)(n4 + 0) * 0.0078125f, (float)(n5 + 0) * 0.0078125f);
        bna2.a();
    }

    @Override
    protected int b() {
        return bcf.i().size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.k = n2;
        this.l.g();
        bcf.f(this.l).a(((bcg)bcf.i().get((int)bcf.e((bcf)this.l).k)).c);
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
        bcg bcg2 = (bcg)bcf.i().get(n2);
        this.a(n3, n4, bcg2.a);
        this.l.q.b(bcg2.b, n3 + 18 + 5, n4 + 6, 0xFFFFFF);
    }
}

