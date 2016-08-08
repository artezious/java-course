package enumTest;

/**
 * Created by WEO on 8/2/16.
 */
public enum  Roles {

    ADMIN("adminNormalizedName"), USER("userNormalizedName");

    private String normalizedRoleName;

    Roles(String normalizedRoleName) {
        this.normalizedRoleName = normalizedRoleName;
    }
}
