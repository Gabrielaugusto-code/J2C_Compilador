/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.FileUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class nx
extends oh {
    private static final Logger b = LogManager.getLogger();
    private final MinecraftServer c;
    private final File d;
    private final Set e = Sets.newHashSet();
    private int f = -300;
    private boolean g = false;

    public nx(MinecraftServer minecraftServer, File file) {
        this.c = minecraftServer;
        this.d = file;
    }

    public void a() {
        if (this.d.isFile()) {
            try {
                this.a.clear();
                this.a.putAll(this.a(FileUtils.readFileToString((File)this.d)));
            }
            catch (IOException iOException) {
                b.error("Couldn't read statistics file " + this.d, (Throwable)iOException);
            }
            catch (JsonParseException jsonParseException) {
                b.error("Couldn't parse statistics file " + this.d, (Throwable)jsonParseException);
            }
        }
    }

    public void b() {
        try {
            FileUtils.writeStringToFile((File)this.d, (String)nx.a(this.a));
        }
        catch (IOException iOException) {
            b.error("Couldn't save stats", (Throwable)iOException);
        }
    }

    @Override
    public void a(xq xq2, ny ny2, int n2) {
        int n3 = ny2.d() ? this.a(ny2) : 0;
        super.a(xq2, ny2, n2);
        this.e.add(ny2);
        if (ny2.d() && n3 == 0 && n2 > 0) {
            this.g = true;
            if (this.c.ar()) {
                this.c.af().a(new fi("chat.type.achievement", xq2.c_(), ny2.j()));
            }
        }
    }

    public Set c() {
        HashSet hashSet = Sets.newHashSet((Iterable)this.e);
        this.e.clear();
        this.g = false;
        return hashSet;
    }

    public Map a(String string) {
        JsonElement jsonElement = new JsonParser().parse(string);
        if (!jsonElement.isJsonObject()) {
            return Maps.newHashMap();
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        HashMap hashMap = Maps.newHashMap();
        for (Map.Entry entry : jsonObject.entrySet()) {
            ny ny2 = og.a((String)entry.getKey());
            if (ny2 != null) {
                oe oe2 = new oe();
                if (((JsonElement)entry.getValue()).isJsonPrimitive() && ((JsonElement)entry.getValue()).getAsJsonPrimitive().isNumber()) {
                    oe2.a(((JsonElement)entry.getValue()).getAsInt());
                } else if (((JsonElement)entry.getValue()).isJsonObject()) {
                    JsonObject jsonObject2 = ((JsonElement)entry.getValue()).getAsJsonObject();
                    if (jsonObject2.has("value") && jsonObject2.get("value").isJsonPrimitive() && jsonObject2.get("value").getAsJsonPrimitive().isNumber()) {
                        oe2.a(jsonObject2.getAsJsonPrimitive("value").getAsInt());
                    }
                    if (jsonObject2.has("progress") && ny2.l() != null) {
                        try {
                            Constructor constructor = ny2.l().getConstructor(new Class[0]);
                            of of2 = (of)constructor.newInstance(new Object[0]);
                            of2.a(jsonObject2.get("progress"));
                            oe2.a(of2);
                        }
                        catch (Throwable throwable) {
                            b.warn("Invalid statistic progress in " + this.d, throwable);
                        }
                    }
                }
                hashMap.put(ny2, oe2);
                continue;
            }
            b.warn("Invalid statistic in " + this.d + ": Don't know what " + (String)entry.getKey() + " is");
        }
        return hashMap;
    }

    public static String a(Map map) {
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry entry : map.entrySet()) {
            if (((oe)entry.getValue()).b() != null) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("value", (Number)((oe)entry.getValue()).a());
                try {
                    jsonObject2.add("progress", ((oe)entry.getValue()).b().a());
                }
                catch (Throwable throwable) {
                    b.warn("Couldn't save statistic " + ((ny)entry.getKey()).e() + ": error serializing progress", throwable);
                }
                jsonObject.add(((ny)entry.getKey()).e, (JsonElement)jsonObject2);
                continue;
            }
            jsonObject.addProperty(((ny)entry.getKey()).e, (Number)((oe)entry.getValue()).a());
        }
        return jsonObject.toString();
    }

    public void d() {
        for (ny ny2 : this.a.keySet()) {
            this.e.add(ny2);
        }
    }

    public void a(mp mp2) {
        int n2 = this.c.aj();
        HashMap hashMap = Maps.newHashMap();
        if (this.g || n2 - this.f > 300) {
            this.f = n2;
            for (ny ny2 : this.c()) {
                hashMap.put(ny2, this.a(ny2));
            }
        }
        mp2.a.a(new fu(hashMap));
    }

    public void b(mp mp2) {
        HashMap hashMap = Maps.newHashMap();
        for (ns ns2 : nt.e) {
            if (!this.a(ns2)) continue;
            hashMap.put(ns2, this.a((ny)ns2));
            this.e.remove(ns2);
        }
        mp2.a.a(new fu(hashMap));
    }

    public boolean e() {
        return this.g;
    }
}

