package Helper;

import java.nio.charset.Charset;
import java.util.Random;

public class Helpers {
	public String generateRandomEmail() {
		String generateRandom = "abcdefghijklmnopqrstuvxyz1234567890";
		StringBuilder randomS = new StringBuilder();
		Random rnd = new Random();
		while(randomS.length() < 7) {
			int index = (int) (rnd.nextFloat() * generateRandom.length());
			randomS.append(generateRandom.charAt(index));
		}
	    //Gera aleatoriamente os próximos bytes dentro do array
	    String randomString = randomS.toString();
	    //Cria a string com o charset UTF-8
	    return randomString + "@mail.com";
	    //Retorna a string com o final "@mail.com" para o input do e-mail
	}
}
