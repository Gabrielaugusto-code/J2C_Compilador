/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class ku
extends IOException {
    private final List a = Lists.newArrayList();
    private final String b;

    public ku(String string) {
        this.a.add(new kw(null));
        this.b = string;
    }

    public ku(String string, Throwable throwable) {
        super(throwable);
        this.a.add(new kw(null));
        this.b = string;
    }

    public void a(String string) {
        kw.a((kw)this.a.get(0), string);
    }

    public void b(String string) {
        kw.b((kw)this.a.get(0), string);
        this.a.add(0, new kw(null));
    }

    @Override
    public String getMessage() {
        return "Invalid " + ((kw)this.a.get(this.a.size() - 1)).toString() + ": " + this.b;
    }

    public static ku a(Exception exception) {
        if (exception instanceof ku) {
            return (ku)exception;
        }
        String string = exception.getMessage();
        if (exception instanceof FileNotFoundException) {
            string = "File not found";
        }
        return new ku(string, exception);
    }
}

