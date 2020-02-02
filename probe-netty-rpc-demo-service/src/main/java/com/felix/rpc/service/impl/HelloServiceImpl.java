package com.felix.rpc.service.impl;

import com.felix.rpc.api.HelloService;
import com.felix.rpc.framework.common.annotation.RpcService;

@RpcService(targetInterface = HelloService.class)
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello() {
		return "hello word";
	}
}