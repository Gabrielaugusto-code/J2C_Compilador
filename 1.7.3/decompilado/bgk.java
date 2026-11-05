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

public class bgk
extends bcl {
    private static final Logger a = LogManager.getLogger();
    private final bcl f;
    private final bvo g;
    private bau h;
    private boolean i = false;
    private String r = "https://minecraft.net/realms/terms";

    public bgk(bcl bcl2, bvo bvo2) {
        this.f = bcl2;
        this.g = bvo2;
    }

    @Override
    public void c() {
    }

    @Override
    public void r_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        int n2 = this.l / 4;
        int n3 = this.l / 4 - 2;
        int n4 = this.l / 2 + 4;
        this.h = new bau(1, n2, this.m / 5 + 96 + 22, n3, 20, bsc.a("mco.terms.buttons.agree", new Object[0]));
        this.n.add(this.h);
        this.n.add(new bau(2, n4, this.m / 5 + 96 + 22, n3, 20, bsc.a("mco.terms.buttons.disagree", new Object[0])));
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
        if (bau2.k == 2) {
            this.k.a(this.f);
        } else if (bau2.k == 1) {
            this.g();
        }
    }

    private void g() {
        bal bal2 = this.k.M();
        bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
        try {
            bvf2.i();
            bfh bfh2 = new bfh(this.k, this.f, new bfo(this.f, this.g));
            bfh2.g();
            this.k.a(bfh2);
        }
        catch (bwa bwa2) {
            a.error("Couldn't agree to TOS");
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        if (this.i) {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(this.r), null);
            this.a(this.r);
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
        this.a(this.q, bsc.a("mco.terms.title", new Object[0]), this.l / 2, 17, 0xFFFFFF);
        this.b(this.q, bsc.a("mco.terms.sentence.1", new Object[0]), this.l / 2 - 120, 87, 0xFFFFFF);
        int n4 = this.q.a(bsc.a("mco.terms.sentence.1", new Object[0]));
        int n5 = 0x3366BB;
        int n6 = 7107012;
        int n7 = this.l / 2 - 121 + n4;
        int n8 = 86;
        int n9 = n7 + this.q.a("mco.terms.sentence.2") + 1;
        int n10 = 87 + this.q.a;
        if (n7 <= n2 && n2 <= n9 && n8 <= n3 && n3 <= n10) {
            this.i = true;
            this.b(this.q, " " + bsc.a("mco.terms.sentence.2", new Object[0]), this.l / 2 - 120 + n4, 87, n6);
        } else {
            this.i = false;
            this.b(this.q, " " + bsc.a("mco.terms.sentence.2", new Object[0]), this.l / 2 - 120 + n4, 87, n5);
        }
        super.a(n2, n3, f2);
    }
}

