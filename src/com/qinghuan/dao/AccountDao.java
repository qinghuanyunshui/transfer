package com.qinghuan.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDao {
		private JdbcTemplate jdbcTemplate;
		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}
		//银行转账
		public void transfer(){
			add();
			reduce();		
		}
		//增加余额
		public void add(){
			String sql="update account set balance=balance+? where accountNo=?";
			jdbcTemplate.update(sql, 100,"123");
		}
		//减少余额
		public void reduce(){
			String sql="update account set balance=balance-? where accountNo=?";
			jdbcTemplate.update(sql, 100,"456");
		}

}
