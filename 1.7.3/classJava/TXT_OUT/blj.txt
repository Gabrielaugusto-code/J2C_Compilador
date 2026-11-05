/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class blj
implements Callable {
    final /* synthetic */ int a;
    final /* synthetic */ blh b;

    blj(blh blh2, int n2) {
        this.b = blh2;
        this.a = n2;
    }

    public String a() {
        if (this.a == 0) {
            return "MISC_TEXTURE";
        }
        if (this.a == 1) {
            return "TERRAIN_TEXTURE";
        }
        if (this.a == 2) {
            return "ITEM_TEXTURE";
        }
        if (this.a == 3) {
            return "ENTITY_PARTICLE_TEXTURE";
        }
        return "Unknown - " + this.a;
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

