/*
 * Decompiled with CFR 0.152.
 */
public class ahx
extends aht {
    public ahx() {
        super(avk.s);
        this.c(3.0f);
        this.a(aak.f);
    }

    @Override
    public ani a(afs afs2, int n2) {
        return new anh();
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        if (afs2.E) {
            return true;
        }
        anh anh2 = (anh)afs2.o(n2, n3, n4);
        if (anh2 != null) {
            xq2.a(anh2);
        }
        return true;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public int b() {
        return 34;
    }

    @Override
    public void a(px px2) {
        super.a(px2);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, rm rm2, abu abu2) {
        super.a(afs2, n2, n3, n4, rm2, abu2);
        if (abu2.u()) {
            ((anh)afs2.o(n2, n3, n4)).a(abu2.s());
        }
    }
}

