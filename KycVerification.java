package p1;

public class KycVerification {

		private String panNumber;
		private long  aadharNumber;
		private String documentType;
		
		
		public KycVerification(String panNumber,long adharNumber,String documentType) {
			super();
			this.panNumber=panNumber;
			this.aadharNumber=adharNumber;
			this.documentType=documentType;
			
		}
		public KycVerification() {
			super();
		}
		public String getPanNumber() {
			return panNumber;
		}
		public void setPanNumber(String panNumber) {
			this.panNumber=panNumber;
		}
		public long getAdharNumber() {
			return aadharNumber;
		}
		public void setAdharNumber(long adharNumber) {
		this.aadharNumber=adharNumber;
		}
		public String getDocumentType() {
			return documentType;
		}
		public void setDocumentType(String documentType) {
			this.documentType=documentType;
		}
		
		@Override
		public String tostring() {
			return "KycVerification[panNumber="+panNumber+",aadharNumber="+aadharNumber+",documentType="+documentType
					+",getPanNumber()="+getPanNumber()+",getaadharNumber()="+getAadharNumber()+",getDocumentType()="+
					gerDocumentType()+",getClass()="+getClass()+",hashCode();"+hashCode()+",toString()="+super.toString()+"]";
			
							
					
					
		}
		
		
		}
