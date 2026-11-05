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
import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class bep
extends bcl {
    private static final Logger a = LogManager.getLogger();
    private final bew f;
    private final long g;
    private List h = Collections.emptyList();
    private ber i;
    private int r = -1;

    public bep(bew bew2, long l2) {
        this.f = bew2;
        this.g = l2;
    }

    @Override
    public void r_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        this.i = new ber(this);
        bgl.a.submit(new beq(this));
        this.h();
    }

    private void h() {
        this.n.add(new bau(2, this.l / 2 + 6, this.m - 52, 153, 20, bsc.a("mco.backup.button.download", new Object[0])));
        this.n.add(new bau(1, this.l / 2 - 154, this.m - 52, 153, 20, bsc.a("mco.backup.button.restore", new Object[0])));
        this.n.add(new bau(0, this.l / 2 - 74, this.m - 52 + 25, 153, 20, bsc.a("gui.back", new Object[0])));
    }

    @Override
    public void c() {
        super.c();
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 1) {
            this.i();
        } else if (bau2.k == 0) {
            this.k.a(this.f);
        } else if (bau2.k == 2) {
            this.p();
        } else {
            this.i.a(bau2);
        }
    }

    private void i() {
        if (this.r >= 0 && this.r < this.h.size()) {
            Date date = ((bvm)this.h.get((int)this.r)).b;
            String string = DateFormat.getDateTimeInstance(3, 3).format(date);
            String string2 = this.a(System.currentTimeMillis() - date.getTime());
            String string3 = bsc.a("mco.configure.world.restore.question.line1", new Object[0]) + " '" + string + "' (" + string2 + ")";
            String string4 = bsc.a("mco.configure.world.restore.question.line2", new Object[0]);
            this.k.a(new bff(this, bfg.a, string3, string4, 1));
        }
    }

    private void p() {
        String string = bsc.a("mco.configure.world.restore.download.question.line1", new Object[0]);
        String string2 = bsc.a("mco.configure.world.restore.download.question.line2", new Object[0]);
        this.k.a(new bff(this, bfg.b, string, string2, 2));
    }

    private void q() {
        bal bal2 = this.k.M();
        bvf bvf2 = new bvf(bal2.a(), bal2.c(), "1.7.3", azi.B().O());
        try {
            String string = bvf2.h(this.g);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(string), null);
            this.a(string);
            this.k.a(this);
        }
        catch (bwa bwa2) {
            a.error("Couldn't download world data");
            this.k.a(new bgh(bwa2, this));
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
    public void a(boolean bl2, int n2) {
        if (bl2 && n2 == 1) {
            this.r();
        } else if (bl2 && n2 == 2) {
            this.q();
        }
    }

    private void r() {
        bvm bvm2 = (bvm)this.h.get(this.r);
        bes bes2 = new bes(this, bvm2, null);
        bfh bfh2 = new bfh(this.k, this.f, bes2);
        bfh2.g();
        this.k.a(bfh2);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.i.a(n2, n3, f2);
        this.a(this.q, bsc.a("mco.backup.title", new Object[0]), this.l / 2, 20, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    private String a(Long l2) {
        if (l2 < 0L) {
            return "right now";
        }
        long l3 = l2 / 1000L;
        if (l3 < 60L) {
            return (l3 == 1L ? "1 second" : l3 + " seconds") + " ago";
        }
        if (l3 < 3600L) {
            long l4 = l3 / 60L;
            return (l4 == 1L ? "1 minute" : l4 + " minutes") + " ago";
        }
        if (l3 < 86400L) {
            long l5 = l3 / 3600L;
            return (l5 == 1L ? "1 hour" : l5 + " hours") + " ago";
        }
        long l6 = l3 / 86400L;
        return (l6 == 1L ? "1 day" : l6 + " days") + " ago";
    }

    static /* synthetic */ azi a(bep bep2) {
        return bep2.k;
    }

    static /* synthetic */ List a(bep bep2, List list) {
        bep2.h = list;
        return bep2.h;
    }

    static /* synthetic */ long b(bep bep2) {
        return bep2.g;
    }

    static /* synthetic */ Logger g() {
        return a;
    }

    static /* synthetic */ azi c(bep bep2) {
        return bep2.k;
    }

    static /* synthetic */ bew d(bep bep2) {
        return bep2.f;
    }

    static /* synthetic */ azi e(bep bep2) {
        return bep2.k;
    }

    static /* synthetic */ azi f(bep bep2) {
        return bep2.k;
    }

    static /* synthetic */ List g(bep bep2) {
        return bep2.h;
    }

    static /* synthetic */ int a(bep bep2, int n2) {
        bep2.r = n2;
        return bep2.r;
    }

    static /* synthetic */ int h(bep bep2) {
        return bep2.r;
    }

    static /* synthetic */ ban i(bep bep2) {
        return bep2.q;
    }

    static /* synthetic */ String a(bep bep2, Long l2) {
        return bep2.a(l2);
    }

    static /* synthetic */ ban j(bep bep2) {
        return bep2.q;
    }
}

