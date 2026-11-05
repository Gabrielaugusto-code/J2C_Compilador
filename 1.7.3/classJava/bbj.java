/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 *  tv.twitch.chat.ChatUserInfo
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import tv.twitch.chat.ChatUserInfo;

public class bbj
extends bcl {
    private static final Set f = Sets.newHashSet((Object[])new String[]{"http", "https"});
    private static final Logger g = LogManager.getLogger();
    private String h = "";
    private int i = -1;
    private boolean r;
    private boolean s;
    private int t;
    private List u = new ArrayList();
    private URI v;
    protected baw a;
    private String w = "";

    public bbj() {
    }

    public bbj(String string) {
        this.w = string;
    }

    @Override
    public void r_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.i = this.k.r.b().c().size();
        this.a = new baw(this.q, 4, this.m - 12, this.l - 4, 12);
        this.a.f(100);
        this.a.a(false);
        this.a.b(true);
        this.a.a(this.w);
        this.a.d(false);
    }

    @Override
    public void b() {
        Keyboard.enableRepeatEvents((boolean)false);
        this.k.r.b().d();
    }

    @Override
    public void c() {
        this.a.a();
    }

    @Override
    protected void a(char c2, int n2) {
        this.s = false;
        if (n2 == 15) {
            this.p_();
        } else {
            this.r = false;
        }
        if (n2 == 1) {
            this.k.a((bcl)null);
        } else if (n2 == 28 || n2 == 156) {
            String string = this.a.b().trim();
            if (string.length() > 0) {
                this.a(string);
            }
            this.k.a((bcl)null);
        } else if (n2 == 200) {
            this.a(-1);
        } else if (n2 == 208) {
            this.a(1);
        } else if (n2 == 201) {
            this.k.r.b().b(this.k.r.b().i() - 1);
        } else if (n2 == 209) {
            this.k.r.b().b(-this.k.r.b().i() + 1);
        } else {
            this.a.a(c2, n2);
        }
    }

    public void a(String string) {
        this.k.r.b().a(string);
        this.k.h.a(string);
    }

    @Override
    public void d() {
        super.d();
        int n2 = Mouse.getEventDWheel();
        if (n2 != 0) {
            if (n2 > 1) {
                n2 = 1;
            }
            if (n2 < -1) {
                n2 = -1;
            }
            if (!bbj.n()) {
                n2 *= 7;
            }
            this.k.r.b().b(n2);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        ey ey2;
        fa fa2;
        if (n4 == 0 && this.k.u.o && (fa2 = this.k.r.b().a(Mouse.getX(), Mouse.getY())) != null && (ey2 = fa2.b().h()) != null) {
            block19: {
                if (bbj.n()) {
                    this.a.b(fa2.e());
                } else if (ey2.a() == ez.a) {
                    try {
                        URI uRI = new URI(ey2.b());
                        if (!f.contains(uRI.getScheme().toLowerCase())) {
                            throw new URISyntaxException(ey2.b(), "Unsupported protocol: " + uRI.getScheme().toLowerCase());
                        }
                        if (this.k.u.p) {
                            this.v = uRI;
                            this.k.a(new bbk((bcl)this, ey2.b(), 0, false));
                            break block19;
                        }
                        this.a(uRI);
                    }
                    catch (URISyntaxException uRISyntaxException) {
                        g.error("Can't open url for " + ey2, (Throwable)uRISyntaxException);
                    }
                } else if (ey2.a() == ez.b) {
                    URI uRI = new File(ey2.b()).toURI();
                    this.a(uRI);
                } else if (ey2.a() == ez.e) {
                    this.a.a(ey2.b());
                } else if (ey2.a() == ez.c) {
                    this.a(ey2.b());
                } else if (ey2.a() == ez.d) {
                    ChatUserInfo chatUserInfo = this.k.Z().a(ey2.b());
                    if (chatUserInfo != null) {
                        this.k.a(new bhm(this.k.Z(), chatUserInfo));
                    } else {
                        g.error("Tried to handle twitch user but couldn't find them!");
                    }
                } else {
                    g.error("Don't know how to handle " + ey2);
                }
            }
            return;
        }
        this.a.a(n2, n3, n4);
        super.a(n2, n3, n4);
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (n2 == 0) {
            if (bl2) {
                this.a(this.v);
            }
            this.v = null;
            this.k.a(this);
        }
    }

    private void a(URI uRI) {
        try {
            Class<?> clazz = Class.forName("java.awt.Desktop");
            Object object = clazz.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
            clazz.getMethod("browse", URI.class).invoke(object, uRI);
        }
        catch (Throwable throwable) {
            g.error("Couldn't open link", throwable);
        }
    }

    public void p_() {
        if (this.r) {
            this.a.b(this.a.a(-1, this.a.h(), false) - this.a.h());
            if (this.t >= this.u.size()) {
                this.t = 0;
            }
        } else {
            int n2 = this.a.a(-1, this.a.h(), false);
            this.u.clear();
            this.t = 0;
            String string = this.a.b().substring(n2).toLowerCase();
            String string2 = this.a.b().substring(0, this.a.h());
            this.a(string2, string);
            if (this.u.isEmpty()) {
                return;
            }
            this.r = true;
            this.a.b(n2 - this.a.h());
        }
        if (this.u.size() > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String string2 : this.u) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(string2);
            }
            this.k.r.b().a(new fh(stringBuilder.toString()), 1);
        }
        this.a.b((String)this.u.get(this.t++));
    }

    private void a(String string, String string2) {
        if (string.length() < 1) {
            return;
        }
        this.k.h.a.a(new ih(string));
        this.s = true;
    }

    public void a(int n2) {
        int n3 = this.i + n2;
        int n4 = this.k.r.b().c().size();
        if (n3 < 0) {
            n3 = 0;
        }
        if (n3 > n4) {
            n3 = n4;
        }
        if (n3 == this.i) {
            return;
        }
        if (n3 == n4) {
            this.i = n4;
            this.a.a(this.h);
            return;
        }
        if (this.i == n4) {
            this.h = this.a.b();
        }
        this.a.a((String)this.k.r.b().c().get(n3));
        this.i = n3;
    }

    @Override
    public void a(int n2, int n3, float f2) {
        bbj.a(2, this.m - 14, this.l - 2, this.m - 2, Integer.MIN_VALUE);
        this.a.f();
        fa fa2 = this.k.r.b().a(Mouse.getX(), Mouse.getY());
        if (fa2 != null && fa2.b().i() != null) {
            fc fc2 = fa2.b().i();
            if (fc2.a() == fd.c) {
                abu abu2 = null;
                try {
                    du du2 = dx.a(fc2.b().c());
                    if (du2 != null && du2 instanceof dg) {
                        abu2 = abu.a((dg)du2);
                    }
                }
                catch (dw dw2) {
                    // empty catch block
                }
                if (abu2 != null) {
                    this.a(abu2, n2, n3);
                } else {
                    this.a((Object)((Object)a.m) + "Invalid Item!", n2, n3);
                }
            } else if (fc2.a() == fd.a) {
                this.a(Splitter.on((String)"\n").splitToList((CharSequence)fc2.b().d()), n2, n3);
            } else if (fc2.a() == fd.b) {
                ny ny2 = og.a(fc2.b().c());
                if (ny2 != null) {
                    fa fa3 = ny2.e();
                    fi fi2 = new fi("stats.tooltip.type." + (ny2.d() ? "achievement" : "statistic"), new Object[0]);
                    fi2.b().b(true);
                    String string = ny2 instanceof ns ? ((ns)ny2).f() : null;
                    ArrayList arrayList = Lists.newArrayList((Object[])new String[]{fa3.d(), fi2.d()});
                    if (string != null) {
                        arrayList.addAll(this.q.c(string, 150));
                    }
                    this.a(arrayList, n2, n3);
                } else {
                    this.a((Object)((Object)a.m) + "Invalid statistic/achievement!", n2, n3);
                }
            }
            GL11.glDisable((int)2896);
        }
        super.a(n2, n3, f2);
    }

    public void a(String[] stringArray) {
        if (this.s) {
            this.r = false;
            this.u.clear();
            for (String string : stringArray) {
                if (string.length() <= 0) continue;
                this.u.add(string);
            }
            String string = this.a.b().substring(this.a.a(-1, this.a.h(), false));
            String string2 = StringUtils.getCommonPrefix((String[])stringArray);
            if (string2.length() > 0 && !string.equalsIgnoreCase(string2)) {
                this.a.b(this.a.a(-1, this.a.h(), false) - this.a.h());
                this.a.b(string2);
            } else if (this.u.size() > 0) {
                this.r = true;
                this.p_();
            }
        }
    }

    @Override
    public boolean f() {
        return false;
    }
}

