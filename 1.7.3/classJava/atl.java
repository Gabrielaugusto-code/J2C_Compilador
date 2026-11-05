/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class atl
extends atg {
    @Override
    public void a(aua aua2, List list, Random random) {
        if (this.g == 2 || this.g == 3) {
            this.c((atp)aua2, list, random, 1, 1);
        } else {
            this.b((atp)aua2, list, random, 1, 1);
        }
    }

    @Override
    public boolean a(afs afs2, Random random, arm arm2) {
        if (this.a(afs2, arm2)) {
            return false;
        }
        this.a(afs2, arm2, 0, 0, 0, 4, 4, 4, true, random, asz.c());
        this.a(afs2, random, arm2, this.d, 1, 1, 0);
        if (this.g == 2 || this.g == 3) {
            this.a(afs2, arm2, 4, 1, 1, 4, 3, 3, aie.a, aie.a, false);
        } else {
            this.a(afs2, arm2, 0, 1, 1, 0, 3, 3, aie.a, aie.a, false);
        }
        return true;
    }
}

