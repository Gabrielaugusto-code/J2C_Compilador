/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 */
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class bgs
extends bcl {
    private static final Logger a = LogManager.getLogger();
    private final bcl f;
    private final bvo g;
    private final int h = 0;
    private int i;
    private String r;
    private final String s = "https://account.mojang.com";
    private final String t = "/buy/realms";
    private boolean u;

    public bgs(bcl bcl2, bvo bvo2) {
        this.f = bcl2;
        this.g = bvo2;
    }

    @Override
    public void c() {
    }

    @Override
    public void r_() {
        this.a(this.g.a);
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.add(new bau(0, this.l / 2 - 100, this.m / 4 + 120 + 12, bsc.a("gui.cancel", new Object[0])));
    }

    private void a(long l2) {
        bal bal2 = this.k.M();
        bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
        try {
            bvv bvv2 = bvf2.g(l2);
            this.i = bvv2.b;
            this.r = this.b(bvv2.a);
        }
        catch (bwa bwa2) {
            a.error("Couldn't get subscription");
            this.k.a(new bgh(bwa2, this));
        }
        catch (IOException iOException) {
            a.error("Couldn't parse response subscribing");
        }
    }

    private String b(long l2) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
        gregorianCalendar.setTimeInMillis(l2);
        return SimpleDateFormat.getDateTimeInstance().format(gregorianCalendar.getTime());
    }

    @Override
    public void b() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 0) {
            this.k.a(this.f);
        }
    }

    private String g() {
        String string = this.k.M().a();
        String[] stringArray = string.split(":");
        if (stringArray.length == 3) {
            return stringArray[2];
        }
        return "";
    }

    private void a(String string) {
        try {
            URI uRI = new URI(string);
            Class<?> clazz = Class.forName("java.awt.Desktop");
            Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
            clazz.getMethod("browse", URI.class).invoke(object, uRI);
        }
        catch (Throwable throwable) {
            a.error("Couldn't open link");
        }
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        if (this.u) {
            String string = "https://account.mojang.com/buy/realms?wid=" + this.g.a + "?pid=" + this.g();
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(string), null);
            this.a(string);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, bsc.a("mco.configure.world.subscription.title", new Object[0]), this.l / 2, 17, 0xFFFFFF);
        this.b(this.q, bsc.a("mco.configure.world.subscription.start", new Object[0]), this.l / 2 - 100, 53, 0xA0A0A0);
        this.b(this.q, this.r, this.l / 2 - 100, 66, 0xFFFFFF);
        this.b(this.q, bsc.a("mco.configure.world.subscription.daysleft", new Object[0]), this.l / 2 - 100, 85, 0xA0A0A0);
        this.b(this.q, this.h(), this.l / 2 - 100, 98, 0xFFFFFF);
        this.b(this.q, bsc.a("mco.configure.world.subscription.extendHere", new Object[0]), this.l / 2 - 100, 117, 0xA0A0A0);
        String string = "https://account.mojang.com/buy/realms";
        int n4 = 0x3366BB;
        int n5 = 7107012;
        int n6 = 130;
        int n7 = this.q.a(string);
        int n8 = this.l / 2 - n7 / 2 - 1;
        int n9 = n6 - 1;
        int n10 = n8 + n7 + 1;
        int n11 = n6 + 1 + this.q.a;
        if (n8 <= n2 && n2 <= n10 && n9 <= n3 && n3 <= n11) {
            this.u = true;
            this.b(this.q, "\u00a7n" + string, this.l / 2 - n7 / 2, n6, n5);
        } else {
            this.u = false;
            this.b(this.q, string, this.l / 2 - n7 / 2, n6, n4);
        }
        super.a(n2, n3, f2);
    }

    private String h() {
        return this.i >= 0 ? String.valueOf(this.i) : "Expired";
    }
}

