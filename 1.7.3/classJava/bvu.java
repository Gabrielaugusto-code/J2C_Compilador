/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class bvu {
    private String a;
    private String b;

    public static bvu a(String string) {
        bvu bvu2 = new bvu();
        try {
            JsonParser jsonParser = new JsonParser();
            JsonObject jsonObject = jsonParser.parse(string).getAsJsonObject();
            bvu2.a = jsonObject.get("statusMessage").isJsonNull() ? null : jsonObject.get("statusMessage").getAsString();
            bvu2.b = jsonObject.get("buyLink").isJsonNull() ? null : jsonObject.get("buyLink").getAsString();
        }
        catch (Exception exception) {
            // empty catch block
        }
        return bvu2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}

