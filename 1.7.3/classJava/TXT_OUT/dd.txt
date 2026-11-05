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
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class dd {
    private static final Pattern a = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
    private static final Splitter b = Splitter.on((char)'=').limit(2);
    private static dd c = new dd();
    private final Map d = Maps.newHashMap();
    private long e;

    public dd() {
        try {
            InputStream inputStream = dd.class.getResourceAsStream("/assets/minecraft/lang/en_US.lang");
            for (String string : IOUtils.readLines((InputStream)inputStream, (Charset)Charsets.UTF_8)) {
                String[] stringArray;
                if (string.isEmpty() || string.charAt(0) == '#' || (stringArray = (String[])Iterables.toArray((Iterable)b.split((CharSequence)string), String.class)) == null || stringArray.length != 2) continue;
                String string2 = stringArray[0];
                String string3 = a.matcher(stringArray[1]).replaceAll("%$1s");
                this.d.put(string2, string3);
            }
            this.e = System.currentTimeMillis();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    static dd a() {
        return c;
    }

    public static synchronized void a(Map map) {
        dd.c.d.clear();
        dd.c.d.putAll(map);
        dd.c.e = System.currentTimeMillis();
    }

    public synchronized String a(String string) {
        return this.c(string);
    }

    public synchronized String a(String string, Object ... objectArray) {
        String string2 = this.c(string);
        try {
            return String.format(string2, objectArray);
        }
        catch (IllegalFormatException illegalFormatException) {
            return "Format error: " + string2;
        }
    }

    private String c(String string) {
        String string2 = (String)this.d.get(string);
        return string2 == null ? string : string2;
    }

    public synchronized boolean b(String string) {
        return this.d.containsKey(string);
    }

    public long c() {
        return this.e;
    }
}

