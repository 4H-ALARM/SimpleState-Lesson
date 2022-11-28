package ssm;

import java.time.LocalDate;
import java.util.Date;

public class LeaveRequest {
	
	private String _requestorName = new String();
	private Date _createDate;
	private Date _startDate = new Date();
	private Date _endDate = new Date();
	private LeaveRequestState _state = LeaveRequestState.Submitted;
	
	public LeaveRequest(String rName, Date sDate, Date eDate) {
		
		_requestorName = rName;
		_createDate = new Date();
		_startDate = sDate;
		_endDate = eDate;
		
	}
	
	public void process() {
		_state.nextState();
	}
	

}
