package amaya.spasibodedyzapobedy;

public class House {

    private int maxFloor;
    private int maxElevator;
    int[] currentlocation;
    Elevator el1 = new Elevator();
    Elevator el2 = new Elevator();
    Elevator el3 = new Elevator();



    public int getShortCut(int currentfloor) {
        currentlocation = new int[]{el1.getCurrentFlor(), el2.getCurrentFlor(), el3.getCurrentFlor()};
        int min=10;
        int elindex=0;
        for (int i = 0 ; i<=2 ; i++){
            currentlocation[i] = Math.abs(currentfloor - currentlocation[i]);
            if (currentlocation[i] <= min){
                min = currentlocation[i];
                elindex = i;
            }
        }
        System.out.println("Вам стоилобы вызвать лифт под номером " + (elindex+1));
        return elindex;
    }

    public void runElevator(int elindex, int wantfloor) {

        switch (elindex) {
            case  (0):
                if (el1.getCurrentFlor() == 1){el2.setCurrentFlor(1);}
                el1.setCurrentFlor(wantfloor);
                break;
            case (1):
                if (el2.getCurrentFlor() == 1){el3.setCurrentFlor(1);}
                el2.setCurrentFlor(wantfloor);
                break;
            case (2):
                if (el3.getCurrentFlor() == 1){el1.setCurrentFlor(1);}
                el3.setCurrentFlor(wantfloor);
                break;
            default:
                System.out.println("fyrfyrfyr");
                break;
        }

    }

    public String getLocationElevator() {
        return "Elevator 1 now: " + el1.getCurrentFlor() + " floor" + "\n" + "Elevator 2 now: " + el2.getCurrentFlor() + " floor" + "\n" + "Elevator 3 now: " + el3.getCurrentFlor() + " floor";
    }
}
