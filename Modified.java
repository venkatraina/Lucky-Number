
/*program  to find lucky number that is the digit should present in all numbers
 *and that digit should be the prime number also
 *if to lucky digits are there
 *add two digits if sum greater than 10 make as single digit
 *the single digit is prime then print if not prime then print the next Prime number 
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Modified {
	public static void Lucky(String str){
		String[] s=str.split("#");
		int[] ar=new int[s.length];
		int mark=0;
		for(int i=0;i<s.length;i++){
			ar[i]=Integer.parseInt(s[i]);
			if(ar[i]>=11&&ar[i]<=9999){
				mark++;
			}
		}if(mark==ar.length){
			ArrayList<Integer> al=new ArrayList<Integer>();
			String[] prime={"2","3","5","7"};
			int primeCount=0;
			for(int j=0;j<prime.length;j++){
				int mark1=0;
				for(int k=0;k<s.length;k++){
					if(s[k].contains(prime[j])){
						mark1++;
					}
				}if(mark1==s.length){
					al.add(Integer.parseInt(prime[j]));
					 primeCount++;
				}
			}if(primeCount!=0){
				if(al.size()==1){
					int n=al.get(0);
					primeMethod(n);
				}else{
					int sum=0;
					int sum1=0;
					for(int u:al){
						sum+=u;
					}int num=sum;
					if(sum>=10){
						while(sum>0){
							while(sum!=0){
								sum1+=sum%10;
								sum/=10;
							}if(sum1>=10){
								sum=sum1;
								sum1=0;
							}
						}
						num=sum1;
					}
					primeMethod(num);
				}
			}else{
				System.out.println("-999");
			}
		}else{
			System.out.println("-99");
		}
	}public static void primeMethod(int n){
		 int[] prime={2,3,5,7,11};
	      for(int k=0;k<prime.length;k++){
	        if(n==prime[k]){
	           System.out.println(n);
	           break;
	        }else{
	          if(n<prime[k]){
	             System.out.println(prime[k]);
	             break;
	          }
	        }
	      }
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		Lucky(s);
		in.close();
	}
}