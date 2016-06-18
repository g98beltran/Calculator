import javax.swing.JOptionPane;

public class UI {
	public static final int NO_ICON = JOptionPane.PLAIN_MESSAGE;
	public static final int ALERT = JOptionPane.WARNING_MESSAGE;
	public static final int ERROR = JOptionPane.ERROR_MESSAGE;
	public static final int INFO = JOptionPane.INFORMATION_MESSAGE;
	public static final int QUERY = JOptionPane.QUESTION_MESSAGE;

	public static void show(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	public static void show(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, NO_ICON);
	}

	public static void show(String message, String title, int icon) {
		JOptionPane.showMessageDialog(null, message, title, icon);
	}

	public static int confirm(String message) {
		return JOptionPane.showConfirmDialog(null, message);
	}

	public static int confirm(String message, String title) {
		return JOptionPane.showConfirmDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
	}

	public static int confirm(String message, String title, int icon) {
		return JOptionPane.showConfirmDialog(null, message, title, icon);
	}

	public static String input(String message) {
		return JOptionPane.showInputDialog(null, message);
	}

	public static String input(String message, String title) {
		return JOptionPane.showInputDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
	}

	public static String input(String message, String title, int icon) {
		return JOptionPane.showInputDialog(null, message, title, icon);
	}

	public static void error(String message, Exception e) {
		JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
		System.err.println(e.getMessage());
		System.exit(0);
	}

	public static void errorNE(String message, Exception e) {
		JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
		System.err.println(e.getMessage());

	}

	public static int option(String message, String title, String[] options) {
		return JOptionPane.showOptionDialog(null, message, title, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
				null, options, options[0]);
	}

	public static int option(String message, String title, int icon, String[] options) {
		return JOptionPane.showOptionDialog(null, message, title, JOptionPane.DEFAULT_OPTION, icon, null, options,
				options[0]);
	}

	public static void error(String message, String title, Exception e) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
		System.err.println(e.getMessage());
		System.exit(0);
	}

	public static void errorNE(String message, String title, Exception e) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
		System.err.println(e.getMessage());
	}

}
