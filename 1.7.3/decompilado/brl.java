/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.apache.commons.io.filefilter.DirectoryFileFilter
 */
import com.google.common.collect.Sets;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.io.filefilter.DirectoryFileFilter;

public class brl
extends brg {
    public brl(File file) {
        super(file);
    }

    @Override
    protected InputStream a(String string) {
        return new BufferedInputStream(new FileInputStream(new File(this.a, string)));
    }

    @Override
    protected boolean b(String string) {
        return new File(this.a, string).isFile();
    }

    @Override
    public Set c() {
        HashSet hashSet = Sets.newHashSet();
        File file = new File(this.a, "assets/");
        if (file.isDirectory()) {
            for (File file2 : file.listFiles((FileFilter)DirectoryFileFilter.DIRECTORY)) {
                String string = brl.a(file, file2);
                if (!string.equals(string.toLowerCase())) {
                    this.c(string);
                    continue;
                }
                hashSet.add(string.substring(0, string.length() - 1));
            }
        }
        return hashSet;
    }
}

