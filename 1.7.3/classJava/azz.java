/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 */
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class azz {
    public int a;
    public int b;

    public void a() {
        Mouse.setGrabbed((boolean)true);
        this.a = 0;
        this.b = 0;
    }

    public void b() {
        Mouse.setCursorPosition((int)(Display.getWidth() / 2), (int)(Display.getHeight() / 2));
        Mouse.setGrabbed((boolean)false);
    }

    public void c() {
        this.a = Mouse.getDX();
        this.b = Mouse.getDY();
    }
}

