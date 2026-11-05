/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class bvx
extends bvw {
    public String a;
    public String b;
    public String c;
    public String d;

    public static bvx a(JsonObject jsonObject) {
        bvx bvx2 = new bvx();
        try {
            bvx2.a = jsonObject.get("id").getAsString();
            bvx2.b = jsonObject.get("name").getAsString();
            bvx2.c = jsonObject.get("version").getAsString();
            bvx2.d = jsonObject.get("author").getAsString();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        return bvx2;
    }
}

