/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class aue
extends auc {
    private boolean c;

    public aue() {
    }

    public aue(afs afs2, Random random, int n2, int n3, int n4) {
        super(n2, n3);
        int n5;
        List list = auf.a(random, n4);
        auq auq2 = new auq(afs2.v(), 0, random, (n2 << 4) + 2, (n3 << 4) + 2, list, n4);
        this.a.add(auq2);
        auq2.a(auq2, this.a, random);
        List list2 = auq2.j;
        List list3 = auq2.i;
        while (!list2.isEmpty() || !list3.isEmpty()) {
            Object object;
            if (list2.isEmpty()) {
                n5 = random.nextInt(list3.size());
                object = (aua)list3.remove(n5);
                ((aua)object).a(auq2, this.a, random);
                continue;
            }
            n5 = random.nextInt(list2.size());
            object = (aua)list2.remove(n5);
            ((aua)object).a(auq2, this.a, random);
        }
        this.c();
        n5 = 0;
        for (aua aua2 : this.a) {
            if (aua2 instanceof auu) continue;
            ++n5;
        }
        this.c = n5 > 2;
    }

    @Override
    public boolean d() {
        return this.c;
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        dg2.a("Valid", this.c);
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        this.c = dg2.n("Valid");
    }
}

