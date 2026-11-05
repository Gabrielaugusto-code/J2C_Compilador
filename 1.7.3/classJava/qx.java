/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class qx {
    private static final Logger b = LogManager.getLogger();
    private static Map c = new HashMap();
    private static Map d = new HashMap();
    private static Map e = new HashMap();
    private static Map f = new HashMap();
    private static Map g = new HashMap();
    public static HashMap a = new LinkedHashMap();

    private static void a(Class clazz, String string, int n2) {
        if (c.containsKey(string)) {
            throw new IllegalArgumentException("ID is already registered: " + string);
        }
        if (e.containsKey(n2)) {
            throw new IllegalArgumentException("ID is already registered: " + n2);
        }
        c.put(string, clazz);
        d.put(clazz, string);
        e.put(n2, clazz);
        f.put(clazz, n2);
        g.put(string, n2);
    }

    private static void a(Class clazz, String string, int n2, int n3, int n4) {
        qx.a(clazz, string, n2);
        a.put(n2, new qy(n2, n3, n4));
    }

    public static qr a(String string, afs afs2) {
        qr qr2 = null;
        try {
            Class clazz = (Class)c.get(string);
            if (clazz != null) {
                qr2 = (qr)clazz.getConstructor(afs.class).newInstance(afs2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return qr2;
    }

    public static qr a(dg dg2, afs afs2) {
        qr qr2 = null;
        if ("Minecart".equals(dg2.j("id"))) {
            switch (dg2.f("Type")) {
                case 1: {
                    dg2.a("id", "MinecartChest");
                    break;
                }
                case 2: {
                    dg2.a("id", "MinecartFurnace");
                    break;
                }
                case 0: {
                    dg2.a("id", "MinecartRideable");
                }
            }
            dg2.o("Type");
        }
        try {
            Class clazz = (Class)c.get(dg2.j("id"));
            if (clazz != null) {
                qr2 = (qr)clazz.getConstructor(afs.class).newInstance(afs2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (qr2 != null) {
            qr2.f(dg2);
        } else {
            b.warn("Skipping Entity with id " + dg2.j("id"));
        }
        return qr2;
    }

    public static qr a(int n2, afs afs2) {
        qr qr2 = null;
        try {
            Class clazz = qx.a(n2);
            if (clazz != null) {
                qr2 = (qr)clazz.getConstructor(afs.class).newInstance(afs2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (qr2 == null) {
            b.warn("Skipping Entity with id " + n2);
        }
        return qr2;
    }

    public static int a(qr qr2) {
        Class<?> clazz = qr2.getClass();
        return f.containsKey(clazz) ? (Integer)f.get(clazz) : 0;
    }

    public static Class a(int n2) {
        return (Class)e.get(n2);
    }

    public static String b(qr qr2) {
        return (String)d.get(qr2.getClass());
    }

    public static String b(int n2) {
        Class clazz = qx.a(n2);
        if (clazz != null) {
            return (String)d.get(clazz);
        }
        return null;
    }

    public static void a() {
    }

    public static Set b() {
        return Collections.unmodifiableSet(g.keySet());
    }

    static {
        qx.a(wb.class, "Item", 1);
        qx.a(rh.class, "XPOrb", 2);
        qx.a(rl.class, "LeashKnot", 8);
        qx.a(rs.class, "Painting", 9);
        qx.a(xt.class, "Arrow", 10);
        qx.a(ya.class, "Snowball", 11);
        qx.a(xx.class, "Fireball", 12);
        qx.a(xz.class, "SmallFireball", 13);
        qx.a(yd.class, "ThrownEnderpearl", 14);
        qx.a(xu.class, "EyeOfEnderSignal", 15);
        qx.a(yf.class, "ThrownPotion", 16);
        qx.a(ye.class, "ThrownExpBottle", 17);
        qx.a(rk.class, "ItemFrame", 18);
        qx.a(yg.class, "WitherSkull", 19);
        qx.a(wn.class, "PrimedTnt", 20);
        qx.a(wa.class, "FallingSand", 21);
        qx.a(xw.class, "FireworksRocketEntity", 22);
        qx.a(vz.class, "Boat", 41);
        qx.a(wj.class, "MinecartRideable", 42);
        qx.a(wd.class, "MinecartChest", 43);
        qx.a(wh.class, "MinecartFurnace", 44);
        qx.a(wm.class, "MinecartTNT", 45);
        qx.a(wi.class, "MinecartHopper", 46);
        qx.a(wk.class, "MinecartSpawner", 47);
        qx.a(we.class, "MinecartCommandBlock", 40);
        qx.a(rn.class, "Mob", 48);
        qx.a(wx.class, "Monster", 49);
        qx.a(wq.class, "Creeper", 50, 894731, 0);
        qx.a(xc.class, "Skeleton", 51, 0xC1C1C1, 0x494949);
        qx.a(xe.class, "Spider", 52, 3419431, 11013646);
        qx.a(wv.class, "Giant", 53);
        qx.a(xh.class, "Zombie", 54, 44975, 7969893);
        qx.a(xd.class, "Slime", 55, 5349438, 8306542);
        qx.a(wu.class, "Ghast", 56, 0xF9F9F9, 0xBCBCBC);
        qx.a(wy.class, "PigZombie", 57, 15373203, 5009705);
        qx.a(wr.class, "Enderman", 58, 0x161616, 0);
        qx.a(wp.class, "CaveSpider", 59, 803406, 11013646);
        qx.a(xb.class, "Silverfish", 60, 0x6E6E6E, 0x303030);
        qx.a(wo.class, "Blaze", 61, 16167425, 16775294);
        qx.a(ww.class, "LavaSlime", 62, 0x340000, 0xFCFC00);
        qx.a(vr.class, "EnderDragon", 63);
        qx.a(vt.class, "WitherBoss", 64);
        qx.a(uv.class, "Bat", 65, 4996656, 986895);
        qx.a(xg.class, "Witch", 66, 0x340000, 5349438);
        qx.a(vf.class, "Pig", 90, 15771042, 14377823);
        qx.a(vg.class, "Sheep", 91, 0xE7E7E7, 0xFFB5B5);
        qx.a(uy.class, "Cow", 92, 4470310, 0xA1A1A1);
        qx.a(ux.class, "Chicken", 93, 0xA1A1A1, 0xFF0000);
        qx.a(vj.class, "Squid", 94, 2243405, 7375001);
        qx.a(vm.class, "Wolf", 95, 0xD7D3D3, 13545366);
        qx.a(vd.class, "MushroomCow", 96, 10489616, 0xB7B7B7);
        qx.a(vi.class, "SnowMan", 97);
        qx.a(ve.class, "Ozelot", 98, 15720061, 5653556);
        qx.a(vk.class, "VillagerGolem", 99);
        qx.a(uz.class, "EntityHorse", 100, 12623485, 0xEEE500);
        qx.a(xm.class, "Villager", 120, 5651507, 12422002);
        qx.a(vq.class, "EnderCrystal", 200);
    }
}

