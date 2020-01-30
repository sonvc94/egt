package vn.vnpay.egt.service;

import vn.vnpay.egt.business.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

    private List<Account> accounts = new ArrayList<>();

    @Override
    public void addAccount(Account account) {
        System.out.println("add account: " + account);
        accounts.add(account);
    }

    @Override
    public void removeAccount(Account account) {
        System.out.println("remove account: " + account);
        accounts.remove(account);
    }

    @Override
    public int getSize() {
        System.out.println("get size: " + accounts.size());
        return accounts.size();
    }
}
