class ParkingSystem {
    private ArrayList<Integer> slots;

    public ParkingSystem(int big, int medium, int small) {
        this.slots = new ArrayList<Integer>();
        this.slots.add(big);
        this.slots.add(medium);

        this.slots.add(small);
    }

    public boolean addCar(int carType) {
        int index = carType - 1;
        if (slots.get(index) > 0) {
            slots.set(index, slots.get(index) - 1);
            return true;
        } else {
            return false;
        }
    }
}
