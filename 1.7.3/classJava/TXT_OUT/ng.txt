/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.mojang.authlib.GameProfile
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import io.netty.util.concurrent.GenericFutureListener;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ng
implements jm {
    private static final AtomicInteger b = new AtomicInteger(0);
    private static final Logger c = LogManager.getLogger();
    private static final Random d = new Random();
    private final byte[] e = new byte[4];
    private final MinecraftServer f;
    public final ef a;
    private ni g = ni.a;
    private int h;
    private GameProfile i;
    private String j = "";
    private SecretKey k;

    public ng(MinecraftServer minecraftServer, ef ef2) {
        this.f = minecraftServer;
        this.a = ef2;
        d.nextBytes(this.e);
    }

    @Override
    public void a() {
        if (this.g == ni.d) {
            this.c();
        }
        if (this.h++ == 600) {
            this.a("Took too long to log in");
        }
    }

    public void a(String string) {
        try {
            c.info("Disconnecting " + this.d() + ": " + string);
            fh fh2 = new fh(string);
            this.a.a(new jl(fh2), new GenericFutureListener[0]);
            this.a.a(fh2);
        }
        catch (Exception exception) {
            c.error("Error whilst disconnecting player", (Throwable)exception);
        }
    }

    public void c() {
        Object object;
        if (!this.i.isComplete()) {
            object = UUID.nameUUIDFromBytes(("OfflinePlayer:" + this.i.getName()).getBytes(Charsets.UTF_8));
            this.i = new GameProfile(((UUID)object).toString().replaceAll("-", ""), this.i.getName());
        }
        if ((object = this.f.af().a(this.a.b(), this.i)) != null) {
            this.a((String)object);
        } else {
            this.g = ni.e;
            this.a.a(new jj(this.i), new GenericFutureListener[0]);
            this.f.af().a(this.a, this.f.af().a(this.i));
        }
    }

    @Override
    public void a(fa fa2) {
        c.info(this.d() + " lost connection: " + fa2.c());
    }

    public String d() {
        if (this.i != null) {
            return this.i.toString() + " (" + this.a.b().toString() + ")";
        }
        return String.valueOf(this.a.b());
    }

    @Override
    public void a(ek ek2, ek ek3) {
        Validate.validState((this.g == ni.e || this.g == ni.a ? 1 : 0) != 0, (String)"Unexpected change in protocol", (Object[])new Object[0]);
        Validate.validState((ek3 == ek.b || ek3 == ek.d ? 1 : 0) != 0, (String)("Unexpected protocol " + (Object)((Object)ek3)), (Object[])new Object[0]);
    }

    @Override
    public void a(jn jn2) {
        Validate.validState((this.g == ni.a ? 1 : 0) != 0, (String)"Unexpected hello packet", (Object[])new Object[0]);
        this.i = jn2.c();
        if (this.f.W() && !this.a.c()) {
            this.g = ni.b;
            this.a.a(new jk(this.j, this.f.I().getPublic(), this.e), new GenericFutureListener[0]);
        } else {
            this.g = ni.d;
        }
    }

    @Override
    public void a(jo jo2) {
        Validate.validState((this.g == ni.b ? 1 : 0) != 0, (String)"Unexpected key packet", (Object[])new Object[0]);
        PrivateKey privateKey = this.f.I().getPrivate();
        if (!Arrays.equals(this.e, jo2.b(privateKey))) {
            throw new IllegalStateException("Invalid nonce!");
        }
        this.k = jo2.a(privateKey);
        this.g = ni.c;
        this.a.a(this.k);
        new nh(this, "User Authenticator #" + b.incrementAndGet()).start();
    }

    static /* synthetic */ String a(ng ng2) {
        return ng2.j;
    }

    static /* synthetic */ MinecraftServer b(ng ng2) {
        return ng2.f;
    }

    static /* synthetic */ SecretKey c(ng ng2) {
        return ng2.k;
    }

    static /* synthetic */ GameProfile a(ng ng2, GameProfile gameProfile) {
        ng2.i = gameProfile;
        return ng2.i;
    }

    static /* synthetic */ GameProfile d(ng ng2) {
        return ng2.i;
    }

    static /* synthetic */ Logger e() {
        return c;
    }

    static /* synthetic */ ni a(ng ng2, ni ni2) {
        ng2.g = ni2;
        return ng2.g;
    }
}

