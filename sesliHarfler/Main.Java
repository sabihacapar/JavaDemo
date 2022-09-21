package sesliHarfler;

public class Main {

	public static void main(String[] args) {

		char harf = 'e';
        switch (harf) {
            case 'A':
            case 'I':
            case 'U':
            case 'O':
                System.out.println("kalın sesli harf");
                break;
            default:
                System.out.println("ince sesli harf");
        }
	}

}
