/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Doubles
 */
import com.google.common.primitives.Doubles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public abstract class y
implements aa {
    private static x a;

    public int a() {
        return 4;
    }

    @Override
    public List b() {
        return null;
    }

    @Override
    public boolean a(ac ac2) {
        return ac2.a(this.a(), this.c());
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        return null;
    }

    public static int a(ac ac2, String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new cd("commands.generic.num.invalid", string);
        }
    }

    public static int a(ac ac2, String string, int n2) {
        return y.a(ac2, string, n2, Integer.MAX_VALUE);
    }

    public static int a(ac ac2, String string, int n2, int n3) {
        int n4 = y.a(ac2, string);
        if (n4 < n2) {
            throw new cd("commands.generic.num.tooSmall", n4, n2);
        }
        if (n4 > n3) {
            throw new cd("commands.generic.num.tooBig", n4, n3);
        }
        return n4;
    }

    public static double b(ac ac2, String string) {
        try {
            double d2 = Double.parseDouble(string);
            if (!Doubles.isFinite((double)d2)) {
                throw new cd("commands.generic.num.invalid", string);
            }
            return d2;
        }
        catch (NumberFormatException numberFormatException) {
            throw new cd("commands.generic.num.invalid", string);
        }
    }

    public static double a(ac ac2, String string, double d2) {
        return y.a(ac2, string, d2, Double.MAX_VALUE);
    }

    public static double a(ac ac2, String string, double d2, double d3) {
        double d4 = y.b(ac2, string);
        if (d4 < d2) {
            throw new cd("commands.generic.double.tooSmall", d4, d2);
        }
        if (d4 > d3) {
            throw new cd("commands.generic.double.tooBig", d4, d3);
        }
        return d4;
    }

    public static boolean c(ac ac2, String string) {
        if (string.equals("true") || string.equals("1")) {
            return true;
        }
        if (string.equals("false") || string.equals("0")) {
            return false;
        }
        throw new cc("commands.generic.boolean.invalid", string);
    }

    public static mp b(ac ac2) {
        if (ac2 instanceof mp) {
            return (mp)ac2;
        }
        throw new cf("You must specify which player you wish to perform this action on.", new Object[0]);
    }

    public static mp d(ac ac2, String string) {
        mp mp2 = ad.a(ac2, string);
        if (mp2 != null) {
            return mp2;
        }
        mp2 = MinecraftServer.G().af().e(string);
        if (mp2 == null) {
            throw new cf();
        }
        return mp2;
    }

    public static String e(ac ac2, String string) {
        mp mp2 = ad.a(ac2, string);
        if (mp2 != null) {
            return mp2.b_();
        }
        if (ad.b(string)) {
            throw new cf();
        }
        return string;
    }

    public static fa a(ac ac2, String[] stringArray, int n2) {
        return y.a(ac2, stringArray, n2, false);
    }

    public static fa a(ac ac2, String[] stringArray, int n2, boolean bl2) {
        fh fh2 = new fh("");
        for (int i2 = n2; i2 < stringArray.length; ++i2) {
            if (i2 > n2) {
                fh2.a(" ");
            }
            fa fa2 = new fh(stringArray[i2]);
            if (bl2) {
                fa fa3 = ad.b(ac2, stringArray[i2]);
                if (fa3 != null) {
                    fa2 = fa3;
                } else if (ad.b(stringArray[i2])) {
                    throw new cf();
                }
            }
            fh2.a(fa2);
        }
        return fh2;
    }

    public static String b(ac ac2, String[] stringArray, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = n2; i2 < stringArray.length; ++i2) {
            if (i2 > n2) {
                stringBuilder.append(" ");
            }
            String string = stringArray[i2];
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static double a(ac ac2, double d2, String string) {
        return y.a(ac2, d2, string, -30000000, 30000000);
    }

    public static double a(ac ac2, double d2, String string, int n2, int n3) {
        double d3;
        boolean bl2 = string.startsWith("~");
        if (bl2 && Double.isNaN(d2)) {
            throw new cd("commands.generic.num.invalid", d2);
        }
        double d4 = d3 = bl2 ? d2 : 0.0;
        if (!bl2 || string.length() > 1) {
            boolean bl3 = string.contains(".");
            if (bl2) {
                string = string.substring(1);
            }
            d3 += y.b(ac2, string);
            if (!bl3 && !bl2) {
                d3 += 0.5;
            }
        }
        if (n2 != 0 || n3 != 0) {
            if (d3 < (double)n2) {
                throw new cd("commands.generic.double.tooSmall", d3, n2);
            }
            if (d3 > (double)n3) {
                throw new cd("commands.generic.double.tooBig", d3, n3);
            }
        }
        return d3;
    }

    public static abs f(ac ac2, String string) {
        abs abs2 = (abs)abs.e.a(string);
        if (abs2 == null) {
            try {
                abs abs3 = abs.d(Integer.parseInt(string));
                if (abs3 != null) {
                    fi fi2 = new fi("commands.generic.deprecatedId", abs.e.c(abs3));
                    fi2.b().a(a.h);
                    ac2.a(fi2);
                }
                abs2 = abs3;
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        if (abs2 == null) {
            throw new cd("commands.give.notFound", string);
        }
        return abs2;
    }

    public static ahz g(ac ac2, String string) {
        if (ahz.c.b(string)) {
            return (ahz)ahz.c.a(string);
        }
        try {
            int n2 = Integer.parseInt(string);
            if (ahz.c.b(n2)) {
                ahz ahz2 = ahz.e(n2);
                fi fi2 = new fi("commands.generic.deprecatedId", ahz.c.c(ahz2));
                fi2.b().a(a.h);
                ac2.a(fi2);
                return ahz2;
            }
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        throw new cd("commands.give.notFound", string);
    }

    public static String a(Object[] objectArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            String string = objectArray[i2].toString();
            if (i2 > 0) {
                if (i2 == objectArray.length - 1) {
                    stringBuilder.append(" and ");
                } else {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static fa a(fa[] faArray) {
        fh fh2 = new fh("");
        for (int i2 = 0; i2 < faArray.length; ++i2) {
            if (i2 > 0) {
                if (i2 == faArray.length - 1) {
                    fh2.a(" and ");
                } else if (i2 > 0) {
                    fh2.a(", ");
                }
            }
            fh2.a(faArray[i2]);
        }
        return fh2;
    }

    public static String a(Collection collection) {
        return y.a(collection.toArray(new String[collection.size()]));
    }

    public static boolean a(String string, String string2) {
        return string2.regionMatches(true, 0, string, 0, string.length());
    }

    public static List a(String[] stringArray, String ... stringArray2) {
        String string = stringArray[stringArray.length - 1];
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string2 : stringArray2) {
            if (!y.a(string, string2)) continue;
            arrayList.add(string2);
        }
        return arrayList;
    }

    public static List a(String[] stringArray, Iterable iterable) {
        String string = stringArray[stringArray.length - 1];
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string2 : iterable) {
            if (!y.a(string, string2)) continue;
            arrayList.add(string2);
        }
        return arrayList;
    }

    @Override
    public boolean a(String[] stringArray, int n2) {
        return false;
    }

    public static void a(ac ac2, String string, Object ... objectArray) {
        y.a(ac2, 0, string, objectArray);
    }

    public static void a(ac ac2, int n2, String string, Object ... objectArray) {
        if (a != null) {
            a.a(ac2, n2, string, objectArray);
        }
    }

    public static void a(x x2) {
        a = x2;
    }

    public int a(aa aa2) {
        return this.c().compareTo(aa2.c());
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((aa)object);
    }
}

