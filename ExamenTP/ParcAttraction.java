package ExamenTP;

public class ParcAttraction {
    private Attraction[] lesAttraction;
    private String nom;
    private  int nb_attraction=0;
    public int taille;

    public ParcAttraction(String nom,int taille) {
        this.nom = nom;
        this.lesAttraction=new Attraction[taille];
    }
    public void ajouteAttraction(Attraction Att){
        if(nb_attraction<lesAttraction.length){
            lesAttraction[nb_attraction]=Att;
            nb_attraction++;
        }
        else {
            System.out.println("Pas d'espace");
        }
    }
    public float getRecette(){
        float somme=0;
        for (int i=0 ;i<nb_attraction;i++){
            somme+=lesAttraction[i].getRecette();
        }
        return somme;
    }
    public void affiche(){
        System.out.println("nom du parc :"+nom);
        for (int i=0 ;i<nb_attraction;i++) {
            System.out.println("Pour l'attraction numero : " +i);
            System.out.println("Nom d'attraction : "+lesAttraction[i].getNom());
            System.out.println("Condition d'acces d'attraction : "+lesAttraction[i].getConditionAge().toString());
            System.out.println("Recette d'attraction : "+lesAttraction[i].getRecette());
        }
        }
    public static void main(String[] args) throws AccesInterditException {
        ParcAttraction parcAttraction=new ParcAttraction("Parc",3);
        ConditionAge c1=new ConditionAge(18);
        ConditionAge c2=new ConditionAge(20);
        ConditionAge c3=new ConditionAge(35);

        Personne p1=new Personne(17,50,"intissar");
        Personne p2=new Personne(25,50,"dorra");
        Personne p3=new Personne(50,50,"amine");

        Attraction attraction1= new Attraction("domino",10f,c1);
        Attraction attraction2= new Attraction("check",10f,c2);
        Attraction attraction3= new Attraction("ludo",10f,c3);
         try{
             attraction1.utilise(p1);
         }
         catch (AccesInterditException a){
             System.out.println(a.getMessage());
         }
        try{
            attraction1.utilise(p2);
        }
        catch (AccesInterditException a){
            System.out.println(a.getMessage());
        }
        try{
            attraction1.utilise(p3);
        }
        catch (AccesInterditException a){
            System.out.println(a.getMessage());
        }



        try{
            attraction2.utilise(p1);
        }
        catch (AccesInterditException a){
            System.out.println(a.getMessage());
        }
        try{
            attraction2.utilise(p2);
        }
        catch (AccesInterditException a){
            System.out.println(a.getMessage());
        }
        try{
            attraction2.utilise(p3);
        }
        catch (AccesInterditException a){
            System.out.println(a.getMessage());
        }


        try{
            attraction3.utilise(p1);
        }
        catch (AccesInterditException a){
            System.out.println(a.getMessage());
        }
        try{
            attraction3.utilise(p2);
        }
        catch (AccesInterditException a){
            System.out.println(a.getMessage());
        }
        try{
            attraction3.utilise(p3);
        }
        catch (AccesInterditException a){
            System.out.println(a.getMessage());
        }


        parcAttraction.ajouteAttraction(attraction1);
        parcAttraction.ajouteAttraction(attraction2);
        parcAttraction.ajouteAttraction(attraction3);

        parcAttraction.affiche();
        System.out.println(parcAttraction.getRecette());

    }
    }

