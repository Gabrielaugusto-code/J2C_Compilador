/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonIOException
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonSyntaxException
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bvr
extends bvw {
    public List a;

    public static bvr a(String string) {
        bvr bvr2 = new bvr();
        bvr2.a = new ArrayList();
        try {
            JsonParser jsonParser = new JsonParser();
            JsonObject jsonObject = jsonParser.parse(string).getAsJsonObject();
            if (jsonObject.get("servers").isJsonArray()) {
                JsonArray jsonArray = jsonObject.get("servers").getAsJsonArray();
                Iterator iterator = jsonArray.iterator();
                while (iterator.hasNext()) {
                    bvr2.a.add(bvo.a(((JsonElement)iterator.next()).getAsJsonObject()));
                }
            }
        }
        catch (JsonIOException jsonIOException) {
        }
        catch (JsonSyntaxException jsonSyntaxException) {
            // empty catch block
        }
        return bvr2;
    }
}

