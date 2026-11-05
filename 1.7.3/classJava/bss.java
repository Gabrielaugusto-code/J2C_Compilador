/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;

public class bss
extends bsg {
    public bsr a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        HashSet hashSet = Sets.newHashSet();
        for (Map.Entry entry : jsonObject.entrySet()) {
            String string = (String)entry.getKey();
            JsonObject jsonObject2 = ol.l((JsonElement)entry.getValue(), "language");
            String string2 = ol.h(jsonObject2, "region");
            String string3 = ol.h(jsonObject2, "name");
            boolean bl2 = ol.a(jsonObject2, "bidirectional", false);
            if (string2.isEmpty()) {
                throw new JsonParseException("Invalid language->'" + string + "'->region: empty value");
            }
            if (string3.isEmpty()) {
                throw new JsonParseException("Invalid language->'" + string + "'->name: empty value");
            }
            if (hashSet.add(new bsd(string, string2, string3, bl2))) continue;
            throw new JsonParseException("Duplicate language->'" + string + "' defined");
        }
        return new bsr(hashSet);
    }

    @Override
    public String a() {
        return "language";
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}

