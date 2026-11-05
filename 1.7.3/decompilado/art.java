/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class art
extends auc {
    public art() {
    }

    public art(afs afs2, Random random, int n2, int n3) {
        super(n2, n3);
        arr arr2 = new arr(0, random, (n2 << 4) + 2, (n3 << 4) + 2);
        this.a.add(arr2);
        arr2.a(arr2, this.a, random);
        this.c();
        this.a(afs2, random, 10);
    }
}

