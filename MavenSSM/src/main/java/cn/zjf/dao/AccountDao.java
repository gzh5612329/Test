package cn.zjf.dao;

import org.apache.ibatis.annotations.Param;

import cn.zjf.bean.Account;

public interface AccountDao {
	Account findByAccNoAndAccPassword(
			@Param("acc_no")String acc_no,
			@Param("acc_password")String acc_password);
}
