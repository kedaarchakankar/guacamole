class Main {
  public static void main(String[] args) {
		String x = "Kedaar";
    for (int i = 0; i < 10; i++)
		{
			for(int j = 0; j < i; j++)
				System.out.print(" ");
			System.out.println(x.substring(i, i+1));
		}
  }
}