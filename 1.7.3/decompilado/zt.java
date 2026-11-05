/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

final class zt
extends cl {
    zt() {
    }

    @Override
    protected abu b(cj cj2, abu abu2) {
        cq cq2 = ajd.b(cj2.h());
        int n2 = cj2.d() + cq2.c();
        int n3 = cj2.e() + cq2.d();
        int n4 = cj2.f() + cq2.e();
        ayk ayk2 = ayk.a().a(n2, n3, n4, n2 + 1, n3 + 1, n4 + 1);
        List list = cj2.k().a(rm.class, ayk2, (ra)new rg(abu2));
        if (list.size() > 0) {
            rm rm2 = (rm)list.get(0);
            int n5 = rm2 instanceof xq ? 1 : 0;
            int n6 = rn.b(abu2);
            abu abu3 = abu2.m();
            abu3.b = 1;
            rm2.c(n6 - n5, abu3);
            if (rm2 instanceof rn) {
                ((rn)rm2).a(n6, 2.0f);
            }
            --abu2.b;
            return abu2;
        }
        return super.b(cj2, abu2);
    }
}

