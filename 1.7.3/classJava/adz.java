/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class adz
implements adx {
    private final abu a;
    private final List b;

    public adz(abu abu2, List list) {
        this.a = abu2;
        this.b = list;
    }

    @Override
    public abu b() {
        return this.a;
    }

    @Override
    public boolean a(yv yv2, afs afs2) {
        ArrayList arrayList = new ArrayList(this.b);
        for (int i2 = 0; i2 < 3; ++i2) {
            for (int i3 = 0; i3 < 3; ++i3) {
                abu abu2 = yv2.b(i3, i2);
                if (abu2 == null) continue;
                boolean bl2 = false;
                for (abu abu3 : arrayList) {
                    if (abu2.b() != abu3.b() || abu3.k() != Short.MAX_VALUE && abu2.k() != abu3.k()) continue;
                    bl2 = true;
                    arrayList.remove(abu3);
                    break;
                }
                if (bl2) continue;
                return false;
            }
        }
        return arrayList.isEmpty();
    }

    @Override
    public abu a(yv yv2) {
        return this.a.m();
    }

    @Override
    public int a() {
        return this.b.size();
    }
}

