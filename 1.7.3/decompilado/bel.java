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

public class bel
extends bdn {
    private static final Logger u = LogManager.getLogger();
    private static final brq v = new brq("textures/gui/container/villager.png");
    private afd w;
    private bem x;
    private bem y;
    private int z;
    private String A;

    public bel(xo xo2, afd afd2, afs afs2, String string) {
        super(new zk(xo2, afd2, afs2));
        this.w = afd2;
        this.A = string == null || string.length() < 1 ? bsc.a("entity.Villager.name", new Object[0]) : string;
    }

    @Override
    public void r_() {
        super.r_();
        int n2 = (this.l - this.f) / 2;
        int n3 = (this.m - this.g) / 2;
        this.x = new bem(1, n2 + 120 + 27, n3 + 24 - 1, true);
        this.n.add(this.x);
        this.y = new bem(2, n2 + 36 - 19, n3 + 24 - 1, false);
        this.n.add(this.y);
        this.x.l = false;
        this.y.l = false;
    }

    @Override
    protected void b(int n2, int n3) {
        this.q.b(this.A, this.f / 2 - this.q.a(this.A) / 2, 6, 0x404040);
        this.q.b(bsc.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 0x404040);
    }

    @Override
    public void c() {
        super.c();
        aff aff2 = this.w.b(this.k.h);
        if (aff2 != null) {
            this.x.l = this.z < aff2.size() - 1;
            this.y.l = this.z > 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void a(bau bau2) {
        boolean bl2 = false;
        if (bau2 == this.x) {
            ++this.z;
            bl2 = true;
        } else if (bau2 == this.y) {
            --this.z;
            bl2 = true;
        }
        if (bl2) {
            ((zk)this.h).e(this.z);
            ByteBuf byteBuf = Unpooled.buffer();
            try {
                byteBuf.writeInt(this.z);
                this.k.v().a(new iq("MC|TrSel", byteBuf));
            }
            catch (Exception exception) {
                u.error("Couldn't send trade info", (Throwable)exception);
            }
            finally {
                byteBuf.release();
            }
        }
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        int n4;
        afe afe2;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.k.P().a(v);
        int n5 = (this.l - this.f) / 2;
        int n6 = (this.m - this.g) / 2;
        this.b(n5, n6, 0, 0, this.f, this.g);
        aff aff2 = this.w.b(this.k.h);
        if (aff2 != null && !aff2.isEmpty() && (afe2 = (afe)aff2.get(n4 = this.z)).g()) {
            this.k.P().a(v);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glDisable((int)2896);
            this.b(this.i + 83, this.r + 21, 212, 0, 28, 21);
            this.b(this.i + 83, this.r + 51, 212, 0, 28, 21);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        super.a(n2, n3, f2);
        aff aff2 = this.w.b(this.k.h);
        if (aff2 != null && !aff2.isEmpty()) {
            int n4 = (this.l - this.f) / 2;
            int n5 = (this.m - this.g) / 2;
            int n6 = this.z;
            afe afe2 = (afe)aff2.get(n6);
            GL11.glPushMatrix();
            abu abu2 = afe2.a();
            abu abu3 = afe2.b();
            abu abu4 = afe2.d();
            azg.c();
            GL11.glDisable((int)2896);
            GL11.glEnable((int)32826);
            GL11.glEnable((int)2903);
            GL11.glEnable((int)2896);
            bel.j.f = 100.0f;
            j.b(this.q, this.k.P(), abu2, n4 + 36, n5 + 24);
            j.c(this.q, this.k.P(), abu2, n4 + 36, n5 + 24);
            if (abu3 != null) {
                j.b(this.q, this.k.P(), abu3, n4 + 62, n5 + 24);
                j.c(this.q, this.k.P(), abu3, n4 + 62, n5 + 24);
            }
            j.b(this.q, this.k.P(), abu4, n4 + 120, n5 + 24);
            j.c(this.q, this.k.P(), abu4, n4 + 120, n5 + 24);
            bel.j.f = 0.0f;
            GL11.glDisable((int)2896);
            if (this.c(36, 24, 16, 16, n2, n3)) {
                this.a(abu2, n2, n3);
            } else if (abu3 != null && this.c(62, 24, 16, 16, n2, n3)) {
                this.a(abu3, n2, n3);
            } else if (this.c(120, 24, 16, 16, n2, n3)) {
                this.a(abu4, n2, n3);
            }
            GL11.glPopMatrix();
            GL11.glEnable((int)2896);
            GL11.glEnable((int)2929);
            azg.b();
        }
    }

    public afd g() {
        return this.w;
    }

    static /* synthetic */ brq h() {
        return v;
    }
}

