/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 */
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class bfe
extends bcl {
    private static final Logger a = LogManager.getLogger();
    private baw f;
    private bvo g;
    private final bcl h;
    private final bew i;
    private final int r = 0;
    private final int s = 1;
    private String t = "Could not invite the provided name";
    private String u;
    private boolean v;

    public bfe(bcl bcl2, bew bew2, bvo bvo2) {
        this.h = bcl2;
        this.i = bew2;
        this.g = bvo2;
    }

    @Override
    public void c() {
        this.f.a();
    }

    @Override
    public void r_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        this.n.add(new bau(0, this.l / 2 - 100, this.m / 4 + 96 + 12, bsc.a("mco.configure.world.buttons.invite", new Object[0])));
        this.n.add(new bau(1, this.l / 2 - 100, this.m / 4 + 120 + 12, bsc.a("gui.cancel", new Object[0])));
        this.f = new baw(this.q, this.l / 2 - 100, 66, 200, 20);
        this.f.b(true);
    }

    @Override
    public void b() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 1) {
            this.k.a(this.i);
        } else if (bau2.k == 0) {
            bal bal2 = this.k.M();
            bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
            if (this.f.b() == null || this.f.b().isEmpty()) {
                return;
            }
            try {
                bvo bvo2 = bvf2.b(this.g.a, this.f.b());
                if (bvo2 != null) {
                    this.g.f = bvo2.f;
                    this.k.a(new bew(this.h, this.g));
                } else {
                    this.a(this.t);
                }
            }
            catch (bwa bwa2) {
                a.error("Couldn't invite user");
                this.a(bwa2.b);
            }
            catch (IOException iOException) {
                a.error("Couldn't parse response inviting user", (Throwable)iOException);
                this.a(this.t);
            }
        }
    }

    private void a(String string) {
        this.v = true;
        this.u = string;
    }

    @Override
    protected void a(char c2, int n2) {
        this.f.a(c2, n2);
        if (n2 == 15) {
            if (this.f.l()) {
                this.f.b(false);
            } else {
                this.f.b(true);
            }
        }
        if (n2 == 28 || n2 == 156) {
            this.a((bau)this.n.get(0));
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.f.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.b(this.q, bsc.a("mco.configure.world.invite.profile.name", new Object[0]), this.l / 2 - 100, 53, 0xA0A0A0);
        if (this.v) {
            this.a(this.q, this.u, this.l / 2, 100, 0xFF0000);
        }
        this.f.f();
        super.a(n2, n3, f2);
    }
}

