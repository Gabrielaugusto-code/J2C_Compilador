/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class aso
extends atu {
    private static List e = Arrays.asList(agl.q, agl.F, agl.J, agl.K, agl.u);
    private List f = new ArrayList();
    private int g = 32;
    private int h = 8;

    public aso() {
        this.f.add(new ago(xg.class, 1, 1, 1));
    }

    public aso(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (!((String)entry.getKey()).equals("distance")) continue;
            this.g = oy.a((String)entry.getValue(), this.g, this.h + 1);
        }
    }

    @Override
    public String a() {
        return "Temple";
    }

    @Override
    protected boolean a(int n2, int n3) {
        int n4 = n2;
        int n5 = n3;
        if (n2 < 0) {
            n2 -= this.g - 1;
        }
        if (n3 < 0) {
            n3 -= this.g - 1;
        }
        int n6 = n2 / this.g;
        int n7 = n3 / this.g;
        Random random = this.c.A(n6, n7, 14357617);
        n6 *= this.g;
        n7 *= this.g;
        n2 = n4;
        n3 = n5;
        if (n2 == (n6 += random.nextInt(this.g - this.h)) && n3 == (n7 += random.nextInt(this.g - this.h))) {
            agl agl2 = this.c.v().a(n2 * 16 + 8, n3 * 16 + 8);
            for (agl agl3 : e) {
                if (agl2 != agl3) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    protected auc b(int n2, int n3) {
        return new asp(this.c, this.b, n2, n3);
    }

    public boolean a(int n2, int n3, int n4) {
        auc auc2 = this.c(n2, n3, n4);
        if (auc2 == null || !(auc2 instanceof asp) || auc2.a.isEmpty()) {
            return false;
        }
        aua aua2 = (aua)auc2.a.getFirst();
        return aua2 instanceof asw;
    }

    public List b() {
        return this.f;
    }
}

