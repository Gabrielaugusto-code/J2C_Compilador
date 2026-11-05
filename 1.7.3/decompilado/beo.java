/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class beo
extends bdn {
    private static final brq v = new brq("textures/gui/container/dispenser.png");
    public ans u;

    public beo(xo xo2, ans ans2) {
        super(new zq(xo2, ans2));
        this.u = ans2;
    }

    @Override
    protected void b(int n2, int n3) {
        String string = this.u.k_() ? this.u.b() : bsc.a(this.u.b(), new Object[0]);
        this.q.b(string, this.f / 2 - this.q.a(string) / 2, 6, 0x404040);
        this.q.b(bsc.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 0x404040);
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.k.P().a(v);
        int n4 = (this.l - this.f) / 2;
        int n5 = (this.m - this.g) / 2;
        this.b(n4, n5, 0, 0, this.f, this.g);
    }
}

