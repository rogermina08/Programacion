package Java;

class Main{
     public static void main(String[] args) {
            System.out.println("Hola mundo");
            Car car = new Car(); 
            car.license ="AMQ123";
            car.driver="roger mina";
            car.passengenger=4;
            car.printDataCar();
           
            Car car2= new Car();
            car2.license ="RAM345";
            car2.driver="vaane";
            car2.passengenger =5;
            car2.printDataCar();
                        
    }
 
}