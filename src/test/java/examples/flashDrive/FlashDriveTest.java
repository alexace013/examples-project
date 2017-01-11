package examples.flashDrive;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class FlashDriveTest {

    private static final Logger log = Logger.getLogger(FlashDriveTest.class);

    private static final String[] brandArray = {"TestBrand", "TestBrand2"};
    private static final int[] sizeArray = {512, 1024};
    private static final String[] typeArray = {"FAT32", "NTFS"};

    @Test
    public void flashDriveTest01() {
        FlashDrive flashDrive1 = new FlashDrive();
        log.info(String.format("create %s", flashDrive1.toString()));
        flashDrive1.setBrand(brandArray[0]);
        flashDrive1.setSize(sizeArray[0]);
        flashDrive1.setType(typeArray[0]);
        Assert.assertTrue(flashDrive1.getBrand().equals(brandArray[0]));
        Assert.assertTrue(flashDrive1.getSize() == sizeArray[0]);
        Assert.assertTrue(flashDrive1.getType().equals(typeArray[0]));
    }

    @Test
    public void flashDriveTest02() {
        FlashDrive flashDrive2 = new FlashDrive(brandArray[1], sizeArray[1], typeArray[1]);
        Assert.assertTrue(flashDrive2.getBrand().equals(brandArray[1]));
        Assert.assertTrue(flashDrive2.getSize() == sizeArray[1]);
        Assert.assertTrue(flashDrive2.getType().equals(typeArray[1]));
    }

}
