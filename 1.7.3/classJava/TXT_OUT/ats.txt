/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

abstract class ats
extends aua {
    protected att d = att.a;

    public ats() {
    }

    protected ats(int n2) {
        super(n2);
    }

    @Override
    protected void a(dg dg2) {
        dg2.a("EntryDoor", this.d.name());
    }

    @Override
    protected void b(dg dg2) {
        this.d = att.valueOf(dg2.j("EntryDoor"));
    }

    protected void a(afs afs2, Random random, arm arm2, att att2, int n2, int n3, int n4) {
        switch (att2) {
            default: {
                this.a(afs2, arm2, n2, n3, n4, n2 + 3 - 1, n3 + 3 - 1, n4, aie.a, aie.a, false);
                break;
            }
            case b: {
                this.a(afs2, aie.aV, 0, n2, n3, n4, arm2);
                this.a(afs2, aie.aV, 0, n2, n3 + 1, n4, arm2);
                this.a(afs2, aie.aV, 0, n2, n3 + 2, n4, arm2);
                this.a(afs2, aie.aV, 0, n2 + 1, n3 + 2, n4, arm2);
                this.a(afs2, aie.aV, 0, n2 + 2, n3 + 2, n4, arm2);
                this.a(afs2, aie.aV, 0, n2 + 2, n3 + 1, n4, arm2);
                this.a(afs2, aie.aV, 0, n2 + 2, n3, n4, arm2);
                this.a(afs2, aie.ao, 0, n2 + 1, n3, n4, arm2);
                this.a(afs2, aie.ao, 8, n2 + 1, n3 + 1, n4, arm2);
                break;
            }
            case c: {
                this.a(afs2, aie.a, 0, n2 + 1, n3, n4, arm2);
                this.a(afs2, aie.a, 0, n2 + 1, n3 + 1, n4, arm2);
                this.a(afs2, aie.aY, 0, n2, n3, n4, arm2);
                this.a(afs2, aie.aY, 0, n2, n3 + 1, n4, arm2);
                this.a(afs2, aie.aY, 0, n2, n3 + 2, n4, arm2);
                this.a(afs2, aie.aY, 0, n2 + 1, n3 + 2, n4, arm2);
                this.a(afs2, aie.aY, 0, n2 + 2, n3 + 2, n4, arm2);
                this.a(afs2, aie.aY, 0, n2 + 2, n3 + 1, n4, arm2);
                this.a(afs2, aie.aY, 0, n2 + 2, n3, n4, arm2);
                break;
            }
            case d: {
                this.a(afs2, aie.aV, 0, n2, n3, n4, arm2);
                this.a(afs2, aie.aV, 0, n2, n3 + 1, n4, arm2);
                this.a(afs2, aie.aV, 0, n2, n3 + 2, n4, arm2);
                this.a(afs2, aie.aV, 0, n2 + 1, n3 + 2, n4, arm2);
                this.a(afs2, aie.aV, 0, n2 + 2, n3 + 2, n4, arm2);
                this.a(afs2, aie.aV, 0, n2 + 2, n3 + 1, n4, arm2);
                this.a(afs2, aie.aV, 0, n2 + 2, n3, n4, arm2);
                this.a(afs2, aie.av, 0, n2 + 1, n3, n4, arm2);
                this.a(afs2, aie.av, 8, n2 + 1, n3 + 1, n4, arm2);
                this.a(afs2, aie.aB, this.a(aie.aB, 4), n2 + 2, n3 + 1, n4 + 1, arm2);
                this.a(afs2, aie.aB, this.a(aie.aB, 3), n2 + 2, n3 + 1, n4 - 1, arm2);
            }
        }
    }

    protected att a(Random random) {
        int n2 = random.nextInt(5);
        switch (n2) {
            default: {
                return att.a;
            }
            case 2: {
                return att.b;
            }
            case 3: {
                return att.c;
            }
            case 4: 
        }
        return att.d;
    }

    protected aua a(atp atp2, List list, Random random, int n2, int n3) {
        switch (this.g) {
            case 2: {
                return asz.a(atp2, list, random, this.f.a + n2, this.f.b + n3, this.f.c - 1, this.g, this.d());
            }
            case 0: {
                return asz.a(atp2, list, random, this.f.a + n2, this.f.b + n3, this.f.f + 1, this.g, this.d());
            }
            case 1: {
                return asz.a(atp2, list, random, this.f.a - 1, this.f.b + n3, this.f.c + n2, this.g, this.d());
            }
            case 3: {
                return asz.a(atp2, list, random, this.f.d + 1, this.f.b + n3, this.f.c + n2, this.g, this.d());
            }
        }
        return null;
    }

    protected aua b(atp atp2, List list, Random random, int n2, int n3) {
        switch (this.g) {
            case 2: {
                return asz.a(atp2, list, random, this.f.a - 1, this.f.b + n2, this.f.c + n3, 1, this.d());
            }
            case 0: {
                return asz.a(atp2, list, random, this.f.a - 1, this.f.b + n2, this.f.c + n3, 1, this.d());
            }
            case 1: {
                return asz.a(atp2, list, random, this.f.a + n3, this.f.b + n2, this.f.c - 1, 2, this.d());
            }
            case 3: {
                return asz.a(atp2, list, random, this.f.a + n3, this.f.b + n2, this.f.c - 1, 2, this.d());
            }
        }
        return null;
    }

    protected aua c(atp atp2, List list, Random random, int n2, int n3) {
        switch (this.g) {
            case 2: {
                return asz.a(atp2, list, random, this.f.d + 1, this.f.b + n2, this.f.c + n3, 3, this.d());
            }
            case 0: {
                return asz.a(atp2, list, random, this.f.d + 1, this.f.b + n2, this.f.c + n3, 3, this.d());
            }
            case 1: {
                return asz.a(atp2, list, random, this.f.a + n3, this.f.b + n2, this.f.f + 1, 0, this.d());
            }
            case 3: {
                return asz.a(atp2, list, random, this.f.a + n3, this.f.b + n2, this.f.f + 1, 0, this.d());
            }
        }
        return null;
    }

    protected static boolean a(arm arm2) {
        return arm2 != null && arm2.b > 10;
    }
}

