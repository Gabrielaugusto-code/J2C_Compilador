/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class bef {
    public static final bef a = new bef();
    private Random b = new Random();
    private String[] c = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale ".split(" ");

    private bef() {
    }

    public String a() {
        int n2 = this.b.nextInt(2) + 3;
        String string = "";
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 > 0) {
                string = string + " ";
            }
            string = string + this.c[this.b.nextInt(this.c.length)];
        }
        return string;
    }

    public void a(long l2) {
        this.b.setSeed(l2);
    }
}

