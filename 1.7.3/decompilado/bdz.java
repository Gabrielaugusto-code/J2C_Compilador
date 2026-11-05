/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bdz
extends bdn {
    private static final brq u = new brq("textures/gui/container/crafting_table.png");

    public bdz(xo xo2, afs afs2, int n2, int n3, int n4) {
        super(new yw(xo2, afs2, n2, n3, n4));
    }

    @Override
    protected void b(int n2, int n3) {
        this.q.b(bsc.a("container.crafting", new Object[0]), 28, 6, 0x404040);
        this.q.b(bsc.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 0x404040);
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

