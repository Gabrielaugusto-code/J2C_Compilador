/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class abj
extends abs {
    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        if (!afs2.E) {
            xw xw2 = new xw(afs2, (float)n2 + f2, (float)n3 + f3, (float)n4 + f4, abu2);
            afs2.d(xw2);
            if (!xq2.bE.d) {
                --abu2.b;
            }
            return true;
        }
        return false;
    }

    @Override
    public void a(abu abu2, xq xq2, List list, boolean bl2) {
        dp dp2;
        if (!abu2.p()) {
            return;
        }
        dg dg2 = abu2.q().m("Fireworks");
        if (dg2 == null) {
            return;
        }
        if (dg2.b("Flight", 99)) {
            list.add(dc.a("item.fireworks.flight") + " " + dg2.d("Flight"));
        }
        if ((dp2 = dg2.c("Explosions", 10)) != null && dp2.c() > 0) {
            for (int i2 = 0; i2 < dp2.c(); ++i2) {
                dg dg3 = dp2.b(i2);
                ArrayList<String> arrayList = new ArrayList<String>();
                abi.a(dg3, arrayList);
                if (arrayList.size() <= 0) continue;
                for (int i3 = 1; i3 < arrayList.size(); ++i3) {
                    arrayList.set(i3, "  " + (String)arrayList.get(i3));
                }
                list.addAll(arrayList);
            }
        }
    }
}

