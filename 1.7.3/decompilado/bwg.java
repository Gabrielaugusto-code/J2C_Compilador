/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBFramebufferObject
 *  org.lwjgl.opengl.ARBMultitexture
 *  org.lwjgl.opengl.ARBShaderObjects
 *  org.lwjgl.opengl.ARBVertexShader
 *  org.lwjgl.opengl.ContextCapabilities
 *  org.lwjgl.opengl.EXTBlendFuncSeparate
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 *  org.lwjgl.opengl.GL14
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GLContext
 */
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.ARBMultitexture;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.ARBVertexShader;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTBlendFuncSeparate;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;

public class bwg {
    public static boolean a;
    public static int b;
    public static int c;
    public static boolean d;
    public static int e;
    public static int f;
    public static int g;
    public static int h;
    public static int i;
    public static int j;
    public static int k;
    public static int l;
    public static int m;
    private static int w;
    public static boolean n;
    private static boolean x;
    private static boolean y;
    public static int o;
    public static int p;
    public static int q;
    public static int r;
    public static boolean s;
    public static int t;
    private static boolean z;
    private static boolean A;
    public static boolean u;
    public static boolean v;
    private static String B;

    public static void a() {
        ContextCapabilities contextCapabilities = GLContext.getCapabilities();
        boolean bl2 = z = contextCapabilities.GL_ARB_multitexture && !contextCapabilities.OpenGL13;
        if (z) {
            B = B + "Using multitexturing ARB.\n";
            b = 33984;
            c = 33985;
        } else {
            B = B + "Using GL 1.3 multitexturing.\n";
            b = 33984;
            c = 33985;
        }
        u = contextCapabilities.GL_EXT_blend_func_separate && !contextCapabilities.OpenGL14;
        A = contextCapabilities.OpenGL14 || contextCapabilities.GL_EXT_blend_func_separate;
        boolean bl3 = n = A && (contextCapabilities.GL_ARB_framebuffer_object || contextCapabilities.GL_EXT_framebuffer_object || contextCapabilities.OpenGL30);
        if (n) {
            B = B + "Using framebuffer objects because ";
            if (contextCapabilities.OpenGL30) {
                B = B + "OpenGL 3.0 is supported and separate blending is supported.\n";
                w = 0;
                e = 36160;
                f = 36161;
                g = 36064;
                h = 36096;
                i = 36053;
                j = 36054;
                k = 36055;
                l = 36059;
                m = 36060;
            } else if (contextCapabilities.GL_ARB_framebuffer_object) {
                B = B + "ARB_framebuffer_object is supported and separate blending is supported.\n";
                w = 1;
                e = 36160;
                f = 36161;
                g = 36064;
                h = 36096;
                i = 36053;
                k = 36055;
                j = 36054;
                l = 36059;
                m = 36060;
            } else if (contextCapabilities.GL_EXT_framebuffer_object) {
                B = B + "EXT_framebuffer_object is supported.\n";
                w = 2;
                e = 36160;
                f = 36161;
                g = 36064;
                h = 36096;
                i = 36053;
                k = 36055;
                j = 36054;
                l = 36059;
                m = 36060;
            }
        } else {
            B = B + "Not using framebuffer objects because ";
            B = B + "OpenGL 1.4 is " + (contextCapabilities.OpenGL14 ? "" : "not ") + "supported, ";
            B = B + "EXT_blend_func_separate is " + (contextCapabilities.GL_EXT_blend_func_separate ? "" : "not ") + "supported, ";
            B = B + "OpenGL 3.0 is " + (contextCapabilities.OpenGL30 ? "" : "not ") + "supported, ";
            B = B + "ARB_framebuffer_object is " + (contextCapabilities.GL_ARB_framebuffer_object ? "" : "not ") + "supported, and ";
            B = B + "EXT_framebuffer_object is " + (contextCapabilities.GL_EXT_framebuffer_object ? "" : "not ") + "supported.\n";
        }
        s = contextCapabilities.GL_EXT_texture_filter_anisotropic;
        t = (int)(s ? GL11.glGetFloat((int)34047) : 0.0f);
        B = B + "Anisotropic filtering is " + (s ? "" : "not ") + "supported";
        B = s ? B + " and maximum anisotropy is " + t + ".\n" : B + ".\n";
        baf.H.a(t);
        a = contextCapabilities.OpenGL21;
        x = a || contextCapabilities.GL_ARB_vertex_shader && contextCapabilities.GL_ARB_fragment_shader && contextCapabilities.GL_ARB_shader_objects;
        B = B + "Shaders are " + (x ? "" : "not ") + "available because ";
        if (x) {
            if (contextCapabilities.OpenGL21) {
                B = B + "OpenGL 2.1 is supported.\n";
                y = false;
                o = 35714;
                p = 35713;
                q = 35633;
                r = 35632;
            } else {
                B = B + "ARB_shader_objects, ARB_vertex_shader, and ARB_fragment_shader are supported.\n";
                y = true;
                o = 35714;
                p = 35713;
                q = 35633;
                r = 35632;
            }
        } else {
            B = B + "OpenGL 2.1 is " + (contextCapabilities.OpenGL21 ? "" : "not ") + "supported, ";
            B = B + "ARB_shader_objects is " + (contextCapabilities.GL_ARB_shader_objects ? "" : "not ") + "supported, ";
            B = B + "ARB_vertex_shader is " + (contextCapabilities.GL_ARB_vertex_shader ? "" : "not ") + "supported, and ";
            B = B + "ARB_fragment_shader is " + (contextCapabilities.GL_ARB_fragment_shader ? "" : "not ") + "supported.\n";
        }
        v = n && x;
        d = GL11.glGetString((int)7936).toLowerCase().contains("nvidia");
    }

