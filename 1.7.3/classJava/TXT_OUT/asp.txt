/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class asp
extends auc {
    public asp() {
    }

    public asp(afs afs2, Random random, int n2, int n3) {
        super(n2, n3);
        agl agl2 = afs2.a(n2 * 16 + 8, n3 * 16 + 8);
        if (agl2 == agl.J || agl2 == agl.K) {
            ast ast2 = new ast(random, n2 * 16, n3 * 16);
            this.a.add(ast2);
        } else if (agl2 == agl.u) {
            asw asw2 = new asw(random, n2 * 16, n3 * 16);
            this.a.add(asw2);
        } else {
            ass ass2 = new ass(random, n2 * 16, n3 * 16);
            this.a.add(ass2);
        }
        this.c();
    }
}

