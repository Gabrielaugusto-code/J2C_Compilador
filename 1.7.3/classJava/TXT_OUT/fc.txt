/*
 * Decompiled with CFR 0.152.
 */
public class fc {
    private final fd a;
    private final fa b;

    public fc(fd fd2, fa fa2) {
        this.a = fd2;
        this.b = fa2;
    }

    public fd a() {
        return this.a;
    }

    public fa b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        fc fc2 = (fc)object;
        if (this.a != fc2.a) {
            return false;
        }
        return !(this.b != null ? !this.b.equals(fc2.b) : fc2.b != null);
    }

    public String toString() {
        return "HoverEvent{action=" + (Object)((Object)this.a) + ", value='" + this.b + '\'' + '}';
    }

    public int hashCode() {
        int n2 = this.a.hashCode();
        n2 = 31 * n2 + (this.b != null ? this.b.hashCode() : 0);
        return n2;
    }
}

