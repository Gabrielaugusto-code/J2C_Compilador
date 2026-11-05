/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bny
extends bpo {
    private static final brq a = new brq("textures/entity/spider/cave_spider.png");

    public bny() {
        this.d *= 0.7f;
    }

    protected void a(wp wp2, float f2) {
        GL11.glScalef((float)0.7f, (float)0.7f, (float)0.7f);
    }

    protected brq a(wp wp2) {
        return a;
    }
}

