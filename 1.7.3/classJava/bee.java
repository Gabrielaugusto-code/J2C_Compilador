/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Collection;
import org.lwjgl.opengl.GL11;

public abstract class bee
extends bdn {
    private boolean u;

    public bee(yj yj2) {
        super(yj2);
    }

    @Override
    public void r_() {
        super.r_();
        if (!this.k.h.aP().isEmpty()) {
            this.i = 160 + (this.l - this.f - 200) / 2;
            this.u = true;
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        super.a(n2, n3, f2);
        if (this.u) {
            this.g();
        }
    }

    private void g() {
        int n2 = this.i - 124;
        int n3 = this.r;
        int n4 = 166;
        Collection collection = this.k.h.aP();
        if (collection.isEmpty()) {
            return;
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)2896);
        int n5 = 33;
        if (collection.size() > 5) {
            n5 = 132 / (collection.size() - 1);
        }
        for (qn qn2 : this.k.h.aP()) {
            qm qm2 = qm.a[qn2.a()];
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.k.P().a(a);
            this.b(n2, n3, 0, 166, 140, 32);
            if (qm2.d()) {
                int n6 = qm2.e();
                this.b(n2 + 6, n3 + 7, 0 + n6 % 8 * 18, 198 + n6 / 8 * 18, 18, 18);
            }
            String string = bsc.a(qm2.a(), new Object[0]);
            if (qn2.c() == 1) {
                string = string + " " + bsc.a("enchantment.level.2", new Object[0]);
            } else if (qn2.c() == 2) {
                string = string + " " + bsc.a("enchantment.level.3", new Object[0]);
            } else if (qn2.c() == 3) {
                string = string + " " + bsc.a("enchantment.level.4", new Object[0]);
            }
            this.q.a(string, n2 + 10 + 18, n3 + 6, 0xFFFFFF);
            String string2 = qm.a(qn2);
            this.q.a(string2, n2 + 10 + 18, n3 + 6 + 10, 0x7F7F7F);
            n3 += n5;
        }
    }
}

