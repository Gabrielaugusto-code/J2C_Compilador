/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class aq
extends y {
    @Override
    public String c() {
        return "difficulty";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.difficulty.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length > 0) {
            pu pu2 = this.h(ac2, stringArray[0]);
            MinecraftServer.G().a(pu2);
            aq.a(ac2, "commands.difficulty.success", new fi(pu2.b(), new Object[0]));
            return;
        }
        throw new ch("commands.difficulty.usage", new Object[0]);
    }

    protected pu h(ac ac2, String string) {
        if (string.equalsIgnoreCase("peaceful") || string.equalsIgnoreCase("p")) {
            return pu.a;
        }
        if (string.equalsIgnoreCase("easy") || string.equalsIgnoreCase("e")) {
            return pu.b;
        }
        if (string.equalsIgnoreCase("normal") || string.equalsIgnoreCase("n")) {
            return pu.c;
        }
        if (string.equalsIgnoreCase("hard") || string.equalsIgnoreCase("h")) {
            return pu.d;
        }
        return pu.a(aq.a(ac2, string, 0, 3));
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return aq.a(stringArray, "peaceful", "easy", "normal", "hard");
        }
        return null;
    }
}

