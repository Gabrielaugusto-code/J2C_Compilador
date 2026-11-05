/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bps
extends bpd {
    private static final brq a = new brq("textures/entity/iron_golem.png");
    private final bje f;

    public bps() {
        super(new bje(), 0.5f);
        this.f = (bje)this.i;
    }

    public void a(vk vk2, double d2, double d3, double d4, float f2, float f3) {
        super.a(vk2, d2, d3, d4, f2, f3);
    }

    protected brq a(vk vk2) {
        return a;
    }

    protected void a(vk vk2, float f2, float f3, float f4) {
        super.a((rm)vk2, f2, f3, f4);
        if ((double)vk2.aF < 0.01) {
            return;
        }
        float f5 = 13.0f;
        float f6 = vk2.aG - vk2.aF * (1.0f - f4) + 6.0f;
        float f7 = (Math.abs(f6 % f5 - f5 * 0.5f) - f5 * 0.25f) / (f5 * 0.25f);
        GL11.glRotatef((float)(6.5f * f7), (float)0.0f, (float)0.0f, (float)1.0f);
    }

    protected void a(vk vk2, float f2) {
        super.c(vk2, f2);
        if (vk2.cb() == 0) {
            return;
        }
        GL11.glEnable((int)32826);
        GL11.glPushMatrix();
        GL11.glRotatef((float)(5.0f + 180.0f * this.f.c.f / (float)Math.PI), (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glTranslatef((float)-0.6875f, (float)1.25f, (float)-0.9375f);
        GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        float f3 = 0.8f;
        GL11.glScalef((float)f3, (float)(-f3), (float)f3);
        int n2 = vk2.c(f2);
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        bwg.a(bwg.c, (float)n3 / 1.0f, (float)n4 / 1.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.a(bqs.b);
        this.c.a((ahz)aie.O, 0, 1.0f);
        GL11.glPopMatrix();
        GL11.glDisable((int)32826);
    }

    @Override
    protected /* synthetic */ void c(rm rm2, float f2) {
        this.a((vk)rm2, f2);
    }
}

