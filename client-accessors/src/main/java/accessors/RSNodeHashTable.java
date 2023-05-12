package accessors;

import runestar.generated.XNode;

public interface RSNodeHashTable {
    RSNode[] getBuckets();

    int getSize();
}
