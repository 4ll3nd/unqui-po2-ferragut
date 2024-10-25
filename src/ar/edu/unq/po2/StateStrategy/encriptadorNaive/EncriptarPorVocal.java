package ar.edu.unq.po2.StateStrategy.encriptadorNaive;

public class EncriptarPorVocal extends EncriptarEstrategia {
	/**PUEDO MEJORAR ESTO?*/
	@Override
	protected String encriptar(String x) {
		char[] modificado = x.toCharArray(); 
		 for (int i = 0; i < x.toCharArray().length; i++) {
			 modificado[i] = cambiarVocal(modificado[i]);
	        }
		 return new String (modificado);
	}

	private char cambiarVocal(char c) {
		 switch (c) {
         case 'a': return 'e';
         case 'e': return 'i';
         case 'i': return 'o';
         case 'o': return 'u';
         case 'u': return 'a';
         case 'A': return 'E';
         case 'E': return 'I';
         case 'I': return 'O';
         case 'O': return 'U';
         case 'U': return 'A';
         default: return c;  // Si no es una vocal, no la cambiamos
     }
	}
}
