package p1006;


public class Student {

	Student() {
	};

	Student(int number, String name, int kor, int eng, int mth) {
		this.number = number;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mth = mth;
		this.total = kor + eng + mth;
		this.avg = this.total / 3.0;
	};

	int number;
	String name;
	int kor;
	int eng;
	int mth;
	int total;
	int rank;
	double avg;
}
