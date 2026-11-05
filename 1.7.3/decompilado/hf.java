/*
 * Decompiled with CFR 0.152.
 */
public class hf
extends fk {
    private String a;
    private boolean b;
    private int c;

    public hf() {
    }

    public hf(String string, boolean bl2, int n2) {
        this.a = string;
        this.b = bl2;
        this.c = n2;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.c(16);
        this.b = ep2.readBoolean();
        this.c = ep2.readShort();
    }

    @Override
    public void b(ep ep2) {
        ep2.a(this.a);
        ep2.writeBoolean(this.b);
        ep2.writeShort(this.c);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }
}

