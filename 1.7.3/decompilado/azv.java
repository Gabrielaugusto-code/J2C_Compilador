/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.Sys
 */
import java.util.concurrent.Callable;
import org.lwjgl.Sys;

class azv
implements Callable {
    final /* synthetic */ azi a;

    azv(azi azi2) {
        this.a = azi2;
    }

    public String a() {
        return Sys.getVersion();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

