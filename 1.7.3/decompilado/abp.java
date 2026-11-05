/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class abp
extends abo {
    public abp(int n2, float f2, boolean bl2) {
        super(n2, f2, bl2);
        this.a(true);
    }

    @Override
    public boolean e(abu abu2) {
        return abu2.k() > 0;
    }

    @Override
    public ach f(abu abu2) {
        if (abu2.k() == 0) {
            return ach.c;
        }
        return ach.d;
    }

    @Override
    protected void c(abu abu2, afs afs2, xq xq2) {
        if (!afs2.E) {
            xq2.c(new qn(qm.x.H, 2400, 0));
        }
        if (abu2.k() > 0) {
            if (!afs2.E) {
                xq2.c(new qn(qm.l.H, 600, 4));
                xq2.c(new qn(qm.m.H, 6000, 0));
                xq2.c(new qn(qm.n.H, 6000, 0));
            }
        } else {
            super.c(abu2, afs2, xq2);
        }
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        list.add(new abu(abs2, 1, 0));
        list.add(new abu(abs2, 1, 1));
    }
}

