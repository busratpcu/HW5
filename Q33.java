import java.util.Arrays;
import java.util.List;

public class Q33 {

	public static void main(String[] args) {
		List<String> bottles=Arrays.asList("glass","plastic");
		for(int type=0; type<bottles.size();)
			System.out.print(bottles.get(type)+",");
		break;		//break komutu bu d�ng�de kullan�lmaz  bu yozden kod derlenmez.
		System.out.println("end");
	}

}
