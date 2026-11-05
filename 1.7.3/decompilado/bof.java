/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class bof
extends bpd {
    private static final brq a = new brq("textures/entity/enderman/enderman_eyes.png");
    private static final brq f = new brq("textures/entity/enderman/enderman.png");
    private bif g;
    private Random h = new Random();

    public bof() {
        super(new bif(), 0.5f);
        this.g = (bif)this.i;
        this.a(this.g);
    }

    public void a(wr wr2, double d2, double d3, double d4, float f2, float f3) {
        this.g.a = wr2.cb().o() != avk.a;
        this.g.b = wr2.cd();
        if (wr2.cd()) {
            double d5 = 0.02;
            d2 += this.h.nextGaussian() * d5;
            d4 += this.h.nextGaussian() * d5;
        }
        super.a(wr2, d2, d3, d4, f2, f3);
    }

    protected brq a(wr wr2) {
        return f;
    }

    protected void a(wr wr2, float f2) {
        super.c(wr2, f2);
        if (wr2.cb().o() != avk.a) {
            GL11.glEnable((int)32826);
            GL11.glPushMatrix();
            float f3 = 0.5f;
            GL11.glTranslatef((float)0.0f, (float)0.6875f, (float)-0.75f);
            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glScalef((float)(-(f3 *= 1.0f)), (float)(-f3), (float)f3);
            int n2 = wr2.c(f2);
            int n3 = n2 % 65536;
            int n4 = n2 / 65536;
            bwg.a(bwg.c, (float)n3 / 1.0f, (float)n4 / 1.0f);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.a(bqs.b);
            this.c.a(wr2.cb(), wr2.cc(), 1.0f);
            GL11.glPopMatrix();
            GL11.glDisable((int)32826);
        }
    }

    protected int a(wr wr2, int n2, float f2) {
        if (n2 != 0) {
            return -1;
        }
        this.a(a);
        float f3 = 1.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        GL11.glBlendFunc((int)1, (int)1);
        GL11.glDisable((int)2896);
        if (wr2.ao()) {
            GL11.glDepthMask((boolean)false);
        } else {
            GL11.glDepthMask((boolean)true);
        }
        int n3 = 61680;
        int n4 = n3 % 65536;
        int n5 = n3 / 65536;
        bwg.a(bwg.c, (float)n4 / 1.0f, (float)n5 / 1.0f);
        GL11.glEnable((int)2896);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f3);
        return 1;
    }

    @Override
    protected /* synthetic */ void c(rm rm2, float f2) {
        this.a((wr)rm2, f2);
    }
}

