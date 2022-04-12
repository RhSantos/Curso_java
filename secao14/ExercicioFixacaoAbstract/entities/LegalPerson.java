package secao14.ExercicioFixacaoAbstract.entities;

public class LegalPerson extends Person {
    private Integer employeesNumber;

    public LegalPerson(){
        super();
    }

    public LegalPerson(String name, Double anualIncome, Integer employeesNumber) {
        super(name, anualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public Double totalTax(){
        if(employeesNumber > 10){
            return super.getAnualIncome() * 0.14;
        }
        else{
            return super.getAnualIncome() * 0.16;
        }
    }
}
