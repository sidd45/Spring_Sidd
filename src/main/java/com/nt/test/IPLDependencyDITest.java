package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CricketerVO;

public class IPLDependencyDITest {

	public static void main(String[] args) {
		Scanner sc=null;
		String cname=null,cadd=null,totalruns=null,totalmatches=null,noofnotouts=null,runsconceded=null,wicketstaken=null;
		CricketerVO vo=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MainController controller=null;
		String result=null;
		//read inputs
		sc=new Scanner(System.in);
		System.out.println("enter Cricketer name :: ");
		cname=sc.next();
		System.out.println("Enter cricketer Addrs::");
		cadd=sc.next();
		System.out.println("Enter total runs::");
		totalruns=sc.next();
		System.out.println("Enter total matches played::");
		totalmatches=sc.next();
		System.out.println("Enter number of not outs::");
		noofnotouts=sc.next();
		System.out.println("Enter runs conceded ::");
		runsconceded=sc.next();
		System.out.println("Enter no of wickets taken ::");
		wicketstaken=sc.next();
		// Store inputs in  VO class object
		vo=new CricketerVO();
		vo.setCname(cname); vo.setCadd(cadd);vo.setTotalruns(totalruns);vo.setTotalmatches(totalmatches);
		vo.setNumofnotouts(noofnotouts);vo.setRunsconceded(runsconceded);vo.setWicketstaken(wicketstaken);
		//create BEanFacory IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Controller Bean class object..
		 controller=factory.getBean("controller",MainController.class);
		 //invoke the method
		 try {
			 result=controller.processCricketer(vo);
			 System.out.println(result);
		 }
		 catch(Exception e) {
			 System.out.println("Internal Problem");
			 e.printStackTrace();
		 }

	}

}
