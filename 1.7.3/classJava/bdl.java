/*
 * Decompiled with CFR 0.152.
 */
public class bdl
implements bbb {
    private final azf b;
    private final String c;
    private final bau d;
    private final bau e;
    final /* synthetic */ bdi a;

    private bdl(bdi bdi2, azf azf2) {
        this.a = bdi2;
        this.b = azf2;
        this.c = bsc.a(azf2.g(), new Object[0]);
        this.d = new bau(0, 0, 0, 75, 18, bsc.a(azf2.g(), new Object[0]));
        this.e = new bau(0, 0, 0, 50, 18, bsc.a("controls.reset", new Object[0]));
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, bna bna2, int n7, int n8, boolean bl2) {
        boolean bl3 = bdi.b((bdi)this.a).f == this.b;
        bdi.a((bdi)this.a).l.b(this.c, n3 + 90 - bdi.c(this.a), n4 + n6 / 2 - bdi.a((bdi)this.a).l.a / 2, 0xFFFFFF);
        this.e.h = n3 + 190;
        this.e.i = n4;
        this.e.l = this.b.i() != this.b.h();
        this.e.a(bdi.a(this.a), n7, n8);
        this.d.h = n3 + 105;
        this.d.i = n4;
        this.d.j = bac.c(this.b.i());
        boolean bl4 = false;
        if (this.b.i() != 0) {
            for (azf azf2 : bdi.a((bdi)this.a).u.at) {
                if (azf2 == this.b || azf2.i() != this.b.i()) continue;
                bl4 = true;
                break;
            }
        }
        if (bl3) {
            this.d.j = (Object)((Object)a.p) + "> " + (Object)((Object)a.o) + this.d.j + (Object)((Object)a.p) + " <";
        } else if (bl4) {
            this.d.j = (Object)((Object)a.m) + this.d.j;
        }
        this.d.a(bdi.a(this.a), n7, n8);
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.d.c(bdi.a(this.a), n3, n4)) {
            bdi.b((bdi)this.a).f = this.b;
            return true;
        }
        if (this.e.c(bdi.a(this.a), n3, n4)) {
            bdi.a((bdi)this.a).u.a(this.b, this.b.h());
            azf.b();
            return true;
        }
        return false;
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.d.a(n3, n4);
        this.e.a(n3, n4);
    }

    /* synthetic */ bdl(bdi bdi2, azf azf2, bdj bdj2) {
        this(bdi2, azf2);
    }
}

