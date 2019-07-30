package utils;

import java.util.concurrent.atomic.AtomicLong;

public class UserIdGen {

    private static AtomicLong idCounter = new AtomicLong();

    public static Long createID() {
        return idCounter.getAndIncrement();
    }
}
