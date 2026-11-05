/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ayw {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final ayr[] d = new ayr[3];
    private final Map e = new HashMap();
    private final Map f = new HashMap();

    public ayr b(String string) {
        return (ayr)this.a.get(string);
    }

    public ayr a(String string, azb azb2) {
        ayr ayr2 = this.b(string);
        if (ayr2 != null) {
            throw new IllegalArgumentException("An objective with the name '" + string + "' already exists!");
        }
        ayr2 = new ayr(this, string, azb2);
        ArrayList<ayr> arrayList = (ArrayList<ayr>)this.b.get(azb2);
        if (arrayList == null) {
            arrayList = new ArrayList<ayr>();
            this.b.put(azb2, arrayList);
        }
        arrayList.add(ayr2);
        this.a.put(string, ayr2);
        this.a(ayr2);
        return ayr2;
    }

    public Collection a(azb azb2) {
        Collection collection = (Collection)this.b.get(azb2);
        return collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public ayt a(String string, ayr ayr2) {
        ayt ayt2;
        HashMap<ayr, ayt> hashMap = (HashMap<ayr, ayt>)this.c.get(string);
        if (hashMap == null) {
            hashMap = new HashMap<ayr, ayt>();
            this.c.put(string, hashMap);
        }
        if ((ayt2 = (ayt)hashMap.get(ayr2)) == null) {
            ayt2 = new ayt(this, ayr2, string);
            hashMap.put(ayr2, ayt2);
        }
        return ayt2;
    }

    public Collection i(ayr ayr2) {
        ArrayList<ayt> arrayList = new ArrayList<ayt>();
        for (Map map : this.c.values()) {
            ayt ayt2 = (ayt)map.get(ayr2);
            if (ayt2 == null) continue;
            arrayList.add(ayt2);
        }
        Collections.sort(arrayList, ayt.a);
        return arrayList;
    }

    public Collection c() {
        return this.a.values();
    }

    public Collection d() {
        return this.c.keySet();
    }

    public void c(String string) {
        Map map = (Map)this.c.remove(string);
        if (map != null) {
            this.a(string);
        }
    }

    public Collection e() {
        Collection collection = this.c.values();
        ArrayList arrayList = new ArrayList();
        for (Map map : collection) {
            arrayList.addAll(map.values());
        }
        return arrayList;
    }

    public Map d(String string) {
        HashMap hashMap = (HashMap)this.c.get(string);
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        return hashMap;
    }

    public void k(ayr ayr2) {
        this.a.remove(ayr2.b());
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.a(i2) != ayr2) continue;
            this.a(i2, null);
        }
        List list = (List)this.b.get(ayr2.c());
        if (list != null) {
            list.remove(ayr2);
        }
        for (Map map : this.c.values()) {
            map.remove(ayr2);
        }
        this.c(ayr2);
    }

    public void a(int n2, ayr ayr2) {
        this.d[n2] = ayr2;
    }

    public ayr a(int n2) {
        return this.d[n2];
    }

    public ays e(String string) {
        return (ays)this.e.get(string);
    }

    public ays f(String string) {
        ays ays2 = this.e(string);
        if (ays2 != null) {
            throw new IllegalArgumentException("A team with the name '" + string + "' already exists!");
        }
        ays2 = new ays(this, string);
        this.e.put(string, ays2);
        this.a(ays2);
        return ays2;
    }

    public void d(ays ays2) {
        this.e.remove(ays2.b());
        for (String string : ays2.d()) {
            this.f.remove(string);
        }
        this.c(ays2);
    }

    public boolean a(String string, String string2) {
        if (!this.e.containsKey(string2)) {
            return false;
        }
        ays ays2 = this.e(string2);
        if (this.i(string) != null) {
            this.g(string);
        }
        this.f.put(string, ays2);
        ays2.d().add(string);
        return true;
    }

    public boolean g(String string) {
        ays ays2 = this.i(string);
        if (ays2 != null) {
            this.a(string, ays2);
            return true;
        }
        return false;
    }

    public void a(String string, ays ays2) {
        if (this.i(string) != ays2) {
            throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + ays2.b() + "'.");
        }
        this.f.remove(string);
        ays2.d().remove(string);
    }

    public Collection f() {
        return this.e.keySet();
    }

    public Collection g() {
        return this.e.values();
    }

    public ays i(String string) {
        return (ays)this.f.get(string);
    }

    public void a(ayr ayr2) {
    }

    public void b(ayr ayr2) {
    }

    public void c(ayr ayr2) {
    }

    public void a(ayt ayt2) {
    }

    public void a(String string) {
    }

    public void a(ays ays2) {
    }

    public void b(ays ays2) {
    }

    public void c(ays ays2) {
    }

    public static String b(int n2) {
        switch (n2) {
            case 0: {
                return "list";
            }
            case 1: {
                return "sidebar";
            }
            case 2: {
                return "belowName";
            }
        }
        return null;
    }

    public static int j(String string) {
        if (string.equalsIgnoreCase("list")) {
            return 0;
        }
        if (string.equalsIgnoreCase("sidebar")) {
            return 1;
        }
        if (string.equalsIgnoreCase("belowName")) {
            return 2;
        }
        return -1;
    }
}

