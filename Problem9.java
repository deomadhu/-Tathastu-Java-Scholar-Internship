import java.util.ArrayList;
import java.util.List;

public class Problem9 {
	public static void main(String[] args)
	{
		List<Integer> arr = new ArrayList<>();

		arr.add(43);
		arr.add(22);
		arr.add(98);
		arr.add(16);
		arr.add(50);
		System.out.println(arr);
		arr.remove(3);
		arr.remove(1);
		System.out.println(arr);
	}
}
