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
 *  javax.vecmath.Matrix4f
 *  org.apache.commons.io.IOUtils
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import javax.vecmath.Matrix4f;
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.GL11;

public class bqc {
    private final bmz a;
    private final brr b;
    private final String c;
    private final List d = Lists.newArrayList();
    private final Map e = Maps.newHashMap();
    private final List f = Lists.newArrayList();
    private Matrix4f g;
    private int h;
    private int i;
    private float j;
    private float k;

    public bqc(bqy bqy2, brr brr2, bmz bmz2, brq brq2) {
        this.b = brr2;
        this.a = bmz2;
        this.j = 0.0f;
        this.k = 0.0f;
        this.h = bmz2.c;
        this.i = bmz2.d;
        this.c = brq2.toString();
        this.c();
        this.a(bqy2, brq2);
    }

    public void a(bqy bqy2, brq brq2) {
        InputStream inputStream;
        block11: {
            JsonParser jsonParser = new JsonParser();
            inputStream = null;
            try {
                int n2;
                JsonArray jsonArray;
                brp brp2 = this.b.a(brq2);
                inputStream = brp2.b();
                JsonObject jsonObject = jsonParser.parse(IOUtils.toString((InputStream)inputStream, (Charset)Charsets.UTF_8)).getAsJsonObject();
                if (ol.d(jsonObject, "targets")) {
                    jsonArray = jsonObject.getAsJsonArray("targets");
                    n2 = 0;
                    for (JsonElement jsonElement : jsonArray) {
                        try {
                            this.a(jsonElement);
                        }
                        catch (Exception exception) {
                            ku ku2 = ku.a(exception);
                            ku2.a("targets[" + n2 + "]");
                            throw ku2;
                        }
                        ++n2;
                    }
                }
                if (!ol.d(jsonObject, "passes")) break block11;
                jsonArray = jsonObject.getAsJsonArray("passes");
                n2 = 0;
                for (JsonElement jsonElement : jsonArray) {
                    try {
                        this.a(bqy2, jsonElement);
                    }
                    catch (Exception exception) {
                        ku ku3 = ku.a(exception);
                        ku3.a("passes[" + n2 + "]");
                        throw ku3;
                    }
                    ++n2;
                }
            }
            catch (Exception exception) {
                try {
                    ku ku4 = ku.a(exception);
                    ku4.b(brq2.a());
                    throw ku4;
                }
                catch (Throwable throwable) {
                    IOUtils.closeQuietly(inputStream);
                    throw throwable;
                }
            }
        }
        IOUtils.closeQuietly((InputStream)inputStream);
    }

    private void a(JsonElement jsonElement) {
        if (ol.a(jsonElement)) {
            this.a(jsonElement.getAsString(), this.h, this.i);
        } else {
            JsonObject jsonObject = ol.l(jsonElement, "target");
            String string = ol.h(jsonObject, "name");
            int n2 = ol.a(jsonObject, "width", this.h);
            int n3 = ol.a(jsonObject, "height", this.i);
            if (this.e.containsKey(string)) {
                throw new ku(string + " is already defined");
            }
            this.a(string, n2, n3);
        }
    }

    private void a(bqy bqy2, JsonElement jsonElement) {
        JsonArray jsonArray;
        Object object;
        JsonObject jsonObject = ol.l(jsonElement, "pass");
        String string = ol.h(jsonObject, "name");
        String string2 = ol.h(jsonObject, "intarget");
        String string3 = ol.h(jsonObject, "outtarget");
        bmz bmz2 = this.a(string2);
        bmz bmz3 = this.a(string3);
        if (bmz2 == null) {
            throw new ku("Input target '" + string2 + "' does not exist");
        }
        if (bmz3 == null) {
            throw new ku("Output target '" + string3 + "' does not exist");
        }
        bqd bqd2 = this.a(string, bmz2, bmz3);
        JsonArray jsonArray2 = ol.a(jsonObject, "auxtargets", null);
        if (jsonArray2 != null) {
            int n2 = 0;
            for (Object object2 : jsonArray2) {
                block15: {
                    Object object3;
                    try {
                        JsonObject jsonObject2 = ol.l((JsonElement)object2, "auxtarget");
                        object3 = ol.h(jsonObject2, "name");
                        object = ol.h(jsonObject2, "id");
                        bmz bmz4 = this.a((String)object);
                        if (bmz4 == null) {
                            brq brq2 = new brq("textures/effect/" + (String)object + ".png");
                            try {
                                this.b.a(brq2);
                            }
                            catch (FileNotFoundException fileNotFoundException) {
                                throw new ku("Render target or texture '" + (String)object + "' does not exist");
                            }
                            bqy2.a(brq2);
                            bra bra2 = bqy2.b(brq2);
                            int n3 = ol.m(jsonObject2, "width");
                            int n4 = ol.m(jsonObject2, "height");
                            boolean bl2 = ol.i(jsonObject2, "bilinear");
                            if (bl2) {
                                GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
                                GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
                            } else {
                                GL11.glTexParameteri((int)3553, (int)10241, (int)9728);
                                GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
                            }
                            bqd2.a((String)object3, bra2.b(), n3, n4);
                            break block15;
                        }
                        bqd2.a((String)object3, bmz4, bmz4.a, bmz4.b);
                    }
                    catch (Exception exception) {
                        object3 = ku.a(exception);
                        ((ku)object3).a("auxtargets[" + n2 + "]");
                        throw object3;
                    }
                }
                ++n2;
            }
        }
        if ((jsonArray = ol.a(jsonObject, "uniforms", null)) != null) {
            int n5 = 0;
            for (JsonObject jsonObject2 : jsonArray) {
                try {
                    this.b((JsonElement)jsonObject2);
                }
                catch (Exception exception) {
                    object = ku.a(exception);
                    ((ku)object).a("uniforms[" + n5 + "]");
                    throw object;
                }
                ++n5;
            }
        }
    }

