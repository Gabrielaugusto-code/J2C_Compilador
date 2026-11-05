/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class blc
extends blg {
    private static final brq a = new brq("textures/entity/explosion.png");
    private int aB;
    private int aC;
    private bqy aD;
    private float aE;

    public blc(bqy bqy2, afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(afs2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.aD = bqy2;
        this.aC = 6 + this.Z.nextInt(4);
        this.au = this.av = this.Z.nextFloat() * 0.6f + 0.4f;
        this.at = this.av;
        this.aE = 1.0f - (float)d5 * 0.5f;
    }

    @Override
    public void a(bna bna2, float f2, float f3, float f4, float f5, float f6, float f7) {
        int n2 = (int)(((float)this.aB + f2) * 15.0f / (float)this.aC);
        if (n2 > 15) {
            return;
        }
        this.aD.a(a);
        float f8 = (float)(n2 % 4) / 4.0f;
        float f9 = f8 + 0.24975f;
        float f10 = (float)(n2 / 4) / 4.0f;
        float f11 = f10 + 0.24975f;
        float f12 = 2.0f * this.aE;
        float f13 = (float)(this.p + (this.s - this.p) * (double)f2 - ay);
        float f14 = (float)(this.q + (this.t - this.q) * (double)f2 - az);
        float f15 = (float)(this.r + (this.u - this.r) * (double)f2 - aA);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)2896);
        azg.a();
        bna2.b();
        bna2.a(this.at, this.au, this.av, 1.0f);
        bna2.c(0.0f, 1.0f, 0.0f);
        bna2.b(240);
        bna2.a(f13 - f3 * f12 - f6 * f12, f14 - f4 * f12, f15 - f5 * f12 - f7 * f12, f9, f11);
        bna2.a(f13 - f3 * f12 + f6 * f12, f14 + f4 * f12, f15 - f5 * f12 + f7 * f12, f9, f10);
        bna2.a(f13 + f3 * f12 + f6 * f12, f14 + f4 * f12, f15 + f5 * f12 + f7 * f12, f8, f10);
        bna2.a(f13 + f3 * f12 - f6 * f12, f14 - f4 * f12, f15 + f5 * f12 - f7 * f12, f8, f11);
        bna2.a();
        GL11.glPolygonOffset((float)0.0f, (float)0.0f);
        GL11.glEnable((int)2896);
    }

    @Override
    public int c(float f2) {
        return 61680;
    }

    @Override
    public void h() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        ++this.aB;
        if (this.aB == this.aC) {
            this.A();
        }
    }

    @Override
    public int a() {
        return 3;
    }
}

