public class Test {

	public static void main(String[] args) {
		System.out.println(TenMinWalk.isValid(new char[] {'n', 'e', 's', 'w', 'n', 'e', 's', 'w', 'n', 's'}));
		System.out.println(TenMinWalk.isValid(new char[] {'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
		System.out.println(TenMinWalk.isValid(new char[] {'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'w', 's'}));
		System.out.println(TenMinWalk.isValid(new char[] {'n', 'e', 's', 'w', 'n', 'e', 's', 'w', 'n', 'e'}));
	}
}
