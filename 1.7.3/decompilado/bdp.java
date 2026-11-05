/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class bdp
extends bdn {
    private static final Logger u = LogManager.getLogger();
    private static final brq v = new brq("textures/gui/container/beacon.png");
    private anh w;
    private bdr x;
    private boolean y;

    public bdp(xo xo2, anh anh2) {
        super(new yo(xo2, anh2));
        this.w = anh2;
        this.f = 230;
        this.g = 219;
    }

    @Override
    public void r_() {
        super.r_();
        this.x = new bdr(this, -1, this.i + 164, this.r + 107);
        this.n.add(this.x);
        this.n.add(new bdq(this, -2, this.i + 190, this.r + 107));
        this.y = true;
        this.x.l = false;
    }

    @Override
    public void c() {
        super.c();
        if (this.y && this.w.l() >= 0) {
            bds bds2;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            this.y = false;
            for (n6 = 0; n6 <= 2; ++n6) {
                n5 = anh.a[n6].length;
                n4 = n5 * 22 + (n5 - 1) * 2;
                for (n3 = 0; n3 < n5; ++n3) {
                    n2 = anh.a[n6][n3].H;
                    bds2 = new bds(this, n6 << 8 | n2, this.i + 76 + n3 * 24 - n4 / 2, this.r + 22 + n6 * 25, n2, n6);
                    this.n.add(bds2);
                    if (n6 >= this.w.l()) {
                        bds2.l = false;
                        continue;
                    }
                    if (n2 != this.w.j()) continue;
                    bds2.b(true);
                }
            }
            n6 = 3;
            n5 = anh.a[n6].length + 1;
            n4 = n5 * 22 + (n5 - 1) * 2;
            for (n3 = 0; n3 < n5 - 1; ++n3) {
                n2 = anh.a[n6][n3].H;
                bds2 = new bds(this, n6 << 8 | n2, this.i + 167 + n3 * 24 - n4 / 2, this.r + 47, n2, n6);
                this.n.add(bds2);
                if (n6 >= this.w.l()) {
                    bds2.l = false;
                    continue;
                }
                if (n2 != this.w.k()) continue;
                bds2.b(true);
            }
            if (this.w.j() > 0) {
                bds bds3 = new bds(this, n6 << 8 | this.w.j(), this.i + 167 + (n5 - 1) * 24 - n4 / 2, this.r + 47, this.w.j(), n6);
                this.n.add(bds3);
                if (n6 >= this.w.l()) {
                    bds3.l = false;
                } else if (this.w.j() == this.w.k()) {
                    bds3.b(true);
                }
            }
        }
        this.x.l = this.w.a(0) != null && this.w.j() > 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void a(bau bau2) {
        if (bau2.k == -2) {
            this.k.a((bcl)null);
        } else if (bau2.k == -1) {
            String string = "MC|Beacon";
            ByteBuf byteBuf = Unpooled.buffer();
            try {
                byteBuf.writeInt(this.w.j());
                byteBuf.writeInt(this.w.k());
                this.k.v().a(new iq(string, byteBuf));
            }
            catch (Exception exception) {
                u.error("Couldn't send beacon info", (Throwable)exception);
            }
            finally {
                byteBuf.release();
            }
            this.k.a((bcl)null);
        } else if (bau2 instanceof bds) {
            if (((bds)bau2).c()) {
                return;
            }
            int n2 = bau2.k;
            int n3 = n2 & 0xFF;
            int n4 = n2 >> 8;
            if (n4 < 3) {
                this.w.d(n3);
            } else {
                this.w.e(n3);
            }
            this.n.clear();
            this.r_();
            this.c();
        }
    }

    @Override
    protected void b(int n2, int n3) {
        azg.a();
        this.a(this.q, bsc.a("tile.beacon.primary", new Object[0]), 62, 10, 0xE0E0E0);
        this.a(this.q, bsc.a("tile.beacon.secondary", new Object[0]), 169, 10, 0xE0E0E0);
        for (bau bau2 : this.n) {
            if (!bau2.a()) continue;
            bau2.b(n2 - this.i, n3 - this.r);
            break;
        }
        azg.c();
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.k.P().a(v);
        int n4 = (this.l - this.f) / 2;
        int n5 = (this.m - this.g) / 2;
        this.b(n4, n5, 0, 0, this.f, this.g);
        bdp.j.f = 100.0f;
        j.b(this.q, this.k.P(), new abu(abv.bC), n4 + 42, n5 + 109);
        j.b(this.q, this.k.P(), new abu(abv.i), n4 + 42 + 22, n5 + 109);
        j.b(this.q, this.k.P(), new abu(abv.k), n4 + 42 + 44, n5 + 109);
        j.b(this.q, this.k.P(), new abu(abv.j), n4 + 42 + 66, n5 + 109);
        bdp.j.f = 0.0f;
    }

    static /* synthetic */ brq g() {
        return v;
    }

    static /* synthetic */ void a(bdp bdp2, String string, int n2, int n3) {
        bdp2.a(string, n2, n3);
    }

    static /* synthetic */ void b(bdp bdp2, String string, int n2, int n3) {
        bdp2.a(string, n2, n3);
    }

    static /* synthetic */ void c(bdp bdp2, String string, int n2, int n3) {
        bdp2.a(string, n2, n3);
    }
}

