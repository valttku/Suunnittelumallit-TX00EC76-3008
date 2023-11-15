public class BonusVisitor {

    public void visit(Charizard charizard) {
        System.out.println("Charizard saa 10 bonuspistettä");
    }

    public void visit(Charmeleon charmeleon) {
        System.out.println("Charmeleon saa 5 bonuspistettä");
    }

    public void visit(Charmander charmander) {
        System.out.println("Charmander saa 2 bonuspistettä");
    }

}
