
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []ch = new char[26];
		int count = 65;
		for (int x=0; x <26; x++){
			ch[x] = (char) count;
			count++;
		}
		for (int y = 0; y<26; y++) {
			if (y == 25) {
				System.out.print (ch[y]);
			}
			else {
				System.out.print (ch[y] + ", ");
			}
		}
	}

}
