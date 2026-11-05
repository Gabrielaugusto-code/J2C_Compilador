/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class jv
implements JsonDeserializer,
JsonSerializer {
    public js a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = ol.l(jsonElement, "status");
        js js2 = new js();
        if (jsonObject.has("description")) {
            js2.a((fa)jsonDeserializationContext.deserialize(jsonObject.get("description"), fa.class));
        }
        if (jsonObject.has("players")) {
            js2.a((jt)jsonDeserializationContext.deserialize(jsonObject.get("players"), jt.class));
        }
        if (jsonObject.has("version")) {
            js2.a((jw)jsonDeserializationContext.deserialize(jsonObject.get("version"), jw.class));
        }
        if (jsonObject.has("favicon")) {
            js2.a(ol.h(jsonObject, "favicon"));
        }
        return js2;
    }

    public JsonElement a(js js2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        if (js2.a() != null) {
            jsonObject.add("description", jsonSerializationContext.serialize((Object)js2.a()));
        }
        if (js2.b() != null) {
            jsonObject.add("players", jsonSerializationContext.serialize((Object)js2.b()));
        }
        if (js2.c() != null) {
            jsonObject.add("version", jsonSerializationContext.serialize((Object)js2.c()));
        }
        if (js2.d() != null) {
            jsonObject.addProperty("favicon", js2.d());
        }
        return jsonObject;
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((js)object, type, jsonSerializationContext);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}

