/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

class bas {
    private final awz b;
    private final bqj c;
    private final brq d;
    private final int[] e;
    final /* synthetic */ baq a;

    private bas(baq baq2, awz awz2) {
        this.a = baq2;
        this.b = awz2;
        this.c = new bqj(128, 128);
        this.e = this.c.d();
        this.d = baq.a(baq2).a("map/" + awz2.h, this.c);
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            this.e[i2] = 0;
        }
    }

    private void a() {
        for (int i2 = 0; i2 < 16384; ++i2) {
            int n2 = this.b.e[i2] & 0xFF;
            this.e[i2] = n2 / 4 == 0 ? (i2 + i2 / 128 & 1) * 8 + 16 << 24 : avm.a[n2 / 4].b(n2 & 3);
        }
        this.c.a();
    }

    private void a(boolean bl2) {
        int n2 = 0;
        int n3 = 0;
        bna bna2 = bna.a;
        float f2 = 0.0f;
        baq.a(this.a).a(this.d);
        GL11.glEnable((int)3042);
        bwg.c(1, 771, 0, 1);
        GL11.glDisable((int)3008);
        bna2.b();
        bna2.a((float)(n2 + 0) + f2, (float)(n3 + 128) - f2, -0.01f, 0.0, 1.0);
        bna2.a((float)(n2 + 128) - f2, (float)(n3 + 128) - f2, -0.01f, 1.0, 1.0);
        bna2.a((float)(n2 + 128) - f2, (float)(n3 + 0) + f2, -0.01f, 1.0, 0.0);
        bna2.a((float)(n2 + 0) + f2, (float)(n3 + 0) + f2, -0.01f, 0.0, 0.0);
        bna2.a();
        GL11.glEnable((int)3008);
        GL11.glDisable((int)3042);
        baq.a(this.a).a(baq.b());
        int n4 = 0;
        for (axb axb2 : this.b.g.values()) {
            if (bl2 && axb2.a != 1) continue;
            GL11.glPushMatrix();
            GL11.glTranslatef((float)((float)n2 + (float)axb2.b / 2.0f + 64.0f), (float)((float)n3 + (float)axb2.c / 2.0f + 64.0f), (float)-0.02f);
            GL11.glRotatef((float)((float)(axb2.d * 360) / 16.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glScalef((float)4.0f, (float)4.0f, (float)3.0f);
            GL11.glTranslatef((float)-0.125f, (float)0.125f, (float)0.0f);
            float f3 = (float)(axb2.a % 4 + 0) / 4.0f;
            float f4 = (float)(axb2.a / 4 + 0) / 4.0f;
            float f5 = (float)(axb2.a % 4 + 1) / 4.0f;
            float f6 = (float)(axb2.a / 4 + 1) / 4.0f;
            bna2.b();
            bna2.a(-1.0, 1.0, (float)n4 * 0.001f, f3, f4);
            bna2.a(1.0, 1.0, (float)n4 * 0.001f, f5, f4);
            bna2.a(1.0, -1.0, (float)n4 * 0.001f, f5, f6);
            bna2.a(-1.0, -1.0, (float)n4 * 0.001f, f3, f6);
            bna2.a();
            GL11.glPopMatrix();
            ++n4;
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-0.04f);
        GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
    }

    static /* synthetic */ void a(bas bas2) {
        bas2.a();
    }

    static /* synthetic */ void a(bas bas2, boolean bl2) {
        bas2.a(bl2);
    }

    /* synthetic */ bas(baq baq2, awz awz2, bar bar2) {
        this(baq2, awz2);
    }

    static /* synthetic */ brq b(bas bas2) {
        return bas2.d;
    }
}

