package cn.zjf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zjf.bean.Account;
import cn.zjf.dao.AccountDao;

@Service("accountService")
public class AccountDaoService {
	@Autowired
	private AccountDao dao;
	
	
	public Account login(String acc_no,String acc_password) {
		return dao.findByAccNoAndAccPassword(acc_no, acc_password);
	}
}
