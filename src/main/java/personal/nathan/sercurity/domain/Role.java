package personal.nathan.sercurity.domain;

/**
 * Description:
 *
 * Created by zhangwei on 2018/6/21.
 */
public class Role {

    private String roleName;

    private int roleType;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getRoleType() {
        return roleType;
    }

    public void setRoleType(int roleType) {
        this.roleType = roleType;
    }
}
