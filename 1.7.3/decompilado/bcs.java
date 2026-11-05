/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

class bcs
extends bau {
    private final w r;
    private final String s;
    public float o;
    public boolean p;
    final /* synthetic */ bcr q;

    public bcs(bcr bcr2, int n2, int n3, int n4, w w2, boolean bl2) {
        this.q = bcr2;
        super(n2, n3, n4, bl2 ? 310 : 150, 20, "");
        this.o = 1.0f;
        this.r = w2;
        this.s = bsc.a("soundCategory." + w2.a(), new Object[0]);
        this.j = this.s + ": " + bcr2.a(w2);
        this.o = bcr.a(bcr2).a(w2);
    }

    @Override
    protected int a(boolean bl2) {
        return 0;
    }

    @Override
    protected void b(azi azi2, int n2, int n3) {
        if (!this.m) {
            return;
        }
        if (this.p) {
            this.o = (float)(n2 - (this.h + 4)) / (float)(this.f - 8);
            if (this.o < 0.0f) {
                this.o = 0.0f;
            }
            if (this.o > 1.0f) {
                this.o = 1.0f;
            }
            azi2.u.a(this.r, this.o);
            azi2.u.b();
            this.j = this.s + ": " + this.q.a(this.r);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.b(this.h + (int)(this.o * (float)(this.f - 8)), this.i, 0, 66, 4, 20);
        this.b(this.h + (int)(this.o * (float)(this.f - 8)) + 4, this.i, 196, 66, 4, 20);
    }

    @Override
    public boolean c(azi azi2, int n2, int n3) {
        if (super.c(azi2, n2, n3)) {
            this.o = (float)(n2 - (this.h + 4)) / (float)(this.f - 8);
            if (this.o < 0.0f) {
                this.o = 0.0f;
            }
            if (this.o > 1.0f) {
                this.o = 1.0f;
            }
            azi2.u.a(this.r, this.o);
            azi2.u.b();
            this.j = this.s + ": " + this.q.a(this.r);
            this.p = true;
            return true;
        }
        return false;
    }

    @Override
    public void a(buc buc2) {
    }

    @Override
    public void a(int n2, int n3) {
        if (this.p) {
            float f2 = this.r == w.a ? 1.0f : bcr.a(this.q).a(this.r);
            this.q.k.X().a(btb.a(new brq("gui.button.press"), 1.0f));
        }
        this.p = false;
    }
}

