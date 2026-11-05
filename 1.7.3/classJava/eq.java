/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
import com.google.common.collect.BiMap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class eq
extends ByteToMessageDecoder {
    private static final Logger a = LogManager.getLogger();
    private static final Marker b = MarkerManager.getMarker((String)"PACKET_RECEIVED", (Marker)ef.b);

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List list) {
        if (byteBuf.readableBytes() == 0) {
            return;
        }
        ep ep2 = new ep(byteBuf);
        int n2 = ep2.a();
        fk fk2 = fk.a((BiMap)channelHandlerContext.channel().attr(ef.d).get(), n2);
        if (fk2 == null) {
            throw new IOException("Bad packet id " + n2);
        }
        fk2.a(ep2);
        if (ep2.readableBytes() > 0) {
            throw new IOException("Packet was larger than I expected, found " + ep2.readableBytes() + " bytes extra whilst reading packet " + n2);
        }
        list.add(fk2);
        if (a.isDebugEnabled()) {
            a.debug(b, " IN: [{}:{}] {}[{}]", new Object[]{channelHandlerContext.channel().attr(ef.c).get(), n2, fk2.getClass().getName(), fk2.b()});
        }
    }
}

