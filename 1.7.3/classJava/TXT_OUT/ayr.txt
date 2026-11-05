/*
 * Decompiled with CFR 0.152.
 */
public class ayr {
    private final ayw a;
    private final String b;
    private final azb c;
    private String d;

    public ayr(ayw ayw2, String string, azb azb2) {
        this.a = ayw2;
        this.b = string;
        this.c = azb2;
        this.d = string;
    }

    public ayw a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public azb c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public void a(String string) {
        this.d = string;
        this.a.b(this);
    }
}

