
public class Q27 {

	public static void main(String[] args) {
		boolean ballonInflated=false;
		do {
			if(!ballonInflated) {
				ballonInflated=true;
				System.out.print("inflate-");
			}
		} while(!ballonInflated);
		System.out.println("done");
	}

}
