package modeli;

public enum Status {
	B(1), S(2);
	int status_f;
	
	private Status() {}
	private Status(int i) {this.status_f = i;}
	
	private String [] opis = {"B", "S"};
	 @Override
	 public String toString() {
		 return opis[this.ordinal()];
	 }
}
