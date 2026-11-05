/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 *  org.apache.commons.lang3.exception.ExceptionUtils
 */
import com.google.gson.JsonParseException;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class ba
extends y {
    @Override
    public String c() {
        return "tellraw";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.tellraw.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length < 2) {
            throw new ch("commands.tellraw.usage", new Object[0]);
        }
        mp mp2 = ba.d(ac2, stringArray[0]);
        String string = ba.b(ac2, stringArray, 1);
        try {
            fa fa2 = fb.a(string);
            mp2.a(fa2);
        }
        catch (JsonParseException jsonParseException) {
            throw new ce("commands.tellraw.jsonException", ExceptionUtils.getRootCause((Throwable)jsonParseException).getMessage());
        }
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return ba.a(stringArray, MinecraftServer.G().D());
        }
        return null;
    }

    @Override
    public boolean a(String[] stringArray, int n2) {
        return n2 == 0;
    }
}