    private void b(JsonElement jsonElement) {
        JsonObject jsonObject = ol.l(jsonElement, "uniform");
        String string = ol.h(jsonObject, "name");
        bqh bqh2 = ((bqd)this.d.get(this.d.size() - 1)).c().a(string);
        if (bqh2 == null) {
            throw new ku("Uniform '" + string + "' does not exist");
        }
        float[] fArray = new float[4];
        int n2 = 0;
        JsonArray jsonArray = ol.t(jsonObject, "values");
        for (JsonElement jsonElement2 : jsonArray) {
            try {
                fArray[n2] = ol.d(jsonElement2, "value");
            }
            catch (Exception exception) {
                ku ku2 = ku.a(exception);
                ku2.a("values[" + n2 + "]");
                throw ku2;
            }
            ++n2;
        }
        switch (n2) {
            case 0: {
                break;
            }
            case 1: {
                bqh2.a(fArray[0]);
                break;
            }
            case 2: {
                bqh2.a(fArray[0], fArray[1]);
                break;
            }
            case 3: {
                bqh2.a(fArray[0], fArray[1], fArray[2]);
                break;
            }
            case 4: {
                bqh2.a(fArray[0], fArray[1], fArray[2], fArray[3]);
            }
        }
    }

    public void a(String string, int n2, int n3) {
        bmz bmz2 = new bmz(n2, n3, true);
        bmz2.a(0.0f, 0.0f, 0.0f, 0.0f);
        this.e.put(string, bmz2);
        if (n2 == this.h && n3 == this.i) {
            this.f.add(bmz2);
        }
    }

    public void a() {
        for (Object object : this.e.values()) {
            ((bmz)object).a();
        }
        for (Object object : this.d) {
            ((bqd)object).b();
        }
        this.d.clear();
    }

    public bqd a(String string, bmz bmz2, bmz bmz3) {
        bqd bqd2 = new bqd(this.b, string, bmz2, bmz3);
        this.d.add(this.d.size(), bqd2);
        return bqd2;
    }

    private void c() {
        this.g = new Matrix4f();
        this.g.setIdentity();
        this.g.m00 = 2.0f / (float)this.a.a;
        this.g.m11 = 2.0f / (float)(-this.a.b);
        this.g.m22 = -0.0020001999f;
        this.g.m33 = 1.0f;
        this.g.m03 = -1.0f;
        this.g.m13 = 1.0f;
        this.g.m23 = -1.0001999f;
    }

    public void a(int n2, int n3) {
        this.h = this.a.a;
        this.i = this.a.b;
        this.c();
        for (Object object : this.d) {
            ((bqd)object).a(this.g);
        }
        for (Object object : this.f) {
            ((bmz)object).a(n2, n3);
        }
    }

    public void a(float f2) {
        if (f2 < this.k) {
            this.j += 1.0f - this.k;
            this.j += f2;
        } else {
            this.j += f2 - this.k;
        }
        this.k = f2;
        while (this.j > 20.0f) {
            this.j -= 20.0f;
        }
        for (bqd bqd2 : this.d) {
            bqd2.a(this.j / 20.0f);
        }
    }

    public final String b() {
        return this.c;
    }

    private bmz a(String string) {
        if (string == null) {
            return null;
        }
        if (string.equals("minecraft:main")) {
            return this.a;
        }
        return (bmz)this.e.get(string);
    }
}

