package question5;

class card {
    private String suit;
    private String faceValue;

    public card(String suit, String faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    @Override
    public String toString() {
        return faceValue + " of " + suit;
    }
}