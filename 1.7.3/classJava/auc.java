/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public abstract class auc {
    protected LinkedList a = new LinkedList();
    protected arm b;
    private int c;
    private int d;

    public auc() {
    }

    public auc(int n2, int n3) {
        this.c = n2;
        this.d = n3;
    }

    public arm a() {
        return this.b;
    }

    public LinkedList b() {
        return this.a;
    }

    public void a(afs afs2, Random random, arm arm2) {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            aua aua2 = (aua)iterator.next();
            if (!aua2.c().a(arm2) || aua2.a(afs2, random, arm2)) continue;
            iterator.remove();
        }
    }

    protected void c() {
        this.b = arm.a();
        for (aua aua2 : this.a) {
            this.b.b(aua2.c());
        }
    }

    public dg a(int n2, int n3) {
        dg dg2 = new dg();
        dg2.a("id", aty.a(this));
        dg2.a("ChunkX", n2);
        dg2.a("ChunkZ", n3);
        dg2.a("BB", this.b.h());
        dp dp2 = new dp();
        for (aua aua2 : this.a) {
            dp2.a(aua2.b());
        }
        dg2.a("Children", dp2);
        this.a(dg2);
        return dg2;
    }

    public void a(dg dg2) {
    }

    public void a(afs afs2, dg dg2) {
        this.c = dg2.f("ChunkX");
        this.d = dg2.f("ChunkZ");
        if (dg2.c("BB")) {
            this.b = new arm(dg2.l("BB"));
        }
        dp dp2 = dg2.c("Children", 10);
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            this.a.add(aty.b(dp2.b(i2), afs2));
        }
        this.b(dg2);
    }

    public void b(dg dg2) {
    }

    protected void a(afs afs2, Random random, int n2) {
        int n3 = 63 - n2;
        int n4 = this.b.c() + 1;
        if (n4 < n3) {
            n4 += random.nextInt(n3 - n4);
        }
        int n5 = n4 - this.b.e;
        this.b.a(0, n5, 0);
        for (aua aua2 : this.a) {
            aua2.c().a(0, n5, 0);
        }
    }

    protected void a(afs afs2, Random random, int n2, int n3) {
        int n4 = n3 - n2 + 1 - this.b.c();
        int n5 = 1;
        n5 = n4 > 1 ? n2 + random.nextInt(n4) : n2;
        int n6 = n5 - this.b.b;
        this.b.a(0, n6, 0);
        for (aua aua2 : this.a) {
            aua2.c().a(0, n6, 0);
        }
    }

    public boolean d() {
        return true;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }
}

