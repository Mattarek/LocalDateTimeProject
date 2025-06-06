package old_2024.LambdaJump;

public class Animal implements Jumpable {
	@Override
	public boolean canJump(final String s, final boolean b) {
		if (b) {
			System.out.println("Can jump invoked");
		}
		return s.contains("jump");
	}
}
