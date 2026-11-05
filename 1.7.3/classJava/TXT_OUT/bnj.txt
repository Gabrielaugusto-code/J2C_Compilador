/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bnj
extends bne {
    private bmf b;

    public void a(aoj aoj2, double d2, double d3, double d4, float f2) {
        ahz ahz2 = aoj2.a();
        if (ahz2.o() == avk.a || aoj2.a(f2) >= 1.0f) {
            return;
        }
        bna bna2 = bna.a;
        this.a(bqs.b);
        azg.a();
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)2884);
        if (azi.y()) {
            GL11.glShadeModel((int)7425);
        } else {
            GL11.glShadeModel((int)7424);
        }
        bna2.b();
        bna2.b((double)((float)d2 - (float)aoj2.c + aoj2.b(f2)), (double)((float)d3 - (float)aoj2.d + aoj2.c(f2)), (double)((float)d4 - (float)aoj2.e + aoj2.d(f2)));
        bna2.b(1.0f, 1.0f, 1.0f);
        if (ahz2 == aie.K && aoj2.a(f2) < 0.5f) {
            this.b.a(ahz2, aoj2.c, aoj2.d, aoj2.e, false);
        } else if (aoj2.d() && !aoj2.b()) {
            aie.K.a(((aog)ahz2).e());
            this.b.a((ahz)aie.K, aoj2.c, aoj2.d, aoj2.e, aoj2.a(f2) < 0.5f);
            aie.K.e();
            bna2.b((double)((float)d2 - (float)aoj2.c), (double)((float)d3 - (float)aoj2.d), (double)((float)d4 - (float)aoj2.e));
            this.b.d(ahz2, aoj2.c, aoj2.d, aoj2.e);
        } else {
            this.b.a(ahz2, aoj2.c, aoj2.d, aoj2.e);
        }
        bna2.b(0.0, 0.0, 0.0);
        bna2.a();
        azg.b();
    }

    @Override
    public void a(afs afs2) {
        this.b = new bmf(afs2);
    }
}

