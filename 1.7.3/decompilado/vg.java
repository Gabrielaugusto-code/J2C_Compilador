/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class vg
extends uw {
    private final yv bq = new yv(new vh(this), 2, 1);
    public static final float[][] bp = new float[][]{{1.0f, 1.0f, 1.0f}, {0.85f, 0.5f, 0.2f}, {0.7f, 0.3f, 0.85f}, {0.4f, 0.6f, 0.85f}, {0.9f, 0.9f, 0.2f}, {0.5f, 0.8f, 0.1f}, {0.95f, 0.5f, 0.65f}, {0.3f, 0.3f, 0.3f}, {0.6f, 0.6f, 0.6f}, {0.3f, 0.5f, 0.6f}, {0.5f, 0.25f, 0.7f}, {0.2f, 0.3f, 0.7f}, {0.4f, 0.3f, 0.2f}, {0.4f, 0.5f, 0.2f}, {0.6f, 0.2f, 0.2f}, {0.1f, 0.1f, 0.1f}};
    private int br;
    private su bs = new su(this);

    public vg(afs afs2) {
        super(afs2);
        this.a(0.9f, 1.3f);
        this.m().a(true);
        this.c.a(0, new sw(this));
        this.c.a(1, new tq(this, 1.25));
        this.c.a(2, new sr(this, 1.0));
        this.c.a(3, new ub(this, 1.1, abv.O, false));
        this.c.a(4, new sy(this, 1.1));
        this.c.a(5, this.bs);
        this.c.a(6, new tt(this, 1.0));
        this.c.a(7, new te(this, xq.class, 6.0f));
        this.c.a(8, new ts(this));
        this.bq.a(0, new abu(abv.aR, 1, 0));
        this.bq.a(1, new abu(abv.aR, 1, 0));
    }

    @Override
    protected boolean bj() {
        return true;
    }

    @Override
    protected void bm() {
        this.br = this.bs.f();
        super.bm();
    }

    @Override
    public void e() {
        if (this.o.E) {
            this.br = Math.max(0, this.br - 1);
        }
        super.e();
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.a).a(8.0);
        this.a(xa.d).a(0.23f);
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(16, new Byte(0));
    }

    @Override
    protected void b(boolean bl2, int n2) {
        if (!this.ca()) {
            this.a(new abu(abs.a(aie.L), 1, this.bZ()), 0.0f);
        }
    }

    @Override
    protected abs u() {
        return abs.a(aie.L);
    }

    @Override
    public void a(byte by2) {
        if (by2 == 10) {
            this.br = 40;
        } else {
            super.a(by2);
        }
    }

    public float p(float f2) {
        if (this.br <= 0) {
            return 0.0f;
        }
        if (this.br >= 4 && this.br <= 36) {
            return 1.0f;
        }
        if (this.br < 4) {
            return ((float)this.br - f2) / 4.0f;
        }
        return -((float)(this.br - 40) - f2) / 4.0f;
    }

    public float q(float f2) {
        if (this.br > 4 && this.br <= 36) {
            float f3 = ((float)(this.br - 4) - f2) / 32.0f;
            return 0.62831855f + 0.21991149f * oy.a(f3 * 28.7f);
        }
        if (this.br > 0) {
            return 0.62831855f;
        }
        return this.z / 57.295776f;
    }

    @Override
    public boolean a(xq xq2) {
        abu abu2 = xq2.bm.h();
        if (abu2 != null && abu2.b() == abv.aZ && !this.ca() && !this.f()) {
            if (!this.o.E) {
                this.i(true);
                int n2 = 1 + this.Z.nextInt(3);
                for (int i2 = 0; i2 < n2; ++i2) {
                    wb wb2 = this.a(new abu(abs.a(aie.L), 1, this.bZ()), 1.0f);
                    wb2.w += (double)(this.Z.nextFloat() * 0.05f);
                    wb2.v += (double)((this.Z.nextFloat() - this.Z.nextFloat()) * 0.1f);
                    wb2.x += (double)((this.Z.nextFloat() - this.Z.nextFloat()) * 0.1f);
                }
            }
            abu2.a(1, (rm)xq2);
            this.a("mob.sheep.shear", 1.0f, 1.0f);
        }
        return super.a(xq2);
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("Sheared", this.ca());
        dg2.a("Color", (byte)this.bZ());
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.i(dg2.n("Sheared"));
        this.s(dg2.d("Color"));
    }

    @Override
    protected String t() {
        return "mob.sheep.say";
    }

    @Override
    protected String aS() {
        return "mob.sheep.say";
    }

    @Override
    protected String aT() {
        return "mob.sheep.say";
    }

    @Override
    protected void a(int n2, int n3, int n4, ahz ahz2) {
        this.a("mob.sheep.step", 0.15f, 1.0f);
    }

    public int bZ() {
        return this.af.a(16) & 0xF;
    }

    public void s(int n2) {
        byte by2 = this.af.a(16);
        this.af.b(16, (byte)(by2 & 0xF0 | n2 & 0xF));
    }

    public boolean ca() {
        return (this.af.a(16) & 0x10) != 0;
    }

    public void i(boolean bl2) {
        byte by2 = this.af.a(16);
        if (bl2) {
            this.af.b(16, (byte)(by2 | 0x10));
        } else {
            this.af.b(16, (byte)(by2 & 0xFFFFFFEF));
        }
    }

    public static int a(Random random) {
        int n2 = random.nextInt(100);
        if (n2 < 5) {
            return 15;
        }
        if (n2 < 10) {
            return 7;
        }
        if (n2 < 15) {
            return 8;
        }
        if (n2 < 18) {
            return 12;
        }
        if (random.nextInt(500) == 0) {
            return 6;
        }
        return 0;
    }

    public vg b(qo qo2) {
        vg vg2 = (vg)qo2;
        vg vg3 = new vg(this.o);
        int n2 = this.a(this, vg2);
        vg3.s(15 - n2);
        return vg3;
    }

    @Override
    public void p() {
        this.i(false);
        if (this.f()) {
            this.a(60);
        }
    }

    @Override
    public rp a(rp rp2) {
        rp2 = super.a(rp2);
        this.s(vg.a(this.o.s));
        return rp2;
    }

    private int a(uw uw2, uw uw3) {
        int n2 = this.b(uw2);
        int n3 = this.b(uw3);
        this.bq.a(0).b(n2);
        this.bq.a(1).b(n3);
        abu abu2 = adv.a().a(this.bq, ((vg)uw2).o);
        int n4 = abu2 != null && abu2.b() == abv.aR ? abu2.k() : (this.o.s.nextBoolean() ? n2 : n3);
        return n4;
    }

    private int b(uw uw2) {
        return 15 - ((vg)uw2).bZ();
    }

    @Override
    public /* synthetic */ qo a(qo qo2) {
        return this.b(qo2);
    }
}

