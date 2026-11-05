/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.UUID;

public class wy
extends xh {
    private static final UUID bq = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
    private static final sa br = new sa(bq, "Attacking speed boost", 0.45, 0).a(false);
    private int bs;
    private int bt;
    private qr bu;

    public wy(afs afs2) {
        super(afs2);
        this.ae = true;
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(bp).a(0.0);
        this.a(xa.d).a(0.5);
        this.a(xa.e).a(5.0);
    }

    @Override
    protected boolean bj() {
        return false;
    }

    @Override
    public void h() {
        if (this.bu != this.bm && !this.o.E) {
            rz rz2 = this.a(xa.d);
            rz2.b(br);
            if (this.bm != null) {
                rz2.a(br);
            }
        }
        this.bu = this.bm;
        if (this.bt > 0 && --this.bt == 0) {
            this.a("mob.zombiepig.zpigangry", this.be() * 2.0f, ((this.Z.nextFloat() - this.Z.nextFloat()) * 0.2f + 1.0f) * 1.8f);
        }
        super.h();
    }

    @Override
    public boolean by() {
        return this.o.r != pu.a && this.o.b(this.C) && this.o.a((qr)this, this.C).isEmpty() && !this.o.d(this.C);
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("Anger", (short)this.bs);
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.bs = dg2.e("Anger");
    }

    @Override
    protected qr bR() {
        if (this.bs == 0) {
            return null;
        }
        return super.bR();
    }

    @Override
    public boolean a(qf qf2, float f2) {
        if (this.av()) {
            return false;
        }
        qr qr2 = qf2.j();
        if (qr2 instanceof xq) {
            List list = this.o.b((qr)this, this.C.b(32.0, 32.0, 32.0));
            for (int i2 = 0; i2 < list.size(); ++i2) {
                qr qr3 = (qr)list.get(i2);
                if (!(qr3 instanceof wy)) continue;
                wy wy2 = (wy)qr3;
                wy2.c(qr2);
            }
            this.c(qr2);
        }
        return super.a(qf2, f2);
    }

    private void c(qr qr2) {
        this.bm = qr2;
        this.bs = 400 + this.Z.nextInt(400);
        this.bt = this.Z.nextInt(40);
    }

    @Override
    protected String t() {
        return "mob.zombiepig.zpig";
    }

    @Override
    protected String aS() {
        return "mob.zombiepig.zpighurt";
    }

    @Override
    protected String aT() {
        return "mob.zombiepig.zpigdeath";
    }

    @Override
    protected void b(boolean bl2, int n2) {
        int n3;
        int n4 = this.Z.nextInt(2 + n2);
        for (n3 = 0; n3 < n4; ++n3) {
            this.a(abv.bh, 1);
        }
        n4 = this.Z.nextInt(2 + n2);
        for (n3 = 0; n3 < n4; ++n3) {
            this.a(abv.bl, 1);
        }
    }

    @Override
    public boolean a(xq xq2) {
        return false;
    }

    @Override
    protected void n(int n2) {
        this.a(abv.k, 1);
    }

    @Override
    protected void bC() {
        this.c(0, new abu(abv.B));
    }

    @Override
    public rp a(rp rp2) {
        super.a(rp2);
        this.j(false);
        return rp2;
    }
}

