/*
 * Decompiled with CFR 0.152.
 */
public class xx
extends xv {
    public int e = 1;

    public xx(afs afs2) {
        super(afs2);
    }

    public xx(afs afs2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(afs2, d2, d3, d4, d5, d6, d7);
    }

    public xx(afs afs2, rm rm2, double d2, double d3, double d4) {
        super(afs2, rm2, d2, d3, d4);
    }

    @Override
    protected void a(ayn ayn2) {
        if (!this.o.E) {
            if (ayn2.g != null) {
                ayn2.g.a(qf.a(this, (qr)this.a), 6.0f);
            }
            this.o.a(null, this.s, this.t, this.u, (float)this.e, true, this.o.O().b("mobGriefing"));
            this.A();
        }
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("ExplosionPower", this.e);
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        if (dg2.b("ExplosionPower", 99)) {
            this.e = dg2.f("ExplosionPower");
        }
    }
}

