/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.Charsets
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import java.util.List;
import org.apache.commons.io.Charsets;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class bdo
extends bdn
implements yt {
    private static final brq u = new brq("textures/gui/container/anvil.png");
    private yl v;
    private baw w;
    private xo x;

    public bdo(xo xo2, afs afs2, int n2, int n3, int n4) {
        super(new yl(xo2, afs2, n2, n3, n4, azi.B().h));
        this.x = xo2;
        this.v = (yl)this.h;
    }

    @Override
    public void r_() {
        super.r_();
        Keyboard.enableRepeatEvents((boolean)true);
        int n2 = (this.l - this.f) / 2;
        int n3 = (this.m - this.g) / 2;
        this.w = new baw(this.q, n2 + 62, n3 + 24, 103, 12);
        this.w.g(-1);
        this.w.h(-1);
        this.w.a(false);
        this.w.f(40);
        this.h.b(this);
        this.h.a(this);
    }

    @Override
    public void b() {
        super.b();
        Keyboard.enableRepeatEvents((boolean)false);
        this.h.b(this);
    }

    @Override
    protected void b(int n2, int n3) {
        GL11.glDisable((int)2896);
        GL11.glDisable((int)3042);
        this.q.b(bsc.a("container.repair", new Object[0]), 60, 6, 0x404040);
        if (this.v.a > 0) {
            int n4 = 8453920;
            boolean bl2 = true;
            String string = bsc.a("container.repair.cost", this.v.a);
            if (this.v.a >= 40 && !this.k.h.bE.d) {
                string = bsc.a("container.repair.expensive", new Object[0]);
                n4 = 0xFF6060;
            } else if (!this.v.a(2).e()) {
                bl2 = false;
            } else if (!this.v.a(2).a(this.x.d)) {
                n4 = 0xFF6060;
            }
            if (bl2) {
                int n5 = 0xFF000000 | (n4 & 0xFCFCFC) >> 2 | n4 & 0xFF000000;
                int n6 = this.f - 8 - this.q.a(string);
                int n7 = 67;
                if (this.q.a()) {
                    bdo.a(n6 - 3, n7 - 2, this.f - 7, n7 + 10, -16777216);
                    bdo.a(n6 - 2, n7 - 1, this.f - 8, n7 + 9, -12895429);
                } else {
                    this.q.b(string, n6, n7 + 1, n5);
                    this.q.b(string, n6 + 1, n7, n5);
                    this.q.b(string, n6 + 1, n7 + 1, n5);
                }
                this.q.b(string, n6, n7, n4);
            }
        }
        GL11.glEnable((int)2896);
    }

    @Override
    protected void a(char c2, int n2) {
        if (this.w.a(c2, n2)) {
            this.g();
        } else {
            super.a(c2, n2);
        }
    }

    private void g() {
        String string = this.w.b();
        zp zp2 = this.v.a(0);
        if (zp2 != null && zp2.e() && !zp2.d().u() && string.equals(zp2.d().s())) {
            string = "";
        }
        this.v.a(string);
        this.k.h.a.a(new iq("MC|ItemName", string.getBytes(Charsets.UTF_8)));
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.w.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        super.a(n2, n3, f2);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)3042);
        this.w.f();
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.k.P().a(u);
        int n4 = (this.l - this.f) / 2;
        int n5 = (this.m - this.g) / 2;
        this.b(n4, n5, 0, 0, this.f, this.g);
        this.b(n4 + 59, n5 + 20, 0, this.g + (this.v.a(0).e() ? 0 : 16), 110, 16);
        if ((this.v.a(0).e() || this.v.a(1).e()) && !this.v.a(2).e()) {
            this.b(n4 + 99, n5 + 45, this.f, 0, 28, 21);
        }
    }

    @Override
    public void a(yj yj2, List list) {
        this.a(yj2, 0, yj2.a(0).d());
    }

    @Override
    public void a(yj yj2, int n2, abu abu2) {
        if (n2 == 0) {
            this.w.a(abu2 == null ? "" : abu2.s());
            this.w.c(abu2 != null);
            if (abu2 != null) {
                this.g();
            }
        }
    }

    @Override
    public void a(yj yj2, int n2, int n3) {
    }
}

