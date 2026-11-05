/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonIOException
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonSyntaxException
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bvy
extends bvw {
    public List a;

    public static bvy a(String string) {
        bvy bvy2 = new bvy();
        bvy2.a = new ArrayList();
        try {
            JsonParser jsonParser = new JsonParser();
            JsonObject jsonObject = jsonParser.parse(string).getAsJsonObject();
            if (jsonObject.get("templates").isJsonArray()) {
                Iterator iterator = jsonObject.get("templates").getAsJsonArray().iterator();
                while (iterator.hasNext()) {
                    bvy2.a.add(bvx.a(((JsonElement)iterator.next()).getAsJsonObject()));
                }
            }
        }
        catch (JsonIOException jsonIOException) {
        }
        catch (JsonSyntaxException jsonSyntaxException) {
            // empty catch block
        }
        return bvy2;
    }
}

