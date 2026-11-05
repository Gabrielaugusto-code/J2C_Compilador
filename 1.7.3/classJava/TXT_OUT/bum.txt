/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 */
import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import java.util.Map;

public class bum {
    private static final Gson a = new Gson();
    private final String b;
    private String c;
    private Map d;

    public bum(String string, String string2) {
        this.b = string;
        this.c = string2;
    }

    public bum(String string) {
        this(string, null);
    }

    public void a(String string) {
        this.c = string;
    }

    public String a() {
        return this.c == null ? this.b : this.c;
    }

    public void a(String string, String string2) {
        if (this.d == null) {
            this.d = Maps.newHashMap();
        }
        if (this.d.size() > 50) {
            throw new IllegalArgumentException("Metadata payload is full, cannot add more to it!");
        }
        if (string == null) {
            throw new IllegalArgumentException("Metadata payload key cannot be null!");
        }
        if (string.length() > 255) {
            throw new IllegalArgumentException("Metadata payload key is too long!");
        }
        if (string2 == null) {
            throw new IllegalArgumentException("Metadata payload value cannot be null!");
        }
        if (string2.length() > 255) {
            throw new IllegalArgumentException("Metadata payload value is too long!");
        }
        this.d.put(string, string2);
    }

    public String b() {
        if (this.d == null || this.d.isEmpty()) {
            return null;
        }
        return a.toJson((Object)this.d);
    }

    public String c() {
        return this.b;
    }

    public String toString() {
        return Objects.toStringHelper((Object)this).add("name", (Object)this.b).add("description", (Object)this.c).add("data", (Object)this.b()).toString();
    }
}

