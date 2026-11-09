public class Room {
    private int numberOfBeds;
    private float price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room(int numberOfBeds,
                float price,
                boolean occupied,
                boolean dirty,
                boolean available) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
    }

    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }

    public float getPrice() {
        return this.price;
    }

    public boolean isOccupied() {
        return this.occupied;
    }

    public boolean isDirty() {
        return this.dirty;
    }

    public boolean isAvailable() {
        return this.available;
    }
}
