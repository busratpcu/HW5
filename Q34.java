
public class Q34 {

	public static void main(String[] args) {
		String[] nycTourLoops=new String[] {"downtown","uptown","brooklyn"};
		String[] times=new String[] {"day","night"};
		for(int i=0, j=0; i<nycTourLoops.length && j<times.length;i++,j++) // i++;j++ deðil i++,j++ olmalý
		{
			System.out.print(nycTourLoops[i]+" " + times[j]+ "-"); // derlenseydi çýktýmýz "downtown day-uptown night-" olacaktý.
		}
	}

}
