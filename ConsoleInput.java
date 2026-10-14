import java.io.BufferedReader;

public class ConsoleInput {
	public static void main(String[]args)throws IOException
	{
		int rollNumber;
		String name;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the roll number: ");
		rollNumber=Integer.parseInt(br.readLine());
		System.out.println("Emter the name:");
		name=br.readLine();
		
	}

}
