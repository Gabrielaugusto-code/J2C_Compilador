/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class adr {
    private static final adr a = new adr();
    private Map b = new HashMap();
    private Map c = new HashMap();

    public static adr a() {
        return a;
    }

    private adr() {
        this.a(aie.p, new abu(abv.j), 0.7f);
        this.a(aie.o, new abu(abv.k), 1.0f);
        this.a(aie.ag, new abu(abv.i), 1.0f);
        this.a(aie.m, new abu(aie.w), 0.1f);
        this.a(abv.al, new abu(abv.am), 0.35f);
        this.a(abv.bd, new abu(abv.be), 0.35f);
        this.a(abv.bf, new abu(abv.bg), 0.35f);
        this.a(aie.e, new abu(aie.b), 0.1f);
        this.a(abv.aD, new abu(abv.aC), 0.3f);
        this.a(aie.aG, new abu(aie.ch), 0.35f);
        this.a(aie.aF, new abu(abv.aR, 1, 2), 0.2f);
        this.a(aie.r, new abu(abv.h, 1, 1), 0.15f);
        this.a(aie.s, new abu(abv.h, 1, 1), 0.15f);
        this.a(aie.bA, new abu(abv.bC), 1.0f);
        this.a(abv.bG, new abu(abv.bH), 0.35f);
        this.a(aie.aL, new abu(abv.bT), 0.1f);
        for (abl abl2 : abl.values()) {
            if (!abl2.i()) continue;
            this.a(new abu(abv.aP, 1, abl2.a()), new abu(abv.aQ, 1, abl2.a()), 0.35f);
        }
        this.a(aie.q, new abu(abv.h), 0.1f);
        this.a(aie.ax, new abu(abv.ax), 0.7f);
        this.a(aie.x, new abu(abv.aR, 1, 4), 0.2f);
        this.a(aie.bY, new abu(abv.bU), 0.2f);
    }

    public void a(ahz ahz2, abu abu2, float f2) {
        this.a(abs.a(ahz2), abu2, f2);
    }

    public void a(abs abs2, abu abu2, float f2) {
        this.a(new abu(abs2, 1, Short.MAX_VALUE), abu2, f2);
    }

    public void a(abu abu2, abu abu3, float f2) {
        this.b.put(abu2, abu3);
        this.c.put(abu3, Float.valueOf(f2));
    }

    public abu a(abu abu2) {
        for (Map.Entry entry : this.b.entrySet()) {
            if (!this.a(abu2, (abu)entry.getKey())) continue;
            return (abu)entry.getValue();
        }
        return null;
    }

    private boolean a(abu abu2, abu abu3) {
        return abu3.b() == abu2.b() && (abu3.k() == Short.MAX_VALUE || abu3.k() == abu2.k());
    }

    public Map b() {
        return this.b;
    }

    public float b(abu abu2) {
        for (Map.Entry entry : this.c.entrySet()) {
            if (!this.a(abu2, (abu)entry.getKey())) continue;
            return ((Float)entry.getValue()).floatValue();
        }
        return 0.0f;
    }
}

