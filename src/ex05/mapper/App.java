package ex05.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import ex05.dto.EmpD;

public class App {
    public static void main(String[] args) {
        String resource = "org/mybatis/example/mybatis-config.xml";
        InputStream inputStream;
    try {
        inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    
        System.out.println(sqlSessionFactory);
        System.out.println("리스트 반환 : selectList");
        try (SqlSession session = sqlSessionFactory.openSession()) {
            List<EmpD> list = session.selectList("org.mybatis.example.BlogMapper.selectBlog");
            System.out.println("사원정보 조회");
            System.out.println(list);

        }

        System.out.println("한건 조회");
        try(SqlSession session = sqlSessionFactory.openSession()){
            session.selectOne("org.mybatis.example.EmpMapper.selectOne");
        }

    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }

}
