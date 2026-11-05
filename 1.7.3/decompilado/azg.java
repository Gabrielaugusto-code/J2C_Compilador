/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class azg {
    private static FloatBuffer a = azh.h(16);
    private static final ayp b = ayp.a(0.2f, 1.0, -0.7f).a();
    private static final ayp c = ayp.a(-0.2f, 1.0, 0.7f).a();

    public static void a() {
        GL11.glDisable((int)2896);
        GL11.glDisable((int)16384);
        GL11.glDisable((int)16385);
        GL11.glDisable((int)2903);
    }

    public static void b() {
        GL11.glEnable((int)2896);
        GL11.glEnable((int)16384);
        GL11.glEnable((int)16385);
        GL11.glEnable((int)2903);
        GL11.glColorMaterial((int)1032, (int)5634);
        float f2 = 0.4f;
        float f3 = 0.6f;
        float f4 = 0.0f;
        GL11.glLight((int)16384, (int)4611, (FloatBuffer)azg.a(azg.b.c, azg.b.d, azg.b.e, 0.0));
        GL11.glLight((int)16384, (int)4609, (FloatBuffer)azg.a(f3, f3, f3, 1.0f));
        GL11.glLight((int)16384, (int)4608, (FloatBuffer)azg.a(0.0f, 0.0f, 0.0f, 1.0f));
        GL11.glLight((int)16384, (int)4610, (FloatBuffer)azg.a(f4, f4, f4, 1.0f));
        GL11.glLight((int)16385, (int)4611, (FloatBuffer)azg.a(azg.c.c, azg.c.d, azg.c.e, 0.0));
        GL11.glLight((int)16385, (int)4609, (FloatBuffer)azg.a(f3, f3, f3, 1.0f));
        GL11.glLight((int)16385, (int)4608, (FloatBuffer)azg.a(0.0f, 0.0f, 0.0f, 1.0f));
        GL11.glLight((int)16385, (int)4610, (FloatBuffer)azg.a(f4, f4, f4, 1.0f));
        GL11.glShadeModel((int)7424);
        GL11.glLightModel((int)2899, (FloatBuffer)azg.a(f2, f2, f2, 1.0f));
    }

    private static FloatBuffer a(double d2, double d3, double d4, double d5) {
        return azg.a((float)d2, (float)d3, (float)d4, (float)d5);
    }

    private static FloatBuffer a(float f2, float f3, float f4, float f5) {
        a.clear();
        a.put(f2).put(f3).put(f4).put(f5);
        a.flip();
        return a;
    }

    public static void c() {
        GL11.glPushMatrix();
        GL11.glRotatef((float)-30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)165.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        azg.b();
        GL11.glPopMatrix();
    }
}

