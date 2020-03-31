public class GradeBook{
	private String nameGradeBook;
	private int tests;
	private StudentResult studentResult;

	public GradeBook(String name, int value){
		this.name = nameGradeBook;
		this.value = tests;
	}

	public void addStudentResult(String id, int testId, double value){
		studentResult(id, result (testId, value))
	}

	public String toString(){
		String print = (studentResult + "; ");
		for(int i = 0; i< result.length; i++){
			print = print + (result.scores[i]+ " ");
		}
		return (print+"; "+result.getGrade());
	}
}