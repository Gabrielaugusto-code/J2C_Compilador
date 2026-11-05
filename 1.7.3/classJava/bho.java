/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

public final class bho
implements ParameterizedType {
    @Override
    public Type[] getActualTypeArguments() {
        return new Type[]{String.class, new bhp(this)};
    }

    @Override
    public Type getRawType() {
        return Map.class;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }
}

