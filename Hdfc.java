package teja;

public class Amarbank {
	public static void main(String[] args) {
		int bal,dep,tran;
		double total,result;
		bal=25000;
		dep=15000;
		bal=bal+dep;
		tran=bal-11000;
		total=(bal*2/100)*12;
		result=total/12;
		System.out.println(bal+" "+tran+" "+total+" "+result);     	

}
}