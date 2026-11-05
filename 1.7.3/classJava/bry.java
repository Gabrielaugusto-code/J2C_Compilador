/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 */
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.IOUtils;

public class bry {
    private final File b;
    private brt c;
    private bst d;
    private BufferedImage e;
    private brq f;
    final /* synthetic */ brv a;

    private bry(brv brv2, File file) {
        this.a = brv2;
        this.b = file;
    }

    public void a() {
        this.c = this.b.isDirectory() ? new brl(this.b) : new brk(this.b);
        this.d = (bst)this.c.a(this.a.c, "pack");
        try {
            this.e = this.c.a();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if (this.e == null) {
            this.e = this.a.b.a();
        }
        this.b();
    }

    public void a(bqy bqy2) {
        if (this.f == null) {
            this.f = bqy2.a("texturepackicon", new bqj(this.e));
        }
        bqy2.a(this.f);
    }

    public void b() {
        if (this.c instanceof Closeable) {
            IOUtils.closeQuietly((Closeable)((Closeable)((Object)this.c)));
        }
    }

    public brt c() {
        return this.c;
    }

    public String d() {
        return this.c.b();
    }

    public String e() {
        return this.d == null ? (Object)((Object)a.m) + "Invalid pack.mcmeta (or missing 'pack' section)" : this.d.a().d();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof bry) {
            return this.toString().equals(object.toString());
        }
        return false;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return String.format("%s:%s:%d", this.b.getName(), this.b.isDirectory() ? "folder" : "zip", this.b.lastModified());
    }

    /* synthetic */ bry(brv brv2, File file, brw brw2) {
        this(brv2, file);
    }
}

