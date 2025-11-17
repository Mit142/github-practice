public class gitPrac
{
	public static void main(String[] args)
	{

	}

	public void part1(int size)
	{
		int[][] sqArr = new int[size][size];

		for(int i = 0; i < size; i++)
		{
			for(int c = 0; c<size; c++)
				sqArr[i][c] = (int)(Math.random()*10);
		}
	}

	public void FirstEven(int[][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
				if(arr[i][j]%2==0)
					return arr[i][j];
		}
	}

}