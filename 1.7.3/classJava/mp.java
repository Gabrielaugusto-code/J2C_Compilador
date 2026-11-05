/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  io.netty.buffer.Unpooled
 *  org.apache.commons.io.Charsets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.Charsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mp
extends xq
implements yt {
    private static final Logger bL = LogManager.getLogger();
    private String bM = "en_US";
    public na a;
    public final MinecraftServer b;
    public final mq c;
    public double d;
    public double e;
    public final List f = new LinkedList();
    private final List bN = new LinkedList();
    private final nx bO;
    private float bP = Float.MIN_VALUE;
    private float bQ = -1.0E8f;
    private int bR = -99999999;
    private boolean bS = true;
    private int bT = -99999999;
    private int bU = 60;
    private xs bV;
    private boolean bW = true;
    private long bX = 0L;
    private int bY;
    public boolean g;
    public int h;
    public boolean i;

    public mp(MinecraftServer minecraftServer, mm mm2, GameProfile gameProfile, mq mq2) {
        super(mm2, gameProfile);
        mq2.b = this;
        this.c = mq2;
        r r2 = mm2.K();
        int n2 = r2.a;
        int n3 = r2.c;
        int n4 = r2.b;
        if (!mm2.t.g && mm2.N().r() != agb.d) {
            int n5 = Math.max(5, minecraftServer.am() - 6);
            n4 = mm2.i(n2 += this.Z.nextInt(n5 * 2) - n5, n3 += this.Z.nextInt(n5 * 2) - n5);
        }
        this.b = minecraftServer;
        this.bO = minecraftServer.af().i(this.b_());
        this.W = 0.0f;
        this.L = 0.0f;
        this.b((double)n2 + 0.5, n4, (double)n3 + 0.5, 0.0f, 0.0f);
        while (!mm2.a((qr)this, this.C).isEmpty()) {
            this.b(this.s, this.t + 1.0, this.u);
        }
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        if (dg2.b("playerGameType", 99)) {
            if (MinecraftServer.G().an()) {
                this.c.a(MinecraftServer.G().i());
            } else {
                this.c.a(agb.a(dg2.f("playerGameType")));
            }
        }
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("playerGameType", this.c.b().a());
    }

    @Override
    public void a(int n2) {
        super.a(n2);
        this.bT = -1;
    }

    public void d_() {
        this.bo.a(this);
    }

    @Override
    protected void e_() {
        this.L = 0.0f;
    }

    @Override
    public float g() {
        return 1.62f;
    }

    @Override
    public void h() {
        Object object;
        Object object2;
        this.c.a();
        --this.bU;
        if (this.ad > 0) {
            --this.ad;
        }
        this.bo.b();
        if (!this.o.E && !this.bo.a(this)) {
            this.k();
            this.bo = this.bn;
        }
        while (!this.bN.isEmpty()) {
            int n2 = Math.min(this.bN.size(), 127);
            object2 = new int[n2];
            object = this.bN.iterator();
            int n3 = 0;
            while (object.hasNext() && n3 < n2) {
                object2[n3++] = (Integer)object.next();
                object.remove();
            }
            this.a.a(new hh((int[])object2));
        }
        if (!this.f.isEmpty()) {
            Object object32;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            object2 = this.f.iterator();
            object = new ArrayList();
            while (object2.hasNext() && arrayList.size() < gq.c()) {
                afl afl2 = (afl)object2.next();
                if (afl2 != null) {
                    if (!this.o.d(afl2.a << 4, 0, afl2.b << 4) || !((aoo)(object32 = this.o.e(afl2.a, afl2.b))).k()) continue;
                    arrayList.add(object32);
                    object.addAll(((mm)this.o).a(afl2.a * 16, 0, afl2.b * 16, afl2.a * 16 + 16, 256, afl2.b * 16 + 16));
                    object2.remove();
                    continue;
                }
                object2.remove();
            }
            if (!arrayList.isEmpty()) {
                this.a.a(new gq(arrayList));
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    object32 = (ani)iterator.next();
                    this.b((ani)object32);
                }
                for (Object object32 : arrayList) {
                    this.r().r().a(this, (aoo)object32);
                }
            }
        }
        if (this.bX > 0L && this.b.aq() > 0 && MinecraftServer.ap() - this.bX > (long)(this.b.aq() * 1000 * 60)) {
            this.a.c("You have been idle for too long!");
        }
    }

    public void i() {
        try {
            super.h();
            for (int i2 = 0; i2 < this.bm.a(); ++i2) {
                Object object;
                abu abu2 = this.bm.a(i2);
                if (abu2 == null || !abu2.b().h() || (object = ((aaj)abu2.b()).c(abu2, this.o, this)) == null) continue;
                this.a.a((fk)object);
            }
            if (this.aR() != this.bQ || this.bR != this.bp.a() || this.bp.e() == 0.0f != this.bS) {
                this.a.a(new hs(this.aR(), this.bp.a(), this.bp.e()));
                this.bQ = this.aR();
                this.bR = this.bp.a();
                boolean bl2 = this.bS = this.bp.e() == 0.0f;
            }
            if (this.aR() + this.br() != this.bP) {
                this.bP = this.aR() + this.br();
                Collection collection = this.bT().a(azb.f);
                for (Object object : collection) {
                    this.bT().a(this.b_(), (ayr)object).a(Arrays.asList(this));
                }
            }
            if (this.bG != this.bT) {
                this.bT = this.bG;
                this.a.a(new hr(this.bH, this.bG, this.bF));
            }
            if (this.aa % 20 * 5 == 0 && !this.w().a(nt.L)) {
                this.j();
            }
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Ticking player");
            k k2 = b2.a("Player being ticked");
            this.a(k2);
            throw new s(b2);
        }
    }

    protected void j() {
        agl agl2 = this.o.a(oy.c(this.s), oy.c(this.u));
        if (agl2 != null) {
            String string = agl2.af;
            oi oi2 = (oi)this.w().b((ny)nt.L);
            if (oi2 == null) {
                oi2 = (oi)this.w().a(nt.L, new oi());
            }
            oi2.add(string);
            if (this.w().b(nt.L) && oi2.size() == agl.n.size()) {
                HashSet hashSet = Sets.newHashSet((Iterable)agl.n);
                Iterator iterator = oi2.iterator();
                while (iterator.hasNext()) {
                    String string2 = (String)iterator.next();
                    Iterator iterator2 = hashSet.iterator();
                    while (iterator2.hasNext()) {
                        agl agl3 = (agl)iterator2.next();
                        if (!agl3.af.equals(string2)) continue;
                        iterator2.remove();
                    }
                    if (!hashSet.isEmpty()) continue;
                    break;
                }
                if (hashSet.isEmpty()) {
                    this.a(nt.L);
                }
            }
        }
    }

    @Override
    public void a(qf qf2) {
        Object object;
        this.b.af().a(this.aV().b());
        if (!this.o.O().b("keepInventory")) {
            this.bm.m();
        }
        Collection collection = this.o.X().a(azb.c);
        for (ayr ayr2 : collection) {
            object = this.bT().a(this.b_(), ayr2);
            ((ayt)object).a();
        }
        rm rm2 = this.aW();
        if (rm2 != null) {
            int n2 = qx.a(rm2);
            object = (qy)qx.a.get(n2);
            if (object != null) {
                this.a(((qy)object).e, 1);
            }
            rm2.b(this, this.ba);
        }
        this.a(og.v, 1);
        this.aV().g();
    }

    @Override
    public boolean a(qf qf2, float f2) {
        boolean bl2;
        if (this.av()) {
            return false;
        }
        boolean bl3 = bl2 = this.b.V() && this.b.Z() && "fall".equals(qf2.o);
        if (!bl2 && this.bU > 0 && qf2 != qf.i) {
            return false;
        }
        if (qf2 instanceof qg) {
            qr qr2 = qf2.j();
            if (qr2 instanceof xq && !this.a((xq)qr2)) {
                return false;
            }
            if (qr2 instanceof xt) {
                xt xt2 = (xt)qr2;
                if (xt2.c instanceof xq && !this.a((xq)xt2.c)) {
                    return false;
                }
            }
        }
        return super.a(qf2, f2);
    }

    @Override
    public boolean a(xq xq2) {
        if (!this.b.Z()) {
            return false;
        }
        return super.a(xq2);
    }

    @Override
    public void b(int n2) {
        if (this.ap == 1 && n2 == 1) {
            this.a(nt.D);
            this.o.e(this);
            this.i = true;
            this.a.a(new gm(4, 0.0f));
        } else {
            if (this.ap == 0 && n2 == 1) {
                this.a(nt.C);
                r r2 = this.b.a(n2).l();
                if (r2 != null) {
                    this.a.a(r2.a, r2.b, r2.c, 0.0f, 0.0f);
                }
                n2 = 1;
            } else {
                this.a(nt.y);
            }
            this.b.af().a(this, n2);
            this.bT = -1;
            this.bQ = -1.0f;
            this.bR = -1;
        }
    }

    private void b(ani ani2) {
        fk fk2;
        if (ani2 != null && (fk2 = ani2.m()) != null) {
            this.a.a(fk2);
        }
    }

    @Override
    public void a(qr qr2, int n2) {
        super.a(qr2, n2);
        this.bo.b();
    }

    @Override
    public xr a(int n2, int n3, int n4) {
        xr xr2 = super.a(n2, n3, n4);
        if (xr2 == xr.a) {
            hg hg2 = new hg(this, n2, n3, n4);
            this.r().r().a((qr)this, hg2);
            this.a.a(this.s, this.t, this.u, this.y, this.z);
            this.a.a(hg2);
        }
        return xr2;
    }

    @Override
    public void a(boolean bl2, boolean bl3, boolean bl4) {
        if (this.bl()) {
            this.r().r().b(this, new ft(this, 2));
        }
        super.a(bl2, bl3, bl4);
        if (this.a != null) {
            this.a.a(this.s, this.t, this.u, this.y, this.z);
        }
    }

    @Override
    public void a(qr qr2) {
        super.a(qr2);
        this.a.a(new ho(0, this, this.m));
        this.a.a(this.s, this.t, this.u, this.y, this.z);
    }

    @Override
    protected void a(double d2, boolean bl2) {
    }

    public void b(double d2, boolean bl2) {
        super.a(d2, bl2);
    }

    @Override
    public void a(ani ani2) {
        if (ani2 instanceof aod) {
            ((aod)ani2).a(this);
            this.a.a(new ha(ani2.c, ani2.d, ani2.e));
        }
    }

    private void bU() {
        this.bY = this.bY % 100 + 1;
    }

    @Override
    public void b(int n2, int n3, int n4) {
        this.bU();
        this.a.a(new ge(this.bY, 1, "Crafting", 9, true));
        this.bo = new yw(this.bm, this.o, n2, n3, n4);
        this.bo.d = this.bY;
        this.bo.a(this);
    }

    @Override
    public void a(int n2, int n3, int n4, String string) {
        this.bU();
        this.a.a(new ge(this.bY, 4, string == null ? "" : string, 9, string != null));
        this.bo = new yx(this.bm, this.o, n2, n3, n4);
        this.bo.d = this.bY;
        this.bo.a(this);
    }

    @Override
    public void c(int n2, int n3, int n4) {
        this.bU();
        this.a.a(new ge(this.bY, 8, "Repairing", 9, true));
        this.bo = new yl(this.bm, this.o, n2, n3, n4, this);
        this.bo.d = this.bY;
        this.bo.a(this);
    }

    @Override
    public void a(ps ps2) {
        if (this.bo != this.bn) {
            this.k();
        }
        this.bU();
        this.a.a(new ge(this.bY, 0, ps2.b(), ps2.a(), ps2.k_()));
        this.bo = new yu(this.bm, ps2);
        this.bo.d = this.bY;
        this.bo.a(this);
    }

    @Override
    public void a(anz anz2) {
        this.bU();
        this.a.a(new ge(this.bY, 9, anz2.b(), anz2.a(), anz2.k_()));
        this.bo = new zc(this.bm, anz2);
        this.bo.d = this.bY;
        this.bo.a(this);
    }

    @Override
    public void a(wi wi2) {
        this.bU();
        this.a.a(new ge(this.bY, 9, wi2.b(), wi2.a(), wi2.k_()));
        this.bo = new zc(this.bm, wi2);
        this.bo.d = this.bY;
        this.bo.a(this);
    }

    @Override
    public void a(anx anx2) {
        this.bU();
        this.a.a(new ge(this.bY, 2, anx2.b(), anx2.a(), anx2.k_()));
        this.bo = new za(this.bm, anx2);
        this.bo.d = this.bY;
        this.bo.a(this);
    }

    @Override
    public void a(ans ans2) {
        this.bU();
        this.a.a(new ge(this.bY, ans2 instanceof ant ? 10 : 3, ans2.b(), ans2.a(), ans2.k_()));
        this.bo = new zq(this.bm, ans2);
        this.bo.d = this.bY;
        this.bo.a(this);
    }

    @Override
    public void a(anm anm2) {
        this.bU();
        this.a.a(new ge(this.bY, 5, anm2.b(), anm2.a(), anm2.k_()));
        this.bo = new yq(this.bm, anm2);
        this.bo.d = this.bY;
        this.bo.a(this);
    }

    @Override
    public void a(anh anh2) {
        this.bU();
        this.a.a(new ge(this.bY, 7, anh2.b(), anh2.a(), anh2.k_()));
        this.bo = new yo(this.bm, anh2);
        this.bo.d = this.bY;
        this.bo.a(this);
    }

    @Override
    public void a(afd afd2, String string) {
        this.bU();
        this.bo = new zk(this.bm, afd2, this.o);
        this.bo.d = this.bY;
        this.bo.a(this);
        zj zj2 = ((zk)this.bo).e();
        this.a.a(new ge(this.bY, 6, string == null ? "" : string, zj2.a(), string != null));
        aff aff2 = afd2.b(this);
        if (aff2 != null) {
            try {
                ep ep2 = new ep(Unpooled.buffer());
                ep2.writeInt(this.bY);
                aff2.a(ep2);
                this.a.a(new gi("MC|TrList", ep2));
            }
            catch (IOException iOException) {
                bL.error("Couldn't send trade list", (Throwable)iOException);
            }
        }
    }

    @Override
    public void a(uz uz2, ps ps2) {
        if (this.bo != this.bn) {
            this.k();
        }
        this.bU();
        this.a.a(new ge(this.bY, 11, ps2.b(), ps2.a(), ps2.k_(), uz2.x()));
        this.bo = new zd(this.bm, ps2, uz2);
        this.bo.d = this.bY;
        this.bo.a(this);
    }

    @Override
    public void a(yj yj2, int n2, abu abu2) {
        if (yj2.a(n2) instanceof zo) {
            return;
        }
        if (this.g) {
            return;
        }
        this.a.a(new gh(yj2.d, n2, abu2));
    }

    public void a(yj yj2) {
        this.a(yj2, yj2.a());
    }

    @Override
    public void a(yj yj2, List list) {
        this.a.a(new gf(yj2.d, list));
        this.a.a(new gh(-1, -1, this.bm.o()));
    }

    @Override
    public void a(yj yj2, int n2, int n3) {
        this.a.a(new gg(yj2.d, n2, n3));
    }

    @Override
    public void k() {
        this.a.a(new gd(this.bo.d));
        this.m();
    }

    public void l() {
        if (this.g) {
            return;
        }
        this.a.a(new gh(-1, -1, this.bm.o()));
    }

    public void m() {
        this.bo.b(this);
        this.bo = this.bn;
    }

    public void a(float f2, float f3, boolean bl2, boolean bl3) {
        if (this.m != null) {
            if (f2 >= -1.0f && f2 <= 1.0f) {
                this.bd = f2;
            }
            if (f3 >= -1.0f && f3 <= 1.0f) {
                this.be = f3;
            }
            this.bc = bl2;
            this.b(bl3);
        }
    }

    @Override
    public void a(ny ny2, int n2) {
        if (ny2 == null) {
            return;
        }
        this.bO.b(this, ny2, n2);
        for (ayr ayr2 : this.bT().a(ny2.k())) {
            this.bT().a(this.b_(), ayr2).a();
        }
        if (this.bO.e()) {
            this.bO.a(this);
        }
    }

    public void n() {
        if (this.l != null) {
            this.l.a((qr)this);
        }
        if (this.bA) {
            this.a(true, false, false);
        }
    }

    public void o() {
        this.bQ = -1.0E8f;
    }

    @Override
    public void b(fa fa2) {
        this.a.a(new ga(fa2));
    }

    @Override
    protected void p() {
        this.a.a(new gk(this, 9));
        super.p();
    }

    @Override
    public void a(abu abu2, int n2) {
        super.a(abu2, n2);
        if (abu2 != null && abu2.b() != null && abu2.b().d(abu2) == acz.b) {
            this.r().r().b(this, new ft(this, 3));
        }
    }

    @Override
    public void a(xq xq2, boolean bl2) {
        super.a(xq2, bl2);
        this.bT = -1;
        this.bQ = -1.0f;
        this.bR = -1;
        this.bN.addAll(((mp)xq2).bN);
    }

    @Override
    protected void a(qn qn2) {
        super.a(qn2);
        this.a.a(new id(this.x(), qn2));
    }

    @Override
    protected void a(qn qn2, boolean bl2) {
        super.a(qn2, bl2);
        this.a.a(new id(this.x(), qn2));
    }

    @Override
    protected void b(qn qn2) {
        super.b(qn2);
        this.a.a(new hi(this.x(), qn2));
    }

    @Override
    public void a(double d2, double d3, double d4) {
        this.a.a(d2, d3, d4, this.y, this.z);
    }

    @Override
    public void b(qr qr2) {
        this.r().r().b(this, new ft(qr2, 4));
    }

    @Override
    public void c(qr qr2) {
        this.r().r().b(this, new ft(qr2, 5));
    }

    @Override
    public void q() {
        if (this.a == null) {
            return;
        }
        this.a.a(new hb(this.bE));
    }

    public mm r() {
        return (mm)this.o;
    }

    @Override
    public void a(agb agb2) {
        this.c.a(agb2);
        this.a.a(new gm(3, agb2.a()));
    }

    @Override
    public void a(fa fa2) {
        this.a.a(new ga(fa2));
    }

    @Override
    public boolean a(int n2, String string) {
        if ("seed".equals(string) && !this.b.V()) {
            return true;
        }
        if ("tell".equals(string) || "help".equals(string) || "me".equals(string)) {
            return true;
        }
        if (this.b.af().d(this.b_())) {
            return this.b.l() >= n2;
        }
        return false;
    }

    public String s() {
        String string = this.a.a.b().toString();
        string = string.substring(string.indexOf("/") + 1);
        string = string.substring(0, string.indexOf(":"));
        return string;
    }

    public void a(il il2) {
        this.bM = il2.c();
        int n2 = 256 >> il2.d();
        if (n2 <= 3 || n2 < 20) {
            // empty if block
        }
        this.bV = il2.e();
        this.bW = il2.f();
        if (this.b.L() && this.b.K().equals(this.b_())) {
            this.b.a(il2.g());
        }
        this.b(1, !il2.h());
    }

    public xs u() {
        return this.bV;
    }

    public void a(String string) {
        this.a.a(new gi("MC|RPack", string.getBytes(Charsets.UTF_8)));
    }

    @Override
    public r f_() {
        return new r(oy.c(this.s), oy.c(this.t + 0.5), oy.c(this.u));
    }

    public void v() {
        this.bX = MinecraftServer.ap();
    }

    public nx w() {
        return this.bO;
    }

    public void d(qr qr2) {
        if (qr2 instanceof xq) {
            this.a.a(new hh(qr2.x()));
        } else {
            this.bN.add(qr2.x());
        }
    }
}

