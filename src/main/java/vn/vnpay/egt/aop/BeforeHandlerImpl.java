package vn.vnpay.egt.aop;

import java.lang.reflect.Method;

public class BeforeHandlerImpl extends BeforeHandler {

    public void handleBefore(Object proxy, Method method, Object[] args) {
        System.out.println("before handle");
    }
}
