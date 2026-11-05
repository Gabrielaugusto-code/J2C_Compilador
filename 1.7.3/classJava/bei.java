/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bei
extends bdn {
    private static final brq u = new brq("textures/gui/container/hopper.png");
    private ps v;
    private ps w;

    public bei(xo xo2, ps ps2) {
        super(new zc(xo2, ps2));
        this.v = xo2;
        this.w = ps2;
        this.p = false;
        this.g = 133;
    }

    @Override
    protected void b(int n2, int n3) {
        this.q.b(this.w.k_() ? this.w.b() : bsc.a(this.w.b(), new Object[0]), 8, 6, 0x404040);
        this.q.b(this.v.k_() ? this.v.b() : bsc.a(this.v.b(), new Object[0]), 8, this.g - 96 + 2, 0x404040);
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.k.P().a(u);
        int n4 = (this.l - this.f) / 2;
        int n5 = (this.m - this.g) / 2;
        this.b(n4, n5, 0, 0, this.f, this.g);
    }
}

