package Reflect;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Class stuClass = stu1.getClass();
        System.out.println(stuClass.getName());

        Class stuClass2 = Student.class;
        System.out.println(stuClass == stuClass2);

        try {
            Class stuClass3 = Class.forName("Reflect.Student");
            System.out.println(stuClass2 == stuClass3);
        } catch (Exception e) {

        }

        System.out.println("====================all public constructors=========================");
        //public
        Constructor[] constructors = stuClass.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        System.out.println("====================all constructors=========================");
        //all
        Constructor[] constructors1 = stuClass.getDeclaredConstructors();
        for (Constructor c : constructors1) {
            System.out.println(c);
        }

        System.out.println("*****************获取公有、无参的构造方法*******************************");
        try {
            Constructor con = stuClass.getConstructor(null);
            System.out.println(con);
        } catch (Exception e) {

        }

        System.out.println("******************获取私有构造方法，并调用*******************************");
        try {
            Constructor con = stuClass.getConstructor(char.class);
            System.out.println(con);
            con.setAccessible(true);
            Object obj = con.newInstance('M');
            System.out.println(obj);
        } catch (Exception e) {

        }

        System.out.println("************获取所有公有的字段********************");
        Field[] fields = stuClass.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        System.out.println("************获取所有的字段(包括私有、受保护、默认的)********************");

        Field[] fields1 = stuClass.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field);
        }

        System.out.println("*************获取公有字段**并调用***********************************");
        try {
            Field f = stuClass.getField("name");
            System.out.println(f);
            Object obj = stuClass.getConstructor().newInstance();
            f.set(obj, "Max");
            Student student = (Student) obj;
            System.out.println("Name: " + student.name);
        } catch (Exception e) {
        }

        System.out.println("***************获取私有的show4()方法******************");
        try {
            Method method = stuClass.getDeclaredMethod("show4", int.class);
            method.setAccessible(true);
            Object obj = stuClass.getConstructor().newInstance();
            System.out.println("result"+method.invoke(obj,20));
        }catch (Exception e){}

    }
}
