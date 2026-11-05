/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.google.gson.TypeAdapterFactory
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapterFactory;
import java.lang.reflect.Type;
import java.util.Map;

public class fb
implements JsonDeserializer,
JsonSerializer {
    private static final Gson a;

    public fa a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonPrimitive()) {
            return new fh(jsonElement.getAsString());
        }
        if (jsonElement.isJsonObject()) {
            String string;
            ev ev2;
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            if (jsonObject.has("text")) {
                ev2 = new fh(jsonObject.get("text").getAsString());
            } else if (jsonObject.has("translate")) {
                string = jsonObject.get("translate").getAsString();
                if (jsonObject.has("with")) {
                    JsonArray jsonArray = jsonObject.getAsJsonArray("with");
                    Object[] objectArray = new Object[jsonArray.size()];
                    for (int i2 = 0; i2 < objectArray.length; ++i2) {
                        fh fh2;
                        objectArray[i2] = this.a(jsonArray.get(i2), type, jsonDeserializationContext);
                        if (!(objectArray[i2] instanceof fh) || !(fh2 = (fh)objectArray[i2]).b().g() || !fh2.a().isEmpty()) continue;
                        objectArray[i2] = fh2.g();
                    }
                    ev2 = new fi(string, objectArray);
                } else {
                    ev2 = new fi(string, new Object[0]);
                }
            } else {
                throw new JsonParseException("Don't know how to turn " + jsonElement.toString() + " into a Component");
            }
            if (jsonObject.has("extra")) {
                string = jsonObject.getAsJsonArray("extra");
                if (string.size() > 0) {
                    for (int i3 = 0; i3 < string.size(); ++i3) {
                        ev2.a(this.a(string.get(i3), type, jsonDeserializationContext));
                    }
                } else {
                    throw new JsonParseException("Unexpected empty array of components");
                }
            }
            ev2.a((fe)jsonDeserializationContext.deserialize(jsonElement, fe.class));
            return ev2;
        }
        if (jsonElement.isJsonArray()) {
            JsonArray jsonArray = jsonElement.getAsJsonArray();
            fa fa2 = null;
            for (JsonElement jsonElement2 : jsonArray) {
                fa fa3 = this.a(jsonElement2, jsonElement2.getClass(), jsonDeserializationContext);
                if (fa2 == null) {
                    fa2 = fa3;
                    continue;
                }
                fa2.a(fa3);
            }
            return fa2;
        }
        throw new JsonParseException("Don't know how to turn " + jsonElement.toString() + " into a Component");
    }

    private void a(fe fe2, JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
        JsonElement jsonElement = jsonSerializationContext.serialize((Object)fe2);
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject2 = (JsonObject)jsonElement;
            for (Map.Entry entry : jsonObject2.entrySet()) {
                jsonObject.add((String)entry.getKey(), (JsonElement)entry.getValue());
            }
        }
    }

    public JsonElement a(fa fa2, Type type, JsonSerializationContext jsonSerializationContext) {
        Object object;
        if (fa2 instanceof fh && fa2.b().g() && fa2.a().isEmpty()) {
            return new JsonPrimitive(((fh)fa2).g());
        }
        JsonObject jsonObject = new JsonObject();
        if (!fa2.b().g()) {
            this.a(fa2.b(), jsonObject, jsonSerializationContext);
        }
        if (!fa2.a().isEmpty()) {
            object = new JsonArray();
            for (Object[] objectArray : fa2.a()) {
                object.add(this.a((fa)objectArray, objectArray.getClass(), jsonSerializationContext));
            }
            jsonObject.add("extra", (JsonElement)object);
        }
        if (fa2 instanceof fh) {
            jsonObject.addProperty("text", ((fh)fa2).g());
        } else if (fa2 instanceof fi) {
            object = (fi)fa2;
            jsonObject.addProperty("translate", ((fi)object).i());
            if (((fi)object).j() != null && ((fi)object).j().length > 0) {
                JsonArray jsonArray = new JsonArray();
                for (Object object2 : ((fi)object).j()) {
                    if (object2 instanceof fa) {
                        jsonArray.add(this.a((fa)object2, object2.getClass(), jsonSerializationContext));
                        continue;
                    }
                    jsonArray.add((JsonElement)new JsonPrimitive(String.valueOf(object2)));
                }
                jsonObject.add("with", (JsonElement)jsonArray);
            }
        } else {
            throw new IllegalArgumentException("Don't know how to serialize " + fa2 + " as a Component");
        }
        return jsonObject;
    }

    public static String a(fa fa2) {
        return a.toJson((Object)fa2);
    }

    public static fa a(String string) {
        return (fa)a.fromJson(string, fa.class);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((fa)object, type, jsonSerializationContext);
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }

    static {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter(fa.class, (Object)new fb());
        gsonBuilder.registerTypeHierarchyAdapter(fe.class, (Object)new fg());
        gsonBuilder.registerTypeAdapterFactory((TypeAdapterFactory)new ow());
        a = gsonBuilder.create();
    }
}

