/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class kw {
    private String a = null;
    private final List b = Lists.newArrayList();

    private kw() {
    }

    private void a(String string) {
        this.b.add(0, string);
    }

    public String b() {
        return StringUtils.join((Iterable)this.b, (String)"->");
    }

    public String toString() {
        if (this.a != null) {
            if (!this.b.isEmpty()) {
                return this.a + " " + this.b();
            }
            return this.a;
        }
        if (!this.b.isEmpty()) {
            return "(Unknown file) " + this.b();
        }
        return "(Unknown file)";
    }

    /* synthetic */ kw(kv kv2) {
        this();
    }

    static /* synthetic */ void a(kw kw2, String string) {
        kw2.a(string);
    }

    static /* synthetic */ String b(kw kw2, String string) {
        kw2.a = string;
        return kw2.a;
    }
}

