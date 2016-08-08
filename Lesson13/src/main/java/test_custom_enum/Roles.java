package test_custom_enum;

/**
 * Created by WEO on 8/2/16.
 */
public class Roles {

    private String normalizedRoleName;

    public Roles() {
    }

    public Roles(String normalizedRoleName) {
        this.normalizedRoleName = normalizedRoleName;
    }

    static final Roles ADMIN = new Roles() {

    };

    static final Roles USER = new Roles() {

    };
}
