/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class big
extends bim {
    bjs a;
    bjs[] b = new bjs[9];

    public big() {
        int n2 = -16;
        this.a = new bjs(this, 0, 0);
        this.a.a(-8.0f, -8.0f, -8.0f, 16, 16, 16);
        this.a.d += (float)(24 + n2);
        Random random = new Random(1660L);
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = new bjs(this, 0, 0);
            float f2 = (((float)(i2 % 3) - (float)(i2 / 3 % 2) * 0.5f + 0.25f) / 2.0f * 2.0f - 1.0f) * 5.0f;
            float f3 = ((float)(i2 / 3) / 2.0f * 2.0f - 1.0f) * 5.0f;
            int n3 = random.nextInt(7) + 8;
            this.b[i2].a(-1.0f, 0.0f, -1.0f, 2, n3, 2);
            this.b[i2].c = f2;
            this.b[i2].e = f3;
            this.b[i2].d = 31 + n2;
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, qr qr2) {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2].f = 0.2f * oy.a(f4 * 0.3f + (float)i2) + 0.4f;
        }
    }

    @Override
    public void a(qr qr2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, qr2);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)0.6f, (float)0.0f);
        this.a.a(f7);
        for (bjs bjs2 : this.b) {
            bjs2.a(f7);
        }
        GL11.glPopMatrix();
    }
}

