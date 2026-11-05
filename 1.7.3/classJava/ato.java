/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class ato
extends ats {
    private boolean a;

    public ato() {
    }

    public ato(int n2, Random random, int n3, int n4) {
        super(n2);
        this.a = true;
        this.g = random.nextInt(4);
        this.d = att.a;
        switch (this.g) {
            case 0: 
            case 2: {
                this.f = new arm(n3, 64, n4, n3 + 5 - 1, 74, n4 + 5 - 1);
                break;
            }
            default: {
                this.f = new arm(n3, 64, n4, n3 + 5 - 1, 74, n4 + 5 - 1);
            }
        }
    }

    public ato(int n2, Random random, arm arm2, int n3) {
        super(n2);
        this.a = false;
        this.g = n3;
        this.d = this.a(random);
        this.f = arm2;
    }

    @Override
    protected void a(dg dg2) {
        super.a(dg2);
        dg2.a("Source", this.a);
    }

    @Override
    protected void b(dg dg2) {
        super.b(dg2);
        this.a = dg2.n("Source");
    }

    @Override
    public void a(aua aua2, List list, Random random) {
        if (this.a) {
            asz.a(atf.class);
        }
        this.a((atp)aua2, list, random, 1, 1);
    }

    public static ato a(List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        arm arm2 = arm.a(n2, n3, n4, -1, -7, 0, 5, 11, 5, n5);
        if (!ato.a(arm2) || aua.a(list, arm2) != null) {
            return null;
        }
        return new ato(n6, random, arm2, n5);
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        if (this.a(afs2, arm2)) {
            return false;
        }
        this.a(afs2, arm2, 0, 0, 0, 4, 10, 4, true, random, asz.c());
        this.a(afs2, random, arm2, this.d, 1, 7, 0);
        this.a(afs2, random, arm2, att.a, 1, 1, 4);
        this.a(afs2, aie.aV, 0, 2, 6, 1, arm2);
        this.a(afs2, aie.aV, 0, 1, 5, 1, arm2);
        this.a(afs2, aie.U, 0, 1, 6, 1, arm2);
        this.a(afs2, aie.aV, 0, 1, 5, 2, arm2);
        this.a(afs2, aie.aV, 0, 1, 4, 3, arm2);
        this.a(afs2, aie.U, 0, 1, 5, 3, arm2);
        this.a(afs2, aie.aV, 0, 2, 4, 3, arm2);
        this.a(afs2, aie.aV, 0, 3, 3, 3, arm2);
        this.a(afs2, aie.U, 0, 3, 4, 3, arm2);
        this.a(afs2, aie.aV, 0, 3, 3, 2, arm2);
        this.a(afs2, aie.aV, 0, 3, 2, 1, arm2);
        this.a(afs2, aie.U, 0, 3, 3, 1, arm2);
        this.a(afs2, aie.aV, 0, 2, 2, 1, arm2);
        this.a(afs2, aie.aV, 0, 1, 1, 1, arm2);
        this.a(afs2, aie.U, 0, 1, 2, 1, arm2);
        this.a(afs2, aie.aV, 0, 1, 1, 2, arm2);
        this.a(afs2, aie.U, 0, 1, 1, 3, arm2);
        return true;
    }
}

