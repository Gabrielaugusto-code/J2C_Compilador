/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public class btp
extends Thread {
    private final btq a;
    private final InetAddress b;
    private final MulticastSocket c;

    public btp(btq btq2) {
        super("LanServerDetector #" + btn.a().incrementAndGet());
        this.a = btq2;
        this.setDaemon(true);
        this.c = new MulticastSocket(4445);
        this.b = InetAddress.getByName("224.0.2.60");
        this.c.setSoTimeout(5000);
        this.c.joinGroup(this.b);
    }

    @Override
    public void run() {
        byte[] byArray = new byte[1024];
        while (!this.isInterrupted()) {
            DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length);
            try {
                this.c.receive(datagramPacket);
            }
            catch (SocketTimeoutException socketTimeoutException) {
                continue;
            }
            catch (IOException iOException) {
                btn.b().error("Couldn't ping server", (Throwable)iOException);
                break;
            }
            String string = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
            btn.b().debug(datagramPacket.getAddress() + ": " + string);
            this.a.a(string, datagramPacket.getAddress());
        }
        try {
            this.c.leaveGroup(this.b);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.c.close();
    }
}

