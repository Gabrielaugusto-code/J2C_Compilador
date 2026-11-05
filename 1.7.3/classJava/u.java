/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;
import java.util.regex.Pattern;

public class u {
    private static final Pattern a = Pattern.compile("[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}");

    public static v a() {
        String string = System.getProperty("os.name").toLowerCase();
        if (string.contains("win")) {
            return v.c;
        }
        if (string.contains("mac")) {
            return v.d;
        }
        if (string.contains("solaris")) {
            return v.b;
        }
        if (string.contains("sunos")) {
            return v.b;
        }
        if (string.contains("linux")) {
            return v.a;
        }
        if (string.contains("unix")) {
            return v.a;
        }
        return v.e;
    }

    public static boolean a(String string) {
        return a.matcher(string).matches();
    }

    public static UUID b(String string) {
        String string2;
        if (string == null) {
            return null;
        }
        if (u.a(string)) {
            return UUID.fromString(string);
        }
        if (string.length() == 32 && u.a(string2 = string.substring(0, 8) + "-" + string.substring(8, 12) + "-" + string.substring(12, 16) + "-" + string.substring(16, 20) + "-" + string.substring(20, 32))) {
            return UUID.fromString(string2);
        }
        return null;
    }
}

