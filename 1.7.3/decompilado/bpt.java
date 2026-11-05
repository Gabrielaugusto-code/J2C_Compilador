/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpt
extends bpd {
    private static final brq f = new brq("textures/entity/villager/villager.png");
    private static final brq g = new brq("textures/entity/villager/farmer.png");
    private static final brq h = new brq("textures/entity/villager/librarian.png");
    private static final brq k = new brq("textures/entity/villager/priest.png");
    private static final brq l = new brq("textures/entity/villager/smith.png");
    private static final brq m = new brq("textures/entity/villager/butcher.png");
    protected bjf a;

    public bpt() {
        super(new bjf(0.0f), 0.5f);
        this.a = (bjf)this.i;
    }

    protected int a(xm xm2, int n2, float f2) {
        return -1;
    }

    public void a(xm xm2, double d2, double d3, double d4, float f2, float f3) {
        super.a(xm2, d2, d3, d4, f2, f3);
    }

    protected brq a(xm xm2) {
        switch (xm2.bZ()) {
            case 0: {
                return g;
            }
            case 1: {
                return h;
            }
            case 2: {
                return k;
            }
            case 3: {
                return l;
            }
            case 4: {
                return m;
            }
        }
        return f;
    }

    protected void a(xm xm2, float f2) {
        super.c(xm2, f2);
    }

    protected void b(xm xm2, float f2) {
        float f3 = 0.9375f;
        if (xm2.d() < 0) {
            f3 = (float)((double)f3 * 0.5);
            this.d = 0.25f;
        } else {
            this.d = 0.5f;
        }
        GL11.glScalef((float)f3, (float)f3, (float)f3);
    }

    @Override
    protected /* synthetic */ void a(rm rm2, float f2) {
        this.b((xm)rm2, f2);
    }

    @Override
    protected /* synthetic */ void c(rm rm2, float f2) {
        this.a((xm)rm2, f2);
    }
}

