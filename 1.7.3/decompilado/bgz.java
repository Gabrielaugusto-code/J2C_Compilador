/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.Sys
 */
import com.google.common.collect.Lists;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.Sys;

public class bgz
extends bcl {
    private static final Logger a = LogManager.getLogger();
    private bcl f;
    private List g;
    private List h;
    private bhd i;
    private bhf r;

    public bgz(bcl bcl2) {
        this.f = bcl2;
    }

    @Override
    public void r_() {
        this.n.add(new bbc(2, this.l / 2 - 154, this.m - 48, bsc.a("resourcePack.openFolder", new Object[0])));
        this.n.add(new bbc(1, this.l / 2 + 4, this.m - 48, bsc.a("gui.done", new Object[0])));
        this.g = new ArrayList();
        this.h = new ArrayList();
        brv brv2 = this.k.R();
        brv2.a();
        ArrayList arrayList = Lists.newArrayList((Iterable)brv2.b());
        arrayList.removeAll(brv2.c());
        for (bry bry2 : arrayList) {
            this.g.add(new bhc(this, bry2));
        }
        for (bry bry2 : Lists.reverse((List)brv2.c())) {
            this.h.add(new bhc(this, bry2));
        }
        this.h.add(new bhb(this));
        this.i = new bhd(this.k, 200, this.m, this.g);
        this.i.g(this.l / 2 - 4 - 200);
        this.i.d(7, 8);
        this.r = new bhf(this.k, 200, this.m, this.h);
        this.r.g(this.l / 2 + 4);
        this.r.d(7, 8);
    }

    public boolean a(bha bha2) {
        return this.h.contains(bha2);
    }

    public List b(bha bha2) {
        if (this.a(bha2)) {
            return this.h;
        }
        return this.g;
    }

    public List g() {
        return this.g;
    }

    public List h() {
        return this.h;
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 2) {
            File file = this.k.R().d();
            String string = file.getAbsolutePath();
            if (u.a() == v.d) {
                try {
                    a.info(string);
                    Runtime.getRuntime().exec(new String[]{"/usr/bin/open", string});
                    return;
                }
                catch (IOException iOException) {
                    a.error("Couldn't open file", (Throwable)iOException);
                }
            } else if (u.a() == v.c) {
                String string2 = String.format("cmd.exe /C start \"Open file\" \"%s\"", string);
                try {
                    Runtime.getRuntime().exec(string2);
                    return;
                }
                catch (IOException iOException) {
                    a.error("Couldn't open file", (Throwable)iOException);
                }
            }
            boolean bl2 = false;
            try {
                Class<?> clazz = Class.forName("java.awt.Desktop");
                Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                clazz.getMethod("browse", URI.class).invoke(object, file.toURI());
            }
            catch (Throwable throwable) {
                a.error("Couldn't open link", throwable);
                bl2 = true;
            }
            if (bl2) {
                a.info("Opening via system class!");
                Sys.openURL((String)("file://" + string));
            }
        } else if (bau2.k == 1) {
            ArrayList arrayList = Lists.newArrayList();
            for (Object object : this.h) {
                if (!(object instanceof bhc)) continue;
                arrayList.add(((bhc)object).i());
            }
            Collections.reverse(arrayList);
            this.k.R().a(arrayList);
            this.k.u.l.clear();
            for (Object object : arrayList) {
                this.k.u.l.add(((bry)object).d());
            }
            this.k.u.b();
            this.k.c();
            this.k.a(this.f);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.i.a(n2, n3, n4);
        this.r.a(n2, n3, n4);
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        super.b(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.c(0);
        this.i.a(n2, n3, f2);
        this.r.a(n2, n3, f2);
        this.a(this.q, bsc.a("resourcePack.title", new Object[0]), this.l / 2, 16, 0xFFFFFF);
        this.a(this.q, bsc.a("resourcePack.folderInfo", new Object[0]), this.l / 2 - 77, this.m - 26, 0x808080);
        super.a(n2, n3, f2);
    }
}

