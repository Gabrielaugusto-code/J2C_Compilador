/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bej
extends bdn {
    private static final brq u = new brq("textures/gui/container/horse.png");
    private ps v;
    private ps w;
    private uz x;
    private float y;
    private float z;

    public bej(ps ps2, ps ps3, uz uz2) {
        super(new zd(ps2, ps3, uz2));
        this.v = ps2;
        this.w = ps3;
        this.x = uz2;
        this.p = false;
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
        if (this.x.ck()) {
            this.b(n4 + 79, n5 + 17, 0, this.g, 90, 54);
        }
        if (this.x.cB()) {
            this.b(n4 + 7, n5 + 35, 0, this.g + 54, 18, 18);
        }
        bek.a(n4 + 51, n5 + 60, 17, (float)(n4 + 51) - this.y, (float)(n5 + 75 - 50) - this.z, this.x);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.y = n2;
        this.z = n3;
        super.a(n2, n3, f2);
    }
}

