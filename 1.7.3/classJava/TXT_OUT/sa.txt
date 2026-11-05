/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
import java.util.UUID;
import org.apache.commons.lang3.Validate;

public class sa {
    private final double a;
    private final int b;
    private final String c;
    private final UUID d;
    private boolean e = true;

    public sa(String string, double d2, int n2) {
        this(UUID.randomUUID(), string, d2, n2);
    }

    public sa(UUID uUID, String string, double d2, int n2) {
        this.d = uUID;
        this.c = string;
        this.a = d2;
        this.b = n2;
        Validate.notEmpty((CharSequence)string, (String)"Modifier name cannot be empty", (Object[])new Object[0]);
        Validate.inclusiveBetween((Object)0, (Object)2, (Comparable)Integer.valueOf(n2), (String)"Invalid operation", (Object[])new Object[0]);
    }

    public UUID a() {
        return this.d;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public double d() {
        return this.a;
    }

    public boolean e() {
        return this.e;
    }

    public sa a(boolean bl2) {
        this.e = bl2;
        return this;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        sa sa2 = (sa)object;
        return !(this.d != null ? !this.d.equals(sa2.d) : sa2.d != null);
    }

    public int hashCode() {
        return this.d != null ? this.d.hashCode() : 0;
    }

    public String toString() {
        return "AttributeModifier{amount=" + this.a + ", operation=" + this.b + ", name='" + this.c + '\'' + ", id=" + this.d + ", serialize=" + this.e + '}';
    }
}

