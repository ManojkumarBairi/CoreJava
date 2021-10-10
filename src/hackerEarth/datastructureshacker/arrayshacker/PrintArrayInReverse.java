package hackerEarth.datastructureshacker.arrayshacker;

public class PrintArrayInReverse {

	/*Given the size and the elements of array A, print all the elements in reverse order.

	Input:
	First line of input contains, N - size of the array.
	Following N lines, each contains one integer, i{th} element of the array i.e. A[i].

	Output:
	Print all the elements of the array in reverse order, each element in a new line.

	Constraints:
	Sample input :
5
4
12
7
15
9

Sample output:
9
15
7
12
4
	*
	*
	*/


		
	public static void main(String[] args) {
	    //Scanner
        Scanner s = new Scanner(System.in);
        Integer n = s.nextInt();  
        int[] arr= new int[n];               // Reading input from STDIN
        for(int i=0;i<n;i++)
        {
          arr[i] = s.nextInt();
        }
         for(int j=n-1; j>=0;j--)
         {
             System.out.println(arr[j]);
         }

	}

}
