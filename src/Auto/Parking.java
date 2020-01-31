package Auto;

public class Parking {

     private int place;
     private int count;
     private Autoclass [] arr;

     Parking(){
         place = 3;
         count = 0;
         arr = new Autoclass[place];
     }

     public void addCar(Autoclass car){
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == car){
                 System.out.println("The car is parked");
             }
         }
         if (count >= place){
             System.out.println("The parking is full");
         }
         else {
             for (int i = 0; i < arr.length; i++){
                 if (arr[i] == null){
                     count+=1;
                     arr[i] = car;
                     System.out.println("The car is parked in " + i);
                     break;
                 }
             }
         }
     }
     public void removeCar(int index){
         for (int i = 0; i < arr.length; i++) {
             if (index >= 0 && index <= arr.length && arr[index] != null){
                 count-=1;
                 arr[index] = null;
                 System.out.println("Car is removed from place " + index);
             }
             else {
                 System.out.println(" parking place is empty");
             }
         }
     }

     public void getParkingInfo(){
         for (int i = 0; i < arr.length; i++){
             if (arr[i] != null){
                 System.out.println(i + " : info of the car " + arr[i].getPetHamaranish());
             }
         }
     }

}
