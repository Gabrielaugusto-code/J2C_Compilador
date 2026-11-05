/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class bvs
extends bvw {
    public String a;
    public String b;
    public String c;

    public static bvs a(JsonObject jsonObject) {
        bvs bvs2 = new bvs();
        try {
            bvs2.a = jsonObject.get("invitationId").getAsString();
            bvs2.b = jsonObject.get("worldName").getAsString();
            bvs2.c = jsonObject.get("worldOwnerName").getAsString();
        }
        catch (Exception exception) {
            // empty catch block
        }
        return bvs2;
    }
}

