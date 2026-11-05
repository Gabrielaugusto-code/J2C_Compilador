/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class abw
extends abs {
    public abw() {
        this.a(aak.i);
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        ahz ahz2 = afs2.a(n2, n3, n4);
        if (ahz2.b() == 11) {
            if (afs2.E) {
                return true;
            }
            abw.a(xq2, afs2, n2, n3, n4);
            return true;
        }
        return false;
    }

    public static boolean a(xq xq2, afs afs2, int n2, int n3, int n4) {
        rl rl2 = rl.b(afs2, n2, n3, n4);
        boolean bl2 = false;
        double d2 = 7.0;
        List list = afs2.a(rn.class, ayk.a().a((double)n2 - d2, (double)n3 - d2, (double)n4 - d2, (double)n2 + d2, (double)n3 + d2, (double)n4 + d2));
        if (list != null) {
            for (rn rn2 : list) {
                if (!rn2.bN() || rn2.bO() != xq2) continue;
                if (rl2 == null) {
                    rl2 = rl.a(afs2, n2, n3, n4);
                }
                rn2.b((qr)rl2, true);
                bl2 = true;
            }
        }
        return bl2;
    }
}

