
public class Q34 {

	public static void main(String[] args) {
		String[] nycTourLoops=new String[] {"downtown","uptown","brooklyn"};
		String[] times=new String[] {"day","night"};
		for(int i=0, j=0; i<nycTourLoops.length && j<times.length;i++,j++) // i++;j++ de�il i++,j++ olmal�
		{
			System.out.print(nycTourLoops[i]+" " + times[j]+ "-"); // derlenseydi ��kt�m�z "downtown day-uptown night-" olacakt�.
		}
	}

}
