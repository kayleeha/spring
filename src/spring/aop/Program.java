package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context  = new ClassPathXmlApplicationContext("spring/aop/setting.xml");
				// new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		
		Exam exam = (Exam) context.getBean("exam");
		
		System.out.printf("total is %d\n" , exam.total());
		System.out.printf("avg is %f\n" , exam.avg());
		
		
//		Exam exam = new NewlecExam(1,1,1,1);
//		
//		
//		Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), new Class[] {Exam.class}, new InvocationHandler() {
//			//proxy는 가짜라는 뜻이므로 exam을 불러올 수 있도록.. 인터페이스는 여러개가 올 수 있으므로 배열 형태로..
//			@Override
//			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//				
//				long start = System.currentTimeMillis();
//				
//				Object result = method.invoke(exam, args);
//				
//				long end = System.currentTimeMillis();
//			
//				String message = (end - start) + "ms 시간이 걸렸습니다.";
//				
//				System.out.println(message);
//				
//				return result;
//			}
//		});
//	

	}

}
