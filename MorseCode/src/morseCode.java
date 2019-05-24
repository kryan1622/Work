import java.util.HashMap;

public class morseCode {

	private HashMap<String, Character> code = new HashMap<>();

	public HashMap<String, Character> getCode() {
		return code;
	}

	public void setCode(HashMap<String, Character> code) {
		this.code = code;

	}

	private void populateMap() {
		code.put(".-", 'a');
		code.put("-...", 'b');
		code.put("-.-.", 'c');
		code.put("-..", 'd');
		code.put(".", 'e');
		code.put("..-.", 'f');
		code.put("--.", 'g');
		code.put("....", 'h');
		code.put("..", 'i');
		code.put(".---", 'j');
		code.put("-.-", 'k');
		code.put(".-..", 'l');
		code.put("--", 'm');
		code.put("-.", 'n');
		code.put("---", 'o');
		code.put(".--.", 'p');
		code.put("--.-", 'q');
		code.put(".-.", 'r');
		code.put("...", 's');
		code.put("-", 't');
		code.put("..-", 'u');
		code.put("...-", 'v');
		code.put(".--", 'w');
		code.put("-..-", 'x');
		code.put("-.--", 'y');
		code.put("--..", 'z');
		code.put(".----", '1');
		code.put("..---", '2');
		code.put("...--", '3');
		code.put("....-", '4');
		code.put(".....", '5');
		code.put("-....", '6');
		code.put("--...", '7');
		code.put("---..", '8');
		code.put("----.", '9');
		code.put("-----", '0');
		code.put("/", ' ');
	}

	public String translator(String code2translate) {
		String[] input = code2translate.split(" ");
		StringBuilder str = new StringBuilder();
		populateMap();

		for (String i : input) {
			str.append(code.get(i).toString());
		}
		return str.toString();

	}

}