    public static boolean b() {
        return v;
    }

    public static String c() {
        return B;
    }

    public static int a(int n2, int n3) {
        if (y) {
            return ARBShaderObjects.glGetObjectParameteriARB((int)n2, (int)n3);
        }
        return GL20.glGetProgrami((int)n2, (int)n3);
    }

    public static void b(int n2, int n3) {
        if (y) {
            ARBShaderObjects.glAttachObjectARB((int)n2, (int)n3);
        } else {
            GL20.glAttachShader((int)n2, (int)n3);
        }
    }

    public static void a(int n2) {
        if (y) {
            ARBShaderObjects.glDeleteObjectARB((int)n2);
        } else {
            GL20.glDeleteShader((int)n2);
        }
    }

    public static int b(int n2) {
        if (y) {
            return ARBShaderObjects.glCreateShaderObjectARB((int)n2);
        }
        return GL20.glCreateShader((int)n2);
    }

    public static void a(int n2, ByteBuffer byteBuffer) {
        if (y) {
            ARBShaderObjects.glShaderSourceARB((int)n2, (ByteBuffer)byteBuffer);
        } else {
            GL20.glShaderSource((int)n2, (ByteBuffer)byteBuffer);
        }
    }

    public static void c(int n2) {
        if (y) {
            ARBShaderObjects.glCompileShaderARB((int)n2);
        } else {
            GL20.glCompileShader((int)n2);
        }
    }

    public static int c(int n2, int n3) {
        if (y) {
            return ARBShaderObjects.glGetObjectParameteriARB((int)n2, (int)n3);
        }
        return GL20.glGetShaderi((int)n2, (int)n3);
    }

    public static String d(int n2, int n3) {
        if (y) {
            return ARBShaderObjects.glGetInfoLogARB((int)n2, (int)n3);
        }
        return GL20.glGetShaderInfoLog((int)n2, (int)n3);
    }

    public static String e(int n2, int n3) {
        if (y) {
            return ARBShaderObjects.glGetInfoLogARB((int)n2, (int)n3);
        }
        return GL20.glGetProgramInfoLog((int)n2, (int)n3);
    }

    public static void d(int n2) {
        if (y) {
            ARBShaderObjects.glUseProgramObjectARB((int)n2);
        } else {
            GL20.glUseProgram((int)n2);
        }
    }

    public static int d() {
        if (y) {
            return ARBShaderObjects.glCreateProgramObjectARB();
        }
        return GL20.glCreateProgram();
    }

    public static void e(int n2) {
        if (y) {
            ARBShaderObjects.glDeleteObjectARB((int)n2);
        } else {
            GL20.glDeleteProgram((int)n2);
        }
    }

    public static void f(int n2) {
        if (y) {
            ARBShaderObjects.glLinkProgramARB((int)n2);
        } else {
            GL20.glLinkProgram((int)n2);
        }
    }

    public static int a(int n2, CharSequence charSequence) {
        if (y) {
            return ARBShaderObjects.glGetUniformLocationARB((int)n2, (CharSequence)charSequence);
        }
        return GL20.glGetUniformLocation((int)n2, (CharSequence)charSequence);
    }

