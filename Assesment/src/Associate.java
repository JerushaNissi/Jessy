
public class Associate {
	 	private int associateId;
	    private String associateName;
	    private String workStatus;
		public int getAssociateId() {
			return associateId;
		}
		public void setAssociateId(int associateId) {
			this.associateId = associateId;
		}
		public String getAssociateName() {
			return associateName;
		}
		public void setAssociateName(String associateName) {
			this.associateName = associateName;
		}
		public String getWorkStatus() {
			return workStatus;
		}
		public void setWorkStatus(String workStatus) {
			this.workStatus = workStatus;
		}
		public void trackAssociateStatus(int no_of_days ){
		    //code
		    if(no_of_days>60)
		    {
		        workStatus="Deployed in project";
		        System.out.println("The associate "+getAssociateName()+" "+"work status:"
		        +workStatus);
		    }
		    else{
		         workStatus="Project phase";
		        System.out.println("The associate "+getAssociateName()+" "+"work status:"
		        +workStatus);
		    }
		}
}
