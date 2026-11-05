/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpv
extends bpd {
    private static final brq a = new brq("textures/entity/wither/wither_invulnerable.png");
    private static final brq f = new brq("textures/entity/wither/wither.png");
    private int g;

    public bpv() {
        super(new bji(), 1.0f);
        this.g = ((bji)this.i).a();
    }

    public void a(vt vt2, double d2, double d3, double d4, float f2, float f3) {
        bmg.a(vt2, true);
        int n2 = ((bji)this.i).a();
        if (n2 != this.g) {
            this.g = n2;
            this.i = new bji();
        }
        super.a(vt2, d2, d3, d4, f2, f3);
    }

    protected brq a(vt vt2) {
        int n2 = vt2.ca();
        if (n2 <= 0 || n2 <= 80 && n2 / 5 % 2 == 1) {
            return f;
        }
        return a;
    }

    protected void a(vt vt2, float f2) {
        int n2 = vt2.ca();
        if (n2 > 0) {
            float f3 = 2.0f - ((float)n2 - f2) / 220.0f * 0.5f;
            GL11.glScalef((float)f3, (float)f3, (float)f3);
        } else {
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        }
    }

    protected int a(vt vt2, int n2, float f2) {
        if (vt2.cb()) {
            if (vt2.ao()) {
                GL11.glDepthMask((boolean)false);
            } else {
                GL11.glDepthMask((boolean)true);
            }
            if (n2 == 1) {
                float f3 = (float)vt2.aa + f2;
                this.a(a);
                GL11.glMatrixMode((int)5890);
                GL11.glLoadIdentity();
                float f4 = oy.b(f3 * 0.02f) * 3.0f;
                float f5 = f3 * 0.01f;
                GL11.glTranslatef((float)f4, (float)f5, (float)0.0f);
                this.a(this.i);
                GL11.glMatrixMode((int)5888);
                GL11.glEnable((int)3042);
                float f6 = 0.5f;
                GL11.glColor4f((float)f6, (float)f6, (float)f6, (float)1.0f);
                GL11.glDisable((int)2896);
                GL11.glBlendFunc((int)1, (int)1);
                GL11.glTranslatef((float)0.0f, (float)-0.01f, (float)0.0f);
                GL11.glScalef((float)1.1f, (float)1.1f, (float)1.1f);
                return 1;
            }
            if (n2 == 2) {
                GL11.glMatrixMode((int)5890);
                GL11.glLoadIdentity();
                GL11.glMatrixMode((int)5888);
                GL11.glEnable((int)2896);
                GL11.glDisable((int)3042);
            }
        }
        return -1;
    }

    protected int b(vt vt2, int n2, float f2) {
        return -1;
    }
}

