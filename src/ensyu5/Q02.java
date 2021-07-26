package ensyu5;

public class Q02 {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("のび太", 0, 0, 0);
		students[1]= new Student("すねお", 54, 31, 32);
		students[2] = new Student("出木杉", 100, 100, 100);

		for(Student student : students){
			System.out.println(student.makePrintData());
		}
	}
}
