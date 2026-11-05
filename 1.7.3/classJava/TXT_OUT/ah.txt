/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ah
extends y {
    @Override
    public String c() {
        return "say";
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public String c(ac ac2) {
        return "commands.say.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length > 0 && stringArray[0].length() > 0) {
            fa fa2 = ah.a(ac2, stringArray, 0, true);
            MinecraftServer.G().af().a(new fi("chat.type.announcement", ac2.b_(), fa2));
            return;
        }
        throw new ch("commands.say.usage", new Object[0]);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length >= 1) {
            return ah.a(stringArray, MinecraftServer.G().D());
        }
        return null;
    }
}

