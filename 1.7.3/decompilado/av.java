/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class av
extends y {
    @Override
    public String c() {
        return "kick";
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public String c(ac ac2) {
        return "commands.kick.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length > 0 && stringArray[0].length() > 1) {
            mp mp2 = MinecraftServer.G().af().e(stringArray[0]);
            String string = "Kicked by an operator.";
            boolean bl2 = false;
            if (mp2 == null) {
                throw new cf();
            }
            if (stringArray.length >= 2) {
                string = av.a(ac2, stringArray, 1).c();
                bl2 = true;
            }
            mp2.a.c(string);
            if (bl2) {
                av.a(ac2, "commands.kick.success.reason", mp2.b_(), string);
            } else {
                av.a(ac2, "commands.kick.success", mp2.b_());
            }
            return;
        }
        throw new ch("commands.kick.usage", new Object[0]);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length >= 1) {
            return av.a(stringArray, MinecraftServer.G().D());
        }
        return null;
    }
}

