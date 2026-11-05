/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class at
extends y {
    @Override
    public String c() {
        return "give";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.give.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        Object object;
        if (stringArray.length < 2) {
            throw new ch("commands.give.usage", new Object[0]);
        }
        mp mp2 = at.d(ac2, stringArray[0]);
        abs abs2 = at.f(ac2, stringArray[1]);
        int n2 = 1;
        int n3 = 0;
        if (stringArray.length >= 3) {
            n2 = at.a(ac2, stringArray[2], 1, 64);
        }
        if (stringArray.length >= 4) {
            n3 = at.a(ac2, stringArray[3]);
        }
        abu abu2 = new abu(abs2, n2, n3);
        if (stringArray.length >= 5) {
            object = at.a(ac2, stringArray, 4).c();
            try {
                du du2 = dx.a((String)object);
                if (!(du2 instanceof dg)) {
                    at.a(ac2, "commands.give.tagError", "Not a valid tag");
                    return;
                }
                abu2.d((dg)du2);
            }
            catch (dw dw2) {
                at.a(ac2, "commands.give.tagError", dw2.getMessage());
                return;
            }
        }
        object = mp2.a(abu2, false);
        ((wb)object).b = 0;
        ((wb)object).a(mp2.b_());
        at.a(ac2, "commands.give.success", abu2.E(), n2, mp2.b_());
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return at.a(stringArray, this.d());
        }
        if (stringArray.length == 2) {
            return at.a(stringArray, abs.e.b());
        }
        return null;
    }

    protected String[] d() {
        return MinecraftServer.G().D();
    }

    @Override
    public boolean a(String[] stringArray, int n2) {
        return n2 == 0;
    }
}

