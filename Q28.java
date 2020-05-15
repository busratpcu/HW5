
public class Q28 {

	public static void main(String[] args) {
		String letters="";
		while(letters.length()!=3)
			letters+="ab";	//döngüye 0 ile girer sonrasýnda ab ile iki boyutlu olur sonrasýnda tekrar döngüye girip abab olarak boyutu 4 olur 4-6-8.. sürekli döngü içinde kalmaya devam eder.
		System.out.println(letters);
	}

}
