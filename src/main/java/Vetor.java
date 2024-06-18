public class Vetor {
    private String[] elementos;


    public Vetor(int capacidade){
    //public Vetor(int capacidade){
        this.elementos = new String [capacidade];
    }

    public static void main(String[] args) {
//        Vetor vetor = new Vetor(5);
//
//        int i = 0;
//        i++;
    }

    public void adiciona(String elemento){
        for(int i = 0; i<this.elementos.length; i++){
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;


            }
        }


    }

}

