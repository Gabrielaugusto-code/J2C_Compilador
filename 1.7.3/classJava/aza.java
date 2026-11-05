/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class aza
extends ayz {
    public aza(String string) {
        super(string);
    }

    @Override
    public int a(List list) {
        float f2 = 0.0f;
        for (xq xq2 : list) {
            f2 += xq2.aR() + xq2.br();
        }
        if (list.size() > 0) {
            f2 /= (float)list.size();
        }
        return oy.f(f2);
    }

    @Override
    public boolean b() {
        return true;
    }
}

