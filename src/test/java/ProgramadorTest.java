import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramadorTest {

    @Test
    void deveCalcularBubble() {
        Programador programador = new Programador();
        programador.bubbleSort("valor inicial");
        assertEquals("Sorted by bubble", programador.getArray());
    }

    @Test
    void deveCalcularMerge() {
        Programador programador = new Programador();
        programador.mergeSort("valor inicial");
        assertEquals("Sorted by merge", programador.getArray());
    }

    @Test
    void deveCalcularHeap() {
        Programador programador = new Programador();
        programador.heapSort("valor inicial");
        assertEquals("Sorted by heap", programador.getArray());
    }

    @Test
    void deveCalcularHeapMerge() {
        Programador programador = new Programador();
        programador.heapMergeSort("valor inicial");
        assertEquals("Sorted by heapmerge", programador.getArray());
    }


}