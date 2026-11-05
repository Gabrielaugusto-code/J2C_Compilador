/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpx
extends bpd {
    private static final brq a = new brq("textures/entity/wolf/wolf.png");
    private static final brq f = new brq("textures/entity/wolf/wolf_tame.png");
    private static final brq g = new brq("textures/entity/wolf/wolf_angry.png");
    private static final brq h = new brq("textures/entity/wolf/wolf_collar.png");

    public bpx(bim bim2, bim bim3, float f2) {
        super(bim2, f2);
        this.a(bim3);
    }

    protected float a(vm vm2, float f2) {
        return vm2.ch();
    }

    protected int a(vm vm2, int n2, float f2) {
        if (n2 == 0 && vm2.cg()) {
            float f3 = vm2.d(f2) * vm2.p(f2);
            this.a(a);
            GL11.glColor3f((float)f3, (float)f3, (float)f3);
            return 1;
        }
        if (n2 == 1 && vm2.bZ()) {
            this.a(h);
            int n3 = vm2.cj();
            GL11.glColor3f((float)vg.bp[n3][0], (float)vg.bp[n3][1], (float)vg.bp[n3][2]);
            return 1;
        }
        return -1;
    }

    protected brq a(vm vm2) {
        if (vm2.bZ()) {
            return f;
        }
        if (vm2.ci()) {
            return g;
        }
        return a;
    }

    @Override
    protected /* synthetic */ float b(rm rm2, float f2) {
        return this.a((vm)rm2, f2);
    }
}

