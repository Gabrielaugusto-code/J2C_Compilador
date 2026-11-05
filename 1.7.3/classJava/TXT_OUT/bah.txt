/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bah
implements pb {
    private String a = "";
    private azi b;
    private String c = "";
    private long d = azi.K();
    private boolean e;
    private bat f;
    private bmz g;

    public bah(azi azi2) {
        this.b = azi2;
        this.f = new bat(azi2, azi2.d, azi2.e);
        this.g = new bmz(azi2.d, azi2.e, false);
        this.g.a(9728);
    }

    @Override
    public void b(String string) {
        this.e = false;
        this.d(string);
    }

    @Override
    public void a(String string) {
        this.e = true;
        this.d(string);
    }

    public void d(String string) {
        this.c = string;
        if (!this.b.A) {
            if (this.e) {
                return;
            }
            throw new baj();
        }
        GL11.glClear((int)256);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        if (bwg.g()) {
            int n2 = this.f.e();
            GL11.glOrtho((double)0.0, (double)(this.f.a() * n2), (double)(this.f.b() * n2), (double)0.0, (double)100.0, (double)300.0);
        } else {
            bat bat2 = new bat(this.b, this.b.d, this.b.e);
            GL11.glOrtho((double)0.0, (double)bat2.c(), (double)bat2.d(), (double)0.0, (double)100.0, (double)300.0);
        }
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-200.0f);
    }

    @Override
    public void c(String string) {
        if (!this.b.A) {
            if (this.e) {
                return;
            }
            throw new baj();
        }
        this.d = 0L;
        this.a = string;
        this.a(-1);
        this.d = 0L;
    }

    @Override
    public void a(int n2) {
        if (!this.b.A) {
            if (this.e) {
                return;
            }
            throw new baj();
        }
        long l2 = azi.K();
        if (l2 - this.d < 100L) {
            return;
        }
        this.d = l2;
        bat bat2 = new bat(this.b, this.b.d, this.b.e);
        int n3 = bat2.e();
        int n4 = bat2.a();
        int n5 = bat2.b();
        if (bwg.g()) {
            this.g.f();
        } else {
            GL11.glClear((int)256);
        }
        this.g.a(false);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)bat2.c(), (double)bat2.d(), (double)0.0, (double)100.0, (double)300.0);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-200.0f);
        if (!bwg.g()) {
            GL11.glClear((int)16640);
        }
        bna bna2 = bna.a;
        this.b.P().a(bap.b);
        float f2 = 32.0f;
        bna2.b();
        bna2.c(0x404040);
        bna2.a(0.0, n5, 0.0, 0.0, (float)n5 / f2);
        bna2.a(n4, n5, 0.0, (float)n4 / f2, (float)n5 / f2);
        bna2.a(n4, 0.0, 0.0, (float)n4 / f2, 0.0);
        bna2.a(0.0, 0.0, 0.0, 0.0, 0.0);
        bna2.a();
        if (n2 >= 0) {
            int n6 = 100;
            int n7 = 2;
            int n8 = n4 / 2 - n6 / 2;
            int n9 = n5 / 2 + 16;
            GL11.glDisable((int)3553);
            bna2.b();
            bna2.c(0x808080);
            bna2.a((double)n8, (double)n9, 0.0);
            bna2.a((double)n8, (double)(n9 + n7), 0.0);
            bna2.a((double)(n8 + n6), (double)(n9 + n7), 0.0);
            bna2.a((double)(n8 + n6), (double)n9, 0.0);
            bna2.c(0x80FF80);
            bna2.a((double)n8, (double)n9, 0.0);
            bna2.a((double)n8, (double)(n9 + n7), 0.0);
            bna2.a((double)(n8 + n2), (double)(n9 + n7), 0.0);
            bna2.a((double)(n8 + n2), (double)n9, 0.0);
            bna2.a();
            GL11.glEnable((int)3553);
        }
        GL11.glEnable((int)3042);
        bwg.c(770, 771, 1, 0);
        this.b.l.a(this.c, (n4 - this.b.l.a(this.c)) / 2, n5 / 2 - 4 - 16, 0xFFFFFF);
        this.b.l.a(this.a, (n4 - this.b.l.a(this.a)) / 2, n5 / 2 - 4 + 8, 0xFFFFFF);
        this.g.e();
        if (bwg.g()) {
            this.g.c(n4 * n3, n5 * n3);
        }
        this.b.g();
        try {
            Thread.yield();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public void a() {
    }
}

