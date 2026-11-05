/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bnv
extends bpd {
    private static final brq a = new brq("textures/entity/bat.png");
    private int f;

    public bnv() {
        super(new bhx(), 0.25f);
        this.f = ((bhx)this.i).a();
    }

    public void a(uv uv2, double d2, double d3, double d4, float f2, float f3) {
        int n2 = ((bhx)this.i).a();
        if (n2 != this.f) {
            this.f = n2;
            this.i = new bhx();
        }
        super.a(uv2, d2, d3, d4, f2, f3);
    }

    protected brq a(uv uv2) {
        return a;
    }

    protected void a(uv uv2, float f2) {
        GL11.glScalef((float)0.35f, (float)0.35f, (float)0.35f);
    }

    protected void a(uv uv2, double d2, double d3, double d4) {
        super.a((rm)uv2, d2, d3, d4);
    }

    protected void a(uv uv2, float f2, float f3, float f4) {
        if (!uv2.bP()) {
            GL11.glTranslatef((float)0.0f, (float)(oy.b(f2 * 0.3f) * 0.1f), (float)0.0f);
        } else {
            GL11.glTranslatef((float)0.0f, (float)-0.1f, (float)0.0f);
        }
        super.a((rm)uv2, f2, f3, f4);
    }
}

