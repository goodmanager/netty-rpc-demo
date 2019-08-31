package com.felix.service.impl;

import com.felix.api.HelloService;
import com.felix.rpc.framework.common.annotation.RpcService;

@RpcService(targetInterface = HelloService.class)
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello() {
		return "hello ord";
	}
}