/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class hn
extends fk {
    private int a;
    private List b;

    public hn() {
    }

    public hn(int n2, rv rv2, boolean bl2) {
        this.a = n2;
        this.b = bl2 ? rv2.c() : rv2.b();
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.readInt();
        this.b = rv.b(ep2);
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        rv.a(this.b, ep2);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public List c() {
        return this.b;
    }

    public int d() {
        return this.a;
    }
}

