package com.yedam.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DataSource {
	// 필드 선언
	private static SqlSessionFactory sqlSessionFactory;

	// 생성자 선언
	private DataSource() {

	}

	// SqlSessionFactory 반환.
	public static SqlSessionFactory getInstance() {
		String resource = "config/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {

			e.printStackTrace();
		}
		// SqlSessionFactoryBuilder 클래스가 sqlSessionFactory 를 반환.
		// 우리는 sqlSessionFactory 얘가 필요함.
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		return sqlSessionFactory;
	}
}
