/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class afp {
    private TreeMap a = new TreeMap();

    public afp() {
        this.a("doFireTick", "true");
        this.a("mobGriefing", "true");
        this.a("keepInventory", "false");
        this.a("doMobSpawning", "true");
        this.a("doMobLoot", "true");
        this.a("doTileDrops", "true");
        this.a("commandBlockOutput", "true");
        this.a("naturalRegeneration", "true");
        this.a("doDaylightCycle", "true");
    }

    public void a(String string, String string2) {
        this.a.put(string, new afq(string2));
    }

    public void b(String string, String string2) {
        afq afq2 = (afq)this.a.get(string);
        if (afq2 != null) {
            afq2.a(string2);
        } else {
            this.a(string, string2);
        }
    }

    public String a(String string) {
        afq afq2 = (afq)this.a.get(string);
        if (afq2 != null) {
            return afq2.a();
        }
        return "";
    }

    public boolean b(String string) {
        afq afq2 = (afq)this.a.get(string);
        if (afq2 != null) {
            return afq2.b();
        }
        return false;
    }

    public dg a() {
        dg dg2 = new dg();
        for (String string : this.a.keySet()) {
            afq afq2 = (afq)this.a.get(string);
            dg2.a(string, afq2.a());
        }
        return dg2;
    }

    public void a(dg dg2) {
        Set set = dg2.c();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            String string;
            String string2 = string = (String)iterator.next();
            String string3 = dg2.j(string);
            this.b(string2, string3);
        }
    }

    public String[] b() {
        return this.a.keySet().toArray(new String[0]);
    }

    public boolean e(String string) {
        return this.a.containsKey(string);
    }
}

