/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class cb
extends y {
    @Override
    public String c() {
        return "whitelist";
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public String c(ac ac2) {
        return "commands.whitelist.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length >= 1) {
            if (stringArray[0].equals("on")) {
                MinecraftServer.G().af().a(true);
                cb.a(ac2, "commands.whitelist.enabled", new Object[0]);
                return;
            }
            if (stringArray[0].equals("off")) {
                MinecraftServer.G().af().a(false);
                cb.a(ac2, "commands.whitelist.disabled", new Object[0]);
                return;
            }
            if (stringArray[0].equals("list")) {
                ac2.a(new fi("commands.whitelist.list", MinecraftServer.G().af().h().size(), MinecraftServer.G().af().m().length));
                Set set = MinecraftServer.G().af().h();
                ac2.a(new fh(cb.a(set.toArray(new String[set.size()]))));
                return;
            }
            if (stringArray[0].equals("add")) {
                if (stringArray.length < 2) {
                    throw new ch("commands.whitelist.add.usage", new Object[0]);
                }
                MinecraftServer.G().af().f(stringArray[1]);
                cb.a(ac2, "commands.whitelist.add.success", stringArray[1]);
                return;
            }
            if (stringArray[0].equals("remove")) {
                if (stringArray.length < 2) {
                    throw new ch("commands.whitelist.remove.usage", new Object[0]);
                }
                MinecraftServer.G().af().g(stringArray[1]);
                cb.a(ac2, "commands.whitelist.remove.success", stringArray[1]);
                return;
            }
            if (stringArray[0].equals("reload")) {
                MinecraftServer.G().af().j();
                cb.a(ac2, "commands.whitelist.reloaded", new Object[0]);
                return;
            }
        }
        throw new ch("commands.whitelist.usage", new Object[0]);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return cb.a(stringArray, "on", "off", "list", "add", "remove", "reload");
        }
        if (stringArray.length == 2) {
            if (stringArray[0].equals("add")) {
                String[] stringArray2 = MinecraftServer.G().af().m();
                ArrayList<String> arrayList = new ArrayList<String>();
                String string = stringArray[stringArray.length - 1];
                for (String string2 : stringArray2) {
                    if (!cb.a(string, string2) || MinecraftServer.G().af().h().contains(string2)) continue;
                    arrayList.add(string2);
                }
                return arrayList;
            }
            if (stringArray[0].equals("remove")) {
                return cb.a(stringArray, MinecraftServer.G().af().h());
            }
        }
        return null;
    }
}

