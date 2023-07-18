import java.util.Scanner;

public class string_count_palindrom {
	public static int cp (String str){
		int x = str.length();
		String r = "";
		for(int i = x-1; i>=0; i--){
			r = r + str.charAt(i);
		}
		if(str.equals(r)){
			return 1;
		}
		else
			return 0;
	}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
		int a =0;
		for(int i=0; i<st.length(); i++){
			String pal= "";
			for(int j=i; j<st.length(); j++){
				pal = pal + st.charAt(j);
				if(st.charAt(i) == st.charAt(j)){
					System.out.println(pal);
					if(cp(pal)==1){
						a++;
					}
				}


			}
		}
		System.out.println(a);
    }
}