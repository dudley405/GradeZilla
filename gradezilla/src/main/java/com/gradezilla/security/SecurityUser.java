package com.gradezilla.security;

import com.gradezilla.dao.entity.User;
import com.gradezilla.dao.entity.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class SecurityUser extends User implements UserDetails {
    private static final long serialVersionUID = 1L;

    public SecurityUser(User user) {
        if (user != null) {
            this.setUserId(user.getUserId());
            this.setUserName(user.getUserName());
            this.setUserEmail(user.getUserEmail());
            this.setUserPassword(user.getUserPassword());
            this.getUserActive();
            this.getUserFailedLoginAttempts();
            this.setUserRoles(user.getUserRoles());
        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new ArrayList<>();

        Set<UserRole> userRoles = this.getUserRoles();

        Iterator<UserRole> it =  userRoles.iterator();

        while (it.hasNext()) {
            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(it.next().getRole().toString());
            authorities.add(authority);
        }

        return authorities;
    }

    @Override
    public String getPassword() {
        return super.getUserPassword();
    }

    @Override
    public String getUsername() {
        return super.getUserEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}