/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 *  com.mojang.authlib.exceptions.InvalidCredentialsException
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.math.BigInteger;
import java.security.PublicKey;
import java.util.UUID;
import javax.crypto.SecretKey;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bju
implements ji {
    private static final Logger a = LogManager.getLogger();
    private final azi b;
    private final bcl c;
    private final ef d;

    public bju(ef ef2, azi azi2, bcl bcl2) {
        this.d = ef2;
        this.b = azi2;
        this.c = bcl2;
    }

    @Override
    public void a(jk jk2) {
        SecretKey secretKey = ok.a();
        String string = jk2.c();
        PublicKey publicKey = jk2.d();
        String string2 = new BigInteger(ok.a(string, publicKey, secretKey)).toString(16);
        try {
            this.c().joinServer(this.b.M().e(), this.b.M().d(), string2);
        }
        catch (AuthenticationUnavailableException authenticationUnavailableException) {
            this.d.a(new fi("disconnect.loginFailedInfo", new fi("disconnect.loginFailedInfo.serversUnavailable", new Object[0])));
            return;
        }
        catch (InvalidCredentialsException invalidCredentialsException) {
            this.d.a(new fi("disconnect.loginFailedInfo", new fi("disconnect.loginFailedInfo.invalidSession", new Object[0])));
            return;
        }
        catch (AuthenticationException authenticationException) {
            this.d.a(new fi("disconnect.loginFailedInfo", authenticationException.getMessage()));
            return;
        }
        this.d.a(new jo(secretKey, publicKey, jk2.e()), new bjv(this, secretKey));
    }

    private MinecraftSessionService c() {
        return new YggdrasilAuthenticationService(this.b.O(), UUID.randomUUID().toString()).createMinecraftSessionService();
    }

    @Override
    public void a(jj jj2) {
        this.d.a(ek.b);
    }

    @Override
    public void a(fa fa2) {
        this.b.a(new bbu(this.c, "connect.failed", fa2));
    }

    @Override
    public void a(ek ek2, ek ek3) {
        a.debug("Switching protocol from " + (Object)((Object)ek2) + " to " + (Object)((Object)ek3));
        if (ek3 == ek.b) {
            this.d.a(new bjw(this.b, this.c, this.d));
        }
    }

    @Override
    public void a() {
    }

    @Override
    public void a(jl jl2) {
        this.d.a(jl2.c());
    }

    static /* synthetic */ ef a(bju bju2) {
        return bju2.d;
    }
}

