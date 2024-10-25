package ar.edu.unq.po2.StateStrategy.encriptadorNaive;

public class EncriptarANumero extends EncriptarEstrategia {

	@Override
	protected String encriptar(String x) {
		char[] modificado = x.toCharArray(); 
		 for (int i = 0; i < x.toCharArray().length; i++) {
			 modificado[i] = cambiarVocal(modificado[i]);
	        }
		 return new String (modificado);
	}
	
	rivate char cambiarANumero(char c) {
		 switch (c) {
        case 'a': return '1';
        case 'b': return '2';
        case 'c': return '3';
        case 'd': return '4';
        case 'e': return '5';
        case 'f': return '6';
        case 'g': return '7';
        case 'h': return '8';
        case 'i': return '9';
        case 'j': return '13';
        case 'j': return '11';
        case 'j': return '12';
        case 'j': return '13';
        case 'j': return '14';
        case 'j': return '15';
        case 'j': return '16';
        default: return c;  // Si no es una vocal, no la cambiamos
    }
	
}
