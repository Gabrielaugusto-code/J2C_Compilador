/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class agp {
    private final ags a;
    private long b;
    private ou c = new ou();
    private List d = new ArrayList();

    public agp(ags ags2) {
        this.a = ags2;
    }

    public agq a(int n2, int n3) {
        long l2 = (long)(n2 >>= 4) & 0xFFFFFFFFL | ((long)(n3 >>= 4) & 0xFFFFFFFFL) << 32;
        agq agq2 = (agq)this.c.a(l2);
        if (agq2 == null) {
            agq2 = new agq(this, n2, n3);
            this.c.a(l2, agq2);
            this.d.add(agq2);
        }
        agq2.e = MinecraftServer.ap();
        return agq2;
    }

    public agl b(int n2, int n3) {
        return this.a(n2, n3).a(n2, n3);
    }

    public void a() {
        long l2 = MinecraftServer.ap();
        long l3 = l2 - this.b;
        if (l3 > 7500L || l3 < 0L) {
            this.b = l2;
            for (int i2 = 0; i2 < this.d.size(); ++i2) {
                agq agq2 = (agq)this.d.get(i2);
                long l4 = l2 - agq2.e;
                if (l4 <= 30000L && l4 >= 0L) continue;
                this.d.remove(i2--);
                long l5 = (long)agq2.c & 0xFFFFFFFFL | ((long)agq2.d & 0xFFFFFFFFL) << 32;
                this.c.d(l5);
            }
        }
    }

    public agl[] d(int n2, int n3) {
        return this.a((int)n2, (int)n3).b;
    }

    static /* synthetic */ ags a(agp agp2) {
        return agp2.a;
    }
}

