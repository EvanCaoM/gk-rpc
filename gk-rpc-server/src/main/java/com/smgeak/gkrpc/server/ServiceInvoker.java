package com.smgeak.gkrpc.server;

import com.smgeak.gkrpc.Request;
import com.smgeak.gkrpc.common.utils.ReflectionUtils;

/**
 * 调用具体服务
 */
public class ServiceInvoker {
    public Object invoke(ServiceInstance service, Request request){
        return ReflectionUtils.invoke(
                service.getTarget(),
                service.getMethod(),
                request.getParameters());

    }
}
