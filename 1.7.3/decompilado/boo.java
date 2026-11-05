/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Maps;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class boo
extends bpd {
    private static final Map a = Maps.newHashMap();
    private static final brq f = new brq("textures/entity/horse/horse_white.png");
    private static final brq g = new brq("textures/entity/horse/mule.png");
    private static final brq h = new brq("textures/entity/horse/donkey.png");
    private static final brq k = new brq("textures/entity/horse/horse_zombie.png");
    private static final brq l = new brq("textures/entity/horse/horse_skeleton.png");

    public boo(bim bim2, float f2) {
        super(bim2, f2);
    }

    protected void a(uz uz2, float f2) {
        float f3 = 1.0f;
        int n2 = uz2.bZ();
        if (n2 == 1) {
            f3 *= 0.87f;
        } else if (n2 == 2) {
            f3 *= 0.92f;
        }
        GL11.glScalef((float)f3, (float)f3, (float)f3);
        super.a(uz2, f2);
    }

    protected void a(uz uz2, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (uz2.ao()) {
            this.i.a(f2, f3, f4, f5, f6, f7, uz2);
        } else {
            this.b((qr)uz2);
            this.i.a(uz2, f2, f3, f4, f5, f6, f7);
        }
    }

    protected brq a(uz uz2) {
        if (!uz2.cx()) {
            switch (uz2.bZ()) {
                default: {
                    return f;
                }
                case 2: {
                    return g;
                }
                case 1: {
                    return h;
                }
                case 3: {
                    return k;
                }
                case 4: 
            }
            return l;
        }
        return this.b(uz2);
    }

    private brq b(uz uz2) {
        String string = uz2.cy();
        brq brq2 = (brq)a.get(string);
        if (brq2 == null) {
            brq2 = new brq(string);
            azi.B().P().a(brq2, new bqm(uz2.cz()));
            a.put(string, brq2);
        }
        return brq2;
    }
}

