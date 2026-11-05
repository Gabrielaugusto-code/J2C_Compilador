/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bnl
extends bne {
    private static final brq c = new brq("textures/entity/skeleton/skeleton.png");
    private static final brq d = new brq("textures/entity/skeleton/wither_skeleton.png");
    private static final brq e = new brq("textures/entity/zombie/zombie.png");
    private static final brq f = new brq("textures/entity/creeper/creeper.png");
    public static bnl b;
    private biw g = new biw(0, 0, 64, 32);
    private biw h = new biw(0, 0, 64, 64);

    public void a(aoe aoe2, double d2, double d3, double d4, float f2) {
        this.a((float)d2, (float)d3, (float)d4, aoe2.p() & 7, (float)(aoe2.b() * 360) / 16.0f, aoe2.a(), aoe2.c());
    }

    @Override
    public void a(bnd bnd2) {
        super.a(bnd2);
        b = this;
    }

    public void a(float f2, float f3, float f4, int n2, float f5, int n3, String string) {
        biw biw2 = this.g;
        switch (n3) {
            default: {
                this.a(c);
                break;
            }
            case 1: {
                this.a(d);
                break;
            }
            case 2: {
                this.a(e);
                biw2 = this.h;
                break;
            }
            case 3: {
                brq brq2 = bma.b;
                if (string != null && string.length() > 0) {
                    brq2 = bma.g(string);
                    bma.a(brq2, string);
                }
                this.a(brq2);
                break;
            }
            case 4: {
                this.a(f);
            }
        }
        GL11.glPushMatrix();
        GL11.glDisable((int)2884);
        if (n2 != 1) {
            switch (n2) {
                case 2: {
                    GL11.glTranslatef((float)(f2 + 0.5f), (float)(f3 + 0.25f), (float)(f4 + 0.74f));
                    break;
                }
                case 3: {
                    GL11.glTranslatef((float)(f2 + 0.5f), (float)(f3 + 0.25f), (float)(f4 + 0.26f));
                    f5 = 180.0f;
                    break;
                }
                case 4: {
                    GL11.glTranslatef((float)(f2 + 0.74f), (float)(f3 + 0.25f), (float)(f4 + 0.5f));
                    f5 = 270.0f;
                    break;
                }
                default: {
                    GL11.glTranslatef((float)(f2 + 0.26f), (float)(f3 + 0.25f), (float)(f4 + 0.5f));
                    f5 = 90.0f;
                    break;
                }
            }
        } else {
            GL11.glTranslatef((float)(f2 + 0.5f), (float)f3, (float)(f4 + 0.5f));
        }
        float f6 = 0.0625f;
        GL11.glEnable((int)32826);
        GL11.glScalef((float)-1.0f, (float)-1.0f, (float)1.0f);
        GL11.glEnable((int)3008);
        ((bim)biw2).a(null, 0.0f, 0.0f, 0.0f, f5, 0.0f, f6);
        GL11.glPopMatrix();
    }
}

