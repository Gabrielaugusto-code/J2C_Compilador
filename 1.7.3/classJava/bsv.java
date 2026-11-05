/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.List;

public class bsv
implements bsh {
    private final boolean a;
    private final boolean b;
    private final List c;

    public bsv(boolean bl2, boolean bl3, List list) {
        this.a = bl2;
        this.b = bl3;
        this.c = list;
    }

    public boolean a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public List c() {
        return Collections.unmodifiableList(this.c);
    }
}

