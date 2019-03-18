package main.java.com.afsamir.gson;

import java.lang.reflect.Type;

public class TypeWrapper<T> {

    private final Type type;
    private final Class<? super T> rawType;

    public TypeWrapper(Type type, Class<? super T> rawType) {
        this.type = type;
        this.rawType = rawType;
    }

    public Type getType() {
        return type;
    }


    public Class<? super T> getRawType() {
        return rawType;
    }
}
