package HomeWork1.HomeWork21;

public class Multime {

    private int[] date;
    private int dim;
    private static int n = 0;

    public Multime(){
        this.dim = 10;
        this.date = new int[this.dim];
    }

    public Multime(int dim){
        this.dim = dim;
        this.date = new int[this.dim];
    }

    public void adauga(int element){
        if(n != this.dim) {
            boolean duplicat = false;
            int i = 0;
            while (!duplicat && i < n) {
                if (date[i] == element) {
                    duplicat = true;
                }
                i++;
            }
            if (!duplicat) {
                this.date[n] = element;
                n++;
            }
        } else {
            System.out.println("Eroare: Vectorul este plin. Elementul " + element + " nu poate fi adaugat");
        }
    }

    public void extrage(int element){
        boolean extrasElement = false;
            int i = 0;
            while (i < n && !extrasElement) {
                if (date[i] == element) {
                    extrasElement = true;
                    for(int j=i; j<n; j++){
                        date[j] = date[j+1];
                    }
                    date[n] = 0;
                    n--;
                } else {
                    i++;
                }
            }
     }

     public void afisare(){
        if(n>0){
            System.out.println("Elementele multimii sunt: ");
            for(int i=0;i<n;i++){
                System.out.print(this.date[i] + " ");
            }
            System.out.println("\n");
        } else {
            System.out.println("Multimea nu are nici un element");
        }
     }
}