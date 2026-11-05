/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class beh
extends bdn {
    private static final brq u = new brq("textures/gui/container/furnace.png");
    private anx v;

    public beh(xo xo2, anx anx2) {
        super(new za(xo2, anx2));
        this.v = anx2;
    }

    @Override
    protected void b(int n2, int n3) {
        String string = this.v.k_() ? this.v.b() : bsc.a(this.v.b(), new Object[0]);
        this.q.b(string, this.f / 2 - this.q.a(string) / 2, 6, 0x404040);
        this.q.b(bsc.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 0x404040);
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.k.P().a(u);
        int n4 = (this.l - this.f) / 2;
        int n5 = (this.m - this.g) / 2;
        this.b(n4, n5, 0, 0, this.f, this.g);
        if (this.v.i()) {
            int n6 = this.v.e(13);
            this.b(n4 + 56, n5 + 36 + 12 - n6, 176, 12 - n6, 14, n6 + 1);
            n6 = this.v.d(24);
            this.b(n4 + 79, n5 + 34, 176, 14, n6 + 1, 16);
        }
    }
}

