/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class blv
extends blg {
    private qr a;
    private qr aB;
    private int aC;
    private int aD;
    private float aE;

    public blv(afs afs2, qr qr2, qr qr3, float f2) {
        super(afs2, qr2.s, qr2.t, qr2.u, qr2.v, qr2.w, qr2.x);
        this.a = qr2;
        this.aB = qr3;
        this.aD = 3;
        this.aE = f2;
    }

    @Override
    public void a(bna bna2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = ((float)this.aC + f2) / (float)this.aD;
        f8 *= f8;
        double d2 = this.a.s;
        double d3 = this.a.t;
        double d4 = this.a.u;
        double d5 = this.aB.S + (this.aB.s - this.aB.S) * (double)f2;
        double d6 = this.aB.T + (this.aB.t - this.aB.T) * (double)f2 + (double)this.aE;
        double d7 = this.aB.U + (this.aB.u - this.aB.U) * (double)f2;
        double d8 = d2 + (d5 - d2) * (double)f8;
        double d9 = d3 + (d6 - d3) * (double)f8;
        double d10 = d4 + (d7 - d4) * (double)f8;
        int n2 = this.c(f2);
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        bwg.a(bwg.c, (float)n3 / 1.0f, (float)n4 / 1.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bog.a.a(this.a, (float)(d8 -= ay), (float)(d9 -= az), (float)(d10 -= aA), this.a.y, f2);
    }

    @Override
    public void h() {
        ++this.aC;
        if (this.aC == this.aD) {
            this.A();
        }
    }

    @Override
    public int a() {
        return 3;
    }
}

