/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
import org.apache.commons.io.IOUtils;

public class bsb
implements brp {
    private final Map a = Maps.newHashMap();
    private final brq b;
    private final InputStream c;
    private final InputStream d;
    private final bsj e;
    private boolean f;
    private JsonObject g;

    public bsb(brq brq2, InputStream inputStream, InputStream inputStream2, bsj bsj2) {
        this.b = brq2;
        this.c = inputStream;
        this.d = inputStream2;
        this.e = bsj2;
    }

    @Override
    public InputStream b() {
        return this.c;
    }

    @Override
    public boolean c() {
        return this.d != null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public bsh a(String string) {
        Object object;
        if (!this.c()) {
            return null;
        }
        if (this.g == null && !this.f) {
            this.f = true;
            object = null;
            try {
                object = new BufferedReader(new InputStreamReader(this.d));
                this.g = new JsonParser().parse((Reader)object).getAsJsonObject();
            }
            finally {
                IOUtils.closeQuietly((Reader)object);
            }
        }
        if ((object = (bsh)this.a.get(string)) == null) {
            object = this.e.a(string, this.g);
        }
        return object;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof bsb) {
            bsb bsb2 = (bsb)object;
            return this.b != null ? this.b.equals(bsb2.b) : bsb2.b == null;
        }
        return false;
    }

    public int hashCode() {
        if (this.b == null) {
            return 0;
        }
        return this.b.hashCode();
    }
}

