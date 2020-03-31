public class StudentResult{
	private String studentID;
	TestResult result;

	public StudentResult(String studentID){
		this.studentID = ID;
		result = new TestResult();
	}

	public StudentResult(String studentID, int testScores){
		this.studentID = ID;
		result = new TestResult(testScores);
	}

	public getStudentID(){
		return studentID;
	}

	public addResult(int testID, double value){
		result.setScore(testID, value)
	}

	public String toString(){
		String print = (studentID + "; ");
		for(int i = 0; i< result.length; i++){
			print = print + (result.scores[i]+ " ");
		}
		return (print+"; "+result.getGrade());
	}
}