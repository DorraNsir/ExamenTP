package ExamenTP;

public class Attraction {
    private String nom ;
    private float cout;
    private ConditionAge conditionAge;
    private int nbPersonne=0;
    private float recette=0;

    public float getRecette() {
        return recette;
    }

    public String getNom() {
        return nom;
    }

    public ConditionAge getConditionAge() {
        return conditionAge;
    }

    public Attraction(String nom, float cout, ConditionAge conditionAge) {
        this.nom = nom;
        this.cout = cout;
        this.conditionAge = conditionAge;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "nom='" + nom +
                ", cout=" + cout +
                ", conditionAge=" + conditionAge.toString() +
                ", nbPersonne=" + nbPersonne +
                ", recette=" + recette +
                '}';
    }

    public void Affiche(){
        System.out.println(this.toString());
    }
    public void utilise(Personne p)throws AccesInterditException{
        if(conditionAge.accesPossible(p)){
            nbPersonne++;
            recette++;
        }
        else{
            throw new AccesInterditException("acces interdit");
        }
    }


}
