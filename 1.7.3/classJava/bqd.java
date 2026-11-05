/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.vecmath.Matrix4f
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Lists;
import java.util.List;
import javax.vecmath.Matrix4f;
import org.lwjgl.opengl.GL11;

public class bqd {
    private final bqb c;
    public final bmz a;
    public final bmz b;
    private final List d = Lists.newArrayList();
    private final List e = Lists.newArrayList();
    private final List f = Lists.newArrayList();
    private final List g = Lists.newArrayList();
    private Matrix4f h;

    public bqd(brr brr2, String string, bmz bmz2, bmz bmz3) {
        this.c = new bqb(brr2, string);
        this.a = bmz2;
        this.b = bmz3;
    }

    public void b() {
        this.c.a();
    }

    public void a(String string, Object object, int n2, int n3) {
        this.e.add(this.e.size(), string);
        this.d.add(this.d.size(), object);
        this.f.add(this.f.size(), n2);
        this.g.add(this.g.size(), n3);
    }

    private void d() {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2929);
        GL11.glDisable((int)3008);
        GL11.glDisable((int)2912);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2903);
        GL11.glEnable((int)3553);
        GL11.glBindTexture((int)3553, (int)0);
    }

    public void a(Matrix4f matrix4f) {
        this.h = matrix4f;
    }

    public void a(float f2) {
        this.d();
        this.a.e();
        float f3 = this.b.a;
        float f4 = this.b.b;
        GL11.glViewport((int)0, (int)0, (int)((int)f3), (int)((int)f4));
        this.c.a("DiffuseSampler", this.a);
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            this.c.a((String)this.e.get(i2), this.d.get(i2));
            this.c.b("AuxSize" + i2).a(((Integer)this.f.get(i2)).intValue(), ((Integer)this.g.get(i2)).intValue());
        }
        this.c.b("ProjMat").a(this.h);
        this.c.b("InSize").a(this.a.a, this.a.b);
        this.c.b("OutSize").a(f3, f4);
        this.c.b("Time").a(f2);
        azi azi2 = azi.B();
        this.c.b("ScreenSize").a(azi2.d, azi2.e);
        this.c.c();
        this.b.f();
        this.b.a(false);
        GL11.glDepthMask((boolean)false);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)false);
        bna bna2 = bna.a;
        bna2.b();
        bna2.c(-1);
        bna2.a(0.0, (double)f4, 500.0);
        bna2.a((double)f3, (double)f4, 500.0);
        bna2.a((double)f3, 0.0, 500.0);
        bna2.a(0.0, 0.0, 500.0);
        bna2.a();
        GL11.glDepthMask((boolean)true);
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        this.c.b();
        this.b.e();
        this.a.d();
        for (Object e2 : this.d) {
            if (!(e2 instanceof bmz)) continue;
            ((bmz)e2).d();
        }
    }

    public bqb c() {
        return this.c;
    }
}

