/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class aj
extends y {
    @Override
    public String c() {
        return "deop";
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public String c(ac ac2) {
        return "commands.deop.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length == 1 && stringArray[0].length() > 0) {
            MinecraftServer.G().af().b(stringArray[0]);
            aj.a(ac2, "commands.deop.success", stringArray[0]);
            return;
        }
        throw new ch("commands.deop.usage", new Object[0]);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return aj.a(stringArray, MinecraftServer.G().af().i());
        }
        return null;
    }
}

