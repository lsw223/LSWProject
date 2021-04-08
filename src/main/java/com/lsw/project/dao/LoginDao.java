package com.lsw.project.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lsw.project.vo.UserVO;

@Repository
public class LoginDao {
	
	@Autowired
    private SqlSession sqlSession;
    private static String Namespace = "com.lsw.mappers.testMapper";
	
	public UserVO selectuser(String id) {
		return sqlSession.selectOne(Namespace+".selectUser", id);
	}
	
}
