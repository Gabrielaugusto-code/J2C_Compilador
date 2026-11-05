/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Random;

public class arv
extends auc {
    public arv() {
    }

    public arv(afs afs2, Random random, int n2, int n3) {
        super(n2, n3);
        asn asn2 = new asn(random, (n2 << 4) + 2, (n3 << 4) + 2);
        this.a.add(asn2);
        asn2.a(asn2, this.a, random);
        ArrayList arrayList = asn2.e;
        while (!arrayList.isEmpty()) {
            int n4 = random.nextInt(arrayList.size());
            aua aua2 = (aua)arrayList.remove(n4);
            aua2.a(asn2, this.a, random);
        }
        this.c();
        this.a(afs2, random, 48, 70);
    }
}

