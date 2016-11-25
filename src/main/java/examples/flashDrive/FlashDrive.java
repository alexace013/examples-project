package examples.flashDrive;

import org.apache.log4j.Logger;

public class FlashDrive {

    private static final Logger log = Logger.getLogger(FlashDrive.class);

    private String brand;
    private int size;
    private String type;

    public FlashDrive() {
        log.info("create DEFAULT flash drive");
    }

    public FlashDrive(String brand, int size, String type) {
        this.brand = brand;
        this.size = size;
        this.type = type;
        log.info(String.format("create flash drive with parameters:\n" +
                        "brand: %s\n" +
                        "size: %s\n" +
                        "type: %s",
                brand, size, type));
    }

    public String getBrand() {
        log.info(String.format("%s GET brand < %s >",
                this.getClass().getSimpleName(), this.brand));
        return brand;
    }

    public void setBrand(String brand) {
        log.info(String.format("%s SET brand < %s >",
                this.getClass().getSimpleName(), brand));
        this.brand = brand;
    }

    public int getSize() {
        log.info(String.format("%s GET size < %s >",
                this.getClass().getSimpleName(), this.size));
        return size;
    }

    public void setSize(int size) {
        log.info(String.format("%s SET size < %s >",
                this.getClass().getSimpleName(), size));
        this.size = size;
    }

    public String getType() {
        log.info(String.format("%s GET type < %s >",
                this.getClass().getSimpleName(), this.type));
        return type;
    }

    public void setType(String type) {
        log.info(String.format("%s SET brand < %s >",
                this.getClass().getSimpleName(), type));
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("flash drive:\n" +
                        "brand: %s\n" +
                        "size: %s MB\n" +
                        "type: %s",
                getBrand(), getSize(), getType());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        FlashDrive that = (FlashDrive) obj;

        if (size != that.size) return false;
        if (!brand.equals(that.brand)) return false;
        return type.equals(that.type);
    }

    @Override
    public int hashCode() {
        int result = brand.hashCode();
        result = 31 * result + size;
        result = 31 * result + type.hashCode();
        return result;
    }
}
