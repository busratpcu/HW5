
public class Q42 {

	public static void main(String[] args) {
		String[] nycTourLoops= new String[] {"downtown","uptown","brooklyn"};
		String[] times =new String[] {"day","night"};
		for(int i=0, j=0; i<nycTourLoops.length && j<times.length; i++,j++)
		{{
			System.out.print(nycTourLoops[i] + "" + times[j] + "-");
			}
		}
	}

}
