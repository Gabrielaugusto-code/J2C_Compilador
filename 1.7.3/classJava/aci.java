/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class aci
extends abs {
    private static final Map b = new HashMap();
    public final String a;

    protected aci(String string) {
        this.a = string;
        this.h = 1;
        this.a(aak.f);
        b.put(string, this);
    }

    @Override
    public pw b_(int n2) {
        return this.k;
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        if (afs2.a(n2, n3, n4) == aie.aI && afs2.e(n2, n3, n4) == 0) {
            if (afs2.E) {
                return true;
            }
            ((akh)aie.aI).b(afs2, n2, n3, n4, abu2);
            afs2.a(null, 1005, n2, n3, n4, abs.b(this));
            --abu2.b;
            return true;
        }
        return false;
    }

    @Override
    public void a(abu abu2, xq xq2, List list, boolean bl2) {
        list.add(this.i());
    }

    public String i() {
        return dc.a("item.record." + this.a + ".desc");
    }

    @Override
    public ach f(abu abu2) {
        return ach.c;
    }

    public static aci b(String string) {
        return (aci)b.get(string);
    }
}

