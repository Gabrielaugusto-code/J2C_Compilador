/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public class brn
implements brs {
    private static final brq a = new brq("textures/colormap/grass.png");

    @Override
    public void a(brr brr2) {
        try {
            afr.a(brb.a(brr2, a));
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

