/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public abstract class afh {
    public int b = 20;
    private String a = "Pig";
    private List e;
    private afi f;
    public double c;
    public double d;
    private int g = 200;
    private int h = 800;
    private int i = 4;
    private qr j;
    private int k = 6;
    private int l = 16;
    private int m = 4;

    public String e() {
        if (this.i() == null) {
            if (this.a.equals("Minecart")) {
                this.a = "MinecartRideable";
            }
            return this.a;
        }
        return this.i().c;
    }

    public void a(String string) {
        this.a = string;
    }

    public boolean f() {
        return this.a().a((double)this.b() + 0.5, (double)this.c() + 0.5, (double)this.d() + 0.5, (double)this.l) != null;
    }

    public void g() {
        if (!this.f()) {
            return;
        }
        if (this.a().E) {
            double d2 = (float)this.b() + this.a().s.nextFloat();
            double d3 = (float)this.c() + this.a().s.nextFloat();
            double d4 = (float)this.d() + this.a().s.nextFloat();
            this.a().a("smoke", d2, d3, d4, 0.0, 0.0, 0.0);
            this.a().a("flame", d2, d3, d4, 0.0, 0.0, 0.0);
            if (this.b > 0) {
                --this.b;
            }
            this.d = this.c;
            this.c = (this.c + (double)(1000.0f / ((float)this.b + 200.0f))) % 360.0;
        } else {
            if (this.b == -1) {
                this.j();
            }
            if (this.b > 0) {
                --this.b;
                return;
            }
            boolean bl2 = false;
            for (int i2 = 0; i2 < this.i; ++i2) {
                qr qr2 = qx.a(this.e(), this.a());
                if (qr2 == null) {
                    return;
                }
                int n2 = this.a().a(qr2.getClass(), ayk.a().a(this.b(), this.c(), this.d(), this.b() + 1, this.c() + 1, this.d() + 1).b(this.m * 2, 4.0, this.m * 2)).size();
                if (n2 >= this.k) {
                    this.j();
                    return;
                }
                double d5 = (double)this.b() + (this.a().s.nextDouble() - this.a().s.nextDouble()) * (double)this.m;
                double d6 = this.c() + this.a().s.nextInt(3) - 1;
                double d7 = (double)this.d() + (this.a().s.nextDouble() - this.a().s.nextDouble()) * (double)this.m;
                rn rn2 = qr2 instanceof rn ? (rn)qr2 : null;
                qr2.b(d5, d6, d7, this.a().s.nextFloat() * 360.0f, 0.0f);
                if (rn2 != null && !rn2.by()) continue;
                this.a(qr2);
                this.a().c(2004, this.b(), this.c(), this.d(), 0);
                if (rn2 != null) {
                    rn2.s();
                }
                bl2 = true;
            }
            if (bl2) {
                this.j();
            }
        }
    }

    public qr a(qr qr2) {
        if (this.i() != null) {
            Object object;
            Object object2 = new dg();
            qr2.d((dg)object2);
            for (Object object3 : this.i().b.c()) {
                object = this.i().b.a((String)object3);
                ((dg)object2).a((String)object3, ((du)object).b());
            }
            qr2.f((dg)object2);
            if (qr2.o != null) {
                qr2.o.d(qr2);
            }
            Object object4 = qr2;
            while (((dg)object2).b("Riding", 10)) {
                Object object3;
                object3 = ((dg)object2).m("Riding");
                object = qx.a(((dg)object3).j("id"), qr2.o);
                if (object != null) {
                    dg dg2 = new dg();
                    ((qr)object).d(dg2);
                    for (String string : ((dg)object3).c()) {
                        du du2 = ((dg)object3).a(string);
                        dg2.a(string, du2.b());
                    }
                    ((qr)object).f(dg2);
                    ((qr)object).b(((qr)object4).s, ((qr)object4).t, ((qr)object4).u, ((qr)object4).y, ((qr)object4).z);
                    if (qr2.o != null) {
                        qr2.o.d((qr)object);
                    }
                    ((qr)object4).a((qr)object);
                }
                object4 = object;
                object2 = object3;
            }
        } else if (qr2 instanceof rm && qr2.o != null) {
            ((rn)qr2).a((rp)null);
            this.a().d(qr2);
        }
        return qr2;
    }

    private void j() {
        this.b = this.h <= this.g ? this.g : this.g + this.a().s.nextInt(this.h - this.g);
        if (this.e != null && this.e.size() > 0) {
            this.a((afi)pm.a(this.a().s, this.e));
        }
        this.a(1);
    }

    public void a(dg dg2) {
        this.a = dg2.j("EntityId");
        this.b = dg2.e("Delay");
        if (dg2.b("SpawnPotentials", 9)) {
            this.e = new ArrayList();
            dp dp2 = dg2.c("SpawnPotentials", 10);
            for (int i2 = 0; i2 < dp2.c(); ++i2) {
                this.e.add(new afi(this, dp2.b(i2)));
            }
        } else {
            this.e = null;
        }
        if (dg2.b("SpawnData", 10)) {
            this.a(new afi(this, dg2.m("SpawnData"), this.a));
        } else {
            this.a((afi)null);
        }
        if (dg2.b("MinSpawnDelay", 99)) {
            this.g = dg2.e("MinSpawnDelay");
            this.h = dg2.e("MaxSpawnDelay");
            this.i = dg2.e("SpawnCount");
        }
        if (dg2.b("MaxNearbyEntities", 99)) {
            this.k = dg2.e("MaxNearbyEntities");
            this.l = dg2.e("RequiredPlayerRange");
        }
        if (dg2.b("SpawnRange", 99)) {
            this.m = dg2.e("SpawnRange");
        }
        if (this.a() != null && this.a().E) {
            this.j = null;
        }
    }

    public void b(dg dg2) {
        dg2.a("EntityId", this.e());
        dg2.a("Delay", (short)this.b);
        dg2.a("MinSpawnDelay", (short)this.g);
        dg2.a("MaxSpawnDelay", (short)this.h);
        dg2.a("SpawnCount", (short)this.i);
        dg2.a("MaxNearbyEntities", (short)this.k);
        dg2.a("RequiredPlayerRange", (short)this.l);
        dg2.a("SpawnRange", (short)this.m);
        if (this.i() != null) {
            dg2.a("SpawnData", this.i().b.b());
        }
        if (this.i() != null || this.e != null && this.e.size() > 0) {
            dp dp2 = new dp();
            if (this.e != null && this.e.size() > 0) {
                for (afi afi2 : this.e) {
                    dp2.a(afi2.a());
                }
            } else {
                dp2.a(this.i().a());
            }
            dg2.a("SpawnPotentials", dp2);
        }
    }

    public qr h() {
        if (this.j == null) {
            qr qr2 = qx.a(this.e(), null);
            this.j = qr2 = this.a(qr2);
        }
        return this.j;
    }

    public boolean b(int n2) {
        if (n2 == 1 && this.a().E) {
            this.b = this.g;
            return true;
        }
        return false;
    }

    public afi i() {
        return this.f;
    }

    public void a(afi afi2) {
        this.f = afi2;
    }

    public abstract void a(int var1);

    public abstract afs a();

    public abstract int b();

    public abstract int c();

    public abstract int d();
}

