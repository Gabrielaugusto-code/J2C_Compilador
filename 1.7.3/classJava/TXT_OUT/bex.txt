/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

class bex
extends bfn {
    final /* synthetic */ bew a;

    public bex(bew bew2) {
        this.a = bew2;
        super(bew.a(bew2), bew.b(bew2), bew.a(bew2, 2), bew.c(bew2) - 8, bew.a(bew2, 10) - bew.a(bew2, 2) - 4, 13);
    }

    @Override
    protected int a() {
        return bew.d((bew)this.a).f.size() + 1;
    }

    @Override
    protected void a(int n2, boolean bl2) {
        if (n2 >= bew.d((bew)this.a).f.size()) {
            return;
        }
        bew.b(this.a, n2);
        bew.e((bew)this.a).l = !bew.d((bew)this.a).h && bew.f(this.a) >= 0;
    }

    @Override
    protected boolean a(int n2) {
        return n2 == bew.f(this.a);
    }

    @Override
    protected int b() {
        return this.a() * 12;
    }

    @Override
    protected void c() {
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, bna bna2) {
        if (n2 < bew.d((bew)this.a).f.size()) {
            this.b(n2, n3, n4, n5, bna2);
        }
    }

    private void b(int n2, int n3, int n4, int n5, bna bna2) {
        String string = (String)bew.d((bew)this.a).f.get(n2);
        this.a.b(bew.g(this.a), string, n3 + 2 + 12, n4 + 1, 0xFFFFFF);
        brq brq2 = bma.e(string);
        bma.a(brq2, string);
        bew.h(this.a).P().a(brq2);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bap.a(n3 + 2, n4 + 1, 8.0f, 8.0f, 8, 8, 8, 8, 64.0f, 32.0f);
    }
}

