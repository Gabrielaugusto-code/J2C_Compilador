/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class bub
implements buh {
    private final List a = Lists.newArrayList();
    private final Random b = new Random();
    private final brq c;
    private final w d;
    private double e;
    private double f;

    public bub(brq brq2, double d2, double d3, w w2) {
        this.c = brq2;
        this.f = d3;
        this.e = d2;
        this.d = w2;
    }

    @Override
    public int a() {
        int n2 = 0;
        for (buh buh2 : this.a) {
            n2 += buh2.a();
        }
        return n2;
    }

    public btv b() {
        int n2 = this.a();
        if (this.a.isEmpty() || n2 == 0) {
            return buc.a;
        }
        int n3 = this.b.nextInt(n2);
        for (buh buh2 : this.a) {
            if ((n3 -= buh2.a()) >= 0) continue;
            btv btv2 = (btv)buh2.g();
            btv2.a(btv2.b() * this.e);
            btv2.b(btv2.c() * this.f);
            return btv2;
        }
        return buc.a;
    }

    public void a(buh buh2) {
        this.a.add(buh2);
    }

    public brq c() {
        return this.c;
    }

    public w d() {
        return this.d;
    }

    @Override
    public /* synthetic */ Object g() {
        return this.b();
    }
}

