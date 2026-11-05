/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.List;

public class uf
extends ul {
    private final Class a;
    private final int b;
    private final uh e;
    private final ra f;
    private rm g;

    public uf(ru ru2, Class clazz, int n2, boolean bl2) {
        this(ru2, clazz, n2, bl2, false);
    }

    public uf(ru ru2, Class clazz, int n2, boolean bl2, boolean bl3) {
        this(ru2, clazz, n2, bl2, bl3, null);
    }

    public uf(ru ru2, Class clazz, int n2, boolean bl2, boolean bl3, ra ra2) {
        super(ru2, bl2, bl3);
        this.a = clazz;
        this.b = n2;
        this.e = new uh(ru2);
        this.a(1);
        this.f = new ug(this, ra2);
    }

    @Override
    public boolean a() {
        if (this.b > 0 && this.c.aH().nextInt(this.b) != 0) {
            return false;
        }
        double d2 = this.f();
        List list = this.c.o.a(this.a, this.c.C.b(d2, 4.0, d2), this.f);
        Collections.sort(list, this.e);
        if (list.isEmpty()) {
            return false;
        }
        this.g = (rm)list.get(0);
        return true;
    }

    @Override
    public void c() {
        this.c.d(this.g);
        super.c();
    }
}

