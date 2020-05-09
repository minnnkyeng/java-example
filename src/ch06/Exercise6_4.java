package ch06;

public class Exercise6_4 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("�̸�:" + s.name);
		System.out.println("����:" + s.getTotal());
		System.out.println("���:" + s.getAverage());

		Student s1 = new Student("ȫ�浿", 1, 1, 100, 60, 76);

		System.out.println(s1.info());
	}
}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		return kor + eng + math;
	}

	public float getAverage() {
		return getTotal() / 3.0f;
	}

	public String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math;
	}

}
