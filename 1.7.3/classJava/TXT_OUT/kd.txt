/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class kd {
    private static final Logger a = LogManager.getLogger();
    private final op b = new op();
    private final File c;
    private boolean d = true;

    public kd(File file) {
        this.c = file;
    }

    public boolean b() {
        return this.d;
    }

    public void a(boolean bl2) {
        this.d = bl2;
    }

    public Map c() {
        this.d();
        return this.b;
    }

    public boolean a(String string) {
        if (!this.b()) {
            return false;
        }
        this.d();
        return this.b.containsKey(string);
    }

    public void a(kc kc2) {
        this.b.a(kc2.a(), kc2);
        this.f();
    }

    public void b(String string) {
        this.b.remove(string);
        this.f();
    }

    public void d() {
        Iterator iterator = this.b.values().iterator();
        while (iterator.hasNext()) {
            kc kc2 = (kc)iterator.next();
            if (!kc2.e()) continue;
            iterator.remove();
        }
    }

    public void f() {
        this.b(true);
    }

    public void b(boolean bl2) {
        this.d();
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(this.c, false));
            if (bl2) {
                printWriter.println("# Updated " + new SimpleDateFormat().format(new Date()) + " by Minecraft " + "1.7.3");
                printWriter.println("# victim name | ban date | banned by | banned until | reason");
                printWriter.println();
            }
            for (kc kc2 : this.b.values()) {
                printWriter.println(kc2.g());
            }
            printWriter.close();
        }
        catch (IOException iOException) {
            a.error("Could not save ban list", (Throwable)iOException);
        }
    }
}

