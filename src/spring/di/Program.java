package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
	/*	스프링에게 지시하는 방법으로 코드를 변경 , xml 지시서에 분리하기
	  
	   Exam exam = new NewlecExam(); // NewlecExam은 구현 객체 Exam은 인터페이스로 부모
	 
		//ExamConsole console = new InlineExamConsole(exam); //inline 한 줄 출력
		//ExamConsole 
		 * console = new GridExamConsole(exam); // 생성자를 사용한 injection
		 */
		//ExamConsole console = new GridExamConsole();
		//console.setExam(exam); //setter을 사용한 injection */ //부품을 생성하고 결합하기
		
		ApplicationContext context  = //new ClassPathXmlApplicationContext("spring/di/setting.xml");
									 new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		//context가 지시서인 xml을 읽어서 객체화 한 다음 context에 담는다.
		
		//Exam exam = context.getBean(Exam.class); //자료형
		//System.out.println(exam.toString());
		
		ExamConsole console = (ExamConsole)context.getBean("console"); //bean의 id 활용 //형식 변환해야 하는 문제점
		//ExamConsole console = context.getBean(ExamConsole.class); //자료형 //형식 변환할 필요 없고 class명을 깔끔하게 설정할 수 있음
		//ExamConsole이라는 인터페이스에 부합하는 객체를 찾아주라
		
		console.print();
		
		//List<Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
		//exams.add(new NewlecExam(1,1,1,1));
		
		//for(Exam e : exams)
			//System.out.println(e);
	}

}
