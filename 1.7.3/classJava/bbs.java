/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
import java.net.URI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class bbs
extends bcl {
    private static final Logger a = LogManager.getLogger();
    private static final brq f = new brq("textures/gui/demo_background.png");

    @Override
    public void r_() {
        this.n.clear();
        int n2 = -16;
        this.n.add(new bau(1, this.l / 2 - 116, this.m / 2 + 62 + n2, 114, 20, bsc.a("demo.help.buy", new Object[0])));
        this.n.add(new bau(2, this.l / 2 + 2, this.m / 2 + 62 + n2, 114, 20, bsc.a("demo.help.later", new Object[0])));
    }

    @Override
    protected void a(bau bau2) {
        switch (bau2.k) {
            case 2: {
                this.k.a((bcl)null);
                this.k.l();
                break;
            }
            case 1: {
                bau2.l = false;
                try {
                    Class<?> clazz = Class.forName("java.awt.Desktop");
                    Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    clazz.getMethod("browse", URI.class).invoke(object, new URI("http://www.minecraft.net/store?source=demo"));
                    break;
                }
                catch (Throwable throwable) {
                    a.error("Couldn't open link", throwable);
                }
            }
        }
    }

    @Override
    public void c() {
        super.c();
    }

    @Override
    public void q_() {
        super.q_();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.k.P().a(f);
        int n2 = (this.l - 248) / 2;
        int n3 = (this.m - 166) / 2;
        this.b(n2, n3, 0, 0, 248, 166);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        int n4 = (this.l - 248) / 2 + 10;
        int n5 = (this.m - 166) / 2 + 8;
        this.q.b(bsc.a("demo.help.title", new Object[0]), n4, n5, 0x1F1F1F);
        bac bac2 = this.k.u;
        this.q.b(bsc.a("demo.help.movementShort", bac.c(bac2.V.i()), bac.c(bac2.W.i()), bac.c(bac2.X.i()), bac.c(bac2.Y.i())), n4, n5 += 12, 0x4F4F4F);
        this.q.b(bsc.a("demo.help.movementMouse", new Object[0]), n4, n5 + 12, 0x4F4F4F);
        this.q.b(bsc.a("demo.help.jump", bac.c(bac2.Z.i())), n4, n5 + 24, 0x4F4F4F);
        this.q.b(bsc.a("demo.help.inventory", bac.c(bac2.ab.i())), n4, n5 + 36, 0x4F4F4F);
        this.q.a(bsc.a("demo.help.fullWrapped", new Object[0]), n4, n5 + 68, 218, 0x1F1F1F);
        super.a(n2, n3, f2);
    }
}

