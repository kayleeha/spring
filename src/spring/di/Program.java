package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
	/*	���������� �����ϴ� ������� �ڵ带 ���� , xml ���ü��� �и��ϱ�
	  
	   Exam exam = new NewlecExam(); // NewlecExam�� ���� ��ü Exam�� �������̽��� �θ�
	 
		//ExamConsole console = new InlineExamConsole(exam); //inline �� �� ���
		//ExamConsole 
		 * console = new GridExamConsole(exam); // �����ڸ� ����� injection
		 */
		//ExamConsole console = new GridExamConsole();
		//console.setExam(exam); //setter�� ����� injection */ //��ǰ�� �����ϰ� �����ϱ�
		
		ApplicationContext context  = //new ClassPathXmlApplicationContext("spring/di/setting.xml");
									 new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		//context�� ���ü��� xml�� �о ��üȭ �� ���� context�� ��´�.
		
		//Exam exam = context.getBean(Exam.class); //�ڷ���
		//System.out.println(exam.toString());
		
		ExamConsole console = (ExamConsole)context.getBean("console"); //bean�� id Ȱ�� //���� ��ȯ�ؾ� �ϴ� ������
		//ExamConsole console = context.getBean(ExamConsole.class); //�ڷ��� //���� ��ȯ�� �ʿ� ���� class���� ����ϰ� ������ �� ����
		//ExamConsole�̶�� �������̽��� �����ϴ� ��ü�� ã���ֶ�
		
		console.print();
		
		//List<Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
		//exams.add(new NewlecExam(1,1,1,1));
		
		//for(Exam e : exams)
			//System.out.println(e);
	}

}
