/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
import org.apache.commons.lang3.Validate;

public class brq {
    private final String a;
    private final String b;

    public brq(String string, String string2) {
        Validate.notNull((Object)string2);
        this.a = string == null || string.length() == 0 ? "minecraft" : string;
        this.b = string2;
    }

    public brq(String string) {
        String string2 = "minecraft";
        String string3 = string;
        int n2 = string.indexOf(58);
        if (n2 >= 0) {
            string3 = string.substring(n2 + 1, string.length());
            if (n2 > 1) {
                string2 = string.substring(0, n2);
            }
        }
        this.a = string2.toLowerCase();
        this.b = string3;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return this.a + ":" + this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof brq) {
            brq brq2 = (brq)object;
            return this.a.equals(brq2.a) && this.b.equals(brq2.b);
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + this.b.hashCode();
    }
}

