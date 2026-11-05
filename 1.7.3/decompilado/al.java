/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public class al
extends ar {
    @Override
    public String c() {
        return "defaultgamemode";
    }

    @Override
    public String c(ac ac2) {
        return "commands.defaultgamemode.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length > 0) {
            agb agb2 = this.h(ac2, stringArray[0]);
            this.a(agb2);
            al.a(ac2, "commands.defaultgamemode.success", new fi("gameMode." + agb2.b(), new Object[0]));
            return;
        }
        throw new ch("commands.defaultgamemode.usage", new Object[0]);
    }

    protected void a(agb agb2) {
        MinecraftServer minecraftServer = MinecraftServer.G();
        minecraftServer.a(agb2);
        if (minecraftServer.an()) {
            for (mp mp2 : MinecraftServer.G().af().a) {
                mp2.a(agb2);
                mp2.R = 0.0f;
            }
        }
    }
}

