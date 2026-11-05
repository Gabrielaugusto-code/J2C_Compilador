/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
import java.awt.image.BufferedImage;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class brb {
    private static final Logger c = LogManager.getLogger();
    private static final IntBuffer d = azh.f(0x400000);
    public static final bqj a = new bqj(16, 16);
    public static final int[] b = a.d();
    private static int e = -1;
    private static int f = -1;
    private static float g = -1.0f;
    private static final int[] h;

    public static int a() {
        return GL11.glGenTextures();
    }

    public static void a(int n2) {
        GL11.glDeleteTextures((int)n2);
    }

    public static int a(int n2, BufferedImage bufferedImage) {
        return brb.a(n2, bufferedImage, false, false);
    }

    public static void a(int n2, int[] nArray, int n3, int n4) {
        brb.b(n2);
        brb.a(0, nArray, n3, n4, 0, 0, false, false, false);
    }

    public static int[][] a(int n2, int n3, int[][] nArray) {
        int[][] nArrayArray = new int[n2 + 1][];
        nArrayArray[0] = nArray[0];
        if (n2 > 0) {
            int n4;
            boolean bl2 = false;
            for (n4 = 0; n4 < nArray.length; ++n4) {
                if (nArray[0][n4] >> 24 != 0) continue;
                bl2 = true;
                break;
            }
            for (n4 = 1; n4 <= n2; ++n4) {
                if (nArray[n4] != null) {
                    nArrayArray[n4] = nArray[n4];
                    continue;
                }
                int[] nArray2 = nArrayArray[n4 - 1];
                int[] nArray3 = new int[nArray2.length >> 2];
                int n5 = n3 >> n4;
                int n6 = nArray3.length / n5;
                int n7 = n5 << 1;
                for (int i2 = 0; i2 < n5; ++i2) {
                    for (int i3 = 0; i3 < n6; ++i3) {
                        int n8 = 2 * (i2 + i3 * n7);
                        nArray3[i2 + i3 * n5] = brb.a(nArray2[n8 + 0], nArray2[n8 + 1], nArray2[n8 + 0 + n7], nArray2[n8 + 1 + n7], bl2);
                    }
                }
                nArrayArray[n4] = nArray3;
            }
        }
        return nArrayArray;
    }

    private static int a(int n2, int n3, int n4, int n5, boolean bl2) {
        int n6;
        if (!bl2) {
            int n7 = brb.a(n2, n3, n4, n5, 24);
            int n8 = brb.a(n2, n3, n4, n5, 16);
            int n9 = brb.a(n2, n3, n4, n5, 8);
            int n10 = brb.a(n2, n3, n4, n5, 0);
            return n7 << 24 | n8 << 16 | n9 << 8 | n10;
        }
        brb.h[0] = n2;
        brb.h[1] = n3;
        brb.h[2] = n4;
        brb.h[3] = n5;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (n6 = 0; n6 < 4; ++n6) {
            if (h[n6] >> 24 == 0) continue;
            f2 += (float)Math.pow((float)(h[n6] >> 24 & 0xFF) / 255.0f, 2.2);
            f3 += (float)Math.pow((float)(h[n6] >> 16 & 0xFF) / 255.0f, 2.2);
            f4 += (float)Math.pow((float)(h[n6] >> 8 & 0xFF) / 255.0f, 2.2);
            f5 += (float)Math.pow((float)(h[n6] >> 0 & 0xFF) / 255.0f, 2.2);
        }
        n6 = (int)(Math.pow(f2 /= 4.0f, 0.45454545454545453) * 255.0);
        int n11 = (int)(Math.pow(f3 /= 4.0f, 0.45454545454545453) * 255.0);
        int n12 = (int)(Math.pow(f4 /= 4.0f, 0.45454545454545453) * 255.0);
        int n13 = (int)(Math.pow(f5 /= 4.0f, 0.45454545454545453) * 255.0);
        if (n6 < 96) {
            n6 = 0;
        }
        return n6 << 24 | n11 << 16 | n12 << 8 | n13;
    }

    private static int a(int n2, int n3, int n4, int n5, int n6) {
        float f2 = (float)Math.pow((float)(n2 >> n6 & 0xFF) / 255.0f, 2.2);
        float f3 = (float)Math.pow((float)(n3 >> n6 & 0xFF) / 255.0f, 2.2);
        float f4 = (float)Math.pow((float)(n4 >> n6 & 0xFF) / 255.0f, 2.2);
        float f5 = (float)Math.pow((float)(n5 >> n6 & 0xFF) / 255.0f, 2.2);
        float f6 = (float)Math.pow((double)(f2 + f3 + f4 + f5) * 0.25, 0.45454545454545453);
        return (int)((double)f6 * 255.0);
    }

    public static void a(int[][] nArray, int n2, int n3, int n4, int n5, boolean bl2, boolean bl3) {
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            int[] nArray2 = nArray[i2];
            brb.a(i2, nArray2, n2 >> i2, n3 >> i2, n4 >> i2, n5 >> i2, bl2, bl3, nArray.length > 1);
        }
    }

    private static void a(int n2, int[] nArray, int n3, int n4, int n5, int n6, boolean bl2, boolean bl3, boolean bl4) {
        int n7;
        int n8 = 0x400000 / n3;
        brb.a(bl2, bl4);
        brb.a(bl3);
        for (int i2 = 0; i2 < n3 * n4; i2 += n3 * n7) {
            int n9 = i2 / n3;
            n7 = Math.min(n8, n4 - n9);
            int n10 = n3 * n7;
            brb.b(nArray, i2, n10);
            GL11.glTexSubImage2D((int)3553, (int)n2, (int)n5, (int)(n6 + n9), (int)n3, (int)n7, (int)32993, (int)33639, (IntBuffer)d);
        }
    }

    public static int a(int n2, BufferedImage bufferedImage, boolean bl2, boolean bl3) {
        brb.a(n2, bufferedImage.getWidth(), bufferedImage.getHeight());
        return brb.a(n2, bufferedImage, 0, 0, bl2, bl3);
    }

    public static void a(int n2, int n3, int n4) {
        brb.a(n2, 0, n3, n4, 1.0f);
    }

    public static void a(int n2, int n3, int n4, int n5, float f2) {
        brb.a(n2);
        brb.b(n2);
        if (bwg.s) {
            GL11.glTexParameterf((int)3553, (int)34046, (float)f2);
        }
        if (n3 > 0) {
            GL11.glTexParameteri((int)3553, (int)33085, (int)n3);
            GL11.glTexParameterf((int)3553, (int)33082, (float)0.0f);
            GL11.glTexParameterf((int)3553, (int)33083, (float)n3);
            GL11.glTexParameterf((int)3553, (int)34049, (float)0.0f);
        }
        for (int i2 = 0; i2 <= n3; ++i2) {
            GL11.glTexImage2D((int)3553, (int)i2, (int)6408, (int)(n4 >> i2), (int)(n5 >> i2), (int)0, (int)32993, (int)33639, (IntBuffer)null);
        }
    }

    public static int a(int n2, BufferedImage bufferedImage, int n3, int n4, boolean bl2, boolean bl3) {
        brb.b(n2);
        brb.a(bufferedImage, n3, n4, bl2, bl3);
        return n2;
    }

    private static void a(BufferedImage bufferedImage, int n2, int n3, boolean bl2, boolean bl3) {
        int n4 = bufferedImage.getWidth();
        int n5 = bufferedImage.getHeight();
        int n6 = 0x400000 / n4;
        int[] nArray = new int[n6 * n4];
        brb.b(bl2);
        brb.a(bl3);
        for (int i2 = 0; i2 < n4 * n5; i2 += n4 * n6) {
            int n7 = i2 / n4;
            int n8 = Math.min(n6, n5 - n7);
            int n9 = n4 * n8;
            bufferedImage.getRGB(0, n7, n4, n8, nArray, 0, n4);
            brb.a(nArray, n9);
            GL11.glTexSubImage2D((int)3553, (int)0, (int)n2, (int)(n3 + n7), (int)n4, (int)n8, (int)32993, (int)33639, (IntBuffer)d);
        }
    }

    private static void a(boolean bl2) {
        if (bl2) {
            GL11.glTexParameteri((int)3553, (int)10242, (int)10496);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10496);
        } else {
            GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        }
    }

    private static void b(boolean bl2) {
        brb.a(bl2, false);
    }

    public static void a(boolean bl2, boolean bl3, float f2) {
        e = GL11.glGetTexParameteri((int)3553, (int)10241);
        f = GL11.glGetTexParameteri((int)3553, (int)10240);
        g = GL11.glGetTexParameterf((int)3553, (int)34046);
        brb.a(bl2, bl3);
        brb.a(f2);
    }

    public static void b() {
        if (e < 0 || f < 0 || g < 0.0f) {
            return;
        }
        brb.b(e, f);
        brb.a(g);
        g = -1.0f;
        e = -1;
        f = -1;
    }

    private static void b(int n2, int n3) {
        GL11.glTexParameteri((int)3553, (int)10241, (int)n2);
        GL11.glTexParameteri((int)3553, (int)10240, (int)n3);
    }

    private static void a(float f2) {
        GL11.glTexParameterf((int)3553, (int)34046, (float)f2);
    }

    private static void a(boolean bl2, boolean bl3) {
        if (bl2) {
            GL11.glTexParameteri((int)3553, (int)10241, (int)(bl3 ? 9987 : 9729));
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        } else {
            GL11.glTexParameteri((int)3553, (int)10241, (int)(bl3 ? 9986 : 9728));
            GL11.glTexParameteri((int)3553, (int)10240, (int)9728);
        }
    }

    private static void a(int[] nArray, int n2) {
        brb.b(nArray, 0, n2);
    }

    private static void b(int[] nArray, int n2, int n3) {
        int[] nArray2 = nArray;
        if (azi.B().u.e) {
            nArray2 = brb.a(nArray);
        }
        d.clear();
        d.put(nArray2, n2, n3);
        d.position(0).limit(n3);
    }

    static void b(int n2) {
        GL11.glBindTexture((int)3553, (int)n2);
    }

    public static int[] a(brr brr2, brq brq2) {
        BufferedImage bufferedImage = ImageIO.read(brr2.a(brq2).b());
        int n2 = bufferedImage.getWidth();
        int n3 = bufferedImage.getHeight();
        int[] nArray = new int[n2 * n3];
        bufferedImage.getRGB(0, 0, n2, n3, nArray, 0, n2);
        return nArray;
    }

    public static int[] a(int[] nArray) {
        int[] nArray2 = new int[nArray.length];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            int n2 = nArray[i2] >> 24 & 0xFF;
            int n3 = nArray[i2] >> 16 & 0xFF;
            int n4 = nArray[i2] >> 8 & 0xFF;
            int n5 = nArray[i2] & 0xFF;
            int n6 = (n3 * 30 + n4 * 59 + n5 * 11) / 100;
            int n7 = (n3 * 30 + n4 * 70) / 100;
            int n8 = (n3 * 30 + n5 * 70) / 100;
            nArray2[i2] = n2 << 24 | n6 << 16 | n7 << 8 | n8;
        }
        return nArray2;
    }

    public static int[] a(int[] nArray, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7 = n2 + 2 * n4;
        for (n6 = n3 - 1; n6 >= 0; --n6) {
            int n8;
            n5 = n6 * n2;
            int n9 = n4 + (n6 + n4) * n7;
            for (n8 = 0; n8 < n4; n8 += n2) {
                int n10 = Math.min(n2, n4 - n8);
                System.arraycopy(nArray, n5 + n2 - n10, nArray, n9 - n8 - n10, n10);
            }
            System.arraycopy(nArray, n5, nArray, n9, n2);
            for (n8 = 0; n8 < n4; n8 += n2) {
                System.arraycopy(nArray, n5, nArray, n9 + n2 + n8, Math.min(n2, n4 - n8));
            }
        }
        for (n6 = 0; n6 < n4; n6 += n3) {
            n5 = Math.min(n3, n4 - n6);
            System.arraycopy(nArray, (n4 + n3 - n5) * n7, nArray, (n4 - n6 - n5) * n7, n7 * n5);
        }
        for (n6 = 0; n6 < n4; n6 += n3) {
            n5 = Math.min(n3, n4 - n6);
            System.arraycopy(nArray, n4 * n7, nArray, (n3 + n4 + n6) * n7, n7 * n5);
        }
        return nArray;
    }

    public static void a(int[] nArray, int n2, int n3) {
        int[] nArray2 = new int[n2];
        int n4 = n3 / 2;
        for (int i2 = 0; i2 < n4; ++i2) {
            System.arraycopy(nArray, i2 * n2, nArray2, 0, n2);
            System.arraycopy(nArray, (n3 - 1 - i2) * n2, nArray, i2 * n2, n2);
            System.arraycopy(nArray2, 0, nArray, (n3 - 1 - i2) * n2, n2);
        }
    }

    static {
        int n2 = -16777216;
        int n3 = -524040;
        int[] nArray = new int[]{-524040, -524040, -524040, -524040, -524040, -524040, -524040, -524040};
        int[] nArray2 = new int[]{-16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216};
        int n4 = nArray.length;
        for (int i2 = 0; i2 < 16; ++i2) {
            System.arraycopy(i2 < n4 ? nArray : nArray2, 0, b, 16 * i2, n4);
            System.arraycopy(i2 < n4 ? nArray2 : nArray, 0, b, 16 * i2 + n4, n4);
        }
        a.a();
        h = new int[4];
    }
}

