/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Maps
 *  com.mojang.authlib.GameProfile
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class lg {
    private static final Logger c = LogManager.getLogger();
    private static final SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    private final MinecraftServer e;
    public final List a = new ArrayList();
    private final kd f = new kd(new File("banned-players.txt"));
    private final kd g = new kd(new File("banned-ips.txt"));
    private final Set h = new HashSet();
    private final Set i = new HashSet();
    private final Map j = Maps.newHashMap();
    private ayg k;
    private boolean l;
    protected int b;
    private int m;
    private agb n;
    private boolean o;
    private int p;

    public lg(MinecraftServer minecraftServer) {
        this.e = minecraftServer;
        this.f.a(false);
        this.g.a(false);
        this.b = 8;
    }

    public void a(ef ef2, mp mp2) {
        dg dg2 = this.a(mp2);
        mp2.a(this.e.a(mp2.ap));
        mp2.c.a((mm)mp2.o);
        String string = "local";
        if (ef2.b() != null) {
            string = ef2.b().toString();
        }
        c.info(mp2.b_() + "[" + string + "] logged in with entity id " + mp2.x() + " at (" + mp2.s + ", " + mp2.t + ", " + mp2.u + ")");
        mm mm2 = this.e.a(mp2.ap);
        r r2 = mm2.K();
        this.a(mp2, null, mm2);
        na na2 = new na(this.e, ef2, mp2);
        na2.a(new gu(mp2.x(), mp2.c.b(), mm2.N().t(), mm2.t.i, mm2.r, this.l(), mm2.N().u()));
        na2.a(new gi("MC|Brand", this.p().getServerModName().getBytes(Charsets.UTF_8)));
        na2.a(new hw(r2.a, r2.b, r2.c));
        na2.a(new hb(mp2.bE));
        na2.a(new hl(mp2.bm.c));
        mp2.w().d();
        mp2.w().b(mp2);
        this.a((li)mm2.X(), mp2);
        this.e.au();
        fi fi2 = new fi("multiplayer.player.joined", mp2.c_());
        fi2.b().a(a.o);
        this.a(fi2);
        this.c(mp2);
        na2.a(mp2.s, mp2.t, mp2.u, mp2.y, mp2.z);
        this.b(mp2, mm2);
        if (this.e.T().length() > 0) {
            mp2.a(this.e.T());
        }
        Object object = mp2.aP().iterator();
        while (object.hasNext()) {
            qn qn2 = (qn)object.next();
            na2.a(new id(mp2.x(), qn2));
        }
        mp2.d_();
        if (dg2 != null && dg2.b("Riding", 10) && (object = qx.a(dg2.m("Riding"), (afs)mm2)) != null) {
            ((qr)object).n = true;
            mm2.d((qr)object);
            mp2.a((qr)object);
            ((qr)object).n = false;
        }
    }

    protected void a(li li2, mp mp2) {
        HashSet<Object> hashSet = new HashSet<Object>();
        for (Object object : li2.g()) {
            mp2.a.a(new hu((ays)object, 0));
        }
        for (int i2 = 0; i2 < 3; ++i2) {
            Object object;
            object = li2.a(i2);
            if (object == null || hashSet.contains(object)) continue;
            List list = li2.d((ayr)object);
            for (fk fk2 : list) {
                mp2.a.a(fk2);
            }
            hashSet.add(object);
        }
    }

    public void a(mm[] mmArray) {
        this.k = mmArray[0].M().e();
    }

    public void a(mp mp2, mm mm2) {
        mm mm3 = mp2.r();
        if (mm2 != null) {
            mm2.t().c(mp2);
        }
        mm3.t().a(mp2);
        mm3.b.c((int)mp2.s >> 4, (int)mp2.u >> 4);
    }

    public int a() {
        return mj.b(this.o());
    }

    public dg a(mp mp2) {
        dg dg2;
        dg dg3 = this.e.b[0].N().i();
        if (mp2.b_().equals(this.e.K()) && dg3 != null) {
            mp2.f(dg3);
            dg2 = dg3;
            c.debug("loading single player");
        } else {
            dg2 = this.k.b(mp2);
        }
        return dg2;
    }

    protected void b(mp mp2) {
        this.k.a(mp2);
        nx nx2 = (nx)this.j.get(mp2.b_());
        if (nx2 != null) {
            nx2.b();
        }
    }

    public void c(mp mp2) {
        this.a(new hf(mp2.b_(), true, 1000));
        this.a.add(mp2);
        mm mm2 = this.e.a(mp2.ap);
        mm2.d(mp2);
        this.a(mp2, null);
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            mp mp3 = (mp)this.a.get(i2);
            mp2.a.a(new hf(mp3.b_(), true, mp3.h));
        }
    }

    public void d(mp mp2) {
        mp2.r().t().d(mp2);
    }

    public void e(mp mp2) {
        mp2.a(og.f);
        this.b(mp2);
        mm mm2 = mp2.r();
        if (mp2.m != null) {
            mm2.f(mp2.m);
            c.debug("removing player mount");
        }
        mm2.e(mp2);
        mm2.t().c(mp2);
        this.a.remove(mp2);
        this.j.remove(mp2.b_());
        this.a(new hf(mp2.b_(), false, 9999));
    }

    public String a(SocketAddress socketAddress, GameProfile gameProfile) {
        if (this.f.a(gameProfile.getName())) {
            kc kc2 = (kc)this.f.c().get(gameProfile.getName());
            String string = "You are banned from this server!\nReason: " + kc2.f();
            if (kc2.d() != null) {
                string = string + "\nYour ban will be removed on " + d.format(kc2.d());
            }
            return string;
        }
        if (!this.c(gameProfile.getName())) {
            return "You are not white-listed on this server!";
        }
        String string = socketAddress.toString();
        string = string.substring(string.indexOf("/") + 1);
        if (this.g.a(string = string.substring(0, string.indexOf(":")))) {
            kc kc3 = (kc)this.g.c().get(string);
            String string2 = "Your IP address is banned from this server!\nReason: " + kc3.f();
            if (kc3.d() != null) {
                string2 = string2 + "\nYour ban will be removed on " + d.format(kc3.d());
            }
            return string2;
        }
        if (this.a.size() >= this.b) {
            return "The server is full!";
        }
        return null;
    }

    public mp a(GameProfile gameProfile) {
        ArrayList<mp> arrayList = new ArrayList<mp>();
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            mp mp2 = (mp)this.a.get(i2);
            if (!mp2.b_().equalsIgnoreCase(gameProfile.getName())) continue;
            arrayList.add(mp2);
        }
        for (mp mp2 : arrayList) {
            mp2.a.c("You logged in from another location");
        }
        mq mq2 = this.e.P() ? new me(this.e.a(0)) : new mq(this.e.a(0));
        return new mp(this.e, this.e.a(0), gameProfile, mq2);
    }

    public mp a(mp mp2, int n2, boolean bl2) {
        r r2;
        mp2.r().r().a(mp2);
        mp2.r().r().b(mp2);
        mp2.r().t().c(mp2);
        this.a.remove(mp2);
        this.e.a(mp2.ap).f(mp2);
        r r3 = mp2.bM();
        boolean bl3 = mp2.bN();
        mp2.ap = n2;
        mq mq2 = this.e.P() ? new me(this.e.a(mp2.ap)) : new mq(this.e.a(mp2.ap));
        mp mp3 = new mp(this.e, this.e.a(mp2.ap), mp2.bI(), mq2);
        mp3.a = mp2.a;
        mp3.a(mp2, bl2);
        mp3.d(mp2.x());
        mm mm2 = this.e.a(mp2.ap);
        this.a(mp3, mp2, mm2);
        if (r3 != null) {
            r2 = xq.a(this.e.a(mp2.ap), r3, bl3);
            if (r2 != null) {
                mp3.b((float)r2.a + 0.5f, (float)r2.b + 0.1f, (float)r2.c + 0.5f, 0.0f, 0.0f);
                mp3.a(r3, bl3);
            } else {
                mp3.a.a(new gm(0, 0.0f));
            }
        }
        mm2.b.c((int)mp3.s >> 4, (int)mp3.u >> 4);
        while (!mm2.a((qr)mp3, mp3.C).isEmpty()) {
            mp3.b(mp3.s, mp3.t + 1.0, mp3.u);
        }
        mp3.a.a(new hj(mp3.ap, mp3.o.r, mp3.o.N().u(), mp3.c.b()));
        r2 = mm2.K();
        mp3.a.a(mp3.s, mp3.t, mp3.u, mp3.y, mp3.z);
        mp3.a.a(new hw(r2.a, r2.b, r2.c));
        mp3.a.a(new hr(mp3.bH, mp3.bG, mp3.bF));
        this.b(mp3, mm2);
        mm2.t().a(mp3);
        mm2.d(mp3);
        this.a.add(mp3);
        mp3.d_();
        mp3.g(mp3.aR());
        return mp3;
    }

    public void a(mp mp2, int n2) {
        int n3 = mp2.ap;
        mm mm2 = this.e.a(mp2.ap);
        mp2.ap = n2;
        mm mm3 = this.e.a(mp2.ap);
        mp2.a.a(new hj(mp2.ap, mp2.o.r, mp2.o.N().u(), mp2.c.b()));
        mm2.f(mp2);
        mp2.K = false;
        this.a(mp2, n3, mm2, mm3);
        this.a(mp2, mm2);
        mp2.a.a(mp2.s, mp2.t, mp2.u, mp2.y, mp2.z);
        mp2.c.a(mm3);
        this.b(mp2, mm3);
        this.f(mp2);
        for (qn qn2 : mp2.aP()) {
            mp2.a.a(new id(mp2.x(), qn2));
        }
    }

    public void a(qr qr2, int n2, mm mm2, mm mm3) {
        double d2 = qr2.s;
        double d3 = qr2.u;
        double d4 = 8.0;
        double d5 = qr2.s;
        double d6 = qr2.t;
        double d7 = qr2.u;
        float f2 = qr2.y;
        mm2.C.a("moving");
        if (qr2.ap == -1) {
            qr2.b(d2 /= d4, qr2.t, d3 /= d4, qr2.y, qr2.z);
            if (qr2.Y()) {
                mm2.a(qr2, false);
            }
        } else if (qr2.ap == 0) {
            qr2.b(d2 *= d4, qr2.t, d3 *= d4, qr2.y, qr2.z);
            if (qr2.Y()) {
                mm2.a(qr2, false);
            }
        } else {
            r r2 = n2 == 1 ? mm3.K() : mm3.l();
            d2 = r2.a;
            qr2.t = r2.b;
            d3 = r2.c;
            qr2.b(d2, qr2.t, d3, 90.0f, 0.0f);
            if (qr2.Y()) {
                mm2.a(qr2, false);
            }
        }
        mm2.C.b();
        if (n2 != 1) {
            mm2.C.a("placing");
            d2 = oy.a((int)d2, -29999872, 29999872);
            d3 = oy.a((int)d3, -29999872, 29999872);
            if (qr2.Y()) {
                qr2.b(d2, qr2.t, d3, qr2.y, qr2.z);
                mm3.u().a(qr2, d5, d6, d7, f2);
                mm3.d(qr2);
                mm3.a(qr2, false);
            }
            mm2.C.b();
        }
        qr2.a(mm3);
    }

    public void b() {
        if (++this.p > 600) {
            this.p = 0;
        }
        if (this.p < this.a.size()) {
            mp mp2 = (mp)this.a.get(this.p);
            this.a(new hf(mp2.b_(), true, mp2.h));
        }
    }

    public void a(fk fk2) {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            ((mp)this.a.get((int)i2)).a.a(fk2);
        }
    }

    public void a(fk fk2, int n2) {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            mp mp2 = (mp)this.a.get(i2);
            if (mp2.ap != n2) continue;
            mp2.a.a(fk2);
        }
    }

    public String c() {
        String string = "";
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            if (i2 > 0) {
                string = string + ", ";
            }
            string = string + ((mp)this.a.get(i2)).b_();
        }
        return string;
    }

    public String[] d() {
        String[] stringArray = new String[this.a.size()];
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            stringArray[i2] = ((mp)this.a.get(i2)).b_();
        }
        return stringArray;
    }

    public kd e() {
        return this.f;
    }

    public kd f() {
        return this.g;
    }

    public void a(String string) {
        this.h.add(string.toLowerCase());
    }

    public void b(String string) {
        this.h.remove(string.toLowerCase());
    }

    public boolean c(String string) {
        string = string.trim().toLowerCase();
        return !this.l || this.h.contains(string) || this.i.contains(string);
    }

    public boolean d(String string) {
        return this.h.contains(string.trim().toLowerCase()) || this.e.L() && this.e.b[0].N().v() && this.e.K().equalsIgnoreCase(string) || this.o;
    }

    public mp e(String string) {
        for (mp mp2 : this.a) {
            if (!mp2.b_().equalsIgnoreCase(string)) continue;
            return mp2;
        }
        return null;
    }

    public List a(r r2, int n2, int n3, int n4, int n5, int n6, int n7, Map map, String string, String string2, afs afs2) {
        if (this.a.isEmpty()) {
            return null;
        }
        List<mp> list = new ArrayList();
        boolean bl2 = n4 < 0;
        boolean bl3 = string != null && string.startsWith("!");
        boolean bl4 = string2 != null && string2.startsWith("!");
        int n8 = n2 * n2;
        int n9 = n3 * n3;
        n4 = oy.a(n4);
        if (bl3) {
            string = string.substring(1);
        }
        if (bl4) {
            string2 = string2.substring(1);
        }
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            mp mp2 = (mp)this.a.get(i2);
            if (afs2 != null && mp2.o != afs2 || string != null && bl3 == string.equalsIgnoreCase(mp2.b_())) continue;
            if (string2 != null) {
                String string3;
                ayy ayy2 = mp2.bs();
                String string4 = string3 = ayy2 == null ? "" : ayy2.b();
                if (bl4 == string2.equalsIgnoreCase(string3)) continue;
            }
            if (r2 != null && (n2 > 0 || n3 > 0)) {
                float f2 = r2.e(mp2.f_());
                if (n2 > 0 && f2 < (float)n8 || n3 > 0 && f2 > (float)n9) continue;
            }
            if (!this.a((xq)mp2, map) || n5 != agb.a.a() && n5 != mp2.c.b().a() || n6 > 0 && mp2.bF < n6 || mp2.bF > n7) continue;
            list.add(mp2);
        }
        if (r2 != null) {
            Collections.sort(list, new lf(r2));
        }
        if (bl2) {
            Collections.reverse(list);
        }
        if (n4 > 0) {
            list = list.subList(0, Math.min(n4, list.size()));
        }
        return list;
    }

    private boolean a(xq xq2, Map map) {
        if (map == null || map.size() == 0) {
            return true;
        }
        for (Map.Entry entry : map.entrySet()) {
            ayw ayw2;
            ayr ayr2;
            String string = (String)entry.getKey();
            boolean bl2 = false;
            if (string.endsWith("_min") && string.length() > 4) {
                bl2 = true;
                string = string.substring(0, string.length() - 4);
            }
            if ((ayr2 = (ayw2 = xq2.bT()).b(string)) == null) {
                return false;
            }
            ayt ayt2 = xq2.bT().a(xq2.b_(), ayr2);
            int n2 = ayt2.c();
            if (n2 < (Integer)entry.getValue() && bl2) {
                return false;
            }
            if (n2 <= (Integer)entry.getValue() || bl2) continue;
            return false;
        }
        return true;
    }

    public void a(double d2, double d3, double d4, double d5, int n2, fk fk2) {
        this.a(null, d2, d3, d4, d5, n2, fk2);
    }

    public void a(xq xq2, double d2, double d3, double d4, double d5, int n2, fk fk2) {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            double d6;
            double d7;
            double d8;
            mp mp2 = (mp)this.a.get(i2);
            if (mp2 == xq2 || mp2.ap != n2 || !((d8 = d2 - mp2.s) * d8 + (d7 = d3 - mp2.t) * d7 + (d6 = d4 - mp2.u) * d6 < d5 * d5)) continue;
            mp2.a.a(fk2);
        }
    }

    public void g() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            this.b((mp)this.a.get(i2));
        }
    }

    public void f(String string) {
        this.i.add(string);
    }

    public void g(String string) {
        this.i.remove(string);
    }

    public Set h() {
        return this.i;
    }

    public Set i() {
        return this.h;
    }

    public void j() {
    }

    public void b(mp mp2, mm mm2) {
        mp2.a.a(new hx(mm2.I(), mm2.J(), mm2.O().b("doDaylightCycle")));
        if (mm2.Q()) {
            mp2.a.a(new gm(1, 0.0f));
            mp2.a.a(new gm(7, mm2.j(1.0f)));
            mp2.a.a(new gm(8, mm2.h(1.0f)));
        }
    }

    public void f(mp mp2) {
        mp2.a(mp2.bn);
        mp2.o();
        mp2.a.a(new hl(mp2.bm.c));
    }

    public int k() {
        return this.a.size();
    }

    public int l() {
        return this.b;
    }

    public String[] m() {
        return this.e.b[0].M().e().f();
    }

    public void a(boolean bl2) {
        this.l = bl2;
    }

    public List h(String string) {
        ArrayList<mp> arrayList = new ArrayList<mp>();
        for (mp mp2 : this.a) {
            if (!mp2.s().equals(string)) continue;
            arrayList.add(mp2);
        }
        return arrayList;
    }

    public int o() {
        return this.m;
    }

    public MinecraftServer p() {
        return this.e;
    }

    public dg q() {
        return null;
    }

    public void a(agb agb2) {
        this.n = agb2;
    }

    private void a(mp mp2, mp mp3, afs afs2) {
        if (mp3 != null) {
            mp2.c.a(mp3.c.b());
        } else if (this.n != null) {
            mp2.c.a(this.n);
        }
        mp2.c.b(afs2.N().r());
    }

    public void b(boolean bl2) {
        this.o = bl2;
    }

    public void r() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            ((mp)this.a.get((int)i2)).a.c("Server closed");
        }
    }

    public void a(fa fa2, boolean bl2) {
        this.e.a(fa2);
        this.a(new ga(fa2, bl2));
    }

    public void a(fa fa2) {
        this.a(fa2, true);
    }

    public nx i(String string) {
        nx nx2 = (nx)this.j.get(string);
        if (nx2 == null) {
            nx2 = new nx(this.e, new File(this.e.a(0).M().b(), "stats/" + string + ".json"));
            nx2.a();
            this.j.put(string, nx2);
        }
        return nx2;
    }

    public void a(int n2) {
        this.m = n2;
        if (this.e.b == null) {
            return;
        }
        for (mm mm2 : this.e.b) {
            if (mm2 == null) continue;
            mm2.t().a(n2);
        }
    }
}

