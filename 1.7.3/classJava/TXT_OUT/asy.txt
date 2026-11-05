/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class asy
extends auc {
    public asy() {
    }

    public asy(afs afs2, Random random, int n2, int n3) {
        super(n2, n3);
        asz.b();
        atp atp2 = new atp(0, random, (n2 << 4) + 2, (n3 << 4) + 2);
        this.a.add(atp2);
        atp2.a(atp2, this.a, random);
        List list = atp2.c;
        while (!list.isEmpty()) {
            int n4 = random.nextInt(list.size());
            aua aua2 = (aua)list.remove(n4);
            aua2.a(atp2, this.a, random);
        }
        this.c();
        this.a(afs2, random, 10);
    }
}

