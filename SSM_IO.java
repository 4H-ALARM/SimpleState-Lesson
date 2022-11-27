package ssm;

public class SSM_IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeaveRequestState state = LeaveRequestState.Submitted;
		
		System.out.println(state.name());
		System.out.println(state.responsiblePerson());
		if (state.equals(LeaveRequestState.Submitted)) {
			System.out.println("Match");
		} else {
			System.out.println("No Match");
		}

		state = state.nextState();
		System.out.println(state.name());
		System.out.println(state.responsiblePerson());
		if (state.equals(LeaveRequestState.Escalated)) {
			System.out.println("Match");
		} else {
			System.out.println("No Match");
		}
		
		state = state.nextState();
		System.out.println(state.name());
		System.out.println(state.responsiblePerson());
		if (state.equals(LeaveRequestState.Approved)) {
			System.out.println("Match");
		} else {
			System.out.println("No Match");
		}
		
		state = state.nextState();
		System.out.println(state.name());
		System.out.println(state.responsiblePerson());
		if (state.equals(LeaveRequestState.Approved)) {
			System.out.println("Match");
		} else {
			System.out.println("No Match");
		}
		
	}

}
