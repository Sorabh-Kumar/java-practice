public class string_count_palindrom {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
		int a = st.length();
		for(int i=0; i<st.length(); i++){
			for(int j=i+1; j<st.length(); j++){

				if(st.charAt(i) == st.charAt(j)){
					a--;
				}
			}
		}
		System.out.println(a);
    }
}