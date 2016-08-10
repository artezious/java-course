package bug_1;

public enum CustomEnum {
    //PLEASE uncomment
   ACTION_ONE(0),
   ACTION_TWO(1),
   ACTION_THREE(2);

    private int id;

    CustomEnum(int id) { this.id = id; }
}
