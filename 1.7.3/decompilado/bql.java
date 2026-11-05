/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.BufferedImage;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;

class bql
extends Thread {
    final /* synthetic */ bqk a;

    bql(bqk bqk2, String string) {
        this.a = bqk2;
        super(string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = (HttpURLConnection)new URL(bqk.a(this.a)).openConnection(azi.B().O());
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() / 100 != 2) {
                return;
            }
            BufferedImage bufferedImage = ImageIO.read(httpURLConnection.getInputStream());
            if (bqk.b(this.a) != null) {
                bufferedImage = bqk.b(this.a).a(bufferedImage);
            }
            this.a.a(bufferedImage);
        }
        catch (Exception exception) {
            bqk.d().error("Couldn't download http texture", (Throwable)exception);
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }
}

