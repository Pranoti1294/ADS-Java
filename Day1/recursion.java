class recursion
{

	static int show(int n)
	{
		if(n==4)
		{
			return n;
		}
		else
		{
			return 2+show(n-1);
		}
	}
	public static void main(String[] args)
	{
		System.out.println(show(21));
	}
}

/*
show(21)
2+show(20)
2+2+show(19)
2+2+2+show(18)
2+2+2+2+show(17)
2+2+2+2+2+show(16)
2+2+2+2+2+2+show(15)
2+2+2+2+2+2+2+show(14)
2+2+2+2+2+2+2+2+show(13)
2+2+2+2+2+2+2+2+2+show(12)
2+2+2+2+2+2+2+2+2+2+show(11)
2+2+2+2+2+2+2+2+2+2+2+show(10)
2+2+2+2+2+2+2+2+2+2+2+2+show(9)
2+2+2+2+2+2+2+2+2+2+2+2+2+show(8)
2+2+2+2+2+2+2+2+2+2+2+2+2+2+show(7)
2+2+2+2+2+2+2+2+2+2+2+2+2+2+2+show(6)
2+2+2+2+2+2+2+2+2+2+2+2+2+2+2+2+show(5)
2+2+2+2+2+2+2+2+2+2+2+2+2+2+2+2+2+show(4)
2+2+2+2+2+2+2+2+2+2+2+2+2+2+2+2+2+4
38
*/