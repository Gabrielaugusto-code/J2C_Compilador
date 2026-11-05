/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class kc {
    private static final Logger b = LogManager.getLogger();
    public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    private final String c;
    private Date d = new Date();
    private String e = "(Unknown)";
    private Date f;
    private String g = "Banned by an operator.";

    public kc(String string) {
        this.c = string;
    }

    public String a() {
        return this.c;
    }

    public Date b() {
        return this.d;
    }

    public String c() {
        return this.e;
    }

    public void a(String string) {
        this.e = string;
    }

    public Date d() {
        return this.f;
    }

    public boolean e() {
        if (this.f == null) {
            return false;
        }
        return this.f.before(new Date());
    }

    public String f() {
        return this.g;
    }

    public void b(String string) {
        this.g = string;
    }

    public String g() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a());
        stringBuilder.append("|");
        stringBuilder.append(a.format(this.b()));
        stringBuilder.append("|");
        stringBuilder.append(this.c());
        stringBuilder.append("|");
        stringBuilder.append(this.d() == null ? "Forever" : a.format(this.d()));
        stringBuilder.append("|");
        stringBuilder.append(this.f());
        return stringBuilder.toString();
    }
}

