/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.mojang.authlib.GameProfile
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;

public class ju
implements JsonDeserializer,
JsonSerializer {
    public jt a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonArray jsonArray;
        JsonObject jsonObject = ol.l(jsonElement, "players");
        jt jt2 = new jt(ol.m(jsonObject, "max"), ol.m(jsonObject, "online"));
        if (ol.d(jsonObject, "sample") && (jsonArray = ol.t(jsonObject, "sample")).size() > 0) {
            GameProfile[] gameProfileArray = new GameProfile[jsonArray.size()];
            for (int i2 = 0; i2 < gameProfileArray.length; ++i2) {
                JsonObject jsonObject2 = ol.l(jsonArray.get(i2), "player[" + i2 + "]");
                gameProfileArray[i2] = new GameProfile(ol.h(jsonObject2, "id"), ol.h(jsonObject2, "name"));
            }
            jt2.a(gameProfileArray);
        }
        return jt2;
    }

    public JsonElement a(jt jt2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("max", (Number)jt2.a());
        jsonObject.addProperty("online", (Number)jt2.b());
        if (jt2.c() != null && jt2.c().length > 0) {
            JsonArray jsonArray = new JsonArray();
            for (int i2 = 0; i2 < jt2.c().length; ++i2) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("id", jt2.c()[i2].getId());
                jsonObject2.addProperty("name", jt2.c()[i2].getName());
                jsonArray.add((JsonElement)jsonObject2);
            }
            jsonObject.add("sample", (JsonElement)jsonArray);
        }
        return jsonObject;
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((jt)object, type, jsonSerializationContext);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}

