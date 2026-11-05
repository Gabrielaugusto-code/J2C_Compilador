/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  org.apache.commons.lang3.Validate
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.apache.commons.lang3.Validate;

public class bso
extends bsg
implements JsonSerializer {
    public bsn a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        int n2;
        ArrayList arrayList = Lists.newArrayList();
        JsonObject jsonObject = ol.l(jsonElement, "metadata section");
        int n3 = ol.a(jsonObject, "frametime", 1);
        if (n3 != 1) {
            Validate.inclusiveBetween((Object)1, (Object)Integer.MAX_VALUE, (Comparable)Integer.valueOf(n3), (String)"Invalid default frame time", (Object[])new Object[0]);
        }
        if (jsonObject.has("frames")) {
            try {
                JsonArray jsonArray = ol.t(jsonObject, "frames");
                for (n2 = 0; n2 < jsonArray.size(); ++n2) {
                    JsonElement jsonElement2 = jsonArray.get(n2);
                    bsm bsm2 = this.a(n2, jsonElement2);
                    if (bsm2 == null) continue;
                    arrayList.add(bsm2);
                }
            }
            catch (ClassCastException classCastException) {
                throw new JsonParseException("Invalid animation->frames: expected array, was " + jsonObject.get("frames"), (Throwable)classCastException);
            }
        }
        int n4 = ol.a(jsonObject, "width", -1);
        n2 = ol.a(jsonObject, "height", -1);
        if (n4 != -1) {
            Validate.inclusiveBetween((Object)1, (Object)Integer.MAX_VALUE, (Comparable)Integer.valueOf(n4), (String)"Invalid width", (Object[])new Object[0]);
        }
        if (n2 != -1) {
            Validate.inclusiveBetween((Object)1, (Object)Integer.MAX_VALUE, (Comparable)Integer.valueOf(n2), (String)"Invalid height", (Object[])new Object[0]);
        }
        return new bsn(arrayList, n4, n2, n3);
    }

    private bsm a(int n2, JsonElement jsonElement) {
        if (jsonElement.isJsonPrimitive()) {
            return new bsm(ol.f(jsonElement, "frames[" + n2 + "]"));
        }
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = ol.l(jsonElement, "frames[" + n2 + "]");
            int n3 = ol.a(jsonObject, "time", -1);
            if (jsonObject.has("time")) {
                Validate.inclusiveBetween((Object)1, (Object)Integer.MAX_VALUE, (Comparable)Integer.valueOf(n3), (String)"Invalid frame time", (Object[])new Object[0]);
            }
            int n4 = ol.m(jsonObject, "index");
            Validate.inclusiveBetween((Object)0, (Object)Integer.MAX_VALUE, (Comparable)Integer.valueOf(n4), (String)"Invalid frame index", (Object[])new Object[0]);
            return new bsm(n4, n3);
        }
        return null;
    }

    public JsonElement a(bsn bsn2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("frametime", (Number)bsn2.d());
        if (bsn2.b() != -1) {
            jsonObject.addProperty("width", (Number)bsn2.b());
        }
        if (bsn2.a() != -1) {
            jsonObject.addProperty("height", (Number)bsn2.a());
        }
        if (bsn2.c() > 0) {
            JsonArray jsonArray = new JsonArray();
            for (int i2 = 0; i2 < bsn2.c(); ++i2) {
                if (bsn2.b(i2)) {
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("index", (Number)bsn2.c(i2));
                    jsonObject2.addProperty("time", (Number)bsn2.a(i2));
                    jsonArray.add((JsonElement)jsonObject2);
                    continue;
                }
                jsonArray.add((JsonElement)new JsonPrimitive((Number)bsn2.c(i2)));
            }
            jsonObject.add("frames", (JsonElement)jsonArray);
        }
        return jsonObject;
    }

    @Override
    public String a() {
        return "animation";
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }

    public /* synthetic */ JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((bsn)object, type, jsonSerializationContext);
    }
}

