package accessors;

import java.util.HashMap;
import java.util.HashSet;

public interface RSWorldMap {
    RSWorldMapArchiveLoader getCacheLoader();
    RSWorldMapArea getCurrentMapArea();
    boolean getElementsDisabled();
    HashSet getEnabledCategories();
    HashSet getEnabledElements();
    HashSet getFlashingElements();
    RSWorldMapArea getMainMapArea();
    HashMap getMapAreas();
    RSCoord getMouseCoord();
    RSWorldMapManager getWorldMapManager();
}
