/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.TypeAdapterFactory
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;

public class jr
extends fk {
    private static final Gson a = new GsonBuilder().registerTypeAdapter(jw.class, (Object)new jx()).registerTypeAdapter(jt.class, (Object)new ju()).registerTypeAdapter(js.class, (Object)new jv()).registerTypeHierarchyAdapter(fa.class, (Object)new fb()).registerTypeHierarchyAdapter(fe.class, (Object)new fg()).registerTypeAdapterFactory((TypeAdapterFactory)new ow()).create();
    private js b;

    public jr() {
    }

    public jr(js js2) {
        this.b = js2;
    }

    @Override
    public void a(ep ep2) {
        this.b = (js)a.fromJson(ep2.c(Short.MAX_VALUE), js.class);
    }

    @Override
    public void b(ep ep2) {
        ep2.a(a.toJson((Object)this.b));
    }

    public void a(jp jp2) {
        jp2.a(this);
    }

    public js c() {
        return this.b;
    }

    @Override
    public boolean a() {
        return true;
    }
}

