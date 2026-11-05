/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.Project
 */
import java.util.Random;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

public class beg
extends bdn {
    private static final brq C = new brq("textures/gui/container/enchanting_table.png");
    private static final brq D = new brq("textures/entity/enchanting_table_book.png");
    private static final bia E = new bia();
    private Random F = new Random();
    private yx G = (yx)this.h;
    public int u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;
    public float A;
    abu B;
    private String H;

    public beg(xo xo2, afs afs2, int n2, int n3, int n4, String string) {
        super(new yx(xo2, afs2, n2, n3, n4));
        this.H = string;
    }

    @Override
    protected void b(int n2, int n3) {
        this.q.b(this.H == null ? bsc.a("container.enchant", new Object[0]) : this.H, 12, 5, 0x404040);
        this.q.b(bsc.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 0x404040);
    }

    @Override
    public void c() {
        super.c();
        this.g();
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        int n5 = (this.l - this.f) / 2;
        int n6 = (this.m - this.g) / 2;
        for (int i2 = 0; i2 < 3; ++i2) {
            int n7 = n2 - (n5 + 60);
            int n8 = n3 - (n6 + 14 + 19 * i2);
            if (n7 < 0 || n8 < 0 || n7 >= 108 || n8 >= 19 || !this.G.a((xq)this.k.h, i2)) continue;
            this.k.c.a(this.G.d, i2);
        }
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.k.P().a(C);
        int n4 = (this.l - this.f) / 2;
        int n5 = (this.m - this.g) / 2;
        this.b(n4, n5, 0, 0, this.f, this.g);
        GL11.glPushMatrix();
        GL11.glMatrixMode((int)5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        bat bat2 = new bat(this.k, this.k.d, this.k.e);
        GL11.glViewport((int)((bat2.a() - 320) / 2 * bat2.e()), (int)((bat2.b() - 240) / 2 * bat2.e()), (int)(320 * bat2.e()), (int)(240 * bat2.e()));
        GL11.glTranslatef((float)-0.34f, (float)0.23f, (float)0.0f);
        Project.gluPerspective((float)90.0f, (float)1.3333334f, (float)9.0f, (float)80.0f);
        float f3 = 1.0f;
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        azg.b();
        GL11.glTranslatef((float)0.0f, (float)3.3f, (float)-16.0f);
        GL11.glScalef((float)f3, (float)f3, (float)f3);
        float f4 = 5.0f;
        GL11.glScalef((float)f4, (float)f4, (float)f4);
        GL11.glRotatef((float)180.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        this.k.P().a(D);
        GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        float f5 = this.A + (this.z - this.A) * f2;
        GL11.glTranslatef((float)((1.0f - f5) * 0.2f), (float)((1.0f - f5) * 0.1f), (float)((1.0f - f5) * 0.25f));
        GL11.glRotatef((float)(-(1.0f - f5) * 90.0f - 90.0f), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)180.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        float f6 = this.w + (this.v - this.w) * f2 + 0.25f;
        float f7 = this.w + (this.v - this.w) * f2 + 0.75f;
        f6 = (f6 - (float)oy.b((double)f6)) * 1.6f - 0.3f;
        f7 = (f7 - (float)oy.b((double)f7)) * 1.6f - 0.3f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        GL11.glEnable((int)32826);
        E.a(null, 0.0f, f6, f7, f5, 0.0f, 0.0625f);
        GL11.glDisable((int)32826);
        azg.a();
        GL11.glMatrixMode((int)5889);
        GL11.glViewport((int)0, (int)0, (int)this.k.d, (int)this.k.e);
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5888);
        GL11.glPopMatrix();
        azg.a();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bef.a.a(this.G.f);
        for (int i2 = 0; i2 < 3; ++i2) {
            String string = bef.a.a();
            this.e = 0.0f;
            this.k.P().a(C);
            int n6 = this.G.g[i2];
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            if (n6 == 0) {
                this.b(n4 + 60, n5 + 14 + 19 * i2, 0, 185, 108, 19);
                continue;
            }
            String string2 = "" + n6;
            ban ban2 = this.k.m;
            int n7 = 6839882;
            if (this.k.h.bF < n6 && !this.k.h.bE.d) {
                this.b(n4 + 60, n5 + 14 + 19 * i2, 0, 185, 108, 19);
                ban2.a(string, n4 + 62, n5 + 16 + 19 * i2, 104, (n7 & 0xFEFEFE) >> 1);
                ban2 = this.k.l;
                n7 = 4226832;
                ban2.a(string2, n4 + 62 + 104 - ban2.a(string2), n5 + 16 + 19 * i2 + 7, n7);
                continue;
            }
            int n8 = n2 - (n4 + 60);
            int n9 = n3 - (n5 + 14 + 19 * i2);
            if (n8 >= 0 && n9 >= 0 && n8 < 108 && n9 < 19) {
                this.b(n4 + 60, n5 + 14 + 19 * i2, 0, 204, 108, 19);
                n7 = 0xFFFF80;
            } else {
                this.b(n4 + 60, n5 + 14 + 19 * i2, 0, 166, 108, 19);
            }
            ban2.a(string, n4 + 62, n5 + 16 + 19 * i2, 104, n7);
            ban2 = this.k.l;
            n7 = 8453920;
            ban2.a(string2, n4 + 62 + 104 - ban2.a(string2), n5 + 16 + 19 * i2 + 7, n7);
        }
    }

    public void g() {
        float f2;
        float f3;
        abu abu2 = this.h.a(0).d();
        if (!abu.b(abu2, this.B)) {
            this.B = abu2;
            do {
                this.x += (float)(this.F.nextInt(4) - this.F.nextInt(4));
            } while (this.v <= this.x + 1.0f && this.v >= this.x - 1.0f);
        }
        ++this.u;
        this.w = this.v;
        this.A = this.z;
        boolean bl2 = false;
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.G.g[i2] == 0) continue;
            bl2 = true;
        }
        this.z = bl2 ? (this.z += 0.2f) : (this.z -= 0.2f);
        if (this.z < 0.0f) {
            this.z = 0.0f;
        }
        if (this.z > 1.0f) {
            this.z = 1.0f;
        }
        if ((f3 = (this.x - this.v) * 0.4f) < -(f2 = 0.2f)) {
            f3 = -f2;
        }
        if (f3 > f2) {
            f3 = f2;
        }
        this.y += (f3 - this.y) * 0.9f;
        this.v += this.y;
    }
}

