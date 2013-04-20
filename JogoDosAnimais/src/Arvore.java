public class Arvore {

	private No raiz;

	public Arvore() {
		super();
		raiz = new CaracteristicaAnimal("vive na água");
		raiz.setFilhoDireito(new Animal("Macaco"));
		raiz.setFilhoEsquerdo(new Animal("Tubarão"));

		raiz.getFilhoDireito().setPai(raiz);
		raiz.getFilhoEsquerdo().setPai(raiz);
		raiz.setPai(raiz);
	}

	public No getRaiz() {
		return raiz;
	}

	public No percorreArvore(No corrente) {

		if (corrente instanceof CaracteristicaAnimal) {

			if (Pergunta.simNao(corrente, 0) == 0) {

				corrente = percorreArvore(corrente.getFilhoEsquerdo());

				if (corrente != null) {
					if (Pergunta.simNao(corrente, 1) == 0) {
						Pergunta.Mensagem("Acertei de novo!");
						return null;

					} else {
						adicionaNo(corrente, 0);
					}

				}

			} else {

				corrente = percorreArvore(corrente.getFilhoDireito());

				if (corrente != null) {
					if (Pergunta.simNao(corrente, 1) == 0) {
						Pergunta.Mensagem("Acertei de novo!");
						return null;

					} else {
						adicionaNo(corrente, 1);
					}

				}
			}

		} else {
			return corrente;
		}

		return null;
	}

	public void adicionaNo(No noCorrente, int opcaoFilho) {

		Animal animal = new Animal(Pergunta.InputMsgAnimal());
	
		CaracteristicaAnimal dif = new CaracteristicaAnimal(
				Pergunta.InputMsgDiferenca(((Animal) noCorrente).getAnimal(),
						animal.getAnimal()));
		
		if (opcaoFilho == 0) {
			noCorrente.getPai().setFilhoEsquerdo(dif);
		} else if (opcaoFilho == 1) {
			noCorrente.getPai().setFilhoDireito(dif);
		}
		
		dif.setPai(noCorrente.getPai());
		dif.setFilhoEsquerdo(animal);
		dif.setFilhoDireito(((Animal) noCorrente));
		animal.setPai(dif);
	}

}
