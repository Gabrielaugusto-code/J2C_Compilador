/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

public class bqb {
    private static final Logger a = LogManager.getLogger();
    private static final bqa b = new bqa();
    private static bqb c = null;
    private static int d = -1;
    private static boolean e = true;
    private final Map f = Maps.newHashMap();
    private final List g = Lists.newArrayList();
    private final List h = Lists.newArrayList();
    private final List i = Lists.newArrayList();
    private final List j = Lists.newArrayList();
    private final Map k = Maps.newHashMap();
    private final int l;
    private final String m;
    private final boolean n;
    private boolean o;
    private final bpz p;
    private final List q;
    private final List r;
    private final bqe s;
    private final bqe t;

    public bqb(brr brr2, String string) {
        JsonParser jsonParser = new JsonParser();
        brq brq2 = new brq("shaders/program/" + string + ".json");
        this.m = string;
        InputStream inputStream = null;
        try {
            JsonArray jsonArray;
            JsonArray jsonArray2;
            inputStream = brr2.a(brq2).b();
            JsonObject jsonObject = jsonParser.parse(IOUtils.toString((InputStream)inputStream, (Charset)Charsets.UTF_8)).getAsJsonObject();
            String string2 = ol.h(jsonObject, "vertex");
            String string3 = ol.h(jsonObject, "fragment");
            JsonArray jsonArray3 = ol.a(jsonObject, "samplers", null);
            if (jsonArray3 != null) {
                int n2 = 0;
                for (Object object : jsonArray3) {
                    try {
                        this.a((JsonElement)object);
                    }
                    catch (Exception exception) {
                        ku ku2 = ku.a(exception);
                        ku2.a("samplers[" + n2 + "]");
                        throw ku2;
                    }
                    ++n2;
                }
            }
            if ((jsonArray2 = ol.a(jsonObject, "attributes", null)) != null) {
                int n3 = 0;
                this.q = Lists.newArrayListWithCapacity((int)jsonArray2.size());
                this.r = Lists.newArrayListWithCapacity((int)jsonArray2.size());
                for (Object object : jsonArray2) {
                    try {
                        this.r.add(ol.a((JsonElement)object, "attribute"));
                    }
                    catch (Exception exception) {
                        ku ku3 = ku.a(exception);
                        ku3.a("attributes[" + n3 + "]");
                        throw ku3;
                    }
                    ++n3;
                }
            } else {
                this.q = null;
                this.r = null;
            }
            if ((jsonArray = ol.a(jsonObject, "uniforms", null)) != null) {
                int n4 = 0;
                for (JsonElement jsonElement : jsonArray) {
                    try {
                        this.b(jsonElement);
                    }
                    catch (Exception exception) {
                        ku ku4 = ku.a(exception);
                        ku4.a("uniforms[" + n4 + "]");
                        throw ku4;
                    }
                    ++n4;
                }
            }
            this.p = bpz.a(ol.a(jsonObject, "blend", null));
            this.n = ol.a(jsonObject, "cull", true);
            this.s = bqe.a(brr2, bqf.a, string2);
            this.t = bqe.a(brr2, bqf.b, string3);
            this.l = bqg.b().c();
            bqg.b().b(this);
            this.i();
            if (this.r != null) {
                for (Object object : this.r) {
                    int n5 = bwg.b(this.l, (CharSequence)object);
                    this.q.add(n5);
                }
            }
        }
        catch (Exception exception) {
            try {
                ku ku5 = ku.a(exception);
                ku5.b(brq2.a());
                throw ku5;
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly(inputStream);
                throw throwable;
            }
        }
        IOUtils.closeQuietly((InputStream)inputStream);
        this.d();
    }

    public void a() {
        bqg.b().a(this);
    }

    public void b() {
        bwg.d(0);
        d = -1;
        c = null;
        e = true;
        for (int i2 = 0; i2 < this.h.size(); ++i2) {
            if (this.f.get(this.g.get(i2)) == null) continue;
            GL13.glActiveTexture((int)(33984 + i2));
            GL11.glBindTexture((int)3553, (int)0);
        }
    }

