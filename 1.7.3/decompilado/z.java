/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class z
implements ab {
    private static final Logger a = LogManager.getLogger();
    private final Map b = new HashMap();
    private final Set c = new HashSet();

    @Override
    public int a(ac ac2, String string) {
        if ((string = string.trim()).startsWith("/")) {
            string = string.substring(1);
        }
        String[] stringArray = string.split(" ");
        String string2 = stringArray[0];
        stringArray = z.a(stringArray);
        aa aa2 = (aa)this.b.get(string2);
        int n2 = this.a(aa2, stringArray);
        int n3 = 0;
        try {
            if (aa2 == null) {
                throw new cg();
            }
            if (aa2.a(ac2)) {
                if (n2 > -1) {
                    mp[] mpArray = ad.c(ac2, stringArray[n2]);
                    String string3 = stringArray[n2];
                    for (mp mp2 : mpArray) {
                        stringArray[n2] = mp2.b_();
                        try {
                            aa2.b(ac2, stringArray);
                            ++n3;
                        }
                        catch (cc cc2) {
                            fi fi2 = new fi(cc2.getMessage(), cc2.a());
                            fi2.b().a(a.m);
                            ac2.a(fi2);
                        }
                    }
                    stringArray[n2] = string3;
                } else {
                    aa2.b(ac2, stringArray);
                    ++n3;
                }
            } else {
                fi fi3 = new fi("commands.generic.permission", new Object[0]);
                fi3.b().a(a.m);
                ac2.a(fi3);
            }
        }
        catch (ch ch2) {
            fi fi4 = new fi("commands.generic.usage", new fi(ch2.getMessage(), ch2.a()));
            fi4.b().a(a.m);
            ac2.a(fi4);
        }
        catch (cc cc3) {
            fi fi5 = new fi(cc3.getMessage(), cc3.a());
            fi5.b().a(a.m);
            ac2.a(fi5);
        }
        catch (Throwable throwable) {
            fi fi6 = new fi("commands.generic.exception", new Object[0]);
            fi6.b().a(a.m);
            ac2.a(fi6);
            a.error("Couldn't process command", throwable);
        }
        return n3;
    }

    public aa a(aa aa2) {
        List list = aa2.b();
        this.b.put(aa2.c(), aa2);
        this.c.add(aa2);
        if (list != null) {
            for (String string : list) {
                aa aa3 = (aa)this.b.get(string);
                if (aa3 != null && aa3.c().equals(string)) continue;
                this.b.put(string, aa2);
            }
        }
        return aa2;
    }

    private static String[] a(String[] stringArray) {
        String[] stringArray2 = new String[stringArray.length - 1];
        for (int i2 = 1; i2 < stringArray.length; ++i2) {
            stringArray2[i2 - 1] = stringArray[i2];
        }
        return stringArray2;
    }

    @Override
    public List b(ac ac2, String string) {
        aa aa2;
        String[] stringArray = string.split(" ", -1);
        String string2 = stringArray[0];
        if (stringArray.length == 1) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : this.b.entrySet()) {
                if (!y.a(string2, (String)entry.getKey()) || !((aa)entry.getValue()).a(ac2)) continue;
                arrayList.add(entry.getKey());
            }
            return arrayList;
        }
        if (stringArray.length > 1 && (aa2 = (aa)this.b.get(string2)) != null) {
            return aa2.a(ac2, z.a(stringArray));
        }
        return null;
    }

    @Override
    public List a(ac ac2) {
        ArrayList<aa> arrayList = new ArrayList<aa>();
        for (aa aa2 : this.c) {
            if (!aa2.a(ac2)) continue;
            arrayList.add(aa2);
        }
        return arrayList;
    }

    @Override
    public Map a() {
        return this.b;
    }

    private int a(aa aa2, String[] stringArray) {
        if (aa2 == null) {
            return -1;
        }
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            if (!aa2.a(stringArray, i2) || !ad.a(stringArray[i2])) continue;
            return i2;
        }
        return -1;
    }
}

