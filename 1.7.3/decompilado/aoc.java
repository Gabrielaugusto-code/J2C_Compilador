/*
 * Decompiled with CFR 0.152.
 */
public class aoc
extends ani {
    public byte a;
    public boolean i;

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("note", this.a);
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.a = dg2.d("note");
        if (this.a < 0) {
            this.a = 0;
        }
        if (this.a > 24) {
            this.a = (byte)24;
        }
    }

    public void a() {
        this.a = (byte)((this.a + 1) % 25);
        this.e();
    }

    public void a(afs afs2, int n2, int n3, int n4) {
        if (afs2.a(n2, n3 + 1, n4).o() != avk.a) {
            return;
        }
        avk avk2 = afs2.a(n2, n3 - 1, n4).o();
        int n5 = 0;
        if (avk2 == avk.e) {
            n5 = 1;
        }
        if (avk2 == avk.p) {
            n5 = 2;
        }
        if (avk2 == avk.s) {
            n5 = 3;
        }
        if (avk2 == avk.d) {
            n5 = 4;
        }
        afs2.c(n2, n3, n4, aie.B, n5, (int)this.a);
    }
}

