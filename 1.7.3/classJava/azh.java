/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class azh {
    private static final Map a = new HashMap();
    private static final List b = new ArrayList();

    public static synchronized int a(int n2) {
        int n3 = GL11.glGenLists((int)n2);
        a.put(n3, n2);
        return n3;
    }

    public static synchronized void b(int n2) {
        GL11.glDeleteLists((int)n2, (int)((Integer)a.remove(n2)));
    }

    public static synchronized void a() {
        for (Map.Entry entry : a.entrySet()) {
            GL11.glDeleteLists((int)((Integer)entry.getKey()), (int)((Integer)entry.getValue()));
        }
        a.clear();
    }

    public static synchronized ByteBuffer c(int n2) {
        return ByteBuffer.allocateDirect(n2).order(ByteOrder.nativeOrder());
    }

    public static IntBuffer f(int n2) {
        return azh.c(n2 << 2).asIntBuffer();
    }

    public static FloatBuffer h(int n2) {
        return azh.c(n2 << 2).asFloatBuffer();
    }
}

