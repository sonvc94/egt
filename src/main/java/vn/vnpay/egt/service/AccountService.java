package vn.vnpay.egt.service;

import vn.vnpay.egt.business.Account;

public interface AccountService {
    void addAccount(Account account);

    void removeAccount(Account account);

    int getSize();
}
