/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import java.util.concurrent.Callable;
import org.lwjgl.input.Mouse;

class bmo
implements Callable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ bmm c;

    bmo(bmm bmm2, int n2, int n3) {
        this.c = bmm2;
        this.a = n2;
        this.b = n3;
    }

    public String a() {
        return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", this.a, this.b, Mouse.getX(), Mouse.getY());
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

