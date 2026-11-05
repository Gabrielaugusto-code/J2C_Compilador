/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufInputStream
 *  io.netty.buffer.Unpooled
 *  io.netty.handler.codec.base64.Base64
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.base.Charsets;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class bgw
implements bbb {
    private static final Logger a = LogManager.getLogger();
    private static final ThreadPoolExecutor b = new ScheduledThreadPoolExecutor(5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).build());
    private final bgt c;
    private final azi d;
    private final bki e;
    private long f;
    private String g;
    private bqj h;
    private brq i;

    protected bgw(bgt bgt2, bki bki2) {
        this.c = bgt2;
        this.e = bki2;
        this.d = azi.B();
        this.i = new brq("servers/" + bki2.b + "/icon");
        this.h = (bqj)this.d.P().b(this.i);
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, bna bna2, int n7, int n8, boolean bl2) {
        String string;
        int n9;
        if (!this.e.h) {
            this.e.h = true;
            this.e.e = -2L;
            this.e.d = "";
            this.e.c = "";
            b.submit(new bgx(this));
        }
        boolean bl3 = this.e.f > 4;
        boolean bl4 = this.e.f < 4;
        boolean bl5 = bl3 || bl4;
        this.d.l.b(this.e.a, n3 + 32 + 3, n4 + 1, 0xFFFFFF);
        List list = this.d.l.c(this.e.d, n5 - 32 - 2);
        for (int i2 = 0; i2 < Math.min(list.size(), 2); ++i2) {
            this.d.l.b((String)list.get(i2), n3 + 32 + 3, n4 + 12 + this.d.l.a * i2, 0x808080);
        }
        String string2 = bl5 ? (Object)((Object)a.e) + this.e.g : this.e.c;
        int n10 = this.d.l.a(string2);
        this.d.l.b(string2, n3 + n5 - n10 - 15 - 2, n4 + 1, 0x808080);
        int n11 = 0;
        String string3 = null;
        if (bl5) {
            n9 = 5;
            string = bl3 ? "Client out of date!" : "Server out of date!";
            string3 = this.e.i;
        } else if (this.e.h && this.e.e != -2L) {
            n9 = this.e.e < 0L ? 5 : (this.e.e < 150L ? 0 : (this.e.e < 300L ? 1 : (this.e.e < 600L ? 2 : (this.e.e < 1000L ? 3 : 4))));
            if (this.e.e < 0L) {
                string = "(no connection)";
            } else {
                string = this.e.e + "ms";
                string3 = this.e.i;
            }
        } else {
            n11 = 1;
            n9 = (int)(azi.K() / 100L + (long)(n2 * 2) & 7L);
            if (n9 > 4) {
                n9 = 8 - n9;
            }
            string = "Pinging...";
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.d.P().a(bap.d);
        bap.a(n3 + n5 - 15, n4, n11 * 10, 176 + n9 * 8, 10, 8, 256.0f, 256.0f);
        if (this.e.e() != null && !this.e.e().equals(this.g)) {
            this.g = this.e.e();
            this.b();
            this.c.p().b();
        }
        if (this.h != null) {
            this.d.P().a(this.i);
            bap.a(n3, n4, 0.0f, 0.0f, 32, 32, 32.0f, 32.0f);
        }
        int n12 = n7 - n3;
        int n13 = n8 - n4;
        if (n12 >= n5 - 15 && n12 <= n5 - 5 && n13 >= 0 && n13 <= 8) {
            this.c.a(string);
        } else if (n12 >= n5 - n10 - 15 - 2 && n12 <= n5 - 15 - 2 && n13 >= 0 && n13 <= 8) {
            this.c.a(string3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b() {
        if (this.e.e() == null) {
            this.d.P().c(this.i);
            this.h = null;
        } else {
            BufferedImage bufferedImage;
            ByteBuf byteBuf = Unpooled.copiedBuffer((CharSequence)this.e.e(), (Charset)Charsets.UTF_8);
            ByteBuf byteBuf2 = Base64.decode((ByteBuf)byteBuf);
            try {
                bufferedImage = ImageIO.read((InputStream)new ByteBufInputStream(byteBuf2));
                Validate.validState((bufferedImage.getWidth() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels wide", (Object[])new Object[0]);
                Validate.validState((bufferedImage.getHeight() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels high", (Object[])new Object[0]);
            }
            catch (Exception exception) {
                a.error("Invalid icon for server " + this.e.a + " (" + this.e.b + ")", (Throwable)exception);
                this.e.a(null);
                return;
            }
            finally {
                byteBuf.release();
                byteBuf2.release();
            }
            if (this.h == null) {
                this.h = new bqj(bufferedImage.getWidth(), bufferedImage.getHeight());
                this.d.P().a(this.i, (bra)this.h);
            }
            bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), this.h.d(), 0, bufferedImage.getWidth());
            this.h.a();
        }
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.c.a(n2);
        if (azi.K() - this.f < 250L) {
            this.c.h();
        }
        this.f = azi.K();
        return false;
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    public bki a() {
        return this.e;
    }

    static /* synthetic */ bki a(bgw bgw2) {
        return bgw2.e;
    }

    static /* synthetic */ bgt b(bgw bgw2) {
        return bgw2.c;
    }
}

