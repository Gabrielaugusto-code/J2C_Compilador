/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.regex.Matcher;
import net.minecraft.server.MinecraftServer;

public class bc
extends y {
    @Override
    public String c() {
        return "pardon-ip";
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public boolean a(ac ac2) {
        return MinecraftServer.G().af().f().b() && super.a(ac2);
    }

    @Override
    public String c(ac ac2) {
        return "commands.unbanip.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length == 1 && stringArray[0].length() > 1) {
            Matcher matcher = af.a.matcher(stringArray[0]);
            if (matcher.matches()) {
                MinecraftServer.G().af().f().b(stringArray[0]);
                bc.a(ac2, "commands.unbanip.success", stringArray[0]);
                return;
            }
            throw new ce("commands.unbanip.invalid", new Object[0]);
        }
        throw new ch("commands.unbanip.usage", new Object[0]);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return bc.a(stringArray, MinecraftServer.G().af().f().c().keySet());
        }
        return null;
    }
}

