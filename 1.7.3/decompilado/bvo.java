/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonIOException
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonSyntaxException
 *  org.apache.commons.lang3.builder.EqualsBuilder
 *  org.apache.commons.lang3.builder.HashCodeBuilder
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class bvo {
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public List f;
    public String g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public String m = "";
    public String n = "\u00a770";
    public boolean o = false;

    public String a() {
        return this.c;
    }

    public String b() {
        return this.b;
    }

    public void a(String string) {
        this.b = string;
    }

    public void b(String string) {
        this.c = string;
    }

    public void a(bvo bvo2) {
        this.m = bvo2.m;
        this.l = bvo2.l;
    }

    public static bvo a(JsonObject jsonObject) {
        bvo bvo2 = new bvo();
        try {
            bvo2.a = !jsonObject.get("id").isJsonNull() ? jsonObject.get("id").getAsLong() : -1L;
            bvo2.b = !jsonObject.get("name").isJsonNull() ? jsonObject.get("name").getAsString() : null;
            bvo2.c = !jsonObject.get("motd").isJsonNull() ? jsonObject.get("motd").getAsString() : null;
            bvo2.d = !jsonObject.get("state").isJsonNull() ? jsonObject.get("state").getAsString() : bvp.a.name();
            bvo2.e = !jsonObject.get("owner").isJsonNull() ? jsonObject.get("owner").getAsString() : null;
            bvo2.f = jsonObject.get("invited").isJsonArray() ? bvo.a(jsonObject.get("invited").getAsJsonArray()) : new ArrayList();
            bvo2.k = !jsonObject.get("daysLeft").isJsonNull() ? jsonObject.get("daysLeft").getAsInt() : 0;
            bvo2.g = !jsonObject.get("ip").isJsonNull() ? jsonObject.get("ip").getAsString() : null;
            bvo2.h = !jsonObject.get("expired").isJsonNull() && jsonObject.get("expired").getAsBoolean();
            bvo2.i = !jsonObject.get("difficulty").isJsonNull() ? jsonObject.get("difficulty").getAsInt() : 0;
            bvo2.j = !jsonObject.get("gameMode").isJsonNull() ? jsonObject.get("gameMode").getAsInt() : 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        return bvo2;
    }

    private static List a(JsonArray jsonArray) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            arrayList.add(((JsonElement)iterator.next()).getAsString());
        }
        return arrayList;
    }

    public static bvo c(String string) {
        bvo bvo2 = new bvo();
        try {
            JsonParser jsonParser = new JsonParser();
            JsonObject jsonObject = jsonParser.parse(string).getAsJsonObject();
            bvo2 = bvo.a(jsonObject);
        }
        catch (JsonIOException jsonIOException) {
        }
        catch (JsonSyntaxException jsonSyntaxException) {
            // empty catch block
        }
        return bvo2;
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(this.a).append((Object)this.b).append((Object)this.c).append((Object)this.d).append((Object)this.e).append(this.h).toHashCode();
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (object.getClass() != this.getClass()) {
            return false;
        }
        bvo bvo2 = (bvo)object;
        return new EqualsBuilder().append(this.a, bvo2.a).append((Object)this.b, (Object)bvo2.b).append((Object)this.c, (Object)bvo2.c).append((Object)this.d, (Object)bvo2.d).append((Object)this.e, (Object)bvo2.e).append(this.h, bvo2.h).isEquals();
    }
}

