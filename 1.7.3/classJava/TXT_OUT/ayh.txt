/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ayh {
    private axt a;
    private Map b = new HashMap();
    private List c = new ArrayList();
    private Map d = new HashMap();

    public ayh(axt axt2) {
        this.a = axt2;
        this.b();
    }

    public axc a(Class clazz, String string) {
        axc axc2;
        block7: {
            axc2 = (axc)this.b.get(string);
            if (axc2 != null) {
                return axc2;
            }
            if (this.a != null) {
                try {
                    File file = this.a.b(string);
                    if (file == null || !file.exists()) break block7;
                    try {
                        axc2 = (axc)clazz.getConstructor(String.class).newInstance(string);
                    }
                    catch (Exception exception) {
                        throw new RuntimeException("Failed to instantiate " + clazz.toString(), exception);
                    }
                    FileInputStream fileInputStream = new FileInputStream(file);
                    dg dg2 = dr.a(fileInputStream);
                    fileInputStream.close();
                    axc2.a(dg2.m("data"));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        if (axc2 != null) {
            this.b.put(string, axc2);
            this.c.add(axc2);
        }
        return axc2;
    }

    public void a(String string, axc axc2) {
        if (axc2 == null) {
            throw new RuntimeException("Can't set null data");
        }
        if (this.b.containsKey(string)) {
            this.c.remove(this.b.remove(string));
        }
        this.b.put(string, axc2);
        this.c.add(axc2);
    }

    public void a() {
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            axc axc2 = (axc)this.c.get(i2);
            if (!axc2.d()) continue;
            this.a(axc2);
            axc2.a(false);
        }
    }

    private void a(axc axc2) {
        if (this.a == null) {
            return;
        }
        try {
            File file = this.a.b(axc2.h);
            if (file != null) {
                dg dg2 = new dg();
                axc2.b(dg2);
                dg dg3 = new dg();
                dg3.a("data", dg2);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                dr.a(dg3, fileOutputStream);
                fileOutputStream.close();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void b() {
        try {
            this.d.clear();
            if (this.a == null) {
                return;
            }
            File file = this.a.b("idcounts");
            if (file != null && file.exists()) {
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                dg dg2 = dr.a(dataInputStream);
                dataInputStream.close();
                for (String string : dg2.c()) {
                    du du2 = dg2.a(string);
                    if (!(du2 instanceof ds)) continue;
                    ds ds2 = (ds)du2;
                    String string2 = string;
                    short s2 = ds2.e();
                    this.d.put(string2, s2);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public int a(String string) {
        Object object;
        Comparable<Short> comparable;
        Short s2 = (Short)this.d.get(string);
        if (s2 == null) {
            s2 = 0;
        } else {
            comparable = s2;
            s2 = (short)(s2 + 1);
            object = s2;
        }
        this.d.put(string, s2);
        if (this.a == null) {
            return s2.shortValue();
        }
        try {
            comparable = this.a.b("idcounts");
            if (comparable != null) {
                object = new dg();
                for (String string2 : this.d.keySet()) {
                    short s3 = (Short)this.d.get(string2);
                    ((dg)object).a(string2, s3);
                }
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream((File)comparable));
                dr.a((dg)object, (DataOutput)dataOutputStream);
                dataOutputStream.close();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return s2.shortValue();
    }
}

