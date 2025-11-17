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

	public int firstEven(int[][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
				if(arr[i][j]%2==0)
					return arr[i][j];
		}
		return 0;
	}

	public int firstEvenWithSum17(int[][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
				if(arr[i][j]%2==0 && (arr[i][j--]+arr[i][j++])==17)
					return arr[i][j];
		}
		return 0;
	}

	public int firstEvenWithSum33(int[][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
				if(arr[i][j]%2==0 && (arr[i][j--]+arr[i][j++]+arr[i--][j]+arr[i++][j])>=33)
					return arr[i][j];
		}
		return 0;
	}

	public int FirstOdd(int[][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
				if(arr[i][j]%2==1 && (arr[i][j--]+arr[i][j++]+arr[i--][j]+arr[i++][j])>=33)
					return arr[i][j];
		}
		return 0;
	}
}