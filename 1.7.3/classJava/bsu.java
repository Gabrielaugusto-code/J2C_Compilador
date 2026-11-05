/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class bsu
extends bsg
implements JsonSerializer {
    public bst a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        fa fa2 = (fa)jsonDeserializationContext.deserialize(jsonObject.get("description"), fa.class);
        int n2 = ol.m(jsonObject, "pack_format");
        return new bst(fa2, n2);
    }

    public JsonElement a(bst bst2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pack_format", (Number)bst2.b());
        jsonObject.add("description", jsonSerializationContext.serialize((Object)bst2.a()));
        return jsonObject;
    }

    @Override
    public String a() {
        return "pack";
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((bst)object, type, jsonSerializationContext);
    }
}

