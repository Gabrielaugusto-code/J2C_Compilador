/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.concurrent.Callable;
import org.lwjgl.opengl.GL11;

class azw
implements Callable {
    final /* synthetic */ azi a;

    azw(azi azi2) {
        this.a = azi2;
    }

    public String a() {
        return GL11.glGetString((int)7937) + " GL version " + GL11.glGetString((int)7938) + ", " + GL11.glGetString((int)7936);
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

