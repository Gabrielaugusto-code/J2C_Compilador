/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class dr {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static dg a(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(inputStream)));
        try {
            dg dg2 = dr.a(dataInputStream);
            return dg2;
        }
        finally {
            dataInputStream.close();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(dg dg2, OutputStream outputStream) {
        DataOutputStream dataOutputStream = new DataOutputStream(new GZIPOutputStream(outputStream));
        try {
            dr.a(dg2, (DataOutput)dataOutputStream);
        }
        finally {
            dataOutputStream.close();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static dg a(byte[] byArray) {
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(byArray))));
        try {
            dg dg2 = dr.a(dataInputStream);
            return dg2;
        }
        finally {
            dataInputStream.close();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] a(dg dg2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(new GZIPOutputStream(byteArrayOutputStream));
        try {
            dr.a(dg2, (DataOutput)dataOutputStream);
        }
        finally {
            dataOutputStream.close();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void a(dg dg2, File file) {
        File file2 = new File(file.getAbsolutePath() + "_tmp");
        if (file2.exists()) {
            file2.delete();
        }
        dr.b(dg2, file2);
        if (file.exists()) {
            file.delete();
        }
        if (file.exists()) {
            throw new IOException("Failed to delete " + file);
        }
        file2.renameTo(file);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b(dg dg2, File file) {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dr.a(dg2, (DataOutput)dataOutputStream);
        }
        finally {
            dataOutputStream.close();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static dg a(File file) {
        if (!file.exists()) {
            return null;
        }
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            dg dg2 = dr.a(dataInputStream);
            return dg2;
        }
        finally {
            dataInputStream.close();
        }
    }

    public static dg a(DataInput dataInput) {
        du du2 = dr.a(dataInput, 0);
        if (du2 instanceof dg) {
            return (dg)du2;
        }
        throw new IOException("Root tag must be a named compound tag");
    }

    public static void a(dg dg2, DataOutput dataOutput) {
        dr.a((du)dg2, dataOutput);
    }

    private static void a(du du2, DataOutput dataOutput) {
        dataOutput.writeByte(du2.a());
        if (du2.a() == 0) {
            return;
        }
        dataOutput.writeUTF("");
        du2.a(dataOutput);
    }

    private static du a(DataInput dataInput, int n2) {
        byte by2 = dataInput.readByte();
        if (by2 == 0) {
            return new dk();
        }
        dataInput.readUTF();
        du du2 = du.a(by2);
        try {
            du2.a(dataInput, n2);
        }
        catch (IOException iOException) {
            b b2 = b.a(iOException, "Loading NBT data");
            k k2 = b2.a("NBT Tag");
            k2.a("Tag name", "[UNNAMED TAG]");
            k2.a("Tag type", by2);
            throw new s(b2);
        }
        return du2;
    }
}

