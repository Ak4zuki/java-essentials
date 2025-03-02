package concepts.oop.inheritance.users;

public class PremiumUser extends User {
    private String creditCard;

    public PremiumUser(String userName, String email, String creditCard) {
        super(userName, email);
        this.creditCard = creditCard;
    }

    public String getMessage() {
        return "Legoooooooooo";
    }

        public String getCreditCard() {
            return creditCard;
        }

        public void setCreditCard (String creditCard){
            this.creditCard = creditCard;
        }

        @Override
        public String toString () {
            return "PremiumUser{" +
                    "creditCard='" + creditCard + '\'' +
                    '}';
        }
    }
