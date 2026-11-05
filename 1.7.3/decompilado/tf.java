/*
 * Decompiled with CFR 0.152.
 */
public class tf
extends te {
    private final xm b;

    public tf(xm xm2) {
        super(xm2, xq.class, 8.0f);
        this.b = xm2;
    }

    @Override
    public boolean a() {
        if (this.b.cc()) {
            this.a = this.b.b();
            return true;
        }
        return false;
    }
}

