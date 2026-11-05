/*
 * Decompiled with CFR 0.152.
 */
public class sn
extends sz {
    public final ra a = new so(this);
    private ru b;
    private double c;
    private double d;
    private qr e;
    private float f;
    private aww g;
    private um h;
    private Class i;

    public sn(ru ru2, Class clazz, float f2, double d2, double d3) {
        this.b = ru2;
        this.i = clazz;
        this.f = f2;
        this.c = d2;
        this.d = d3;
        this.h = ru2.m();
        this.a(1);
    }

    @Override
    public boolean a() {
        Object object;
        if (this.i == xq.class) {
            if (this.b instanceof rx && ((rx)this.b).bZ()) {
                return false;
            }
            this.e = this.b.o.a((qr)this.b, (double)this.f);
            if (this.e == null) {
                return false;
            }
        } else {
            object = this.b.o.a(this.i, this.b.C.b(this.f, 3.0, this.f), this.a);
            if (object.isEmpty()) {
                return false;
            }
            this.e = (qr)object.get(0);
        }
        if ((object = uo.b(this.b, 16, 7, this.b.o.V().a(this.e.s, this.e.t, this.e.u))) == null) {
            return false;
        }
        if (this.e.e(((ayp)object).c, ((ayp)object).d, ((ayp)object).e) < this.e.f(this.b)) {
            return false;
        }
        this.g = this.h.a(((ayp)object).c, ((ayp)object).d, ((ayp)object).e);
        if (this.g == null) {
            return false;
        }
        return this.g.b((ayp)object);
    }

    @Override
    public boolean b() {
        return !this.h.g();
    }

    @Override
    public void c() {
        this.h.a(this.g, this.c);
    }

    @Override
    public void d() {
        this.e = null;
    }

    @Override
    public void e() {
        if (this.b.f(this.e) < 49.0) {
            this.b.m().a(this.d);
        } else {
            this.b.m().a(this.c);
        }
    }

    static /* synthetic */ ru a(sn sn2) {
        return sn2.b;
    }
}

