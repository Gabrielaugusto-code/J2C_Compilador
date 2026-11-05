/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class brk
extends brg
implements Closeable {
    public static final Splitter b = Splitter.on((char)'/').omitEmptyStrings().limit(3);
    private ZipFile c;

    public brk(File file) {
        super(file);
    }

    private ZipFile d() {
        if (this.c == null) {
            this.c = new ZipFile(this.a);
        }
        return this.c;
    }

    @Override
    protected InputStream a(String string) {
        ZipFile zipFile = this.d();
        ZipEntry zipEntry = zipFile.getEntry(string);
        if (zipEntry == null) {
            throw new bru(this.a, string);
        }
        return zipFile.getInputStream(zipEntry);
    }

    @Override
    public boolean b(String string) {
        try {
            return this.d().getEntry(string) != null;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    @Override
    public Set c() {
        ZipFile zipFile;
        try {
            zipFile = this.d();
        }
        catch (IOException iOException) {
            return Collections.emptySet();
        }
        Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
        HashSet hashSet = Sets.newHashSet();
        while (enumeration.hasMoreElements()) {
            ArrayList arrayList;
            ZipEntry zipEntry = enumeration.nextElement();
            String string = zipEntry.getName();
            if (!string.startsWith("assets/") || (arrayList = Lists.newArrayList((Iterable)b.split((CharSequence)string))).size() <= 1) continue;
            String string2 = (String)arrayList.get(1);
            if (!string2.equals(string2.toLowerCase())) {
                this.c(string2);
                continue;
            }
            hashSet.add(string2);
        }
        return hashSet;
    }

    protected void finalize() {
        this.close();
        super.finalize();
    }

    @Override
    public void close() {
        if (this.c != null) {
            this.c.close();
            this.c = null;
        }
    }
}

