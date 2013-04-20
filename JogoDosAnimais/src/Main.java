import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Arvore arv = new Arvore();

		while (true) {
			if (JOptionPane.showConfirmDialog(null, "Pense em um animal",
					"Jogo dos Bichos", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE) == 1){
				break;
			}
			arv.percorreArvore(arv.getRaiz());
		}
	}
}
