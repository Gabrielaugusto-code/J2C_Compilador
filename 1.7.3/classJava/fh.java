/*
 * Decompiled with CFR 0.152.
 */
public class fh
extends ev {
    private final String b;

    public fh(String string) {
        this.b = string;
    }

    public String g() {
        return this.b;
    }

    @Override
    public String e() {
        return this.b;
    }

    public fh h() {
        fh fh2 = new fh(this.b);
        fh2.a(this.b().l());
        for (fa fa2 : this.a()) {
            fh2.a(fa2.f());
        }
        return fh2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof fh) {
            fh fh2 = (fh)object;
            return this.b.equals(fh2.g()) && super.equals(object);
        }
        return false;
    }

    @Override
    public String toString() {
        return "TextComponent{text='" + this.b + '\'' + ", siblings=" + this.a + ", style=" + this.b() + '}';
    }

    @Override
    public /* synthetic */ fa f() {
        return this.h();
    }
}

