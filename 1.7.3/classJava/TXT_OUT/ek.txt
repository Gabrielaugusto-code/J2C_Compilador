/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  gnu.trove.map.TIntObjectMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.logging.log4j.LogManager
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;

public class ek
extends Enum {
    public static final /* enum */ ek a = new el(-1);
    public static final /* enum */ ek b = new em(0);
    public static final /* enum */ ek c = new en(1);
    public static final /* enum */ ek d = new eo(2);
    private static final TIntObjectMap e;
    private static final Map f;
    private final int g;
    private final BiMap h = HashBiMap.create();
    private final BiMap i = HashBiMap.create();
    private static final /* synthetic */ ek[] j;

    public static ek[] values() {
        return (ek[])j.clone();
    }

    public static ek valueOf(String string) {
        return Enum.valueOf(ek.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ek() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.g = var3_1;
    }

    protected ek a(int n2, Class clazz) {
        if (this.h.containsKey((Object)n2)) {
            String string = "Serverbound packet ID " + n2 + " is already assigned to " + this.h.get((Object)n2) + "; cannot re-assign to " + clazz;
            LogManager.getLogger().fatal(string);
            throw new IllegalArgumentException(string);
        }
        if (this.h.containsValue((Object)clazz)) {
            String string = "Serverbound packet " + clazz + " is already assigned to ID " + this.h.inverse().get((Object)clazz) + "; cannot re-assign to " + n2;
            LogManager.getLogger().fatal(string);
            throw new IllegalArgumentException(string);
        }
        this.h.put((Object)n2, (Object)clazz);
        return this;
    }

    protected ek b(int n2, Class clazz) {
        if (this.i.containsKey((Object)n2)) {
            String string = "Clientbound packet ID " + n2 + " is already assigned to " + this.i.get((Object)n2) + "; cannot re-assign to " + clazz;
            LogManager.getLogger().fatal(string);
            throw new IllegalArgumentException(string);
        }
        if (this.i.containsValue((Object)clazz)) {
            String string = "Clientbound packet " + clazz + " is already assigned to ID " + this.i.inverse().get((Object)clazz) + "; cannot re-assign to " + n2;
            LogManager.getLogger().fatal(string);
            throw new IllegalArgumentException(string);
        }
        this.i.put((Object)n2, (Object)clazz);
        return this;
    }

    public BiMap a() {
        return this.h;
    }

    public BiMap b() {
        return this.i;
    }

    public BiMap a(boolean bl2) {
        return bl2 ? this.b() : this.a();
    }

    public BiMap b(boolean bl2) {
        return bl2 ? this.a() : this.b();
    }

    public int c() {
        return this.g;
    }

    public static ek a(int n2) {
        return (ek)((Object)e.get(n2));
    }

    public static ek a(fk fk2) {
        return (ek)((Object)f.get(fk2.getClass()));
    }

    /*
     * WARNING - void declaration
     */
    /* synthetic */ ek(int n2, el el2) {
        this((String)var1_-1, (int)el2, (int)var3_2);
        void var3_2;
        void var1_-1;
    }

    static {
        j = new ek[]{a, b, c, d};
        e = new TIntObjectHashMap();
        f = Maps.newHashMap();
        for (ek ek2 : ek.values()) {
            e.put(ek2.c(), (Object)ek2);
            for (Class clazz : Iterables.concat((Iterable)ek2.b().values(), (Iterable)ek2.a().values())) {
                if (f.containsKey(clazz) && f.get(clazz) != ek2) {
                    throw new Error("Packet " + clazz + " is already assigned to protocol " + f.get(clazz) + " - can't reassign to " + (Object)((Object)ek2));
                }
                f.put(clazz, ek2);
            }
        }
    }
}

