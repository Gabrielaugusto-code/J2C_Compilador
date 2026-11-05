/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bay
extends bau {
    public bay(int n2, int n3, int n4) {
        super(n2, n3, n4, 20, 20, "");
    }

    @Override
    public void a(azi azi2, int n2, int n3) {
        if (!this.m) {
            return;
        }
        azi2.P().a(bau.a);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        boolean bl2 = n2 >= this.h && n3 >= this.i && n2 < this.h + this.f && n3 < this.i + this.g;
        int n4 = 106;
        if (bl2) {
            n4 += this.g;
        }
        this.b(this.h, this.i, 0, n4, this.f, this.g);
    }
}

