package accessors;

public interface RSModel extends RSEntity {

    public int getBottomY();

    public int getBoundsType();

    public int getDiameter();

    public byte[] getFaceAlphas();

    public int[] getFaceColors1();

    public int[] getFaceColors2();

    public int[] getFaceColors3();

    public int[][] getFaceLabelsAlpha();

    public short[] getFaceTextures();

    public int[] getIndices1();

    public int[] getIndices2();

    public int[] getIndices3();

    public int getIndicesCount();

    public boolean getIsSingleTile();

    public int getRadius();

    public int[][] getVertexLabels();

    public int getVerticesCount();

    public int[] getVerticesX();

    public int[] getVerticesY();

    public int[] getVerticesZ();

    public int getXzRadius();
}
