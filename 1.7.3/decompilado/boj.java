/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class boj
extends boh {
    private final bmf a = new bmf();

    public boj() {
        this.d = 0.5f;
    }

    public void a(wa wa2, double d2, double d3, double d4, float f2, float f3) {
        afs afs2 = wa2.e();
        ahz ahz2 = wa2.f();
        int n2 = oy.c(wa2.s);
        int n3 = oy.c(wa2.t);
        int n4 = oy.c(wa2.u);
        if (ahz2 != null && ahz2 != afs2.a(n2, n3, n4)) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)((float)d2), (float)((float)d3), (float)((float)d4));
            this.b(wa2);
            GL11.glDisable((int)2896);
            if (ahz2 instanceof ahs) {
                this.a.a = afs2;
                bna bna2 = bna.a;
                bna2.b();
                bna2.b((double)((float)(-n2) - 0.5f), (double)((float)(-n3) - 0.5f), (double)((float)(-n4) - 0.5f));
                this.a.a((ahs)ahz2, n2, n3, n4, wa2.a);
                bna2.b(0.0, 0.0, 0.0);
                bna2.a();
            } else if (ahz2 instanceof ajg) {
                this.a.a = afs2;
                bna bna3 = bna.a;
                bna3.b();
                bna3.b((double)((float)(-n2) - 0.5f), (double)((float)(-n3) - 0.5f), (double)((float)(-n4) - 0.5f));
                this.a.a((ajg)ahz2, n2, n3, n4);
                bna3.b(0.0, 0.0, 0.0);
                bna3.a();
            } else {
                this.a.a(ahz2);
                this.a.a(ahz2, afs2, n2, n3, n4, wa2.a);
            }
            GL11.glEnable((int)2896);
            GL11.glPopMatrix();
        }
    }

    protected brq a(wa wa2) {
        return bqs.b;
    }
}

