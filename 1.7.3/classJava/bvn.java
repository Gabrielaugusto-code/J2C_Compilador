/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonIOException
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonSyntaxException
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bvn {
    public List a;

    public static bvn a(String string) {
        JsonParser jsonParser = new JsonParser();
        bvn bvn2 = new bvn();
        bvn2.a = new ArrayList();
        try {
            JsonElement jsonElement = jsonParser.parse(string).getAsJsonObject().get("backups");
            if (jsonElement.isJsonArray()) {
                Iterator iterator = jsonElement.getAsJsonArray().iterator();
                while (iterator.hasNext()) {
                    bvn2.a.add(bvm.a((JsonElement)iterator.next()));
                }
            }
        }
        catch (JsonIOException jsonIOException) {
        }
        catch (JsonSyntaxException jsonSyntaxException) {
            // empty catch block
        }
        return bvn2;
    }
}

