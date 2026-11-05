/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ays
extends ayy {
    private final ayw a;
    private final String b;
    private final Set c = new HashSet();
    private String d;
    private String e = "";
    private String f = "";
    private boolean g = true;
    private boolean h = true;

    public ays(ayw ayw2, String string) {
        this.a = ayw2;
        this.b = string;
        this.d = string;
    }

    @Override
    public String b() {
        return this.b;
    }

    public String c() {
        return this.d;
    }

    public void a(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.d = string;
        this.a.b(this);
    }

    public Collection d() {
        return this.c;
    }

    public String e() {
        return this.e;
    }

    public void b(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Prefix cannot be null");
        }
        this.e = string;
        this.a.b(this);
    }

    public String f() {
        return this.f;
    }

    public void c(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Suffix cannot be null");
        }
        this.f = string;
        this.a.b(this);
    }

    @Override
    public String d(String string) {
        return this.e() + string + this.f();
    }

    public static String a(ayy ayy2, String string) {
        if (ayy2 == null) {
            return string;
        }
        return ayy2.d(string);
    }

    @Override
    public boolean g() {
        return this.g;
    }

    public void a(boolean bl2) {
        this.g = bl2;
        this.a.b(this);
    }

    @Override
    public boolean h() {
        return this.h;
    }

    public void b(boolean bl2) {
        this.h = bl2;
        this.a.b(this);
    }

    public int i() {
        int n2 = 0;
        if (this.g()) {
            n2 |= 1;
        }
        if (this.h()) {
            n2 |= 2;
        }
        return n2;
    }

    public void a(int n2) {
        this.a((n2 & 1) > 0);
        this.b((n2 & 2) > 0);
    }
}

