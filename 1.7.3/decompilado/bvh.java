/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

public abstract class bvh {
    protected HttpURLConnection a;
    private boolean c;
    protected String b;

    public bvh(String string, int n2, int n3) {
        try {
            this.b = string;
            Proxy proxy = bvg.a();
            this.a = proxy != null ? (HttpURLConnection)new URL(string).openConnection(proxy) : (HttpURLConnection)new URL(string).openConnection();
            this.a.setConnectTimeout(n2);
            this.a.setReadTimeout(n3);
        }
        catch (Exception exception) {
            throw new bvz("Failed URL: " + string, exception);
        }
    }

    public void a(String string, String string2) {
        String string3 = this.a.getRequestProperty("Cookie");
        if (string3 == null) {
            this.a.setRequestProperty("Cookie", string + "=" + string2);
        } else {
            this.a.setRequestProperty("Cookie", string3 + ";" + string + "=" + string2);
        }
    }

    public int a() {
        try {
            this.e();
            return this.a.getResponseCode();
        }
        catch (Exception exception) {
            throw new bvz("Failed URL: " + this.b, exception);
        }
    }

    public int b() {
        String string = this.a.getHeaderField("Retry-After");
        try {
            return Integer.valueOf(string);
        }
        catch (Exception exception) {
            return 5;
        }
    }

    public String d() {
        try {
            this.e();
            String string = this.a() >= 400 ? this.a(this.a.getErrorStream()) : this.a(this.a.getInputStream());
            this.i();
            return string;
        }
        catch (IOException iOException) {
            throw new bvz("Failed URL: " + this.b, iOException);
        }
    }

    private String a(InputStream inputStream) {
        if (inputStream == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = inputStream.read();
        while (n2 != -1) {
            stringBuilder.append((char)n2);
            n2 = inputStream.read();
        }
        return stringBuilder.toString();
    }

    private void i() {
        byte[] byArray = new byte[1024];
        try {
            int n2 = 0;
            InputStream inputStream = this.a.getInputStream();
            while ((n2 = inputStream.read(byArray)) > 0) {
            }
            inputStream.close();
        }
        catch (Exception exception) {
            try {
                InputStream inputStream = this.a.getErrorStream();
                int n3 = 0;
                if (inputStream == null) {
                    return;
                }
                while ((n3 = inputStream.read(byArray)) > 0) {
                }
                inputStream.close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }

    protected bvh e() {
        if (!this.c) {
            bvh bvh2 = this.f();
            this.c = true;
            return bvh2;
        }
        return this;
    }

    protected abstract bvh f();

    public static bvh a(String string) {
        return new bvj(string, 5000, 10000);
    }

    public static bvh a(String string, int n2, int n3) {
        return new bvj(string, n2, n3);
    }

    public static bvh c(String string, String string2) {
        return new bvk(string, string2.getBytes(), 5000, 10000);
    }

    public static bvh a(String string, String string2, int n2, int n3) {
        return new bvk(string, string2.getBytes(), n2, n3);
    }

    public static bvh b(String string) {
        return new bvi(string, 5000, 10000);
    }

    public static bvh d(String string, String string2) {
        return new bvl(string, string2.getBytes(), 5000, 10000);
    }

    public static bvh b(String string, String string2, int n2, int n3) {
        return new bvl(string, string2.getBytes(), n2, n3);
    }

    public int g() {
        try {
            String string = this.a.getHeaderField("Error-Code");
            return Integer.valueOf(string);
        }
        catch (Exception exception) {
            return -1;
        }
    }

    public String h() {
        try {
            return this.a.getHeaderField("Error-Msg");
        }
        catch (Exception exception) {
            return "";
        }
    }
}

