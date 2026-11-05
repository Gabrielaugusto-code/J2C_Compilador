/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 */
import com.google.common.collect.HashMultimap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class acg
extends abs {
    private HashMap a = new HashMap();
    private static final Map b = new LinkedHashMap();
    private pw c;
    private pw d;
    private pw m;

    public acg() {
        this.e(1);
        this.a(true);
        this.f(0);
        this.a(aak.k);
    }

    public List g(abu abu2) {
        if (!abu2.p() || !abu2.q().b("CustomPotionEffects", 9)) {
            List list = (List)this.a.get(abu2.k());
            if (list == null) {
                list = ade.b(abu2.k(), false);
                this.a.put(abu2.k(), list);
            }
            return list;
        }
        ArrayList<qn> arrayList = new ArrayList<qn>();
        dp dp2 = abu2.q().c("CustomPotionEffects", 10);
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            dg dg2 = dp2.b(i2);
            qn qn2 = qn.b(dg2);
            if (qn2 == null) continue;
            arrayList.add(qn2);
        }
        return arrayList;
    }

    public List c(int n2) {
        List list = (List)this.a.get(n2);
        if (list == null) {
            list = ade.b(n2, false);
            this.a.put(n2, list);
        }
        return list;
    }

    @Override
    public abu b(abu abu2, afs afs2, xq xq2) {
        List list;
        if (!xq2.bE.d) {
            --abu2.b;
        }
        if (!afs2.E && (list = this.g(abu2)) != null) {
            for (qn qn2 : list) {
                xq2.c(new qn(qn2));
            }
        }
        if (!xq2.bE.d) {
            if (abu2.b <= 0) {
                return new abu(abv.bo);
            }
            xq2.bm.a(new abu(abv.bo));
        }
        return abu2;
    }

    @Override
    public int d_(abu abu2) {
        return 32;
    }

    @Override
    public acz d(abu abu2) {
        return acz.c;
    }

    @Override
    public abu a(abu abu2, afs afs2, xq xq2) {
        if (acg.g(abu2.k())) {
            if (!xq2.bE.d) {
                --abu2.b;
            }
            afs2.a((qr)xq2, "random.bow", 0.5f, 0.4f / (g.nextFloat() * 0.4f + 0.8f));
            if (!afs2.E) {
                afs2.d(new yf(afs2, (rm)xq2, abu2));
            }
            return abu2;
        }
        xq2.a(abu2, this.d_(abu2));
        return abu2;
    }

    @Override
    public boolean a(abu abu2, xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        return false;
    }

    @Override
    public pw b_(int n2) {
        if (acg.g(n2)) {
            return this.c;
        }
        return this.d;
    }

    @Override
    public pw a(int n2, int n3) {
        if (n3 == 0) {
            return this.m;
        }
        return super.a(n2, n3);
    }

    public static boolean g(int n2) {
        return (n2 & 0x4000) != 0;
    }

    public int h(int n2) {
        return ade.a(n2, false);
    }

    @Override
    public int a(abu abu2, int n2) {
        if (n2 > 0) {
            return 0xFFFFFF;
        }
        return this.h(abu2.k());
    }

    @Override
    public boolean b() {
        return true;
    }

    public boolean i(int n2) {
        List list = this.c(n2);
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (qn qn2 : list) {
            if (!qm.a[qn2.a()].b()) continue;
            return true;
        }
        return false;
    }

    @Override
    public String n(abu abu2) {
        List list;
        if (abu2.k() == 0) {
            return dc.a("item.emptyPotion.name").trim();
        }
        String string = "";
        if (acg.g(abu2.k())) {
            string = dc.a("potion.prefix.grenade").trim() + " ";
        }
        if ((list = abv.bn.g(abu2)) != null && !list.isEmpty()) {
            String string2 = ((qn)list.get(0)).f();
            string2 = string2 + ".postfix";
            return string + dc.a(string2).trim();
        }
        String string3 = ade.c(abu2.k());
        return dc.a(string3).trim() + " " + super.n(abu2);
    }

    @Override
    public void a(abu abu2, xq xq2, List list, boolean bl2) {
        Object object;
        if (abu2.k() == 0) {
            return;
        }
        List list2 = abv.bn.g(abu2);
        HashMultimap hashMultimap = HashMultimap.create();
        if (list2 != null && !list2.isEmpty()) {
            for (Object object2 : list2) {
                object = dc.a(((qn)object2).f()).trim();
                qm qm2 = qm.a[((qn)object2).a()];
                Map map = qm2.k();
                if (map != null && map.size() > 0) {
                    for (Map.Entry entry : map.entrySet()) {
                        sa sa2 = (sa)entry.getValue();
                        sa sa3 = new sa(sa2.b(), qm2.a(((qn)object2).c(), sa2), sa2.c());
                        hashMultimap.put((Object)((ry)entry.getKey()).a(), (Object)sa3);
                    }
                }
                if (((qn)object2).c() > 0) {
                    object = (String)object + " " + dc.a("potion.potency." + ((qn)object2).c()).trim();
                }
                if (((qn)object2).b() > 20) {
                    object = (String)object + " (" + qm.a((qn)object2) + ")";
                }
                if (qm2.f()) {
                    list.add((Object)((Object)a.m) + (String)object);
                    continue;
                }
                list.add((Object)((Object)a.h) + (String)object);
            }
        } else {
            Iterator iterator = dc.a("potion.empty").trim();
            list.add((Object)((Object)a.h) + (String)((Object)iterator));
        }
        if (!hashMultimap.isEmpty()) {
            list.add("");
            list.add((Object)((Object)a.f) + dc.a("potion.effects.whenDrank"));
            for (Object object2 : hashMultimap.entries()) {
                object = (sa)object2.getValue();
                double d2 = ((sa)object).d();
                double d3 = ((sa)object).c() == 1 || ((sa)object).c() == 2 ? ((sa)object).d() * 100.0 : ((sa)object).d();
                if (d2 > 0.0) {
                    list.add((Object)((Object)a.j) + dc.a("attribute.modifier.plus." + ((sa)object).c(), abu.a.format(d3), dc.a("attribute.name." + (String)object2.getKey())));
                    continue;
                }
                if (!(d2 < 0.0)) continue;
                list.add((Object)((Object)a.m) + dc.a("attribute.modifier.take." + ((sa)object).c(), abu.a.format(d3 *= -1.0), dc.a("attribute.name." + (String)object2.getKey())));
            }
        }
    }

    @Override
    public boolean e(abu abu2) {
        List list = this.g(abu2);
        return list != null && !list.isEmpty();
    }

    @Override
    public void a(abs abs2, aak aak2, List list) {
        int n2;
        super.a(abs2, aak2, list);
        if (b.isEmpty()) {
            for (int i2 = 0; i2 <= 15; ++i2) {
                for (n2 = 0; n2 <= 1; ++n2) {
                    int n3 = i2;
                    n3 = n2 == 0 ? (n3 |= 0x2000) : (n3 |= 0x4000);
                    for (int i3 = 0; i3 <= 2; ++i3) {
                        List list2;
                        int n4 = n3;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                n4 |= 0x20;
                            } else if (i3 == 2) {
                                n4 |= 0x40;
                            }
                        }
                        if ((list2 = ade.b(n4, false)) == null || list2.isEmpty()) continue;
                        b.put(list2, n4);
                    }
                }
            }
        }
        Iterator iterator = b.values().iterator();
        while (iterator.hasNext()) {
            n2 = (Integer)iterator.next();
            list.add(new abu(abs2, 1, n2));
        }
    }

    @Override
    public void a(px px2) {
        this.d = px2.a(this.w() + "_" + "bottle_drinkable");
        this.c = px2.a(this.w() + "_" + "bottle_splash");
        this.m = px2.a(this.w() + "_" + "overlay");
    }

    public static pw b(String string) {
        if (string.equals("bottle_drinkable")) {
            return abv.bn.d;
        }
        if (string.equals("bottle_splash")) {
            return abv.bn.c;
        }
        if (string.equals("overlay")) {
            return abv.bn.m;
        }
        return null;
    }
}

