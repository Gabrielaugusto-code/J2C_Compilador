/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public final class abu {
    public static final DecimalFormat a = new DecimalFormat("#.###");
    public int b;
    public int c;
    private abs e;
    public dg d;
    private int f;
    private rk g;

    public abu(ahz ahz2) {
        this(ahz2, 1);
    }

    public abu(ahz ahz2, int n2) {
        this(ahz2, n2, 0);
    }

    public abu(ahz ahz2, int n2, int n3) {
        this(abs.a(ahz2), n2, n3);
    }

    public abu(abs abs2) {
        this(abs2, 1);
    }

    public abu(abs abs2, int n2) {
        this(abs2, n2, 0);
    }

    public abu(abs abs2, int n2, int n3) {
        this.e = abs2;
        this.b = n2;
        this.f = n3;
        if (this.f < 0) {
            this.f = 0;
        }
    }

    public static abu a(dg dg2) {
        abu abu2 = new abu();
        abu2.c(dg2);
        return abu2.b() != null ? abu2 : null;
    }

    private abu() {
    }

    public abu a(int n2) {
        abu abu2 = new abu(this.e, n2, this.f);
        if (this.d != null) {
            abu2.d = (dg)this.d.b();
        }
        this.b -= n2;
        return abu2;
    }

    public abs b() {
        return this.e;
    }

    public pw c() {
        return this.b().j(this);
    }

    public int d() {
        return this.b().d();
    }

    public boolean a(xq xq2, afs afs2, int n2, int n3, int n4, int n5, float f2, float f3, float f4) {
        boolean bl2 = this.b().a(this, xq2, afs2, n2, n3, n4, n5, f2, f3, f4);
        if (bl2) {
            xq2.a(og.E[abs.b(this.e)], 1);
        }
        return bl2;
    }

    public float a(ahz ahz2) {
        return this.b().a(this, ahz2);
    }

    public abu a(afs afs2, xq xq2) {
        return this.b().a(this, afs2, xq2);
    }

    public abu b(afs afs2, xq xq2) {
        return this.b().b(this, afs2, xq2);
    }

    public dg b(dg dg2) {
        dg2.a("id", (short)abs.b(this.e));
        dg2.a("Count", (byte)this.b);
        dg2.a("Damage", (short)this.f);
        if (this.d != null) {
            dg2.a("tag", this.d);
        }
        return dg2;
    }

    public void c(dg dg2) {
        this.e = abs.d(dg2.e("id"));
        this.b = dg2.d("Count");
        this.f = dg2.e("Damage");
        if (this.f < 0) {
            this.f = 0;
        }
        if (dg2.b("tag", 10)) {
            this.d = dg2.m("tag");
        }
    }

    public int e() {
        return this.b().m();
    }

    public boolean f() {
        return this.e() > 1 && (!this.g() || !this.i());
    }

    public boolean g() {
        if (this.e.o() <= 0) {
            return false;
        }
        return !this.p() || !this.q().n("Unbreakable");
    }

    public boolean h() {
        return this.e.n();
    }

    public boolean i() {
        return this.g() && this.f > 0;
    }

    public int j() {
        return this.f;
    }

    public int k() {
        return this.f;
    }

    public void b(int n2) {
        this.f = n2;
        if (this.f < 0) {
            this.f = 0;
        }
    }

    public int l() {
        return this.e.o();
    }

    public boolean a(int n2, Random random) {
        if (!this.g()) {
            return false;
        }
        if (n2 > 0) {
            int n3 = aem.a(aek.t.B, this);
            int n4 = 0;
            for (int i2 = 0; n3 > 0 && i2 < n2; ++i2) {
                if (!aei.a(this, n3, random)) continue;
                ++n4;
            }
            if ((n2 -= n4) <= 0) {
                return false;
            }
        }
        this.f += n2;
        return this.f > this.l();
    }

    public void a(int n2, rm rm2) {
        if (rm2 instanceof xq && ((xq)rm2).bE.d) {
            return;
        }
        if (!this.g()) {
            return;
        }
        if (this.a(n2, rm2.aH())) {
            rm2.a(this);
            --this.b;
            if (rm2 instanceof xq) {
                xq xq2 = (xq)rm2;
                xq2.a(og.F[abs.b(this.e)], 1);
                if (this.b == 0 && this.b() instanceof aad) {
                    xq2.bF();
                }
            }
            if (this.b < 0) {
                this.b = 0;
            }
            this.f = 0;
        }
    }

    public void a(rm rm2, xq xq2) {
        boolean bl2 = this.e.a(this, rm2, (rm)xq2);
        if (bl2) {
            xq2.a(og.E[abs.b(this.e)], 1);
        }
    }

    public void a(afs afs2, ahz ahz2, int n2, int n3, int n4, xq xq2) {
        boolean bl2 = this.e.a(this, afs2, ahz2, n2, n3, n4, xq2);
        if (bl2) {
            xq2.a(og.E[abs.b(this.e)], 1);
        }
    }

    public boolean b(ahz ahz2) {
        return this.e.b(ahz2);
    }

    public boolean a(xq xq2, rm rm2) {
        return this.e.a(this, xq2, rm2);
    }

    public abu m() {
        abu abu2 = new abu(this.e, this.b, this.f);
        if (this.d != null) {
            abu2.d = (dg)this.d.b();
        }
        return abu2;
    }

    public static boolean a(abu abu2, abu abu3) {
        if (abu2 == null && abu3 == null) {
            return true;
        }
        if (abu2 == null || abu3 == null) {
            return false;
        }
        if (abu2.d == null && abu3.d != null) {
            return false;
        }
        return abu2.d == null || abu2.d.equals(abu3.d);
    }

    public static boolean b(abu abu2, abu abu3) {
        if (abu2 == null && abu3 == null) {
            return true;
        }
        if (abu2 == null || abu3 == null) {
            return false;
        }
        return abu2.d(abu3);
    }

    private boolean d(abu abu2) {
        if (this.b != abu2.b) {
            return false;
        }
        if (this.e != abu2.e) {
            return false;
        }
        if (this.f != abu2.f) {
            return false;
        }
        if (this.d == null && abu2.d != null) {
            return false;
        }
        return this.d == null || this.d.equals(abu2.d);
    }

    public boolean a(abu abu2) {
        return this.e == abu2.e && this.f == abu2.f;
    }

    public String a() {
        return this.e.a(this);
    }

    public static abu b(abu abu2) {
        return abu2 == null ? null : abu2.m();
    }

    public String toString() {
        return this.b + "x" + this.e.a() + "@" + this.f;
    }

    public void a(afs afs2, qr qr2, int n2, boolean bl2) {
        if (this.c > 0) {
            --this.c;
        }
        this.e.a(this, afs2, qr2, n2, bl2);
    }

    public void a(afs afs2, xq xq2, int n2) {
        xq2.a(og.D[abs.b(this.e)], n2);
        this.e.d(this, afs2, xq2);
    }

    public int n() {
        return this.b().d_(this);
    }

    public acz o() {
        return this.b().d(this);
    }

    public void b(afs afs2, xq xq2, int n2) {
        this.b().a(this, afs2, xq2, n2);
    }

    public boolean p() {
        return this.d != null;
    }

    public dg q() {
        return this.d;
    }

    public dp r() {
        if (this.d == null) {
            return null;
        }
        return this.d.c("ench", 10);
    }

    public void d(dg dg2) {
        this.d = dg2;
    }

    public String s() {
        dg dg2;
        String string = this.b().n(this);
        if (this.d != null && this.d.b("display", 10) && (dg2 = this.d.m("display")).b("Name", 8)) {
            string = dg2.j("Name");
        }
        return string;
    }

    public abu c(String string) {
        if (this.d == null) {
            this.d = new dg();
        }
        if (!this.d.b("display", 10)) {
            this.d.a("display", new dg());
        }
        this.d.m("display").a("Name", string);
        return this;
    }

    public void t() {
        if (this.d == null) {
            return;
        }
        if (!this.d.b("display", 10)) {
            return;
        }
        dg dg2 = this.d.m("display");
        dg2.o("Name");
        if (dg2.d()) {
            this.d.o("display");
            if (this.d.d()) {
                this.d((dg)null);
            }
        }
    }

    public boolean u() {
        if (this.d == null) {
            return false;
        }
        if (!this.d.b("display", 10)) {
            return false;
        }
        return this.d.m("display").b("Name", 8);
    }

    public List a(xq xq2, boolean bl2) {
        int n2;
        Object object;
        ArrayList<String> arrayList = new ArrayList<String>();
        String string = this.s();
        if (this.u()) {
            string = (Object)((Object)a.u) + string + (Object)((Object)a.v);
        }
        if (bl2) {
            object = "";
            if (string.length() > 0) {
                string = string + " (";
                object = ")";
            }
            n2 = abs.b(this.e);
            string = this.h() ? string + String.format("#%04d/%d%s", n2, this.f, object) : string + String.format("#%04d%s", n2, object);
        } else if (!this.u() && this.e == abv.aY) {
            string = string + " #" + this.f;
        }
        arrayList.add(string);
        this.e.a(this, xq2, arrayList, bl2);
        if (this.p()) {
            int n3;
            object = this.r();
            if (object != null) {
                for (n2 = 0; n2 < ((dp)object).c(); ++n2) {
                    short s2 = ((dp)object).b(n2).e("id");
                    n3 = ((dp)object).b(n2).e("lvl");
                    if (aek.b[s2] == null) continue;
                    arrayList.add(aek.b[s2].c(n3));
                }
            }
            if (this.d.b("display", 10)) {
                dp dp2;
                dg dg2 = this.d.m("display");
                if (dg2.b("color", 3)) {
                    if (bl2) {
                        arrayList.add("Color: #" + Integer.toHexString(dg2.f("color")).toUpperCase());
                    } else {
                        arrayList.add((Object)((Object)a.u) + dc.a("item.dyed"));
                    }
                }
                if (dg2.b("Lore") == 9 && (dp2 = dg2.c("Lore", 8)).c() > 0) {
                    for (n3 = 0; n3 < dp2.c(); ++n3) {
                        arrayList.add((Object)((Object)a.f) + "" + (Object)((Object)a.u) + dp2.f(n3));
                    }
                }
            }
        }
        if (!(object = this.D()).isEmpty()) {
            arrayList.add("");
            for (Map.Entry entry : object.entries()) {
                sa sa2 = (sa)entry.getValue();
                double d2 = sa2.d();
                if (sa2.a() == abs.f) {
                    d2 += (double)aem.a(this, rq.a);
                }
                double d3 = sa2.c() == 1 || sa2.c() == 2 ? d2 * 100.0 : d2;
                if (d2 > 0.0) {
                    arrayList.add((Object)((Object)a.j) + dc.a("attribute.modifier.plus." + sa2.c(), a.format(d3), dc.a("attribute.name." + (String)entry.getKey())));
                    continue;
                }
                if (!(d2 < 0.0)) continue;
                arrayList.add((Object)((Object)a.m) + dc.a("attribute.modifier.take." + sa2.c(), a.format(d3 *= -1.0), dc.a("attribute.name." + (String)entry.getKey())));
            }
        }
        if (this.p() && this.q().n("Unbreakable")) {
            arrayList.add((Object)((Object)a.j) + dc.a("item.unbreakable"));
        }
        if (bl2 && this.i()) {
            arrayList.add("Durability: " + (this.l() - this.j()) + " / " + this.l());
        }
        return arrayList;
    }

    public boolean v() {
        return this.b().e(this);
    }

    public ach w() {
        return this.b().f(this);
    }

    public boolean x() {
        if (!this.b().e_(this)) {
            return false;
        }
        return !this.y();
    }

    public void a(aek aek2, int n2) {
        if (this.d == null) {
            this.d(new dg());
        }
        if (!this.d.b("ench", 9)) {
            this.d.a("ench", new dp());
        }
        dp dp2 = this.d.c("ench", 10);
        dg dg2 = new dg();
        dg2.a("id", (short)aek2.B);
        dg2.a("lvl", (short)((byte)n2));
        dp2.a(dg2);
    }

    public boolean y() {
        return this.d != null && this.d.b("ench", 9);
    }

    public void a(String string, du du2) {
        if (this.d == null) {
            this.d(new dg());
        }
        this.d.a(string, du2);
    }

    public boolean z() {
        return this.b().v();
    }

    public boolean A() {
        return this.g != null;
    }

    public void a(rk rk2) {
        this.g = rk2;
    }

    public rk B() {
        return this.g;
    }

    public int C() {
        if (this.p() && this.d.b("RepairCost", 3)) {
            return this.d.f("RepairCost");
        }
        return 0;
    }

    public void c(int n2) {
        if (!this.p()) {
            this.d = new dg();
        }
        this.d.a("RepairCost", n2);
    }

    public Multimap D() {
        Multimap multimap;
        if (this.p() && this.d.b("AttributeModifiers", 9)) {
            multimap = HashMultimap.create();
            dp dp2 = this.d.c("AttributeModifiers", 10);
            for (int i2 = 0; i2 < dp2.c(); ++i2) {
                dg dg2 = dp2.b(i2);
                sa sa2 = xa.a(dg2);
                if (sa2.a().getLeastSignificantBits() == 0L || sa2.a().getMostSignificantBits() == 0L) continue;
                multimap.put((Object)dg2.j("AttributeName"), (Object)sa2);
            }
        } else {
            multimap = this.b().k();
        }
        return multimap;
    }

    public void a(abs abs2) {
        this.e = abs2;
    }

    public fa E() {
        fa fa2 = new fh("[").a(this.s()).a("]");
        if (this.e != null) {
            dg dg2 = new dg();
            this.b(dg2);
            fa2.b().a(new fc(fd.c, new fh(dg2.toString())));
            fa2.b().a(this.w().e);
        }
        return fa2;
    }
}

