/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

final class on
implements Runnable {
    final /* synthetic */ pb a;
    final /* synthetic */ String b;
    final /* synthetic */ Proxy c;
    final /* synthetic */ Map d;
    final /* synthetic */ File e;
    final /* synthetic */ oo f;
    final /* synthetic */ int g;

    on(pb pb2, String string, Proxy proxy, Map map, File file, oo oo2, int n2) {
        this.a = pb2;
        this.b = string;
        this.c = proxy;
        this.d = map;
        this.e = file;
        this.f = oo2;
        this.g = n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        URLConnection uRLConnection = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        if (this.a != null) {
            this.a.b("Downloading Texture Pack");
            this.a.c("Making Request...");
        }
        try {
            byte[] byArray = new byte[4096];
            URL uRL = new URL(this.b);
            uRLConnection = uRL.openConnection(this.c);
            float f2 = 0.0f;
            float f3 = this.d.entrySet().size();
            for (Map.Entry entry : this.d.entrySet()) {
                uRLConnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue());
                if (this.a == null) continue;
                this.a.a((int)((f2 += 1.0f) / f3 * 100.0f));
            }
            inputStream = uRLConnection.getInputStream();
            f3 = uRLConnection.getContentLength();
            int n2 = uRLConnection.getContentLength();
            if (this.a != null) {
                this.a.c(String.format("Downloading file (%.2f MB)...", Float.valueOf(f3 / 1000.0f / 1000.0f)));
            }
            if (this.e.exists()) {
                long l2 = this.e.length();
                if (l2 == (long)n2) {
                    this.f.a(this.e);
                    if (this.a != null) {
                        this.a.a();
                    }
                    return;
                }
                om.b().warn("Deleting " + this.e + " as it does not match what we currently have (" + n2 + " vs our " + l2 + ").");
                this.e.delete();
            } else if (this.e.getParentFile() != null) {
                this.e.getParentFile().mkdirs();
            }
            outputStream = new DataOutputStream(new FileOutputStream(this.e));
            if (this.g > 0 && f3 > (float)this.g) {
                if (this.a != null) {
                    this.a.a();
                }
                throw new IOException("Filesize is bigger than maximum allowed (file is " + f2 + ", limit is " + this.g + ")");
            }
            int n3 = 0;
            while ((n3 = inputStream.read(byArray)) >= 0) {
                f2 += (float)n3;
                if (this.a != null) {
                    this.a.a((int)(f2 / f3 * 100.0f));
                }
                if (this.g > 0 && f2 > (float)this.g) {
                    if (this.a != null) {
                        this.a.a();
                    }
                    throw new IOException("Filesize was bigger than maximum allowed (got >= " + f2 + ", limit was " + this.g + ")");
                }
                outputStream.write(byArray, 0, n3);
            }
            this.f.a(this.e);
            if (this.a != null) {
                this.a.a();
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            catch (IOException iOException) {}
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            }
            catch (IOException iOException) {}
        }
    }
}

