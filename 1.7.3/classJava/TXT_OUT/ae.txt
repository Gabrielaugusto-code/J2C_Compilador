/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ae
extends y {
    @Override
    public String c() {
        return "achievement";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.achievement.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length >= 2) {
            ny ny2 = og.a(stringArray[1]);
            if (ny2 == null && !stringArray[1].equals("*")) {
                throw new cc("commands.achievement.unknownAchievement", stringArray[1]);
            }
            mp mp2 = stringArray.length >= 3 ? ae.d(ac2, stringArray[2]) : ae.b(ac2);
            if (stringArray[0].equalsIgnoreCase("give")) {
                if (ny2 == null) {
                    for (ns ns2 : nt.e) {
                        mp2.a(ns2);
                    }
                    ae.a(ac2, "commands.achievement.give.success.all", mp2.b_());
                } else {
                    if (ny2 instanceof ns) {
                        ns ns3 = (ns)ny2;
                        ArrayList arrayList = Lists.newArrayList();
                        while (ns3.c != null && !mp2.w().a(ns3.c)) {
                            arrayList.add(ns3.c);
                            ns3 = ns3.c;
                        }
                        for (ns ns4 : Lists.reverse((List)arrayList)) {
                            mp2.a(ns4);
                        }
                    }
                    mp2.a(ny2);
                    ae.a(ac2, "commands.achievement.give.success.one", mp2.b_(), ny2.j());
                }
                return;
            }
        }
        throw new ch("commands.achievement.usage", new Object[0]);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return ae.a(stringArray, "give");
        }
        if (stringArray.length == 2) {
            ArrayList arrayList = Lists.newArrayList();
            for (ny ny2 : og.b) {
                arrayList.add(ny2.e);
            }
            return ae.a(stringArray, arrayList);
        }
        if (stringArray.length == 3) {
            return ae.a(stringArray, MinecraftServer.G().D());
        }
        return null;
    }

    @Override
    public boolean a(String[] stringArray, int n2) {
        return n2 == 2;
    }
}

