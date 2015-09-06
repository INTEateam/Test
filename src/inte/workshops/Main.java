package inte.workshops;

class Main {

    public static void main(String[] args) {
        System.out.println("I början av år ett har du två dvärghamstrar, i slutet fyra gånger så många, dvs åtta. \n" +
                "I slutet av år två har du 32, osv. Hur många år tar det innan de tillsammans väger mer än hela jorden.");
        System.out.println("Jorden väger: " + Earth.getWeight() + "gram");
        System.out.println("År: " + Calculate.yearWhenHamstersWeighMoreThan(Earth.getWeight()) + " väger hamstrarna mer än jorden.");
    }
}
