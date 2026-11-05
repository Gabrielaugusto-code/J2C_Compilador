/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class bb
extends y {
    @Override
    public String c() {
        return "op";
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public String c(ac ac2) {
        return "commands.op.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length == 1 && stringArray[0].length() > 0) {
            MinecraftServer.G().af().a(stringArray[0]);
            bb.a(ac2, "commands.op.success", stringArray[0]);
            return;
        }
        throw new ch("commands.op.usage", new Object[0]);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            String string = stringArray[stringArray.length - 1];
            ArrayList<String> arrayList = new ArrayList<String>();
            for (String string2 : MinecraftServer.G().D()) {
                if (MinecraftServer.G().af().d(string2) || !bb.a(string, string2)) continue;
                arrayList.add(string2);
            }
            return arrayList;
        }
        return null;
    }
}

