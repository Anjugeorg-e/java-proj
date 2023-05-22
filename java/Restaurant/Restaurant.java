package Restaurant;

import java.util.ArrayList;
import java.util.function.DoubleUnaryOperator;

public class Restaurant {
ArrayList<Integer>listOfPrice = new ArrayList<>();
ArrayList<String>listOfItems = new ArrayList<>();
ArrayList<Double>rating = new ArrayList<>();

public void addItem(String item){
    listOfItems.add(item);
}
public void removeItem(String item){
    listOfItems.remove(item);
}
public void addRating(Double value){
    rating.add(value);
}

public double averageRating(){
    double sum = 0;
    for(int i =0;i<rating.size();i++){
        sum += rating.get(i);
    }
    double avg = sum/rating.size();
    return avg;
}

}
