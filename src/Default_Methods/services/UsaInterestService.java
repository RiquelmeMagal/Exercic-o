package Default_Methods.services;

public class UsaInterestService implements InterestService {
    private double interestRate;  // Corrigido o nome da variável

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {  // Corrigido o nome do método
        return interestRate;
    }
}