    public static void a(int n2, IntBuffer intBuffer) {
        if (y) {
            ARBShaderObjects.glUniform1ARB((int)n2, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform1((int)n2, (IntBuffer)intBuffer);
        }
    }

    public static void f(int n2, int n3) {
        if (y) {
            ARBShaderObjects.glUniform1iARB((int)n2, (int)n3);
        } else {
            GL20.glUniform1i((int)n2, (int)n3);
        }
    }

    public static void a(int n2, FloatBuffer floatBuffer) {
        if (y) {
            ARBShaderObjects.glUniform1ARB((int)n2, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform1((int)n2, (FloatBuffer)floatBuffer);
        }
    }

    public static void b(int n2, IntBuffer intBuffer) {
        if (y) {
            ARBShaderObjects.glUniform2ARB((int)n2, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform2((int)n2, (IntBuffer)intBuffer);
        }
    }

    public static void b(int n2, FloatBuffer floatBuffer) {
        if (y) {
            ARBShaderObjects.glUniform2ARB((int)n2, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform2((int)n2, (FloatBuffer)floatBuffer);
        }
    }

    public static void c(int n2, IntBuffer intBuffer) {
        if (y) {
            ARBShaderObjects.glUniform3ARB((int)n2, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform3((int)n2, (IntBuffer)intBuffer);
        }
    }

    public static void c(int n2, FloatBuffer floatBuffer) {
        if (y) {
            ARBShaderObjects.glUniform3ARB((int)n2, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform3((int)n2, (FloatBuffer)floatBuffer);
        }
    }

    public static void d(int n2, IntBuffer intBuffer) {
        if (y) {
            ARBShaderObjects.glUniform4ARB((int)n2, (IntBuffer)intBuffer);
        } else {
            GL20.glUniform4((int)n2, (IntBuffer)intBuffer);
        }
    }

    public static void d(int n2, FloatBuffer floatBuffer) {
        if (y) {
            ARBShaderObjects.glUniform4ARB((int)n2, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniform4((int)n2, (FloatBuffer)floatBuffer);
        }
    }

    public static void a(int n2, boolean bl2, FloatBuffer floatBuffer) {
        if (y) {
            ARBShaderObjects.glUniformMatrix2ARB((int)n2, (boolean)bl2, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniformMatrix2((int)n2, (boolean)bl2, (FloatBuffer)floatBuffer);
        }
    }

    public static void b(int n2, boolean bl2, FloatBuffer floatBuffer) {
        if (y) {
            ARBShaderObjects.glUniformMatrix3ARB((int)n2, (boolean)bl2, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniformMatrix3((int)n2, (boolean)bl2, (FloatBuffer)floatBuffer);
        }
    }

    public static void c(int n2, boolean bl2, FloatBuffer floatBuffer) {
        if (y) {
            ARBShaderObjects.glUniformMatrix4ARB((int)n2, (boolean)bl2, (FloatBuffer)floatBuffer);
        } else {
            GL20.glUniformMatrix4((int)n2, (boolean)bl2, (FloatBuffer)floatBuffer);
        }
    }

    public static int b(int n2, CharSequence charSequence) {
        if (y) {
            return ARBVertexShader.glGetAttribLocationARB((int)n2, (CharSequence)charSequence);
        }
        return GL20.glGetAttribLocation((int)n2, (CharSequence)charSequence);
    }

    public static void g(int n2, int n3) {
        if (!n) {
            return;
        }
        switch (w) {
            case 0: {
                GL30.glBindFramebuffer((int)n2, (int)n3);
                break;
            }
            case 1: {
                ARBFramebufferObject.glBindFramebuffer((int)n2, (int)n3);
                break;
            }
            case 2: {
                EXTFramebufferObject.glBindFramebufferEXT((int)n2, (int)n3);
            }
        }
    }

    public static void h(int n2, int n3) {
        if (!n) {
            return;
        }
        switch (w) {
            case 0: {
                GL30.glBindRenderbuffer((int)n2, (int)n3);
                break;
            }
            case 1: {
                ARBFramebufferObject.glBindRenderbuffer((int)n2, (int)n3);
                break;
            }
            case 2: {
                EXTFramebufferObject.glBindRenderbufferEXT((int)n2, (int)n3);
            }
        }
    }

    public static void g(int n2) {
        if (!n) {
            return;
        }
        switch (w) {
            case 0: {
                GL30.glDeleteRenderbuffers((int)n2);
                break;
            }
            case 1: {
                ARBFramebufferObject.glDeleteRenderbuffers((int)n2);
                break;
            }
            case 2: {
                EXTFramebufferObject.glDeleteRenderbuffersEXT((int)n2);
            }
        }
    }

    public static void h(int n2) {
        if (!n) {
            return;
        }
        switch (w) {
            case 0: {
                GL30.glDeleteFramebuffers((int)n2);
                break;
            }
            case 1: {
                ARBFramebufferObject.glDeleteFramebuffers((int)n2);
                break;
            }
            case 2: {
                EXTFramebufferObject.glDeleteFramebuffersEXT((int)n2);
            }
        }
    }

    public static int e() {
        if (!n) {
            return -1;
        }
        switch (w) {
            case 0: {
                return GL30.glGenFramebuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenFramebuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenFramebuffersEXT();
            }
        }
        return -1;
    }

    public static int f() {
        if (!n) {
            return -1;
        }
        switch (w) {
            case 0: {
                return GL30.glGenRenderbuffers();
            }
            case 1: {
                return ARBFramebufferObject.glGenRenderbuffers();
            }
            case 2: {
                return EXTFramebufferObject.glGenRenderbuffersEXT();
            }
        }
        return -1;
    }

    public static void a(int n2, int n3, int n4, int n5) {
        if (!n) {
            return;
        }
        switch (w) {
            case 0: {
                GL30.glRenderbufferStorage((int)n2, (int)n3, (int)n4, (int)n5);
                break;
            }
            case 1: {
                ARBFramebufferObject.glRenderbufferStorage((int)n2, (int)n3, (int)n4, (int)n5);
                break;
            }
            case 2: {
                EXTFramebufferObject.glRenderbufferStorageEXT((int)n2, (int)n3, (int)n4, (int)n5);
            }
        }
    }

    public static void b(int n2, int n3, int n4, int n5) {
        if (!n) {
            return;
        }
        switch (w) {
            case 0: {
                GL30.glFramebufferRenderbuffer((int)n2, (int)n3, (int)n4, (int)n5);
                break;
            }
            case 1: {
                ARBFramebufferObject.glFramebufferRenderbuffer((int)n2, (int)n3, (int)n4, (int)n5);
                break;
            }
            case 2: {
                EXTFramebufferObject.glFramebufferRenderbufferEXT((int)n2, (int)n3, (int)n4, (int)n5);
            }
        }
    }

    public static int i(int n2) {
        if (!n) {
            return -1;
        }
        switch (w) {
            case 0: {
                return GL30.glCheckFramebufferStatus((int)n2);
            }
            case 1: {
                return ARBFramebufferObject.glCheckFramebufferStatus((int)n2);
            }
            case 2: {
                return EXTFramebufferObject.glCheckFramebufferStatusEXT((int)n2);
            }
        }
        return -1;
    }

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        if (!n) {
            return;
        }
        switch (w) {
            case 0: {
                GL30.glFramebufferTexture2D((int)n2, (int)n3, (int)n4, (int)n5, (int)n6);
                break;
            }
            case 1: {
                ARBFramebufferObject.glFramebufferTexture2D((int)n2, (int)n3, (int)n4, (int)n5, (int)n6);
                break;
            }
            case 2: {
                EXTFramebufferObject.glFramebufferTexture2DEXT((int)n2, (int)n3, (int)n4, (int)n5, (int)n6);
            }
        }
    }

    public static void j(int n2) {
        if (z) {
            ARBMultitexture.glActiveTextureARB((int)n2);
        } else {
            GL13.glActiveTexture((int)n2);
        }
    }

    public static void k(int n2) {
        if (z) {
            ARBMultitexture.glClientActiveTextureARB((int)n2);
        } else {
            GL13.glClientActiveTexture((int)n2);
        }
    }

    public static void a(int n2, float f2, float f3) {
        if (z) {
            ARBMultitexture.glMultiTexCoord2fARB((int)n2, (float)f2, (float)f3);
        } else {
            GL13.glMultiTexCoord2f((int)n2, (float)f2, (float)f3);
        }
    }

    public static void c(int n2, int n3, int n4, int n5) {
        if (A) {
            if (u) {
                EXTBlendFuncSeparate.glBlendFuncSeparateEXT((int)n2, (int)n3, (int)n4, (int)n5);
            } else {
                GL14.glBlendFuncSeparate((int)n2, (int)n3, (int)n4, (int)n5);
            }
        } else {
            GL11.glBlendFunc((int)n2, (int)n3);
        }
    }

    public static boolean g() {
        return n && azi.B().u.g;
    }

    static {
        B = "";
    }
}

