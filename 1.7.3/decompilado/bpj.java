/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bpj
extends bpd {
    private static final brq a = new brq("textures/entity/sheep/sheep_fur.png");
    private static final brq f = new brq("textures/entity/sheep/sheep.png");

    public bpj(bim bim2, bim bim3, float f2) {
        super(bim2, f2);
        this.a(bim3);
    }

    protected int a(vg vg2, int n2, float f2) {
        if (n2 == 0 && !vg2.ca()) {
            this.a(a);
            if (vg2.bH() && "jeb_".equals(vg2.bG())) {
                int n3 = 25;
                int n4 = vg2.aa / 25 + vg2.x();
                int n5 = n4 % vg.bp.length;
                int n6 = (n4 + 1) % vg.bp.length;
                float f3 = ((float)(vg2.aa % 25) + f2) / 25.0f;
                GL11.glColor3f((float)(vg.bp[n5][0] * (1.0f - f3) + vg.bp[n6][0] * f3), (float)(vg.bp[n5][1] * (1.0f - f3) + vg.bp[n6][1] * f3), (float)(vg.bp[n5][2] * (1.0f - f3) + vg.bp[n6][2] * f3));
            } else {
                int n7 = vg2.bZ();
                GL11.glColor3f((float)vg.bp[n7][0], (float)vg.bp[n7][1], (float)vg.bp[n7][2]);
            }
            return 1;
        }
        return -1;
    }

    protected brq a(vg vg2) {
        return f;
    }
}

