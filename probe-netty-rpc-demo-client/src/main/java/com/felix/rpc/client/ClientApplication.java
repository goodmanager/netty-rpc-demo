package com.felix.rpc.client;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.felix.rpc.api.HelloService;
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
		String uuid = UUID.randomUUID().toString();
		HelloService helloService = rpcProxy.getProxy(HelloService.class, uuid);
		System.out.println(helloService.sayHello());

	}

}
