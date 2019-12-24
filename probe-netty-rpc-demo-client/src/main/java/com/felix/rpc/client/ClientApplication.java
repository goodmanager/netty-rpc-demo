package com.felix.rpc.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.felix.api.HelloService;
import com.felix.rpc.framework.client.proxy.RpcProxy;

@SpringBootApplication(scanBasePackages = { "com.felix" })
public class ClientApplication implements ApplicationRunner {

	@Autowired
	private RpcProxy rpcProxy;

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class);

	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		HelloService helloService = rpcProxy.getProxy(HelloService.class);
		System.out.println(helloService.sayHello());

	}

}
