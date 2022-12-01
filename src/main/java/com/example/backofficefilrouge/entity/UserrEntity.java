package com.example.backofficefilrouge.entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "userr", schema = "bdd_fil_rouge")
public class UserrEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id")
    private int userId;
    @Basic
    @Column(name = "user_pseudo")
    private String userPseudo;
    @Basic
    @Column(name = "user_password")
    private String userPassword;
    @Basic
    @Column(name = "user_email")
    private String userEmail;
    @Basic
    @Column(name = "user_phone")
    private String userPhone;
    @Basic
    @Column(name = "user_firstname")
    private String userFirstname;
    @Basic
    @Column(name = "user_name")
    private String userName;
    @Basic
    @Column(name = "role_id")
    private int roleId;
    @OneToMany(mappedBy = "userrByUserId")
    private Collection<InteractEntity> interactsByUserId;
    @OneToMany(mappedBy = "userrByUserId")
    private Collection<PlanningEntity> planningsByUserId;
    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "role_id", insertable = false, updatable = false)
    private RoleEntity roleByRoleId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserPseudo() {
        return userPseudo;
    }

    public void setUserPseudo(String userPseudo) {
        this.userPseudo = userPseudo;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserFirstname() {
        return userFirstname;
    }

    public void setUserFirstname(String userFirstname) {
        this.userFirstname = userFirstname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserrEntity that = (UserrEntity) o;

        if (userId != that.userId) return false;
        if (roleId != that.roleId) return false;
        if (userPseudo != null ? !userPseudo.equals(that.userPseudo) : that.userPseudo != null) return false;
        if (userPassword != null ? !userPassword.equals(that.userPassword) : that.userPassword != null) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        if (userPhone != null ? !userPhone.equals(that.userPhone) : that.userPhone != null) return false;
        if (userFirstname != null ? !userFirstname.equals(that.userFirstname) : that.userFirstname != null)
            return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userPseudo != null ? userPseudo.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userPhone != null ? userPhone.hashCode() : 0);
        result = 31 * result + (userFirstname != null ? userFirstname.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + roleId;
        return result;
    }

    public Collection<InteractEntity> getInteractsByUserId() {
        return interactsByUserId;
    }

    public void setInteractsByUserId(Collection<InteractEntity> interactsByUserId) {
        this.interactsByUserId = interactsByUserId;
    }

    public Collection<PlanningEntity> getPlanningsByUserId() {
        return planningsByUserId;
    }

    public void setPlanningsByUserId(Collection<PlanningEntity> planningsByUserId) {
        this.planningsByUserId = planningsByUserId;
    }

    public RoleEntity getRoleByRoleId() {
        return roleByRoleId;
    }

    public void setRoleByRoleId(RoleEntity roleByRoleId) {
        this.roleByRoleId = roleByRoleId;
    }
}
