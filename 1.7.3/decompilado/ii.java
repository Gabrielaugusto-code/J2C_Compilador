/*
 * Decompiled with CFR 0.152.
 */
public class ii
extends fk {
    private String a;

    public ii() {
    }

    public ii(String string) {
        if (string.length() > 100) {
            string = string.substring(0, 100);
        }
        this.a = string;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.c(100);
    }

    @Override
    public void b(ep ep2) {
        ep2.a(this.a);
    }

    public void a(ie ie2) {
        ie2.a(this);
    }

    @Override
    public String b() {
        return String.format("message='%s'", this.a);
    }

    public String c() {
        return this.a;
    }
}

