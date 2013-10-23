package kata2;
import java.util.ArrayList;
public class vector {
    
    private int [] vector1;
    
    public vector (int [] vector1){
        this.vector1 = vector1;
    }
    
   
    public void getElements (){
       for(int i = 0; i < vector1.length; i++){
            System.out.println(vector1[i]);
        }
    }
    
    public void getElementWithGreaterEvent (){
        ArrayList<Integer> elementsOfArray = new ArrayList<>();
        ArrayList<Integer> eventsOfElement = new ArrayList<>();
        
        for (int i = 0; i < vector1.length; i++){
            elementsOfArray.add(i, vector1[i]); 
        }
        
        int count = 0;
        for (int i = 0; i < vector1.length; i++){
            for (int j = 0; j < vector1.length; j++){
                if ((vector1[i] == vector1[j]) && (i != j)){
                    count++;
                }
            }
            eventsOfElement.add(i, count);
            count = 0;
        }
        
        for (int i = 0; i < elementsOfArray.size(); i++){
            for (int j = 0; j < eventsOfElement.size(); j++){
                if ((vector1[i] == vector1[j])&& (i != j)){
                    elementsOfArray.remove(j);
                    eventsOfElement.remove(j);
                            
                }
            }
        }
        
        int greaterFrequency;
        greaterFrequency = eventsOfElement.get(0);
        int pos = 0;
        for (int index = 0; index < elementsOfArray.size(); index++){
            if (greaterFrequency < eventsOfElement.get(index)){
                greaterFrequency = eventsOfElement.get(index);
                pos = index;
            }
        }
        
        System.out.println ("Numero");
        System.out.println (elementsOfArray.get(pos));
        System.out.println ("Ocurrencias");
        System.out.println (greaterFrequency);
    }
    
}
