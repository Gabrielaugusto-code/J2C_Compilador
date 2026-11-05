/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  tv.twitch.AuthToken
 */
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import tv.twitch.AuthToken;

class bvc
extends Thread {
    final /* synthetic */ String a;
    final /* synthetic */ bvb b;

    bvc(bvb bvb2, String string, String string2) {
        this.b = bvb2;
        this.a = string2;
        super(string);
    }

    @Override
    public void run() {
        try {
            URL uRL = new URL("https://api.twitch.tv/kraken?oauth_token=" + URLEncoder.encode(this.a, "UTF-8"));
            String string = om.a(uRL);
            JsonObject jsonObject = ol.l(new JsonParser().parse(string), "Response");
            JsonObject jsonObject2 = ol.s(jsonObject, "token");
            if (ol.i(jsonObject2, "valid")) {
                String string2 = ol.h(jsonObject2, "user_name");
                bvb.J().debug(bvb.a, "Authenticated with twitch; username is {}", new Object[]{string2});
                AuthToken authToken = new AuthToken();
                authToken.data = this.a;
                bvb.a(this.b).a(string2, authToken);
                bvb.b(this.b).c(string2);
                bvb.b(this.b).a(authToken);
                Runtime.getRuntime().addShutdownHook(new bvd(this, "Twitch shutdown hook"));
                bvb.a(this.b).A();
            } else {
                bvb.a(this.b, bva.b);
                bvb.J().error(bvb.a, "Given twitch access token is invalid");
            }
        }
        catch (IOException iOException) {
            bvb.a(this.b, bva.a);
            bvb.J().error(bvb.a, "Could not authenticate with twitch", (Throwable)iOException);
        }
    }
}

