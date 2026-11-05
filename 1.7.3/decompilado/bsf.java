/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  org.apache.commons.io.Charsets
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class bsf {
    private static final Splitter b = Splitter.on((char)'=').limit(2);
    private static final Pattern c = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
    Map a = Maps.newHashMap();
    private boolean d;

    public synchronized void a(brr brr2, List list) {
        this.a.clear();
        for (String string : list) {
            String string2 = String.format("lang/%s.lang", string);
            for (String string3 : brr2.a()) {
                try {
                    this.a(brr2.b(new brq(string3, string2)));
                }
                catch (IOException iOException) {}
            }
        }
        this.b();
    }

    public boolean a() {
        return this.d;
    }

    private void b() {
        this.d = false;
        int n2 = 0;
        int n3 = 0;
        for (String string : this.a.values()) {
            int n4 = string.length();
            n3 += n4;
            for (int i2 = 0; i2 < n4; ++i2) {
                if (string.charAt(i2) < '\u0100') continue;
                ++n2;
            }
        }
        float f2 = (float)n2 / (float)n3;
        this.d = (double)f2 > 0.1;
    }

    private void a(List list) {
        for (brp brp2 : list) {
            this.a(brp2.b());
        }
    }

    private void a(InputStream inputStream) {
        for (String string : IOUtils.readLines((InputStream)inputStream, (Charset)Charsets.UTF_8)) {
            String[] stringArray;
            if (string.isEmpty() || string.charAt(0) == '#' || (stringArray = (String[])Iterables.toArray((Iterable)b.split((CharSequence)string), String.class)) == null || stringArray.length != 2) continue;
            String string2 = stringArray[0];
            String string3 = c.matcher(stringArray[1]).replaceAll("%$1s");
            this.a.put(string2, string3);
        }
    }

    private String b(String string) {
        String string2 = (String)this.a.get(string);
        return string2 == null ? string : string2;
    }

    public String a(String string, Object[] objectArray) {
        String string2 = this.b(string);
        try {
            return String.format(string2, objectArray);
        }
        catch (IllegalFormatException illegalFormatException) {
            return "Format error: " + string2;
        }
    }
}

