/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.Display
 */
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class bac {
    private static final Logger aN = LogManager.getLogger();
    private static final Gson aO = new Gson();
    private static final ParameterizedType aP = new bad();
    private static final String[] aQ = new String[]{"options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large"};
    private static final String[] aR = new String[]{"options.particles.all", "options.particles.decreased", "options.particles.minimal"};
    private static final String[] aS = new String[]{"options.ao.off", "options.ao.min", "options.ao.max"};
    private static final String[] aT = new String[]{"options.stream.compression.low", "options.stream.compression.medium", "options.stream.compression.high"};
    private static final String[] aU = new String[]{"options.stream.chat.enabled.streaming", "options.stream.chat.enabled.always", "options.stream.chat.enabled.never"};
    private static final String[] aV = new String[]{"options.stream.chat.userFilter.all", "options.stream.chat.userFilter.subs", "options.stream.chat.userFilter.mods"};
    private static final String[] aW = new String[]{"options.stream.mic_toggle.mute", "options.stream.mic_toggle.talk"};
    public float a = 0.5f;
    public boolean b;
    public int c = -1;
    public boolean d = true;
    public boolean e;
    public boolean f;
    public boolean g = true;
    public int h = 120;
    public boolean i = true;
    public int j = 2;
    public boolean k = true;
    public List l = new ArrayList();
    public xs m = xs.a;
    public boolean n = true;
    public boolean o = true;
    public boolean p = true;
    public float q = 1.0f;
    public boolean r = true;
    public boolean s = true;
    public boolean t;
    public boolean u = true;
    public boolean v;
    public boolean w;
    public boolean x = true;
    public boolean y = true;
    public boolean z;
    public int A;
    public int B;
    public boolean C = true;
    public float D = 1.0f;
    public float E = 1.0f;
    public float F = 0.44366196f;
    public float G = 1.0f;
    public boolean H = true;
    public int I = 4;
    public int J = 1;
    private Map aX = Maps.newEnumMap(w.class);
    public float K = 0.5f;
    public float L = 1.0f;
    public float M = 1.0f;
    public float N = 0.5412844f;
    public float O = 0.31690142f;
    public int P = 1;
    public boolean Q = true;
    public String R = "";
    public int S = 0;
    public int T = 0;
    public int U = 0;
    public azf V = new azf("key.forward", 17, "key.categories.movement");
    public azf W = new azf("key.left", 30, "key.categories.movement");
    public azf X = new azf("key.back", 31, "key.categories.movement");
    public azf Y = new azf("key.right", 32, "key.categories.movement");
    public azf Z = new azf("key.jump", 57, "key.categories.movement");
    public azf aa = new azf("key.sneak", 42, "key.categories.movement");
    public azf ab = new azf("key.inventory", 18, "key.categories.inventory");
    public azf ac = new azf("key.use", -99, "key.categories.gameplay");
    public azf ad = new azf("key.drop", 16, "key.categories.gameplay");
    public azf ae = new azf("key.attack", -100, "key.categories.gameplay");
    public azf af = new azf("key.pickItem", -98, "key.categories.gameplay");
    public azf ag = new azf("key.sprint", 29, "key.categories.gameplay");
    public azf ah = new azf("key.chat", 20, "key.categories.multiplayer");
    public azf ai = new azf("key.playerlist", 15, "key.categories.multiplayer");
    public azf aj = new azf("key.command", 53, "key.categories.multiplayer");
    public azf ak = new azf("key.screenshot", 60, "key.categories.misc");
    public azf al = new azf("key.togglePerspective", 63, "key.categories.misc");
    public azf am = new azf("key.smoothCamera", 0, "key.categories.misc");
    public azf an = new azf("key.fullscreen", 87, "key.categories.misc");
    public azf ao = new azf("key.streamStartStop", 64, "key.categories.stream");
    public azf ap = new azf("key.streamPauseUnpause", 65, "key.categories.stream");
    public azf aq = new azf("key.streamCommercial", 0, "key.categories.stream");
    public azf ar = new azf("key.streamToggleMic", 0, "key.categories.stream");
    public azf[] as = new azf[]{new azf("key.hotbar.1", 2, "key.categories.inventory"), new azf("key.hotbar.2", 3, "key.categories.inventory"), new azf("key.hotbar.3", 4, "key.categories.inventory"), new azf("key.hotbar.4", 5, "key.categories.inventory"), new azf("key.hotbar.5", 6, "key.categories.inventory"), new azf("key.hotbar.6", 7, "key.categories.inventory"), new azf("key.hotbar.7", 8, "key.categories.inventory"), new azf("key.hotbar.8", 9, "key.categories.inventory"), new azf("key.hotbar.9", 10, "key.categories.inventory")};
    public azf[] at = (azf[])ArrayUtils.addAll((Object[])new azf[]{this.ae, this.ac, this.V, this.W, this.X, this.Y, this.Z, this.aa, this.ad, this.ab, this.ah, this.ai, this.af, this.aj, this.ak, this.al, this.am, this.ag, this.ao, this.ap, this.aq, this.ar, this.an}, (Object[])this.as);
    protected azi au;
    private File aY;
    public pu av = pu.c;
    public boolean aw;
    public int ax;
    public boolean ay;
    public boolean az;
    public String aA = "";
    public boolean aB;
    public boolean aC;
    public boolean aD;
    public float aE = 1.0f;
    public float aF = 1.0f;
    public float aG;
    public float aH;
    public float aI;
    public int aJ;
    public int aK;
    public String aL = "en_US";
    public boolean aM = false;

    public bac(azi azi2, File file) {
        this.au = azi2;
        this.aY = new File(file, "options.txt");
        baf.f.a(16.0f);
        this.c = azi2.V() ? 12 : 8;
        this.a();
    }

    public bac() {
    }

    public static String c(int n2) {
        if (n2 < 0) {
            return bsc.a("key.mouseButton", n2 + 101);
        }
        return Keyboard.getKeyName((int)n2);
    }

    public static boolean a(azf azf2) {
        if (azf2.i() == 0) {
            return false;
        }
        if (azf2.i() < 0) {
            return Mouse.isButtonDown((int)(azf2.i() + 100));
        }
        return Keyboard.isKeyDown((int)azf2.i());
    }

    public void a(azf azf2, int n2) {
        azf2.b(n2);
        this.b();
    }

    public void a(baf baf2, float f2) {
        int n2;
        if (baf2 == baf.b) {
            this.a = f2;
        }
        if (baf2 == baf.c) {
            this.aG = f2;
        }
        if (baf2 == baf.d) {
            this.aH = f2;
        }
        if (baf2 == baf.j) {
            this.h = (int)f2;
        }
        if (baf2 == baf.u) {
            this.q = f2;
            this.au.r.b().b();
        }
        if (baf2 == baf.E) {
            this.G = f2;
            this.au.r.b().b();
        }
        if (baf2 == baf.F) {
            this.F = f2;
            this.au.r.b().b();
        }
        if (baf2 == baf.D) {
            this.E = f2;
            this.au.r.b().b();
        }
        if (baf2 == baf.C) {
            this.D = f2;
            this.au.r.b().b();
        }
        if (baf2 == baf.H) {
            n2 = this.J;
            this.J = (int)f2;
            if ((float)n2 != f2) {
                this.au.T().b(this.J);
                this.au.C();
            }
        }
        if (baf2 == baf.G) {
            n2 = this.I;
            this.I = (int)f2;
            if ((float)n2 != f2) {
                this.au.T().a(this.I);
                this.au.C();
            }
        }
        if (baf2 == baf.f) {
            this.c = (int)f2;
        }
        if (baf2 == baf.J) {
            this.K = f2;
        }
        if (baf2 == baf.K) {
            this.L = f2;
            this.au.Z().s();
        }
        if (baf2 == baf.L) {
            this.M = f2;
            this.au.Z().s();
        }
        if (baf2 == baf.M) {
            this.N = f2;
        }
        if (baf2 == baf.N) {
            this.O = f2;
        }
    }

    public void a(baf baf2, int n2) {
        if (baf2 == baf.a) {
            boolean bl2 = this.b = !this.b;
        }
        if (baf2 == baf.o) {
            this.aJ = this.aJ + n2 & 3;
        }
        if (baf2 == baf.q) {
            this.aK = (this.aK + n2) % 3;
        }
        if (baf2 == baf.g) {
            boolean bl3 = this.d = !this.d;
        }
        if (baf2 == baf.p) {
            boolean bl4 = this.k = !this.k;
        }
        if (baf2 == baf.I) {
            this.aM = !this.aM;
            this.au.l.a(this.au.S().a() || this.aM);
        }
        if (baf2 == baf.i) {
            this.f = !this.f;
            this.au.g.a();
        }
        if (baf2 == baf.k) {
            boolean bl5 = this.g = !this.g;
        }
        if (baf2 == baf.h) {
            this.e = !this.e;
            this.au.c();
        }
        if (baf2 == baf.l) {
            this.av = pu.a(this.av.a() + n2 & 3);
        }
        if (baf2 == baf.m) {
            this.i = !this.i;
            this.au.g.a();
        }
        if (baf2 == baf.n) {
            this.j = (this.j + n2) % 3;
            this.au.g.a();
        }
        if (baf2 == baf.r) {
            this.m = xs.a((this.m.a() + n2) % 3);
        }
        if (baf2 == baf.O) {
            this.P = (this.P + n2) % 3;
        }
        if (baf2 == baf.P) {
            boolean bl6 = this.Q = !this.Q;
        }
        if (baf2 == baf.Q) {
            this.S = (this.S + n2) % 3;
        }
        if (baf2 == baf.R) {
            this.T = (this.T + n2) % 3;
        }
        if (baf2 == baf.S) {
            this.U = (this.U + n2) % 2;
        }
        if (baf2 == baf.s) {
            boolean bl7 = this.n = !this.n;
        }
        if (baf2 == baf.t) {
            boolean bl8 = this.o = !this.o;
        }
        if (baf2 == baf.v) {
            boolean bl9 = this.p = !this.p;
        }
        if (baf2 == baf.w) {
            boolean bl10 = this.r = !this.r;
        }
        if (baf2 == baf.x) {
            boolean bl11 = this.s = !this.s;
        }
        if (baf2 == baf.A) {
            boolean bl12 = this.y = !this.y;
        }
        if (baf2 == baf.B) {
            boolean bl13 = this.z = !this.z;
        }
        if (baf2 == baf.y) {
            boolean bl14 = this.t = !this.t;
            if (this.au.L() != this.t) {
                this.au.o();
            }
        }
        if (baf2 == baf.z) {
            this.u = !this.u;
            Display.setVSyncEnabled((boolean)this.u);
        }
        this.b();
    }

    public float a(baf baf2) {
        if (baf2 == baf.c) {
            return this.aG;
        }
        if (baf2 == baf.d) {
            return this.aH;
        }
        if (baf2 == baf.e) {
            return this.aI;
        }
        if (baf2 == baf.b) {
            return this.a;
        }
        if (baf2 == baf.u) {
            return this.q;
        }
        if (baf2 == baf.E) {
            return this.G;
        }
        if (baf2 == baf.F) {
            return this.F;
        }
        if (baf2 == baf.C) {
            return this.D;
        }
        if (baf2 == baf.D) {
            return this.E;
        }
        if (baf2 == baf.j) {
            return this.h;
        }
        if (baf2 == baf.H) {
            return this.J;
        }
        if (baf2 == baf.G) {
            return this.I;
        }
        if (baf2 == baf.f) {
            return this.c;
        }
        if (baf2 == baf.J) {
            return this.K;
        }
        if (baf2 == baf.K) {
            return this.L;
        }
        if (baf2 == baf.L) {
            return this.M;
        }
        if (baf2 == baf.M) {
            return this.N;
        }
        if (baf2 == baf.N) {
            return this.O;
        }
        return 0.0f;
    }

    public boolean b(baf baf2) {
        switch (baf2) {
            case a: {
                return this.b;
            }
            case g: {
                return this.d;
            }
            case h: {
                return this.e;
            }
            case i: {
                return this.f;
            }
            case k: {
                return this.g;
            }
            case p: {
                return this.k;
            }
            case s: {
                return this.n;
            }
            case t: {
                return this.o;
            }
            case v: {
                return this.p;
            }
            case w: {
                return this.r;
            }
            case x: {
                return this.s;
            }
            case y: {
                return this.t;
            }
            case z: {
                return this.u;
            }
            case A: {
                return this.y;
            }
            case B: {
                return this.z;
            }
            case P: {
                return this.Q;
            }
            case I: {
                return this.aM;
            }
        }
        return false;
    }

    private static String a(String[] stringArray, int n2) {
        if (n2 < 0 || n2 >= stringArray.length) {
            n2 = 0;
        }
        return bsc.a(stringArray[n2], new Object[0]);
    }

    public String c(baf baf2) {
        String string = bsc.a(baf2.d(), new Object[0]) + ": ";
        if (baf2.a()) {
            float f2 = this.a(baf2);
            float f3 = baf2.c(f2);
            if (baf2 == baf.b) {
                if (f3 == 0.0f) {
                    return string + bsc.a("options.sensitivity.min", new Object[0]);
                }
                if (f3 == 1.0f) {
                    return string + bsc.a("options.sensitivity.max", new Object[0]);
                }
                return string + (int)(f3 * 200.0f) + "%";
            }
            if (baf2 == baf.c) {
                if (f3 == 0.0f) {
                    return string + bsc.a("options.fov.min", new Object[0]);
                }
                if (f3 == 1.0f) {
                    return string + bsc.a("options.fov.max", new Object[0]);
                }
                return string + (int)(70.0f + f3 * 40.0f);
            }
            if (baf2 == baf.j) {
                if (f2 == baf.a(baf2)) {
                    return string + bsc.a("options.framerateLimit.max", new Object[0]);
                }
                return string + (int)f2 + " fps";
            }
            if (baf2 == baf.d) {
                if (f3 == 0.0f) {
                    return string + bsc.a("options.gamma.min", new Object[0]);
                }
                if (f3 == 1.0f) {
                    return string + bsc.a("options.gamma.max", new Object[0]);
                }
                return string + "+" + (int)(f3 * 100.0f) + "%";
            }
            if (baf2 == baf.e) {
                return string + (int)(f3 * 400.0f) + "%";
            }
            if (baf2 == baf.u) {
                return string + (int)(f3 * 90.0f + 10.0f) + "%";
            }
            if (baf2 == baf.F) {
                return string + bav.b(f3) + "px";
            }
            if (baf2 == baf.E) {
                return string + bav.b(f3) + "px";
            }
            if (baf2 == baf.D) {
                return string + bav.a(f3) + "px";
            }
            if (baf2 == baf.f) {
                return string + (int)f2 + " chunks";
            }
            if (baf2 == baf.H) {
                if (f2 == 1.0f) {
                    return string + bsc.a("options.off", new Object[0]);
                }
                return string + (int)f2;
            }
            if (baf2 == baf.G) {
                if (f2 == 0.0f) {
                    return string + bsc.a("options.off", new Object[0]);
                }
                return string + (int)f2;
            }
            if (baf2 == baf.N) {
                return string + bvb.a(f3) + " fps";
            }
            if (baf2 == baf.M) {
                return string + bvb.b(f3) + " Kbps";
            }
            if (baf2 == baf.J) {
                return string + String.format("%.3f bpp", Float.valueOf(bvb.c(f3)));
            }
            if (f3 == 0.0f) {
                return string + bsc.a("options.off", new Object[0]);
            }
            return string + (int)(f3 * 100.0f) + "%";
        }
        if (baf2.b()) {
            boolean bl2 = this.b(baf2);
            if (bl2) {
                return string + bsc.a("options.on", new Object[0]);
            }
            return string + bsc.a("options.off", new Object[0]);
        }
        if (baf2 == baf.l) {
            return string + bsc.a(this.av.b(), new Object[0]);
        }
        if (baf2 == baf.o) {
            return string + bac.a(aQ, this.aJ);
        }
        if (baf2 == baf.r) {
            return string + bsc.a(this.m.b(), new Object[0]);
        }
        if (baf2 == baf.q) {
            return string + bac.a(aR, this.aK);
        }
        if (baf2 == baf.n) {
            return string + bac.a(aS, this.j);
        }
        if (baf2 == baf.O) {
            return string + bac.a(aT, this.P);
        }
        if (baf2 == baf.Q) {
            return string + bac.a(aU, this.S);
        }
        if (baf2 == baf.R) {
            return string + bac.a(aV, this.T);
        }
        if (baf2 == baf.S) {
            return string + bac.a(aW, this.U);
        }
        if (baf2 == baf.m) {
            if (this.i) {
                return string + bsc.a("options.graphics.fancy", new Object[0]);
            }
            String string2 = "options.graphics.fast";
            return string + bsc.a("options.graphics.fast", new Object[0]);
        }
        return string;
    }

    public void a() {
        try {
            if (!this.aY.exists()) {
                return;
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.aY));
            String string = "";
            this.aX.clear();
            while ((string = bufferedReader.readLine()) != null) {
                try {
                    String[] stringArray = string.split(":");
                    if (stringArray[0].equals("mouseSensitivity")) {
                        this.a = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals("fov")) {
                        this.aG = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals("gamma")) {
                        this.aH = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals("saturation")) {
                        this.aI = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals("invertYMouse")) {
                        this.b = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("renderDistance")) {
                        this.c = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("guiScale")) {
                        this.aJ = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("particles")) {
                        this.aK = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("bobView")) {
                        this.d = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("anaglyph3d")) {
                        this.e = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("advancedOpengl")) {
                        this.f = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("maxFps")) {
                        this.h = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("fboEnable")) {
                        this.g = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("difficulty")) {
                        this.av = pu.a(Integer.parseInt(stringArray[1]));
                    }
                    if (stringArray[0].equals("fancyGraphics")) {
                        this.i = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("ao")) {
                        this.j = stringArray[1].equals("true") ? 2 : (stringArray[1].equals("false") ? 0 : Integer.parseInt(stringArray[1]));
                    }
                    if (stringArray[0].equals("clouds")) {
                        this.k = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("resourcePacks")) {
                        this.l = (List)aO.fromJson(string.substring(string.indexOf(58) + 1), (Type)aP);
                        if (this.l == null) {
                            this.l = new ArrayList();
                        }
                    }
                    if (stringArray[0].equals("lastServer") && stringArray.length >= 2) {
                        this.aA = string.substring(string.indexOf(58) + 1);
                    }
                    if (stringArray[0].equals("lang") && stringArray.length >= 2) {
                        this.aL = stringArray[1];
                    }
                    if (stringArray[0].equals("chatVisibility")) {
                        this.m = xs.a(Integer.parseInt(stringArray[1]));
                    }
                    if (stringArray[0].equals("chatColors")) {
                        this.n = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("chatLinks")) {
                        this.o = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("chatLinksPrompt")) {
                        this.p = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("chatOpacity")) {
                        this.q = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals("serverTextures")) {
                        this.r = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("snooperEnabled")) {
                        this.s = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("fullscreen")) {
                        this.t = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("enableVsync")) {
                        this.u = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("hideServerAddress")) {
                        this.v = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("advancedItemTooltips")) {
                        this.w = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("pauseOnLostFocus")) {
                        this.x = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("showCape")) {
                        this.y = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("touchscreen")) {
                        this.z = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("overrideHeight")) {
                        this.B = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("overrideWidth")) {
                        this.A = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("heldItemTooltips")) {
                        this.C = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("chatHeightFocused")) {
                        this.G = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals("chatHeightUnfocused")) {
                        this.F = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals("chatScale")) {
                        this.D = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals("chatWidth")) {
                        this.E = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals("showInventoryAchievementHint")) {
                        this.H = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("mipmapLevels")) {
                        this.I = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("anisotropicFiltering")) {
                        this.J = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("streamBytesPerPixel")) {
                        this.K = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals("streamMicVolume")) {
                        this.L = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals("streamSystemVolume")) {
                        this.M = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals("streamKbps")) {
                        this.N = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals("streamFps")) {
                        this.O = this.a(stringArray[1]);
                    }
                    if (stringArray[0].equals("streamCompression")) {
                        this.P = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("streamSendMetadata")) {
                        this.Q = stringArray[1].equals("true");
                    }
                    if (stringArray[0].equals("streamPreferredServer") && stringArray.length >= 2) {
                        this.R = string.substring(string.indexOf(58) + 1);
                    }
                    if (stringArray[0].equals("streamChatEnabled")) {
                        this.S = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("streamChatUserFilter")) {
                        this.T = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("streamMicToggleBehavior")) {
                        this.U = Integer.parseInt(stringArray[1]);
                    }
                    if (stringArray[0].equals("forceUnicodeFont")) {
                        this.aM = stringArray[1].equals("true");
                    }
                    for (azf azf2 : this.at) {
                        if (!stringArray[0].equals("key_" + azf2.g())) continue;
                        azf2.b(Integer.parseInt(stringArray[1]));
                    }
                    for (w w2 : w.values()) {
                        if (!stringArray[0].equals("soundCategory_" + w2.a())) continue;
                        this.aX.put(w2, Float.valueOf(this.a(stringArray[1])));
                    }
                }
                catch (Exception exception) {
                    aN.warn("Skipping bad option: " + string);
                }
            }
            azf.b();
            bufferedReader.close();
        }
        catch (Exception exception) {
            aN.error("Failed to load options", (Throwable)exception);
        }
    }

    private float a(String string) {
        if (string.equals("true")) {
            return 1.0f;
        }
        if (string.equals("false")) {
            return 0.0f;
        }
        return Float.parseFloat(string);
    }

    public void b() {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(this.aY));
            printWriter.println("invertYMouse:" + this.b);
            printWriter.println("mouseSensitivity:" + this.a);
            printWriter.println("fov:" + this.aG);
            printWriter.println("gamma:" + this.aH);
            printWriter.println("saturation:" + this.aI);
            printWriter.println("renderDistance:" + this.c);
            printWriter.println("guiScale:" + this.aJ);
            printWriter.println("particles:" + this.aK);
            printWriter.println("bobView:" + this.d);
            printWriter.println("anaglyph3d:" + this.e);
            printWriter.println("advancedOpengl:" + this.f);
            printWriter.println("maxFps:" + this.h);
            printWriter.println("fboEnable:" + this.g);
            printWriter.println("difficulty:" + this.av.a());
            printWriter.println("fancyGraphics:" + this.i);
            printWriter.println("ao:" + this.j);
            printWriter.println("clouds:" + this.k);
            printWriter.println("resourcePacks:" + aO.toJson((Object)this.l));
            printWriter.println("lastServer:" + this.aA);
            printWriter.println("lang:" + this.aL);
            printWriter.println("chatVisibility:" + this.m.a());
            printWriter.println("chatColors:" + this.n);
            printWriter.println("chatLinks:" + this.o);
            printWriter.println("chatLinksPrompt:" + this.p);
            printWriter.println("chatOpacity:" + this.q);
            printWriter.println("serverTextures:" + this.r);
            printWriter.println("snooperEnabled:" + this.s);
            printWriter.println("fullscreen:" + this.t);
            printWriter.println("enableVsync:" + this.u);
            printWriter.println("hideServerAddress:" + this.v);
            printWriter.println("advancedItemTooltips:" + this.w);
            printWriter.println("pauseOnLostFocus:" + this.x);
            printWriter.println("showCape:" + this.y);
            printWriter.println("touchscreen:" + this.z);
            printWriter.println("overrideWidth:" + this.A);
            printWriter.println("overrideHeight:" + this.B);
            printWriter.println("heldItemTooltips:" + this.C);
            printWriter.println("chatHeightFocused:" + this.G);
            printWriter.println("chatHeightUnfocused:" + this.F);
            printWriter.println("chatScale:" + this.D);
            printWriter.println("chatWidth:" + this.E);
            printWriter.println("showInventoryAchievementHint:" + this.H);
            printWriter.println("mipmapLevels:" + this.I);
            printWriter.println("anisotropicFiltering:" + this.J);
            printWriter.println("streamBytesPerPixel:" + this.K);
            printWriter.println("streamMicVolume:" + this.L);
            printWriter.println("streamSystemVolume:" + this.M);
            printWriter.println("streamKbps:" + this.N);
            printWriter.println("streamFps:" + this.O);
            printWriter.println("streamCompression:" + this.P);
            printWriter.println("streamSendMetadata:" + this.Q);
            printWriter.println("streamPreferredServer:" + this.R);
            printWriter.println("streamChatEnabled:" + this.S);
            printWriter.println("streamChatUserFilter:" + this.T);
            printWriter.println("streamMicToggleBehavior:" + this.U);
            printWriter.println("forceUnicodeFont:" + this.aM);
            for (azf azf2 : this.at) {
                printWriter.println("key_" + azf2.g() + ":" + azf2.i());
            }
            for (w w2 : w.values()) {
                printWriter.println("soundCategory_" + w2.a() + ":" + this.a(w2));
            }
            printWriter.close();
        }
        catch (Exception exception) {
            aN.error("Failed to save options", (Throwable)exception);
        }
        this.c();
    }

    public float a(w w2) {
        if (this.aX.containsKey((Object)w2)) {
            return ((Float)this.aX.get((Object)w2)).floatValue();
        }
        return 1.0f;
    }

    public void a(w w2, float f2) {
        this.au.X().a(w2, f2);
        this.aX.put(w2, Float.valueOf(f2));
    }

    public void c() {
        if (this.au.h != null) {
            this.au.h.a.a(new il(this.aL, this.c, this.m, this.n, this.av, this.y));
        }
    }

    public boolean d() {
        return this.c >= 4 && this.k;
    }
}

