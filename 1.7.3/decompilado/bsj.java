/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.TypeAdapterFactory
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import java.lang.reflect.Type;

public class bsj {
    private final cy a = new cz();
    private final GsonBuilder b = new GsonBuilder();
    private Gson c;

    public bsj() {
        this.b.registerTypeHierarchyAdapter(fa.class, (Object)new fb());
        this.b.registerTypeHierarchyAdapter(fe.class, (Object)new fg());
        this.b.registerTypeAdapterFactory((TypeAdapterFactory)new ow());
    }

    public void a(bsi bsi2, Class clazz) {
        this.a.a(bsi2.a(), new bsl(this, bsi2, clazz, null));
        this.b.registerTypeAdapter((Type)clazz, (Object)bsi2);
        this.c = null;
    }

    public bsh a(String string, JsonObject jsonObject) {
        if (string == null) {
            throw new IllegalArgumentException("Metadata section name cannot be null");
        }
        if (!jsonObject.has(string)) {
            return null;
        }
        if (!jsonObject.get(string).isJsonObject()) {
            throw new IllegalArgumentException("Invalid metadata for '" + string + "' - expected object, found " + jsonObject.get(string));
        }
        bsl bsl2 = (bsl)this.a.a(string);
        if (bsl2 == null) {
            throw new IllegalArgumentException("Don't know how to handle metadata section '" + string + "'");
        }
        return (bsh)this.a().fromJson((JsonElement)jsonObject.getAsJsonObject(string), (Type)bsl2.b);
    }

    private Gson a() {
        if (this.c == null) {
            this.c = this.b.create();
        }
        return this.c;
    }
}

