import java.text.BreakIterator;
import java.text.spi.BreakIteratorProvider;

public class Menssagem {
    public static void obtermenssagemin(int hora) {
        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                menssagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                menssagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                menssagemBoaNoite();
                break;
            default:
                System.out.println("hora invalida");
                break;
        }
    }

    private static void menssagemBomDia() {
        System.out.println("Bom dia");

    }

    private static void menssagemBoaTarde() {
        System.out.println("Boa tarde");

    }

    private static void menssagemBoaNoite() {
        System.out.println("Boa noite");

    }

}
