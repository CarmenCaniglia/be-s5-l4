package carmen.bes5l4.entities;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;

@Getter
@ToString
public class Ordine {
    private int numeroOrdine;
    private StatoOrdine stato;
    private int numeroCoperti;
    private LocalTime oraAcquisizione;
    private List<Item> prodottiOrdinati;
    private Tavolo tavolo;

    public Ordine(int numeroCoperti, List<Item> prodottiOrdinati, Tavolo tavolo) {
        Random rndm = new Random()
                ;        this.numeroCoperti = numeroCoperti;
        this.prodottiOrdinati = prodottiOrdinati;
        this.tavolo = tavolo;
        this.stato = StatoOrdine.IN_CORSO;
        this.oraAcquisizione = LocalTime.now();
        this.numeroOrdine = rndm.nextInt();
    }

    public double getTotale(){
        return this.prodottiOrdinati.stream().mapToDouble(Item::getPrice).sum() + this.numeroCoperti * this.tavolo.getCostoCoperto();
    }
}
