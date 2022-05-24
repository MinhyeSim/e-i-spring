package kr.co.eis.security.domains;

import com.sun.istack.NotNull;
import lombok.Cleanup;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName: kr.co.eis.security.domains
 * fileName   : UserDetailsImpl
 * author     : MinHye_Sim
 * date       : 2022-05-23
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-05-23   MinHye_Sim   최초 생성
 */

@Getter
@RequiredArgsConstructor
public class UserDetailsImpl implements UserDetails {
    private final long userid;
    private final String username;
    private final String password;
    private final String name;
    private final String email;

    /*public static UserDetailsImpl build (User user) {
        List<GrantedAuthority> authorities = user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getAuthority()))
                .collect(Collectors.toList());
                return new UserDtailsImpl(user.getUserId(), user.getUsername(), user.getPassword(),
                        user.getName(), user.getEmail(), authorities);
    }*/

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
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
