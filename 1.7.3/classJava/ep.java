/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufAllocator
 *  io.netty.buffer.ByteBufProcessor
 */
import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufProcessor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

public class ep
extends ByteBuf {
    private final ByteBuf a;

    public ep(ByteBuf byteBuf) {
        this.a = byteBuf;
    }

    public static int a(int n2) {
        if ((n2 & 0xFFFFFF80) == 0) {
            return 1;
        }
        if ((n2 & 0xFFFFC000) == 0) {
            return 2;
        }
        if ((n2 & 0xFFE00000) == 0) {
            return 3;
        }
        if ((n2 & 0xF0000000) == 0) {
            return 4;
        }
        return 5;
    }

    public int a() {
        byte by2;
        int n2 = 0;
        int n3 = 0;
        do {
            by2 = this.readByte();
            n2 |= (by2 & 0x7F) << n3++ * 7;
            if (n3 <= 5) continue;
            throw new RuntimeException("VarInt too big");
        } while ((by2 & 0x80) == 128);
        return n2;
    }

    public void b(int n2) {
        while (true) {
            if ((n2 & 0xFFFFFF80) == 0) {
                this.writeByte(n2);
                return;
            }
            this.writeByte(n2 & 0x7F | 0x80);
            n2 >>>= 7;
        }
    }

    public void a(dg dg2) {
        if (dg2 == null) {
            this.writeShort(-1);
        } else {
            byte[] byArray = dr.a(dg2);
            this.writeShort((short)byArray.length);
            this.writeBytes(byArray);
        }
    }

    public dg b() {
        short s2 = this.readShort();
        if (s2 < 0) {
            return null;
        }
        byte[] byArray = new byte[s2];
        this.readBytes(byArray);
        return dr.a(byArray);
    }

    public void a(abu abu2) {
        if (abu2 == null) {
            this.writeShort(-1);
        } else {
            this.writeShort(abs.b(abu2.b()));
            this.writeByte(abu2.b);
            this.writeShort(abu2.k());
            dg dg2 = null;
            if (abu2.b().p() || abu2.b().s()) {
                dg2 = abu2.d;
            }
            this.a(dg2);
        }
    }

    public abu c() {
        abu abu2 = null;
        short s2 = this.readShort();
        if (s2 >= 0) {
            byte by2 = this.readByte();
            short s3 = this.readShort();
            abu2 = new abu(abs.d(s2), (int)by2, (int)s3);
            abu2.d = this.b();
        }
        return abu2;
    }

    public String c(int n2) {
        int n3 = this.a();
        if (n3 > n2 * 4) {
            throw new IOException("The received encoded string buffer length is longer than maximum allowed (" + n3 + " > " + n2 * 4 + ")");
        }
        if (n3 < 0) {
            throw new IOException("The received encoded string buffer length is less than zero! Weird string!");
        }
        String string = new String(this.readBytes(n3).array(), Charsets.UTF_8);
        if (string.length() > n2) {
            throw new IOException("The received string length is longer than maximum allowed (" + n3 + " > " + n2 + ")");
        }
        return string;
    }

    public void a(String string) {
        byte[] byArray = string.getBytes(Charsets.UTF_8);
        if (byArray.length > Short.MAX_VALUE) {
            throw new IOException("String too big (was " + string.length() + " bytes encoded, max " + Short.MAX_VALUE + ")");
        }
        this.b(byArray.length);
        this.writeBytes(byArray);
    }

    public int capacity() {
        return this.a.capacity();
    }

    public ByteBuf capacity(int n2) {
        return this.a.capacity(n2);
    }

    public int maxCapacity() {
        return this.a.maxCapacity();
    }

    public ByteBufAllocator alloc() {
        return this.a.alloc();
    }

    public ByteOrder order() {
        return this.a.order();
    }

    public ByteBuf order(ByteOrder byteOrder) {
        return this.a.order(byteOrder);
    }

    public ByteBuf unwrap() {
        return this.a.unwrap();
    }

    public boolean isDirect() {
        return this.a.isDirect();
    }

    public int readerIndex() {
        return this.a.readerIndex();
    }

    public ByteBuf readerIndex(int n2) {
        return this.a.readerIndex(n2);
    }

    public int writerIndex() {
        return this.a.writerIndex();
    }

    public ByteBuf writerIndex(int n2) {
        return this.a.writerIndex(n2);
    }

    public ByteBuf setIndex(int n2, int n3) {
        return this.a.setIndex(n2, n3);
    }

    public int readableBytes() {
        return this.a.readableBytes();
    }

    public int writableBytes() {
        return this.a.writableBytes();
    }

    public int maxWritableBytes() {
        return this.a.maxWritableBytes();
    }

    public boolean isReadable() {
        return this.a.isReadable();
    }

    public boolean isReadable(int n2) {
        return this.a.isReadable(n2);
    }

    public boolean isWritable() {
        return this.a.isWritable();
    }

    public boolean isWritable(int n2) {
        return this.a.isWritable(n2);
    }

    public ByteBuf clear() {
        return this.a.clear();
    }

    public ByteBuf markReaderIndex() {
        return this.a.markReaderIndex();
    }

    public ByteBuf resetReaderIndex() {
        return this.a.resetReaderIndex();
    }

    public ByteBuf markWriterIndex() {
        return this.a.markWriterIndex();
    }

    public ByteBuf resetWriterIndex() {
        return this.a.resetWriterIndex();
    }

    public ByteBuf discardReadBytes() {
        return this.a.discardReadBytes();
    }

    public ByteBuf discardSomeReadBytes() {
        return this.a.discardSomeReadBytes();
    }

    public ByteBuf ensureWritable(int n2) {
        return this.a.ensureWritable(n2);
    }

    public int ensureWritable(int n2, boolean bl2) {
        return this.a.ensureWritable(n2, bl2);
    }

    public boolean getBoolean(int n2) {
        return this.a.getBoolean(n2);
    }

    public byte getByte(int n2) {
        return this.a.getByte(n2);
    }

    public short getUnsignedByte(int n2) {
        return this.a.getUnsignedByte(n2);
    }

    public short getShort(int n2) {
        return this.a.getShort(n2);
    }

    public int getUnsignedShort(int n2) {
        return this.a.getUnsignedShort(n2);
    }

    public int getMedium(int n2) {
        return this.a.getMedium(n2);
    }

    public int getUnsignedMedium(int n2) {
        return this.a.getUnsignedMedium(n2);
    }

    public int getInt(int n2) {
        return this.a.getInt(n2);
    }

    public long getUnsignedInt(int n2) {
        return this.a.getUnsignedInt(n2);
    }

    public long getLong(int n2) {
        return this.a.getLong(n2);
    }

    public char getChar(int n2) {
        return this.a.getChar(n2);
    }

    public float getFloat(int n2) {
        return this.a.getFloat(n2);
    }

    public double getDouble(int n2) {
        return this.a.getDouble(n2);
    }

    public ByteBuf getBytes(int n2, ByteBuf byteBuf) {
        return this.a.getBytes(n2, byteBuf);
    }

    public ByteBuf getBytes(int n2, ByteBuf byteBuf, int n3) {
        return this.a.getBytes(n2, byteBuf, n3);
    }

    public ByteBuf getBytes(int n2, ByteBuf byteBuf, int n3, int n4) {
        return this.a.getBytes(n2, byteBuf, n3, n4);
    }

    public ByteBuf getBytes(int n2, byte[] byArray) {
        return this.a.getBytes(n2, byArray);
    }

    public ByteBuf getBytes(int n2, byte[] byArray, int n3, int n4) {
        return this.a.getBytes(n2, byArray, n3, n4);
    }

    public ByteBuf getBytes(int n2, ByteBuffer byteBuffer) {
        return this.a.getBytes(n2, byteBuffer);
    }

    public ByteBuf getBytes(int n2, OutputStream outputStream, int n3) {
        return this.a.getBytes(n2, outputStream, n3);
    }

    public int getBytes(int n2, GatheringByteChannel gatheringByteChannel, int n3) {
        return this.a.getBytes(n2, gatheringByteChannel, n3);
    }

    public ByteBuf setBoolean(int n2, boolean bl2) {
        return this.a.setBoolean(n2, bl2);
    }

    public ByteBuf setByte(int n2, int n3) {
        return this.a.setByte(n2, n3);
    }

    public ByteBuf setShort(int n2, int n3) {
        return this.a.setShort(n2, n3);
    }

    public ByteBuf setMedium(int n2, int n3) {
        return this.a.setMedium(n2, n3);
    }

    public ByteBuf setInt(int n2, int n3) {
        return this.a.setInt(n2, n3);
    }

    public ByteBuf setLong(int n2, long l2) {
        return this.a.setLong(n2, l2);
    }

    public ByteBuf setChar(int n2, int n3) {
        return this.a.setChar(n2, n3);
    }

    public ByteBuf setFloat(int n2, float f2) {
        return this.a.setFloat(n2, f2);
    }

    public ByteBuf setDouble(int n2, double d2) {
        return this.a.setDouble(n2, d2);
    }

    public ByteBuf setBytes(int n2, ByteBuf byteBuf) {
        return this.a.setBytes(n2, byteBuf);
    }

    public ByteBuf setBytes(int n2, ByteBuf byteBuf, int n3) {
        return this.a.setBytes(n2, byteBuf, n3);
    }

    public ByteBuf setBytes(int n2, ByteBuf byteBuf, int n3, int n4) {
        return this.a.setBytes(n2, byteBuf, n3, n4);
    }

    public ByteBuf setBytes(int n2, byte[] byArray) {
        return this.a.setBytes(n2, byArray);
    }

    public ByteBuf setBytes(int n2, byte[] byArray, int n3, int n4) {
        return this.a.setBytes(n2, byArray, n3, n4);
    }

    public ByteBuf setBytes(int n2, ByteBuffer byteBuffer) {
        return this.a.setBytes(n2, byteBuffer);
    }

    public int setBytes(int n2, InputStream inputStream, int n3) {
        return this.a.setBytes(n2, inputStream, n3);
    }

    public int setBytes(int n2, ScatteringByteChannel scatteringByteChannel, int n3) {
        return this.a.setBytes(n2, scatteringByteChannel, n3);
    }

    public ByteBuf setZero(int n2, int n3) {
        return this.a.setZero(n2, n3);
    }

    public boolean readBoolean() {
        return this.a.readBoolean();
    }

    public byte readByte() {
        return this.a.readByte();
    }

    public short readUnsignedByte() {
        return this.a.readUnsignedByte();
    }

    public short readShort() {
        return this.a.readShort();
    }

    public int readUnsignedShort() {
        return this.a.readUnsignedShort();
    }

    public int readMedium() {
        return this.a.readMedium();
    }

    public int readUnsignedMedium() {
        return this.a.readUnsignedMedium();
    }

    public int readInt() {
        return this.a.readInt();
    }

    public long readUnsignedInt() {
        return this.a.readUnsignedInt();
    }

    public long readLong() {
        return this.a.readLong();
    }

    public char readChar() {
        return this.a.readChar();
    }

    public float readFloat() {
        return this.a.readFloat();
    }

    public double readDouble() {
        return this.a.readDouble();
    }

    public ByteBuf readBytes(int n2) {
        return this.a.readBytes(n2);
    }

    public ByteBuf readSlice(int n2) {
        return this.a.readSlice(n2);
    }

    public ByteBuf readBytes(ByteBuf byteBuf) {
        return this.a.readBytes(byteBuf);
    }

    public ByteBuf readBytes(ByteBuf byteBuf, int n2) {
        return this.a.readBytes(byteBuf, n2);
    }

    public ByteBuf readBytes(ByteBuf byteBuf, int n2, int n3) {
        return this.a.readBytes(byteBuf, n2, n3);
    }

    public ByteBuf readBytes(byte[] byArray) {
        return this.a.readBytes(byArray);
    }

    public ByteBuf readBytes(byte[] byArray, int n2, int n3) {
        return this.a.readBytes(byArray, n2, n3);
    }

    public ByteBuf readBytes(ByteBuffer byteBuffer) {
        return this.a.readBytes(byteBuffer);
    }

    public ByteBuf readBytes(OutputStream outputStream, int n2) {
        return this.a.readBytes(outputStream, n2);
    }

    public int readBytes(GatheringByteChannel gatheringByteChannel, int n2) {
        return this.a.readBytes(gatheringByteChannel, n2);
    }

    public ByteBuf skipBytes(int n2) {
        return this.a.skipBytes(n2);
    }

    public ByteBuf writeBoolean(boolean bl2) {
        return this.a.writeBoolean(bl2);
    }

    public ByteBuf writeByte(int n2) {
        return this.a.writeByte(n2);
    }

    public ByteBuf writeShort(int n2) {
        return this.a.writeShort(n2);
    }

    public ByteBuf writeMedium(int n2) {
        return this.a.writeMedium(n2);
    }

    public ByteBuf writeInt(int n2) {
        return this.a.writeInt(n2);
    }

    public ByteBuf writeLong(long l2) {
        return this.a.writeLong(l2);
    }

    public ByteBuf writeChar(int n2) {
        return this.a.writeChar(n2);
    }

    public ByteBuf writeFloat(float f2) {
        return this.a.writeFloat(f2);
    }

    public ByteBuf writeDouble(double d2) {
        return this.a.writeDouble(d2);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf) {
        return this.a.writeBytes(byteBuf);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf, int n2) {
        return this.a.writeBytes(byteBuf, n2);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf, int n2, int n3) {
        return this.a.writeBytes(byteBuf, n2, n3);
    }

    public ByteBuf writeBytes(byte[] byArray) {
        return this.a.writeBytes(byArray);
    }

    public ByteBuf writeBytes(byte[] byArray, int n2, int n3) {
        return this.a.writeBytes(byArray, n2, n3);
    }

    public ByteBuf writeBytes(ByteBuffer byteBuffer) {
        return this.a.writeBytes(byteBuffer);
    }

    public int writeBytes(InputStream inputStream, int n2) {
        return this.a.writeBytes(inputStream, n2);
    }

    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int n2) {
        return this.a.writeBytes(scatteringByteChannel, n2);
    }

    public ByteBuf writeZero(int n2) {
        return this.a.writeZero(n2);
    }

    public int indexOf(int n2, int n3, byte by2) {
        return this.a.indexOf(n2, n3, by2);
    }

    public int bytesBefore(byte by2) {
        return this.a.bytesBefore(by2);
    }

    public int bytesBefore(int n2, byte by2) {
        return this.a.bytesBefore(n2, by2);
    }

    public int bytesBefore(int n2, int n3, byte by2) {
        return this.a.bytesBefore(n2, n3, by2);
    }

    public int forEachByte(ByteBufProcessor byteBufProcessor) {
        return this.a.forEachByte(byteBufProcessor);
    }

    public int forEachByte(int n2, int n3, ByteBufProcessor byteBufProcessor) {
        return this.a.forEachByte(n2, n3, byteBufProcessor);
    }

    public int forEachByteDesc(ByteBufProcessor byteBufProcessor) {
        return this.a.forEachByteDesc(byteBufProcessor);
    }

    public int forEachByteDesc(int n2, int n3, ByteBufProcessor byteBufProcessor) {
        return this.a.forEachByteDesc(n2, n3, byteBufProcessor);
    }

    public ByteBuf copy() {
        return this.a.copy();
    }

    public ByteBuf copy(int n2, int n3) {
        return this.a.copy(n2, n3);
    }

    public ByteBuf slice() {
        return this.a.slice();
    }

    public ByteBuf slice(int n2, int n3) {
        return this.a.slice(n2, n3);
    }

    public ByteBuf duplicate() {
        return this.a.duplicate();
    }

    public int nioBufferCount() {
        return this.a.nioBufferCount();
    }

    public ByteBuffer nioBuffer() {
        return this.a.nioBuffer();
    }

    public ByteBuffer nioBuffer(int n2, int n3) {
        return this.a.nioBuffer(n2, n3);
    }

    public ByteBuffer internalNioBuffer(int n2, int n3) {
        return this.a.internalNioBuffer(n2, n3);
    }

    public ByteBuffer[] nioBuffers() {
        return this.a.nioBuffers();
    }

    public ByteBuffer[] nioBuffers(int n2, int n3) {
        return this.a.nioBuffers(n2, n3);
    }

    public boolean hasArray() {
        return this.a.hasArray();
    }

    public byte[] array() {
        return this.a.array();
    }

    public int arrayOffset() {
        return this.a.arrayOffset();
    }

    public boolean hasMemoryAddress() {
        return this.a.hasMemoryAddress();
    }

    public long memoryAddress() {
        return this.a.memoryAddress();
    }

    public String toString(Charset charset) {
        return this.a.toString(charset);
    }

    public String toString(int n2, int n3, Charset charset) {
        return this.a.toString(n2, n3, charset);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean equals(Object object) {
        return this.a.equals(object);
    }

    public int compareTo(ByteBuf byteBuf) {
        return this.a.compareTo(byteBuf);
    }

    public String toString() {
        return this.a.toString();
    }

    public ByteBuf retain(int n2) {
        return this.a.retain(n2);
    }

    public ByteBuf retain() {
        return this.a.retain();
    }

    public int refCnt() {
        return this.a.refCnt();
    }

    public boolean release() {
        return this.a.release();
    }

    public boolean release(int n2) {
        return this.a.release(n2);
    }
}

