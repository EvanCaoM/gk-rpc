package com.smgeak.gkrpc.common.utils;

import org.junit.Test;

import java.lang.reflect.Method;
import java.sql.Ref;

import static org.junit.Assert.*;

public class ReflectionUtilsTest {

    @Test
    public void newInstance() {
        TestClass t = ReflectionUtils.newInstance(TestClass.class);
        assertNotNull(t);
    }

    @Test
    public void getPublicMethods() {
        Method[] methods = ReflectionUtils.getPublicMethods(TestClass.class);
        assertEquals(1,methods.length);

        String mname = methods[0].getName();
        assertEquals("c",mname);
    }

    @Test
    public void invoke() {
        Method[] methods = ReflectionUtils.getPublicMethods(TestClass.class);
        Method c = methods[0];

        TestClass t = new TestClass();
        Object r = ReflectionUtils.invoke(t,c);

        assertEquals("c",r);
    }
}