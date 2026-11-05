/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bob
extends bpd {
    private static final brq a = new brq("textures/entity/creeper/creeper_armor.png");
    private static final brq f = new brq("textures/entity/creeper/creeper.png");
    private bim g = new bie(2.0f);

    public bob() {
        super(new bie(), 0.5f);
    }

    protected void a(wq wq2, float f2) {
        float f3 = wq2.a(f2);
        float f4 = 1.0f + oy.a(f3 * 100.0f) * f3 * 0.01f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        f3 *= f3;
        f3 *= f3;
        float f5 = (1.0f + f3 * 0.4f) * f4;
        float f6 = (1.0f + f3 * 0.1f) / f4;
        GL11.glScalef((float)f5, (float)f6, (float)f5);
    }

    protected int a(wq wq2, float f2, float f3) {
        float f4 = wq2.a(f3);
        if ((int)(f4 * 10.0f) % 2 == 0) {
            return 0;
        }
        int n2 = (int)(f4 * 0.2f * 255.0f);
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 > 255) {
            n2 = 255;
        }
        int n3 = 255;
        int n4 = 255;
        int n5 = 255;
        return n2 << 24 | n3 << 16 | n4 << 8 | n5;
    }

    protected int a(wq wq2, int n2, float f2) {
        if (wq2.bZ()) {
            if (wq2.ao()) {
                GL11.glDepthMask((boolean)false);
            } else {
                GL11.glDepthMask((boolean)true);
            }
            if (n2 == 1) {
                float f3 = (float)wq2.aa + f2;
                this.a(a);
                GL11.glMatrixMode((int)5890);
                GL11.glLoadIdentity();
                float f4 = f3 * 0.01f;
                float f5 = f3 * 0.01f;
                GL11.glTranslatef((float)f4, (float)f5, (float)0.0f);
                this.a(this.g);
                GL11.glMatrixMode((int)5888);
                GL11.glEnable((int)3042);
                float f6 = 0.5f;
                GL11.glColor4f((float)f6, (float)f6, (float)f6, (float)1.0f);
                GL11.glDisable((int)2896);
                GL11.glBlendFunc((int)1, (int)1);
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

    protected int b(wq wq2, int n2, float f2) {
        return -1;
    }

    protected brq a(wq wq2) {
        return f;
    }
}

