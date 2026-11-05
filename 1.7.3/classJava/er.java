/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
import com.google.common.collect.BiMap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class er
extends MessageToByteEncoder {
    private static final Logger a = LogManager.getLogger();
    private static final Marker b = MarkerManager.getMarker((String)"PACKET_SENT", (Marker)ef.b);

    protected void a(ChannelHandlerContext channelHandlerContext, fk fk2, ByteBuf byteBuf) {
        Integer n2 = (Integer)((BiMap)channelHandlerContext.channel().attr(ef.e).get()).inverse().get(fk2.getClass());
        if (a.isDebugEnabled()) {
            a.debug(b, "OUT: [{}:{}] {}[{}]", new Object[]{channelHandlerContext.channel().attr(ef.c).get(), n2, fk2.getClass().getName(), fk2.b()});
        }
        if (n2 == null) {
            throw new IOException("Can't serialize unregistered packet");
        }
        ep ep2 = new ep(byteBuf);
        ep2.b(n2);
        fk2.b(ep2);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        this.a(channelHandlerContext, (fk)object, byteBuf);
    }
}

