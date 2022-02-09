import java.util.ArrayList;

public class Programador {

    private String arraySort;

    public String getArray(){return arraySort;}

    public void bubbleSort(String arraySort) {
        Programa programa = new Programa(arraySort);
        this.arraySort = programa.sortArray(new BubbleSort());
    }

    public void mergeSort(String arraySort) {
        Programa programa = new Programa(arraySort);
        this.arraySort = programa.sortArray(new MergeSort());
    }

    public void heapSort(String arraySort) {
        Programa programa = new Programa(arraySort);
        this.arraySort = programa.sortArray(new HeapSort());
    }

    public void heapMergeSort(String arraySort) {
        Programa programa = new Programa(arraySort);
        this.arraySort = programa.sortArray(new HeapMergeSort());
    }

}
