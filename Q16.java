
public class Q16 {
	private static int count;
	private static String[] stops= new String[] {"washington","Monroe","Jackson","LaSalle" };


	public static void main(String[] args) {
	while(count< stops.length)
	{
		if(stops[count++].length()<8) {
			break;
		}
	}
	System.out.println(count);
	}

}
