package accessors;

public interface RSWorldMapManager {
    boolean getIsLoaded0();
    boolean getLoadStarted();
    RSWorldMapAreaData getMapAreaData();
    RSWorldMapRegion[][] getRegions();
}
