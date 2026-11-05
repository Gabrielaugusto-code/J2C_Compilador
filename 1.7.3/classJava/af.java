/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.server.MinecraftServer;

public class af
extends y {
    public static final Pattern a = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

    @Override
    public String c() {
        return "ban-ip";
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
        return "commands.banip.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length >= 1 && stringArray[0].length() > 1) {
            Matcher matcher = a.matcher(stringArray[0]);
            fa fa2 = null;
            if (stringArray.length >= 2) {
                fa2 = af.a(ac2, stringArray, 1);
            }
            if (matcher.matches()) {
                this.a(ac2, stringArray[0], fa2 == null ? null : fa2.c());
            } else {
                mp mp2 = MinecraftServer.G().af().e(stringArray[0]);
                if (mp2 == null) {
                    throw new cf("commands.banip.invalid", new Object[0]);
                }
                this.a(ac2, mp2.s(), fa2 == null ? null : fa2.c());
            }
            return;
        }
        throw new ch("commands.banip.usage", new Object[0]);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return af.a(stringArray, MinecraftServer.G().D());
        }
        return null;
    }

    protected void a(ac ac2, String string, String string2) {
        kc kc2 = new kc(string);
        kc2.a(ac2.b_());
        if (string2 != null) {
            kc2.b(string2);
        }
        MinecraftServer.G().af().f().a(kc2);
        List list = MinecraftServer.G().af().h(string);
        Object[] objectArray = new String[list.size()];
        int n2 = 0;
        for (mp mp2 : list) {
            mp2.a.c("You have been IP banned.");
            objectArray[n2++] = mp2.b_();
        }
        if (list.isEmpty()) {
            af.a(ac2, "commands.banip.success", string);
        } else {
            af.a(ac2, "commands.banip.success.players", string, af.a(objectArray));
        }
    }
}

