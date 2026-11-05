/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class bdu
extends bcl {
    private static final Logger a = LogManager.getLogger();
    private static final brq f = new brq("textures/gui/book.png");
    private final xq g;
    private final abu h;
    private final boolean i;
    private boolean r;
    private boolean s;
    private int t;
    private int u = 192;
    private int v = 192;
    private int w = 1;
    private int x;
    private dp y;
    private String z = "";
    private bdv A;
    private bdv B;
    private bau C;
    private bau D;
    private bau E;
    private bau F;

    public bdu(xq xq2, abu abu2, boolean bl2) {
        this.g = xq2;
        this.h = abu2;
        this.i = bl2;
        if (abu2.p()) {
            dg dg2 = abu2.q();
            this.y = dg2.c("pages", 8);
            if (this.y != null) {
                this.y = (dp)this.y.b();
                this.w = this.y.c();
                if (this.w < 1) {
                    this.w = 1;
                }
            }
        }
        if (this.y == null && bl2) {
            this.y = new dp();
            this.y.a(new dt(""));
            this.w = 1;
        }
    }

    @Override
    public void c() {
        super.c();
        ++this.t;
    }

    @Override
    public void r_() {
        this.n.clear();
        Keyboard.enableRepeatEvents((boolean)true);
        if (this.i) {
            this.D = new bau(3, this.l / 2 - 100, 4 + this.v, 98, 20, bsc.a("book.signButton", new Object[0]));
            this.n.add(this.D);
            this.C = new bau(0, this.l / 2 + 2, 4 + this.v, 98, 20, bsc.a("gui.done", new Object[0]));
            this.n.add(this.C);
            this.E = new bau(5, this.l / 2 - 100, 4 + this.v, 98, 20, bsc.a("book.finalizeButton", new Object[0]));
            this.n.add(this.E);
            this.F = new bau(4, this.l / 2 + 2, 4 + this.v, 98, 20, bsc.a("gui.cancel", new Object[0]));
            this.n.add(this.F);
        } else {
            this.C = new bau(0, this.l / 2 - 100, 4 + this.v, 200, 20, bsc.a("gui.done", new Object[0]));
            this.n.add(this.C);
        }
        int n2 = (this.l - this.u) / 2;
        int n3 = 2;
        this.A = new bdv(1, n2 + 120, n3 + 154, true);
        this.n.add(this.A);
        this.B = new bdv(2, n2 + 38, n3 + 154, false);
        this.n.add(this.B);
        this.h();
    }

    @Override
    public void b() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    private void h() {
        this.A.m = !this.s && (this.x < this.w - 1 || this.i);
        this.B.m = !this.s && this.x > 0;
        boolean bl2 = this.C.m = !this.i || !this.s;
        if (this.i) {
            this.D.m = !this.s;
            this.F.m = this.s;
            this.E.m = this.s;
            this.E.l = this.z.trim().length() > 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(boolean bl2) {
        if (!this.i || !this.r) {
            return;
        }
        if (this.y != null) {
            Object object;
            while (this.y.c() > 1 && ((String)(object = this.y.f(this.y.c() - 1))).length() == 0) {
                this.y.a(this.y.c() - 1);
            }
            if (this.h.p()) {
                object = this.h.q();
                ((dg)object).a("pages", this.y);
            } else {
                this.h.a("pages", this.y);
            }
            object = "MC|BEdit";
            if (bl2) {
                object = "MC|BSign";
                this.h.a("author", new dt(this.g.b_()));
                this.h.a("title", new dt(this.z.trim()));
                this.h.a(abv.bB);
            }
            ByteBuf byteBuf = Unpooled.buffer();
            try {
                new ep(byteBuf).a(this.h);
                this.k.v().a(new iq((String)object, byteBuf));
            }
            catch (Exception exception) {
                a.error("Couldn't send book info", (Throwable)exception);
            }
            finally {
                byteBuf.release();
            }
        }
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 0) {
            this.k.a((bcl)null);
            this.a(false);
        } else if (bau2.k == 3 && this.i) {
            this.s = true;
        } else if (bau2.k == 1) {
            if (this.x < this.w - 1) {
                ++this.x;
            } else if (this.i) {
                this.i();
                if (this.x < this.w - 1) {
                    ++this.x;
                }
            }
        } else if (bau2.k == 2) {
            if (this.x > 0) {
                --this.x;
            }
        } else if (bau2.k == 5 && this.s) {
            this.a(true);
            this.k.a((bcl)null);
        } else if (bau2.k == 4 && this.s) {
            this.s = false;
        }
        this.h();
    }

    private void i() {
        if (this.y == null || this.y.c() >= 50) {
            return;
        }
        this.y.a(new dt(""));
        ++this.w;
        this.r = true;
    }

    @Override
    protected void a(char c2, int n2) {
        super.a(c2, n2);
        if (!this.i) {
            return;
        }
        if (this.s) {
            this.c(c2, n2);
        } else {
            this.b(c2, n2);
        }
    }

    private void b(char c2, int n2) {
        switch (c2) {
            case '\u0016': {
                this.b(bcl.j());
                return;
            }
        }
        switch (n2) {
            case 14: {
                String string = this.p();
                if (string.length() > 0) {
                    this.a(string.substring(0, string.length() - 1));
                }
                return;
            }
            case 28: 
            case 156: {
                this.b("\n");
                return;
            }
        }
        if (t.a(c2)) {
            this.b(Character.toString(c2));
            return;
        }
    }

    private void c(char c2, int n2) {
        switch (n2) {
            case 14: {
                if (!this.z.isEmpty()) {
                    this.z = this.z.substring(0, this.z.length() - 1);
                    this.h();
                }
                return;
            }
            case 28: 
            case 156: {
                if (!this.z.isEmpty()) {
                    this.a(true);
                    this.k.a((bcl)null);
                }
                return;
            }
        }
        if (this.z.length() < 16 && t.a(c2)) {
            this.z = this.z + Character.toString(c2);
            this.h();
            this.r = true;
        }
    }

    private String p() {
        if (this.y != null && this.x >= 0 && this.x < this.y.c()) {
            return this.y.f(this.x);
        }
        return "";
    }

    private void a(String string) {
        if (this.y != null && this.x >= 0 && this.x < this.y.c()) {
            this.y.a(this.x, new dt(string));
            this.r = true;
        }
    }

    private void b(String string) {
        String string2 = this.p();
        String string3 = string2 + string;
        int n2 = this.q.b(string3 + "" + (Object)((Object)a.a) + "_", 118);
        if (n2 <= 118 && string3.length() < 256) {
            this.a(string3);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.k.P().a(f);
        int n4 = (this.l - this.u) / 2;
        int n5 = 2;
        this.b(n4, n5, 0, 0, this.u, this.v);
        if (this.s) {
            String string = this.z;
            if (this.i) {
                string = this.t / 6 % 2 == 0 ? string + "" + (Object)((Object)a.a) + "_" : string + "" + (Object)((Object)a.h) + "_";
            }
            String string2 = bsc.a("book.editTitle", new Object[0]);
            int n6 = this.q.a(string2);
            this.q.b(string2, n4 + 36 + (116 - n6) / 2, n5 + 16 + 16, 0);
            int n7 = this.q.a(string);
            this.q.b(string, n4 + 36 + (116 - n7) / 2, n5 + 48, 0);
            String string3 = bsc.a("book.byAuthor", this.g.b_());
            int n8 = this.q.a(string3);
            this.q.b((Object)((Object)a.i) + string3, n4 + 36 + (116 - n8) / 2, n5 + 48 + 10, 0);
            String string4 = bsc.a("book.finalizeWarning", new Object[0]);
            this.q.a(string4, n4 + 36, n5 + 80, 116, 0);
        } else {
            String string = bsc.a("book.pageIndicator", this.x + 1, this.w);
            String string5 = "";
            if (this.y != null && this.x >= 0 && this.x < this.y.c()) {
                string5 = this.y.f(this.x);
            }
            if (this.i) {
                string5 = this.q.b() ? string5 + "_" : (this.t / 6 % 2 == 0 ? string5 + "" + (Object)((Object)a.a) + "_" : string5 + "" + (Object)((Object)a.h) + "_");
            }
            int n9 = this.q.a(string);
            this.q.b(string, n4 - n9 + this.u - 44, n5 + 16, 0);
            this.q.a(string5, n4 + 36, n5 + 16 + 16, 116, 0);
        }
        super.a(n2, n3, f2);
    }

    static /* synthetic */ brq g() {
        return f;
    }
}

