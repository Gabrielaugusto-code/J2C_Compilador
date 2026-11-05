/*
 * Decompiled with CFR 0.152.
 */
public class vp
extends qr {
    public final vo a;
    public final String b;

    public vp(vo vo2, String string, float f2, float f3) {
        super(vo2.a());
        this.a(f2, f3);
        this.a = vo2;
        this.b = string;
    }

    @Override
    protected void c() {
    }

    @Override
    protected void a(dg dg2) {
    }

    @Override
    protected void b(dg dg2) {
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean a(qf qf2, float f2) {
        if (this.av()) {
            return false;
        }
        return this.a.a(this, qf2, f2);
    }

    @Override
    public boolean i(qr qr2) {
        return this == qr2 || this.a == qr2;
    }
}

