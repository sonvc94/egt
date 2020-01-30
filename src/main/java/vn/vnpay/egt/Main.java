package vn.vnpay.egt;

import vn.vnpay.egt.aop.AbstractHandler;
import vn.vnpay.egt.aop.BeforeHandlerImpl;
import vn.vnpay.egt.aop.ProxyFactory;
import vn.vnpay.egt.business.Account;
import vn.vnpay.egt.service.AccountService;
import vn.vnpay.egt.service.AccountServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<AbstractHandler> handlers = new ArrayList<>();
        handlers.add(new BeforeHandlerImpl());

        AccountService proxy = (AccountService) ProxyFactory.getProxy(new AccountServiceImpl(), handlers);
        Account account = new Account("sonvc", "vnd", 2000);
        proxy.addAccount(account);
        proxy.getSize();
        proxy.removeAccount(account);
        proxy.getSize();
    }
}
