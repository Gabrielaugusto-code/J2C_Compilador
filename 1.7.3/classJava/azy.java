/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import net.minecraft.client.ClientBrandRetriever;

class azy
implements Callable {
    final /* synthetic */ azi a;

    azy(azi azi2) {
        this.a = azi2;
    }

    public String a() {
        String string = ClientBrandRetriever.getClientModName();
        if (!string.equals("vanilla")) {
            return "Definitely; Client brand changed to '" + string + "'";
        }
        if (azi.class.getSigners() == null) {
            return "Very likely; Jar signature invalidated";
        }
        return "Probably not. Jar signature remains and client brand is untouched.";
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

