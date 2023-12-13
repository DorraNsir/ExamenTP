package ExamenTP;

public class ConditionAge implements ConditionAcces{
    private int AgeMin;

    public ConditionAge(int ageMin) {
        AgeMin = ageMin;
    }

    @Override
    public String toString() {
        return "AgeMin=" + AgeMin ;

    }

    @Override
    public boolean accesPossible(Personne p) {
        return (p.getAge()>AgeMin);
    }

}
