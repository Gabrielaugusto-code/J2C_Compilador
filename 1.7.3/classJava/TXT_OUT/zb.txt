/*
 * Decompiled with CFR 0.152.
 */
public class zb
extends zp {
    private xq a;
    private int b;

    public zb(xq xq2, ps ps2, int n2, int n3, int n4) {
        super(ps2, n2, n3, n4);
        this.a = xq2;
    }

    @Override
    public boolean a(abu abu2) {
        return false;
    }

    @Override
    public abu a(int n2) {
        if (this.e()) {
            this.b += Math.min(n2, this.d().b);
        }
        return super.a(n2);
    }

    @Override
    public void a(xq xq2, abu abu2) {
        this.b(abu2);
        super.a(xq2, abu2);
    }

    @Override
    protected void a(abu abu2, int n2) {
        this.b += n2;
        this.b(abu2);
    }

    @Override
    protected void b(abu abu2) {
        abu2.a(this.a.o, this.a, this.b);
        if (!this.a.o.E) {
            int n2;
            int n3 = this.b;
            float f2 = adr.a().b(abu2);
            if (f2 == 0.0f) {
                n3 = 0;
            } else if (f2 < 1.0f) {
                n2 = oy.d((float)n3 * f2);
                if (n2 < oy.f((float)n3 * f2) && (float)Math.random() < (float)n3 * f2 - (float)n2) {
                    ++n2;
                }
                n3 = n2;
            }
            while (n3 > 0) {
                n2 = rh.a(n3);
                n3 -= n2;
                this.a.o.d(new rh(this.a.o, this.a.s, this.a.t + 0.5, this.a.u + 0.5, n2));
            }
        }
        this.b = 0;
        if (abu2.b() == abv.j) {
            this.a.a(nt.k, 1);
        }
        if (abu2.b() == abv.aQ) {
            this.a.a(nt.p, 1);
        }
    }
}

