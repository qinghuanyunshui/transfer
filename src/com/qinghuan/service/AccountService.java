package com.qinghuan.service;

import com.qinghuan.dao.AccountDao;

public class AccountService {
	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	//银行转账
	public void transfer(){
		accountDao.transfer();
	}

}
