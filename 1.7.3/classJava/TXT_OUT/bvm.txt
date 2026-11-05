/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Date;

public class bvm
extends bvw {
    public String a;
    public Date b;
    public long c;

    public static bvm a(JsonElement jsonElement) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        bvm bvm2 = new bvm();
        try {
            bvm2.a = jsonObject.get("backupId").getAsString();
            bvm2.b = new Date(Long.parseLong(jsonObject.get("lastModifiedDate").getAsString()));
            bvm2.c = Long.parseLong(jsonObject.get("size").getAsString());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        return bvm2;
    }
}

