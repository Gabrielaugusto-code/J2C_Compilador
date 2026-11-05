/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonIOException
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonSyntaxException
 */
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class bvq
extends bvw {
    public String a;

    public static bvq a(String string) {
        JsonParser jsonParser = new JsonParser();
        bvq bvq2 = new bvq();
        try {
            JsonObject jsonObject = jsonParser.parse(string).getAsJsonObject();
            bvq2.a = jsonObject.get("address").getAsString();
        }
        catch (JsonIOException jsonIOException) {
        }
        catch (JsonSyntaxException jsonSyntaxException) {
            // empty catch block
        }
        return bvq2;
    }
}

