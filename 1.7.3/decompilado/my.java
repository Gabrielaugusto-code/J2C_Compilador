/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class my
implements Callable {
    final /* synthetic */ ef a;
    final /* synthetic */ mv b;

    my(mv mv2, ef ef2) {
        this.b = mv2;
        this.a = ef2;
    }

    public String a() {
        return ((Object)((Object)this.a)).toString();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

