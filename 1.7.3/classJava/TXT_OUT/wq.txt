/*
 * Decompiled with CFR 0.152.
 */
public class wq
extends wx {
    private int bp;
    private int bq;
    private int br = 30;
    private int bs = 3;

    public wq(afs afs2) {
        super(afs2);
        this.c.a(1, new sw(this));
        this.c.a(2, new tz(this));
        this.c.a(3, new sn(this, ve.class, 6.0f, 1.0, 1.2));
        this.c.a(4, new th(this, 1.0, false));
        this.c.a(5, new tt(this, 0.8));
        this.c.a(6, new te(this, xq.class, 8.0f));
        this.c.a(6, new ts(this));
        this.d.a(1, new uf(this, xq.class, 0, true));
        this.d.a(2, new ue(this, false));
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.d).a(0.25);
    }

    @Override
    public boolean bj() {
        return true;
    }

    @Override
    public int aw() {
        if (this.o() == null) {
            return 3;
        }
        return 3 + (int)(this.aR() - 1.0f);
    }

    @Override
    protected void b(float f2) {
        super.b(f2);
        this.bq = (int)((float)this.bq + f2 * 1.5f);
        if (this.bq > this.br - 5) {
            this.bq = this.br - 5;
        }
    }

    @Override
    protected void c() {
        super.c();
        this.af.a(16, (Object)-1);
        this.af.a(17, (Object)0);
        this.af.a(18, (Object)0);
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        if (this.af.a(17) == 1) {
            dg2.a("powered", true);
        }
        dg2.a("Fuse", (short)this.br);
        dg2.a("ExplosionRadius", (byte)this.bs);
        dg2.a("ignited", this.cc());
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.af.b(17, (byte)(dg2.n("powered") ? 1 : 0));
        if (dg2.b("Fuse", 99)) {
            this.br = dg2.e("Fuse");
        }
        if (dg2.b("ExplosionRadius", 99)) {
            this.bs = dg2.d("ExplosionRadius");
        }
        if (dg2.n("ignited")) {
            this.cd();
        }
    }

    @Override
    public void h() {
        if (this.Y()) {
            int n2;
            this.bp = this.bq;
            if (this.cc()) {
                this.a(1);
            }
            if ((n2 = this.cb()) > 0 && this.bq == 0) {
                this.a("creeper.primed", 1.0f, 0.5f);
            }
            this.bq += n2;
            if (this.bq < 0) {
                this.bq = 0;
            }
            if (this.bq >= this.br) {
                this.bq = this.br;
                this.ce();
            }
        }
        super.h();
    }

    @Override
    protected String aS() {
        return "mob.creeper.say";
    }

    @Override
    protected String aT() {
        return "mob.creeper.death";
    }

    @Override
    public void a(qf qf2) {
        super.a(qf2);
        if (qf2.j() instanceof xc) {
            int n2 = abs.b(abv.cd);
            int n3 = abs.b(abv.co);
            int n4 = n2 + this.Z.nextInt(n3 - n2 + 1);
            this.a(abs.d(n4), 1);
        }
    }

    @Override
    public boolean n(qr qr2) {
        return true;
    }

    public boolean bZ() {
        return this.af.a(17) == 1;
    }

    public float a(float f2) {
        return ((float)this.bp + (float)(this.bq - this.bp) * f2) / (float)(this.br - 2);
    }

    @Override
    protected abs u() {
        return abv.H;
    }

    public int cb() {
        return this.af.a(16);
    }

    public void a(int n2) {
        this.af.b(16, (byte)n2);
    }

    @Override
    public void a(vy vy2) {
        super.a(vy2);
        this.af.b(17, (byte)1);
    }

    @Override
    protected boolean a(xq xq2) {
        abu abu2 = xq2.bm.h();
        if (abu2 != null && abu2.b() == abv.d) {
            this.o.a(this.s + 0.5, this.t + 0.5, this.u + 0.5, "fire.ignite", 1.0f, this.Z.nextFloat() * 0.4f + 0.8f);
            xq2.aZ();
            if (!this.o.E) {
                this.cd();
                abu2.a(1, (rm)xq2);
                return true;
            }
        }
        return super.a(xq2);
    }

    private void ce() {
        if (!this.o.E) {
            boolean bl2 = this.o.O().b("mobGriefing");
            if (this.bZ()) {
                this.o.a(this, this.s, this.t, this.u, (float)(this.bs * 2), bl2);
            } else {
                this.o.a(this, this.s, this.t, this.u, (float)this.bs, bl2);
            }
            this.A();
        }
    }

    public boolean cc() {
        return this.af.a(18) != 0;
    }

    public void cd() {
        this.af.b(18, (byte)1);
    }
}

