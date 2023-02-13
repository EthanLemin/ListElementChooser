package listelementchooser;

import java.util.ArrayList;

public class ListElementChooser {

    public static void main(String[] args) {
        
        Chooser<Coin> chooser = new Chooser<>(getArrayListOfCoins());
        for(int i = 0; i < 10; i++) {
            System.out.println(chooser.choose());
        }
    }
    
    private static ArrayList<Coin> getArrayListOfCoins() {
        ArrayList<Coin> listOfCoins = new ArrayList<>();
        listOfCoins.add(new Coin("penny", 0.01));
        listOfCoins.add(new Coin("nickle", 0.05));
        listOfCoins.add(new Coin("dime", 0.10));
        listOfCoins.add(new Coin("quarter", 0.25));
        listOfCoins.add(new Coin("half dollar", 0.50));
        listOfCoins.add(new Coin("dollar", 1.00));
        return listOfCoins;
    }
    
}
