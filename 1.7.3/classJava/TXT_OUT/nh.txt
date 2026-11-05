/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import java.math.BigInteger;

class nh
extends Thread {
    final /* synthetic */ ng a;

    nh(ng ng2, String string) {
        this.a = ng2;
        super(string);
    }

    @Override
    public void run() {
        try {
            String string = new BigInteger(ok.a(ng.a(this.a), ng.b(this.a).I().getPublic(), ng.c(this.a))).toString(16);
            ng.a(this.a, ng.b(this.a).as().hasJoinedServer(new GameProfile(null, ng.d(this.a).getName()), string));
            if (ng.d(this.a) != null) {
                ng.e().info("UUID of player " + ng.d(this.a).getName() + " is " + ng.d(this.a).getId());
                ng.a(this.a, ni.d);
            } else {
                this.a.a("Failed to verify username!");
                ng.e().error("Username '" + ng.d(this.a).getName() + "' tried to join with an invalid session");
            }
        }
        catch (AuthenticationUnavailableException authenticationUnavailableException) {
            this.a.a("Authentication servers are down. Please try again later, sorry!");
            ng.e().error("Couldn't verify username because servers are unavailable");
        }
    }
}

