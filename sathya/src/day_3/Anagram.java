package practice;

public class Anageam {

	public static void main(String[] args) {
		int arr[]= {22,43,44,12};
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			}
		System.out.println("min:"+min));}