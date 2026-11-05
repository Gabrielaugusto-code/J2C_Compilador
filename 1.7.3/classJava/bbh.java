/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bbh {
    private static final brq a = new brq("textures/gui/stream_indicator.png");
    private final azi b;
    private float c = 1.0f;
    private int d = 1;

    public bbh(azi azi2) {
        this.b = azi2;
    }

    public void a(int n2, int n3) {
        if (this.b.Z().n()) {
            GL11.glEnable((int)3042);
            int n4 = this.b.Z().A();
            if (n4 > 0) {
                String string = "" + n4;
                int n5 = this.b.l.a(string);
                int n6 = 20;
                int n7 = n2 - n5 - 1;
                int n8 = n3 + 20 - 1;
                int n9 = n2;
                int n10 = n3 + 20 + this.b.l.a - 1;
                GL11.glDisable((int)3553);
                bna bna2 = bna.a;
                GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)((0.65f + 0.35000002f * this.c) / 2.0f));
                bna2.b();
                bna2.a((double)n7, (double)n10, 0.0);
                bna2.a((double)n9, (double)n10, 0.0);
                bna2.a((double)n9, (double)n8, 0.0);
                bna2.a((double)n7, (double)n8, 0.0);
                bna2.a();
                GL11.glEnable((int)3553);
                this.b.l.b(string, n2 - n5, n3 + 20, 0xFFFFFF);
            }
            this.a(n2, n3, this.b(), 0);
            this.a(n2, n3, this.c(), 17);
        }
    }

    private void a(int n2, int n3, int n4, int n5) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)(0.65f + 0.35000002f * this.c));
        this.b.P().a(a);
        float f2 = 150.0f;
        float f3 = 0.0f;
        float f4 = (float)n4 * 0.015625f;
        float f5 = 1.0f;
        float f6 = (float)(n4 + 16) * 0.015625f;
        bna bna2 = bna.a;
        bna2.b();
        bna2.a(n2 - 16 - n5, n3 + 16, f2, f3, f6);
        bna2.a(n2 - n5, n3 + 16, f2, f5, f6);
        bna2.a(n2 - n5, n3 + 0, f2, f5, f4);
        bna2.a(n2 - 16 - n5, n3 + 0, f2, f3, f4);
        bna2.a();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private int b() {
        return this.b.Z().o() ? 16 : 0;
    }

    private int c() {
        return this.b.Z().G() ? 48 : 32;
    }

    public void a() {
        if (this.b.Z().n()) {
            this.c += 0.025f * (float)this.d;
            if (this.c < 0.0f) {
                this.d *= -1;
                this.c = 0.0f;
            } else if (this.c > 1.0f) {
                this.d *= -1;
                this.c = 1.0f;
            }
        } else {
            this.c = 1.0f;
            this.d = 1;
        }
    }
}

