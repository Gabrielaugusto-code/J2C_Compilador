/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class boc
extends boh {
    @Override
    public void a(qr qr2, double d2, double d3, double d4, float f2, float f3) {
        GL11.glPushMatrix();
        boc.a(qr2.C, d2 - qr2.S, d3 - qr2.T, d4 - qr2.U);
        GL11.glPopMatrix();
    }

    @Override
    protected brq a(qr qr2) {
        return null;
    }
}

