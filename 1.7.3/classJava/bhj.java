/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLContext
 *  tv.twitch.ErrorCode
 */
import com.google.common.collect.Lists;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import tv.twitch.ErrorCode;

public class bhj
extends bcl {
    private static final Logger a = LogManager.getLogger();
    private final fa f = new fi("stream.unavailable.title", new Object[0]);
    private final bcl g;
    private final bhl h;
    private final List i;
    private final List r = Lists.newArrayList();

    public bhj(bcl bcl2, bhl bhl2) {
        this(bcl2, bhl2, null);
    }

    public bhj(bcl bcl2, bhl bhl2, List list) {
        this.g = bcl2;
        this.h = bhl2;
        this.i = list;
    }

    @Override
    public void r_() {
        if (this.r.isEmpty()) {
            this.r.addAll(this.q.c(this.h.a().d(), (int)((float)this.l * 0.75f)));
            if (this.i != null) {
                this.r.add("");
                for (fi fi2 : this.i) {
                    this.r.add(fi2.e());
                }
            }
        }
        if (this.h.b() != null) {
            this.n.add(new bau(0, this.l / 2 - 155, this.m - 50, 150, 20, bsc.a("gui.cancel", new Object[0])));
            this.n.add(new bau(1, this.l / 2 - 155 + 160, this.m - 50, 150, 20, bsc.a(this.h.b().d(), new Object[0])));
        } else {
            this.n.add(new bau(0, this.l / 2 - 75, this.m - 50, 150, 20, bsc.a("gui.cancel", new Object[0])));
        }
    }

    @Override
    public void b() {
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        int n4 = Math.max((int)((double)this.m * 0.85 / 2.0 - (double)((float)(this.r.size() * this.q.a) / 2.0f)), 50);
        this.a(this.q, this.f.d(), this.l / 2, n4 - this.q.a * 2, 0xFFFFFF);
        for (String string : this.r) {
            this.a(this.q, string, this.l / 2, n4, 0xA0A0A0);
            n4 += this.q.a;
        }
        super.a(n2, n3, f2);
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 1) {
            switch (this.h) {
                case h: 
                case i: {
                    this.a("https://account.mojang.com/me/settings");
                    break;
                }
                case g: {
                    this.a("https://account.mojang.com/migrate");
                    break;
                }
                case e: {
                    this.a("http://www.apple.com/osx/");
                    break;
                }
                case l: 
                case c: 
                case k: {
                    this.a("http://mojang.atlassian.net/browse/MC");
                }
            }
        }
        this.k.a(this.g);
    }

    private void a(String string) {
        try {
            Class<?> clazz = Class.forName("java.awt.Desktop");
            Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
            clazz.getMethod("browse", URI.class).invoke(object, new URI(string));
        }
        catch (Throwable throwable) {
            a.error("Couldn't open link", throwable);
        }
    }

    public static void a(bcl bcl2) {
        azi azi2 = azi.B();
        buz buz2 = azi2.Z();
        if (!bwg.n) {
            ArrayList arrayList = Lists.newArrayList();
            arrayList.add(new fi("stream.unavailable.no_fbo.version", GL11.glGetString((int)7938)));
            arrayList.add(new fi("stream.unavailable.no_fbo.blend", GLContext.getCapabilities().GL_EXT_blend_func_separate));
            arrayList.add(new fi("stream.unavailable.no_fbo.arb", GLContext.getCapabilities().GL_ARB_framebuffer_object));
            arrayList.add(new fi("stream.unavailable.no_fbo.ext", GLContext.getCapabilities().GL_EXT_framebuffer_object));
            azi2.a(new bhj(bcl2, bhl.a, arrayList));
        } else if (buz2 instanceof bve) {
            if (((bve)buz2).a().getMessage().contains("Can't load AMD 64-bit .dll on a IA 32-bit platform")) {
                azi2.a(new bhj(bcl2, bhl.b));
            } else {
                azi2.a(new bhj(bcl2, bhl.c));
            }
        } else if (!buz2.D() && buz2.E() == ErrorCode.TTV_EC_OS_TOO_OLD) {
            switch (u.a()) {
                case c: {
                    azi2.a(new bhj(bcl2, bhl.d));
                    break;
                }
                case d: {
                    azi2.a(new bhj(bcl2, bhl.e));
                    break;
                }
                default: {
                    azi2.a(new bhj(bcl2, bhl.f));
                    break;
                }
            }
        } else if (!azi2.N().containsKey((Object)"twitch_access_token")) {
            if (azi2.M().f() == bam.a) {
                azi2.a(new bhj(bcl2, bhl.g));
            } else {
                azi2.a(new bhj(bcl2, bhl.h));
            }
        } else if (!buz2.F()) {
            switch (buz2.H()) {
                case b: {
                    azi2.a(new bhj(bcl2, bhl.i));
                    break;
                }
                default: {
                    azi2.a(new bhj(bcl2, bhl.j));
                    break;
                }
            }
        } else if (buz2.E() != null) {
            List<fi> list = Arrays.asList(new fi("stream.unavailable.initialization_failure.extra", ErrorCode.getString((ErrorCode)buz2.E())));
            azi2.a(new bhj(bcl2, bhl.k, list));
        } else {
            azi2.a(new bhj(bcl2, bhl.l));
        }
    }
}

