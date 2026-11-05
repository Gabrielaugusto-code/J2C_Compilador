/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aty {
    private static final Logger a = LogManager.getLogger();
    private static Map b = new HashMap();
    private static Map c = new HashMap();
    private static Map d = new HashMap();
    private static Map e = new HashMap();

    private static void b(Class clazz, String string) {
        b.put(string, clazz);
        c.put(clazz, string);
    }

    static void a(Class clazz, String string) {
        d.put(string, clazz);
        e.put(clazz, string);
    }

    public static String a(auc auc2) {
        return (String)c.get(auc2.getClass());
    }

    public static String a(aua aua2) {
        return (String)e.get(aua2.getClass());
    }

    public static auc a(dg dg2, afs afs2) {
        auc auc2 = null;
        try {
            Class clazz = (Class)b.get(dg2.j("id"));
            if (clazz != null) {
                auc2 = (auc)clazz.newInstance();
            }
        }
        catch (Exception exception) {
            a.warn("Failed Start with id " + dg2.j("id"));
            exception.printStackTrace();
        }
        if (auc2 != null) {
            auc2.a(afs2, dg2);
        } else {
            a.warn("Skipping Structure with id " + dg2.j("id"));
        }
        return auc2;
    }

    public static aua b(dg dg2, afs afs2) {
        aua aua2 = null;
        try {
            Class clazz = (Class)d.get(dg2.j("id"));
            if (clazz != null) {
                aua2 = (aua)clazz.newInstance();
            }
        }
        catch (Exception exception) {
            a.warn("Failed Piece with id " + dg2.j("id"));
            exception.printStackTrace();
        }
        if (aua2 != null) {
            aua2.a(afs2, dg2);
        } else {
            a.warn("Skipping Piece with id " + dg2.j("id"));
        }
        return aua2;
    }

    static {
        aty.b(art.class, "Mineshaft");
        aty.b(aue.class, "Village");
        aty.b(arv.class, "Fortress");
        aty.b(asy.class, "Stronghold");
        aty.b(asp.class, "Temple");
        aro.a();
        auf.a();
        arw.a();
        asz.a();
        asq.a();
    }
}

