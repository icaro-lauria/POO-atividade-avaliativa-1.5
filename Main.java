import java.util.ArrayList;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		List<Animal> animais = new ArrayList<>();
		animais.add(new Cachorro("Totó", 6));
		animais.add(new Gato("Tom", 4));
		animais.add(new Cachorro("Rex", 8));
		animais.add(new Cachorro("Newtom", 2));
		for(int i = 0; i < animais.size();i++) {
			
			if(animais.get(i) instanceof Cachorro) {
				((Cachorro) animais.get(i)).latir();
			}else if(animais.get(i) instanceof Gato){
				((Gato) animais.get(i)).miar();
			}
			
		}
	}

}
