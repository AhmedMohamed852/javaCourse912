package com.java;



public class AccountServesImpl implements AccountServes {


    private EWalletSystem eWalletSystem = new EWalletSystem();

    @Override
    public Boolean createAccount(Account account) {
        boolean isAccountExist =  eWalletSystem.getAccounts()
                .stream()
                .anyMatch(acc->acc.getUsername().equals(account.getUsername()));
        if (isAccountExist){
            return false;
        }
        eWalletSystem.getAccounts().add(account);
        return true;
    }


    @Override
    public Boolean isAccountExistByUserNameAndPassword(Account account) {
        boolean isAccountExist = eWalletSystem.getAccounts()
                .stream().anyMatch(acc -> acc.getUsername()
                        .equals(account.getUsername())
                        && acc.getPassword().equals(account.getPassword()));
        return isAccountExist;
    }

}



