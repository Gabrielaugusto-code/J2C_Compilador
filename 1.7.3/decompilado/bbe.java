/*
 * Decompiled with CFR 0.152.
 */
public class bbe
implements bbb {
    private final azi a = azi.B();
    private final bau b;
    private final bau c;

    public bbe(bau bau2, bau bau3) {
        this.b = bau2;
        this.c = bau3;
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, bna bna2, int n7, int n8, boolean bl2) {
        if (this.b != null) {
            this.b.i = n4;
            this.b.a(this.a, n7, n8);
        }
        if (this.c != null) {
            this.c.i = n4;
            this.c.a(this.a, n7, n8);
        }
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.b.c(this.a, n3, n4)) {
            if (this.b instanceof bbc) {
                this.a.u.a(((bbc)this.b).c(), 1);
                this.b.j = this.a.u.c(baf.a(this.b.k));
            }
            return true;
        }
        if (this.c != null && this.c.c(this.a, n3, n4)) {
            if (this.c instanceof bbc) {
                this.a.u.a(((bbc)this.c).c(), 1);
                this.c.j = this.a.u.c(baf.a(this.c.k));
            }
            return true;
        }
        return false;
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.b != null) {
            this.b.a(n3, n4);
        }
        if (this.c != null) {
            this.c.a(n3, n4);
        }
    }
}

