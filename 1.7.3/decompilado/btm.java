/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;
import net.minecraft.client.ClientBrandRetriever;

class btm
implements Callable {
    final /* synthetic */ btk a;

    btm(btk btk2) {
        this.a = btk2;
    }

    public String a() {
        String string = ClientBrandRetriever.getClientModName();
        if (!string.equals("vanilla")) {
            return "Definitely; Client brand changed to '" + string + "'";
        }
        string = this.a.getServerModName();
        if (!string.equals("vanilla")) {
            return "Definitely; Server brand changed to '" + string + "'";
        }
        if (azi.class.getSigners() == null) {
            return "Very likely; Jar signature invalidated";
        }
        return "Probably not. Jar signature remains and both client + server brands are untouched.";
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

