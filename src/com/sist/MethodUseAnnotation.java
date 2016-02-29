package com.sist;

/**
 * Created by sist on 2016-02-29.
 */
public class MethodUseAnnotation {
    @PrintAnnotation
    public void methodName1()
   {
       System.out.println("annotation 적용 메소드1 내용");
   }
    @PrintAnnotation("*")
    public void methodName2()
    {
        System.out.println("annotation 적용 메소드2 내용");
    }
    @PrintAnnotation(value="$",number=100)
    public void methodName3()
    {
        System.out.println("annotation 적용 메소드3 내용");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
