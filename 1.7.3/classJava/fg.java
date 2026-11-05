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

public class fg
implements JsonDeserializer,
JsonSerializer {
    public fe a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonObject()) {
            Object object;
            Enum enum_;
            JsonObject jsonObject;
            fe fe2 = new fe();
            JsonObject jsonObject2 = jsonElement.getAsJsonObject();
            if (jsonObject2.has("bold")) {
                fe.a(fe2, jsonObject2.get("bold").getAsBoolean());
            }
            if (jsonObject2.has("italic")) {
                fe.b(fe2, jsonObject2.get("italic").getAsBoolean());
            }
            if (jsonObject2.has("underlined")) {
                fe.c(fe2, jsonObject2.get("underlined").getAsBoolean());
            }
            if (jsonObject2.has("strikethrough")) {
                fe.d(fe2, jsonObject2.get("strikethrough").getAsBoolean());
            }
            if (jsonObject2.has("obfuscated")) {
                fe.e(fe2, jsonObject2.get("obfuscated").getAsBoolean());
            }
            if (jsonObject2.has("color")) {
                fe.a(fe2, (a)((Object)jsonDeserializationContext.deserialize(jsonObject2.get("color"), a.class)));
            }
            if (jsonObject2.has("clickEvent")) {
                jsonObject = jsonObject2.getAsJsonObject("clickEvent");
                enum_ = ez.a(jsonObject.getAsJsonPrimitive("action").getAsString());
                object = jsonObject.getAsJsonPrimitive("value").getAsString();
                if (enum_ != null && object != null && ((ez)enum_).a()) {
                    fe.a(fe2, new ey((ez)enum_, (String)object));
                }
            }
            if (jsonObject2.has("hoverEvent")) {
                jsonObject = jsonObject2.getAsJsonObject("hoverEvent");
                enum_ = fd.a(jsonObject.getAsJsonPrimitive("action").getAsString());
                object = (fa)jsonDeserializationContext.deserialize(jsonObject.get("value"), fa.class);
                if (enum_ != null && object != null && ((fd)enum_).a()) {
                    fe.a(fe2, new fc((fd)enum_, (fa)object));
                }
            }
            return fe2;
        }
        return null;
    }

    public JsonElement a(fe fe2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject;
        if (fe2.g()) {
            return null;
        }
        JsonObject jsonObject2 = new JsonObject();
        if (fe.b(fe2) != null) {
            jsonObject2.addProperty("bold", fe.b(fe2));
        }
        if (fe.c(fe2) != null) {
            jsonObject2.addProperty("italic", fe.c(fe2));
        }
        if (fe.d(fe2) != null) {
            jsonObject2.addProperty("underlined", fe.d(fe2));
        }
        if (fe.e(fe2) != null) {
            jsonObject2.addProperty("strikethrough", fe.e(fe2));
        }
        if (fe.f(fe2) != null) {
            jsonObject2.addProperty("obfuscated", fe.f(fe2));
        }
        if (fe.g(fe2) != null) {
            jsonObject2.add("color", jsonSerializationContext.serialize((Object)fe.g(fe2)));
        }
        if (fe.h(fe2) != null) {
            jsonObject = new JsonObject();
            jsonObject.addProperty("action", fe.h(fe2).a().b());
            jsonObject.addProperty("value", fe.h(fe2).b());
            jsonObject2.add("clickEvent", (JsonElement)jsonObject);
        }
        if (fe.i(fe2) != null) {
            jsonObject = new JsonObject();
            jsonObject.addProperty("action", fe.i(fe2).a().b());
            jsonObject.add("value", jsonSerializationContext.serialize((Object)fe.i(fe2).b()));
            jsonObject2.add("hoverEvent", (JsonElement)jsonObject);
        }
        return jsonObject2;
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((fe)object, type, jsonSerializationContext);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}

