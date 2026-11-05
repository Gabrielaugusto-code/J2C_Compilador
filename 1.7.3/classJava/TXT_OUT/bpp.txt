/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpp
extends bpd {
    private static final brq a = new brq("textures/entity/squid.png");

    public bpp(bim bim2, float f2) {
        super(bim2, f2);
    }

    public void a(vj vj2, double d2, double d3, double d4, float f2, float f3) {
        super.a(vj2, d2, d3, d4, f2, f3);
    }

    protected brq a(vj vj2) {
        return a;
    }

    protected void a(vj vj2, float f2, float f3, float f4) {
        float f5 = vj2.bq + (vj2.bp - vj2.bq) * f4;
        float f6 = vj2.bs + (vj2.br - vj2.bs) * f4;
        GL11.glTranslatef((float)0.0f, (float)0.5f, (float)0.0f);
        GL11.glRotatef((float)(180.0f - f3), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)f5, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)f6, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glTranslatef((float)0.0f, (float)-1.2f, (float)0.0f);
    }

    protected float a(vj vj2, float f2) {
        return vj2.bw + (vj2.bv - vj2.bw) * f2;
    }

    @Override
    protected /* synthetic */ float b(rm rm2, float f2) {
        return this.a((vj)rm2, f2);
    }
}

