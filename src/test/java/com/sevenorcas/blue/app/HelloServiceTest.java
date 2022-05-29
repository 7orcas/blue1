package com.sevenorcas.blue.app;

import static org.junit.Assert.assertTrue;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.core.api.annotation.Inject;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class HelloServiceTest {
	
//	@Deployment
//	public static WebArchive createDeployment() {
//	    return ShrinkWrap.create(WebArchive.class)
//	      .addPackage(HelloService.class.getPackage())
//	      .addAsResource("arquillian.xml", "META-INF/persistence.xml")
//	      .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
//	}
	
	@Deployment
    public static JavaArchive createTestArchive() {
        return ShrinkWrap.create(JavaArchive.class, "test.jar").addClasses(HelloService.class)
        	.addAsResource("arquillian.xml", "META-INF/persistence.xml")
            .addAsManifestResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml"));
    }

	
	@Inject
	private HelloService helloService;
	
	
	@Test
	public void test() {
		String a, z;
		
		a = "A";
		z = helloService.createHelloMessage(a);
		
		System.out.println(z);
		
		assertTrue(z.equals("Hello " + a + ", and hello God and all!: "));
//		fail("Not yet implemented");
	}

}
