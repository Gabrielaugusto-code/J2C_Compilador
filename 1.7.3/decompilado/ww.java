/*
 * Decompiled with CFR 0.152.
 */
public class ww
extends xd {
    public ww(afs afs2) {
        super(afs2);
        this.ae = true;
    }

    @Override
    protected void aC() {
        super.aC();
        this.a(xa.d).a(0.2f);
    }

    @Override
    public boolean by() {
        return this.o.r != pu.a && this.o.b(this.C) && this.o.a((qr)this, this.C).isEmpty() && !this.o.d(this.C);
    }

    @Override
    public int aU() {
        return this.bX() * 3;
    }

    @Override
    public int c(float f2) {
        return 0xF000F0;
    }

    @Override
    public float d(float f2) {
        return 1.0f;
    }

    @Override
    protected String bP() {
        return "flame";
    }

    @Override
    protected xd bQ() {
        return new ww(this.o);
    }

    @Override
    protected abs u() {
        return abv.bs;
    }

    @Override
    protected void b(boolean bl2, int n2) {
        abs abs2 = this.u();
        if (abs2 != null && this.bX() > 1) {
            int n3 = this.Z.nextInt(4) - 2;
            if (n2 > 0) {
                n3 += this.Z.nextInt(n2 + 1);
            }
            for (int i2 = 0; i2 < n3; ++i2) {
                this.a(abs2, 1);
            }
        }
    }

    @Override
    public boolean ak() {
        return false;
    }

    @Override
    protected int bR() {
        return super.bR() * 4;
    }

    @Override
    protected void bS() {
        this.h *= 0.9f;
    }

    @Override
    protected void bi() {
        this.w = 0.42f + (float)this.bX() * 0.1f;
        this.al = true;
    }

    @Override
    protected void b(float f2) {
    }

    @Override
    protected boolean bT() {
        return true;
    }

    @Override
    protected int bU() {
        return super.bU() + 2;
    }

    @Override
    protected String bV() {
        if (this.bX() > 1) {
            return "mob.magmacube.big";
        }
        return "mob.magmacube.small";
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    protected boolean bW() {
        return true;
    }
}

