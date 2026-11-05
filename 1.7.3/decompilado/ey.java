/*
 * Decompiled with CFR 0.152.
 */
public class ey {
    private final ez a;
    private final String b;

    public ey(ez ez2, String string) {
        this.a = ez2;
        this.b = string;
    }

    public ez a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ey ey2 = (ey)object;
        if (this.a != ey2.a) {
            return false;
        }
        return !(this.b != null ? !this.b.equals(ey2.b) : ey2.b != null);
    }

    public String toString() {
        return "ClickEvent{action=" + (Object)((Object)this.a) + ", value='" + this.b + '\'' + '}';
    }

    public int hashCode() {
        int n2 = this.a.hashCode();
        n2 = 31 * n2 + (this.b != null ? this.b.hashCode() : 0);
        return n2;
    }
}

