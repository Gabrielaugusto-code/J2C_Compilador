/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class bcl
extends bap {
    protected static bor j = new bor();
    protected azi k;
    public int l;
    public int m;
    protected List n = new ArrayList();
    protected List o = new ArrayList();
    public boolean p;
    protected ban q;
    private bau a;
    private int f;
    private long g;
    private int h;

    public void a(int n2, int n3, float f2) {
        int n4;
        for (n4 = 0; n4 < this.n.size(); ++n4) {
            ((bau)this.n.get(n4)).a(this.k, n2, n3);
        }
        for (n4 = 0; n4 < this.o.size(); ++n4) {
            ((bax)this.o.get(n4)).a(this.k, n2, n3);
        }
    }

    protected void a(char c2, int n2) {
        if (n2 == 1) {
            this.k.a((bcl)null);
            this.k.l();
        }
    }

    public static String j() {
        try {
            Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
            if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                return (String)transferable.getTransferData(DataFlavor.stringFlavor);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return "";
    }

    public static void d(String string) {
        try {
            StringSelection stringSelection = new StringSelection(string);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    protected void a(abu abu2, int n2, int n3) {
        List list = abu2.a((xq)this.k.h, this.k.u.w);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            if (i2 == 0) {
                list.set(i2, (Object)((Object)abu2.w().e) + (String)list.get(i2));
                continue;
            }
            list.set(i2, (Object)((Object)a.h) + (String)list.get(i2));
        }
        this.a(list, n2, n3);
    }

    protected void a(String string, int n2, int n3) {
        this.a(Arrays.asList(string), n2, n3);
    }

    protected void a(List list, int n2, int n3) {
        int n4;
        if (list.isEmpty()) {
            return;
        }
        GL11.glDisable((int)32826);
        azg.a();
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2929);
        int n5 = 0;
        for (String string : list) {
            n4 = this.q.a(string);
            if (n4 <= n5) continue;
            n5 = n4;
        }
        int n6 = n2 + 12;
        int n7 = n3 - 12;
        n4 = n5;
        int n8 = 8;
        if (list.size() > 1) {
            n8 += 2 + (list.size() - 1) * 10;
        }
        if (n6 + n5 > this.l) {
            n6 -= 28 + n5;
        }
        if (n7 + n8 + 6 > this.m) {
            n7 = this.m - n8 - 6;
        }
        this.e = 300.0f;
        bcl.j.f = 300.0f;
        int n9 = -267386864;
        this.a(n6 - 3, n7 - 4, n6 + n4 + 3, n7 - 3, n9, n9);
        this.a(n6 - 3, n7 + n8 + 3, n6 + n4 + 3, n7 + n8 + 4, n9, n9);
        this.a(n6 - 3, n7 - 3, n6 + n4 + 3, n7 + n8 + 3, n9, n9);
        this.a(n6 - 4, n7 - 3, n6 - 3, n7 + n8 + 3, n9, n9);
        this.a(n6 + n4 + 3, n7 - 3, n6 + n4 + 4, n7 + n8 + 3, n9, n9);
        int n10 = 0x505000FF;
        int n11 = (n10 & 0xFEFEFE) >> 1 | n10 & 0xFF000000;
        this.a(n6 - 3, n7 - 3 + 1, n6 - 3 + 1, n7 + n8 + 3 - 1, n10, n11);
        this.a(n6 + n4 + 2, n7 - 3 + 1, n6 + n4 + 3, n7 + n8 + 3 - 1, n10, n11);
        this.a(n6 - 3, n7 - 3, n6 + n4 + 3, n7 - 3 + 1, n10, n10);
        this.a(n6 - 3, n7 + n8 + 2, n6 + n4 + 3, n7 + n8 + 3, n11, n11);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            String string = (String)list.get(i2);
            this.q.a(string, n6, n7, -1);
            if (i2 == 0) {
                n7 += 2;
            }
            n7 += 10;
        }
        this.e = 0.0f;
        bcl.j.f = 0.0f;
        GL11.glEnable((int)2896);
        GL11.glEnable((int)2929);
        azg.b();
        GL11.glEnable((int)32826);
    }

    protected void a(int n2, int n3, int n4) {
        if (n4 == 0) {
            for (int i2 = 0; i2 < this.n.size(); ++i2) {
                bau bau2 = (bau)this.n.get(i2);
                if (!bau2.c(this.k, n2, n3)) continue;
                this.a = bau2;
                bau2.a(this.k.X());
                this.a(bau2);
            }
        }
    }

    protected void b(int n2, int n3, int n4) {
        if (this.a != null && n4 == 0) {
            this.a.a(n2, n3);
            this.a = null;
        }
    }

    protected void a(int n2, int n3, int n4, long l2) {
    }

    protected void a(bau bau2) {
    }

    public void a(azi azi2, int n2, int n3) {
        this.k = azi2;
        this.q = azi2.l;
        this.l = n2;
        this.m = n3;
        this.n.clear();
        this.r_();
    }

    public void r_() {
    }

    public void k() {
        if (Mouse.isCreated()) {
            while (Mouse.next()) {
                this.d();
            }
        }
        if (Keyboard.isCreated()) {
            while (Keyboard.next()) {
                this.l();
            }
        }
    }

    public void d() {
        int n2 = Mouse.getEventX() * this.l / this.k.d;
        int n3 = this.m - Mouse.getEventY() * this.m / this.k.e - 1;
        int n4 = Mouse.getEventButton();
        if (Mouse.getEventButtonState()) {
            if (this.k.u.z && this.h++ > 0) {
                return;
            }
            this.f = n4;
            this.g = azi.K();
            this.a(n2, n3, this.f);
        } else if (n4 != -1) {
            if (this.k.u.z && --this.h > 0) {
                return;
            }
            this.f = -1;
            this.b(n2, n3, n4);
        } else if (this.f != -1 && this.g > 0L) {
            long l2 = azi.K() - this.g;
            this.a(n2, n3, this.f, l2);
        }
    }

    public void l() {
        if (Keyboard.getEventKeyState()) {
            this.a(Keyboard.getEventCharacter(), Keyboard.getEventKey());
        }
        this.k.aa();
    }

    public void c() {
    }

    public void b() {
    }

    public void q_() {
        this.b(0);
    }

    public void b(int n2) {
        if (this.k.f != null) {
            this.a(0, 0, this.l, this.m, -1072689136, -804253680);
        } else {
            this.c(n2);
        }
    }

    public void c(int n2) {
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2912);
        bna bna2 = bna.a;
        this.k.P().a(b);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        float f2 = 32.0f;
        bna2.b();
        bna2.c(0x404040);
        bna2.a(0.0, this.m, 0.0, 0.0, (float)this.m / f2 + (float)n2);
        bna2.a(this.l, this.m, 0.0, (float)this.l / f2, (float)this.m / f2 + (float)n2);
        bna2.a(this.l, 0.0, 0.0, (float)this.l / f2, n2);
        bna2.a(0.0, 0.0, 0.0, 0.0, n2);
        bna2.a();
    }

    public boolean f() {
        return true;
    }

    public void a(boolean bl2, int n2) {
    }

    public static boolean m() {
        if (azi.a) {
            return Keyboard.isKeyDown((int)219) || Keyboard.isKeyDown((int)220);
        }
        return Keyboard.isKeyDown((int)29) || Keyboard.isKeyDown((int)157);
    }

    public static boolean n() {
        return Keyboard.isKeyDown((int)42) || Keyboard.isKeyDown((int)54);
    }
}

