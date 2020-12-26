package com.jsp.mybatis.core;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class OracleMyBatisSqlSessionFactory {
   
   private static SqlSessionFactory sqlSessionFactory;

   private OracleMyBatisSqlSessionFactory() {}
   
   static {
      String config = "com/jsp/mybatis/config/sqlConfig.xml";
      
      try {
         Reader reader = Resources.getResourceAsReader(config);
         
         sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
         
         reader.close();
         
         System.out.println("sqlSessionFactory 성공했습니다.");
      } catch (Exception e) {
         System.out.println("sqlSessionFactory 실패했습니다.");
         e.printStackTrace();
      }
   }
   
   public static SqlSession getSqlSession() {
      SqlSession session = sqlSessionFactory.openSession(true);
      return session;
   }
}