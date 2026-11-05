/*
 * Decompiled with CFR 0.152.
 */
public class zl
extends zp {
    private final zj a;
    private xq b;
    private int c;
    private final afd d;

    public zl(xq xq2, afd afd2, zj zj2, int n2, int n3, int n4) {
        super(zj2, n2, n3, n4);
        this.b = xq2;
        this.d = afd2;
        this.a = zj2;
    }

    @Override
    public boolean a(abu abu2) {
        return false;
    }

    @Override
    public abu a(int n2) {
        if (this.e()) {
            this.c += Math.min(n2, this.d().b);
        }
        return super.a(n2);
    }

    @Override
    protected void a(abu abu2, int n2) {
        this.c += n2;
        this.b(abu2);
    }

    @Override
    protected void b(abu abu2) {
        abu2.a(this.b.o, this.b, this.c);
        this.c = 0;
    }

    @Override
    public void a(xq xq2, abu abu2) {
        abu abu3;
        abu abu4;
        this.b(abu2);
        afe afe2 = this.a.i();
        if (afe2 != null && (this.a(afe2, abu4 = this.a.a(0), abu3 = this.a.a(1)) || this.a(afe2, abu3, abu4))) {
            this.d.a(afe2);
            if (abu4 != null && abu4.b <= 0) {
                abu4 = null;
            }
            if (abu3 != null && abu3.b <= 0) {
                abu3 = null;
            }
            this.a.a(0, abu4);
            this.a.a(1, abu3);
        }
    }

    private boolean a(afe afe2, abu abu2, abu abu3) {
        abu abu4 = afe2.a();
        abu abu5 = afe2.b();
        if (abu2 != null && abu2.b() == abu4.b()) {
            if (abu5 != null && abu3 != null && abu5.b() == abu3.b()) {
                abu2.b -= abu4.b;
                abu3.b -= abu5.b;
                return true;
            }
            if (abu5 == null && abu3 == null) {
                abu2.b -= abu4.b;
                return true;
            }
        }
        return false;
    }
}

