/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import org.apache.commons.lang3.StringUtils;

public abstract class ul
extends sz {
    protected ru c;
    protected boolean d;
    private boolean a;
    private int b;
    private int e;
    private int f;

    public ul(ru ru2, boolean bl2) {
        this(ru2, bl2, false);
    }

    public ul(ru ru2, boolean bl2, boolean bl3) {
        this.c = ru2;
        this.d = bl2;
        this.a = bl3;
    }

    @Override
    public boolean b() {
        rm rm2 = this.c.o();
        if (rm2 == null) {
            return false;
        }
        if (!rm2.Y()) {
            return false;
        }
        double d2 = this.f();
        if (this.c.f(rm2) > d2 * d2) {
            return false;
        }
        if (this.d) {
            if (this.c.n().a(rm2)) {
                this.f = 0;
            } else if (++this.f > 60) {
                return false;
            }
        }
        return !(rm2 instanceof mp) || !((mp)rm2).c.d();
    }

    protected double f() {
        rz rz2 = this.c.a(xa.b);
        return rz2 == null ? 16.0 : rz2.e();
    }

    @Override
    public void c() {
        this.b = 0;
        this.e = 0;
        this.f = 0;
    }

    @Override
    public void d() {
        this.c.d((rm)null);
    }

    protected boolean a(rm rm2, boolean bl2) {
        if (rm2 == null) {
            return false;
        }
        if (rm2 == this.c) {
            return false;
        }
        if (!rm2.Y()) {
            return false;
        }
        if (!this.c.a(rm2.getClass())) {
            return false;
        }
        if (this.c instanceof rr && StringUtils.isNotEmpty((CharSequence)((rr)((Object)this.c)).b())) {
            if (rm2 instanceof rr && ((rr)((Object)this.c)).b().equals(((rr)((Object)rm2)).b())) {
                return false;
            }
            if (rm2 == ((rr)((Object)this.c)).i_()) {
                return false;
            }
        } else if (rm2 instanceof xq && !bl2 && ((xq)rm2).bE.a) {
            return false;
        }
        if (!this.c.b(oy.c(rm2.s), oy.c(rm2.t), oy.c(rm2.u))) {
            return false;
        }
        if (this.d && !this.c.n().a(rm2)) {
            return false;
        }
        if (this.a) {
            if (--this.e <= 0) {
                this.b = 0;
            }
            if (this.b == 0) {
                int n2 = this.b = this.a(rm2) ? 1 : 2;
            }
            if (this.b == 2) {
                return false;
            }
        }
        return true;
    }

    private boolean a(rm rm2) {
        int n2;
        this.e = 10 + this.c.aH().nextInt(5);
        aww aww2 = this.c.m().a(rm2);
        if (aww2 == null) {
            return false;
        }
        awv awv2 = aww2.c();
        if (awv2 == null) {
            return false;
        }
        int n3 = awv2.a - oy.c(rm2.s);
        return (double)(n3 * n3 + (n2 = awv2.c - oy.c(rm2.u)) * n2) <= 2.25;
    }
}

