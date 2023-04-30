package accessors;

public interface RSScene {
    int getMinPlane();
    int getPlanes();
    RSScenery[] getTempScenery();
    int getTempSceneryCount();
    int[][][] getTileHeights();
    RSTile[][][] getTiles();
    int getXSize();
    int getYSize();
}