    public void c() {
        this.o = false;
        c = this;
        this.p.a();
        if (this.l != d) {
            bwg.d(this.l);
            d = this.l;
        }
        if (e != this.n) {
            e = this.n;
            if (this.n) {
                GL11.glEnable((int)2884);
            } else {
                GL11.glDisable((int)2884);
            }
        }
        for (int i2 = 0; i2 < this.h.size(); ++i2) {
            if (this.f.get(this.g.get(i2)) == null) continue;
            GL13.glActiveTexture((int)(33984 + i2));
            GL11.glEnable((int)3553);
            bqh bqh2 = this.f.get(this.g.get(i2));
            int n2 = -1;
            if (bqh2 instanceof bmz) {
                n2 = ((bmz)((Object)bqh2)).g;
            } else if (bqh2 instanceof bra) {
                n2 = ((bra)((Object)bqh2)).b();
            } else if (bqh2 instanceof Integer) {
                n2 = (Integer)((Object)bqh2);
            }
            if (n2 == -1) continue;
            GL11.glBindTexture((int)3553, (int)n2);
            bwg.f(bwg.a(this.l, (CharSequence)this.g.get(i2)), i2);
        }
        for (bqh bqh2 : this.i) {
            bqh2.b();
        }
    }

    public void d() {
        this.o = true;
    }

    public bqh a(String string) {
        if (this.k.containsKey(string)) {
            return (bqh)this.k.get(string);
        }
        return null;
    }

    public bqh b(String string) {
        if (this.k.containsKey(string)) {
            return (bqh)this.k.get(string);
        }
        return b;
    }

    private void i() {
        int n2;
        String string;
        int n3 = 0;
        int n4 = 0;
        while (n3 < this.g.size()) {
            string = (String)this.g.get(n3);
            n2 = bwg.a(this.l, string);
            if (n2 == -1) {
                a.warn("Shader " + this.m + "could not find sampler named " + string + " in the specified shader program.");
                this.f.remove(string);
                this.g.remove(n4);
                --n4;
            } else {
                this.h.add(n2);
            }
            ++n3;
            ++n4;
        }
        for (bqh bqh2 : this.i) {
            string = bqh2.a();
            n2 = bwg.a(this.l, string);
            if (n2 == -1) {
                a.warn("Could not find uniform named " + string + " in the specified" + " shader program.");
                continue;
            }
            this.j.add(n2);
            bqh2.b(n2);
            this.k.put(string, bqh2);
        }
    }

    private void a(JsonElement jsonElement) {
        JsonObject jsonObject = ol.l(jsonElement, "sampler");
        String string = ol.h(jsonObject, "name");
        if (!ol.a(jsonObject, "file")) {
            this.f.put(string, null);
            this.g.add(string);
            return;
        }
        this.g.add(string);
    }

    public void a(String string, Object object) {
        if (this.f.containsKey(string)) {
            this.f.remove(string);
        }
        this.f.put(string, object);
        this.d();
    }

    private void b(JsonElement jsonElement) {
        Object object2;
        JsonObject jsonObject = ol.l(jsonElement, "uniform");
        String string = ol.h(jsonObject, "name");
        int n2 = bqh.a(ol.h(jsonObject, "type"));
        int n3 = ol.m(jsonObject, "count");
        float[] fArray = new float[Math.max(n3, 16)];
        JsonArray jsonArray = ol.t(jsonObject, "values");
        if (jsonArray.size() != n3 && jsonArray.size() > 1) {
            throw new ku("Invalid amount of values specified (expected " + n3 + ", found " + jsonArray.size() + ")");
        }
        int n4 = 0;
        for (Object object2 : jsonArray) {
            try {
                fArray[n4] = ol.d((JsonElement)object2, "value");
            }
            catch (Exception exception) {
                ku ku2 = ku.a(exception);
                ku2.a("values[" + n4 + "]");
                throw ku2;
            }
            ++n4;
        }
        if (n3 > 1 && jsonArray.size() == 1) {
            while (n4 < n3) {
                fArray[n4] = fArray[0];
                ++n4;
            }
        }
        int n5 = n3 > 1 && n3 <= 4 && n2 < 8 ? n3 - 1 : 0;
        object2 = new bqh(string, n2 + n5, n3, this);
        if (n2 <= 3) {
            ((bqh)object2).a((int)fArray[0], (int)fArray[1], (int)fArray[2], (int)fArray[3]);
        } else if (n2 <= 7) {
            ((bqh)object2).b(fArray[0], fArray[1], fArray[2], fArray[3]);
        } else {
            ((bqh)object2).a(fArray);
        }
        this.i.add(object2);
    }

    public bqe e() {
        return this.s;
    }

    public bqe f() {
        return this.t;
    }

    public int h() {
        return this.l;
    }
}

