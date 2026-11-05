/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class bnd {
    private Map m = new HashMap();
    public static bnd a = new bnd();
    private ban n;
    public static double b;
    public static double c;
    public static double d;
    public bqy e;
    public afs f;
    public rm g;
    public float h;
    public float i;
    public double j;
    public double k;
    public double l;

    private bnd() {
        this.m.put(aod.class, new bnk());
        this.m.put(aoa.class, new bni());
        this.m.put(aoj.class, new bnj());
        this.m.put(ann.class, new bnf());
        this.m.put(anv.class, new bnh());
        this.m.put(anu.class, new bng());
        this.m.put(aof.class, new bnm());
        this.m.put(anh.class, new bnc());
        this.m.put(aoe.class, new bnl());
        for (bne bne2 : this.m.values()) {
            bne2.a(this);
        }
    }

    public bne a(Class clazz) {
        bne bne2 = (bne)this.m.get(clazz);
        if (bne2 == null && clazz != ani.class) {
            bne2 = this.a(clazz.getSuperclass());
            this.m.put(clazz, bne2);
        }
        return bne2;
    }

    public boolean a(ani ani2) {
        return this.b(ani2) != null;
    }

    public bne b(ani ani2) {
        if (ani2 == null) {
            return null;
        }
        return this.a(ani2.getClass());
    }

    public void a(afs afs2, bqy bqy2, ban ban2, rm rm2, float f2) {
        if (this.f != afs2) {
            this.a(afs2);
        }
        this.e = bqy2;
        this.g = rm2;
        this.n = ban2;
        this.h = rm2.A + (rm2.y - rm2.A) * f2;
        this.i = rm2.B + (rm2.z - rm2.B) * f2;
        this.j = rm2.S + (rm2.s - rm2.S) * (double)f2;
        this.k = rm2.T + (rm2.t - rm2.T) * (double)f2;
        this.l = rm2.U + (rm2.u - rm2.U) * (double)f2;
    }

    public void a(ani ani2, float f2) {
        if (ani2.a(this.j, this.k, this.l) < ani2.n()) {
            int n2 = this.f.c(ani2.c, ani2.d, ani2.e, 0);
            int n3 = n2 % 65536;
            int n4 = n2 / 65536;
            bwg.a(bwg.c, (float)n3 / 1.0f, (float)n4 / 1.0f);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.a(ani2, (double)ani2.c - b, (double)ani2.d - c, (double)ani2.e - d, f2);
        }
    }

    public void a(ani ani2, double d2, double d3, double d4, float f2) {
        bne bne2 = this.b(ani2);
        if (bne2 != null) {
            try {
                bne2.a(ani2, d2, d3, d4, f2);
            }
            catch (Throwable throwable) {
                b b2 = b.a(throwable, "Rendering Block Entity");
                k k2 = b2.a("Block Entity Details");
                ani2.a(k2);
                throw new s(b2);
            }
        }
    }

    public void a(afs afs2) {
        this.f = afs2;
        for (bne bne2 : this.m.values()) {
            if (bne2 == null) continue;
            bne2.a(afs2);
        }
    }

    public ban a() {
        return this.n;
    }
}

