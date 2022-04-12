package secao14.ExercicioFixacaoAbstract.entities;

public class PersonalPerson extends Person {
    private Double healthExpeditures;

    public PersonalPerson(){
        super();
    }

    public PersonalPerson(String name, Double anualIncome, Double healthExpeditures) {
        super(name, anualIncome);
        this.healthExpeditures = healthExpeditures;
    }

    public Double getHealthExpeditures() {
        return healthExpeditures;
    }

    public void setHealthExpeditures(Double healthExpeditures) {
        this.healthExpeditures = healthExpeditures;
    }

    @Override
    public Double totalTax(){
        if(super.getAnualIncome() < 20.000){
            if(healthExpeditures > 0){
                return (super.getAnualIncome() * 0.15) - (healthExpeditures * 0.5); 
            }
            else{
                return (super.getAnualIncome() * 0.15);
            }
        }
        else{
            if(healthExpeditures > 0){
                return (super.getAnualIncome() * 0.25) - (healthExpeditures * 0.5); 
            }
            else{
                return (super.getAnualIncome() * 0.25);
            }
        }
    }
}
