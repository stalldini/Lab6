class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree("", "", "", false);
    Tree tree2 = new Tree("maple", "broadleaf", "red", true);
    Tree tree3 = new Tree("spruce", "conifer", "", false);

    tree1.print();
    tree2.print();
    tree3.print();

  }
  class Tree {
    String treeName;
    String treeType;
    String leafColor;
    boolean loseLeaves;

      Tree (){
        treeName = "";
        treeType = "";
        leafColor = "";
        loseLeaves = true||false;
      }

      Tree (String aTreeName, String aTreeType, String aLeafColor, boolean aLoseLeaves) {
        treeName = aTreeName;
        treeType = aTreeType;
        leafColor = aLeafColor;
        loseLeaves = aLoseLeaves;
      }

    String getTreeName() {
      return treeName;
    }

    String getTreeType() {
      return treeType;
    }

    String getLeafColor() {
      return leafColor;
    }

    boolean getLoseLeaves() {
      return loseLeaves;
    }

    void print() {
      System.out.println("This is a" + treeName + "it is a" + treeType + "and its leaves are" + leafColor + ". It" + loseLeaves + "lose leaves in the winter.");
    }
  }

  if (loseLeaves = true)
    true = "does";
  else if (loseLeaves = false)
    false = "does not";
}
}