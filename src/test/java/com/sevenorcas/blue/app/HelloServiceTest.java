package com.sevenorcas.blue.app;

import static org.junit.Assert.fail;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.core.api.annotation.Inject;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class HelloServiceTest {
	
	@Deployment
	public static WebArchive createDeployment() {
	    return ShrinkWrap.create(WebArchive.class)
	      .addPackage(HelloService.class.getPackage())
	      .addAsResource("arquillian.xml", "META-INF/persistence.xml")
	      .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
	}
	
	@Inject
	private HelloService helloService;
	
	
	@Test
	public void test() {
		String z;
		
		z = helloService.createHelloMessage("A");
		System.out.println(z);
		
		fail("Not yet implemented");
	}

}
