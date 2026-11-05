/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class bke
implements Callable {
    final /* synthetic */ bka a;

    bke(bka bka2) {
        this.a = bka2;
    }

    public String a() {
        return bka.c(this.a).H() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server";
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

