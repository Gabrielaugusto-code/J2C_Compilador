/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ibm.icu.text.ArabicShaping
 *  com.ibm.icu.text.ArabicShapingException
 *  com.ibm.icu.text.Bidi
 *  org.lwjgl.opengl.GL11
 */
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public class ban
implements brs {
    private static final brq[] c = new brq[256];
    private int[] d = new int[256];
    public int a = 9;
    public Random b = new Random();
    private byte[] e = new byte[65536];
    private int[] f = new int[32];
    private final brq g;
    private final bqy h;
    private float i;
    private float j;
    private boolean k;
    private boolean l;
    private float m;
    private float n;
    private float o;
    private float p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;

    public ban(bac bac2, brq brq2, bqy bqy2, boolean bl2) {
        this.g = brq2;
        this.h = bqy2;
        this.k = bl2;
        bqy2.a(this.g);
        for (int i2 = 0; i2 < 32; ++i2) {
            int n2 = (i2 >> 3 & 1) * 85;
            int n3 = (i2 >> 2 & 1) * 170 + n2;
            int n4 = (i2 >> 1 & 1) * 170 + n2;
            int n5 = (i2 >> 0 & 1) * 170 + n2;
            if (i2 == 6) {
                n3 += 85;
            }
            if (bac2.e) {
                int n6 = (n3 * 30 + n4 * 59 + n5 * 11) / 100;
                int n7 = (n3 * 30 + n4 * 70) / 100;
                int n8 = (n3 * 30 + n5 * 70) / 100;
                n3 = n6;
                n4 = n7;
                n5 = n8;
            }
            if (i2 >= 16) {
                n3 /= 4;
                n4 /= 4;
                n5 /= 4;
            }
            this.f[i2] = (n3 & 0xFF) << 16 | (n4 & 0xFF) << 8 | n5 & 0xFF;
        }
        this.d();
    }

    @Override
    public void a(brr brr2) {
        this.c();
    }

    private void c() {
        BufferedImage bufferedImage;
        try {
            bufferedImage = ImageIO.read(azi.B().Q().a(this.g).b());
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        int n2 = bufferedImage.getWidth();
        int n3 = bufferedImage.getHeight();
        int[] nArray = new int[n2 * n3];
        bufferedImage.getRGB(0, 0, n2, n3, nArray, 0, n2);
        int n4 = n3 / 16;
        int n5 = n2 / 16;
        int n6 = 1;
        float f2 = 8.0f / (float)n5;
        for (int i2 = 0; i2 < 256; ++i2) {
            int n7;
            int n8 = i2 % 16;
            int n9 = i2 / 16;
            if (i2 == 32) {
                this.d[i2] = 3 + n6;
            }
            for (n7 = n5 - 1; n7 >= 0; --n7) {
                int n10 = n8 * n5 + n7;
                boolean bl2 = true;
                for (int i3 = 0; i3 < n4 && bl2; ++i3) {
                    int n11 = (n9 * n5 + i3) * n2;
                    if ((nArray[n10 + n11] >> 24 & 0xFF) == 0) continue;
                    bl2 = false;
                }
                if (!bl2) break;
            }
            this.d[i2] = (int)(0.5 + (double)((float)(++n7) * f2)) + n6;
        }
    }

    private void d() {
        try {
            InputStream inputStream = azi.B().Q().a(new brq("font/glyph_sizes.bin")).b();
            inputStream.read(this.e);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    private float a(int n2, char c2, boolean bl2) {
        if (c2 == ' ') {
            return 4.0f;
        }
        if ("\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1\u00aa\u00ba\u00bf\u00ae\u00ac\u00bd\u00bc\u00a1\u00ab\u00bb\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261\u00b1\u2265\u2264\u2320\u2321\u00f7\u2248\u00b0\u2219\u00b7\u221a\u207f\u00b2\u25a0\u0000".indexOf(c2) != -1 && !this.k) {
            return this.a(n2, bl2);
        }
        return this.a(c2, bl2);
    }

    private float a(int n2, boolean bl2) {
        float f2 = n2 % 16 * 8;
        float f3 = n2 / 16 * 8;
        float f4 = bl2 ? 1.0f : 0.0f;
        this.h.a(this.g);
        float f5 = (float)this.d[n2] - 0.01f;
        GL11.glBegin((int)5);
        GL11.glTexCoord2f((float)(f2 / 128.0f), (float)(f3 / 128.0f));
        GL11.glVertex3f((float)(this.i + f4), (float)this.j, (float)0.0f);
        GL11.glTexCoord2f((float)(f2 / 128.0f), (float)((f3 + 7.99f) / 128.0f));
        GL11.glVertex3f((float)(this.i - f4), (float)(this.j + 7.99f), (float)0.0f);
        GL11.glTexCoord2f((float)((f2 + f5 - 1.0f) / 128.0f), (float)(f3 / 128.0f));
        GL11.glVertex3f((float)(this.i + f5 - 1.0f + f4), (float)this.j, (float)0.0f);
        GL11.glTexCoord2f((float)((f2 + f5 - 1.0f) / 128.0f), (float)((f3 + 7.99f) / 128.0f));
        GL11.glVertex3f((float)(this.i + f5 - 1.0f - f4), (float)(this.j + 7.99f), (float)0.0f);
        GL11.glEnd();
        return this.d[n2];
    }

    private brq a(int n2) {
        if (c[n2] == null) {
            ban.c[n2] = new brq(String.format("textures/font/unicode_page_%02x.png", n2));
        }
        return c[n2];
    }

    private void b(int n2) {
        this.h.a(this.a(n2));
    }

    private float a(char c2, boolean bl2) {
        if (this.e[c2] == 0) {
            return 0.0f;
        }
        int n2 = c2 / 256;
        this.b(n2);
        int n3 = this.e[c2] >>> 4;
        int n4 = this.e[c2] & 0xF;
        float f2 = n3;
        float f3 = n4 + 1;
        float f4 = (float)(c2 % 16 * 16) + f2;
        float f5 = (c2 & 0xFF) / 16 * 16;
        float f6 = f3 - f2 - 0.02f;
        float f7 = bl2 ? 1.0f : 0.0f;
        GL11.glBegin((int)5);
        GL11.glTexCoord2f((float)(f4 / 256.0f), (float)(f5 / 256.0f));
        GL11.glVertex3f((float)(this.i + f7), (float)this.j, (float)0.0f);
        GL11.glTexCoord2f((float)(f4 / 256.0f), (float)((f5 + 15.98f) / 256.0f));
        GL11.glVertex3f((float)(this.i - f7), (float)(this.j + 7.99f), (float)0.0f);
        GL11.glTexCoord2f((float)((f4 + f6) / 256.0f), (float)(f5 / 256.0f));
        GL11.glVertex3f((float)(this.i + f6 / 2.0f + f7), (float)this.j, (float)0.0f);
        GL11.glTexCoord2f((float)((f4 + f6) / 256.0f), (float)((f5 + 15.98f) / 256.0f));
        GL11.glVertex3f((float)(this.i + f6 / 2.0f - f7), (float)(this.j + 7.99f), (float)0.0f);
        GL11.glEnd();
        return (f3 - f2) / 2.0f + 1.0f;
    }

    public int a(String string, int n2, int n3, int n4) {
        return this.a(string, n2, n3, n4, true);
    }

    public int b(String string, int n2, int n3, int n4) {
        return this.a(string, n2, n3, n4, false);
    }

    public int a(String string, int n2, int n3, int n4, boolean bl2) {
        int n5;
        GL11.glEnable((int)3008);
        this.e();
        if (bl2) {
            n5 = this.b(string, n2 + 1, n3 + 1, n4, true);
            n5 = Math.max(n5, this.b(string, n2, n3, n4, false));
        } else {
            n5 = this.b(string, n2, n3, n4, false);
        }
        return n5;
    }

    private String b(String string) {
        try {
            Bidi bidi = new Bidi(new ArabicShaping(8).shape(string), 127);
            bidi.setReorderingMode(0);
            return bidi.writeReordered(2);
        }
        catch (ArabicShapingException arabicShapingException) {
            return string;
        }
    }

    private void e() {
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
    }

    private void a(String string, boolean bl2) {
        for (int i2 = 0; i2 < string.length(); ++i2) {
            bna bna2;
            boolean bl3;
            int n2;
            int n3;
            char c2 = string.charAt(i2);
            if (c2 == '\u00a7' && i2 + 1 < string.length()) {
                n3 = "0123456789abcdefklmnor".indexOf(string.toLowerCase().charAt(i2 + 1));
                if (n3 < 16) {
                    this.r = false;
                    this.s = false;
                    this.v = false;
                    this.u = false;
                    this.t = false;
                    if (n3 < 0 || n3 > 15) {
                        n3 = 15;
                    }
                    if (bl2) {
                        n3 += 16;
                    }
                    this.q = n2 = this.f[n3];
                    GL11.glColor4f((float)((float)(n2 >> 16) / 255.0f), (float)((float)(n2 >> 8 & 0xFF) / 255.0f), (float)((float)(n2 & 0xFF) / 255.0f), (float)this.p);
                } else if (n3 == 16) {
                    this.r = true;
                } else if (n3 == 17) {
                    this.s = true;
                } else if (n3 == 18) {
                    this.v = true;
                } else if (n3 == 19) {
                    this.u = true;
                } else if (n3 == 20) {
                    this.t = true;
                } else if (n3 == 21) {
                    this.r = false;
                    this.s = false;
                    this.v = false;
                    this.u = false;
                    this.t = false;
                    GL11.glColor4f((float)this.m, (float)this.n, (float)this.o, (float)this.p);
                }
                ++i2;
                continue;
            }
            n3 = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1\u00aa\u00ba\u00bf\u00ae\u00ac\u00bd\u00bc\u00a1\u00ab\u00bb\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261\u00b1\u2265\u2264\u2320\u2321\u00f7\u2248\u00b0\u2219\u00b7\u221a\u207f\u00b2\u25a0\u0000".indexOf(c2);
            if (this.r && n3 != -1) {
                while (this.d[n3] != this.d[n2 = this.b.nextInt(this.d.length)]) {
                }
                n3 = n2;
            }
            float f2 = this.k ? 0.5f : 1.0f;
            boolean bl4 = bl3 = (c2 == '\u0000' || n3 == -1 || this.k) && bl2;
            if (bl3) {
                this.i -= f2;
                this.j -= f2;
            }
            float f3 = this.a(n3, c2, this.t);
            if (bl3) {
                this.i += f2;
                this.j += f2;
            }
            if (this.s) {
                this.i += f2;
                if (bl3) {
                    this.i -= f2;
                    this.j -= f2;
                }
                this.a(n3, c2, this.t);
                this.i -= f2;
                if (bl3) {
                    this.i += f2;
                    this.j += f2;
                }
                f3 += 1.0f;
            }
            if (this.v) {
                bna2 = bna.a;
                GL11.glDisable((int)3553);
                bna2.b();
                bna2.a((double)this.i, (double)(this.j + (float)(this.a / 2)), 0.0);
                bna2.a((double)(this.i + f3), (double)(this.j + (float)(this.a / 2)), 0.0);
                bna2.a((double)(this.i + f3), (double)(this.j + (float)(this.a / 2) - 1.0f), 0.0);
                bna2.a((double)this.i, (double)(this.j + (float)(this.a / 2) - 1.0f), 0.0);
                bna2.a();
                GL11.glEnable((int)3553);
            }
            if (this.u) {
                bna2 = bna.a;
                GL11.glDisable((int)3553);
                bna2.b();
                int n4 = this.u ? -1 : 0;
                bna2.a((double)(this.i + (float)n4), (double)(this.j + (float)this.a), 0.0);
                bna2.a((double)(this.i + f3), (double)(this.j + (float)this.a), 0.0);
                bna2.a((double)(this.i + f3), (double)(this.j + (float)this.a - 1.0f), 0.0);
                bna2.a((double)(this.i + (float)n4), (double)(this.j + (float)this.a - 1.0f), 0.0);
                bna2.a();
                GL11.glEnable((int)3553);
            }
            this.i += (float)((int)f3);
        }
    }

    private int a(String string, int n2, int n3, int n4, int n5, boolean bl2) {
        if (this.l) {
            int n6 = this.a(this.b(string));
            n2 = n2 + n4 - n6;
        }
        return this.b(string, n2, n3, n5, bl2);
    }

    private int b(String string, int n2, int n3, int n4, boolean bl2) {
        if (string == null) {
            return 0;
        }
        if (this.l) {
            string = this.b(string);
        }
        if ((n4 & 0xFC000000) == 0) {
            n4 |= 0xFF000000;
        }
        if (bl2) {
            n4 = (n4 & 0xFCFCFC) >> 2 | n4 & 0xFF000000;
        }
        this.m = (float)(n4 >> 16 & 0xFF) / 255.0f;
        this.n = (float)(n4 >> 8 & 0xFF) / 255.0f;
        this.o = (float)(n4 & 0xFF) / 255.0f;
        this.p = (float)(n4 >> 24 & 0xFF) / 255.0f;
        GL11.glColor4f((float)this.m, (float)this.n, (float)this.o, (float)this.p);
        this.i = n2;
        this.j = n3;
        this.a(string, bl2);
        return (int)this.i;
    }

    public int a(String string) {
        if (string == null) {
            return 0;
        }
        int n2 = 0;
        boolean bl2 = false;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            int n3 = this.a(c2);
            if (n3 < 0 && i2 < string.length() - 1) {
                if ((c2 = string.charAt(++i2)) == 'l' || c2 == 'L') {
                    bl2 = true;
                } else if (c2 == 'r' || c2 == 'R') {
                    bl2 = false;
                }
                n3 = 0;
            }
            n2 += n3;
            if (!bl2) continue;
            ++n2;
        }
        return n2;
    }

    public int a(char c2) {
        if (c2 == '\u00a7') {
            return -1;
        }
        if (c2 == ' ') {
            return 4;
        }
        int n2 = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1\u00aa\u00ba\u00bf\u00ae\u00ac\u00bd\u00bc\u00a1\u00ab\u00bb\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261\u00b1\u2265\u2264\u2320\u2321\u00f7\u2248\u00b0\u2219\u00b7\u221a\u207f\u00b2\u25a0\u0000".indexOf(c2);
        if (c2 > '\u0000' && n2 != -1 && !this.k) {
            return this.d[n2];
        }
        if (this.e[c2] != 0) {
            int n3 = this.e[c2] >>> 4;
            int n4 = this.e[c2] & 0xF;
            if (n4 > 7) {
                n4 = 15;
                n3 = 0;
            }
            return (++n4 - n3) / 2 + 1;
        }
        return 0;
    }

    public String a(String string, int n2) {
        return this.a(string, n2, false);
    }

    public String a(String string, int n2, boolean bl2) {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = 0;
        int n4 = bl2 ? string.length() - 1 : 0;
        int n5 = bl2 ? -1 : 1;
        boolean bl3 = false;
        boolean bl4 = false;
        for (int i2 = n4; i2 >= 0 && i2 < string.length() && n3 < n2; i2 += n5) {
            char c2 = string.charAt(i2);
            int n6 = this.a(c2);
            if (bl3) {
                bl3 = false;
                if (c2 == 'l' || c2 == 'L') {
                    bl4 = true;
                } else if (c2 == 'r' || c2 == 'R') {
                    bl4 = false;
                }
            } else if (n6 < 0) {
                bl3 = true;
            } else {
                n3 += n6;
                if (bl4) {
                    ++n3;
                }
            }
            if (n3 > n2) break;
            if (bl2) {
                stringBuilder.insert(0, c2);
                continue;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    private String c(String string) {
        while (string != null && string.endsWith("\n")) {
            string = string.substring(0, string.length() - 1);
        }
        return string;
    }

    public void a(String string, int n2, int n3, int n4, int n5) {
        this.e();
        this.q = n5;
        string = this.c(string);
        this.c(string, n2, n3, n4, false);
    }

    private void c(String string, int n2, int n3, int n4, boolean bl2) {
        List list = this.c(string, n4);
        for (String string2 : list) {
            this.a(string2, n2, n3, n4, this.q, bl2);
            n3 += this.a;
        }
    }

    public int b(String string, int n2) {
        return this.a * this.c(string, n2).size();
    }

    public void a(boolean bl2) {
        this.k = bl2;
    }

    public boolean a() {
        return this.k;
    }

    public void b(boolean bl2) {
        this.l = bl2;
    }

    public List c(String string, int n2) {
        return Arrays.asList(this.d(string, n2).split("\n"));
    }

    String d(String string, int n2) {
        int n3 = this.e(string, n2);
        if (string.length() <= n3) {
            return string;
        }
        String string2 = string.substring(0, n3);
        char c2 = string.charAt(n3);
        boolean bl2 = c2 == ' ' || c2 == '\n';
        String string3 = ban.d(string2) + string.substring(n3 + (bl2 ? 1 : 0));
        return string2 + "\n" + this.d(string3, n2);
    }

    private int e(String string, int n2) {
        int n3;
        int n4 = string.length();
        int n5 = 0;
        int n6 = -1;
        boolean bl2 = false;
        for (n3 = 0; n3 < n4; ++n3) {
            char c2 = string.charAt(n3);
            switch (c2) {
                case '\u00a7': {
                    char c3;
                    if (n3 >= n4 - 1) break;
                    if ((c3 = string.charAt(++n3)) == 'l' || c3 == 'L') {
                        bl2 = true;
                        break;
                    }
                    if (c3 != 'r' && c3 != 'R' && !ban.b(c3)) break;
                    bl2 = false;
                    break;
                }
                case '\n': {
                    --n3;
                    break;
                }
                case ' ': {
                    n6 = n3;
                }
                default: {
                    n5 += this.a(c2);
                    if (!bl2) break;
                    ++n5;
                }
            }
            if (c2 == '\n') {
                n6 = ++n3;
                break;
            }
            if (n5 > n2) break;
        }
        if (n3 != n4 && n6 != -1 && n6 < n3) {
            return n6;
        }
        return n3;
    }

    private static boolean b(char c2) {
        return c2 >= '0' && c2 <= '9' || c2 >= 'a' && c2 <= 'f' || c2 >= 'A' && c2 <= 'F';
    }

    private static boolean c(char c2) {
        return c2 >= 'k' && c2 <= 'o' || c2 >= 'K' && c2 <= 'O' || c2 == 'r' || c2 == 'R';
    }

    private static String d(String string) {
        String string2 = "";
        int n2 = -1;
        int n3 = string.length();
        while ((n2 = string.indexOf(167, n2 + 1)) != -1) {
            if (n2 >= n3 - 1) continue;
            char c2 = string.charAt(n2 + 1);
            if (ban.b(c2)) {
                string2 = "\u00a7" + c2;
                continue;
            }
            if (!ban.c(c2)) continue;
            string2 = string2 + "\u00a7" + c2;
        }
        return string2;
    }

    public boolean b() {
        return this.l;
    }
}

