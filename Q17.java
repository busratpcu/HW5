
public class Q17 {

	public static void main(String[] args) {
		do {
		int count=0;
		do {
			count++;
		} while(count<2);
		break;
		} while(true);
		System.out.println(count); //count de�i�keni burada tan�l� olmad��� i�in yerel de�i�ken olarak tan�mlanmadan bu kod derlenmez.
	}

}
