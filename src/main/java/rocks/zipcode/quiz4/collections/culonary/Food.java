package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    List<Spice> spiceList = new ArrayList<>();
    public List<Spice> getAllSpices() {
        return spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
     //   Map<Spice, Integer> map = spiceList.stream().collect(Collectors.toMap(Spice::getName, spice-> spice));

        return null;
    }

    public void applySpice(Spice spice) {
        spiceList.add(spice);
    }
}
