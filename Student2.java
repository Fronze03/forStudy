package p1006;

public class Student2 {
Student2(){};
Student2(int number, String name,int kor, int eng,int math, int sci, int total, double avg){
	this.kor=kor;
	this.eng=eng;
	this.math=math;
	this.sci=sci;
	this.total=kor+eng+math+sci;
	this.avg=this.total/4;
	this.number=number;
	this.name=name;
}
int kor;
int eng;
int math;
int sci;
int total;
double avg;
int number;
String name;
int rank;
}
