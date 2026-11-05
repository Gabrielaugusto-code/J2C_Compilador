/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.apache.commons.lang3.Validate
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import org.apache.commons.lang3.Validate;

public class btf
implements JsonDeserializer {
    public btc a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = ol.l(jsonElement, "entry");
        btc btc2 = new btc();
        btc2.a(ol.a(jsonObject, "replace", false));
        w w2 = w.a(ol.a(jsonObject, "category", w.a.a()));
        btc2.a(w2);
        Validate.notNull((Object)((Object)w2), (String)"Invalid category", (Object[])new Object[0]);
        if (jsonObject.has("sounds")) {
            JsonArray jsonArray = ol.t(jsonObject, "sounds");
            for (int i2 = 0; i2 < jsonArray.size(); ++i2) {
                JsonElement jsonElement2 = jsonArray.get(i2);
                btd btd2 = new btd();
                if (ol.a(jsonElement2)) {
                    btd2.a(ol.a(jsonElement2, "sound"));
                } else {
                    JsonObject jsonObject2 = ol.l(jsonElement2, "sound");
                    btd2.a(ol.h(jsonObject2, "name"));
                    if (jsonObject2.has("type")) {
                        bte bte2 = bte.a(ol.h(jsonObject2, "type"));
                        Validate.notNull((Object)((Object)bte2), (String)"Invalid type", (Object[])new Object[0]);
                        btd2.a(bte2);
                    }
                    if (jsonObject2.has("volume")) {
                        float f2 = ol.k(jsonObject2, "volume");
                        Validate.isTrue((f2 > 0.0f ? 1 : 0) != 0, (String)"Invalid volume", (Object[])new Object[0]);
                        btd2.a(f2);
                    }
                    if (jsonObject2.has("pitch")) {
                        float f3 = ol.k(jsonObject2, "pitch");
                        Validate.isTrue((f3 > 0.0f ? 1 : 0) != 0, (String)"Invalid pitch", (Object[])new Object[0]);
                        btd2.b(f3);
                    }
                    if (jsonObject2.has("weight")) {
                        int n2 = ol.m(jsonObject2, "weight");
                        Validate.isTrue((n2 > 0 ? 1 : 0) != 0, (String)"Invalid weight", (Object[])new Object[0]);
                        btd2.a(n2);
                    }
                    if (jsonObject2.has("stream")) {
                        btd2.a(ol.i(jsonObject2, "stream"));
                    }
                }
                btc2.a().add(btd2);
            }
        }
        return btc2;
    }

    public /* synthetic */ Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}

