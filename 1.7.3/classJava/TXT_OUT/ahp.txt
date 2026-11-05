/*
 * Decompiled with CFR 0.152.
 */
public class ahp
extends agr {
    protected aqe J = new arc(aie.bs);

    @Override
    protected void a(agl agl2) {
        this.a();
        if (this.b.nextInt(5) == 0) {
            int n2 = this.c + this.b.nextInt(16) + 8;
            int n3 = this.d + this.b.nextInt(16) + 8;
            int n4 = this.a.i(n2, n3);
            this.J.a(this.a, this.b, n2, n4, n3);
        }
        if (this.c == 0 && this.d == 0) {
            vr vr2 = new vr(this.a);
            vr2.b(0.0, 128.0, 0.0, this.b.nextFloat() * 360.0f, 0.0f);
            this.a.d(vr2);
        }
    }
}

