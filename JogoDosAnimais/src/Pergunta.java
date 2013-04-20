import javax.swing.JOptionPane;

public class Pergunta {

	public static int simNao(No no, int opcao) {

		switch (opcao) {

		case 0: {
			return JOptionPane.showConfirmDialog(
					null,
					"O animal que você pensou "
							+ ((CaracteristicaAnimal) no).getCaracteristica()
							+ "?", "Jogo dos Bichos",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}

		case 1: {
			return JOptionPane.showConfirmDialog(null,
					"O animal que você pensou é " + ((Animal) no).getAnimal()
							+ "?", "Jogo dos Bichos",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}

		}

		return 5;

	}

	public static void Mensagem(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

	public static String InputMsgAnimal() {
		return JOptionPane.showInputDialog("Qual animal você pensou?");
	}

	public static String InputMsgDiferenca(String corrente, String proximo) {
		return JOptionPane.showInputDialog("Um(a) " + proximo
				+ "________ mas um(a) " + corrente + " não faz?");
	}

}
