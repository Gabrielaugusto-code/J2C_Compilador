/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class uq {
    private afs a;
    private final List b = new ArrayList();
    private final r c = new r(0, 0, 0);
    private final r d = new r(0, 0, 0);
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private TreeMap j = new TreeMap();
    private List k = new ArrayList();
    private int l;

    public uq() {
    }

    public uq(afs afs2) {
        this.a = afs2;
    }

    public void a(afs afs2) {
        this.a = afs2;
    }

    public void a(int n2) {
        ayp ayp2;
        int n3;
        this.g = n2;
        this.m();
        this.l();
        if (n2 % 20 == 0) {
            this.k();
        }
        if (n2 % 30 == 0) {
            this.j();
        }
        if (this.l < (n3 = this.h / 10) && this.b.size() > 20 && this.a.s.nextInt(7000) == 0 && (ayp2 = this.a(oy.d((float)this.d.a), oy.d((float)this.d.b), oy.d((float)this.d.c), 2, 4, 2)) != null) {
            vk vk2 = new vk(this.a);
            vk2.b(ayp2.c, ayp2.d, ayp2.e);
            this.a.d(vk2);
            ++this.l;
        }
    }

    private ayp a(int n2, int n3, int n4, int n5, int n6, int n7) {
        for (int i2 = 0; i2 < 10; ++i2) {
            int n8;
            int n9;
            int n10 = n2 + this.a.s.nextInt(16) - 8;
            if (!this.a(n10, n9 = n3 + this.a.s.nextInt(6) - 3, n8 = n4 + this.a.s.nextInt(16) - 8) || !this.b(n10, n9, n8, n5, n6, n7)) continue;
            return this.a.V().a(n10, n9, n8);
        }
        return null;
    }

    private boolean b(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (!afs.a(this.a, n2, n3 - 1, n4)) {
            return false;
        }
        int n8 = n2 - n5 / 2;
        int n9 = n4 - n7 / 2;
        for (int i2 = n8; i2 < n8 + n5; ++i2) {
            for (int i3 = n3; i3 < n3 + n6; ++i3) {
                for (int i4 = n9; i4 < n9 + n7; ++i4) {
                    if (!this.a.a(i2, i3, i4).r()) continue;
                    return false;
                }
            }
        }
        return true;
    }

    private void j() {
        List list = this.a.a(vk.class, ayk.a().a(this.d.a - this.e, this.d.b - 4, this.d.c - this.e, this.d.a + this.e, this.d.b + 4, this.d.c + this.e));
        this.l = list.size();
    }

    private void k() {
        List list = this.a.a(xm.class, ayk.a().a(this.d.a - this.e, this.d.b - 4, this.d.c - this.e, this.d.a + this.e, this.d.b + 4, this.d.c + this.e));
        this.h = list.size();
        if (this.h == 0) {
            this.j.clear();
        }
    }

    public r a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.b.size();
    }

    public int d() {
        return this.g - this.f;
    }

    public int e() {
        return this.h;
    }

    public boolean a(int n2, int n3, int n4) {
        return this.d.e(n2, n3, n4) < (float)(this.e * this.e);
    }

    public List f() {
        return this.b;
    }

    public up b(int n2, int n3, int n4) {
        up up2 = null;
        int n5 = Integer.MAX_VALUE;
        for (up up3 : this.b) {
            int n6 = up3.b(n2, n3, n4);
            if (n6 >= n5) continue;
            up2 = up3;
            n5 = n6;
        }
        return up2;
    }

    public up c(int n2, int n3, int n4) {
        up up2 = null;
        int n5 = Integer.MAX_VALUE;
        for (up up3 : this.b) {
            int n6 = up3.b(n2, n3, n4);
            n6 = n6 > 256 ? (n6 *= 1000) : up3.f();
            if (n6 >= n5) continue;
            up2 = up3;
            n5 = n6;
        }
        return up2;
    }

    public up e(int n2, int n3, int n4) {
        if (this.d.e(n2, n3, n4) > (float)(this.e * this.e)) {
            return null;
        }
        for (up up2 : this.b) {
            if (up2.a != n2 || up2.c != n4 || Math.abs(up2.b - n3) > 1) continue;
            return up2;
        }
        return null;
    }

    public void a(up up2) {
        this.b.add(up2);
        this.c.a += up2.a;
        this.c.b += up2.b;
        this.c.c += up2.c;
        this.n();
        this.f = up2.f;
    }

    public boolean g() {
        return this.b.isEmpty();
    }

    public void a(rm rm2) {
        for (ur ur2 : this.k) {
            if (ur2.a != rm2) continue;
            ur2.b = this.g;
            return;
        }
        this.k.add(new ur(this, rm2, this.g));
    }

    public rm b(rm rm2) {
        double d2 = Double.MAX_VALUE;
        ur ur2 = null;
        for (int i2 = 0; i2 < this.k.size(); ++i2) {
            ur ur3 = (ur)this.k.get(i2);
            double d3 = ur3.a.f(rm2);
            if (d3 > d2) continue;
            ur2 = ur3;
            d2 = d3;
        }
        return ur2 != null ? ur2.a : null;
    }

    public xq c(rm rm2) {
        double d2 = Double.MAX_VALUE;
        xq xq2 = null;
        for (String string : this.j.keySet()) {
            double d3;
            xq xq3;
            if (!this.d(string) || (xq3 = this.a.a(string)) == null || (d3 = xq3.f(rm2)) > d2) continue;
            xq2 = xq3;
            d2 = d3;
        }
        return xq2;
    }

    private void l() {
        Iterator iterator = this.k.iterator();
        while (iterator.hasNext()) {
            ur ur2 = (ur)iterator.next();
            if (ur2.a.Y() && Math.abs(this.g - ur2.b) <= 300) continue;
            iterator.remove();
        }
    }

    private void m() {
        boolean bl2 = false;
        boolean bl3 = this.a.s.nextInt(50) == 0;
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            up up2 = (up)iterator.next();
            if (bl3) {
                up2.d();
            }
            if (this.f(up2.a, up2.b, up2.c) && Math.abs(this.g - up2.f) <= 1200) continue;
            this.c.a -= up2.a;
            this.c.b -= up2.b;
            this.c.c -= up2.c;
            bl2 = true;
            up2.g = true;
            iterator.remove();
        }
        if (bl2) {
            this.n();
        }
    }

    private boolean f(int n2, int n3, int n4) {
        return this.a.a(n2, n3, n4) == aie.ao;
    }

    private void n() {
        int n2 = this.b.size();
        if (n2 == 0) {
            this.d.b(0, 0, 0);
            this.e = 0;
            return;
        }
        this.d.b(this.c.a / n2, this.c.b / n2, this.c.c / n2);
        int n3 = 0;
        for (up up2 : this.b) {
            n3 = Math.max(up2.b(this.d.a, this.d.b, this.d.c), n3);
        }
        this.e = Math.max(32, (int)Math.sqrt(n3) + 1);
    }

    public int a(String string) {
        Integer n2 = (Integer)this.j.get(string);
        if (n2 != null) {
            return n2;
        }
        return 0;
    }

    public int a(String string, int n2) {
        int n3 = this.a(string);
        int n4 = oy.a(n3 + n2, -30, 10);
        this.j.put(string, n4);
        return n4;
    }

    public boolean d(String string) {
        return this.a(string) <= -15;
    }

    public void a(dg dg2) {
        Object object;
        this.h = dg2.f("PopSize");
        this.e = dg2.f("Radius");
        this.l = dg2.f("Golems");
        this.f = dg2.f("Stable");
        this.g = dg2.f("Tick");
        this.i = dg2.f("MTick");
        this.d.a = dg2.f("CX");
        this.d.b = dg2.f("CY");
        this.d.c = dg2.f("CZ");
        this.c.a = dg2.f("ACX");
        this.c.b = dg2.f("ACY");
        this.c.c = dg2.f("ACZ");
        dp dp2 = dg2.c("Doors", 10);
        for (int i2 = 0; i2 < dp2.c(); ++i2) {
            dg dg3 = dp2.b(i2);
            object = new up(dg3.f("X"), dg3.f("Y"), dg3.f("Z"), dg3.f("IDX"), dg3.f("IDZ"), dg3.f("TS"));
            this.b.add(object);
        }
        dp dp3 = dg2.c("Players", 10);
        for (int i3 = 0; i3 < dp3.c(); ++i3) {
            object = dp3.b(i3);
            this.j.put(((dg)object).j("Name"), ((dg)object).f("S"));
        }
    }

    public void b(dg dg2) {
        dg2.a("PopSize", this.h);
        dg2.a("Radius", this.e);
        dg2.a("Golems", this.l);
        dg2.a("Stable", this.f);
        dg2.a("Tick", this.g);
        dg2.a("MTick", this.i);
        dg2.a("CX", this.d.a);
        dg2.a("CY", this.d.b);
        dg2.a("CZ", this.d.c);
        dg2.a("ACX", this.c.a);
        dg2.a("ACY", this.c.b);
        dg2.a("ACZ", this.c.c);
        dp dp2 = new dp();
        for (Object object : this.b) {
            Object object2 = new dg();
            ((dg)object2).a("X", ((up)object).a);
            ((dg)object2).a("Y", ((up)object).b);
            ((dg)object2).a("Z", ((up)object).c);
            ((dg)object2).a("IDX", ((up)object).d);
            ((dg)object2).a("IDZ", ((up)object).e);
            ((dg)object2).a("TS", ((up)object).f);
            dp2.a((du)object2);
        }
        dg2.a("Doors", dp2);
        dp dp3 = new dp();
        for (Object object2 : this.j.keySet()) {
            dg dg3 = new dg();
            dg3.a("Name", (String)object2);
            dg3.a("S", (int)((Integer)this.j.get(object2)));
            dp3.a(dg3);
        }
        dg2.a("Players", dp3);
    }

    public void h() {
        this.i = this.g;
    }

    public boolean i() {
        return this.i == 0 || this.g - this.i >= 3600;
    }

    public void b(int n2) {
        for (String string : this.j.keySet()) {
            this.a(string, n2);
        }
    }
}

