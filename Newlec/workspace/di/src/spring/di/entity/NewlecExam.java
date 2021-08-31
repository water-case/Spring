package spring.di.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NewlecExam implements Exam {

	@Value("10")
	private int kor;
	@Value("20")
	private int eng;
	@Value("30")
	private int math;
	@Value("40")
	private int com;
	
	public NewlecExam() {
		this(0,0,0,0);
	}
	
	public NewlecExam(int kor, int eng, int math, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		
		
		
		int result = kor+eng+math+com;;
		
		
		
		
		return result;
	}

	@Override
	public float avg() {
		
		float result = total() / 4.0f; 
		
		return result;
	}

	@Override
	public String toString() {
		return "NewlecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}
	
	

}
