/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.lwjgl.BufferUtils
 */
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.BufferUtils;

public class bqe {
    private final bqf a;
    private final String b;
    private int c;
    private int d = 0;

    private bqe(bqf bqf2, int n2, String string) {
        this.a = bqf2;
        this.c = n2;
        this.b = string;
    }

    public void a(bqb bqb2) {
        ++this.d;
        bwg.b(bqb2.h(), this.c);
    }

    public void b(bqb bqb2) {
        --this.d;
        if (this.d <= 0) {
            bwg.a(this.c);
            this.a.d().remove(this.b);
        }
    }

    public String a() {
        return this.b;
    }

    public static bqe a(brr brr2, bqf bqf2, String string) {
        bqe bqe2 = (bqe)bqf2.d().get(string);
        if (bqe2 == null) {
            brq brq2 = new brq("shaders/program/" + string + bqf2.b());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(brr2.a(brq2).b());
            byte[] byArray = IOUtils.toByteArray((InputStream)bufferedInputStream);
            ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)byArray.length);
            byteBuffer.put(byArray);
            byteBuffer.position(0);
            int n2 = bwg.b(bqf2.c());
            bwg.a(n2, byteBuffer);
            bwg.c(n2);
            if (bwg.c(n2, bwg.p) == 0) {
                String string2 = StringUtils.trim((String)bwg.d(n2, 32768));
                ku ku2 = new ku("Couldn't compile " + bqf2.a() + " program: " + string2);
                ku2.b(brq2.a());
                throw ku2;
            }
            bqe2 = new bqe(bqf2, n2, string);
            bqf2.d().put(string, bqe2);
        }
        return bqe2;
    }
}

