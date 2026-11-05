/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ayz
implements azb {
    private final String g;

    public ayz(String string) {
        this.g = string;
        azb.a.put(string, this);
    }

    @Override
    public String a() {
        return this.g;
    }

    @Override
    public int a(List list) {
        return 0;
    }

    @Override
    public boolean b() {
        return false;
    }
}

