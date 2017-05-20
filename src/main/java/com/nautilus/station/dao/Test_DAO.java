package com.nautilus.station.dao;



import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Test_DAO {
	@Autowired private SqlSession sqlSession;
	
	private final static String NAMESPACE = "TestMapper.";
	
	public int getCount(){
		return sqlSession.selectOne(NAMESPACE + "getcount");
	}
}
