/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bdy
extends bdn {
    private static final brq u = new brq("textures/gui/container/generic_54.png");
    private ps v;
    private ps w;
    private int x;

    public bdy(ps ps2, ps ps3) {
        super(new yu(ps2, ps3));
        this.v = ps2;
        this.w = ps3;
        this.p = false;
        int n2 = 222;
        int n3 = n2 - 108;
        this.x = ps3.a() / 9;
        this.g = n3 + this.x * 18;
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
        this.b(n4, n5, 0, 0, this.f, this.x * 18 + 17);
        this.b(n4, n5 + this.x * 18 + 17, 0, 126, this.f, 96);
    }
}

