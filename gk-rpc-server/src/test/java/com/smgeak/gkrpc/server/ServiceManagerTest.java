package com.smgeak.gkrpc.server;

import com.smgeak.gkrpc.Request;
import com.smgeak.gkrpc.ServiceDescriptor;
import com.smgeak.gkrpc.common.utils.ReflectionUtils;
import org.junit.Before;
import org.junit.Test;

import javax.sound.midi.MetaEventListener;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class ServiceManagerTest {

    ServiceManager sm;

    @Before
    public void init(){
        sm = new ServiceManager();
        TestInterface bean = new TestClass();
        sm.register(TestInterface.class, bean);
    }

    @Test
    public void register() {

    }

    @Test
    public void lookup() {
        Method method = ReflectionUtils.getPublicMethods(TestInterface.class)[0];
        ServiceDescriptor sdp = ServiceDescriptor.from(TestInterface.class, method);

        Request request = new Request();
        request.setService(sdp);

        ServiceInstance sis = sm.lookup(request);
        assertNotNull(sis);
    }
}