package listelementchooser;

public class Coin {
    
    private final String COIN_NAME;
    private final double COIN_VALUE;
    
    public Coin(String coinName, double coinValue) {
        this.COIN_NAME = coinName;
        this.COIN_VALUE = coinValue;
    }
    
    @Override
    public String toString() {
        return String.format("%s: %.2f", COIN_NAME, COIN_VALUE);
    }
    
}
