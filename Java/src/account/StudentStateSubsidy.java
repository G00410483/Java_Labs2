package account;

public interface StudentStateSubsidy extends StateSubsidy {
//implicitly public static final
	float STUDENT_STATE_SUBSIDY=1000;
	// implicitly public and abstract
	void addStudentStateSubsidy(float studentSubsidy);
}
