/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class axq
implements Callable {
    final /* synthetic */ axj a;

    axq(axj axj2) {
        this.a = axj2;
    }

    public String a() {
        String string = "Unknown?";
        try {
            switch (axj.j(this.a)) {
                case 19133: {
                    string = "Anvil";
                    break;
                }
                case 19132: {
                    string = "McRegion";
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return String.format("0x%05X - %s", axj.j(this.a), string);
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

