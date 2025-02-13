/*
DNA.java is a program that determines whether there is a protein in a strand of DNA.
A protein has the following qualities:
1. It begins with a "start codon": ATG.
2. It ends with a "stop codon": TGA.
3. In between, each additional codon is a sequence of three nucleotides.
*/

public class DNA {

    public static void main(String[] args) {

        //  -. .-.   .-. .-.  .
        //    \   \ /   \   \/
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna = dna3;

        System.out.println(dna.length());

        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);

        int stop = dna.indexOf("TGA");
        System.out.println("Stop: " + stop);

        if (start != -1 && stop != -1) {
            System.out.println("Condition 1 and 2 are satisfied");
        }
        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            System.out.println("Conditions 1, 2 and 3 are satisfied.");
            String protein = dna.substring(start, stop+3);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("No protein");
        }
    }
}