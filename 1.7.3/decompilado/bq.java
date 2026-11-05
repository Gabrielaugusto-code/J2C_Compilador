/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import net.minecraft.server.MinecraftServer;

public class bq
extends y {
    @Override
    public String c() {
        return "spreadplayers";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.spreadplayers.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length < 6) {
            throw new ch("commands.spreadplayers.usage", new Object[0]);
        }
        int n2 = 0;
        double d2 = bq.a(ac2, Double.NaN, stringArray[n2++]);
        double d3 = bq.a(ac2, Double.NaN, stringArray[n2++]);
        double d4 = bq.a(ac2, stringArray[n2++], 0.0);
        double d5 = bq.a(ac2, stringArray[n2++], d4 + 1.0);
        boolean bl2 = bq.c(ac2, stringArray[n2++]);
        ArrayList arrayList = Lists.newArrayList();
        while (n2 < stringArray.length) {
            Object object;
            String string;
            if (ad.b(string = stringArray[n2++])) {
                object = ad.c(ac2, string);
                if (object != null && ((mp[])object).length != 0) {
                    Collections.addAll(arrayList, object);
                    continue;
                }
                throw new cf();
            }
            object = MinecraftServer.G().af().e(string);
            if (object != null) {
                arrayList.add(object);
                continue;
            }
            throw new cf();
        }
        if (arrayList.isEmpty()) {
            throw new cf();
        }
        ac2.a(new fi("commands.spreadplayers.spreading." + (bl2 ? "teams" : "players"), arrayList.size(), d5, d2, d3, d4));
        this.a(ac2, arrayList, new br(d2, d3), d4, d5, ((rm)arrayList.get((int)0)).o, bl2);
    }

    private void a(ac ac2, List list, br br2, double d2, double d3, afs afs2, boolean bl2) {
        Random random = new Random();
        double d4 = br2.a - d3;
        double d5 = br2.b - d3;
        double d6 = br2.a + d3;
        double d7 = br2.b + d3;
        br[] brArray = this.a(random, bl2 ? this.a(list) : list.size(), d4, d5, d6, d7);
        int n2 = this.a(br2, d2, afs2, random, d4, d5, d6, d7, brArray, bl2);
        double d8 = this.a(list, afs2, brArray, bl2);
        bq.a(ac2, "commands.spreadplayers.success." + (bl2 ? "teams" : "players"), brArray.length, br2.a, br2.b);
        if (brArray.length > 1) {
            ac2.a(new fi("commands.spreadplayers.info." + (bl2 ? "teams" : "players"), String.format("%.2f", d8), n2));
        }
    }

    private int a(List list) {
        HashSet hashSet = Sets.newHashSet();
        for (rm rm2 : list) {
            if (rm2 instanceof xq) {
                hashSet.add(rm2.bs());
                continue;
            }
            hashSet.add(null);
        }
        return hashSet.size();
    }

    private int a(br br2, double d2, afs afs2, Random random, double d3, double d4, double d5, double d6, br[] brArray, boolean bl2) {
        int n2;
        boolean bl3 = true;
        double d7 = 3.4028234663852886E38;
        for (n2 = 0; n2 < 10000 && bl3; ++n2) {
            bl3 = false;
            d7 = 3.4028234663852886E38;
            for (int i2 = 0; i2 < brArray.length; ++i2) {
                br br3 = brArray[i2];
                int n3 = 0;
                br br4 = new br();
                for (int i3 = 0; i3 < brArray.length; ++i3) {
                    if (i2 == i3) continue;
                    br br5 = brArray[i3];
                    double d8 = br3.a(br5);
                    d7 = Math.min(d8, d7);
                    if (!(d8 < d2)) continue;
                    ++n3;
                    br4.a += br5.a - br3.a;
                    br4.b += br5.b - br3.b;
                }
                if (n3 > 0) {
                    br4.a /= (double)n3;
                    br4.b /= (double)n3;
                    double d9 = br4.b();
                    if (d9 > 0.0) {
                        br4.a();
                        br3.b(br4);
                    } else {
                        br3.a(random, d3, d4, d5, d6);
                    }
                    bl3 = true;
                }
                if (!br3.a(d3, d4, d5, d6)) continue;
                bl3 = true;
            }
            if (bl3) continue;
            for (br br4 : brArray) {
                if (br4.b(afs2)) continue;
                br4.a(random, d3, d4, d5, d6);
                bl3 = true;
            }
        }
        if (n2 >= 10000) {
            throw new cc("commands.spreadplayers.failure." + (bl2 ? "teams" : "players"), brArray.length, br2.a, br2.b, String.format("%.2f", d7));
        }
        return n2;
    }

    private double a(List list, afs afs2, br[] brArray, boolean bl2) {
        double d2 = 0.0;
        int n2 = 0;
        HashMap hashMap = Maps.newHashMap();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            br br2;
            rm rm2 = (rm)list.get(i2);
            if (bl2) {
                ayy ayy2;
                ayy ayy3 = ayy2 = rm2 instanceof xq ? rm2.bs() : null;
                if (!hashMap.containsKey(ayy2)) {
                    hashMap.put(ayy2, brArray[n2++]);
                }
                br2 = (br)hashMap.get(ayy2);
            } else {
                br2 = brArray[n2++];
            }
            rm2.a((double)((float)oy.c(br2.a) + 0.5f), (double)br2.a(afs2), (double)oy.c(br2.b) + 0.5);
            double d3 = Double.MAX_VALUE;
            for (int i3 = 0; i3 < brArray.length; ++i3) {
                if (br2 == brArray[i3]) continue;
                double d4 = br2.a(brArray[i3]);
                d3 = Math.min(d4, d3);
            }
            d2 += d3;
        }
        return d2 /= (double)list.size();
    }

    private br[] a(Random random, int n2, double d2, double d3, double d4, double d5) {
        br[] brArray = new br[n2];
        for (int i2 = 0; i2 < brArray.length; ++i2) {
            br br2 = new br();
            br2.a(random, d2, d3, d4, d5);
            brArray[i2] = br2;
        }
        return brArray;
    }
}

