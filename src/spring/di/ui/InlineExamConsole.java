package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console") //이름으로 찾고 싶으면 ("") 써줄 것
public class InlineExamConsole implements ExamConsole {

	@Autowired //	<property name="exam" ref="exam" />  // console.setExam(exam);
	//Autowired는 자료형을 참조함, 변수명을 참조하는 것이 아님 //'required = false'는 xml 지시서에 exam 값이 없어도 문제 없게 도와줌
	//@Qualifier("exam2")//자료형만 가지고 판단이 서지 않을 때 id 변수값을 참조할 수 있게 도와줌
	private Exam exam;

	public InlineExamConsole() {
		System.out.println("constructor");
	}

	public InlineExamConsole(Exam exam) {
		System.out.println("overloaded constructor");
		this.exam = exam;
	}



	@Override
	public void print() {
		
		if(exam==null)
			System.out.printf("total is %d, avg is %f\n", 0, 0.0);
		else
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());

	}


	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam = exam;

	}

}
