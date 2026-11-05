/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

class bdv
extends bau {
    private final boolean o;

    public bdv(int n2, int n3, int n4, boolean bl2) {
        super(n2, n3, n4, 23, 13, "");
        this.o = bl2;
    }

    @Override
    public void a(azi azi2, int n2, int n3) {
        if (!this.m) {
            return;
        }
        boolean bl2 = n2 >= this.h && n3 >= this.i && n2 < this.h + this.f && n3 < this.i + this.g;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        azi2.P().a(bdu.g());
        int n4 = 0;
        int n5 = 192;
        if (bl2) {
            n4 += 23;
        }
        if (!this.o) {
            n5 += 13;
        }
        this.b(this.h, this.i, n4, n5, 23, 13);
    }
}

