/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

class bdt
extends bau {
    private final brq o;
    private final int p;
    private final int q;
    private boolean r;

    protected bdt(int n2, int n3, int n4, brq brq2, int n5, int n6) {
        super(n2, n3, n4, 22, 22, "");
        this.o = brq2;
        this.p = n5;
        this.q = n6;
    }

    @Override
    public void a(azi azi2, int n2, int n3) {
        if (!this.m) {
            return;
        }
        azi2.P().a(bdp.g());
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.n = n2 >= this.h && n3 >= this.i && n2 < this.h + this.f && n3 < this.i + this.g;
        int n4 = 219;
        int n5 = 0;
        if (!this.l) {
            n5 += this.f * 2;
        } else if (this.r) {
            n5 += this.f * 1;
        } else if (this.n) {
            n5 += this.f * 3;
        }
        this.b(this.h, this.i, n5, n4, this.f, this.g);
        if (!bdp.g().equals(this.o)) {
            azi2.P().a(this.o);
        }
        this.b(this.h + 2, this.i + 2, this.p, this.q, 18, 18);
    }

    public boolean c() {
        return this.r;
    }

    public void b(boolean bl2) {
        this.r = bl2;
    }
}

