/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Random;

public class ahe
extends agl {
    protected agl aD;

    public ahe(int n2, agl agl2) {
        super(n2);
        this.aD = agl2;
        this.a(agl2.ag, true);
        this.af = agl2.af + " M";
        this.ai = agl2.ai;
        this.ak = agl2.ak;
        this.al = agl2.al;
        this.am = agl2.am;
        this.an = agl2.an;
        this.ao = agl2.ao;
        this.ap = agl2.ap;
        this.aq = agl2.aq;
        this.aw = agl2.aw;
        this.ax = agl2.ax;
        this.at = new ArrayList(agl2.at);
        this.as = new ArrayList(agl2.as);
        this.av = new ArrayList(agl2.av);
        this.au = new ArrayList(agl2.au);
        this.ao = agl2.ao;
        this.ap = agl2.ap;
        this.am = agl2.am + 0.1f;
        this.an = agl2.an + 0.2f;
    }

    @Override
    public void a(afs afs2, Random random, int n2, int n3) {
        this.aD.ar.a(afs2, random, this, n2, n3);
    }

    @Override
    public void a(afs afs2, Random random, ahz[] ahzArray, byte[] byArray, int n2, int n3, double d2) {
        this.aD.a(afs2, random, ahzArray, byArray, n2, n3, d2);
    }

    @Override
    public float g() {
        return this.aD.g();
    }

    @Override
    public apt a(Random random) {
        return this.aD.a(random);
    }

    @Override
    public int c(int n2, int n3, int n4) {
        return this.aD.c(n2, n3, n3);
    }

    @Override
    public int b(int n2, int n3, int n4) {
        return this.aD.b(n2, n3, n3);
    }

    @Override
    public Class l() {
        return this.aD.l();
    }

    @Override
    public boolean a(agl agl2) {
        return this.aD.a(agl2);
    }

    @Override
    public agn m() {
        return this.aD.m();
    }
}

