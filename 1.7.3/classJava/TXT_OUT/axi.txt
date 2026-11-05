/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class axi
implements axv {
    private static final Logger b = LogManager.getLogger();
    protected final File a;

    public axi(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        this.a = file;
    }

    @Override
    public List b() {
        ArrayList<axw> arrayList = new ArrayList<axw>();
        for (int i2 = 0; i2 < 5; ++i2) {
            String string = "World" + (i2 + 1);
            axj axj2 = this.c(string);
            if (axj2 == null) continue;
            arrayList.add(new axw(string, "", axj2.m(), axj2.h(), axj2.r(), false, axj2.t(), axj2.v()));
        }
        return arrayList;
    }

    @Override
    public void d() {
    }

    @Override
    public axj c(String string) {
        File file = new File(this.a, string);
        if (!file.exists()) {
            return null;
        }
        File file2 = new File(file, "level.dat");
        if (file2.exists()) {
            try {
                dg dg2 = dr.a(new FileInputStream(file2));
                dg dg3 = dg2.m("Data");
                return new axj(dg3);
            }
            catch (Exception exception) {
                b.error("Exception reading " + file2, (Throwable)exception);
            }
        }
        if ((file2 = new File(file, "level.dat_old")).exists()) {
            try {
                dg dg4 = dr.a(new FileInputStream(file2));
                dg dg5 = dg4.m("Data");
                return new axj(dg5);
            }
            catch (Exception exception) {
                b.error("Exception reading " + file2, (Throwable)exception);
            }
        }
        return null;
    }

    @Override
    public void a(String string, String string2) {
        File file = new File(this.a, string);
        if (!file.exists()) {
            return;
        }
        File file2 = new File(file, "level.dat");
        if (file2.exists()) {
            try {
                dg dg2 = dr.a(new FileInputStream(file2));
                dg dg3 = dg2.m("Data");
                dg3.a("LevelName", string2);
                dr.a(dg2, new FileOutputStream(file2));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    @Override
    public boolean e(String string) {
        File file = new File(this.a, string);
        if (!file.exists()) {
            return true;
        }
        b.info("Deleting level " + string);
        for (int i2 = 1; i2 <= 5; ++i2) {
            b.info("Attempt " + i2 + "...");
            if (axi.a(file.listFiles())) break;
            b.warn("Unsuccessful in deleting contents.");
            if (i2 >= 5) continue;
            try {
                Thread.sleep(500L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        return file.delete();
    }

    protected static boolean a(File[] fileArray) {
        for (int i2 = 0; i2 < fileArray.length; ++i2) {
            File file = fileArray[i2];
            b.debug("Deleting " + file);
            if (file.isDirectory() && !axi.a(file.listFiles())) {
                b.warn("Couldn't delete directory " + file);
                return false;
            }
            if (file.delete()) continue;
            b.warn("Couldn't delete file " + file);
            return false;
        }
        return true;
    }

    @Override
    public axt a(String string, boolean bl2) {
        return new axh(this.a, string, bl2);
    }

    @Override
    public boolean b(String string) {
        return false;
    }

    @Override
    public boolean a(String string, pb pb2) {
        return false;
    }

    @Override
    public boolean f(String string) {
        File file = new File(this.a, string);
        return file.isDirectory();
    }
}

