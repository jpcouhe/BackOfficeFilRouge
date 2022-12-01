package com.example.backofficefilrouge.entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "role", schema = "bdd_fil_rouge")
public class RoleEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "role_id")
    private int roleId;
    @Basic
    @Column(name = "role_name")
    private String roleName;
    @OneToMany(mappedBy = "roleByRoleId")
    private Collection<UserrEntity> userrsByRoleId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleEntity that = (RoleEntity) o;

        if (roleId != that.roleId) return false;
        if (roleName != null ? !roleName.equals(that.roleName) : that.roleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        return result;
    }

    public Collection<UserrEntity> getUserrsByRoleId() {
        return userrsByRoleId;
    }

    public void setUserrsByRoleId(Collection<UserrEntity> userrsByRoleId) {
        this.userrsByRoleId = userrsByRoleId;
    }
}
