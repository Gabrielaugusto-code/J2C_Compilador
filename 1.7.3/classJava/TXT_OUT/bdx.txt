/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 */
import io.netty.buffer.Unpooled;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class bdx
extends bcl {
    private static final Logger a = LogManager.getLogger();
    private baw f;
    private baw g;
    private final afg h;
    private bau i;
    private bau r;

    public bdx(afg afg2) {
        this.h = afg2;
    }

    @Override
    public void c() {
        this.f.a();
    }

    @Override
    public void r_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        this.i = new bau(0, this.l / 2 - 4 - 150, this.m / 4 + 120 + 12, 150, 20, bsc.a("gui.done", new Object[0]));
        this.n.add(this.i);
        this.r = new bau(1, this.l / 2 + 4, this.m / 4 + 120 + 12, 150, 20, bsc.a("gui.cancel", new Object[0]));
        this.n.add(this.r);
        this.f = new baw(this.q, this.l / 2 - 150, 50, 300, 20);
        this.f.f(Short.MAX_VALUE);
        this.f.b(true);
        this.f.a(this.h.i());
        this.g = new baw(this.q, this.l / 2 - 150, 135, 300, 20);
        this.g.f(Short.MAX_VALUE);
        this.g.c(false);
        this.g.a(this.h.i());
        if (this.h.h() != null) {
            this.g.a(this.h.h().c());
        }
        this.i.l = this.f.b().trim().length() > 0;
    }

    @Override
    public void b() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 1) {
            this.k.a((bcl)null);
        } else if (bau2.k == 0) {
            ep ep2 = new ep(Unpooled.buffer());
            try {
                ep2.writeByte(this.h.f());
                this.h.a(ep2);
                ep2.a(this.f.b());
                this.k.v().a(new iq("MC|AdvCdm", ep2));
            }
            catch (Exception exception) {
                a.error("Couldn't send command block info", (Throwable)exception);
            }
            finally {
                ep2.release();
            }
            this.k.a((bcl)null);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        this.f.a(c2, n2);
        this.g.a(c2, n2);
        boolean bl2 = this.i.l = this.f.b().trim().length() > 0;
        if (n2 == 28 || n2 == 156) {
            this.a(this.i);
        } else if (n2 == 1) {
            this.a(this.r);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.f.a(n2, n3, n4);
        this.g.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, bsc.a("advMode.setCommand", new Object[0]), this.l / 2, 20, 0xFFFFFF);
        this.b(this.q, bsc.a("advMode.command", new Object[0]), this.l / 2 - 150, 37, 0xA0A0A0);
        this.f.f();
        int n4 = 75;
        int n5 = 0;
        this.b(this.q, bsc.a("advMode.nearestPlayer", new Object[0]), this.l / 2 - 150, n4 + n5++ * this.q.a, 0xA0A0A0);
        this.b(this.q, bsc.a("advMode.randomPlayer", new Object[0]), this.l / 2 - 150, n4 + n5++ * this.q.a, 0xA0A0A0);
        this.b(this.q, bsc.a("advMode.allPlayers", new Object[0]), this.l / 2 - 150, n4 + n5++ * this.q.a, 0xA0A0A0);
        if (this.g.b().length() > 0) {
            this.b(this.q, bsc.a("advMode.previousOutput", new Object[0]), this.l / 2 - 150, n4 += n5 * this.q.a + 20, 0xA0A0A0);
            this.g.f();
        }
        super.a(n2, n3, f2);
    }
}

