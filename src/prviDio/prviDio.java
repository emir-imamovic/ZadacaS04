package prviDio;

public class prviDio {

		public static void main(String[] args) {
			System.out.println("Unesite broj redova za vasu prvu matricu");
			int brojRedova = TextIO.getlnInt();
			System.out.println("Unesite broj kolona za vasu prvu matricu");
			int brojKolona = TextIO.getlnInt();
			int[][] matrica1 = kreirajMatricu(brojRedova, brojKolona);
			System.out.println("Unesite broj redova za vasu drugu matricu");
			int brojRedova2 = TextIO.getlnInt();
			System.out.println("Unesite broj kolona za vasu drugu matricu");
			int brojKolona2 = TextIO.getlnInt();
			int[][] matrica2 = kreirajMatricu(brojRedova2, brojKolona2);
		    transponovana(matrica1);
			try {
			
				mnozenjeMatrica(matrica1, matrica2, brojRedova, brojKolona,brojRedova2, brojKolona2);
				sabiranjeMatrica(matrica1, matrica2, brojRedova, brojKolona,brojRedova2, brojKolona2);
				oduzimanjeMatrica(matrica1, matrica2, brojRedova, brojKolona,brojRedova2, brojKolona2);
			} catch (IllegalArgumentException e) {
				TextIO.putln(e.getMessage());

			}

		}

		public static int[][] kreirajMatricu(int brojRedova, int brojKolona) {
			int[][] matrica = new int[brojRedova][brojKolona];
			int redni = 1;
			for (int i = 0; i < brojRedova; i++) {
				for (int j = 0; j < brojKolona; j++) {
					System.out.println("Unesite " + redni++ + ". broj u vasu matricu");
					matrica[i][j] = TextIO.getlnInt();
				}
			}
			for (int i = 0; i < brojRedova; i++) {
				for (int j = 0; j < brojKolona; j++) {
					System.out.print(matrica[i][j] + " ");
				}
				System.out.println();
			}

			return matrica;
		}

		public static int[][] sabiranjeMatrica(int[][] matrica1, int[][] matrica2,
				int brojRedova, int brojKolona, int brojRedova2, int brojKolona2) {
			int[][] zbir = new int[brojRedova][brojKolona];
			if (brojRedova != brojRedova2 || brojKolona != brojKolona2) {
				throw new IllegalArgumentException("Matrice nije moguce sabrati");
			}

			for (int i = 0; i < brojRedova; i++) {
				for (int j = 0; j < brojKolona; j++) {
					zbir[i][j] = matrica1[i][j] + matrica2[i][j];
				}
			}
			System.out.println("Zbir vase dvije matrice je matrica: ");
			for (int i = 0; i < zbir.length; i++) {
				for (int j = 0; j < zbir[i].length; j++) {
					System.out.print(zbir[i][j] + " ");
				}
				System.out.println();
			}

			return zbir;
		}

		public static int[][] oduzimanjeMatrica(int[][] matrica1, int[][] matrica2,
				int brojRedova, int brojKolona, int brojRedova2, int brojKolona2) {
			int[][] razlika = new int[brojRedova][brojKolona];
			if (brojRedova != brojRedova2 || brojKolona != brojKolona2) {
				throw new IllegalArgumentException("Matrice nije moguce oduzeti");
			}

			for (int i = 0; i < brojRedova; i++) {
				for (int j = 0; j < brojKolona; j++) {
					razlika[i][j] = matrica1[i][j] - matrica2[i][j];
				}
			}
			System.out.println("Razlika vase dvije matrice je matrica: ");
			for (int i = 0; i < razlika.length; i++) {
				for (int j = 0; j < razlika[i].length; j++) {
					System.out.print(razlika[i][j] + " ");
				}
				System.out.println();
			}

			return razlika;
		}

		public static int[][] mnozenjeMatrica(int[][] matrica1, int[][] matrica2,
				int brojRedova, int brojKolona, int brojRedova2, int brojKolona2) {
			int [][] proizvod = new int[brojRedova][brojKolona2];
			if (brojKolona != brojRedova2) {
				throw new IllegalArgumentException("Matrice nije moguce pomnoziti");
			}

			System.out.println("Proizvod vase dvije matrice je matrica: ");
			for (int i = 0; i < brojRedova; i++) {
				for (int j = 0; j < brojKolona2; j++) {
					for (int k = 0; k < brojKolona; k++) {
						proizvod[i][j] += matrica1[i][k] * matrica2[k][j];
					}
					System.out.print(proizvod[i][j] + " ");
				}
				System.out.println();
			}

			return proizvod;
		}
		public static int[][] transponovana(int [][] matrica1) {
			System.out.println("Transponovana je: ");
			for (int i = 0; i < matrica1.length; i++) {
				for (int j = 0; j < matrica1[i].length; j++) {
					System.out.print(matrica1[j][i] + " ");
				}
				System.out.println();
			}
			return matrica1;
		}
		
	}
