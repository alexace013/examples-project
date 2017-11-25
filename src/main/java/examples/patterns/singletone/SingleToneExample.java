package examples.patterns.singletone;

import examples.annotations.DebugMode;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;

import java.io.Serializable;
import java.util.UUID;

public class SingleToneExample implements Serializable {

    private static final Logger LOG = LogManager.getLogger(SingleToneExample.class);

    private static final long serialVersionUID = UUID.randomUUID().getMostSignificantBits();

    private static SingleToneExample instance = new SingleToneExample();

    private SingleToneExample() {
    }

    @Contract(pure = true)
    public static SingleToneExample getInstance() {
        return instance;
    }

    @Contract(pure = true)
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @DebugMode(version = 0.1)
    public static void main(String[] args) {
        SingleToneExample inst = SingleToneExample.getInstance();
        LOG.debug(String.format("instance one -> serialVersionUID: %d",
                SingleToneExample.getSerialVersionUID()));
        SingleToneExample inst2 = SingleToneExample.getInstance();
        LOG.debug(String.format("instance two -> serialVersionUID: %d",
                SingleToneExample.getSerialVersionUID()));
        LOG.debug(String.format("is instances equals %s", isInstancesEquals(inst, inst2)));
    }

    private static boolean isInstancesEquals(
            final SingleToneExample instance1,
            final SingleToneExample instance2) {
        return instance1.hashCode() == instance2.hashCode();
    }

}
