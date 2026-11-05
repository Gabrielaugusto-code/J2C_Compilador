/*
 * Decompiled with CFR 0.152.
 */
public class ala
extends aht {
    public ala() {
        super(avk.d);
        this.a(aak.d);
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        boolean bl2 = afs2.v(n2, n3, n4);
        aoc aoc2 = (aoc)afs2.o(n2, n3, n4);
        if (aoc2 != null && aoc2.i != bl2) {
            if (bl2) {
                aoc2.a(afs2, n2, n3, n4);
            }
            aoc2.i = bl2;
        }
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, xq xq2, int n5, float f2, float f3, float f4) {
        if (afs2.E) {
            return true;
        }
        aoc aoc2 = (aoc)afs2.o(n2, n3, n4);
        if (aoc2 != null) {
            aoc2.a();
            aoc2.a(afs2, n2, n3, n4);
        }
        return true;
    }

    @Override
    public void a(afs afs2, int n2, int n3, int n4, xq xq2) {
        if (afs2.E) {
            return;
        }
        aoc aoc2 = (aoc)afs2.o(n2, n3, n4);
        if (aoc2 != null) {
            aoc2.a(afs2, n2, n3, n4);
        }
    }

    @Override
    public ani a(afs afs2, int n2) {
        return new aoc();
    }

    @Override
    public boolean a(afs afs2, int n2, int n3, int n4, int n5, int n6) {
        float f2 = (float)Math.pow(2.0, (double)(n6 - 12) / 12.0);
        String string = "harp";
        if (n5 == 1) {
            string = "bd";
        }
        if (n5 == 2) {
            string = "snare";
        }
        if (n5 == 3) {
            string = "hat";
        }
        if (n5 == 4) {
            string = "bassattack";
        }
        afs2.a((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5, "note." + string, 3.0f, f2);
        afs2.a("note", (double)n2 + 0.5, (double)n3 + 1.2, (double)n4 + 0.5, (double)n6 / 24.0, 0.0, 0.0);
        return true;
    }
}

