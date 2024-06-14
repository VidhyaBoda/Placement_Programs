// W.A.P. to check given number is prime or not.
public class Program14{
    public static void main(String[] args){
        if(isPrime(11)){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is not Prime");
        }

        if(isPrime(15)){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is not Prime");
        }
    }

    static boolean isPrime(int n)
	{
		if (n <= 1)
			return false;

		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

}