/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class atu
extends apo {
    private atz e;
    protected Map d = new HashMap();

    public abstract String a();

    @Override
    protected final void a(afs afs2, int n2, int n3, int n4, int n5, ahz[] ahzArray) {
        this.a(afs2);
        if (this.d.containsKey(afl.a(n2, n3))) {
            return;
        }
        this.b.nextInt();
        try {
            if (this.a(n2, n3)) {
                auc auc2 = this.b(n2, n3);
                this.d.put(afl.a(n2, n3), auc2);
                this.a(n2, n3, auc2);
            }
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Exception preparing structure feature");
            k k2 = b2.a("Feature being prepared");
            k2.a("Is feature chunk", new atv(this, n2, n3));
            k2.a("Chunk location", String.format("%d,%d", n2, n3));
            k2.a("Chunk pos hash", new atw(this, n2, n3));
            k2.a("Structure type", new atx(this));
            throw new s(b2);
        }
    }

    public boolean a(afs afs2, Random random, int n2, int n3) {
        this.a(afs2);
        int n4 = (n2 << 4) + 8;
        int n5 = (n3 << 4) + 8;
        boolean bl2 = false;
        for (auc auc2 : this.d.values()) {
            if (!auc2.d() || !auc2.a().a(n4, n5, n4 + 15, n5 + 15)) continue;
            auc2.a(afs2, random, new arm(n4, n5, n4 + 15, n5 + 15));
            bl2 = true;
            this.a(auc2.e(), auc2.f(), auc2);
        }
        return bl2;
    }

    public boolean b(int n2, int n3, int n4) {
        this.a(this.c);
        return this.c(n2, n3, n4) != null;
    }

    protected auc c(int n2, int n3, int n4) {
        for (auc auc2 : this.d.values()) {
            if (!auc2.d() || !auc2.a().a(n2, n4, n2, n4)) continue;
            for (aua aua2 : auc2.b()) {
                if (!aua2.c().b(n2, n3, n4)) continue;
                return auc2;
            }
        }
        return null;
    }

    public boolean d(int n2, int n3, int n4) {
        this.a(this.c);
        for (auc auc2 : this.d.values()) {
            if (!auc2.d()) continue;
            return auc2.a().a(n2, n4, n2, n4);
        }
        return false;
    }

    public afk a(afs afs2, int n2, int n3, int n4) {
        double d2;
        int n5;
        int n6;
        int n7;
        afk afk2;
        Object object;
        this.c = afs2;
        this.a(afs2);
        this.b.setSeed(afs2.H());
        long l2 = this.b.nextLong();
        long l3 = this.b.nextLong();
        long l4 = (long)(n2 >> 4) * l2;
        long l5 = (long)(n4 >> 4) * l3;
        this.b.setSeed(l4 ^ l5 ^ afs2.H());
        this.a(afs2, n2 >> 4, n4 >> 4, 0, 0, null);
        double d3 = Double.MAX_VALUE;
        afk afk3 = null;
        for (Object object2 : this.d.values()) {
            if (!((auc)object2).d()) continue;
            object = (aua)((auc)object2).b().get(0);
            afk2 = ((aua)object).a();
            n7 = afk2.a - n2;
            n6 = afk2.b - n3;
            n5 = afk2.c - n4;
            d2 = n7 * n7 + n6 * n6 + n5 * n5;
            if (!(d2 < d3)) continue;
            d3 = d2;
            afk3 = afk2;
        }
        if (afk3 != null) {
            return afk3;
        }
        List list = this.o_();
        if (list != null) {
            Object object2;
            object2 = null;
            object = list.iterator();
            while (object.hasNext()) {
                afk2 = (afk)object.next();
                n7 = afk2.a - n2;
                n6 = afk2.b - n3;
                n5 = afk2.c - n4;
                d2 = n7 * n7 + n6 * n6 + n5 * n5;
                if (!(d2 < d3)) continue;
                d3 = d2;
                object2 = afk2;
            }
            return object2;
        }
        return null;
    }

    protected List o_() {
        return null;
    }

    private void a(afs afs2) {
        if (this.e == null) {
            this.e = (atz)afs2.a(atz.class, this.a());
            if (this.e == null) {
                this.e = new atz(this.a());
                afs2.a(this.a(), this.e);
            } else {
                dg dg2 = this.e.a();
                for (String string : dg2.c()) {
                    dg dg3;
                    du du2 = dg2.a(string);
                    if (du2.a() != 10 || !(dg3 = (dg)du2).c("ChunkX") || !dg3.c("ChunkZ")) continue;
                    int n2 = dg3.f("ChunkX");
                    int n3 = dg3.f("ChunkZ");
                    auc auc2 = aty.a(dg3, afs2);
                    this.d.put(afl.a(n2, n3), auc2);
                }
            }
        }
    }

    private void a(int n2, int n3, auc auc2) {
        this.e.a(auc2.a(n2, n3), n2, n3);
        this.e.c();
    }

    protected abstract boolean a(int var1, int var2);

    protected abstract auc b(int var1, int var2);
}

