//Author: Merve Alara Akýr
// Date : 08/04/2018


public class StaffMember{
		
		public int staffNo;
		public String staffName,staffStartDate,staffEmailAdress;
		
		public  void assignStaffContact(int staffNo,String staffName,String staffStartDate, String staffEmailAdress ) {
			
			
			 this.staffNo= staffNo;
		     this.staffName = staffName;
			 this.staffStartDate = staffStartDate;
			 this.staffEmailAdress = staffEmailAdress;
			
			
		}
		
		
			public int getStaffNo(){
			return staffNo;
			}
		
		
		public String getStaffStartDate(){
			return staffStartDate;
			}
		
	    public String getStaffName(){
			return staffName;
			}
		
		public String getStaffEmailAdress(){
			return staffEmailAdress;
			}
		
		
		
		public static void main(String[] args) {
			
			
		}
		
	}
	
	
	
	

