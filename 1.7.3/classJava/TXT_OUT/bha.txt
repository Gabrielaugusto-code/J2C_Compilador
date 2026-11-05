/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.List;
import org.lwjgl.opengl.GL11;

public abstract class bha
implements bbb {
    private static final brq c = new brq("textures/gui/resource_packs.png");
    protected final azi a;
    protected final bgz b;

    public bha(bgz bgz2) {
        this.b = bgz2;
        this.a = azi.B();
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, bna bna2, int n7, int n8, boolean bl2) {
        String string;
        int n9;
        this.c();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        bap.a(n3, n4, 0.0f, 0.0f, 32, 32, 32.0f, 32.0f);
        if ((this.a.u.z || bl2) && this.d()) {
            this.a.P().a(c);
            bap.a(n3, n4, n3 + 32, n4 + 32, -1601138544);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            int n10 = n7 - n3;
            n9 = n8 - n4;
            if (this.e()) {
                if (n10 < 32) {
                    bap.a(n3, n4, 0.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                } else {
                    bap.a(n3, n4, 0.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                }
            } else {
                if (this.f()) {
                    if (n10 < 16) {
                        bap.a(n3, n4, 32.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    } else {
                        bap.a(n3, n4, 32.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
                if (this.g()) {
                    if (n10 < 32 && n10 > 16 && n9 < 16) {
                        bap.a(n3, n4, 96.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    } else {
                        bap.a(n3, n4, 96.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
                if (this.h()) {
                    if (n10 < 32 && n10 > 16 && n9 > 16) {
                        bap.a(n3, n4, 64.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    } else {
                        bap.a(n3, n4, 64.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
            }
        }
        if ((n9 = this.a.l.a(string = this.b())) > 157) {
            string = this.a.l.a(string, 157 - this.a.l.a("...")) + "...";
        }
        this.a.l.a(string, n3 + 32 + 2, n4 + 1, 0xFFFFFF);
        List list = this.a.l.c(this.a(), 157);
        for (int i2 = 0; i2 < 2 && i2 < list.size(); ++i2) {
            this.a.l.a((String)list.get(i2), n3 + 32 + 2, n4 + 12 + 10 * i2, 0x808080);
        }
    }

    protected abstract String a();

    protected abstract String b();

    protected abstract void c();

    protected boolean d() {
        return true;
    }

    protected boolean e() {
        return !this.b.a(this);
    }

    protected boolean f() {
        return this.b.a(this);
    }

    protected boolean g() {
        List list = this.b.b(this);
        int n2 = list.indexOf(this);
        return n2 > 0 && ((bha)list.get(n2 - 1)).d();
    }

    protected boolean h() {
        List list = this.b.b(this);
        int n2 = list.indexOf(this);
        return n2 >= 0 && n2 < list.size() - 1 && ((bha)list.get(n2 + 1)).d();
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.d() && n6 <= 32) {
            if (this.e()) {
                this.b.b(this).remove(this);
                this.b.h().add(0, this);
                return true;
            }
            if (n6 < 16 && this.f()) {
                this.b.b(this).remove(this);
                this.b.g().add(0, this);
                return true;
            }
            if (n6 > 16 && n7 < 16 && this.g()) {
                List list = this.b.b(this);
                int n8 = list.indexOf(this);
                list.remove(this);
                list.add(n8 - 1, this);
                return true;
            }
            if (n6 > 16 && n7 > 16 && this.h()) {
                List list = this.b.b(this);
                int n9 = list.indexOf(this);
                list.remove(this);
                list.add(n9 + 1, this);
                return true;
            }
        }
        return false;
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }
}

