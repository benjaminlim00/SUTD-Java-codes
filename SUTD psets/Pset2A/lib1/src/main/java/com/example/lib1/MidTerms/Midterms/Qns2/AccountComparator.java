package com.example.lib1.MidTerms.Midterms.Qns2;

import java.util.Comparator;

public class AccountComparator implements Comparator<Account> {
    @Override
    public int compare(Account a, Account b) {
        return a.getId().compareTo(b.getId());
    }

}

