/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;

public class hu
extends fk {
    private String a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private Collection e = new ArrayList();
    private int f;
    private int g;

    public hu() {
    }

    public hu(ays ays2, int n2) {
        this.a = ays2.b();
        this.f = n2;
        if (n2 == 0 || n2 == 2) {
            this.b = ays2.c();
            this.c = ays2.e();
            this.d = ays2.f();
            this.g = ays2.i();
        }
        if (n2 == 0) {
            this.e.addAll(ays2.d());
        }
    }

    public hu(ays ays2, Collection collection, int n2) {
        if (n2 != 3 && n2 != 4) {
            throw new IllegalArgumentException("Method must be join or leave for player constructor");
        }
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("Players cannot be null/empty");
        }
        this.f = n2;
        this.a = ays2.b();
        this.e.addAll(collection);
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.c(16);
        this.f = ep2.readByte();
        if (this.f == 0 || this.f == 2) {
            this.b = ep2.c(32);
            this.c = ep2.c(16);
            this.d = ep2.c(16);
            this.g = ep2.readByte();
        }
        if (this.f == 0 || this.f == 3 || this.f == 4) {
            int n2 = ep2.readShort();
            for (int i2 = 0; i2 < n2; ++i2) {
                this.e.add(ep2.c(16));
            }
        }
    }

    @Override
    public void b(ep ep2) {
        ep2.a(this.a);
        ep2.writeByte(this.f);
        if (this.f == 0 || this.f == 2) {
            ep2.a(this.b);
            ep2.a(this.c);
            ep2.a(this.d);
            ep2.writeByte(this.g);
        }
        if (this.f == 0 || this.f == 3 || this.f == 4) {
            ep2.writeShort(this.e.size());
            for (String string : this.e) {
                ep2.a(string);
            }
        }
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public String f() {
        return this.d;
    }

    public Collection g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }

    public int i() {
        return this.g;
    }
}

