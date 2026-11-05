/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bla
extends blg {
    private static final brq a = new brq("textures/particle/footprint.png");
    private int aB;
    private int aC;
    private bqy aD;

    public bla(bqy bqy2, afs afs2, double d2, double d3, double d4) {
        super(afs2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.aD = bqy2;
        this.x = 0.0;
        this.w = 0.0;
        this.v = 0.0;
        this.aC = 200;
    }

    @Override
    public void a(bna bna2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        float f9 = ((float)this.aB + f2) / (float)this.aC;
        if ((f8 = 2.0f - (f9 *= f9) * 2.0f) > 1.0f) {
            f8 = 1.0f;
        }
        f8 *= 0.2f;
        GL11.glDisable((int)2896);
        float f10 = 0.125f;
        float f11 = (float)(this.s - ay);
        float f12 = (float)(this.t - az);
        float f13 = (float)(this.u - aA);
        float f14 = this.o.n(oy.c(this.s), oy.c(this.t), oy.c(this.u));
        this.aD.a(a);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        bna2.b();
        bna2.a(f14, f14, f14, f8);
        bna2.a(f11 - f10, f12, f13 + f10, 0.0, 1.0);
        bna2.a(f11 + f10, f12, f13 + f10, 1.0, 1.0);
        bna2.a(f11 + f10, f12, f13 - f10, 1.0, 0.0);
        bna2.a(f11 - f10, f12, f13 - f10, 0.0, 0.0);
        bna2.a();
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2896);
    }

    @Override
    public void h() {
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

