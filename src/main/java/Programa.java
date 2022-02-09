import java.util.ArrayList;

public class Programa {

    private String orderArray;

    public Programa(String orderArray) {
        this.orderArray = orderArray;
    }

    public String sortArray(Sort operacao) {
        return operacao.sortArray(orderArray);
    }
}
