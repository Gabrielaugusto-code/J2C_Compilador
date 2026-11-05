/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpo
extends bpd {
    private static final brq a = new brq("textures/entity/spider_eyes.png");
    private static final brq f = new brq("textures/entity/spider/spider.png");

    public bpo() {
        super(new bjb(), 1.0f);
        this.a(new bjb());
    }

    protected float b(xe xe2) {
        return 180.0f;
    }

    protected int a(xe xe2, int n2, float f2) {
        if (n2 != 0) {
            return -1;
        }
        this.a(a);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        GL11.glBlendFunc((int)1, (int)1);
        if (xe2.ao()) {
            GL11.glDepthMask((boolean)false);
        } else {
            GL11.glDepthMask((boolean)true);
        }
        int n3 = 61680;
        int n4 = n3 % 65536;
        int n5 = n3 / 65536;
        bwg.a(bwg.c, (float)n4 / 1.0f, (float)n5 / 1.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        return 1;
    }

    protected brq a(xe xe2) {
        return f;
    }

    @Override
    protected /* synthetic */ float a(rm rm2) {
        return this.b((xe)rm2);
    }
}

