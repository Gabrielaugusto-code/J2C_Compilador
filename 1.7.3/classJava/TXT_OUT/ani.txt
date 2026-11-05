/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ani {
    private static final Logger a = LogManager.getLogger();
    private static Map i = new HashMap();
    private static Map j = new HashMap();
    protected afs b;
    public int c;
    public int d;
    public int e;
    protected boolean f;
    public int g = -1;
    public ahz h;

    private static void a(Class clazz, String string) {
        if (i.containsKey(string)) {
            throw new IllegalArgumentException("Duplicate id: " + string);
        }
        i.put(string, clazz);
        j.put(clazz, string);
    }

    public afs w() {
        return this.b;
    }

    public void a(afs afs2) {
        this.b = afs2;
    }

    public boolean o() {
        return this.b != null;
    }

    public void a(dg dg2) {
        this.c = dg2.f("x");
        this.d = dg2.f("y");
        this.e = dg2.f("z");
    }

    public void b(dg dg2) {
        String string = (String)j.get(this.getClass());
        if (string == null) {
            throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
        }
        dg2.a("id", string);
        dg2.a("x", this.c);
        dg2.a("y", this.d);
        dg2.a("z", this.e);
    }

    public void h() {
    }

    public static ani c(dg dg2) {
        ani ani2 = null;
        try {
            Class clazz = (Class)i.get(dg2.j("id"));
            if (clazz != null) {
                ani2 = (ani)clazz.newInstance();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (ani2 != null) {
            ani2.a(dg2);
        } else {
            a.warn("Skipping BlockEntity with id " + dg2.j("id"));
        }
        return ani2;
    }

    public int p() {
        if (this.g == -1) {
            this.g = this.b.e(this.c, this.d, this.e);
        }
        return this.g;
    }

    public void e() {
        if (this.b != null) {
            this.g = this.b.e(this.c, this.d, this.e);
            this.b.b(this.c, this.d, this.e, this);
            if (this.q() != aie.a) {
                this.b.f(this.c, this.d, this.e, this.q());
            }
        }
    }

    public double a(double d2, double d3, double d4) {
        double d5 = (double)this.c + 0.5 - d2;
        double d6 = (double)this.d + 0.5 - d3;
        double d7 = (double)this.e + 0.5 - d4;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public double n() {
        return 4096.0;
    }

    public ahz q() {
        if (this.h == null) {
            this.h = this.b.a(this.c, this.d, this.e);
        }
        return this.h;
    }

    public fk m() {
        return null;
    }

    public boolean r() {
        return this.f;
    }

    public void s() {
        this.f = true;
    }

    public void t() {
        this.f = false;
    }

    public boolean c(int n2, int n3) {
        return false;
    }

    public void u() {
        this.h = null;
        this.g = -1;
    }

    public void a(k k2) {
        k2.a("Name", new anj(this));
        k.a(k2, this.c, this.d, this.e, this.q(), this.p());
        k2.a("Actual block type", new ank(this));
        k2.a("Actual block data value", new anl(this));
    }

    static /* synthetic */ Map v() {
        return j;
    }

    static {
        ani.a(anx.class, "Furnace");
        ani.a(ann.class, "Chest");
        ani.a(anv.class, "EnderChest");
        ani.a(aki.class, "RecordPlayer");
        ani.a(ans.class, "Trap");
        ani.a(ant.class, "Dropper");
        ani.a(aod.class, "Sign");
        ani.a(aoa.class, "MobSpawner");
        ani.a(aoc.class, "Music");
        ani.a(aoj.class, "Piston");
        ani.a(anm.class, "Cauldron");
        ani.a(anu.class, "EnchantTable");
        ani.a(aof.class, "Airportal");
        ani.a(ano.class, "Control");
        ani.a(anh.class, "Beacon");
        ani.a(aoe.class, "Skull");
        ani.a(anr.class, "DLDetector");
        ani.a(anz.class, "Hopper");
        ani.a(anq.class, "Comparator");
        ani.a(anw.class, "FlowerPot");
    }
}

