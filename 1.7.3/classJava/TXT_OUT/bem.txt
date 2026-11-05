/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

class bem
extends bau {
    private final boolean o;

    public bem(int n2, int n3, int n4, boolean bl2) {
        super(n2, n3, n4, 12, 19, "");
        this.o = bl2;
    }

    @Override
    public void a(azi azi2, int n2, int n3) {
        if (!this.m) {
            return;
        }
        azi2.P().a(bel.h());
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        boolean bl2 = n2 >= this.h && n3 >= this.i && n2 < this.h + this.f && n3 < this.i + this.g;
        int n4 = 0;
        int n5 = 176;
        if (!this.l) {
            n5 += this.f * 2;
        } else if (bl2) {
            n5 += this.f;
        }
        if (!this.o) {
            n4 += this.g;
        }
        this.b(this.h, this.i, n5, n4, this.f, this.g);
    }
}

