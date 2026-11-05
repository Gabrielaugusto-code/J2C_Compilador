/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.Validate;

public class mt
implements jh {
    private final MinecraftServer a;
    private final ef b;

    public mt(MinecraftServer minecraftServer, ef ef2) {
        this.a = minecraftServer;
        this.b = ef2;
    }

    @Override
    public void a(jg jg2) {
        this.b.a(jg2.c());
    }

    @Override
    public void a(fa fa2) {
    }

    @Override
    public void a(ek ek2, ek ek3) {
        Validate.validState((ek3 == ek.d || ek3 == ek.c ? 1 : 0) != 0, (String)("Unexpected protocol " + (Object)((Object)ek3)), (Object[])new Object[0]);
        switch (ek3) {
            case d: {
                this.b.a(new ng(this.a, this.b));
                break;
            }
            case c: {
                throw new UnsupportedOperationException("NYI");
            }
        }
    }

    @Override
    public void a() {
    }
}

