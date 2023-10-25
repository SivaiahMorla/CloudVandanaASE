package JavaPrograms;

public class ShuffleArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		int[] b=new int[a.length];
		int j=0;
		for(int i=b.length-1;i>=0;i--)
		{
			b[j]=a[i];
			j++;
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
