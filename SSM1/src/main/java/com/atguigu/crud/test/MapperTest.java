package com.atguigu.crud.test;
import com.atguigu.crud.dao.DepartmentMapper;
import com.atguigu.crud.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Description:测试dao层的工作
 * date: 2021/4/17 18:17
 *推荐Spring的项目就可以使用Spring的单元测试，可以自动注入我们需要的组件
 * 1 导入SpringTest
 * 2 @ContextConfiguration 指定Spring配置文件的位置
 * 3直接autowrie
 * @author: zw
 */
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)

public class MapperTest {
    /**
     *
     */
    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    SqlSession sqlSession;
    @Test
    public void testCRUD(){
       /* //创建Sping ioc容器
        ApplicationContext ioc =new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中获取mapper
        DepartmentMapper bean = ioc.getBean(DepartmentMapper.class);*/
       System.out.println(departmentMapper);

//       employeeMapper.insertSelective(new Employee(null,"Jerry","M","Jerry@atguigu.com",1));
        /**
         * 批量插入多个员工
         */
        /* EmployeeMapper mapper= sqlSession.getMapper(EmployeeMapper.class);
         for (int i=0;i<1000;i++){
             String uid= UUID.randomUUID().toString().substring(0,5)+i;
             mapper.insertSelective(new Employee(null,uid,"M",uid+"@atguigu.com",1));
         }
         System.out.println("批量完成");*/
    }
}
