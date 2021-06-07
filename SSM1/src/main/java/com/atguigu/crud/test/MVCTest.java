package com.atguigu.crud.test;

import com.atguigu.crud.bean.Employee;
import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * Description:使用Spring 测试模块提供的测试请求功能，测试Curd请求的正确性
 * date: 2021/4/17 23:49
 *
 * @author: zw
 */
@ContextConfiguration(locations = {"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class MVCTest {
    MockMvc mockMvc;
    //传入Springmvc 的ioc
    @Autowired
    WebApplicationContext context;
    //虚拟的mvc请求，获取到处理结果
    @Before
     public void initMockMvc(){
         mockMvc= MockMvcBuilders.webAppContextSetup(context).build();
     }
     @Test
     public void testPage() throws Exception{
       MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/emps").param("pn","1")).andReturn();
      // 请求成功以后，请求域中会有pageInfo；我们可以取出pageInfo进行验证。
       MockHttpServletRequest request =result.getRequest();
      PageInfo pi =(PageInfo) request.getAttribute("pageInfo");
      System.out.println("当前页码"+pi.getPageNum());
      System.out.println("总页码"+pi.getPages());
      System.out.println("总记录"+pi.getTotal());
      System.out.println("在页面需要连续显示的页码");
      int[] nums =pi.getNavigatepageNums();
      for (int i:nums){
          System.out.print(" "+i);
      }
      System.out.println();
      List<Employee> list=pi.getList();
      for (Employee employee:list){
          System.out.println("ID："+employee.getEmpId()+"==>Name:"+employee.getEmpName());
      }
     }
}
