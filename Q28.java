
public class Q28 {

	public static void main(String[] args) {
		String letters="";
		while(letters.length()!=3)
			letters+="ab";	//d�ng�ye 0 ile girer sonras�nda ab ile iki boyutlu olur sonras�nda tekrar d�ng�ye girip abab olarak boyutu 4 olur 4-6-8.. s�rekli d�ng� i�inde kalmaya devam eder.
		System.out.println(letters);
	}

}
