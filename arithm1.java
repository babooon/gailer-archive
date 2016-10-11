class ModuloBeispiel
{
  public static void main ( String[] args )
  {
    int quotient, rest;

    quotient  =  1000 / 150;
    rest =  1000 % 150;
    System.out.println("Der Quotient : " + quotient );
    System.out.println("Der Rest: " + rest );
    System.out.println("Das Original : " +
        (quotient*150 + rest) );
  }
}