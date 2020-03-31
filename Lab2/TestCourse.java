public class TestCourse{
	public static void main (String args []){
		Course testC = new Course ("testCourse");

		testC.addStudent("Jordan");
		testC.addStudent("Alex");
		testC.addStudent("Eoin");

		testC.dropStudent("Jordan");

		System.out.println(testC.getStudents());
	}
}