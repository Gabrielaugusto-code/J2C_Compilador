/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.List;

public class ayt {
    public static final Comparator a = new ayu();
    private final ayw b;
    private final ayr c;
    private final String d;
    private int e;

    public ayt(ayw ayw2, ayr ayr2, String string) {
        this.b = ayw2;
        this.c = ayr2;
        this.d = string;
    }

    public void a(int n2) {
        if (this.c.c().b()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.c(this.c() + n2);
    }

    public void b(int n2) {
        if (this.c.c().b()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.c(this.c() - n2);
    }

    public void a() {
        if (this.c.c().b()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.a(1);
    }

    public int c() {
        return this.e;
    }

    public void c(int n2) {
        int n3 = this.e;
        this.e = n2;
        if (n3 != n2) {
            this.f().a(this);
        }
    }

    public ayr d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public ayw f() {
        return this.b;
    }

    public void a(List list) {
        this.c(this.c.c().a(list));
    }
}

