/*
 * Decompiled with CFR 0.152.
 */
public class baf
extends Enum {
    public static final /* enum */ baf a = new baf("INVERT_MOUSE", 0, "options.invertMouse", false, true);
    public static final /* enum */ baf b = new baf("SENSITIVITY", 1, "options.sensitivity", true, false);
    public static final /* enum */ baf c = new baf("FOV", 2, "options.fov", true, false);
    public static final /* enum */ baf d = new baf("GAMMA", 3, "options.gamma", true, false);
    public static final /* enum */ baf e = new baf("SATURATION", 4, "options.saturation", true, false);
    public static final /* enum */ baf f = new baf("RENDER_DISTANCE", 5, "options.renderDistance", true, false, 2.0f, 16.0f, 1.0f);
    public static final /* enum */ baf g = new baf("VIEW_BOBBING", 6, "options.viewBobbing", false, true);
    public static final /* enum */ baf h = new baf("ANAGLYPH", 7, "options.anaglyph", false, true);
    public static final /* enum */ baf i = new baf("ADVANCED_OPENGL", 8, "options.advancedOpengl", false, true);
    public static final /* enum */ baf j = new baf("FRAMERATE_LIMIT", 9, "options.framerateLimit", true, false, 10.0f, 260.0f, 10.0f);
    public static final /* enum */ baf k = new baf("FBO_ENABLE", 10, "options.fboEnable", false, true);
    public static final /* enum */ baf l = new baf("DIFFICULTY", 11, "options.difficulty", false, false);
    public static final /* enum */ baf m = new baf("GRAPHICS", 12, "options.graphics", false, false);
    public static final /* enum */ baf n = new baf("AMBIENT_OCCLUSION", 13, "options.ao", false, false);
    public static final /* enum */ baf o = new baf("GUI_SCALE", 14, "options.guiScale", false, false);
    public static final /* enum */ baf p = new baf("RENDER_CLOUDS", 15, "options.renderClouds", false, true);
    public static final /* enum */ baf q = new baf("PARTICLES", 16, "options.particles", false, false);
    public static final /* enum */ baf r = new baf("CHAT_VISIBILITY", 17, "options.chat.visibility", false, false);
    public static final /* enum */ baf s = new baf("CHAT_COLOR", 18, "options.chat.color", false, true);
    public static final /* enum */ baf t = new baf("CHAT_LINKS", 19, "options.chat.links", false, true);
    public static final /* enum */ baf u = new baf("CHAT_OPACITY", 20, "options.chat.opacity", true, false);
    public static final /* enum */ baf v = new baf("CHAT_LINKS_PROMPT", 21, "options.chat.links.prompt", false, true);
    public static final /* enum */ baf w = new baf("USE_SERVER_TEXTURES", 22, "options.serverTextures", false, true);
    public static final /* enum */ baf x = new baf("SNOOPER_ENABLED", 23, "options.snooper", false, true);
    public static final /* enum */ baf y = new baf("USE_FULLSCREEN", 24, "options.fullscreen", false, true);
    public static final /* enum */ baf z = new baf("ENABLE_VSYNC", 25, "options.vsync", false, true);
    public static final /* enum */ baf A = new baf("SHOW_CAPE", 26, "options.showCape", false, true);
    public static final /* enum */ baf B = new baf("TOUCHSCREEN", 27, "options.touchscreen", false, true);
    public static final /* enum */ baf C = new baf("CHAT_SCALE", 28, "options.chat.scale", true, false);
    public static final /* enum */ baf D = new baf("CHAT_WIDTH", 29, "options.chat.width", true, false);
    public static final /* enum */ baf E = new baf("CHAT_HEIGHT_FOCUSED", 30, "options.chat.height.focused", true, false);
    public static final /* enum */ baf F = new baf("CHAT_HEIGHT_UNFOCUSED", 31, "options.chat.height.unfocused", true, false);
    public static final /* enum */ baf G = new baf("MIPMAP_LEVELS", 32, "options.mipmapLevels", true, false, 0.0f, 4.0f, 1.0f);
    public static final /* enum */ baf H = new bag("options.anisotropicFiltering", true, false, 1.0f, 16.0f, 0.0f);
    public static final /* enum */ baf I = new baf("FORCE_UNICODE_FONT", 34, "options.forceUnicodeFont", false, true);
    public static final /* enum */ baf J = new baf("STREAM_BYTES_PER_PIXEL", 35, "options.stream.bytesPerPixel", true, false);
    public static final /* enum */ baf K = new baf("STREAM_VOLUME_MIC", 36, "options.stream.micVolumne", true, false);
    public static final /* enum */ baf L = new baf("STREAM_VOLUME_SYSTEM", 37, "options.stream.systemVolume", true, false);
    public static final /* enum */ baf M = new baf("STREAM_KBPS", 38, "options.stream.kbps", true, false);
    public static final /* enum */ baf N = new baf("STREAM_FPS", 39, "options.stream.fps", true, false);
    public static final /* enum */ baf O = new baf("STREAM_COMPRESSION", 40, "options.stream.compression", false, false);
    public static final /* enum */ baf P = new baf("STREAM_SEND_METADATA", 41, "options.stream.sendMetadata", false, true);
    public static final /* enum */ baf Q = new baf("STREAM_CHAT_ENABLED", 42, "options.stream.chat.enabled", false, false);
    public static final /* enum */ baf R = new baf("STREAM_CHAT_USER_FILTER", 43, "options.stream.chat.userFilter", false, false);
    public static final /* enum */ baf S = new baf("STREAM_MIC_TOGGLE_BEHAVIOR", 44, "options.stream.micToggleBehavior", false, false);
    private final boolean T;
    private final boolean U;
    private final String V;
    private final float W;
    private float X;
    private float Y;
    private static final /* synthetic */ baf[] Z;

    public static baf[] values() {
        return (baf[])Z.clone();
    }

    public static baf valueOf(String string) {
        return Enum.valueOf(baf.class, string);
    }

    public static baf a(int n2) {
        for (baf baf2 : baf.values()) {
            if (baf2.c() != n2) continue;
            return baf2;
        }
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private baf(boolean bl2) {
        this((String)var1_-1, (int)var2_-1, (String)bl2, (boolean)var4_2, (boolean)var5_3, 0.0f, 1.0f, 0.0f);
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private baf(boolean bl2, float f2, float f3, float f4) {
        void var8_6;
        void var7_5;
        void var2_-1;
        void var1_-1;
        this.V = (String)bl2;
        this.T = f2;
        this.U = f3;
        this.X = f4;
        this.Y = var7_5;
        this.W = var8_6;
    }

    public boolean a() {
        return this.T;
    }

    public boolean b() {
        return this.U;
    }

    public int c() {
        return this.ordinal();
    }

    public String d() {
        return this.V;
    }

    public float f() {
        return this.Y;
    }

    public void a(float f2) {
        this.Y = f2;
    }

    public float c(float f2) {
        return oy.a((this.e(f2) - this.X) / (this.Y - this.X), 0.0f, 1.0f);
    }

    public float d(float f2) {
        return this.e(this.X + (this.Y - this.X) * oy.a(f2, 0.0f, 1.0f));
    }

    public float e(float f2) {
        f2 = this.f(f2);
        return oy.a(f2, this.X, this.Y);
    }

    protected float f(float f2) {
        if (this.W > 0.0f) {
            f2 = this.W * (float)Math.round(f2 / this.W);
        }
        return f2;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ baf(String string, boolean bl2, boolean bl3, float f2, float f3, float f4, bad bad2) {
        this((String)var1_-1, bl2 ? 1 : 0, (String)bl3, (boolean)f2, (boolean)f3, f4, (float)bad2, (float)var8_7);
        void var8_7;
        void var1_-1;
    }

    static /* synthetic */ float a(baf baf2) {
        return baf2.Y;
    }

    static {
        Z = new baf[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S};
    }
}

