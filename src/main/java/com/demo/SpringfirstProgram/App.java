package com.demo.SpringfirstProgram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.SpringfirstProgram.entity.Doctor;
import com.demo.SpringfirstProgram.entity.Staff;
import com.demo.SpringfirstProgram.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext contex=new ClassPathXmlApplicationContext("contex.xml");
        Staff s=contex.getBean(Student.class);
        s.MyFun();
    }
}
