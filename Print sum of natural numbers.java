class naturalnumbers{
    public static void main(String[] args)
    {
     int sum = 0;
     System.out.println("First 10 natural numbers:");
        for (int i = 1; i <= 10; i++)
        {
           sum = sum + i;  
           System.out.println(i);
        }
      System.out.println("sum of first 10 natural number:"+sum);
    }
}
