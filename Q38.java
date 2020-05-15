
public class Q38 {
	private static int count;
	private static String[] stops=new String[] {"washington","monroe","jackson","lasalle"};

	public static void main(String[] args) {
		while(count<stops.length)
		{
			if(stops[count++].length()<8) {
				continue;
			}
		}
		System.out.println(count);
	}

}
