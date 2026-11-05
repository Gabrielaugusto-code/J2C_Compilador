/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;
import net.minecraft.server.MinecraftServer;

public class ca
extends y {
    @Override
    public String c() {
        return "weather";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.weather.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length < 1 || stringArray.length > 2) {
            throw new ch("commands.weather.usage", new Object[0]);
        }
        int n2 = (300 + new Random().nextInt(600)) * 20;
        if (stringArray.length >= 2) {
            n2 = ca.a(ac2, stringArray[1], 1, 1000000) * 20;
        }
        mm mm2 = MinecraftServer.G().b[0];
        axj axj2 = mm2.N();
        if ("clear".equalsIgnoreCase(stringArray[0])) {
            axj2.g(0);
            axj2.f(0);
            axj2.b(false);
            axj2.a(false);
            ca.a(ac2, "commands.weather.clear", new Object[0]);
        } else if ("rain".equalsIgnoreCase(stringArray[0])) {
            axj2.g(n2);
            axj2.b(true);
            axj2.a(false);
            ca.a(ac2, "commands.weather.rain", new Object[0]);
        } else if ("thunder".equalsIgnoreCase(stringArray[0])) {
            axj2.g(n2);
            axj2.f(n2);
            axj2.b(true);
            axj2.a(true);
            ca.a(ac2, "commands.weather.thunder", new Object[0]);
        } else {
            throw new ch("commands.weather.usage", new Object[0]);
        }
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return ca.a(stringArray, "clear", "rain", "thunder");
        }
        return null;
    }
}

