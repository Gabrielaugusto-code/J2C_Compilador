/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  tv.twitch.AuthToken
 *  tv.twitch.ErrorCode
 *  tv.twitch.chat.Chat
 *  tv.twitch.chat.ChatAPI
 *  tv.twitch.chat.ChatChannelInfo
 *  tv.twitch.chat.ChatEvent
 *  tv.twitch.chat.ChatMessageList
 *  tv.twitch.chat.ChatTokenizedMessage
 *  tv.twitch.chat.ChatUserList
 *  tv.twitch.chat.IChatCallbacks
 *  tv.twitch.chat.StandardChatAPI
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.chat.Chat;
import tv.twitch.chat.ChatAPI;
import tv.twitch.chat.ChatChannelInfo;
import tv.twitch.chat.ChatEvent;
import tv.twitch.chat.ChatMessageList;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatUserList;
import tv.twitch.chat.IChatCallbacks;
import tv.twitch.chat.StandardChatAPI;

public class bur
implements IChatCallbacks {
    private static final Logger p = LogManager.getLogger();
    protected buu a = null;
    protected String b = "";
    protected String c = "";
    protected String d = "";
    protected String e = "";
    protected Chat f = null;
    protected boolean g = false;
    protected boolean h = false;
    protected but i = but.a;
    protected AuthToken j = new AuthToken();
    protected List k = new ArrayList();
    protected LinkedList l = new LinkedList();
    protected int m = 128;
    protected boolean n = false;
    protected boolean o = false;

    public void chatStatusCallback(ErrorCode errorCode) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            return;
        }
        this.i = but.e;
    }

    public void chatChannelMembershipCallback(ChatEvent chatEvent, ChatChannelInfo chatChannelInfo) {
        switch (chatEvent) {
            case TTV_CHAT_JOINED_CHANNEL: {
                this.i = but.d;
                this.p();
                break;
            }
            case TTV_CHAT_LEFT_CHANNEL: {
                this.i = but.e;
                break;
            }
        }
    }

    public void chatChannelUserChangeCallback(ChatUserList chatUserList, ChatUserList chatUserList2, ChatUserList chatUserList3) {
        int n2;
        int n3;
        for (n3 = 0; n3 < chatUserList2.userList.length; ++n3) {
            n2 = this.k.indexOf(chatUserList2.userList[n3]);
            if (n2 < 0) continue;
            this.k.remove(n2);
        }
        for (n3 = 0; n3 < chatUserList3.userList.length; ++n3) {
            n2 = this.k.indexOf(chatUserList3.userList[n3]);
            if (n2 >= 0) {
                this.k.remove(n2);
            }
            this.k.add(chatUserList3.userList[n3]);
        }
        for (n3 = 0; n3 < chatUserList.userList.length; ++n3) {
            this.k.add(chatUserList.userList[n3]);
        }
        try {
            if (this.a != null) {
                this.a.a(chatUserList.userList, chatUserList2.userList, chatUserList3.userList);
            }
        }
        catch (Exception exception) {
            this.h(exception.toString());
        }
    }

    public void chatQueryChannelUsersCallback(ChatUserList chatUserList) {
    }

    public void chatChannelMessageCallback(ChatMessageList chatMessageList) {
        for (int i2 = 0; i2 < chatMessageList.messageList.length; ++i2) {
            this.l.addLast(chatMessageList.messageList[i2]);
        }
        try {
            if (this.a != null) {
                this.a.a(chatMessageList.messageList);
            }
        }
        catch (Exception exception) {
            this.h(exception.toString());
        }
        while (this.l.size() > this.m) {
            this.l.removeFirst();
        }
    }

    public void chatClearCallback(String string) {
        this.o();
    }

    public void emoticonDataDownloadCallback(ErrorCode errorCode) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.s();
        }
    }

    public void chatChannelTokenizedMessageCallback(ChatTokenizedMessage[] chatTokenizedMessageArray) {
    }

    public void a(buu buu2) {
        this.a = buu2;
    }

    public boolean c() {
        return this.i == but.d;
    }

    public void a(AuthToken authToken) {
        this.j = authToken;
    }

    public void a(String string) {
        this.d = string;
    }

    public void c(String string) {
        this.b = string;
    }

    public but j() {
        return this.i;
    }

    public bur() {
        this.f = new Chat((ChatAPI)new StandardChatAPI());
    }

    public boolean d(String string) {
        this.l();
        this.h = false;
        this.c = string;
        return this.f(string);
    }

    public boolean l() {
        if (this.i == but.d || this.i == but.c) {
            ErrorCode errorCode = this.f.disconnect();
            if (ErrorCode.failed((ErrorCode)errorCode)) {
                String string = ErrorCode.getString((ErrorCode)errorCode);
                this.h(String.format("Error disconnecting: %s", string));
                return false;
            }
            this.q();
        } else if (this.i == but.e) {
            this.q();
        }
        return this.m();
    }

    protected boolean f(String string) {
        if (this.g) {
            return false;
        }
        ErrorCode errorCode = this.f.initialize(string, false);
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string2 = ErrorCode.getString((ErrorCode)errorCode);
            this.h(String.format("Error initializing chat: %s", string2));
            this.q();
            return false;
        }
        this.g = true;
        this.f.setChatCallbacks((IChatCallbacks)this);
        this.i = but.b;
        return true;
    }

    protected boolean m() {
        ErrorCode errorCode;
        if (this.g && ErrorCode.failed((ErrorCode)(errorCode = this.f.shutdown()))) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.h(String.format("Error shutting down chat: %s", string));
            return false;
        }
        this.i = but.a;
        this.g = false;
        this.t();
        this.f.setChatCallbacks(null);
        return true;
    }

    public void n() {
        String string;
        if (!this.g) {
            return;
        }
        ErrorCode errorCode = this.f.flushEvents();
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            string = ErrorCode.getString((ErrorCode)errorCode);
            this.h(String.format("Error flushing chat events: %s", string));
        }
        switch (this.i) {
            case a: {
                break;
            }
            case b: {
                errorCode = this.h ? this.f.connectAnonymous() : this.f.connect(this.c, this.j.data);
                if (ErrorCode.failed((ErrorCode)errorCode)) {
                    string = ErrorCode.getString((ErrorCode)errorCode);
                    this.h(String.format("Error connecting: %s", string));
                    this.m();
                    this.q();
                    break;
                }
                this.i = but.c;
                this.r();
                break;
            }
            case c: {
                break;
            }
            case d: {
                break;
            }
            case e: {
                this.l();
            }
        }
    }

    public boolean g(String string) {
        if (this.i != but.d) {
            return false;
        }
        ErrorCode errorCode = this.f.sendMessage(string);
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string2 = ErrorCode.getString((ErrorCode)errorCode);
            this.h(String.format("Error sending chat message: %s", string2));
            return false;
        }
        return true;
    }

    public void o() {
        this.l.clear();
        try {
            if (this.a != null) {
                this.a.f();
            }
        }
        catch (Exception exception) {
            this.h(exception.toString());
        }
    }

    protected void p() {
        try {
            if (this.a != null) {
                this.a.d();
            }
        }
        catch (Exception exception) {
            this.h(exception.toString());
        }
    }

    protected void q() {
        try {
            if (this.a != null) {
                this.a.e();
            }
        }
        catch (Exception exception) {
            this.h(exception.toString());
        }
    }

    protected void r() {
    }

    protected void s() {
    }

    protected void t() {
    }

    protected void h(String string) {
        p.error(bvb.a, "[Chat controller] {}", new Object[]{string});
    }
}

