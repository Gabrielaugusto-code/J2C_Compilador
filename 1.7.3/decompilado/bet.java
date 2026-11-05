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
import java.net.URI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class bet
extends bcl {
    private static final Logger a = LogManager.getLogger();
    private bcl f;
    private static int g = 111;
    private volatile bvu h;
    private boolean i = false;

    public bet(bcl bcl2) {
        this.f = bcl2;
    }

    @Override
    public void c() {
        super.c();
    }

    @Override
    public void r_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        int n2 = 212;
        this.n.add(new bau(g, this.l / 2 - n2 / 2, 180, n2, 20, bsc.a("gui.back", new Object[0])));
        this.h();
    }

    private void h() {
        bal bal2 = this.k.M();
        bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
        bgl.a.submit(new beu(this, bvf2));
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
        if (bau2.k == g) {
            this.k.a(this.f);
        }
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        if (this.i) {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(this.h.b()), null);
            this.a(this.h.b());
        }
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
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, bsc.a("mco.buy.realms.title", new Object[0]), this.l / 2, 11, 0xFFFFFF);
        if (this.h == null) {
            return;
        }
        String[] stringArray = this.h.a().split("\n");
        int n4 = 52;
        for (String n7 : stringArray) {
            this.a(this.q, n7, this.l / 2, n4, 0xA0A0A0);
            n4 += 18;
        }
        if (this.h.b() != null) {
            String string = this.h.b();
            int n5 = 0x3366BB;
            int n6 = 7107012;
            int n7 = this.q.a(string);
            int n8 = this.l / 2 - n7 / 2 - 1;
            int n9 = (n4 += 18) - 1;
            int n10 = n8 + n7 + 1;
            int n11 = n4 + 1 + this.q.a;
            if (n8 <= n2 && n2 <= n10 && n9 <= n3 && n3 <= n11) {
                this.i = true;
                this.b(this.q, "\u00a7n" + string, this.l / 2 - n7 / 2, n4, n6);
            } else {
                this.i = false;
                this.b(this.q, string, this.l / 2 - n7 / 2, n4, n5);
            }
        }
        super.a(n2, n3, f2);
    }

    static /* synthetic */ bvu a(bet bet2, bvu bvu2) {
        bet2.h = bvu2;
        return bet2.h;
    }

    static /* synthetic */ Logger g() {
        return a;
    }
}

