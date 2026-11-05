/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.GLU
 */
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class azd {
    public static float a;
    public static float b;
    public static float c;
    private static IntBuffer i;
    private static FloatBuffer j;
    private static FloatBuffer k;
    private static FloatBuffer l;
    public static float d;
    public static float e;
    public static float f;
    public static float g;
    public static float h;

    public static void a(xq xq2, boolean bl2) {
        GL11.glGetFloat((int)2982, (FloatBuffer)j);
        GL11.glGetFloat((int)2983, (FloatBuffer)k);
        GL11.glGetInteger((int)2978, (IntBuffer)i);
        float f2 = (i.get(0) + i.get(2)) / 2;
        float f3 = (i.get(1) + i.get(3)) / 2;
        GLU.gluUnProject((float)f2, (float)f3, (float)0.0f, (FloatBuffer)j, (FloatBuffer)k, (IntBuffer)i, (FloatBuffer)l);
        a = l.get(0);
        b = l.get(1);
        c = l.get(2);
        int n2 = bl2 ? 1 : 0;
        float f4 = xq2.z;
        float f5 = xq2.y;
        d = oy.b(f5 * (float)Math.PI / 180.0f) * (float)(1 - n2 * 2);
        f = oy.a(f5 * (float)Math.PI / 180.0f) * (float)(1 - n2 * 2);
        g = -f * oy.a(f4 * (float)Math.PI / 180.0f) * (float)(1 - n2 * 2);
        h = d * oy.a(f4 * (float)Math.PI / 180.0f) * (float)(1 - n2 * 2);
        e = oy.b(f4 * (float)Math.PI / 180.0f);
    }

    public static ayp b(rm rm2, double d2) {
        double d3 = rm2.p + (rm2.s - rm2.p) * d2;
        double d4 = rm2.q + (rm2.t - rm2.q) * d2 + (double)rm2.g();
        double d5 = rm2.r + (rm2.u - rm2.r) * d2;
        double d6 = d3 + (double)(a * 1.0f);
        double d7 = d4 + (double)(b * 1.0f);
        double d8 = d5 + (double)(c * 1.0f);
        return rm2.o.V().a(d6, d7, d8);
    }

    public static ahz a(afs afs2, rm rm2, float f2) {
        float f3;
        float f4;
        ayp ayp2 = azd.b(rm2, f2);
        afk afk2 = new afk(ayp2);
        ahz ahz2 = afs2.a(afk2.a, afk2.b, afk2.c);
        if (ahz2.o().d() && ayp2.d >= (double)(f4 = (float)(afk2.b + 1) - (f3 = akn.b(afs2.e(afk2.a, afk2.b, afk2.c)) - 0.11111111f))) {
            ahz2 = afs2.a(afk2.a, afk2.b + 1, afk2.c);
        }
        return ahz2;
    }

    static {
        i = azh.f(16);
        j = azh.h(16);
        k = azh.h(16);
        l = azh.h(3);
    }
}

