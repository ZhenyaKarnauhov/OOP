package amaya.spasibodedyzapobedy;

public class Main {
    public static void main(String[] args) {

        int crfl = 0;
        int wantfloor = 8;
        int currentfloor = 3;

        House house = new House();

        house.el1.setCurrentFlor(1);
        house.el2.setCurrentFlor((int) ( 1+Math.random() * 9 ));
        house.el3.setCurrentFlor((int) ( 1+Math.random() * 9 ));

        System.out.println(house.getLocationElevator());

        System.out.println("--------------------------------------");
        
        crfl = house.getShortCut(currentfloor);
        house.runElevator(crfl, wantfloor);
        System.out.println(house.getLocationElevator());

    }
}
